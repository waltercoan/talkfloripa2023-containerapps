package br.com.waltercoan.contapps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.com.waltercoan.contapps.entity.Client;
import br.com.waltercoan.contapps.repository.ClientRepository;

@Component
public class Startup {
    @Autowired
    private ClientRepository repository;

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event){
        if(!repository.existsById(1L)){
            var client = new Client();
            client.setNome("Zezinho");
            client.setEmail("ze@zinho.com.br");
            repository.save(client);
        }
        if(!repository.existsById(2L)){
            var client = new Client();
            client.setNome("Luizinho");
            client.setEmail("lu@izinho.com.br");
            repository.save(client);
        }
        if(!repository.existsById(3L)){
            var client = new Client();
            client.setNome("Huguinho");
            client.setEmail("Hu@guinho.com.br");
            repository.save(client);
        }
    }
}
