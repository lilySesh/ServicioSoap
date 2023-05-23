/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author lilis
 */
public class NuevoS {
    private boolean opcion;
    private int dep;
    private int ret;

    public NuevoS() {
    }
    
    

    public NuevoS(boolean opcion, int dep, int ret) {
        this.opcion = opcion;
        this.dep = dep;
        this.ret = ret;
    }

    public boolean isOpcion() {
        return opcion;
    }

    public void setOpcion(boolean opcion) {
        this.opcion = opcion;
    }

    public int getDep() {
        return dep;
    }

    public void setDep(int dep) {
        this.dep = dep;
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }
    
    
    
}
