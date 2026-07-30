package com.p000p1.mobile.putong.core.p001ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import l.j760;
import l.vuw;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PushUpdateIntentAct extends AppCompatActivity {
    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intentC = vuw.c(this);
        if (intentC != null) {
            startActivity(intentC);
        }
        j760 j760VarY = vwb.Y("current_version", "7.2.7");
        StringBuilder sb = new StringBuilder("");
        sb.append(intentC != null);
        zvf0.u("e_push_update_guidence", "", new j760[]{j760VarY, vwb.Y("has_market_state", sb.toString())});
        finish();
    }
}
