package br.com.rfasioli.eventdrivenbackend.interfaces.dtos;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Response {
    private Integer id;
    private Integer code;

    public Response() {
    }

    private Response(Integer id, Integer code) {
        this.id = id;
        this.code = code;
    }

    public static Response of(Integer id, Integer code) {
        return new Response(id, code);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("code", code)
                .toString();
    }
}
