package com.technokratos.communal.service.impl;

import com.technokratos.communal.dto.CommunalFineDTO;
import com.technokratos.communal.service.CommunalService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommunalServiceImpl implements CommunalService {

    @Override
    public List<CommunalFineDTO> getCommunalFines(String personName) {
        List<CommunalFineDTO> fines = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CommunalFineDTO fine = new CommunalFineDTO();
            fine.setId((long) i);
            fine.setName("Пени за просроченный платеж");
            fine.setPersonName(personName);
            fine.setType("Communal");
            fines.add(fine);
        }
        return fines;
    }
}
