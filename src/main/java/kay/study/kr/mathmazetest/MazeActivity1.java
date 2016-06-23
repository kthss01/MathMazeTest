package kay.study.kr.mathmazetest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MazeActivity1 extends AppCompatActivity {

    private boolean pathChecked = true;
    Button button;
    int pathSize = 3;
    int pathCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maze1);
    }

    public void onClickedBtn1(View v){
        pathChecked = true;
        pathCount++;
        button = (Button) findViewById(R.id.maze_btn1);
        button.setBackgroundColor(Color.GREEN);
        finishchecked();
    }

    public void onClickedBtn2(View v){
        pathChecked = true;
        pathCount++;
        button = (Button) findViewById(R.id.maze_btn2);
        button.setBackgroundColor(Color.GREEN);
        finishchecked();
    }

    // wrong path
    public void onClickedBtn3(View v){
        pathChecked = false;
        button = (Button) findViewById(R.id.maze_btn3);
        button.setBackgroundColor(Color.RED);
        Toast.makeText(getApplicationContext(), "게임 실패", Toast.LENGTH_LONG).show();
        finish();
    }

    public void onClickedBtn4(View v){
        pathChecked = true;
        pathCount++;
        button = (Button) findViewById(R.id.maze_btn4);
        button.setBackgroundColor(Color.GREEN);
        finishchecked();
    }

    public void finishchecked(){
        if(pathCount==pathSize) {
            Toast.makeText(getApplicationContext(), "게임 클리어", Toast.LENGTH_LONG).show();
            finish();
        }
    }
}
