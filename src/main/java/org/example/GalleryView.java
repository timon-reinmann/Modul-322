package org.example;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("gallery")
public class GalleryView extends VerticalLayout {
    public GalleryView() {
        add(new Image("https://via.placeholder.com/150", "Bild 1"));
        add(new Image("https://via.placeholder.com/150", "Bild 2"));
        add(new Image("https://via.placeholder.com/150", "Bild 3"));
    }
}
