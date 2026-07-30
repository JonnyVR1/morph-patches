package com.p000p1.mobile.putong.core.newui.cropiwa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.cropiwa.CropperAct;
import p009l.am20;
import p009l.bm20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewCropperAct extends CropperAct {

    /* JADX INFO: renamed from: e */
    public am20 f71e;

    /* JADX INFO: renamed from: f */
    public bm20 f72f;

    /* JADX INFO: renamed from: E1 */
    public static Intent m93E1(Act act, String str) {
        return m95I1(act, str, false, false);
    }

    /* JADX INFO: renamed from: F1 */
    public static Intent m94F1(Act act, String str, boolean z) {
        return m95I1(act, str, z, false);
    }

    /* JADX INFO: renamed from: I1 */
    public static Intent m95I1(Act act, String str, boolean z, boolean z2) {
        Intent intent = new Intent((Context) act, (Class<?>) NewCropperAct.class);
        intent.putExtra("image_uri", str);
        intent.putExtra("crop_new_profile_picture", z);
        intent.putExtra("crop_new_43_picture", z);
        intent.putExtra("is_crop_live_cover", z2);
        return intent;
    }

    /* JADX INFO: renamed from: C1 */
    public void m96C1() {
        this.f71e.m11517f0();
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f71e = new am20(this);
        bm20 bm20Var = new bm20(this);
        this.f72f = bm20Var;
        this.f71e.C(bm20Var);
        this.f71e.m11519h0();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f71e.m11520i0();
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        this.f71e.m11521k0();
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f71e.m11518g0(Act.SWIPE_BACK_SUPPORTED);
    }

    public void setTheme() {
        this.f72f.m12107c();
    }
}
