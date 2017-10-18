import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private double result;
    private String firstNumber = "";
    private String secondNumber = "";
    private String screen = "";
    private int action;

    private JButton a1Button;
    private JPanel panel1;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton equal;
    private JButton plus;
    private JButton minus;
    private JButton a0Button;
    private JButton multiply;
    private JButton divide;
    private JButton a0Button1;
    private JLabel screenLabel;
    private JButton cButton;

    public JPanel getPanel() {
        return this.panel1;
    }

    public Calculator() {
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int first = Integer.parseInt(firstNumber);
                int second = Integer.parseInt(secondNumber);

                result = 0;

                switch (action) {
                    case 1:
                        result = first + second;
                        break;
                    case 2:
                        result = first - second;
                        break;
                    case 3:
                        result = first * second;
                        break;
                    default :
                        if (Integer.parseInt(secondNumber) != 0) {
                            result = (0.0 + first) / second;
                        } else {
                            screenLabel.setText("Dalyba iš nulio negalima");
                            return;
                        }
                        break;
                }

                screenLabel.setText("" + result);

                firstNumber = "";
                secondNumber = "";
                action = 0;
                screen = "";
            }
        });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (action == 0) {
                    firstNumber += e.getActionCommand();
                } else {
                    secondNumber += e.getActionCommand();
                }

                screen += e.getActionCommand();
                screenLabel.setText(screen);
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (action == 0) {
                    firstNumber += e.getActionCommand();
                } else {
                    secondNumber += e.getActionCommand();
                }

                screen += e.getActionCommand();
                screenLabel.setText(screen);
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (action == 0) {
                    firstNumber += e.getActionCommand();
                } else {
                    secondNumber += e.getActionCommand();
                }

                screen += e.getActionCommand();
                screenLabel.setText(screen);

            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (action == 0) {
                    firstNumber += e.getActionCommand();
                } else {
                    secondNumber += e.getActionCommand();
                }

                screen += e.getActionCommand();
                screenLabel.setText(screen);
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (action == 0) {
                    firstNumber += e.getActionCommand();
                } else {
                    secondNumber += e.getActionCommand();
                }

                screen += e.getActionCommand();
                screenLabel.setText(screen);
            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (action == 0) {
                    firstNumber += e.getActionCommand();
                } else {
                    secondNumber += e.getActionCommand();
                }

                screen += e.getActionCommand();
                screenLabel.setText(screen);
            }
        });

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (action == 0) {
                    firstNumber += e.getActionCommand();
                } else {
                    secondNumber += e.getActionCommand();
                }

                screen += e.getActionCommand();
                screenLabel.setText(screen);
            }
        });

        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (action == 0) {
                    firstNumber += e.getActionCommand();
                } else {
                    secondNumber += e.getActionCommand();
                }

                screen += e.getActionCommand();
                screenLabel.setText(screen);
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (action == 0) {
                    firstNumber += e.getActionCommand();
                } else {
                    secondNumber += e.getActionCommand();
                }

                screen += e.getActionCommand();
                screenLabel.setText(screen);
            }
        });

        a0Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (action == 0) {
                    firstNumber += e.getActionCommand();
                } else {
                    secondNumber += e.getActionCommand();
                }

                screen += e.getActionCommand();
                screenLabel.setText(screen);
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action = 1;

                if (result == 0) {
                    screen += e.getActionCommand();
                    screenLabel.setText(screen);
                } else {
                    int temp = (int) result;
                    firstNumber = "" + temp;
                    screen = result + e.getActionCommand();
                    screenLabel.setText(screen);
                }
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action = 2;
                if (result == 0) {
                    screen += e.getActionCommand();
                    screenLabel.setText(screen);
                } else {
                    int temp = (int) result;
                    firstNumber = "" + temp;
                    screen = result + e.getActionCommand();
                    screenLabel.setText(screen);
                }
            }
        });

        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action = 3;
                if (result == 0) {
                    screen += e.getActionCommand();
                    screenLabel.setText(screen);
                } else {
                    int temp = (int) result;
                    firstNumber = "" + temp;
                    screen = result + e.getActionCommand();
                    screenLabel.setText(screen);
                }
            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action = 4;
                if (result == 0) {
                    screen += e.getActionCommand();
                    screenLabel.setText(screen);
                } else {
                    int temp = (int) result;
                    firstNumber = "" + temp;
                    screen = result + e.getActionCommand();
                    screenLabel.setText(screen);
                }
            }
        });

        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = "";
                secondNumber = "";
                result = 0;
                action = 0;
                screenLabel.setText("" + 0);
                screen = "";
            }
        });


    }
}
