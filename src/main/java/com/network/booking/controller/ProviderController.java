package com.network.booking.controller;

import com.network.booking.dao.ProviderDao;
import com.network.booking.entities.Provider;
import com.network.booking.mapper.ProviderMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class ProviderController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    ProviderDao providerDao;

    @Autowired
    ProviderMapper providerMapper;

//    @RequestMapping(value = "/provider", method = RequestMethod.GET)
    @GetMapping("/providers")
    public String list(Map<String,Object> map, Provider provider){
        logger.info("provider list search" + provider);

        List<Provider> providers = providerMapper.getProviders(provider);
        map.put("providers", providers);
        map.put("providerName", provider.getProviderName());
//        classpath: /templates/
        return "provider/list";
    }

    @GetMapping("/provider/{pid}")
    public String view(@PathVariable("pid") Integer pid, @RequestParam(value = "type", defaultValue = "view") String type, Map<String,Object> map){
        logger.info("search provider whose pid is " + pid);

        Provider provider = providerMapper.getProviderByPid(pid);
        map.put("provider", provider);

//        return "provider/view";
        return  "provider/" + type;
    }

    @PutMapping("/provider")
    public String update(Provider provider){
        logger.info("update provider info");

        provider.setCreateDate(new Date());
        providerMapper.updateProvider(provider);

        return "redirect:/providers";
    }

    @GetMapping("/provider")
    public String addPage(){
        return "provider/add";
    }

    @PostMapping("/provider")
    public String add(Provider provider){
        logger.info("add provider" + provider.toString());
        provider.setCreateDate(new Date());

        providerMapper.addProvider(provider);

        return "redirect:/providers";
    }

    @DeleteMapping("provider/{pid}")
    public String delete(@PathVariable("pid") Integer pid){
        logger.info(("delete provider ") + pid);
        providerMapper.deleteProviderByPid(pid);
        return "redirect:/providers";
    }
}
