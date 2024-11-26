package org.example;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route("home")
public class HomeView extends VerticalLayout {

    public HomeView() {
        add(new H1("Willkommen auf der Startseite!"));

        add(new Paragraph("Dies ist die Home-Seite deiner Webanwendung. Von hier aus kannst du auf andere Bereiche zugreifen."));

        add(new Image("https://via.placeholder.com/300", "Beispielbild"));

        add(new RouterLink("Zur Galerie", GalleryView.class));
        add(new RouterLink("Zur Hauptseite", MainView.class));
    }
}
