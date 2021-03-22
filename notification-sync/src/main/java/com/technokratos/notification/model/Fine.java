package com.technokratos.notification.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Fine {

    @Id
    private String id;

    private String type;

    private String name;

    private Instant createTime = Instant.now();

    private String personName;
}
