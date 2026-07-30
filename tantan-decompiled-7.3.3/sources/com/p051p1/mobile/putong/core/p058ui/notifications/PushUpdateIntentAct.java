package com.p051p1.mobile.putong.core.p058ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import p153l.i4g0;
import p153l.jyb;
import p153l.pf60;
import p153l.uxw;

/* JADX INFO: loaded from: classes4.dex */
public class PushUpdateIntentAct extends AppCompatActivity {
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intentM198547c = uxw.m198547c(this);
        if (intentM198547c != null) {
            startActivity(intentM198547c);
        }
        pf60 pf60VarM147494Y = jyb.m147494Y("current_version", "7.3.3");
        StringBuilder sb = new StringBuilder("");
        sb.append(intentM198547c != null);
        i4g0.m138523u("e_push_update_guidence", "", pf60VarM147494Y, jyb.m147494Y("has_market_state", sb.toString()));
        finish();
    }
}
