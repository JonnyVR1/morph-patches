package com.p000p1.mobile.putong.core.p001ui.messages.meme;

import android.os.Bundle;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import l.szb0;
import p003l.k0a;
import p003l.t0a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CoreMyCustomMemeAct extends PutongCoreMvpAct<k0a, t0a> {
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public k0a m2362X1() {
        return new k0a(this);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public t0a m2363Y1() {
        return new t0a(this);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        overridePendingTransition(0, szb0.g);
    }

    public void onBackPressed() {
        if (((t0a) ((PutongCoreMvpAct) this).e).m7678o()) {
            return;
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public String pageId() {
        return "p_stickers_list";
    }

    public void preCreateView(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }

    public void setTheme() {
        super/*com.p1.mobile.putong.app.PutongAct*/.setTheme();
    }
}
