package com.tantanapp.beatles.safety.component;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tantanapp.beatles.safety.core.AbsSafetyPolicy;
import p149l.psd;

/* JADX INFO: loaded from: classes13.dex */
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
        psd.m171132c();
        if (absSafetyPolicy != null) {
            absSafetyPolicy.process(this, this);
        } else {
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        psd.m171133d();
        super.onDestroy();
    }
}
