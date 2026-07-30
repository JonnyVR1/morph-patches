package com.p000p1.mobile.putong.core.app;

import android.os.Bundle;
import com.p000p1.mobile.putong.app.PutongFrag;
import l.dbl0;
import p006l.ura;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AutoReleaseVideoFrag extends PutongFrag {
    /* JADX INFO: renamed from: M4 */
    public boolean m6900M4() {
        return ura.m25555e().m25559d().m5873vd(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onDestroy() {
        if (m6900M4()) {
            dbl0.a(getView(), true);
        }
        super.onDestroy();
    }

    public void onPause() {
        if (m6900M4()) {
            dbl0.a(getView(), false);
        }
        super.onPause();
    }
}
