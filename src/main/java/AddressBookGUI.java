import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.*;


public class AddressBookGUI extends JFrame implements ActionListener {
    static JTextField t;
    static JButton b;
    static JFrame f;
    private JList<AddressBook> addressList = new JList <AddressBook>();
    DefaultListModel<String> listModel = new DefaultListModel<>();
    private JList<String> buddyList;
    private AddressBook newbook = new AddressBook();

    public AddressBookGUI() {
        setTitle ("Address Book");
        setSize(500, 500);

        setDefaultCloseOperation(1);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu buddyListMenu = new JMenu("BuddyList");
        menuBar.add(buddyListMenu);

        JMenuItem item;

        item = new JMenuItem ( "Add" );
        item.addActionListener( this );
        buddyListMenu.add( item );
        item = new JMenuItem ( "Remove" );
        item.addActionListener( this );
        buddyListMenu.add( item );


        buddyList = new JList<>(listModel);
        this.add(buddyList);
        buddyList.setVisible(true);


        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.equals("Add")) {
            String name = JOptionPane.showInputDialog("enter buddy Name");
            String phoneNumber = JOptionPane.showInputDialog("enter buddy phone-number");

            BuddyInfo newBuddy = new BuddyInfo(name,phoneNumber);
            newbook.addBuddy(newBuddy);
            listModel.addElement(newBuddy.getName()+" | "+newBuddy.getPhonenumber());

        }
        if (s.equals("Remove")) {
            listModel.remove(buddyList.getSelectedIndex());
        }
    }

}