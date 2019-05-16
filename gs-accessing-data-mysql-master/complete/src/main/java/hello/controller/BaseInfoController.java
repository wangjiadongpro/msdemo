package hello.controller;

import hello.model.AllInfo;
import hello.model.BaseInfo;
import hello.repository.BaseInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping("/baseinfo")
public class BaseInfoController {

    @Autowired
    BaseInfoRepository bir;

    @RequestMapping(value = "/addbaseinfo",method = RequestMethod.POST)
    @ResponseBody
    public String addBaseInfo(@RequestBody BaseInfo baseInfo){
        baseInfo.setBaseId(baseInfo.getBaseId());
        bir.save(baseInfo);
        return "successful";
    }

    @ResponseBody
    @RequestMapping(value = "/searchbaseinfo",method = RequestMethod.GET)
   public BaseInfo getBaseInfo(Integer id){
        Optional<BaseInfo> op = bir.findById(id);
        BaseInfo baseInfo = op.get();
        System.out.println("baseInfo = " + baseInfo);
        return baseInfo;
    }

    @ResponseBody
    @RequestMapping(value = "/addAll",method = RequestMethod.POST)
    public String addAll(@RequestBody AllInfo allInfo){
        BaseInfo basinfo = allInfo.getBaseInfo();
        System.out.println("basinfo = " + basinfo);
        return "success";
    }

}
