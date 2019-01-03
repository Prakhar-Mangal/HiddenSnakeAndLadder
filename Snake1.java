import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
class Goti
{
  int index;
  void setIndex(int index)
  {
    this.index=index;
  }
  int getIndex()
  {
    return index;
  }
}
class Snake1 extends JFrame implements ActionListener
{
  Goti r=new Goti();
  Goti b=new Goti();
  Goti g=new Goti();
  Button b1,b2,b3;
  JLabel bg,c1,c2,c3,c4,c5,c6,c7,c8;
  Dialog d1,d2;
  Choice ch1,ch2;
  Button l[]=new Button[100];
  Label lb,lc;
  int roll,a=0,c=0,k=0;
  Random num;

  void quickMatch(){

    ImageIcon img=new ImageIcon("sna.png");
    bg=new JLabel("",img,JLabel.CENTER);
    c1=new JLabel("",img,JLabel.CENTER);
    c2=new JLabel("",img,JLabel.CENTER);
    c3=new JLabel("",img,JLabel.CENTER);
    c4=new JLabel("",img,JLabel.CENTER);
    c5=new JLabel("",img,JLabel.CENTER);
    c6=new JLabel("",img,JLabel.CENTER);
    c7=new JLabel("",img,JLabel.CENTER);
    c8=new JLabel("",img,JLabel.CENTER);
  b1=new Button("Start");
  num=new Random();
  for(int i=39;i>-1;i--)
  {
  l[i]=new Button((i+1)+"");
  l[i].setBackground(Color.yellow);
}
  this.setSize(500,500);
  this.setLocation(50,50);
this.setLayout(new GridLayout(5,10));
  for(int i=39;i>=30;i--)
    this.add(l[i]);
  for(int i=20;i<=29;i++)
    this.add(l[i]);
  for(int i=19;i>=10;i--)
    this.add(l[i]);
  for(int i=0;i<=9;i++)
    this.add(l[i]);
    this.add(b1);
    this.add(bg);
    this.add(c1);
    this.add(c2);
  this.add(c3);
this.add(c4);
    this.add(c5);
    this.add(c6);
    this.add(c7);
  this.add(c8);
  b1.addActionListener(this);
  b1.setBackground(Color.magenta);
  b1.setForeground(Color.blue);
  l[r.getIndex()].setBackground(Color.red);
  }
  void fullMatch(){

      ImageIcon img=new ImageIcon("sna.png");
      bg=new JLabel("",img,JLabel.CENTER);
      c1=new JLabel("",img,JLabel.CENTER);
      c2=new JLabel("",img,JLabel.CENTER);
      c3=new JLabel("",img,JLabel.CENTER);
      c4=new JLabel("",img,JLabel.CENTER);
      c5=new JLabel("",img,JLabel.CENTER);
      c6=new JLabel("",img,JLabel.CENTER);
      c7=new JLabel("",img,JLabel.CENTER);
      c8=new JLabel("",img,JLabel.CENTER);
    b1=new Button("Start");
    num=new Random();
    for(int i=99;i>-1;i--)
    {
    l[i]=new Button((i+1)+"");
    l[i].setBackground(Color.yellow);
  }
    this.setSize(500,500);
    this.setLocation(50,50);
  this.setLayout(new GridLayout(11,10));
    for(int i=99;i>=90;i--)
      this.add(l[i]);
    for(int i=80;i<=89;i++)
      this.add(l[i]);
    for(int i=79;i>=70;i--)
      this.add(l[i]);
    for(int i=60;i<=69;i++)
     this.  add(l[i]);
    for(int i=59;i>=50;i--)
      this.add(l[i]);
    for(int i=40;i<=49;i++)
      this.add(l[i]);
    for(int i=39;i>=30;i--)
      this.add(l[i]);
    for(int i=20;i<=29;i++)
      this.add(l[i]);
    for(int i=19;i>=10;i--)
      this.add(l[i]);
    for(int i=0;i<=9;i++)
      this.add(l[i]);
      this.add(b1);
      this.add(bg);
      this.add(c1);
      this.add(c2);
    this.add(c3);
 this.add(c4);
      this.add(c5);
      this.add(c6);
      this.add(c7);
    this.add(c8);
    b1.addActionListener(this);
    b1.setBackground(Color.magenta);
    b1.setForeground(Color.blue);
    l[r.getIndex()].setBackground(Color.red);
  }
  void kata(Goti o)
  {
    //if(o.getIndex()==5||o.getIndex()==6||o.getIndex()==7)
    if(o.getIndex()%5==0)
    {
        l[o.getIndex()].setBackground(Color.yellow);
          o.setIndex(o.getIndex()-4);
          if(o==r)
          l[o.getIndex()].setBackground(Color.red);
          else if(o==b)
          l[o.getIndex()].setBackground(Color.blue);
          else if(o==g)
          l[o.getIndex()].setBackground(Color.green);
    }
  }
  // chado is blocked by comment
  void chado(Goti o)  
  {
    //if(o.getIndex()==5||o.getIndex()==6||o.getIndex()==7)
    if(o.getIndex()==16||o.getIndex()==9||o.getIndex()==11)
    {
        l[o.getIndex()].setBackground(Color.yellow);
          o.setIndex(90);
          if(o==r)
          l[o.getIndex()].setBackground(Color.red);
          else if(o==b)
          l[o.getIndex()].setBackground(Color.blue);
          else if(o==g)
          l[o.getIndex()].setBackground(Color.green);
    }
  }
  void change(Goti o)
  {
    if((o.getIndex()+roll)<100)
    {
    l[o.getIndex()].setBackground(Color.yellow);
    o.setIndex(o.getIndex()+roll);
  }
}
void change1(Goti o)
{
  if((o.getIndex()+roll)<40)
  {
  l[o.getIndex()].setBackground(Color.yellow);
  o.setIndex(o.getIndex()+roll);
}
}

