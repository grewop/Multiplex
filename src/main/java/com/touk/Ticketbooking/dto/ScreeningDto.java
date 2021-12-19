package com.touk.Ticketbooking.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
@Getter
@Builder
public class ScreeningDto {

    @ApiModelProperty( example = "2020-01-01")
    private LocalDate screening_date;
    private int screening_time;
    private long movieId;
   // private long roomId;

}
