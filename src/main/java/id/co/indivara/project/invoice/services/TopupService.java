package id.co.indivara.project.invoice.services;

import id.co.indivara.project.invoice.RequestTopup;
import id.co.indivara.project.invoice.ResponTopup;
import org.springframework.http.ResponseEntity;

public interface TopupService {
    ResponTopup topup(RequestTopup request);

}
