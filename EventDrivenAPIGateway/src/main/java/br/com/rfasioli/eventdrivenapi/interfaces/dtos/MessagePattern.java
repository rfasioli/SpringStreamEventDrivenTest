package br.com.rfasioli.eventdrivenapi.interfaces.dtos;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class MessagePattern {
    private String pattern;
    private Object data;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public MessagePattern() {
    }

    private MessagePattern(String pattern, Object data) {
        this.pattern = pattern;
        this.data = data;
    }

    public static MessagePattern of(Object data) {
        return new MessagePattern("from-java", data);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("pattern", pattern)
                .append("data", data)
                .toString();
    }
}
