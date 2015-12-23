
import javafx.scene.text.FontWeight;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;

public class NotePad extends JFrame implements ActionListener {
    private TextArea textArea = new TextArea("",0,0, TextArea.SCROLLBARS_VERTICAL_ONLY);

    //private TextArea textArea2 = new TextArea("", 0,0, TextArea.SCROLLBARS_VERTICAL_ONLY);
    JTextArea txt = new JTextArea();



    private MenuBar menuBar = new MenuBar();

    private Menu file = new Menu();
    private MenuItem openFile = new MenuItem();
    private MenuItem saveFile = new MenuItem();
    private MenuItem close = new MenuItem();
    private MenuItem newFile = new MenuItem();

    private Menu fonts  = new Menu();
    private MenuItem BoldFont = new MenuItem();
    private MenuItem ItalicFont = new MenuItem();
    private MenuItem NormalFont = new MenuItem();

    private Menu size = new Menu();
    private MenuItem size14 = new MenuItem();
    private MenuItem size16 = new MenuItem();
    private MenuItem size18 = new MenuItem();
    private MenuItem size20 = new MenuItem();

    private Menu FontStyle = new Menu();
    private MenuItem s1 = new MenuItem();
    private MenuItem s2 = new MenuItem();
    private MenuItem s3 = new MenuItem();
    private MenuItem s4 = new MenuItem();
    private MenuItem s5 = new MenuItem();


    private Menu About = new Menu();
    private MenuItem team = new MenuItem();
    private MenuItem outline = new MenuItem();
    
    private Menu OpenLists = new Menu();
    private MenuItem todo = new MenuItem();

