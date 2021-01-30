package br.com.rfasioli.eventdrivenapi.interfaces.controllers;

import br.com.rfasioli.eventdrivenapi.interfaces.dtos.MessagePattern;
import br.com.rfasioli.eventdrivenapi.interfaces.dtos.Operation;
import br.com.rfasioli.eventdrivenapi.interfaces.events.Processor;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;
import java.util.UUID;

@Controller
public class AppController {

    private final Processor processor;

    public AppController(Processor processor) {
        this.processor = processor;
    }

    @GetMapping("")
    public String get() {
        this.processor.output().send(message(
                MessagePattern.of(
                    Operation.of(
                            new Random().nextInt(),
                            String.format("Testando o envio de mensagem [%s]", UUID.randomUUID())
                    ))));
        return "Hello!";
    }

    private static final <T> Message<T> message(T val) {
        return MessageBuilder.withPayload(val).build();
    }

}
