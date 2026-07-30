package com.p051p1.mobile.putong.safety;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import p153l.azk0;

/* JADX INFO: loaded from: classes10.dex */
public class CrashTestActivity extends AppCompatActivity {
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        setContentView(new View(this));
        if (RemoteConfig.m80481x().m80518y("activity_crash_test") != 1) {
            return;
        }
        azk0.m101074a("onCreate Crash!");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (RemoteConfig.m80481x().m80518y("activity_crash_test") != 5) {
            return;
        }
        azk0.m101074a("onDestroy Crash!");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (RemoteConfig.m80481x().m80518y("activity_crash_test") != 4) {
            return;
        }
        azk0.m101074a("onPause Crash!");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (RemoteConfig.m80481x().m80518y("activity_crash_test") != 3) {
            return;
        }
        azk0.m101074a("onResume Crash!");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (RemoteConfig.m80481x().m80518y("activity_crash_test") != 2) {
            return;
        }
        azk0.m101074a("onStart Crash!");
    }
}
