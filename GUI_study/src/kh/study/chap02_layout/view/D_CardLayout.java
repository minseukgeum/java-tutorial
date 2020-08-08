package kh.study.chap02_layout.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_CardLayout extends JFrame{
	public D_CardLayout() {
		super("D_CardLayout");
		setBounds(300, 200, 500, 500);
		
		
		/// CardLayout
		// Panel을 이용해서 카드 판을 겹쳐놓음(이벤트로 다른 판이 보이게 설정해야함)
		CardLayout card = new CardLayout();
		setLayout(card);
		
		// 패널 만들기
		// 패널은 컴토넌트지만 다른 컴토넌트를 포함할 수 있어 컨테이너의 성격을 지니고 있음
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		// 패널에 배경색 지정
		card1.setBackground(Color.black);
		card2.setBackground(Color.blue);
		card3.setBackground(Color.pink);
		
		// 패널에 라벨 추가  안에들어가는 설명이라고 보면됨
		card1.add(new JLabel("Card1"));
		card2.add(new JLabel("Card2"));
		card3.add(new JLabel("Card3"));
		
		add(card1);
		add(card2);
		add(card3);
		
		// 패널에 이벤트 추가
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) { //좌클릭눌렀을때
					card.next(card1.getParent());
				}else if(e.getButton() == 3){
					card.previous(card1.getParent());
				}
			}
		});
		
		
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) { //좌클릭눌렀을때
					card.next(card2.getParent());
				}else if(e.getButton() == 3){
					card.previous(card2.getParent());
				}
			}
		});
		
		
		
		card3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) { //좌클릭눌렀을때
					card.next(card3.getParent());
				}else if(e.getButton() == 3){
					card.previous(card3.getParent());
				}
			}
		});
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
