package com.p051p1.mobile.putong.core.newui.cropiwa;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.cropiwa.CropperAct;
import p153l.ku20;
import p153l.lu20;

/* JADX INFO: loaded from: classes11.dex */
public class NewCropperAct extends CropperAct {

    /* JADX INFO: renamed from: e */
    public ku20 f22035e;

    /* JADX INFO: renamed from: f */
    public lu20 f22036f;

    /* JADX INFO: renamed from: F1 */
    public static Intent m37195F1(Act act, String str) {
        return m37197J1(act, str, false, false);
    }

    /* JADX INFO: renamed from: G1 */
    public static Intent m37196G1(Act act, String str, boolean z) {
        return m37197J1(act, str, z, false);
    }

    /* JADX INFO: renamed from: J1 */
    public static Intent m37197J1(Act act, String str, boolean z, boolean z2) {
        Intent intent = new Intent(act, (Class<?>) NewCropperAct.class);
        intent.putExtra("image_uri", str);
        intent.putExtra("crop_new_profile_picture", z);
        intent.putExtra("crop_new_43_picture", z);
        intent.putExtra("is_crop_live_cover", z2);
        return intent;
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropperAct
    /* JADX INFO: renamed from: E1 */
    public void mo22055E1() {
        this.f22035e.m151438f0();
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropperAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f22035e = new ku20(this);
        lu20 lu20Var = new lu20(this);
        this.f22036f = lu20Var;
        this.f22035e.mo52715C(lu20Var);
        this.f22035e.m151440h0();
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropperAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f22035e.m151441i0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.f22035e.m151442k0();
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropperAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f22035e.m151439g0(Act.SWIPE_BACK_SUPPORTED);
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropperAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
        this.f22036f.m155844c();
    }
}
