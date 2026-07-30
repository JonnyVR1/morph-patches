package com.p000p1.mobile.putong.safety;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CrashTestActivity extends AppCompatActivity {
    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        setContentView(new View(this));
        if (RemoteConfig.m9619x().m9656y("activity_crash_test") != 1) {
            return;
        }
        upk0.a("onCreate Crash!");
    }

    public void onDestroy() {
        super.onDestroy();
        if (RemoteConfig.m9619x().m9656y("activity_crash_test") != 5) {
            return;
        }
        upk0.a("onDestroy Crash!");
    }

    public void onPause() {
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
        if (RemoteConfig.m9619x().m9656y("activity_crash_test") != 4) {
            return;
        }
        upk0.a("onPause Crash!");
    }

    public void onResume() {
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        if (RemoteConfig.m9619x().m9656y("activity_crash_test") != 3) {
            return;
        }
        upk0.a("onResume Crash!");
    }

    public void onStart() {
        super.onStart();
        if (RemoteConfig.m9619x().m9656y("activity_crash_test") != 2) {
            return;
        }
        upk0.a("onStart Crash!");
    }
}
