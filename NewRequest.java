import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewRequest {

    private int counterHeader= 1;
    private int counterQuery= 1;
    private JPanel header;
    private JPanel quary;

    public JPanel newRquest(){
        JPanel newRequest = new JPanel();
        newRequest.setBackground(new Color(180, 170, 220));
        newRequest.setLayout(new GridBagLayout());
        GridBagConstraints gbl = new GridBagConstraints();
        gbl.fill = GridBagConstraints.HORIZONTAL;

        String get[] = {"GET", "POST", "PUT", "PATCH", "DELETE", "OPTION", "HEAD"};
        JComboBox GET = new JComboBox(get);
        gbl.weighty = 1.0;
        gbl.gridx = 0;
        gbl.gridy = 0;
        gbl.ipady = 23;
        newRequest.add(GET, gbl);

        JTextField URL = new JTextField("URL");
        gbl.gridx = 1;
        gbl.gridy = 0;
        gbl.weightx = 5;
        newRequest.add(URL, gbl);

        JButton save = new JButton("Save");
        gbl.weightx = 0.0;
        gbl.gridwidth = 1;
        gbl.gridx = 0;
        gbl.gridy = 1;
        gbl.ipady = 4;
        newRequest.add(save, gbl);

        JButton send = new JButton("Send");
        gbl.gridx = 1;
        gbl.gridy = 1;
//        gbl.weightx = 0;
        newRequest.add(send, gbl);

//        JButton s = new JButton("Senhd");
//        gbl.gridx = 2;
//        gbl.gridy = 1;
//        gbl.weightx = 0;
//        newRequest.add(s, gbl);

        JTabbedPane tabBody = new JTabbedPane();
        JPanel FormData = new JPanel();
        JPanel JASON = new JPanel();
        tabBody.add("Form Data", FormData);
        tabBody.add("JASON" , JASON);


        JTabbedPane tab = new JTabbedPane();

        JPanel header  = Header();
        JPanel query = Quary();
        JPanel auth = new JPanel();
        tab.add("Body" , tabBody);
        tab.add("Header", header);
        tab.add("Query", query);
        tab.add("Auth", auth);


        gbl.ipady = 500;
        gbl.gridx =0;
        gbl.gridy=2;
        gbl.gridwidth = 4;
        gbl.gridheight = 1;
        newRequest.add(tab, gbl);



        return newRequest;
    }



    private JPanel Header(){

//        header  = new JPanel();
//
//        header.setBackground(Color.blue);                                    /////////////////////////////////
////        header.setPreferredSize(new Dimension(header.getWidth(), header.getHeight() + 200));
////        header.setBounds(30, 30, 30, 30);
////        header.setLayout(GridLayout);
//
//        header.setLayout(new FlowLayout());
////        GridBagConstraints gbl = new GridBagConstraints();
////        gbl.fill = GridBagConstraints.HORIZONTAL;
//
//
//        JButton plus = new JButton("+");
//        plus.setFocusable(true);
////        gbl.gridx =0;
////        gbl.gridy =0;
//        header.add(plus);
//        addNewHeader();
//        addNewHeader();
//
//        plus.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                addNewHeader();
//            }
//        });
//
//
//
//
//        return header;



        header  = new JPanel();
        header.setBackground(Color.blue);                                    /////////////////////////////////
//        header.setPreferredSize(new Dimension(header.getWidth(), header.getHeight() + 200));
//        header.setPreferredSize(new Dimension(80,150));
//        header.setBounds(30, 30, 30, 30);
//        header.setLayout(GridLayout);

        header.setLayout(new GridBagLayout());
        GridBagConstraints gbl = new GridBagConstraints();
        gbl.fill = GridBagConstraints.HORIZONTAL;
        gbl.insets = new Insets(5,0,5,0);
//        gbl.weightx = 1.0;
//        gbl.weighty = 1.0;
        gbl.gridwidth = GridBagConstraints.REMAINDER;

        JButton plus = new JButton("+");
        plus.setFocusable(true);
        gbl.gridx =0;
        gbl.gridy =0;
        header.add(plus, gbl);

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewHeader();
            }
        });




        return header;
    }

    public void addNewHeader(){

        GridBagConstraints gbl = new GridBagConstraints();
        gbl.fill = GridBagConstraints.HORIZONTAL;
        JTextField key = new JTextField("Header");
        JTextField value = new JTextField("Value");
        JCheckBox checkBox = new JCheckBox();
        JButton trash = new JButton("X");

//        key.setBorder(BorderFactory.createEtchedBorder());
//        value.setBorder(BorderFactory.createEtchedBorder());
//        checkBox.setBorder(BorderFactory.createEtchedBorder());
//        trash.setBorder(BorderFactory.createEtchedBorder());
        gbl.gridy = counterHeader++;
        gbl.weightx = 15;
        gbl.ipady = 15;
        header.add(key, gbl);
        header.add(value, gbl);
        gbl.weightx = 0;
        gbl.ipady = 5;
        header.add(checkBox, gbl);
        header.add(trash, gbl);


    }

    private JPanel Quary() {
        quary = new JPanel();
        quary.setLayout(new GridBagLayout());
        GridBagConstraints gbl = new GridBagConstraints();
        gbl.fill = GridBagConstraints.HORIZONTAL;

        JButton plus = new JButton("+");
        plus.setFocusable(true);
        gbl.gridx = 0;
        gbl.gridy = 0;
        quary.add(plus, gbl);

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewQuary();
            }
        });
        return quary;
    }

    public void addNewQuary(){

        GridBagConstraints gbl = new GridBagConstraints();
        gbl.fill = GridBagConstraints.HORIZONTAL;
        JTextField key = new JTextField("Name");
        JTextField value = new JTextField("Value");
        JCheckBox checkBox = new JCheckBox();
        JButton trash = new JButton("X");

        gbl.gridy = counterQuery++;
        gbl.weightx = 15;
        gbl.ipady = 15;
        quary.add(key, gbl);
        quary.add(value, gbl);
        gbl.weightx = 0;
        gbl.ipady = 5;
        quary.add(checkBox, gbl);
        quary.add(trash, gbl);

    }







}
