package trabajopractico6;

public class TrabajoPractico6 {

    public static void main(String[] args) {
        
        Cliente c1 = new Cliente(43587321, "Nano", "Cabrera", "BsAs", "Calle pepe");
        Cliente c2 = new Cliente(33695432, "Juan", "Perez", "San Luis", "Avenida algo");
        Cliente c3 = new Cliente(55432874, "Lalo", "Perez", "Merlo", "Calle aaa456");
        Cliente c4 = new Cliente(29564332, "Lucia", "Gutierrez", "San Luis", "Presidente abc 123");
        
        Directorio dir = new Directorio();
        
        dir.agregarCliente("2664584339", c1);
        dir.agregarCliente("2656036754", c2);
        dir.agregarCliente("2665934856", c3);
        dir.agregarCliente("2664495110", c4);        
        System.out.println(dir.buscarCliente("2656036754"));
        
        //System.out.println(dir.buscarTelefono("Perez"));
        
    }
    
}