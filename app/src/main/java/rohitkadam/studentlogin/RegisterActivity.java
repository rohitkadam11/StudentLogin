package rohitkadam.studentlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    EditText editTextName,editTextPassword,editTextRollNo,editTextEmail;
    Button buttonSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editTextEmail=findViewById(R.id.editTextEmail);
        editTextName=findViewById(R.id.editTextName);
        editTextPassword=findViewById(R.id.editTextUserPassword);
        editTextRollNo=findViewById(R.id.editTextRollNo);
    }
}
