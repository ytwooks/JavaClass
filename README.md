# JavaClass
자바 강좌관련 자료

public class MainActivity extends AppCompatActivity {

    public static Context mContext;


    public static String[] allComment = {"", "" , "", "", ""};


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView a = findViewById(R.id.idText);
        TextView b = findViewById(R.id.pwText);
        b.setText("");
        a.setText("");

        if (resultCode == 1) {
            allComment[0] = ((FatherActivity)FatherActivity.mContext).fatherSay;
        }
        if (resultCode == 2) {
            allComment[1] = ((MotherActivity)MotherActivity.mContext).motherSay;
        }
        if (resultCode == 3) {
            allComment[2] = ((FirstActivity)FirstActivity.mContext).firstSay;
        }
        if (resultCode == 4) {
            allComment[3] = ((SecondActivity)SecondActivity.mContext).secondSay;
        }
        if (resultCode == 5) {
            allComment[4] = ((ThirdActivity)ThirdActivity.mContext).thirdSay;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("My Farm");

        mContext = this;

        //**************아빠 버튼 제작*************
        Button father = findViewById(R.id.fatherButton);
        father.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText id0 = findViewById(R.id.idText);
                EditText pw0 = findViewById(R.id.pwText);

                String id = id0.getText().toString();
                String pw = pw0.getText().toString();

                if (id.equals("father") && pw.equals("1234")) {
                    Intent intent = new Intent(getApplicationContext(), FatherActivity.class);
                    startActivityForResult(intent,1);
                } else {
                    Toast.makeText(getApplicationContext(), "사용자 정보가 잘못 되었습니다.", Toast.LENGTH_LONG).show();
                }
            }
        });
