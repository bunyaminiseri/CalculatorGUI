import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;
public class Gui extends JFrame {
	private JTextField resultfield;
	private JButton clear,posneg,dot,one,two,three,four,five,six,seven,eight,nine,zero,add,mult,sub,div,pow,sqrt,equal,clearM,saveM,recallM,addM,subM;
	private double result=0.0,d1=0.0,d2=0.0,temp;
	private String S1,S2,Sresult,temp1; 
	private JPanel panel; 
	char operation = ' ';
	private boolean equalsClicked=false , Opchosen=false; 
	public Gui(){
		super("Calculator");
		resultfield=new JTextField(null,20);
		resultfield.setEditable(false);
		
		zero = new JButton("0");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		add = new JButton("+");
		mult = new JButton("*");
		sub = new JButton("-");
		div	= new JButton("/");
		equal = new JButton("=");
		pow = new JButton("x²");
		sqrt= new JButton("S_Root");
		clear = new JButton("C");
		clearM = new JButton("MC");
		saveM = new JButton("MS");
		recallM = new JButton("MR");
		addM = new JButton("M+");
		subM = new JButton("M-");
		dot = new JButton(".");
		posneg = new JButton("+/-");
		
		Numbers n = new Numbers();
		Calc c = new Calc();
		one.addActionListener(n);two.addActionListener(n);three.addActionListener(n);four.addActionListener(n);
		five.addActionListener(n);six.addActionListener(n);seven.addActionListener(n);eight.addActionListener(n);
		nine.addActionListener(n);zero.addActionListener(n);dot.addActionListener(n);posneg.addActionListener(n);
		clearM.addActionListener(c);saveM.addActionListener(c);recallM.addActionListener(c);
		addM.addActionListener(c);subM.addActionListener(c);
		
		add.addActionListener(c);sub.addActionListener(c);
		mult.addActionListener(c);div.addActionListener(c);
		equal.addActionListener(c);sqrt.addActionListener(c);
		pow.addActionListener(c);clear.addActionListener(c);
		
		Dimension size = new Dimension(75,40);
		
		panel= new JPanel(); 
		panel.setBackground(null);
		panel.setLayout(new FlowLayout());
		panel.add(resultfield,BorderLayout.NORTH);
		
		
		panel.add(one);one.setPreferredSize(size);
		panel.add(two);	two.setPreferredSize(size);
		panel.add(three);three.setPreferredSize(size);
		panel.add(four);four.setPreferredSize(size);
		panel.add(five);five.setPreferredSize(size);
		panel.add(six);	six.setPreferredSize(size);
		panel.add(seven);seven.setPreferredSize(size);
		panel.add(eight);eight.setPreferredSize(size);
		panel.add(nine);nine.setPreferredSize(size);
		panel.add(zero);zero.setPreferredSize(size);
		panel.add(add);add.setPreferredSize(size);
		panel.add(sub);sub.setPreferredSize(size);
		panel.add(mult);mult.setPreferredSize(size);
		panel.add(div);div.setPreferredSize(size);
		panel.add(pow);pow.setPreferredSize(size);
		panel.add(sqrt);sqrt.setPreferredSize(size);
		panel.add(equal);equal.setPreferredSize(size);
		panel.add(posneg);posneg.setPreferredSize(size);
		panel.add(dot);dot.setPreferredSize(size);
		panel.add(clearM);clearM.setPreferredSize(size);
		panel.add(saveM);saveM.setPreferredSize(size);
		panel.add(recallM);recallM.setPreferredSize(size);
		panel.add(addM);addM.setPreferredSize(size);
		panel.add(subM);subM.setPreferredSize(size);
		this.setContentPane(panel);
	}
	private class Numbers implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton src = (JButton) event.getSource();
			if(equalsClicked==true&&Opchosen==false){
				equalsClicked=false;
				S1=null;
				
			}
			
