package com.p000p1.mobile.putong.account.p002ui.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.cropiwa.CropperAct;
import p006l.C1150pu;
import p006l.C1190qu;
import p006l.h7n;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountNewCropperAct extends CropperAct {

    /* JADX INFO: renamed from: e */
    public C1150pu f336e;

    /* JADX INFO: renamed from: f */
    public C1190qu f337f;

    /* JADX INFO: renamed from: E1 */
    public static Intent m277E1(Act act, String str) {
        return m278F1(act, str, false);
    }

    /* JADX INFO: renamed from: F1 */
    public static Intent m278F1(Act act, String str, boolean z) {
        Intent intent = new Intent((Context) act, (Class<?>) AccountNewCropperAct.class);
        intent.putExtra("image_uri", str);
        intent.putExtra("crop_new_profile_picture", z);
        intent.putExtra("crop_new_43_picture", z ? h7n.m16063c() : false);
        return intent;
    }

    /* JADX INFO: renamed from: C1 */
    public void m279C1() {
        this.f336e.m21708f0();
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f336e = new C1150pu(this);
        C1190qu c1190qu = new C1190qu(this);
        this.f337f = c1190qu;
        this.f336e.C(c1190qu);
        this.f336e.m21710h0();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f336e.m21711i0();
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        this.f336e.m21713k0();
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f336e.m21709g0(Act.SWIPE_BACK_SUPPORTED);
    }

    public void setTheme() {
        this.f337f.m22381c();
    }
}
