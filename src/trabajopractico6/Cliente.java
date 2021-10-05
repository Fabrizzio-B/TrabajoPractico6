package trabajopractico6;

public class Cliente {
    private int dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;

    public Cliente(int dni, String nombre, String apellido, String ciudad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public boolean equals(Object c){
        if(c!=null || c instanceof Cliente){
            Cliente cl=(Cliente)c;
            return this.dni == cl.dni;
        } else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return dni;
    }
    

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad + ", direccion=" + direccion + '}';
    }
}