			if(src.equals(posneg)){
			    
			    if(Opchosen==false){
			     if ((S1==null)){
			      
			      d1=Double.parseDouble(S1);
			      d1=d1*-1;
			      S1=Double.toString(d1); 
			      
			     }
			    }
			    else if ((S2==null)){
			      d1=Double.parseDouble(S2);
			      d1=d1*-1;
			      S2=Double.toString(d1); 
			    }
			    
			   }
			
			if(src.equals(dot)){
				if(Opchosen==false){
					if(S1==null)
						S1="0.";
					else{
						if(S1.contains(".")){}
						else 
						S1=S1+".";
					}
				}
				else{
					
					if(S2==null)
						S2="0.";
					else
						if(S1.contains(".")){}
						else {
						S2=S2+".";
				}}
			}
			if(src.equals(one)){
			if(Opchosen==false){
				if(S1==null)
					S1="1";
				else
					S1=S1+"1";
			}
			else{
				
				if(S2==null)
					S2="1";
				else
					S2=S2+"1";
			}
		}
			if(src.equals(two)){
				if(Opchosen==false){
					if(S1==null)
						S1="2";
					else
						S1=S1+"2";
				}
				else{
					
					if(S2==null)
						S2="2";
					else
						S2=S2+"2";
				}
			}
			if(src.equals(three)){
				if(Opchosen==false){
					if(S1==null)
						S1="3";
					else
						S1=S1+"3";
				}
				else{
					if(S2==null)
						S2="3";
					else
						S2=S2+"3";
				}
			}
			if(src.equals(four)){
				if(Opchosen==false){
					if(S1==null)
						S1="4";
					else
						S1=S1+"4";
				}
				else{
					if(S2==null)
						S2="4";
					else
						S2=S2+"4";
				}
			}
			if(src.equals(five)){
				if(Opchosen==false){
					if(S1==null)
						S1="5";
					else
						S1=S1+"5";
				}
				else{
					if(S2==null)
						S2="5";
					else
						S2=S2+"5";
				}
			}
			if(src.equals(six)){
				if(Opchosen==false){
					if(S1==null)
						S1="6";
					else
						S1=S1+"6";
				}
				else{
					if(S2==null)
						S2="6";
					else
						S2=S2+"6";
				}
			}
			if(src.equals(seven)){
				if(Opchosen==false){
					if(S1==null)
						S1="7";
					else
						S1=S1+"7";
				}
				else{
					if(S2==null)
						S2="7";
					else
						S2=S2+"7";
				}
			}
			if(src.equals(eight)){
				if(Opchosen==false){
					if(S1==null)
						S1="8";
					else
						S1=S1+"8";
				}
				else{
					if(S2==null)
						S2="8";
					else
						S2=S2+"8";
				}
			}
			if(src.equals(nine)){
				if(Opchosen==false){
					if(S1==null)
						S1="9";
					else
						S1=S1+"9";
				}
				else{
					if(S2==null)
						S2="9";
					else
						S2=S2+"9";
				}
			}
			if(src.equals(zero)){
				if(Opchosen==false){
					if(S1==null)
						S1="0";
					else
						S1=S1+"0";
				}
				else{
					if(S2==null)
						S2="0";
					else
						S2=S2+"0";
				}
			}
			if(Opchosen==false){
				resultfield.setText(S1);
			}
			else{
				resultfield.setText(S2);
			}
			if(equalsClicked==false){
				if(Opchosen==false)
					resultfield.setText(S1);
				else
					resultfield.setText(S2);
			}
	}}
	private class Calc implements ActionListener{
		public void actionPerformed(ActionEvent event){
			
			JButton src = (JButton) event.getSource();
			if(src.equals(add)){
				if(S1==null){
					System.out.println(" choose num first");
				}else
					if(S1!=null && S2==null){
						
						Opchosen=true;
						operation = '+';
					}
					else
						if(S1!=null && S2!=null){
							System.out.println("two op");
						}
						
			}
			if(src.equals(sub)){
				if(S1==null){
					System.out.println(" choose num first");
				}else
					if(S1!=null && S2==null){
						Opchosen=true;
						operation = '-';
					}
					else
						if(S1!=null && S2!=null){
							System.out.println("two op");
						}
						
			}if(src.equals(mult)){
				if(S1==null){
					System.out.println(" choose num first");
				}else
					if(S1!=null && S2==null){
						Opchosen=true;
						operation = '*';
					}
					else
						if(S1!=null && S2!=null){
							System.out.println("two op");
						}
						
			}if(src.equals(div)){
				if(S1==null){
					System.out.println(" choose num first");
				}else
					if(S1!=null && S2==null){
						Opchosen=true;
						operation = '/';
					}
					else
						if(S1!=null && S2!=null){
							System.out.println("two op");
						}
						
			}if(src.equals(clearM)){
				temp=0;
						
			}if(src.equals(saveM)){
				if(S1==null){
					System.out.println(" choose num first");
				}else
					if(S1!=null&&S2==null){
						Opchosen=false;
						d1=Double.parseDouble(S1);
						temp=d1;
					}
						else if(S1!=null&&S2!=null){
						Opchosen=false;
						d1=Double.parseDouble(S2);
						temp=d1;
						
					}
				equalsClicked=true;	
			}if(src.equals(recallM)){
				Opchosen=false;
				if(S1==null){
					S1= Double.toString(temp);
					resultfield.setText(S1);	
				}
					
					if(S1!=null && S2==null){
						S2= Double.toString(temp);
						resultfield.setText(S2);	
					
					}
				if(S1!=null && S2!=null){
					S1= Double.toString(temp);
					resultfield.setText(S1);	
				
				}
				equalsClicked=true;
						
			}if(src.equals(addM)){
				Opchosen=false;
				if(S1==null){
					System.out.println(" choose num first");
				}else
					if(S1!=null && S2==null){
						d1=Double.parseDouble(S1);
						temp+=d1;
						
					}
					else
						if(S1!=null && S2!=null){
							d1=Double.parseDouble(S2);
							temp+=d1;
						}
						
			}
			if(src.equals(subM)){
				Opchosen=false;
				if(S1==null){
					System.out.println(" choose num first");
				}else
					if(S1!=null && S2==null){
						d1=Double.parseDouble(S1);
						temp-=d1;
						
					}
					if(S1!=null && S2!=null){
							d1=Double.parseDouble(S2);
							temp-=d1;
						}
						
			}
			
			if(src.equals(pow)){
				if(S1==null){
					System.out.println(" choose num first");
				}else
					if(S1!=null && S2==null){
						Opchosen=true;
						operation = 'p';
					}
					else
						if(S1!=null && S2!=null){
							System.out.println("two op");
						}
						
			}
			if(src.equals(sqrt)){
				if(S1==null){
					System.out.println(" choose num first");
				}else
					if(S1!=null){
						Opchosen=true;
						d1=Double.parseDouble(S1);
						result=Math.sqrt(d1);
						operation = 's';
						Sresult = Double.toString(result);
						
						S2=null;
						S1=Sresult;					
						resultfield.setText(Sresult);
						equalsClicked=true;
					}
					
						
			}
			if(src.equals(equal)){
				if(S1==null){
					System.out.println(" choose num first");
				}else
					if(S1!=null && S2==null){
						System.out.println("both num");
					}
				if(S1!=null&&S2!=null){
					d1=0.0;
					d2=0.0;
					d1=Double.parseDouble(S1);
					d2=Double.parseDouble(S2);
					switch(operation){
					case '+':
						result=d1+d2;
						S1=null;
						S2=null;
						Opchosen=false;
						break;
					case '-':
						result=d1-d2;
						S1=null;
						S2=null;
						Opchosen=false;
						break;
					case '*':
						result=d1*d2;
						S1=null;
						S2=null;
						Opchosen=false;
						break;
					case '/':
						result=d1/d2;
						S1=null;
						S2=null;
						Opchosen=false;
						break;
					
					case 'p':
						result=Math.pow(d1, d2);
						S1=null;
						S2=null;
						Opchosen=false;
						break;
					}
						
					Sresult = Double.toString(result);
					S1=Sresult;	
					S2=null;
					resultfield.setText(Sresult);
					equalsClicked=true;
					
				}
					
						
			}
	}
		}}


