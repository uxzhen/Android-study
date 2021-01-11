package cn.a2dc.app;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button btnOne,btnTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_test);
        /*获取焦点*/
        //EditText etName = findViewById(R.id.etName);
        //etName.requestFocus();
        //获取第二个文字
        //etName.setSelection(2);
        //btnOne = (Button) findViewById(R.id.btnOne);
        //btnTwo = (Button) findViewById(R.id.btnTwo);
        //btnTwo.setOnClickListener(new View.OnClickListener(){
        //    @Override
        //    public void onClick(View v){
        //        if(btnTwo.getText().toString().equals("按钮不可用")){
        //            btnOne.setEnabled(false);
        //            btnTwo.setText("按钮可用");
        //        }else{
        //            btnOne.setEnabled(true);
        //            btnTwo.setText("按钮不可用");
        //        }
        //    }
        //});
    }
}