  void check()
  {
    if(c%2==0)
    {
      b2.setLabel("Play");
      c++;
    }
    else
    {
      b2.setLabel("Roll");
      c++;
    }
  }
  void won()
  {
    if(r.getIndex()==99)
    {
      lc.setText("Red Won");
    }
    else if(b.getIndex()==99)
    {
      lc.setText("Blue Won");
    }
    else if(g.getIndex()==99)
    {
      lc.setText("Green Won");
    }
  }
  void won1()
  {
    if(r.getIndex()==39)
    {
      lc.setText("Red Won");
    }
    else if(b.getIndex()==39)
    {
      lc.setText("Blue Won");
    }
    else if(g.getIndex()==39)
    {
      lc.setText("Green Won");
    }
  }
  public void actionPerformed(ActionEvent e)
  {

    if(e.getSource()==b1)
    {
      d1.setVisible(true);
    }
    else if(e.getSource()==b3)
    { int n=ch2.getSelectedIndex();
      if(n==1)
      fullMatch();
      else   if(n==0)
      quickMatch();
      this.setVisible(true);
      d2.dispose();
      System.out.println(ch2.getSelectedItem());

    }
    else if(e.getSource()==b2)
    {
      check();
      if(k%2==0)
      {
      roll=num.nextInt(6)+1;
        lb.setText(roll+"");
      k++;}
        else
        {
          k++;
          lb.setText("");
        }
      if(b2.getLabel()=="Roll")
      {
        if(a==0)
        { int n=ch2.getSelectedIndex();
          if(n==1)
          change(r);
          else if(n==0)
          change1(r);
          l[r.getIndex()].setBackground(Color.red);
          if(ch1.getSelectedItem()=="3 Player")
          l[g.getIndex()].setBackground(Color.green);
          l[b.getIndex()].setBackground(Color.blue);
          kata(r);
          //chado(r);
          a=1;
          if(n==1)
           won();
           else if(n==0)
           won1();
        }

      else if(a==1)
      {
        int n=ch2.getSelectedIndex();
          if(n==1)
          change(b);
          else if(n==0)
          change1(b);
        l[b.getIndex()].setBackground(Color.blue);
        l[r.getIndex()].setBackground(Color.red);
        if(ch1.getSelectedItem()=="3 Player")
        l[g.getIndex()].setBackground(Color.green);
        kata(b);
        //chado(b);
        if(n==1)
         won();
         else if(n==0)
         won1();
        a=0;
        if(ch1.getSelectedItem()=="3 Player")
        a=2;
      }

      else if(a==2)
      {
        int n=ch2.getSelectedIndex();
          if(n==1)
          change(g);
          else if(n==0)
          change1(g);
        l[g.getIndex()].setBackground(Color.green);
        l[b.getIndex()].setBackground(Color.blue);
        l[r.getIndex()].setBackground(Color.red);
        kata(g);
        //chado(g);
        a=0;
        if(n==1)
         won();
         else if(n==0)
         won1();
      }
    }
  }
}

  Snake1()
  {

    createDialog();
    d2.setVisible(true);
  }
  void createDialog()
  {

    d1=new Dialog(this);
    d2=new Dialog(this);
    ch1=new Choice();
    ch2=new Choice();
    ch1.add("2 Player");
    ch1.add("3 Player");
    ch2.add("Quick Match");
    ch2.add("Full Match");
    b2=new Button("Roll");
    lb=new Label();
    lc=new Label("Result");
    b3=new Button("Go");
    d2.setSize(300,250);
    d2.setLocation(50,50);
    d2.setLayout(new FlowLayout());
    d1.setSize(300,100);
    d1.setLocation(200,100);
    d1.setLayout(new FlowLayout());
    d1.add(lb);
    d1.add(b2);
    d1.add(lc);
    d1.setBackground(Color.orange);
    b2.setBackground(Color.yellow);
    b2.setForeground(Color.red);
    lc.setBackground(Color.white);
    b3.setBackground(Color.yellow);
    b3.setForeground(Color.red);
    d2.add(ch1);
    d2.add(ch2);
    d2.add(b3);
    b2.addActionListener(this);
    b3.addActionListener(this);

  }

  public static void main(String ar[])
  {
    new Snake1();
   }
}
