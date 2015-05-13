package net.npaka.shootinggame;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

//シューティングゲーム
public class ShootingGame extends Activity {
    //アクティビティ起動時に呼ばれる
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().clearFlags(
            WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(new ShootingView(this));
    }
}