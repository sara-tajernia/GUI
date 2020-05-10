import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Screen  {
    private JFrame screen;

    public JFrame scrreen(){
        screen = new JFrame();
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setSize(1200, 720);
        screen.setLocationRelativeTo(null);
        screen.setLayout(new GridLayout(1,3));
//        screen.pack();

        addMenu();

        return screen;
    }

    private void addMenu(){

        JMenuBar jmb = new JMenuBar();
        screen.setJMenuBar(jmb);

        JMenu app = new JMenu("Application");
        app.setMnemonic('A');

        JMenuItem option = new JMenuItem("Option");           //create a new items on menubar
//        option.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                saving = num1;                                 //save a shown number on JPanel
//            }
//        });
        option.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));      //set accelerator for JMenuItem
        app.add(option);

        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);                                //save a shown number on JPanel
            }
        });
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, ActionEvent.CTRL_MASK));
        app.add(exit);




        JMenu view = new JMenu("View");
        view.setMnemonic('V');

        JMenuItem full_screen = new JMenuItem("Toggle Full Screen");
//        full_screen.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);                                //save a shown number on JPanel
//            }
//        });
        full_screen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
        view.add(full_screen);

        JMenuItem sidebar = new JMenuItem("Toggle Sidebar");
//        sidebar.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);                                //save a shown number on JPanel
//            }
//        });
        sidebar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        view.add(sidebar);


        JMenu help = new JMenu("Help");
        help.setMnemonic('H');

        JMenuItem help1 = new JMenuItem("Help");
//        help1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);                                //save a shown number on JPanel
//            }
//        });
        help1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
        help.add(help1);

        JMenuItem about = new JMenuItem("About");
//        about.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);                                //save a shown number on JPanel
//            }
//        });
        about.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
        help.add(about);


        jmb.add(app);
        jmb.add(view);
        jmb.add(help);
        screen.setJMenuBar(jmb);


//        JMenu save = new JMenu("Application");
//        save.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                saving = num1;
//            }
//        });



    }


