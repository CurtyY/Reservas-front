package reservas.ufpb.reservas;

import javax.persistence.*;

public class Pacotes {

    private @Id @GeneratedValue Long id;
    private Long Hotel_ID;
    private int num_quartos;
    private Long Voo_ID;

        public Pacotes() {

        }

        public Pacotes(Long hotel_ID, int num_quartos, Long voo_ID) {
            Hotel_ID = hotel_ID;
            this.num_quartos = num_quartos;
            Voo_ID = voo_ID;
        }
}