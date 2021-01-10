package cn.a2dc.app;

import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_test);
        /*获取焦点*/
        EditText etName = findViewById(R.id.etName);
        etName.requestFocus();
        //获取第二个文字
        etName.setSelection(2);
    }
}