package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile;

import android.os.Bundle;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import p153l.eaf0;
import p153l.kaf0;
import p153l.x7c0;

/* JADX INFO: loaded from: classes11.dex */
public class SidesSlipActivity extends PutongMvpAct<eaf0, kaf0> {
    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public eaf0 mo29671X1() {
        return new eaf0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public kaf0 mo29672Y1() {
        return new kaf0(this);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        int i = x7c0.f192692g;
        overridePendingTransition(i, i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((kaf0) this.f17892d).m148960l();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return OMSDialogPositon.p_navigation_view;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }
}
