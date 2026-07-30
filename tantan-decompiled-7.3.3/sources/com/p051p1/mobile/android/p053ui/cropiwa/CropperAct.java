package com.p051p1.mobile.android.p053ui.cropiwa;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import p153l.gxb;
import p153l.i4g0;
import p153l.pf60;
import p153l.tgc0;
import p153l.ux0;
import p153l.z8c0;
import p153l.zld;

/* JADX INFO: loaded from: classes8.dex */
public class CropperAct extends Act {

    /* JADX INFO: renamed from: c */
    public gxb f16547c;

    /* JADX INFO: renamed from: d */
    public C4518c f16548d;

    /* JADX INFO: renamed from: F1 */
    public static Intent m22051F1(Act act, String str) {
        return m22052G1(act, str, false);
    }

    /* JADX INFO: renamed from: G1 */
    public static Intent m22052G1(Act act, String str, boolean z) {
        Intent intent = new Intent(act, (Class<?>) CropperAct.class);
        intent.putExtra("image_uri", str);
        intent.putExtra("crop_new_profile_picture", z);
        return intent;
    }

    /* JADX INFO: renamed from: H1 */
    public static File m22053H1(Context context) {
        return new File(context.getCacheDir(), "temp_media_crop_dir");
    }

    /* JADX INFO: renamed from: I1 */
    public static boolean m22054I1(Context context, Uri uri) {
        File file = new File(uri.getPath());
        return file.exists() && m22053H1(context).equals(file.getParentFile());
    }

    /* JADX INFO: renamed from: E1 */
    public void mo22055E1() {
    }

    public void checkGradientColors() {
        if (NullChecker.m82486a(this.act.toolbar())) {
            this.act.toolbar().setBackgroundColor(this.act.color(z8c0.f203340a));
        }
        Act act = this.act;
        act.setStatusBarColor(act.color(z8c0.f203340a));
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        this.f16548d.m22071q();
        super.lambda$debugItems$19();
    }

    @Override // com.p051p1.mobile.android.app.Act
    @NonNull
    public ux0 getAppTheme() {
        return new zld(this);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16548d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f16547c = new gxb(this);
        C4518c c4518c = new C4518c(this);
        this.f16548d = c4518c;
        this.f16547c.mo52715C(c4518c);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16547c.mo40473a0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        this.f16547c.m132808o0(menu);
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onHomePressed() {
        super.onHomePressed();
        if (this.f16547c.m132806l0()) {
            i4g0.m138523u("e_picture_editing_page_operation_button", "p_picture_editing_page", pf60.m172085a("confirm_cancel_picture", "cancel"));
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        if (getIntent().getBooleanExtra("keep_width_bigger_than_540", false)) {
            this.f16548d.m22062f();
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f16547c.m132810q0(getIntent().getStringExtra("image_uri"));
        this.f16547c.m132809p0(getIntent().getBooleanExtra("crop_new_profile_picture", false));
        this.f16547c.m132812s0(getIntent().getBooleanExtra("crop_new_43_picture", false));
        this.f16547c.m132811r0(getIntent().getBooleanExtra("is_crop_live_cover", false));
        if (getIntent().getBooleanExtra("is_new_ui1", false)) {
            checkGradientColors();
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
        if (getIntent().getBooleanExtra("is_new_ui1", false)) {
            setTheme(tgc0.f174067m);
        }
    }
}
