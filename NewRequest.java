import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * This class is for design the new request JPanel that includes 2 part
 * and can change in JPanel
 */
public class NewRequest {

    private JPanel header;
    private JPanel quary;

    /**
     * this method use to built a north JPanel and add it to the JPanel to north
     * and a JTabbedPane that have 4 option(Body, Header, Query, Auth)
     * that Body includes another tab (From Data, Jason) and add it in center
     * of JPanel
     * @return JPanel newRequest that we can add it to the JFrame
     */
    public JPanel newRquest(){
        JPanel newRequest = new JPanel(new BorderLayout(0,0));
        newRequest.setBackground(new Color(180, 170, 220));
        JPanel north = North();

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

        newRequest.add(north, BorderLayout.NORTH);
        newRequest.add(tab, BorderLayout.CENTER);

        return newRequest;
    }

    /**
     * JPanel than includes 2 JButton(send, save) and a JComboBox
     * (GET, POST, PUT, PATCH, DELETE, OPTION, HEAD) and a JTextField
     * to get the URL
     * @return JPanel north to add it in north of the newRequest JPanel
     */
    private JPanel North(){

        JPanel north = new JPanel(new BorderLayout());
        JPanel north1 = new JPanel(new BorderLayout());
        int width = north1.getPreferredSize().width +310;
        north1.setPreferredSize(new Dimension(width, north1.getPreferredSize().height));
        JPanel north2 = new JPanel(new BorderLayout());

        String get[] = {"GET", "POST", "PUT", "PATCH", "DELETE", "OPTION", "HEAD"};
        JComboBox GET = new JComboBox(get);
        north1.add(GET, BorderLayout.WEST);

        JTextField URL = new JTextField("URL");
        URL.setFont(new Font("Serif", Font.PLAIN, 18));
        int hight0 = URL.getPreferredSize().height +20;
        URL.setPreferredSize(new Dimension(URL.getPreferredSize().width, hight0));
        north1.add(URL, BorderLayout.CENTER);

        JButton save = new JButton("Save");
        int width1 = save.getPreferredSize().width -15;
        save.setPreferredSize(new Dimension(width1, hight0));
        north2.add(save, BorderLayout.WEST);

        JButton send = new JButton("Send");
        send.setPreferredSize(new Dimension(width1, hight0));
        north2.add(send, BorderLayout.EAST);

        north.add(north1, BorderLayout.CENTER);
        north.add(north2, BorderLayout.EAST);
        return north;
    }

    /**
     * we use this method to create the JPanel that add in header tab
     * hear we have a + button that if we press that 2 JTextField(header
     * ,value) and a JCheckBox and a trash button add in the JPanel that
     * if we press the trash button add these field delete
     * @return JPanel header to add it in the header tab
     */

    private JPanel Header(){
        header = new JPanel(new BorderLayout(0,0));
        header.setBorder(new EmptyBorder(0, 5, 5, 5));
        JButton plus = new JButton("+");
        plus.setHorizontalAlignment(SwingConstants.CENTER);
        plus.setFocusable(true);
        header.add(plus, BorderLayout.NORTH);
        plus.setBackground(new Color(150, 140, 230));
        plus.setOpaque(true);

        addNewHeader();
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewHeader();
            }
        });
        return header;
    }
    /**
     * if we press the trash button add those field that added delete
     */
    private void addNewHeader(){
        header.setLayout(new GridLayout(15, 4));
        JPanel x = new JPanel();
        x.setLayout(new GridBagLayout());
        GridBagConstraints gbl = new GridBagConstraints();
        gbl.fill = GridBagConstraints.HORIZONTAL;
        JTextField key = new JTextField("Name");
        JTextField value = new JTextField("Value");
        JCheckBox checkBox = new JCheckBox();
        JButton trash = new JButton("X");

        gbl.weightx = 15;
        gbl.ipady = 15;
        x.add(key, gbl);
        x.add(value, gbl);
        gbl.weightx = 0;
        gbl.ipady = 5;
        x.add(checkBox, gbl);
        x.add(trash, gbl);

        header.add(x);

        trash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame j =new JFrame();
                j.add(x);
            }
        });
    }

    /**
     * we use this method to create the JPanel that add in header tab
     * hear we have a + button that if we press that 2 JTextField(name
     * ,value) and a JCheckBox and a trash button add in the JPanel
     * @return JPanel query to add it in the query tab
     */
    private JPanel Quary() {

        quary = new JPanel(new BorderLayout(0, 0));
        quary.setBorder(new EmptyBorder(0, 5, 5, 5));
        JButton plus = new JButton("+");
        plus.setBackground(new Color(150, 140, 230));
        plus.setOpaque(true);
        plus.setHorizontalAlignment(SwingConstants.CENTER);
        plus.setFocusable(true);
        quary.add(plus, BorderLayout.NORTH);

        addNewQuary();
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewQuary();
            }
        });

        return quary;
    }

    /**
     * if we press the trash button add those field that added delete
     */
    private void addNewQuary(){

        quary.setLayout(new GridLayout(15, 4));
        JPanel x = new JPanel();
        x.setLayout(new GridBagLayout());
        GridBagConstraints gbl = new GridBagConstraints();
        gbl.fill = GridBagConstraints.HORIZONTAL;
        JTextField key = new JTextField("Name");
        JTextField value = new JTextField("Value");
        JCheckBox checkBox = new JCheckBox();
        JButton trash = new JButton("X");


        gbl.weightx = 15;
        gbl.ipady = 15;
        x.add(key, gbl);
        x.add(value, gbl);
        gbl.weightx = 0;
        gbl.ipady = 5;
        x.add(checkBox, gbl);
        x.add(trash, gbl);

        quary.add(x);

        trash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame j =new JFrame();
                j.add(x);
            }
        });

    }

}
