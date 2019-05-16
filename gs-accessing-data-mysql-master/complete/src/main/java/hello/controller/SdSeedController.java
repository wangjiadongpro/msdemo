package hello.controller;


import hello.model.DrugSeed;
import hello.repository.DrugSeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/dr")
public class SdSeedController {

    @Autowired
    private DrugSeedRepository dr;


    @RequestMapping(value = "/add",method= RequestMethod.POST)
    @ResponseBody
    public String addDrugSeed(@RequestBody DrugSeed drugSeed){
//        DrugSeed drugSeed = new DrugSeed();
//        drugSeed.setSdCharacter("可能会出现一些不适应的症状");
//        drugSeed.setSdDegree("80%");
//        drugSeed.setSdMethod("及时用清水冲洗");
//        drugSeed.setSdName("大力丸");
        dr.save(drugSeed);
        return "successful saved";
    }


    @GetMapping("/search")
    @ResponseBody
    public DrugSeed searchDrugSeed(){
        Integer id = 1;
        Optional<DrugSeed>  op = dr.findById(id);
        DrugSeed ds = op.get();
        System.out.println(ds);
        return ds;
    }

}
