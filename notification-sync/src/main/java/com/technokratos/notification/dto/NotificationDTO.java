package com.technokratos.notification.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NotificationDTO {

    private String type;

    private String name;

    private Instant createTime;

    private String personName;
}
