package Application.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class SimpleMessageController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String defaultMessage(){
        String ret = "Home Page";
        System.out.println("Home Page");
        return ret;
    }

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public String dataEndPoint(@RequestParam(value="msg", required=false, defaultValue = "YOUR_DATA" ) String data){
        String ret = data;
        //EX: 127.0.0.1:8090/data?msg=kkkk
        System.out.println(ret);
        return ret;
    }

    @RequestMapping(value = "/data/{address}", method = RequestMethod.GET)
    public String endPoint(@PathVariable String address){
        String ret = address;
        //EX: 127.0.0.1:8090/data/YOUR_ADDRESS
        System.out.println(ret);
        return ret;
    }
}
