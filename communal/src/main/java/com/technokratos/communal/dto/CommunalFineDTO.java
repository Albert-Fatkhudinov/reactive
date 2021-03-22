package com.technokratos.communal.dto;

import lombok.*;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CommunalFineDTO {

    private Long id;

    private String type;

    private String name;

    private String personName;

    private Instant createTime = Instant.now();

}
