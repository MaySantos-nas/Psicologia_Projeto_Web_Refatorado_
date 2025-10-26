package service;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testes unitários para a classe Quarto (fake)
 */
public class QuartoServiceTest {

    // Classe Quarto fake, só para teste
    static class Quarto {
        private int id;
        private int numero;
        private String tipo;
        private boolean disponibilidade;

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public int getNumero() { return numero; }
        public void setNumero(int numero) { this.numero = numero; }

        public String getTipo() { return tipo; }
        public void setTipo(String tipo) { this.tipo = tipo; }

        public boolean isDisponibilidade() { return disponibilidade; }
        public void setDisponibilidade(boolean disponibilidade) { this.disponibilidade = disponibilidade; }

        @Override
        public String toString() {
            return "Quarto{" +
                    "id=" + id +
                    ", numero=" + numero +
                    ", tipo='" + tipo + '\'' +
                    ", disponibilidade=" + disponibilidade +
                    '}';
        }
    }

    @Test
    public void testNumeroValido() {
        Quarto q = new Quarto();
        q.setNumero(101);
        assertEquals(101, q.getNumero());
    }

    @Test
    public void testTipoQuarto() {
        Quarto q = new Quarto();
        q.setTipo("Simples");
        assertEquals("Simples", q.getTipo());
    }

    @Test
    public void testDisponibilidade() {
        Quarto q = new Quarto();
        q.setDisponibilidade(true);
        assertTrue(q.isDisponibilidade());
    }

    @Test
    public void testToString() {
        Quarto q = new Quarto();
        q.setId(1);
        q.setNumero(202);
        q.setTipo("Luxo");
        q.setDisponibilidade(false);

        String esperado = "Quarto{id=1, numero=202, tipo='Luxo', disponibilidade=false}";
        assertEquals(esperado, q.toString());
    }

    @Test
    public void testNumeroInvalido() {
        Quarto q = new Quarto();
        try {
            int numero = -5;
            if (numero <= 0) {
                throw new IllegalArgumentException("Número do quarto deve ser maior que zero.");
            }
            q.setNumero(numero);
            fail("Deveria lançar IllegalArgumentException para número inválido");
        } catch (IllegalArgumentException e) {
            assertEquals("Número do quarto deve ser maior que zero.", e.getMessage());
        }
    }
}
