package haque.sehmim.simplecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String outputString = "";
    String outputStringTwo = "";
    String arth = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void displayThis(int id, String newContent){
        View view = findViewById(id);
        TextView textview = (TextView) view;
        textview.setText(newContent);
    }
    private String getInput(int id){
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    public void displayOne(View view){
        outputString += "1";
        displayThis(R.id.display, outputString);
    }
    public void displayTwo(View view){
        outputString += "2";
        displayThis(R.id.display, outputString);
    }
    public void displayThree(View view){
        outputString += "3";
        displayThis(R.id.display, outputString);
    }
    public void displayFour(View view){
        outputString += "4";
        displayThis(R.id.display, outputString);
    }
    public void displayFive(View view){
        outputString += "5";
        displayThis(R.id.display, outputString);
    }
    public void displaySix(View view){
        outputString += "6";
        displayThis(R.id.display, outputString);
    }
    public void displaySeven(View view){
        outputString += "7";
        displayThis(R.id.display, outputString);
    }
    public void displayEight(View view){
        outputString += "8";
        displayThis(R.id.display, outputString);
    }
    public void displayNine(View view){
        outputString += "9";
        displayThis(R.id.display, outputString);
    }
    public void displayZero(View view){
        outputString += "0";
        displayThis(R.id.display, outputString);
    }
    public void displayDeci(View view){
        outputString += ".";
        displayThis(R.id.display, outputString);
    }
    public void add(View view){
        arth += "+";
        outputStringTwo = outputString;
        outputString = "";
    }
    public void subtract(View view){
        arth += "-";
        outputStringTwo = outputString;
        outputString = "";
    }
    public void muliply(View view){
        arth += "*";
        outputStringTwo = outputString;
        outputString = "";
    }
    public void divide(View view){
        arth += "/";
        outputStringTwo = outputString;
        outputString = "";
    }

    public void calc(View view){
        if (arth.equals("+")){
            double a = Double.parseDouble(outputStringTwo) + Double.parseDouble(outputString);
            displayThis(R.id.display, String.valueOf(a));
        }
        else if(arth.equals("-")){
            double a = Double.parseDouble(outputStringTwo) - Double.parseDouble(outputString);
            displayThis(R.id.display, String.valueOf(a));
        }
        else if(arth.equals("*")){
            double a = Double.parseDouble(outputStringTwo) * Double.parseDouble(outputString);
            displayThis(R.id.display, String.valueOf(a));
        }
        else if(arth.equals("/")){
            double a = Double.parseDouble(outputStringTwo) / Double.parseDouble(outputString);
            displayThis(R.id.display, String.valueOf(a));
        }
    }

    public void clear(View view){
        outputString = "";
        outputStringTwo = "";
        arth = "";
        displayThis(R.id.display, "");
    }


}
