package com.kacper.hotelsapplication.remote.rest.dto.request;

public class RoomReservationDto {
    private Integer id;
    private Integer roomId;
    private Integer days;

    public RoomReservationDto() {
    }

    public RoomReservationDto(Integer id, Integer roomId, Integer days) {
        this.id = id;
        this.roomId = roomId;
        this.days = days;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
}
