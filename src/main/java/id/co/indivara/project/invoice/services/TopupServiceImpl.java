package id.co.indivara.project.invoice.services;

import id.co.indivara.project.invoice.RequestTopup;
import id.co.indivara.project.invoice.ResponTopup;
import id.co.indivara.project.invoice.entity.Topup;
import id.co.indivara.project.invoice.repository.TopupRepository;
import org.springframework.stereotype.Service;

@Service
public class TopupServiceImpl implements TopupService {
private final TopupRepository repository;

    public TopupServiceImpl(TopupRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponTopup topup(RequestTopup request) {
        Topup topup = new Topup();
        ResponTopup respon = new ResponTopup();
        topup.setBank(String.valueOf(request.getBank()));
        topup.setNominal(request.getNominal());
        repository.save(topup);
        respon.setId(topup.getId());
        return respon;
    }
}
