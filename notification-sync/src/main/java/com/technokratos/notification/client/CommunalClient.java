package com.technokratos.notification.client;

import com.technokratos.communal.dto.CommunalFineDTO;
import com.technokratos.communal.dto.RequestPerson;
import com.technokratos.communal.dto.ResponseFines;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CommunalClient {

    ResponseFines getCommunalFines(@RequestBody RequestPerson person);
}
