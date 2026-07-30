package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile;

import android.os.Bundle;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import p149l.d2f0;
import p149l.rzb0;
import p149l.x1f0;

/* JADX INFO: loaded from: classes11.dex */
public class SidesSlipActivity extends PutongMvpAct<x1f0, d2f0> {
    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public x1f0 mo28672V1() {
        return new x1f0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public d2f0 mo28673X1() {
        return new d2f0(this);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        int i = rzb0.f161635g;
        overridePendingTransition(i, i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((d2f0) this.f17173d).m109741l();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return OMSDialogPositon.p_navigation_view;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }
}
