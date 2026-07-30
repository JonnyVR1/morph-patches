package com.p046p1.mobile.putong.account.p050ui.account;

import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.cropiwa.CropperAct;
import p149l.C19337pu;
import p149l.C19577qu;
import p149l.h7n;

/* JADX INFO: loaded from: classes9.dex */
public class AccountNewCropperAct extends CropperAct {

    /* JADX INFO: renamed from: e */
    public C19337pu f16347e;

    /* JADX INFO: renamed from: f */
    public C19577qu f16348f;

    /* JADX INFO: renamed from: E1 */
    public static Intent m28382E1(Act act, String str) {
        return m28383F1(act, str, false);
    }

    /* JADX INFO: renamed from: F1 */
    public static Intent m28383F1(Act act, String str, boolean z) {
        Intent intent = new Intent(act, (Class<?>) AccountNewCropperAct.class);
        intent.putExtra("image_uri", str);
        intent.putExtra("crop_new_profile_picture", z);
        intent.putExtra("crop_new_43_picture", z ? h7n.m129754c() : false);
        return intent;
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropperAct
    /* JADX INFO: renamed from: C1 */
    public void mo21056C1() {
        this.f16347e.m171390f0();
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropperAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f16347e = new C19337pu(this);
        C19577qu c19577qu = new C19577qu(this);
        this.f16348f = c19577qu;
        this.f16347e.mo51532C(c19577qu);
        this.f16347e.m171392h0();
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropperAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16347e.m171393i0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.f16347e.m171395k0();
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropperAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f16347e.m171391g0(Act.SWIPE_BACK_SUPPORTED);
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropperAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
        this.f16348f.m176493c();
    }
}
