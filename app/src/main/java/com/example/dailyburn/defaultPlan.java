package com.example.dailyburn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;

public class defaultPlan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_plan);

//        final String yourName = getIntent().getStringExtra("name");
//        final String gender = getIntent().getStringExtra("gender");
//        final String age = getIntent().getStringExtra("age");
//        final String weight = getIntent().getStringExtra("weight");
//        final String height = getIntent().getStringExtra("height");
//        final String allergy = getIntent().getStringExtra("allergy");
//        final String goal = getIntent().getStringExtra("goal");
//
//
//        TextView date = (TextView)findViewById(R.id.date);
//        TextView food = (TextView)findViewById(R.id.foodItem);
//        TableLayout table = (TableLayout)findViewById(R.id.tableLayout);
//        TableRow row = (TableRow)findViewById(R.id.rowItem);
//
//        final Calendar c = Calendar.getInstance();
//        int mYear = c.get(Calendar.YEAR);
//        int mMonth = c.get(Calendar.MONTH);
//        int mDay = c.get(Calendar.DAY_OF_MONTH);
//        date.setText(
//                new StringBuilder()
//                        // Month is 0 based so add 1
//                        .append(mMonth + 1).append("-")
//                        .append(mDay).append("-")
//                        .append(mYear).append(" "));
//
//
//
//       switch (goal)
//       {
//           case "Lose weight":
//               food.setText("Yogurt - 6AM\n\nTofu Salad - 1PM\n\nBeef and Veggie Salad Bowl - 8PM");
//               break;
//           case "Gain muscle":
//               food.setText("Organic milk and eggs- 6AM\n\nBrown rice - 1PM\n\nBeef and spinach - 8PM");
//               break;
//           case "Keep track of calories":
//               table.removeView(row);
//               table.setStretchAllColumns(true);
//               create(table);
//               break;
//           case "Keep track of nutrition":
//               table.removeView(row);
//               table.setStretchAllColumns(true);
//               create(table);
//               break;
//           case "Solve eating disorders":
//               food.setText("Organic milk and eggs- 6AM\n\nBrown rice - 1PM\n\nBeef and spinach - 8PM");
//               break;
//           case "Get help to solve health issues":
//               food.setText("Organic milk and eggs- 6AM\n\nBrown rice - 1PM\n\nBeef and spinach - 8PM");
//               break;
//
//       }
//
//    }
//
//    public void create(TableLayout table){
//
//        TableRow row1 = new TableRow(this);
//        TableRow row2 = new TableRow(this);
//        TableRow row3 = new TableRow(this);
//        TextView txt1 = new TextView(this);
//        TextView txt2 = new TextView(this);
//        TextView txt3 = new TextView(this);
//
//        txt1.setText("Breakfast");
//        txt2.setText("Lunch");
//        txt3.setText("Dinner");
//        EditText ed1 = new EditText(this);
//        EditText ed2 = new EditText(this);
//        EditText ed3 = new EditText(this);
//
//        row1.addView(txt1);
//        row1.addView(ed1);
//        row2.addView(txt2);
//        row2.addView(ed2);
//        row3.addView(txt3);
//        row3.addView(ed3);
//        table.addView(row1);
//        table.addView(row2);
//        table.addView(row3);
    }

}
