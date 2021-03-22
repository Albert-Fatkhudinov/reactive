package com.technokratos.communal.service;

import com.technokratos.communal.dto.CommunalFineDTO;

import java.util.List;

public interface CommunalService {

    List<CommunalFineDTO> getCommunalFines(String personName);
}
