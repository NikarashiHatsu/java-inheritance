public class main_pewarisan_benda {
    public static void main(String[] args) {
        BendaCair teh = new BendaCair();
        teh.nama_benda = "Teh";
        teh.m_get_jenis_benda();

        BendaCair soda = new BendaCair();
        soda.nama_benda = "Soda";
        soda.m_get_jenis_benda();

        BendaPadat kursi = new BendaPadat();
        kursi.nama_benda = "Kursi";
        kursi.m_get_jenis_benda();

        BendaPadat meja = new BendaPadat();
        meja.nama_benda = "Meja";
        meja.m_get_jenis_benda();

        BendaGas oksigen = new BendaGas();
        oksigen.nama_benda = "Oksigen";
        oksigen.m_get_jenis_benda();

        BendaGas nitrogen = new BendaGas();
        nitrogen.nama_benda = "Nitrogen";
        nitrogen.m_get_jenis_benda();
    }
}
