package club.vrzone.msk;

import club.vrzone.msk.domain.Client;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Present8March {
    public static void main(String[] args) {
        ArrayList<Client> clientList = new ArrayList<>();
        fillClientList(clientList);
        startPrizeDrawing(clientList);
    }
    
    private static void fillClientList(ArrayList<Client> clientList) {
        clientList.add(new Client(1	, "Ольга	    "         ));
        clientList.add(new Client(2	, "Александр    "         ));
        clientList.add(new Client(3	, "Илья	        "         ));
        clientList.add(new Client(4	, "Павел	    "         ));
        clientList.add(new Client(5	, "Лиля	        "         ));
        clientList.add(new Client(6	, "Дмитрий	    "         ));
        clientList.add(new Client(7	, "Марина	    "         ));
        clientList.add(new Client(8	, "Полина	    "         ));
        clientList.add(new Client(9	, "Никита	    "         ));
        clientList.add(new Client(10	, "Матвей	    "     ));
        clientList.add(new Client(11	, "Александр    "     ));
        clientList.add(new Client(12	, "Елена	    "     ));
        clientList.add(new Client(13	, "Марина	    "     ));
        clientList.add(new Client(14	, "Глеб	        "     ));
        clientList.add(new Client(15	, "Елизавета    "     ));
        clientList.add(new Client(16	, "Никита	    "     ));
        clientList.add(new Client(17	, "Анна	        "     ));
        clientList.add(new Client(18	, "Иришка	    "     ));
        clientList.add(new Client(19	, "Антон	    "     ));
        clientList.add(new Client(20	, "Васин Артем  "     ));
        clientList.add(new Client(21	, "Васина Анастасия	 "));
        clientList.add(new Client(22	, "Куцабина Ольга	 "));
        clientList.add(new Client(23	, "Болаба Александр	 "));
        clientList.add(new Client(24	, "Нефедова Анастасия"));
        clientList.add(new Client(25	, "Абаляев Максим	 "));
        clientList.add(new Client(26	, "Рабченко Дарья	"));
        clientList.add(new Client(27	, "Александра		"));
        clientList.add(new Client(28	, "Роберт Коновалов	"));
        clientList.add(new Client(29	, "Артем	         "));
        clientList.add(new Client(30	, "Артиш	         "));
        clientList.add(new Client(31	, "Кирилл	         "));
        clientList.add(new Client(32	, "Ксения	         "));
        clientList.add(new Client(33	, "Алиса	         "));
        clientList.add(new Client(34	, "Саша	             "));
        clientList.add(new Client(35	, "Алиса	         "));
        clientList.add(new Client(36	, "Лиза	             "));
        clientList.add(new Client(37	, "Глеб	             "));
    }
    
    private static void startPrizeDrawing(ArrayList<Client> clientList) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String command;
        
        boolean isCorrectAttempt = false;
        do {
        
            command = scanner.nextLine();
            //System.out.println("command = " + command);
            isCorrectAttempt = command.equals("vrzonemsk start prize drawing");
            if (isCorrectAttempt) {
                int randomNumber = random.nextInt(clientList.size())+1;
                Client client = clientList.stream().filter(c -> c.getId()==randomNumber).findFirst().orElse(null);
                System.out.println(client.getName()+", с номером " + client.getId() + " поздравляем, Вы выиграли сертификат на 3000 руб");
            }
            else {
                System.out.println("Введена неверная команда. Повторите попытку");
            }
        
        } while (!isCorrectAttempt);
        
        scanner.close();
    }
}