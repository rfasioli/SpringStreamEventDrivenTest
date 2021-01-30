package br.com.rfasioli.eventdrivenapi.interfaces.events;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface Processor {
    String OUTPUT = "backend-event";
    String INPUT = "backend-result";

    @Input(Processor.INPUT)
    SubscribableChannel input();

    @Output(Processor.OUTPUT)
    MessageChannel output();

}
