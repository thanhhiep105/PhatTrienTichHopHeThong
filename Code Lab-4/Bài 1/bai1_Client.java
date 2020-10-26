package Bai1CTH;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Client {
	public static void main(String[] args) {
		try {
			Socket socket= new Socket("localhost", 5000);
			DataInputStream dataInputStream =new DataInputStream(socket.getInputStream());
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			Scanner scan= new Scanner(System.in);
			System.out.println("moi ban nhap so:");
			String str=scan.nextLine();
			dataOutputStream.writeUTF(str);
			dataOutputStream.flush();
			String str2= dataInputStream.readUTF();
			System.out.println(str2);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
