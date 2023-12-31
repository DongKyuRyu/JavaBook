package java6.p40;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest implements ActionListener{
	private Frame f;
	private Button login;
	TextField id;
	TextField pwd;
	TextField trueandfalse;
	public TextFieldTest() {
		f = new Frame("Login");
		f.setSize(450, 130);
		f.setLayout(null);
		f.setBackground(Color.LIGHT_GRAY);

		login = new Button("Login");
		login.setBackground(Color.CYAN);
		login.setBounds(370, 35, 60, 50);
		login.addActionListener(this);

		Label lid = new Label("ID : ", Label.RIGHT);
		lid.setBounds(60, 35, 25, 25);
		Label lpwd = new Label("Password : ", Label.RIGHT);
		lpwd.setBounds(10, 60, 75, 25);

		id = new TextField();
		id.setBounds(90, 35, 250, 22);
		id.setBackground(Color.lightGray);
		id.setForeground(Color.DARK_GRAY);
		pwd = new TextField();
		pwd.setBounds(90, 60, 250, 22);
		pwd.setBackground(Color.lightGray);
		pwd.setForeground(Color.DARK_GRAY);
		trueandfalse = new TextField();
		trueandfalse.setBackground(Color.pink);
		trueandfalse.setForeground(Color.blue);
		trueandfalse.setBounds(20, 90, 410, 20);
		pwd.setEchoChar('*');

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(trueandfalse);
		f.add(login);
		f.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (id.getText().equals("hello") && pwd.getText().equals("1234")) {
			trueandfalse.setText("로그인 되었습니다.");
		} else {
			trueandfalse.setText("아이디 비밀번호가 틀림");
		}
	}

	public static void main(String[] args) {
		TextFieldTest tft = new TextFieldTest();
	}
}
