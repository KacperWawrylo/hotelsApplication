package com.kacper.hotelsapplication.remote.rest.dto.request;

public class DeleteReservationDto {
    private Integer id;

    public DeleteReservationDto() {
    }

    public DeleteReservationDto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
