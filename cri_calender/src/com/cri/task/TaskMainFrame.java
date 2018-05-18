package com.cri.task;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class TaskMainFrame extends JFrame {

	private JPanel contentPane;
	private JPanel head;
	private JLabel date;
	private JButton addButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaskMainFrame frame = new TaskMainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TaskMainFrame() {
		setForeground(Color.GRAY);
		setType(Type.UTILITY);
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setPreferredSize(new Dimension(475, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
        head = new JPanel();
        head.setBackground(Color.GRAY);
		head.setLayout(new BorderLayout(0, 0));
        contentPane.add(head, BorderLayout.NORTH);
		date = new JLabel("今日");
		head.add(date, BorderLayout.WEST);
		addButton = new JButton("+");
		addButton.setBackground(Color.GRAY);
		head.add(addButton, BorderLayout.EAST);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		textArea.setBackground(Color.GRAY);
		textArea.setText("タスクはありません");
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
	}

}
