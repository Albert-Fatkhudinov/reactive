package com.technokratos.notification;

import com.technokratos.notification.model.Fine;
import com.technokratos.notification.model.Tax;
import com.technokratos.notification.repository.mongo.FineRepository;
import com.technokratos.notification.repository.postgres.TaxRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import javax.print.attribute.standard.MediaSize;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class NotificationApplication {

//    private final FineRepository fineRepository;
//
//    private final TaxRepository taxRepository;

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

//    @Override
//    public void run(String... args) {
//        Fine fineIVAN = new Fine();
//        fineIVAN.setType("FINE");
//        fineIVAN.setName("Парковка");
//        fineIVAN.setPersonName("ИВАН");
//        Fine fineOther = new Fine();
//        fineOther.setType("FINE");
//        fineOther.setName("Другое");
//        fineOther.setPersonName("Other");
//        for (int i = 0; i < 100000; i++) {
//            if (i >= 50000 && i <= 50100) {
//                fineIVAN.setId(String.valueOf(i));
//                fineRepository.save(fineIVAN);
//            } else {
//                fineOther.setName("Other" + String.valueOf(i));
//                fineOther.setPersonName("Other" + String.valueOf(i));
//                fineOther.setId(String.valueOf(i));
//                fineRepository.save(fineOther);
//            }
//        }

//        long start = System.currentTimeMillis();
//        List<Fine> fines = fineRepository.findAll().stream()
//                .filter(fine -> "ИВАН".equals(fine.getPersonName()))
//                .collect(Collectors.toList());
//        System.out.println(System.currentTimeMillis() - start);

//        Tax taxIvan = new Tax();
//        taxIvan.setType("TAX");
//        taxIvan.setName("Имущество");
//        taxIvan.setPersonName("ИВАН");
//        Tax taxOther = new Tax();
//        taxOther.setType("TAX");
//        taxOther.setName("Other");
//        taxOther.setPersonName("Other");
//        for (int i = 0; i < 100000; i++) {
//            if (i >= 50000 && i <= 50100) {
//                taxIvan.setId((long) i);
//                taxRepository.save(taxIvan);
//            } else {
//                taxOther.setId((long) i);
//                taxOther.setName("Other" + String.valueOf(i));
//                taxOther.setPersonName("Other" + String.valueOf(i));
//                taxRepository.save(taxOther);
//            }
//        }
//    }
}
