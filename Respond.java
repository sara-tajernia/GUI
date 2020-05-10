import javax.swing.*;
import java.awt.*;

public class Respond {


    public JPanel rspond(){
        JPanel respond = new JPanel();
        respond.setBackground(new Color(90, 90, 120));
        respond.setLayout(new GridBagLayout());
        GridBagConstraints gbl = new GridBagConstraints();
        gbl.fill = GridBagConstraints.HORIZONTAL;

        JLabel ok = new JLabel("OK");
        ok.setBackground(Color.gray);
        ok.setOpaque(true);
        ok.setFont(new Font("Serif", Font.BOLD, 15));
        ok.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel time = new JLabel("Time");
        time.setBackground(Color.gray);
        time.setOpaque(true);
        time.setFont(new Font("Serif", Font.BOLD, 15));
        time.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel quality = new JLabel("Quality");
        quality.setBackground(Color.gray);
        quality.setOpaque(true);
        quality.setFont(new Font("Serif", Font.BOLD, 15));
        quality.setHorizontalAlignment(SwingConstants.CENTER);

        gbl.gridx = 0;
        gbl.gridy = 0;
        gbl.weightx = 1;
        gbl.ipady = 25;
        respond.add(ok, gbl);

        gbl.gridx = 1;
        gbl.gridy = 0;
        respond.add(time, gbl);

        gbl.gridx = 2;
        gbl.gridy = 0;
        respond.add(quality, gbl);


        JTabbedPane tab = new JTabbedPane();
        JPanel body = new JPanel();
        body.setLayout(new GridBagLayout());
//        gbl.fill = GridBagConstraints.HORIZONTAL;
        JPanel header  = HeaderRespond();
        tab.add("Raw", header);
        tab.add("Body" , body);



        gbl.ipady = 500;
        gbl.gridx =0;
        gbl.gridy=1;
        gbl.gridwidth = 4;
        gbl.gridheight = 1;
        respond.add(tab, gbl);

        return respond;
    }


    private JPanel HeaderRespond(){

        JPanel header  = new JPanel();
        header.setLayout(new GridBagLayout());
        GridBagConstraints gbl = new GridBagConstraints();
        gbl.fill = GridBagConstraints.HORIZONTAL;

        JLabel name = new JLabel("Name");
        name.setBackground(Color.gray);
        name.setOpaque(true);
        name.setFont(new Font("Arial", Font.ITALIC, 15));

        JLabel value = new JLabel("Value");
        value.setBackground(Color.gray);
        value.setOpaque(true);
        value.setFont(new Font("Arial", Font.ITALIC, 15));

        JLabel info = new JLabel();
        info.setText("Fri, 08 May 2020 15:41:46 GMT");
        info.setText("\nAccess-Control-Allow-Credentials");
        info.setBackground(Color.pink);

        JButton copy = new JButton("Copy to Clipboard");

//        gbl.gridx = 0;
//        gbl.gridy = 0;
//        gbl.weightx = 2;
//        gbl.ipady = 15;

        gbl.fill = GridBagConstraints.HORIZONTAL;
        gbl.weightx = 0.5;
//        gbl.gridx = 0;
//        gbl.gridy = 0;
        gbl.anchor = GridBagConstraints.FIRST_LINE_START;
        header.add(name, gbl);


//        gbl.gridx = 1;
//        gbl.gridy = 0;
        gbl.anchor = GridBagConstraints.FIRST_LINE_END;
        gbl.fill = GridBagConstraints.HORIZONTAL;
        gbl.weightx = 0.5;
//        gbl.gridx = 1;
//        gbl.gridy = 0;
        header.add(value, gbl);

//        gbl.fill = GridBagConstraints.HORIZONTAL;
//        c.ipady = 40;      //make this component tall
//        gbl.weightx = 0.0;
//        gbl.gridwidth = 3;

//        gbl.gridx =0;
//        gbl.gridy =1;
////        gbl.ipady =100;
        gbl.fill = GridBagConstraints.HORIZONTAL;
        gbl.ipady = 40;      //make this component tall
        gbl.weightx = 0.0;
        gbl.gridwidth = 3;
        gbl.gridx = 0;
        gbl.gridy = 1;
        header.add(info, gbl);



        gbl.fill = GridBagConstraints.HORIZONTAL;
        gbl.weighty = 1.0;
        gbl.ipady =10;
        gbl.gridx =1;
        gbl.gridy =2;
        gbl.anchor = GridBagConstraints.LAST_LINE_END;
//        gbl.insets = new Insets(10,0,0,0);



//        c.ipady = 0;       //reset to default
//        c.weighty = 1.0;   //request any extra vertical space
//        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
//        c.insets = new Insets(10,0,0,0);  //top padding
//        c.gridx = 1;       //aligned with button 2
//        c.gridwidth = 2;   //2 columns wide
//        c.gridy = 2;       //third row
        header.add(copy, gbl);


        return header;

    }

}
