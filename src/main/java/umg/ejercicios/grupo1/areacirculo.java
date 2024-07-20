package umg.ejercicios.grupo1;

public class areacirculo {

        private double radio;

        public areacirculo(double radio) {
            this.radio = radio;
        }

        public double calcularArea() {
            return Math.PI * Math.pow(radio, 2);
        }

        public double getRadio() {
            return radio;
        }

        public void setRadio(double radio) {
            this.radio = radio;
        }
    }
