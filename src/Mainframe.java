import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainframe extends JFrame{
    //Tools-/Objects
    private JPanel mainframe;
    private JTextField cmField;
    private JTextField ageField;
    private JTextField kgField;
    private JTextField stepField;
    private JLabel mainLabel;
    private JLabel kgLabel;
    private JLabel cmLabel;
    private JLabel ageLabel;
    private JLabel schrittLabel;
    private JComboBox trainingCombobox;
    private JCheckBox cardioBox;
    private JLabel trainingLabel;
    private JLabel questLabel;
    private JButton enterButton;
    private JButton genderButton;
    private JLabel genderLaber;
    //Instanzvariablen
    private int alter;
    private double gewicht;
    private int schritte;
    private int groesse;
    private boolean checkCardio;
    private int trainingsTage;
    private boolean genderSwitch;
    int buttonCount=1;
    



//Constructor including ActionListener
    public Mainframe() {
        setTitle("Bedarfsrechner");
        setSize(800, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(mainframe);
        setLocationRelativeTo(null);
        setResizable(false);
        mainframe.setBackground(new java.awt.Color(192,192,192));
        trainingCombobox.setBackground(Color.WHITE);
        cmField.setBackground(Color.WHITE);
        stepField.setBackground(Color.WHITE);
        kgField.setBackground(Color.WHITE);
        ageField.setBackground(Color.WHITE);
        cardioBox.setBackground(Color.WHITE);
        mainLabel.setBackground(Color.WHITE);
        genderButton.setBackground(Color.WHITE);


        trainingCombobox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x=String.valueOf(trainingCombobox.getSelectedItem());
                if (x.equals("1-Tag")){
                    trainingsTage=1;
                } else if (x.equals("2-Tage")) {
                    trainingsTage=2;
                }else if (x.equals("3-Tage")) {
                    trainingsTage=3;
                }else if (x.equals("4-Tage")) {
                    trainingsTage=4;
                }else if (x.equals("5-Tage")) {
                    trainingsTage=5;
                }else if (x.equals("6-Tage")) {
                    trainingsTage=6;
                }else if (x.equals("7-Tage")) {
                    trainingsTage=7;
                } else if (x.equals("0-Tage")) {
                    trainingsTage=0;
                }
            }
        });
        cardioBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cardioBox.isContentAreaFilled()){
                    checkCardio=true;
                }else{
                    checkCardio=false;
                }
            }
        });
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result;
                alter=Integer.parseInt(ageField.getText());
                groesse=Integer.parseInt(cmField.getText());
                gewicht=Integer.parseInt(kgField.getText());
                schritte=Integer.parseInt(stepField.getText());
                result=rechner();
                mainLabel.setText(String.valueOf(result));
                clear();
                
            }
        });


        genderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonCount%2==0){
                    genderSwitch=false;
                    genderButton.setBackground(Color.WHITE);
                    buttonCount++;
                    genderButton.setText("Nein");
                } else{
                    genderSwitch=true;
                    genderButton.setBackground(Color.GREEN);
                    buttonCount++;
                    genderButton.setText("Ja");
                }

            }
        });
    }

    public double rechner(){
        //Grundbedarf
        double grundumsatz;
        if(genderSwitch){
            grundumsatz=(10*gewicht)+(6.25*groesse)-(5*alter)-161;
        }else{
        grundumsatz=(10*gewicht)+(6.25*groesse)-(5*alter)+5;
        }

        //Aktivität
        double aktivitaet;
        aktivitaet=((double)schritte*0.0005)+(gewicht*0.0005);

        //Sport
        double sport;
        if(checkCardio){
            sport=(double)trainingsTage*500;
        }else {
            sport=(double)trainingsTage*350;
        }
        //result
        double gesamtBedarf=grundumsatz+aktivitaet+sport;
        return gesamtBedarf;
    }

    public void clear(){
        kgField.setText("");
        ageField.setText("");
        cmField.setText("");
        stepField.setText("");
    }
}
