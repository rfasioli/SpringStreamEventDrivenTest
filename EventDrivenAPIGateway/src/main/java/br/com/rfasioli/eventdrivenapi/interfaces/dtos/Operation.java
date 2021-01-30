package br.com.rfasioli.eventdrivenapi.interfaces.dtos;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Operation {
    private Integer id;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Operation() {
    }

    private Operation(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public static Operation of(Integer id, String description) {
        return new Operation(id, description);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("description", description)
                .toString();
    }
}
