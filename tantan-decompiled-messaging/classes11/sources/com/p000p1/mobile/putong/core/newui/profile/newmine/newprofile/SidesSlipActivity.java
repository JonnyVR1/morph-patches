package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile;

import android.os.Bundle;
import com.p1.mobile.putong.app.PutongMvpAct;
import l.rzb0;
import p009l.d2f0;
import p009l.x1f0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SidesSlipActivity extends PutongMvpAct<x1f0, d2f0> {
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public x1f0 m7582V1() {
        return new x1f0(this);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public d2f0 m7583X1() {
        return new d2f0(this);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        int i = rzb0.g;
        overridePendingTransition(i, i);
    }

    public void onBackPressed() {
        ((d2f0) ((PutongMvpAct) this).d).m12919l();
    }

    public String pageId() {
        return "p_navigation_view";
    }

    public void preCreateView(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }
}
