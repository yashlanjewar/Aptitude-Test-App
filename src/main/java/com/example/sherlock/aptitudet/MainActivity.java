package com.example.sherlock.aptitudet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {
    private int flag=0,flag1=0,flag2=0,flag3=0,flag4=0;
    private int count1=0,count2=0,count3=0,count4=0,count5=0;
    private int sum=0;
    private String a[]=new String[6];
    private String a1[]=new String[6];
    private String a2[]=new String[6];
    private String a3[]=new String[6];
    private String a4[]=new String[6];

    ArrayList<String[]> alist=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup rg1=findViewById(R.id.Que1);
        RadioButton rb1q1=findViewById(R.id.q1o1);
        RadioButton rb2q1=findViewById(R.id.q1o2);
        RadioButton rb3q1=findViewById(R.id.q1o3);
        RadioButton rb4q1=findViewById(R.id.q1o4);

        RadioGroup rg2=findViewById(R.id.Que2);
        RadioButton rb1q2=findViewById(R.id.q2o1);
        RadioButton rb2q2=findViewById(R.id.q2o2);
        RadioButton rb3q2=findViewById(R.id.q2o3);
        RadioButton rb4q2=findViewById(R.id.q2o4);

        RadioGroup rg3=findViewById(R.id.Que3);
        RadioButton rb1q3=findViewById(R.id.q3o1);
        RadioButton rb2q3=findViewById(R.id.q3o2);
        RadioButton rb3q3=findViewById(R.id.q3o3);
        RadioButton rb4q3=findViewById(R.id.q3o4);

        RadioGroup rg4=findViewById(R.id.Que4);
        RadioButton rb1q4=findViewById(R.id.q4o1);
        RadioButton rb2q4=findViewById(R.id.q4o2);
        RadioButton rb3q4=findViewById(R.id.q4o3);
        RadioButton rb4q4=findViewById(R.id.q4o4);

        RadioGroup rg5=findViewById(R.id.Que5);
        RadioButton rb1q5=findViewById(R.id.q5o1);
        RadioButton rb2q5=findViewById(R.id.q5o2);
        RadioButton rb3q5=findViewById(R.id.q5o3);
        RadioButton rb4q5=findViewById(R.id.q5o4);

        TextView text1=findViewById(R.id.text1);
        TextView text2=findViewById(R.id.text2);
        TextView text3=findViewById(R.id.text3);
        TextView text4=findViewById(R.id.text4);
        TextView text5=findViewById(R.id.text5);

        getString(a,text1,rb1q1,rb2q1,rb3q1,rb4q1);
        alist.add(a);

        getString(a1,text2,rb1q2,rb2q2,rb3q2,rb4q2);
        alist.add(a1);

        getString(a2,text3,rb1q3,rb2q3,rb3q3,rb4q3);
        alist.add(a2);

        getString(a3,text4,rb1q4,rb2q4,rb3q4,rb4q4);
        alist.add(a3);

        getString(a4,text5,rb1q5,rb2q5,rb3q5,rb4q5);
        alist.add(a4);

        Collections.shuffle(alist);
        a= alist.get(0);
        a1= alist.get(1);
        a2= alist.get(2);
        a3= alist.get(3);
        a4= alist.get(4);

        showText(a,text1,rb1q1,rb2q1,rb3q1,rb4q1);
        showText(a1,text2,rb1q2,rb2q2,rb3q2,rb4q2);
        showText(a2,text3,rb1q3,rb2q3,rb3q3,rb4q3);
        showText(a3,text4,rb1q4,rb2q4,rb3q4,rb4q4);
        showText(a4,text5,rb1q5,rb2q5,rb3q5,rb4q5);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton r=findViewById(i);
                String s=r.getText().toString();
                if(s.equals("55")&&flag==0) {
                    count1=1;
                    flag=1;
                }else if(s.toString().equals("51")&&flag==0) {
                    count1=1;
                    flag=1;
                }else if(s.equals("16")&&flag==0) {
                    count1=1;
                    flag=1;
                }else if(s.equals("26")&&flag==0) {
                    count1=1;
                    flag=1;
                }else if(s.equals("1")&&flag==0) {
                    count1=1;
                    flag=1;
                }else
                    count1=0;
            }
        });
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton r=findViewById(i);
                String s=r.getText().toString();
                if(s.equals("55")&&flag1==0) {
                    count2=1;
                    flag1=1;
                }else if(s.equals("51")&&flag1==0) {
                    count2=1;
                    flag1=1;
                }else if(s.equals("16")&&flag1==0) {
                    count2=1;
                    flag1=1;
                }else if(s.equals("26")&&flag1==0) {
                    count2=1;
                    flag1=1;
                }else if(s.equals("1")&&flag1==0) {
                    count2=1;
                    flag1=1;
                }else
                    count2=0;
            }
        });
        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton r=findViewById(i);
                String s=r.getText().toString();
                if(s.equals("55")&&flag2==0) {
                    count3=1;
                    flag2=1;
                }else if(s.equals("51")&&flag2==0) {
                    count3=1;
                    flag2=1;
                }else if(s.equals("16")&&flag2==0) {
                    count3=1;
                    flag2=1;
                }else if(s.equals("26")&&flag2==0) {
                    count3=1;
                    flag2=1;
                }else if(s.equals("1")&&flag2==0) {
                    count3=1;
                    flag2=1;
                }else
                    count3=0;
            }
        });
        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton r=findViewById(i);
                String s=r.getText().toString();
                if(s.equals("55")&&flag3==0) {
                    count4=1;
                    flag3=1;
                }else if(s.equals("51")&&flag3==0) {
                    count4=1;
                    flag3=1;
                }else if(s.equals("16")&&flag3==0) {
                    count4=1;
                    flag3=1;
                }else if(s.equals("26")&&flag3==0) {
                    count4=1;
                    flag3=1;
                }else if(s.equals("1")&&flag3==0) {
                    count4=1;
                    flag3=1;
                }else
                    count4=0;
            }
        });
        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton r=findViewById(i);
                String s=r.getText().toString();
                if(s.equals("55")&&flag4==0) {
                    count5=1;
                    flag4=1;
                }else if(s.equals("51")&&flag4==0) {
                    count5=1;
                    flag4=1;
                }else if(s.equals("16")&&flag4==0) {
                    count5=1;
                    flag4=1;
                }else if(s.equals("26")&&flag4==0) {
                    count5=1;
                    flag4=1;
                }else if(s.equals("1")&&flag4==0) {
                    count5=1;
                    flag4=1;
                }else
                    count5=0;
            }
        });
        Button sub=findViewById(R.id.submit);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(getApplicationContext(),Main2Activity.class);
                sum=count1+count2+count3+count4+count5;
                Toast.makeText(getApplicationContext(),"Result : "+sum,Toast.LENGTH_LONG).show();
                it.putExtra("Result",sum);
                startActivity(it);
            }
        });
    }
    public void getString(String[] a,TextView text,RadioButton rb1,RadioButton rb2,RadioButton rb3,RadioButton rb4){
        a[0]=text.getText().toString();
        a[1]=rb1.getText().toString();
        a[2]=rb2.getText().toString();
        a[3]=rb3.getText().toString();
        a[4]=rb4.getText().toString();
    }
    public void showText(String[] a,TextView text,RadioButton rb1,RadioButton rb2,RadioButton rb3,RadioButton rb4){
        text.setText(a[0]);
        rb1.setText(a[1]);
        rb2.setText(a[2]);
        rb3.setText(a[3]);
        rb4.setText(a[4]);
    }

}



