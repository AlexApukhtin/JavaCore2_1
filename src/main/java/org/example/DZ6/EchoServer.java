package org.example.DZ6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer{
    public static void main(String[] args) {
        new EchoServer().start();
    }

    private void start(){
        Socket socket = null;

        try(ServerSocket serverSocket = new ServerSocket(8289)){
            System.out.println("Сервер запущен, ожидает подключения...");
            socket =serverSocket.accept();
            System.out.println("Клиент подключился...");
            final DataInputStream in = new DataInputStream(socket.getInputStream());
            final DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            while (true){
                final String text = in.readUTF();
                System.out.println("Получено сообщение: " + text);
                if("/end".equals(text)){
                    out.writeUTF("/end");
                    break;
                }
                out.writeUTF("Эхо: " +text);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        //if(socket!=null){
        //    try {
        //        socket.close();
        //    } catch (IOException e) {
        //        e.printStackTrace();
        //    }
        //}
    }
}

