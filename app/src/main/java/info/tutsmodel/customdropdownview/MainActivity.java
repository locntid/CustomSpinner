package info.tutsmodel.customdropdownview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Eating> eatingList = new ArrayList<>();

        Eating e1 = new Eating();
        e1.name = "Bánh Quy";
        e1.image = R.drawable.banh_quy;

        Eating e2 = new Eating();
        e2.name = "Bông Lan";
        e2.image = R.drawable.bong_lan;

        Eating e3 = new Eating();
        e3.name = "Hamburger";
        e3.image = R.drawable.burger;

        eatingList.add(e1);
        eatingList.add(e2);
        eatingList.add(e3);

        SpinnerAdapter adapter = new SpinnerAdapter(this,eatingList);
        Spinner spn = (Spinner) findViewById(R.id.spinner);
        spn.setAdapter(adapter);


    }
}
