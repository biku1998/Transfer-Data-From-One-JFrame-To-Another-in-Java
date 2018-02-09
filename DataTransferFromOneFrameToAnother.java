import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataTransferFromOneFrameToAnother  extends JFrame implements ActionListener{

    JFrame sender , reciver ;
    JButton sendData ;
    JTextField dataHolder , dataShow;

 DataTransferFromOneFrameToAnother(){

     sender = new JFrame("Frame 1 Sender");
     sender.setBounds(80,100,300,300);
     sender.setResizable(false);
     //--

     dataHolder =  new JTextField();
     dataHolder.setBounds(60,50,190,35);
     sender.add(dataHolder);

     sendData = new JButton("Send Data");
     sendData.setBounds(60,95,100,35);
     sender.add(sendData);
     sendData.addActionListener(this);


     //--
     sender.setLayout(null);
     sender.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     sender.setVisible(true);

 }

 public  static void main(String args[]){
     DataTransferFromOneFrameToAnother ref = new DataTransferFromOneFrameToAnother();
 }

    @Override
    public void actionPerformed(ActionEvent e) {

     if(e.getSource() == sendData){
         reciver  = new JFrame("Receiver Frame");
         reciver.setBounds(200,200,300,300);
         reciver.setResizable(false);


         dataShow =  new JTextField();
         dataShow.setBounds(60,50,190,35);
         reciver.add(dataShow);
         dataShow.setText(this.dataHolder.getText()); // getting the data of first frame and setting into next frame.



         reciver.setLayout(null);
         reciver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         sender.setVisible(false);
         reciver.setVisible(true);


     }

    }
}
