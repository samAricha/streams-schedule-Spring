package com.example.streams_schedule.model;

import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;

public record  LiveStream(
        String id,
        @NotEmpty(message = "Stream title is required")//validation annotation
        String title,
        String description,
        String url,
        LocalDateTime startDate,
        LocalDateTime endDate
) {

}
