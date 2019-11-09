import com.neovisionaries.ws.client.WebSocket;
import com.neovisionaries.ws.client.WebSocketAdapter;
import com.neovisionaries.ws.client.WebSocketException;
import com.neovisionaries.ws.client.WebSocketFactory;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException, WebSocketException {

        WebSocket ws = new WebSocketFactory().createSocket("wss://dir...");
        ws.addListener(new WebSocketAdapter() {
            @Override
            public void onTextMessage(WebSocket websocket, String message) throws Exception {
                // Received a text message.
                System.out.println(message);
            }
        });

        ws.connect();

        Thread.currentThread().join();

    }

}
