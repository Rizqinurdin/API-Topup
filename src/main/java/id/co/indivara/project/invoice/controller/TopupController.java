package id.co.indivara.project.invoice.controller;

import id.co.indivara.project.invoice.RequestTopup;
import id.co.indivara.project.invoice.ResponTopup;
import id.co.indivara.project.invoice.services.TopupService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value="/api/topup")
public class TopupController {
    private final TopupService topup;

    public TopupController(TopupService topup) {
        this.topup = topup;
    }
    @PostMapping
    public ResponTopup topup (@RequestBody RequestTopup requestTopup) {
        return topup.topup(requestTopup);
    }
}
