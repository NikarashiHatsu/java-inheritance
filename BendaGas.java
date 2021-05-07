public class BendaGas implements InterfaceBenda {
    /**
     * Attribut nama benda dari benda gas.
     * 
     * @var string
     */
    public String nama_benda;
    
    /**
     * Get jenis benda.
     * 
     * @return void
     */
    public void m_get_jenis_benda() {
        System.out.println("Jenis benda dari " + nama_benda + " adalah gas.");
    }
}
