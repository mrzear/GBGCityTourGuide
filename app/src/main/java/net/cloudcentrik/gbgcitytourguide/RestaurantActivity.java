package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_new);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        // Toolbar
        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("Restaurant");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        topToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        // Halal restaurant button
        final Button button = (Button) findViewById(R.id.btn_halal_restaurant);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(RestaurantActivity.this, HalalRestaurantActivity.class);
                startActivity(intent);


            }
        });

        // Fast food button
        final Button buttonFastFood = (Button) findViewById(R.id.btn_fast_food);
        buttonFastFood.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(RestaurantActivity.this, FastFoodActivity.class);
                startActivity(intent);


            }
        });

        // Fine dyning button
        final Button buttonFineDyning = (Button) findViewById(R.id.btn_fine_dining);
        buttonFineDyning.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(RestaurantActivity.this, FineDyningResturentActivity.class);
                startActivity(intent);


            }
        });

        // cofee shop button
        final Button buttonCofeeShop = (Button) findViewById(R.id.btn_cofee_shop);
        buttonCofeeShop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(RestaurantActivity.this, CofeeShopActivity.class);
                startActivity(intent);

            }
        });

        // pub
        final Button buttonPub = (Button) findViewById(R.id.btn_pub);
        buttonPub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(RestaurantActivity.this, PubActivity.class);
                startActivity(intent);

            }
        });

        // nightclub
        final Button buttonNightclub = (Button) findViewById(R.id.btn_night_club);
        buttonNightclub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(RestaurantActivity.this, NightClubActivity.class);
                startActivity(intent);

            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_infocenter:
                Intent infoCenter = new Intent(this,InfoCenterActivity.class);
                startActivity(infoCenter);
                return true;
            case R.id.action_hotel:
                Intent hotel = new Intent(this,HotelActivity.class);
                startActivity( hotel);
                return true;
            case R.id.action_restuarent:
                Intent restaurant = new Intent(this,FineDyningResturentActivity.class);
                startActivity(restaurant);
                return true;
            case R.id.action_tourist_spots:
                Intent touristSpot = new Intent(this,TouristSpotsActivity.class);
                startActivity(touristSpot);
                return true;

            case R.id.action_travelinfo:
                Intent travelInfo = new Intent(this,TravelInfoActivity.class);
                startActivity(travelInfo);
                return true;
            case R.id.action_shoping_center:
                Intent shopingCenter = new Intent(this,ShoppingCentreActivity.class);
                startActivity(shopingCenter);
                return true;
            case R.id.action_home:
                Intent mainScreen = new Intent(this,MainActivity.class);
                startActivity(mainScreen);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
