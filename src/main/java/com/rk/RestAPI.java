package com.rk;



import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Api(value="fileUpload", description="Operations pertaining to products in Online Store")

public class RestAPI {
    
    @RequestMapping(method=RequestMethod.POST, value = "/my_app_url")
    public @ResponseBody FirstJson sayHello(@RequestBody List<FirstJson> example) {
    	for (FirstJson firstJson : example) {
			System.out.println(firstJson.getJournalEntryId()+" "+firstJson.getLedgerEntryId());
		}
  
        return new FirstJson();
    }
}
