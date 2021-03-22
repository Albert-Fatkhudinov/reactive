package com.technokratos.notification.mapper;

import com.technokratos.communal.dto.CommunalFineDTO;
import com.technokratos.notification.dto.NotificationDTO;
import com.technokratos.notification.model.Fine;
import com.technokratos.notification.model.Tax;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NotificationMapper {

    NotificationDTO toNotification(Tax tax);

    NotificationDTO toNotification(Fine fine);

    NotificationDTO toNotification(CommunalFineDTO communalFineDTO);
}
