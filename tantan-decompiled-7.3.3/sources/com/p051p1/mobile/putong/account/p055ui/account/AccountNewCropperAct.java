package com.p051p1.mobile.putong.account.p055ui.account;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.cropiwa.CropperAct;
import p153l.C18040ju;
import p153l.C18259ku;
import p153l.h9n;

/* JADX INFO: loaded from: classes9.dex */
public class AccountNewCropperAct extends CropperAct {

    /* JADX INFO: renamed from: e */
    public C18040ju f17066e;

    /* JADX INFO: renamed from: f */
    public C18259ku f17067f;

    /* JADX INFO: renamed from: F1 */
    public static Intent m29381F1(Act act, String str) {
        return m29382G1(act, str, false);
    }

    /* JADX INFO: renamed from: G1 */
    public static Intent m29382G1(Act act, String str, boolean z) {
        Intent intent = new Intent(act, (Class<?>) AccountNewCropperAct.class);
        intent.putExtra("image_uri", str);
        intent.putExtra("crop_new_profile_picture", z);
        intent.putExtra("crop_new_43_picture", z ? h9n.m134081c() : false);
        return intent;
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropperAct
    /* JADX INFO: renamed from: E1 */
    public void mo22055E1() {
        this.f17066e.m146965f0();
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropperAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f17066e = new C18040ju(this);
        C18259ku c18259ku = new C18259ku(this);
        this.f17067f = c18259ku;
        this.f17066e.mo52715C(c18259ku);
        this.f17066e.m146967h0();
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropperAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17066e.m146968i0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.f17066e.m146970k0();
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropperAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f17066e.m146966g0(Act.SWIPE_BACK_SUPPORTED);
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropperAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
        this.f17067f.m151413c();
    }
}
