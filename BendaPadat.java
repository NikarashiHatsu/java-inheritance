public class BendaPadat implements InterfaceBenda {
    /**
     * Attribut nama benda dari benda padat.
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
        System.out.println("Jenis benda dari " + this.nama_benda + " adalah padat.");
    }
}
