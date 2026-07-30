package com.p046p1.mobile.putong.core.newui.cropiwa;

import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.cropiwa.CropperAct;
import p149l.am20;
import p149l.bm20;

/* JADX INFO: loaded from: classes11.dex */
public class NewCropperAct extends CropperAct {

    /* JADX INFO: renamed from: e */
    public am20 f21293e;

    /* JADX INFO: renamed from: f */
    public bm20 f21294f;

    /* JADX INFO: renamed from: E1 */
    public static Intent m36192E1(Act act, String str) {
        return m36194I1(act, str, false, false);
    }

    /* JADX INFO: renamed from: F1 */
    public static Intent m36193F1(Act act, String str, boolean z) {
        return m36194I1(act, str, z, false);
    }

    /* JADX INFO: renamed from: I1 */
    public static Intent m36194I1(Act act, String str, boolean z, boolean z2) {
        Intent intent = new Intent(act, (Class<?>) NewCropperAct.class);
        intent.putExtra("image_uri", str);
        intent.putExtra("crop_new_profile_picture", z);
        intent.putExtra("crop_new_43_picture", z);
        intent.putExtra("is_crop_live_cover", z2);
        return intent;
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropperAct
    /* JADX INFO: renamed from: C1 */
    public void mo21056C1() {
        this.f21293e.m97469f0();
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropperAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f21293e = new am20(this);
        bm20 bm20Var = new bm20(this);
        this.f21294f = bm20Var;
        this.f21293e.mo51532C(bm20Var);
        this.f21293e.m97471h0();
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropperAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f21293e.m97472i0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.f21293e.m97473k0();
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropperAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f21293e.m97470g0(Act.SWIPE_BACK_SUPPORTED);
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropperAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
        this.f21294f.m102571c();
    }
}
