package br.com.rfasioli.eventdrivenbackend.interfaces;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface Processor {
    String INPUT = "backend-event";
    String OUTPUT = "backend-result";

    @Input(Processor.INPUT)
    SubscribableChannel input();

    @Output(Processor.OUTPUT)
    MessageChannel output();
}
