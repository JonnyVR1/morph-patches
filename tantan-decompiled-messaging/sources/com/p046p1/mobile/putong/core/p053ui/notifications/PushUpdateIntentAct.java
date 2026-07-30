package com.p046p1.mobile.putong.core.p053ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import p149l.j760;
import p149l.vuw;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class PushUpdateIntentAct extends AppCompatActivity {
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intentM200137c = vuw.m200137c(this);
        if (intentM200137c != null) {
            startActivity(intentM200137c);
        }
        j760 j760VarM200311Y = vwb.m200311Y("current_version", "7.2.7");
        StringBuilder sb = new StringBuilder("");
        sb.append(intentM200137c != null);
        zvf0.m220399u("e_push_update_guidence", "", j760VarM200311Y, vwb.m200311Y("has_market_state", sb.toString()));
        finish();
    }
}
