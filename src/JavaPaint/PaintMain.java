package JavaPaint;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * Created by olal15 on 2017-05-29.
 */
public class PaintMain extends JFrame {
    PaintSetup drawingArea = new PaintSetup();
    public PaintMain() {
        //JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Drawing Simulator 2K17");
        setResizable(false);
        setVisible(true);


        //Knappar för Färg
        JPanel buttonContainer = new JPanel();
        JButton btnRedPen = new JButton("Röd");
        JButton btnGreenPen = new JButton("Grön");
        JButton btnBluePen = new JButton ("Blå");
        JButton btnBlackPen = new JButton("Svart");
        JButton btnClear = new JButton("Rensa");
        buttonContainer.add(btnRedPen);
        buttonContainer.add(btnGreenPen);
        buttonContainer.add(btnBluePen);
        buttonContainer.add(btnBlackPen);
        buttonContainer.add(btnClear);


        //lägg till en ruta att rita i
        getContentPane().add(drawingArea);
        getContentPane().add(buttonContainer, BorderLayout.PAGE_END);
        pack();


        //när man trycker på knapparna
        btnRedPen.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                drawingArea.setCurrentColor(Color.RED);
            }
        });

        btnGreenPen.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                drawingArea.setCurrentColor(Color.GREEN);
            }
        });

        btnBluePen.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                drawingArea.setCurrentColor(Color.BLUE);
            }
        });

        btnBlackPen.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                drawingArea.setCurrentColor(Color.BLACK);
            }
        });

        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                drawingArea.clearDrawings();
            }
        });
    }


    public static void main(String args[])
    {
        PaintMain test = new PaintMain();
    }

}

