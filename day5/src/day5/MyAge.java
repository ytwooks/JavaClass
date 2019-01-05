package day5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyAge{

		JFrame f;
		JLabel top, sumPrice;
		JTextField result;
		JButton combo, potato, bulgogi;
		int resultInt = 0;
		int price1 = 10800;
		int price2 = 9900;
		int price3 = 12900;
		int sum = 0;
		int comCount = 0;
		int potCount = 0;
		int bulCount = 0;
		TextArea list;
		
	public MyAge() {
		f = new JFrame();
		f.setSize(500,200);
		top = new JLabel(">>>>>>>>>>>>>>>자바피자에 오신 것을 환영합니다<<<<<<<<<<<<<<<");

		combo = new JButton("콤보피자(10,800원)");
		potato = new JButton("포테이토피자(9,900원)");
		bulgogi = new JButton("불고기피자(12,900원)");
		result = new JTextField(10);
		
		sumPrice = new JLabel();
		
		list = new TextArea(3,80);
		
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.add(top);
		f.add(combo);
		f.add(potato);
		f.add(bulgogi);
		f.add(result);
		f.add(sumPrice);
		f.add(list);
		
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				resultInt += 1;
				result.setText(resultInt + "");
				sum += price1;
				comCount ++;
				sumPrice.setText("합계금액: " + sum + "원");
				list.setText("콤보 개수: " + comCount + "개\n" +
								"포테이토 개수: " + potCount + "개\n" + 
						"불고기 개수" + bulCount + "개\n");
				
			}
		});
		potato.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				resultInt += 1;
				result.setText(resultInt + "");
				sum += price2;
				potCount ++;
				sumPrice.setText("합계금액: " + sum + "원");
				list.setText("콤보 개수: " + comCount + "개\n" +
						"포테이토 개수: " + potCount + "개\n" + 
						"불고기 개수" + bulCount + "개\n");
			}
		});
		bulgogi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				resultInt += 1;
				result.setText(resultInt + "");
				sum += price3;
				bulCount ++ ;
				sumPrice.setText("합계금액: " + sum + "원");
				list.setText("콤보 개수: " + comCount + "개\n" +
						"포테이토 개수: " + potCount + "개\n" + 
						"불고기 개수" + bulCount + "개\n");
			}
		});
		
		f.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {

		MyAge age = new MyAge();
		
	}

}
