import java.awt.*;
import javax.swing.*;

public class App extends JPanel {

    private ListaCirculares lista;
    private Nodo actual;
    private Timer timer;

    public App(){
        lista = new ListaCirculares();
        generarTrayectoriaCircular(200, 200, 100, 300);
        actual = lista.getcabeza();

        timer = new Timer(100, e -> {
            actual = actual.siguiente;
            repaint();
        });
        timer.start();
    }

    public void generarTrayectoriaCircular(int centroX, int centroY, int radio, int puntos) {
        double anguloIncremento = 2 * Math.PI / puntos;
        for (int i = 0; i < puntos; i++) {
            int x = (int) (centroX + radio * Math.cos(i * anguloIncremento));     
            int y = (int) (centroY + radio * Math.sin(i * anguloIncremento));
            lista.insertar(x, y);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(actual.x - 10, actual.y - 10, 20, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("animacion circular");
        App panel = new App();
        frame.add(panel);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}