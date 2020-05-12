import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is for design the request JPanel that includes 3 part
 * one for label twe a JButton to add new request three a JPanel
 * that save all the requests
 */
public class Requests {

    private JPanel requests;
    private JPanel req;

    /**
     * we use this method to create a label and add it to north of JPanel
     * and create a new JPanel to save all te requests and add it in center
     * and a JButton that we can add a new constrain in JPanel
     * @return JPanel request that we can add it to the JFrame
     */
    public JPanel request(){
        requests = new JPanel(new BorderLayout(0,0));
        JLabel lable = new JLabel("Graphical User Interface");
        lable.setBackground(new Color(70, 30, 200));
        lable.setFont(new Font("Serif", Font.BOLD, 30));
        lable.setHorizontalAlignment(SwingConstants.CENTER);
        lable.setOpaque(true);
        int hight = lable.getPreferredSize().height +20;
        lable.setPreferredSize(new Dimension(lable.getPreferredSize().width, hight));

        req = new JPanel(new BorderLayout(0,0));

        JButton create = new JButton("Create a new request");
        create.addActionListener(new ActionListener()   {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name ;
                name = JOptionPane.showInputDialog("The name of your new request");
                builtRequest(name);
            }
        });

        req.setBackground(new Color(80, 130, 180));
        create.setBackground(new Color(70, 30, 200));

        req.add(create, BorderLayout.NORTH);
        requests.add(lable, BorderLayout.NORTH);
        requests.add(req, BorderLayout.CENTER);

        builtRequest("httpbin GET");
        builtRequest("POST from data");
        return requests;

    }

    /**
     * we use this method to add a new request to JPanel and save it
     * @param name that we got from input to save the request by it name
     */
    private void builtRequest(String name){
        System.out.println(name);
        req.setLayout(new GridLayout(15, 1));
        JButton built = new JButton(name);
        built.setBackground(new Color(160, 110, 200));
//        built.setPreferredSize(new Dimension(built.getPreferredSize().width+30 , built.getPreferredSize().height+10));
        built.setOpaque(true);
        built.setFont(new Font("Arial", Font.PLAIN, 20));
        req.add(built);

    }

}
