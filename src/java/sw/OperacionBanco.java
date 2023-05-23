/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package sw;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.NuevoS;
import modelo.Usuario;

/**
 *
 * @author lilis
 */
@WebService(serviceName = "OperacionBanco")
public class OperacionBanco {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    //Crear Metodos y array para hace los proyectos xd
    private ArrayList<Usuario> array1 = new ArrayList<>();
     private ArrayList<NuevoS> array2 = new ArrayList<>();
    
     @WebMethod(operationName = "registrar")
    public boolean registrar(@WebParam(name = "usuario") Usuario usu) {

        return array1.add(usu);

    }

    @WebMethod(operationName = "logeo")
    public Usuario login(@WebParam(name = "usuario") Usuario usu) {
        Usuario usuario = new Usuario();

        for (int i = 0; i < array1.size(); i++) {

            if (array1.get(i).getNombre().equals(usu.getNombre()) && array1.get(i).getClave().equals(usu.getClave())) {

                usuario = array1.get(i);
                break;
            }

        }
       
        return usuario;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "SaldoN")
    public NuevoS SaldoN(@WebParam(name = "nuevos")NuevoS nus) {
        NuevoS nuevos= new NuevoS();
        
        return null;
    }
    
     @WebMethod(operationName = "SaldoR")
    public NuevoS SaldoR(@WebParam(name = "nuevos")NuevoS nus) {
        NuevoS nuevos= new NuevoS();
        
        return null;
    }
   
   

}
