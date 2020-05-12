import javax.swing.*;
import java.awt.*;
/**
 *
 * This class is for design the respond JPanel that includes 2 part
 * and can change in JPanel
 */
public class Respond {
    /**
     * this method use to built a north JPanel and add it to the JPanel to north
     * and a JTabbedPane that have 2 option(Body, Raw)
     * @return JPanel respond that we can add it to the JFrame
     */
    public JPanel rspond(){

        JPanel respond = new JPanel(new BorderLayout());
        respond.setBackground(new Color(90, 90, 120));

        JTabbedPane tab = new JTabbedPane();
        JPanel body = new JPanel();
        JPanel header  = HeaderRespond();
        tab.add("Raw", header);
        tab.add("Body" , body);

        JPanel north = North();

        respond.add(north, BorderLayout.NORTH);
        respond.add(tab, BorderLayout.CENTER);

        return respond;
    }

    /**
     * we use this method to create the JPanel that add in header tab
     * hear we have 2 label(name, value) and a JTextArea to show the
     * result and a JButton in the end of JPanel
     * @return JPanel header to add it in the header tab
     */
    private JPanel HeaderRespond(){

        JPanel header  = new JPanel();
        header.setLayout(new GridBagLayout());
        GridBagConstraints gbl = new GridBagConstraints();
        gbl.fill = GridBagConstraints.HORIZONTAL;

        JLabel name = new JLabel("Name");
        name.setBackground(Color.gray);
        name.setOpaque(true);
        name.setFont(new Font("Arial", Font.ITALIC, 15));
        int height = name.getPreferredSize().height +20;
        name.setPreferredSize(new Dimension(name.getPreferredSize().width+5, height));

        JLabel value = new JLabel("Value");
        value.setBackground(Color.gray);
        value.setOpaque(true);
        value.setFont(new Font("Arial", Font.ITALIC, 15));
        value.setPreferredSize(new Dimension(value.getPreferredSize().width +5, height));

        JLabel info = new JLabel();
        info.setText("Fri, 08 May 2020 15:41:46 GMT");
        info.setText("\nAccess-Control-Allow-Credentials");
        info.setBackground(Color.pink);

        JButton copy = new JButton("Copy to Clipboard");


        gbl.fill = GridBagConstraints.HORIZONTAL;
        gbl.weightx = 0.5;
        gbl.anchor = GridBagConstraints.FIRST_LINE_START;
        header.add(name, gbl);

        gbl.anchor = GridBagConstraints.FIRST_LINE_END;
        gbl.fill = GridBagConstraints.HORIZONTAL;
        gbl.weightx = 0.5;
        header.add(value, gbl);

        gbl.fill = GridBagConstraints.HORIZONTAL;
        gbl.ipady = 40;
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
        header.add(copy, gbl);

        return header;
    }

    /**
     * JPanel than includes 3 JLabel(ok, time, quality)
     * @return JPanel north to add it in north of the respond JPanel
     */
    private JPanel North(){

        JPanel north = new JPanel(new BorderLayout());
        int height = north.getPreferredSize().height +40;
        north.setPreferredSize(new Dimension(north.getPreferredSize().width, height));

        JLabel ok = new JLabel("200 OK");
        ok.setBackground(Color.pink);
        ok.setOpaque(true);
        ok.setFont(new Font("Serif", Font.BOLD, 15));
        int width1 = ok.getPreferredSize().width +105;
        ok.setPreferredSize(new Dimension(width1, ok.getPreferredSize().height));
        ok.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel time = new JLabel("Time");
        time.setBackground(new Color(140, 100, 200));
        time.setOpaque(true);
        time.setFont(new Font("Serif", Font.BOLD, 15));
        time.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel quality = new JLabel("Quality");
        quality.setBackground(Color.CYAN);
        quality.setOpaque(true);
        quality.setFont(new Font("Serif", Font.BOLD, 15));
        quality.setPreferredSize(new Dimension(width1, quality.getPreferredSize().height));
        quality.setHorizontalAlignment(SwingConstants.CENTER);

        north.add(ok, BorderLayout.WEST);
        north.add(time, BorderLayout.CENTER);
        north.add(quality, BorderLayout.EAST);

        return north;

    }

}
