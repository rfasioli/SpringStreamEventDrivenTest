package br.com.rfasioli.eventdrivenapi.interfaces.events;

import br.com.rfasioli.eventdrivenapi.interfaces.dtos.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class ProcessorListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProcessorListener.class);

    private final Processor processor;

    public ProcessorListener(Processor processor) {
        this.processor = processor;
    }

    @StreamListener(Processor.INPUT)
    public void listener(Response response) {
        LOGGER.info(String.format("m=listener(operation=[%s])", response));
    }

}
