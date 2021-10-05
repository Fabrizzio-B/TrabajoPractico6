package trabajopractico6;
import java.util.*;

public class Directorio {
    private Map<String, Cliente> directorio;

    public Directorio() {
        directorio= new HashMap<>();
    }
    
    public void agregarCliente(String telefono, Cliente c){
        if(!directorio.containsKey(telefono)){
            directorio.put(telefono, c);
        }
        else System.out.println("No se puede agregar. Este teléfono ya ha sido ingresado.");
    }
    
    public Cliente buscarCliente(String telefono){
        Cliente c = null;
        if(directorio.containsKey(telefono)){
            c=directorio.get(telefono);
        }
        return c;
    }
    /*public void buscarCliente(String telefono){
        if(directorio.containsKey(telefono)){
            System.out.println(directorio.get(telefono));
        } else System.out.println("No se encuentra un Cliente con este télefono");
    }*/
    
    public List<String> buscarTelefono(String apellido){
        //En base a un atributo del Valor devolver una Clave
        List<String> tels = new ArrayList<>();
        
        Collection<Cliente> clientes = directorio.values();
        //??
        for(Cliente cl1 : clientes){
            Set<Cliente> cumplen = new HashSet<>();
            if (apellido.equals(cl1.getApellido())){
                cumplen.add(cl1);
            }
            if(directorio.containsValue(cl1))
        }
        return tels;
    }
    
    /*public List buscarClientes(String ciudad){
        
    }*/
    
    public void borrarCliente(int dni){
        
    }
}