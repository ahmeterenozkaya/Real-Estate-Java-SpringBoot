package cybersoftnet.emlakevve.api.controller;

import cybersoftnet.emlakevve.core.utilities.results.DataResult;
import cybersoftnet.emlakevve.core.utilities.results.Result;
import cybersoftnet.emlakevve.entities.concretes.Admin;
import cybersoftnet.emlakevve.service.business.abstracts.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admins")
public class AdminsController {

    private AdminService adminService;

    @Autowired
    public AdminsController(AdminService adminService) {
        super();
        this.adminService = adminService;
    }

    @GetMapping("/getall")
    public DataResult<List<Admin>> getAll(){
        return this.adminService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Admin admin){
        return this.adminService.add(admin);
    }
}
