package cybersoftnet.emlakevve.api.controller;

import cybersoftnet.emlakevve.core.utilities.results.DataResult;
import cybersoftnet.emlakevve.core.utilities.results.Result;
import cybersoftnet.emlakevve.entities.concretes.Advert;
import cybersoftnet.emlakevve.service.business.abstracts.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("/api/adverts")
public class AdvertController {

        private AdvertService advertService;

        @Autowired
        public AdvertController(AdvertService advertService) {
            super();
            this.advertService = advertService;
        }

        @GetMapping("/getall")
        public DataResult<List<Advert>> getAll(){
            return this.advertService.getAll();
        }

        @PostMapping("/add")
        public Result add(Advert advert){
            return new Result(true,"İlan eklendi.");
        }
    }

