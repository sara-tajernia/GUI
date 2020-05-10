import javax.swing.*;
import java.awt.*;

public class Main {


    public static void main(String[] args) {


        JFrame screen;
        JPanel requests;
        JPanel newRequest;
        JPanel respond;

        Screen S = new Screen();
        Requests R = new Requests();
        NewRequest NR = new NewRequest();
        Respond RS = new Respond();

//        R.builtRequest("me");
        screen = S.scrreen();
        requests = R.rquest();
        newRequest = NR.newRquest();
        respond = RS.rspond();


        screen.add(requests, BorderLayout.WEST);
        screen.add(newRequest, BorderLayout.CENTER);
        screen.add(respond, BorderLayout.EAST);

        screen.setVisible(true);


//
//        pane = new JPanel();
//        pane.setLayout(new GridBagLayout());
//        GridBagConstraints c = new GridBagConstraints();
//        c.fill = GridBagConstraints.HORIZONTAL;
//        pane.setBackground(Color.gray);
//        JButton button = new JButton();
//
//
////        String get[] = {"GET", "POST", "PUT", "PATCH", "DELETE", "OPTION", "HEAD"};
////        JComboBox GET = new JComboBox(get);
//
//        button = new JButton("Button 1");
//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.gridx = 0;
//        c.gridy = 0;
//        pane.add(button, c);
//
//        button = new JButton("Button 2");
//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.weightx = 0.5;
//        c.gridx = 1;
//        c.gridy = 0;
//        pane.add(button, c);
//
//        button = new JButton("Button 3");
//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.weightx = 0.5;
//        c.gridx = 2;
//        c.gridy = 0;
//        pane.add(button, c);
//
//        button = new JButton("Long-Named Button 4");
//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.ipady = 40;      //make this component tall
//        c.weightx = 0.0;
//        c.gridwidth = 3;
//        c.gridx = 0;
//        c.gridy = 1;
//        pane.add(button, c);
//
//        button = new JButton("5");
//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.ipady = 0;       //reset to default
//        c.weighty = 1.0;   //request any extra vertical space
//        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
//        c.insets = new Insets(10,0,0,0);  //top padding
//        c.gridx = 1;       //aligned with button 2
//        c.gridwidth = 2;   //2 columns wide
//        c.gridy = 2;       //third row
//        pane.add(button, c);
//
//        screen.add(pane);
//        screen.setVisible(true);

    }
}
