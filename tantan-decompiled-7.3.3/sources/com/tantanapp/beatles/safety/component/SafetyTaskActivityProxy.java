package com.tantanapp.beatles.safety.component;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tantanapp.beatles.safety.core.AbsSafetyPolicy;
import p153l.dud;

/* JADX INFO: loaded from: classes11.dex */
public class SafetyTaskActivityProxy extends AppCompatActivity {
    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbsSafetyPolicy absSafetyPolicy = (AbsSafetyPolicy) getIntent().getSerializableExtra("policy");
        dud.m118129c();
        if (absSafetyPolicy != null) {
            absSafetyPolicy.process(this, this);
        } else {
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        dud.m118130d();
        super.onDestroy();
    }
}
