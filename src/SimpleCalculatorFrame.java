import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class SimpleCalculatorFrame extends JFrame
{
    public static final int ADD = 0, SUBTRACT = 1, MULTIPLY = 2, DIVIDE = 3;

    JButton decimalButton = new JButton(".");
    JButton plusOrMinusButton = new JButton("±");
    JButton clearButton = new JButton("C");
    JButton addButton = new JButton(" + ");
    JButton subtractButton = new JButton(" - ");
    JButton multiplyButton = new JButton(" × ");
    JButton divideButton = new JButton(" ÷ ");
    JButton equalsButton = new JButton(" = ");
    JButton digitOneButton = new JButton("1");
    JButton digitTwoButton = new JButton("2");
    JButton digitThreeButton = new JButton("3");
    JButton digitFourButton = new JButton("4");
    JButton digitFiveButton = new JButton("5");
    JButton digitSixButton = new JButton("6");
    JButton digitSevenButton = new JButton("7");
    JButton digitEightButton = new JButton("8");
    JButton digitNineButton = new JButton("9");
    JButton digitZeroButton = new JButton("0");

    JTextField txt_window = new JTextField();

    String calculateText;

    public SimpleCalculatorFrame()
    {
        // creates the JFrame with the given name
        super("Simple Calculator by Milan Saju Samuel");

        // Sets the close button to exit the program
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // gets the frames insets
        Insets frameInsets = getInsets();

        // sets the frame's size
        setSize(315, 400);

        calculateText = "";

        txt_window.setBounds(10,10,290,75);
        txt_window.setEditable(false);

        txt_window.setHorizontalAlignment(JTextField.TRAILING);

        decimalButton.setBounds(70,95,50,50);
        decimalButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                decimal();
            }
        });

        plusOrMinusButton.setBounds(130,95,50,50);
        plusOrMinusButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                plusOrMinus();
            }
        });

        clearButton.setBounds(190,95,50,50);
        clearButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                clear();
            }
        });

        addButton.setBounds(250,95,50,50);
        addButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                add();
            }
        });

        subtractButton.setBounds(250,155,50,50);
        subtractButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                subtract();
            }
        });

        multiplyButton.setBounds(250,215,50,50);
        multiplyButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                multiply();
            }
        });

        divideButton.setBounds(250,275,50,50);
        divideButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                divide();
            }
        });

        equalsButton.setBounds(10,335,290,25);
        equalsButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                myEquals();
            }
        });

        digitOneButton.setBounds(10,155,50,50);
        digitOneButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                one();
            }
        });

        digitTwoButton.setBounds(70,155,50,50);
        digitTwoButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                two();
            }
        });

        digitThreeButton.setBounds(130,155,50,50);
        digitThreeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                three();
            }
        });

        digitFourButton.setBounds(10,215,50,50);
        digitFourButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                four();
            }
        });

        digitFiveButton.setBounds(70,215,50,50);
        digitFiveButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                five();
            }
        });

        digitSixButton.setBounds(130,215,50,50);
        digitSixButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                six();
            }
        });

        digitSevenButton.setBounds(10,275,50,50);
        digitSevenButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                seven();
            }
        });

        digitEightButton.setBounds(70,275,50,50);
        digitEightButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                eight();
            }
        });

        digitNineButton.setBounds(130,275,50,50);
        digitNineButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                nine();
            }
        });

        digitZeroButton.setBounds(190,155,50,170);
        digitZeroButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                zero();
            }
        });

        // turns off the layout options
        setLayout(null);

        setResizable(false);
        add(txt_window);
        add(decimalButton);
        add(plusOrMinusButton);
        add(clearButton);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(equalsButton);
        add(digitOneButton);
        add(digitTwoButton);
        add(digitThreeButton);
        add(digitFourButton);
        add(digitFiveButton);
        add(digitSixButton);
        add(digitSevenButton);
        add(digitEightButton);
        add(digitNineButton);
        add(digitZeroButton);

        // shows the frame
        setVisible(true);
    }

    public void decimal()
    {
        String broken1 = "";
        String broken2 = "";

        if(calculateText.isEmpty())
            calculateText += "0.";
        else if(!(calculateText.endsWith(".")) && !(calculateText.endsWith(" + "))  && !(calculateText.endsWith(" - "))  && !(calculateText.endsWith(" * "))  && !(calculateText.endsWith(" / ")))
        {
            if(calculateText.contains(" + "))
            {
                for(int i = 0; i < calculateText.length(); i++)
                {
                    if(calculateText.charAt(i) == '+')
                    {
                        broken1 = calculateText.substring(0,i-1);
                        broken2 = calculateText.substring(i+2);
                    }
                }

                if(!(broken2.contains(".")))
                    calculateText += ".";
            }
            if(calculateText.contains(" - "))
            {
                for(int i = 0; i < calculateText.length(); i++)
                {
                    if(calculateText.charAt(i) == '-' && i != 0)
                    {
                        broken1 = calculateText.substring(0,i-1);
                        broken2 = calculateText.substring(i+2);
                    }
                }

                if(!(broken2.contains(".")))
                    calculateText += ".";
            }
            if(calculateText.contains(" * "))
            {
                for(int i = 0; i < calculateText.length(); i++)
                {
                    if(calculateText.charAt(i) == '*')
                    {
                        broken1 = calculateText.substring(0,i-1);
                        broken2 = calculateText.substring(i+2);
                    }
                }

                if(!(broken2.contains(".")))
                    calculateText += ".";
            }
            if(calculateText.contains(" / "))
            {
                for(int i = 0; i < calculateText.length(); i++)
                {
                    if(calculateText.charAt(i) == '/')
                    {
                        broken1 = calculateText.substring(0,i-1);
                        broken2 = calculateText.substring(i+2);
                    }
                }

                if(!(broken2.contains(".")))
                    calculateText += ".";
            }
            if(!(calculateText.isEmpty()) && !(calculateText.contains(" + ")) && !(calculateText.contains(" - ")) && !(calculateText.contains(" * ")) && !(calculateText.contains(" / ")))
            {
                if(!(calculateText.contains(".")))
                    calculateText += ".";
            }
        }

        txt_window.setText(calculateText);
    }
    public void plusOrMinus()
    {
        String broken1 = "";
        String broken2 = "";

        if(!(calculateText.isEmpty()))
        {
            if(calculateText.contains(" + "))
            {
                for(int i = 0; i < calculateText.length(); i++)
                {
                    if(calculateText.charAt(i) == '+')
                    {
                        broken1 = calculateText.substring(0,i-1);
                        broken2 = calculateText.substring(i+2);

                        if(broken2.charAt(0) != '-')
                            broken2 = "-" + broken2;
                        else if(broken2.charAt(0) == '-')
                            broken2 = broken2.substring(1);
                    }
                }

                calculateText = broken1 + " + " + broken2;
            }
            else if(calculateText.contains(" - "))
            {
                for(int i = 0; i < calculateText.length(); i++)
                {
                    if(calculateText.charAt(i) == '-' && i != 0)
                    {
                        broken1 = calculateText.substring(0,i-1);
                        broken2 = calculateText.substring(i+2);

                        if(broken2.charAt(0) != '-')
                            broken2 = "-" + broken2;
                        else if(broken2.charAt(0) == '-')
                            broken2 = broken2.substring(1);
                    }
                }

                calculateText = broken1 + " - " + broken2;
            }
            else if(calculateText.contains(" * "))
            {
                for(int i = 0; i < calculateText.length(); i++)
                {
                    if(calculateText.charAt(i) == '*')
                    {
                        broken1 = calculateText.substring(0,i-1);
                        broken2 = calculateText.substring(i+2);

                        if(broken2.charAt(0) != '-')
                            broken2 = "-" + broken2;
                        else if(broken2.charAt(0) == '-')
                            broken2 = broken2.substring(1);
                    }
                }

                calculateText = broken1 + " * " + broken2;
            }
            else if(calculateText.contains(" / "))
            {
                for(int i = 0; i < calculateText.length(); i++)
                {
                    if(calculateText.charAt(i) == '/')
                    {
                        broken1 = calculateText.substring(0,i-1);
                        broken2 = calculateText.substring(i+2);

                        if(broken2.charAt(0) != '-')
                            broken2 = "-" + broken2;
                        else if(broken2.charAt(0) == '-')
                            broken2 = broken2.substring(1);
                    }
                }

                calculateText = broken1 + " / " + broken2;
            }
            else
            {
                if(calculateText.startsWith("-"))
                    calculateText = calculateText.substring(1);
                else
                    calculateText = "-" + calculateText;
            }
        }
        txt_window.setText(calculateText);
    }
    public void clear()
    {
        calculateText = "";
        txt_window.setText(calculateText);
    }
    public void add()
    {
        if(!(calculateText.isEmpty()) && !(calculateText.contains(" + ")) && !(calculateText.contains(" - ")) && !(calculateText.contains(" * ")) && !(calculateText.contains(" / ")))
        {
            calculateText += " + ";
        }
        else
        {
            myEquals();
            calculateText += " + ";
        }

        txt_window.setText(calculateText);
    }
    public void subtract()
    {
        if(!(calculateText.isEmpty()) && !(calculateText.contains(" - ")) &&  !(calculateText.contains(" + ")) && !(calculateText.contains(" * ")) && !(calculateText.contains(" / ")))
        {
            calculateText += " - ";
        }
        else
        {
            myEquals();
            calculateText += " - ";
        }

        txt_window.setText(calculateText);
    }
    public void multiply()
    {
        if(!(calculateText.isEmpty()) && !(calculateText.contains(" * ")) &&  !(calculateText.contains(" + ")) && !(calculateText.contains(" - ")) && !(calculateText.contains(" / ")))
        {
            calculateText += " * ";
        }
        else
        {
            myEquals();
            calculateText += " * ";
        }

        txt_window.setText(calculateText);
    }
    public void divide()
    {
        if(!(calculateText.isEmpty()) && !(calculateText.contains(" / ")) &&  !(calculateText.contains(" + ")) && !(calculateText.contains(" - ")) && !(calculateText.contains(" * ")))
        {
            calculateText += " / ";
        }
        else
        {
            myEquals();
            calculateText += " / ";
        }

        txt_window.setText(calculateText);
    }
    public void myEquals()
    {
        if(calculateText.contains(" * ") && !(calculateText.endsWith(" * ")))
            myEquals(MULTIPLY);
        if(calculateText.contains(" / ") && !(calculateText.endsWith(" / ")))
            myEquals(DIVIDE);
        if(calculateText.contains(" + ") && !(calculateText.endsWith(" + ")))
            myEquals(ADD);
        if(calculateText.contains(" - ") && !(calculateText.endsWith(" - ")))
            myEquals(SUBTRACT);
    }
    public void myEquals(int operation)
    {
        double answer = 0;

        String broken1 = "";
        String broken2 = "";

        if(operation == MULTIPLY)
        {
            for(int i = 0; i < calculateText.length(); i++)
            {
                if(calculateText.charAt(i) == '*')
                {
                    broken1 = calculateText.substring(0,i-1);
                    broken2 = calculateText.substring(i+2);
                }
            }

            answer = (Double.parseDouble(broken1))*(Double.parseDouble(broken2));
        }
        else if(operation == DIVIDE)
        {
            for(int i = 0; i < calculateText.length(); i++)
            {
                if(calculateText.charAt(i) == '/')
                {
                    broken1 = calculateText.substring(0,i-1);
                    broken2 = calculateText.substring(i+2);
                }
            }

            answer = (Double.parseDouble(broken1))/(Double.parseDouble(broken2));
        }
        else if(operation == ADD)
        {
            for(int i = 0; i < calculateText.length(); i++)
            {
                if(calculateText.charAt(i) == '+')
                {
                    broken1 = calculateText.substring(0,i-1);
                    broken2 = calculateText.substring(i+2);
                }
            }

            answer = (Double.parseDouble(broken1))+(Double.parseDouble(broken2));

        }
        else if(operation == SUBTRACT)
        {
            for(int i = 0; i < calculateText.length(); i++)
            {
                if(calculateText.charAt(i) == '-' && i != 0)
                {
                    broken1 = calculateText.substring(0,i-1);
                    broken2 = calculateText.substring(i+2);
                }
            }

            answer = (Double.parseDouble(broken1))-(Double.parseDouble(broken2));
        }

        calculateText = "" + answer;
        txt_window.setText(calculateText);
    }
    public void one()
    {
        calculateText += "1";
        txt_window.setText(calculateText);
    }
    public void two()
    {
        calculateText += "2";
        txt_window.setText(calculateText);
    }
    public void three()
    {
         calculateText += "3";
        txt_window.setText(calculateText);
    }
    public void four()
    {
        calculateText += "4";
        txt_window.setText(calculateText);
    }
    public void five()
    {
        calculateText += "5";
        txt_window.setText(calculateText);
    }
    public void six()
    {
        calculateText += "6";
        txt_window.setText(calculateText);
    }
    public void seven()
    {
        calculateText += "7";
        txt_window.setText(calculateText);
    }
    public void eight()
    {
        calculateText += "8";
        txt_window.setText(calculateText);
    }
    public void nine()
    {
        calculateText += "9";
        txt_window.setText(calculateText);
    }
    public void zero()
    {
        calculateText += "0";
        txt_window.setText(calculateText);
    }
}