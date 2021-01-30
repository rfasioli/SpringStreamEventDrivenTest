package br.com.rfasioli.eventdrivenapi;

import br.com.rfasioli.eventdrivenapi.interfaces.events.Processor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(Processor.class)
public class EventDrivenAPIGateway {

    public static void main(String[] args) {
        SpringApplication.run(EventDrivenAPIGateway.class, args);
    }

}