//    public void Requests(){
//        requests = new JPanel();
//        requests.setBackground(Color.black);
//        requests.setLayout(new GridBagLayout());
//        GridBagConstraints gbl = new GridBagConstraints();
//        gbl.fill = GridBagConstraints.HORIZONTAL;
//
//
//
//        JLabel lable = new JLabel("Name");
//        lable.setBackground(new Color(70, 30, 200));
//        lable.setForeground(Color.white);
//        lable.setFont(new Font("Serif", Font.BOLD, 35));
//        lable.setHorizontalAlignment(SwingConstants.CENTER);
//        lable.setOpaque(true);
//        gbl.weighty = 1.0;
//        gbl.gridx =0;
//        gbl.gridy =0;
//        gbl.ipady = 25;
//        gbl.weightx =3;
//        requests.add(lable, gbl);
//
//        JPanel req = new JPanel();
//        req.setBackground(Color.gray);
//        req.setLayout(new GridBagLayout());
//        gbl.gridx =0;
//        gbl.gridy =1;
//        gbl.ipady = 600;
//        requests.add(req, gbl);
//
//
//        screen.add(requests, BorderLayout.WEST);
//
//    }
//
//    public void NewRequest(){
//        newRequest = new JPanel();
//        newRequest.setBackground(Color.pink);
//        newRequest.setLayout(new GridBagLayout());
//        GridBagConstraints gbl = new GridBagConstraints();
//        gbl.fill = GridBagConstraints.HORIZONTAL;
//
//        String get[] = {"GET", "POST", "PUT", "PATCH", "DELETE", "OPTION", "HEAD"};
//        JComboBox GET = new JComboBox(get);
//        gbl.weighty = 1.0;
//        gbl.gridx = 0;
//        gbl.gridy = 0;
//        gbl.ipady = 23;
//        newRequest.add(GET, gbl);
//
//        JTextField URL = new JTextField("URL");
//        gbl.gridx = 1;
//        gbl.gridy = 0;
//        gbl.weightx = 5;
//        newRequest.add(URL, gbl);
//
//        JButton send = new JButton("Send");
//        gbl.gridx = 2;
//        gbl.gridy = 0;
//        gbl.weightx = 0;
//        newRequest.add(send, gbl);
//
//        JTabbedPane tab = new JTabbedPane();
//        JPanel body = new JPanel();
//        body.setLayout(new GridBagLayout());
////        gbl.fill = GridBagConstraints.HORIZONTAL;
//        JPanel header  = Header();
//        JPanel query = new JPanel();
//        JPanel auth = new JPanel();
//        tab.add("Body" , body);
//        tab.add("Header", header);
//        tab.add("Query", query);
//        tab.add("Auth", auth);
//
//
//        gbl.ipady = 500;
//        gbl.gridx =0;
//        gbl.gridy=1;
//        gbl.gridwidth = 4;
//        gbl.gridheight = 1;
//        newRequest.add(tab, gbl);
//
//
//
//
//
//
//
//        screen.add(newRequest, BorderLayout.CENTER);
//
//
//    }
//
//    public JPanel Header(){
//        JPanel header  = new JPanel();
//        header.setLayout(new GridBagLayout());
//        GridBagConstraints gbl = new GridBagConstraints();
//        gbl.fill = GridBagConstraints.HORIZONTAL;
//
//
//        JTextField key = new JTextField("Header");
//        JTextField value = new JTextField("Value");
//        JCheckBox checkBox = new JCheckBox();
//        JButton trash = new JButton("X");
//        JButton plus = new JButton();
//
//
////        do {
//
//            gbl.weighty = 1.0;                  ///////////////////////////////////////////////
//            gbl.gridx = 0;
//            gbl.gridy = 0;
//            gbl.weightx = 15;
//            gbl.ipady = 15;
//            header.add(key, gbl);
//
//            gbl.gridx = 1;
//            gbl.gridy = 0;
//            header.add(value, gbl);
//
//            gbl.gridx = 3;
//            gbl.gridy = 0;
//            gbl.weightx = 0;
//            gbl.ipady = 5;
//            header.add(checkBox, gbl);
//
//            gbl.gridx = 4;
//            gbl.gridy = 0;
//            header.add(trash, gbl);
//
//
////        }while (key.getText() != "");
//
//
//
//        return header;
//    }
//
//
//    public void Respond(){
//        respond = new JPanel();
//        respond.setBackground(new Color(90, 90, 120));
//        respond.setLayout(new GridBagLayout());
//        GridBagConstraints gbl = new GridBagConstraints();
//        gbl.fill = GridBagConstraints.HORIZONTAL;
//
//        JLabel ok = new JLabel("OK");
//        ok.setBackground(Color.gray);
//        ok.setOpaque(true);
//        ok.setFont(new Font("Serif", Font.BOLD, 15));
//        ok.setHorizontalAlignment(SwingConstants.CENTER);
//
//        JLabel time = new JLabel("Time");
//        time.setBackground(Color.gray);
//        time.setOpaque(true);
//        time.setFont(new Font("Serif", Font.BOLD, 15));
//        time.setHorizontalAlignment(SwingConstants.CENTER);
//
//        JLabel quality = new JLabel("Quality");
//        quality.setBackground(Color.gray);
//        quality.setOpaque(true);
//        quality.setFont(new Font("Serif", Font.BOLD, 15));
//        quality.setHorizontalAlignment(SwingConstants.CENTER);
//
//        gbl.gridx = 0;
//        gbl.gridy = 0;
//        gbl.weightx = 1;
//        gbl.ipady = 25;
//        respond.add(ok, gbl);
//
//        gbl.gridx = 1;
//        gbl.gridy = 0;
//        respond.add(time, gbl);
//
//        gbl.gridx = 2;
//        gbl.gridy = 0;
//        respond.add(quality, gbl);
//
//
//        JTabbedPane tab = new JTabbedPane();
//        JPanel body = new JPanel();
//        body.setLayout(new GridBagLayout());
////        gbl.fill = GridBagConstraints.HORIZONTAL;
//        JPanel header  = HeaderRespond();
//        tab.add("Header", header);
//        tab.add("Body" , body);
//
//
//
//        gbl.ipady = 500;
//        gbl.gridx =0;
//        gbl.gridy=1;
//        gbl.gridwidth = 4;
//        gbl.gridheight = 1;
//        respond.add(tab, gbl);
//
//
//
//
//
//
//        screen.add(respond, BorderLayout.EAST);
//    }
//
//    public JPanel HeaderRespond(){
//
//        JPanel header  = new JPanel();
//        header.setLayout(new GridBagLayout());
//        GridBagConstraints gbl = new GridBagConstraints();
//        gbl.fill = GridBagConstraints.HORIZONTAL;
//
//        JLabel name = new JLabel("Name");
//        name.setBackground(Color.gray);
//        name.setOpaque(true);
//        name.setFont(new Font("Arial", Font.ITALIC, 15));
//
//        JLabel value = new JLabel("Value");
//        value.setBackground(Color.gray);
//        value.setOpaque(true);
//        value.setFont(new Font("Arial", Font.ITALIC, 15));
//
//        JButton copy = new JButton("Copy to Clipboard");
//
//        gbl.gridx = 0;
//        gbl.gridy = 0;
//        gbl.weightx = 2;
//        gbl.ipady = 15;
//        header.add(name, gbl);
//
//        gbl.gridx = 1;
//        gbl.gridy = 0;
//        header.add(value, gbl);
//
//        gbl.fill = GridBagConstraints.HORIZONTAL;
//        gbl.gridx =1;
//        gbl.gridy =1;
//        gbl.anchor = GridBagConstraints.PAGE_END;
////        gbl.insets = new Insets(10,0,0,0);
//        gbl.weighty = 1.0;
//
//
////        c.ipady = 0;       //reset to default
////        c.weighty = 1.0;   //request any extra vertical space
////        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
////        c.insets = new Insets(10,0,0,0);  //top padding
////        c.gridx = 1;       //aligned with button 2
////        c.gridwidth = 2;   //2 columns wide
////        c.gridy = 2;       //third row
//        header.add(copy, gbl);
//
//
//        return header;
//
//    }







}
