package tarantino047.makeyourowntarantino.Actividades;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

import tarantino047.makeyourowntarantino.R;

public class SplashActivity extends AwesomeSplash {

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


    }*/

    @Override
    public void initSplash(ConfigSplash configSplash) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        configSplash.setBackgroundColor(R.color.blodd);
        configSplash.setAnimCircularRevealDuration(700);
        configSplash.setRevealFlagX(Flags.REVEAL_LEFT);
        configSplash.setRevealFlagX(Flags.REVEAL_BOTTOM);

        configSplash.setLogoSplash(R.drawable.principallogo);
        configSplash.setAnimLogoSplashDuration(2900);
        configSplash.setAnimLogoSplashTechnique(Techniques.DropOut);

        configSplash.setTitleSplash("");
        configSplash.setTitleTextColor(R.color.white);
        configSplash.setTitleTextSize(30f);
        configSplash.setAnimTitleDuration(300);
        configSplash.setAnimTitleTechnique(Techniques.Landing);
    }

    @Override
    public void animationsFinished() {
        startActivity(new Intent(SplashActivity.this, PeliculasPrincipales.class));
        finish();
    }
}
