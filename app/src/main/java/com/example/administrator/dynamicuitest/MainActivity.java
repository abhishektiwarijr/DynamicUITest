package com.example.administrator.dynamicuitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_item);
        final LinearLayout lm = (LinearLayout) findViewById(R.id.linearMain);

        // create the layout params that will be used to define how your
        // view element will be displayed
        LinearLayout.LayoutParams paramsWrap = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams paramsMatch = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout.LayoutParams paramsMatchWrap = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams paramsWrapMatch = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT);


        LinearLayout ll1 = createLinearLayout(paramsMatchWrap);
        paramsMatchWrap.setMargins(0, 30, 0, 0);
        ll1.setOrientation(LinearLayout.HORIZONTAL);
        ll1.setBaselineAligned(true);
        ll1.setWeightSum(1);

        LinearLayout ll1A = createLinearLayout(paramsMatchWrap);
        paramsMatchWrap.weight = 0.5f;
        ll1A.setGravity(Gravity.CENTER);

        Button b1 = createButton(paramsWrap);
        b1.setText("Button 1");
        ll1A.addView(b1);

        LinearLayout ll1B = createLinearLayout(paramsMatchWrap);
        paramsMatchWrap.weight = 0.5f;
        ll1B.setGravity(Gravity.CENTER);

        Button b2 = createButton(paramsWrap);
        b2.setText("Button 2");
        ll1B.addView(b2);
        ll1.addView(ll1A,0);
        ll1.addView(ll1B,1);
        lm.addView(ll1,0);

        LinearLayout ll2 = createLinearLayout(paramsMatchWrap);
        paramsMatchWrap.setMargins(0, 30, 0, 0);
        ll2.setGravity(Gravity.CENTER);
        Button b3 = createButton(paramsWrap);
        b3.setText("Button 3");
        ll2.addView(b3);
        lm.addView(ll2,1);

        LinearLayout ll3 = createLinearLayout(paramsMatchWrap);
        paramsMatchWrap.setMargins(0, 30, 0, 0);
        ll3.setGravity(Gravity.CENTER);
        EditText et1 = createEditText(paramsWrap);
        et1.setHint("Your Text Goes Here...");
        ll3.addView(et1);
        lm.addView(ll3,2);

        LinearLayout ll4 = createLinearLayout(paramsMatchWrap);
        paramsMatchWrap.setMargins(0, 30, 0, 0);
        ll4.setGravity(Gravity.CENTER);
        Button b4 = createButton(paramsWrap);
        b4.setText("Submit");
        ll4.addView(b4);
        lm.addView(ll4,3);
    }

    private EditText createEditText(LinearLayout.LayoutParams params) {
        EditText et_1=new EditText(this);
        et_1.setLayoutParams(params);
        return et_1;
    }


    private void createRelativeLayout() {
        RelativeLayout rl = new RelativeLayout(this);
        rl.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
    }
    private LinearLayout createLinearLayout(LinearLayout.LayoutParams params){
        LinearLayout ll=new LinearLayout(this);
        ll.setLayoutParams(params);
        return ll;
    }
    private Button createButton(LinearLayout.LayoutParams params) {
        Button btn_1=new Button(this);
        btn_1.setLayoutParams(params);
        return btn_1;
    }
}

//************************ Dummy Dead Code **********************
//Create four
        /*for(int j=0;j<=4;j++)
        {
            // Create LinearLayout
            LinearLayout ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.HORIZONTAL);

            *//**//*//**//*//* Create TextView
            TextView product = new TextView(this);
            product.setText(" Product"+j+"    ");
            ll.addView(product);

            // Create TextView
            TextView price = new TextView(this);
            price.setText("  $"+j+"     ");
            ll.addView(price);*//**//*

            // Create Button
            final Button btn = new Button(this);
            // Give button an ID
            btn.setId(j+1);
            btn.setText("Add To Cart");
            // set the layoutParams on the button
            btn.setLayoutParams(paramsWrap);

            final int index = j;
            // Set click listener for button
           *//**//* btn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Log.i("TAG", "index :" + index);

                    Toast.makeText(getApplicationContext(),
                            "Clicked Button Index :" + index,
                            Toast.LENGTH_LONG).show();

                }
            });*//**//*

            //Add button to LinearLayout
            ll.addView(btn);
            //Add button to LinearLayout defined in XML
            lm.addView(ll);
        }
    }*/

