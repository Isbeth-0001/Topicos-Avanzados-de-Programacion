package vista;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tFDesde;
	private JTextField tFHasta;
	private JTextField tFIntervalo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 238, 263);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jLDesde = new JLabel("Desde: ");
		jLDesde.setBounds(10, 58, 49, 17);
		jLDesde.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(jLDesde);
		
		JLabel SerieDeFibonacci = new JLabel("SERIE DE FIBONACCI");
		SerieDeFibonacci.setBounds(32, 11, 145, 19);
		SerieDeFibonacci.setFont(new Font("Serif", Font.BOLD, 14));
		contentPane.add(SerieDeFibonacci);
		
		JLabel jLHAsta = new JLabel("Hasta: ");
		jLHAsta.setFont(new Font("Arial", Font.PLAIN, 14));
		jLHAsta.setBounds(10, 86, 49, 17);
		contentPane.add(jLHAsta);
		
		JLabel jLIntervalo = new JLabel("Intervalo: ");
		jLIntervalo.setFont(new Font("Arial", Font.PLAIN, 14));
		jLIntervalo.setBounds(10, 119, 75, 17);
		contentPane.add(jLIntervalo);
		
		tFDesde = new JTextField();
		tFDesde.setFont(new Font("Arial", Font.PLAIN, 14));
		tFDesde.setBounds(79, 56, 109, 20);
		contentPane.add(tFDesde);
		tFDesde.setColumns(10);
		
		tFHasta = new JTextField();
		tFHasta.setFont(new Font("Arial", Font.PLAIN, 14));
		tFHasta.setColumns(10);
		tFHasta.setBounds(79, 85, 109, 20);
		contentPane.add(tFHasta);
		
		tFIntervalo = new JTextField();
		tFIntervalo.setFont(new Font("Arial", Font.PLAIN, 14));
		tFIntervalo.setColumns(10);
		tFIntervalo.setBounds(79, 118, 109, 20);
		contentPane.add(tFIntervalo);
		
		JButton btnCalcular = new JButton("Calcular");
		//Se crea una acción para ejecutar el código cuando se presiona el botón
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 // Obtiene el valor escrito en el campo "Desde" y lo convierte a entero
		        int desde = Integer.parseInt(tFDesde.getText());
		        // Obtiene el valor escrito en el campo "Hasta" y lo convierte a entero
		        int hasta = Integer.parseInt(tFHasta.getText());
		        // Obtiene el valor escrito en el campo "Intervalo" y lo convierte a entero
		        int intervalo = Integer.parseInt(tFIntervalo.getText());

		        // Se establecen los dos primeros valores de la serie de Fibonacci
		        int a = 0;
		        int b = 1;

		        // Variable donde se ira guardando el resultado de la serie
		        String resultado = "";

		        
		        // Recorre los valores desde el inicio hasta el limite indicado
		        for (int i = 0; i <= hasta; i++) {

		        	// Comprueba si el valor actual está dentro del rango
		            // y si corresponde al intervalo indicado
		            if (i >= desde && (i - desde) % intervalo == 0) {
		            	 // Agrega el número de Fibonacci al resultado
		                resultado += a + ",  ";
		            }

		            // Calcula el siguiente número de Fibonacci
		            int siguiente = a + b;

		            // El segundo número pasa a ser el primero
		            a = b;

		            // El siguiente número pasa a ser el segundo
		            b = siguiente;
		        }

		        // Muestra el resultado en una ventana emergente
		        JOptionPane.showMessageDialog(
		                null,
		                "Serie de Fibonacci:\n" + resultado,
		                "Resultado",
		                JOptionPane.INFORMATION_MESSAGE
		        );

		    }
		});
		btnCalcular.setFont(new Font("Arial", Font.PLAIN, 14));
		btnCalcular.setBounds(65, 178, 89, 23);
		contentPane.add(btnCalcular);

	}
}
