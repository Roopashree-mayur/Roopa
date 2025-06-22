package Javatesting;

import java.awt.Desktop;
import java.net.URI;

public class OpenGoogleMapsSearch {
    public static void main(String[] args) {
        try {
            // URL with a search query for Bailey Creek Apartments
            String mapUrl = "https://www.google.com/maps/search/?api=1&query=Bailey+Creek+Apartments";

            // Convert the URL to URI
            URI uri = new URI(mapUrl);

            // Open the URL in the default browser
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(uri);
            } else {
                System.out.println("Desktop is not supported on this system.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}