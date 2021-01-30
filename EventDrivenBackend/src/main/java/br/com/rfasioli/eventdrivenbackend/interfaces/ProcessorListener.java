package br.com.rfasioli.eventdrivenbackend.interfaces;

import br.com.rfasioli.eventdrivenbackend.interfaces.dtos.Operation;
import br.com.rfasioli.eventdrivenbackend.interfaces.dtos.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class ProcessorListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProcessorListener.class);

    private final Processor processor;

    public ProcessorListener(Processor processor) {
        this.processor = processor;
    }

    @StreamListener(Processor.INPUT)
    public void listener(Operation operation) {
        LOGGER.info(String.format("m=listener(operation=[%s])", operation));
        this.processor.output().send(message(Response.of(operation.getId(), 54321)));
    }

    private static final <T> Message<T> message(T val) {
        return MessageBuilder.withPayload(val).build();
    }
}
