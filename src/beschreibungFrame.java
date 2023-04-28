import javax.swing.*;

public class beschreibungFrame extends JFrame {

    private JPanel mainPanel;
    private JTextArea textArea;

    public beschreibungFrame() {
        setTitle("Documentation");
        setSize(1200, 700);
        setVisible(true);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
        setResizable(false);
        textArea.setText("Funktionale Grundlagen der Anwendung:\n" +
                " 1.Bitte geben Sie zuerst Ihre Persönlichen Daten ein(Alter in Jahren, Größe in cm, Gewicht in Kilogramm, Geschlecht Männlich oder Weiblich(Ja-/Nein Button))\n" +
                " 2.Danach geben Sie Ihre Sportliche Aktivität an, also wie viele Schritte Sie am Tag circa Laufen \n und wie oft Sie in der Woche Kraftsport betreiben und wie oft sie Cardio machen\n" +
                "      -Beim Kraftsport wird ein Durchschnittsverbrauch von 300kcal pro Einheit berechnet\n" +
                "      -Beim Cardio wird mit einem Durschnittsverbauch von 200kcal ausgegangen bei einer Dauer von 20 Minuten\n" +
                " 3. Nun drücken Sie auf Berechnen und es wird Ihnen ein Ergebnis angezeigt das den Durchschnittlichen Bedarf Ihrer Kalorien pro Tag anzeigt\n" +
                " Mathematische Grundlagen der Berechnung:\n" +
                " Die Mathematik hat für die Berechnung des Grundumsatzes längst eine Formel entwickelt. Die sogenannte „Harris-Benedict-Formel“ lautet wie folgt:\n" +
                " 655,1 + (9,6 x Körpergewicht in kg) + (1,8 x Körpergröße in cm) – (4,7 x Alter in Jahren). Das Ergebnis dieser Rechnung ist ein Richtwert, den ein Individuum pro Tag an Kalorien benötigt.\n" +
                " Mit dieser einfachen Formel kannst du deinen Grundumsatz selbstständig berechnen.\n " +
                " Eine Beispielrechnung: Mittels der Harris-Benedict-Formel hat ein 30 Jahre alter Mann bei einer Größe von 1,80 Meter und einem Körpergewicht von 80 Kilogramm\n" +
                " einen Grundumsatz von ca. 1606 Kalorien.\n" +
                "Bei der Frau sieht es so aus:\n" +
                " Die sogenannte „Harris-Benedict-Formel“ lautet wie folgt: 655,1 + (9,6 x Körpergewicht in kg) + (1,8 x Körpergröße in cm) – (4,7 x Alter in Jahren).\n" +
                " Nun muss noch die Schrittaktivität und die Trainungsaktivität addiert werden und man erhält das Ergebniss.\n\n\n" +
                " Disclaimer: Beim benutzen des Programms werden keine Daten gesammelt oder gespeichert. bei jedem Neustart wird das Programm zurückgesetzt");

    }
}
