package dev.achmadk.simpleform;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import dev.achmadk.simpleform.data.Circle;
import dev.achmadk.simpleform.data.Cube;
import dev.achmadk.simpleform.data.ICalculateAreaShape;
import dev.achmadk.simpleform.data.Square;
import dev.achmadk.simpleform.data.SumCalculatorOutputter;
import dev.achmadk.simpleform.data.VolumeCalculator;
import dev.achmadk.simpleform.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;

    @NonNull
    private static SumCalculatorOutputter getSumCalculatorOutputter() {
        Circle circle1 = new Circle(20.0);
        Circle circle2 = new Circle(14.0);
        Square square1 = new Square(10.0);
        Square square2 = new Square(8.0);
        Cube cube1 = new Cube(20.0);
        List<ICalculateAreaShape> shapes = new ArrayList<>();
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(square1);
        shapes.add(square2);
        shapes.add(cube1);

        VolumeCalculator volumeCalculator = new VolumeCalculator(shapes);
        SumCalculatorOutputter outputter2 = new SumCalculatorOutputter(volumeCalculator);
        return outputter2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SumCalculatorOutputter outputter2 = getSumCalculatorOutputter();

        dev.achmadk.simpleform.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(view -> Snackbar.make(view, outputter2.toString(), Snackbar.LENGTH_LONG)
                .setAnchorView(R.id.fab)
                .setAction("Action", null).show());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}