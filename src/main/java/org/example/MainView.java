package org.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route("")
public class MainView extends VerticalLayout {
    public MainView() {
        add(new RouterLink("Zur Startseite", HomeView.class));
        add(new RouterLink("Zur Galerie", GalleryView.class));

        add(new Button("Zur Galerie (via Code)", e -> {
            getUI().ifPresent(ui -> ui.navigate("gallery"));
        }));
    }
}
