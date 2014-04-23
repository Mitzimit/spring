
package com.mit.campos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/servicios-rest")
public class ControladorServicios {
    @RequestMapping(value="/hola", method=RequestMethod.GET, 
              headers={"accept=text/html"} )
    public @ResponseBody String enviarMensaje(){
        String mensajito="hola mundo desde REST";
        return mensajito;
    }
    @RequestMapping(value="/usuarios-json", method=RequestMethod.GET,
            headers={"Accept=aplication/json"})
    public @ResponseBody String buscarUsuarios()throws Exception{
        Map<String, ArrayList<Usuario>>singletonMap=Collections.singletonMap("usuarios", GenerarUsuarios.obtenerUsuario());
    ObjectMapper mapper=new ObjectMapper();
    
    return mapper.writeValueAsString(singletonMap);
    
    }
    
}
