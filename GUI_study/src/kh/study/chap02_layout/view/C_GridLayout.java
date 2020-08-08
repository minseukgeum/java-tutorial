package kh.study.chap02_layout.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame{
	public C_GridLayout() {
		super("C_GridLayout");
		setBounds(300, 200, 500, 500);
		
		//GridLayout
		//	���� ������ �� �� ����ŭ ��ġ�ϰ� �� �� ���
		setLayout(new GridLayout(5, 5, 10, 10));
		for(int i=1; i<26; i++) {
			String str = new Integer(i).toString();
			add(new JButton(str));
		}
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}