    public NotePad() {
        this.setSize(700, 500);
        this.setTitle("Notepad");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.textArea.setFont(new Font("Century Gothic", Font.PLAIN, 16));

        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(textArea);

        this.setMenuBar(this.menuBar);
        ////////////////////////////////////////////////////////////////////////

        this.menuBar.add(this.file);
        this.file.setLabel("File");


        this.newFile.setLabel("New");
        this.newFile.addActionListener(this);
        this.newFile.setShortcut(new MenuShortcut(KeyEvent.VK_N, false));
        this.file.add(this.newFile);

        this.openFile.setLabel("Open");
        this.openFile.addActionListener(this);
        this.openFile.setShortcut(new MenuShortcut(KeyEvent.VK_O, false));
        this.file.add(this.openFile);

        this.saveFile.setLabel("Save");
        this.saveFile.addActionListener(this);
        this.saveFile.setShortcut(new MenuShortcut(KeyEvent.VK_S, false));
        this.file.add(this.saveFile);

        this.close.setLabel("Close");
        this.close.setShortcut(new MenuShortcut(KeyEvent.VK_F4, false));
        this.close.addActionListener(this);
        this.file.add(this.close);
        /////////////////////////////////////////////////////////////////////////

        this.menuBar.add(fonts);
        this.fonts.setLabel("Font");

        this.BoldFont.setLabel("Bold");
        this.BoldFont.setShortcut(new MenuShortcut(KeyEvent.VK_B, false));
        this.BoldFont.addActionListener(this);
        this.fonts.add(this.BoldFont);

        this.ItalicFont.setLabel("Italic");
        this.ItalicFont.setShortcut(new MenuShortcut(KeyEvent.VK_I, false));
        this.ItalicFont.addActionListener(this);
        this.fonts.add(this.ItalicFont);

        this.NormalFont.setLabel("Regular");
        this.NormalFont.setShortcut(new MenuShortcut(KeyEvent.VK_N, false));
        this.NormalFont.addActionListener(this);
        this.fonts.add(this.NormalFont);
        //////////////////////////////////////////////////////////////////////////

        this.menuBar.add(size);
        this.size.setLabel("Size");

        this.size14.setLabel("14");
        this.size14.addActionListener(this);
        this.size.add(this.size14);

        this.size16.setLabel("16");
        this.size16.addActionListener(this);
        this.size.add(this.size16);

        this.size18.setLabel("18");
        this.size18.addActionListener(this);
        this.size.add(this.size18);

        this.size20.setLabel("20");
        this.size20.addActionListener(this);
        this.size.add(this.size20);
        //////////////////////////////////////////////////////////////////////////

        this.menuBar.add(FontStyle);
        this.FontStyle.setLabel("Font Style");

        this.s1.setLabel("Century Gothic");
        this.s1.addActionListener(this);
        this.FontStyle.add(this.s1);

        this.s2.setLabel("Arial");
        this.s2.addActionListener(this);
        this.FontStyle.add(this.s2);

        this.s3.setLabel("Comic");
        this.s3.addActionListener(this);
        this.FontStyle.add(this.s3);

        this.s4.setLabel("Freestyle Script");
        this.s4.addActionListener(this);
        this.FontStyle.add(this.s4);

        this.s5.setLabel("Papyrus");
        this.s5.addActionListener(this);
        this.FontStyle.add(this.s5);
        //////////////////////////////////////////////////////////////////////////////

        this.menuBar.add(About);
        this.About.setLabel("About");

        this.team.setLabel("Team");
        this.team.addActionListener(this);
        this.About.add(this.team);

        this.outline.setLabel("Outline");
        this.outline.addActionListener(this);
        this.About.add(this.outline);

        this.menuBar.add(OpenLists);
        this.OpenLists.setLabel("To-Do Lists");
        this.todo.setLabel("Open To-Do List");
        this.todo.addActionListener(this);
        this.OpenLists.add(this.todo);

    }

    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == this.close)
        {
            this.dispose();
        }

        else if (e.getSource() == this.todo) {
        	String[] args = {"NotePad"} ;
        	CheckBoxJList.main(args);
        }
        else if (e.getSource() == this.s1)
        {
            this.textArea.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        }
        else if (e.getSource() == this.s2)
        {
            this.textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        }
        else if (e.getSource() == this.s3)
        {
            this.textArea.setFont(new Font("Comic sans MS", Font.PLAIN, 16));
        }
        else if (e.getSource() == this.s4)
        {
            this.textArea.setFont(new Font("Freestyle Script", Font.PLAIN, 16));
        }
        else if (e.getSource() == this.s5)
        {
            this.textArea.setFont(new Font("Papyrus", Font.PLAIN, 16));
        }
        else if (e.getSource() == this.NormalFont)
        {
            this.textArea.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        }
        else if(e.getSource() == this.team)
        {
            JFrame aboutWindow = new JFrame("Team ");
            setDefaultCloseOperation(EXIT_ON_CLOSE);


            setLayout(null);
            txt.setBounds(3, 3, 300, 100);
            add(txt);
            Font font = new Font("Papyrus", Font.BOLD, 18);
            txt.setFont(font);
            txt.setForeground(Color.BLUE);
            txt.setText("Ankita Christine Victor\n" +
                            "Rahul Rachuri\n" +
                            "Anup Deshmukh\n\n\n\n" );

            aboutWindow.getContentPane().setLayout(new BorderLayout());
            aboutWindow.setSize(400,300);
            aboutWindow.getContentPane().add(txt);
            aboutWindow.setVisible(true);
        }
        else if(e.getSource() == this.outline)
        {
            JFrame aboutWindow2 = new JFrame("Application ");
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            setLayout(null);
            txt.setBounds(3, 3, 300, 100);
            add(txt);
            Font font = new Font("Calibri", Font.BOLD, 16);
            txt.setFont(font);
            txt.setForeground(Color.BLACK);
            txt.setText("Welcome to our Notepad!\n\n   1] You can create notes or edit existing ones.\n   2] Use CTRL+O to choose the file to be opened and CTRL+N to open a new file.\n   3] Once you are done with your file press CTRL+S or use the dropdown menu to select 'Save' and choose the location to save your file.\n   4] When you are editing, you increase or decrease the font size used in the document or change the font style from the options provided in their respective dropdown menus.\n\n\n We plan on taking this further in the future by integrating it with our To-Do List application and possibly integrating it with a cloud service and providing more functionality and customisation to the user.\n\n Thank you for using our product! \n");

            aboutWindow2.getContentPane().setLayout(new BorderLayout());
            aboutWindow2.setSize(1500,300);
            aboutWindow2.getContentPane().add(txt);
            aboutWindow2.setVisible(true);
        }


        else if (e.getSource() == this.ItalicFont)
        {
            this.textArea.setFont(new Font("Italic", Font.ITALIC, 16));
        }

        else if (e.getSource() == this.NormalFont)
        {
            this.textArea.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        }
        else if (e.getSource() == this.size14)
        {
            Font font = this.textArea.getFont();
            String name = font.getName();
            this.textArea.setFont(new Font(name, Font.PLAIN, 14));
        }
        else if (e.getSource() == this.size16)
        {
            Font font = this.textArea.getFont();
            String name = font.getName();
            this.textArea.setFont(new Font(name, Font.PLAIN, 16));
        }
        else if (e.getSource() == this.size18)
        {
            Font font = this.textArea.getFont();
            String name = font.getName();
            this.textArea.setFont(new Font(name, Font.PLAIN, 18));
        }
        else if (e.getSource() == this.size20)
        {
            Font font = this.textArea.getFont();
            String name = font.getName();
            this.textArea.setFont(new Font(name, Font.PLAIN, 20));
        }

        else if (e.getSource() == this.BoldFont) {
            Font font = this.textArea.getFont();
            String name = font.getName();
            this.textArea.setFont(new Font(name, Font.BOLD, 16));
        }

        else if (e.getSource() == this.newFile) {
            NotePad NotePad2 = new NotePad();
            NotePad2.setVisible(true);
        }

        else if (e.getSource() == this.openFile)     {
            JFileChooser open = new JFileChooser();
            int option = open.showOpenDialog(this);

            if (option == JFileChooser.APPROVE_OPTION) {
                this.textArea.setText("");
                try {
                    Scanner scan = new Scanner(new FileReader(open.getSelectedFile().getPath()));
                    while (scan.hasNext())
                        this.textArea.append(scan.nextLine() + "\n");
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

        else if (e.getSource() == this.saveFile) {
            JFileChooser save = new JFileChooser();
            int option = save.showSaveDialog(this);

            if (option == JFileChooser.APPROVE_OPTION) {
                try {
                    BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
                    out.write(this.textArea.getText());
                    out.close();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        NotePad app = new NotePad();
        app.setVisible(true);
    }

}
