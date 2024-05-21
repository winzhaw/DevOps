package test;

import com.indvd00m.ascii.render.api.IRender;
import com.indvd00m.ascii.render.api.ICanvas;
import com.indvd00m.ascii.render.api.IContextBuilder;
import com.indvd00m.ascii.render.Render;
import com.indvd00m.ascii.render.elements.PseudoText; // Importieren der PseudoText-Klasse

public class App {
    public String getGreeting() {
        return "Hello World, I will give you a square to look at!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        IRender render = new Render();
        render.setPseudoCanvas(true); // Aktivieren Sie die Pseudo-Canvas-Einstellungen für eine höhere Auflösung
        IContextBuilder builder = render.newBuilder();
        builder.width(120).height(20); // Setzen der Breite und Höhe für die PseudoText-Ausgabe
        builder.element(new PseudoText("DevOps my G", false)); // Erstellen eines PseudoText-Elements
        ICanvas canvas = render.render(builder.build()); // Erzeugen des Canvas mit dem gebauten Kontext

        String s = canvas.getText(); // Umwandeln des Canvas in einen String
        System.out.println(s); // Ausgabe des ASCII Textes auf der Konsole
    }
}

