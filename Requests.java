import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Requests {
    private JPanel req;
    private int counter= 1;

    public JPanel rquest(){
        JPanel requests = new JPanel();
        requests.setBackground(new Color(80, 130, 180));
        requests.setLayout(new GridBagLayout());
        GridBagConstraints gbl = new GridBagConstraints();
        gbl.fill = GridBagConstraints.HORIZONTAL;


        JLabel lable = new JLabel("Graphical User Interface");
        lable.setBackground(new Color(70, 30, 200));
        lable.setForeground(Color.white);
        lable.setFont(new Font("Serif", Font.BOLD, 30));
        lable.setHorizontalAlignment(SwingConstants.CENTER);
        lable.setOpaque(true);
//        gbl.weighty = 1.0;
//        gbl.gridx =0;
//        gbl.gridy =0;
        gbl.ipady = 50;
        gbl.weightx =3;
//        gbl.anchor = GridBagConstraints.FIRST_LINE_START;
        requests.add(lable, gbl);



        req = new JPanel();
        req.setBackground(new Color(80, 130, 180));
        req.setLayout(new GridBagLayout());
        gbl.gridx =0;
        gbl.gridy =2;
//        gbl.ipady = 500;
        requests.add(req, gbl);

        JButton create = new JButton("Create a new request");
        create.setBackground(new Color(70, 30, 200));
        create.setHorizontalAlignment(SwingConstants.CENTER);
        create.setOpaque(true);
        create.setFocusable(true);
        gbl.gridx =0;
        gbl.gridy =1;
        gbl.ipady = 15;
        gbl.weightx =3;
        requests.add(create, gbl);

        builtRequest("hjas");
        builtRequest("djahk");
        builtRequest("dwrg");
        builtRequest("drgerk");

        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                addNewHeader();
////                builtRequest("httpbin GET");
//                JButton built = new JButton();
////                JButton built = (JButton) e.getSource();
////                builtRequest(built);
//                built.setText("dfjzef");
//                built.setBackground(new Color(160, 110, 200));
//                built.setOpaque(true);
//                built.setFont(new Font("Arial", Font.PLAIN, 20));
//                built.setLayout(new GridBagLayout());
//                GridBagConstraints gbl = new GridBagConstraints();
//                gbl.fill = GridBagConstraints.HORIZONTAL;
//
//                gbl.gridy = counter++;
//                gbl.weightx = 15;
//                gbl.ipady = 15;
//                req.add(built, gbl);
            }
        });

        return requests;

    }

    public void builtRequest(String name){
        JButton built = new JButton(name);
        built.setBackground(new Color(160, 110, 200));
        built.setOpaque(true);
        built.setFont(new Font("Arial", Font.PLAIN, 20));
        built.setLayout(new GridBagLayout());
        GridBagConstraints gbl = new GridBagConstraints();
        gbl.fill = GridBagConstraints.HORIZONTAL;

        gbl.gridy = counter++;
        gbl.weightx = 15;
        gbl.ipady = 18;
        req.add(built, gbl);

    }




}
