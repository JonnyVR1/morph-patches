package com.p046p1.mobile.android.p048ui.cropiwa;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import p149l.j760;
import p149l.n8c0;
import p149l.nx0;
import p149l.svb;
import p149l.t0c0;
import p149l.tkd;
import p149l.zvf0;

/* JADX INFO: loaded from: classes8.dex */
public class CropperAct extends Act {

    /* JADX INFO: renamed from: c */
    public svb f15828c;

    /* JADX INFO: renamed from: d */
    public C4367c f15829d;

    /* JADX INFO: renamed from: E1 */
    public static Intent m21052E1(Act act, String str) {
        return m21053F1(act, str, false);
    }

    /* JADX INFO: renamed from: F1 */
    public static Intent m21053F1(Act act, String str, boolean z) {
        Intent intent = new Intent(act, (Class<?>) CropperAct.class);
        intent.putExtra("image_uri", str);
        intent.putExtra("crop_new_profile_picture", z);
        return intent;
    }

    /* JADX INFO: renamed from: G1 */
    public static File m21054G1(Context context) {
        return new File(context.getCacheDir(), "temp_media_crop_dir");
    }

    /* JADX INFO: renamed from: H1 */
    public static boolean m21055H1(Context context, Uri uri) {
        File file = new File(uri.getPath());
        return file.exists() && m21054G1(context).equals(file.getParentFile());
    }

    /* JADX INFO: renamed from: C1 */
    public void mo21056C1() {
    }

    public void checkGradientColors() {
        if (NullChecker.m81303a(this.act.toolbar())) {
            this.act.toolbar().setBackgroundColor(this.act.color(t0c0.f167149a));
        }
        Act act = this.act;
        act.setStatusBarColor(act.color(t0c0.f167149a));
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        this.f15829d.m21072q();
        super.lambda$debugItems$19();
    }

    @Override // com.p046p1.mobile.android.app.Act
    @NonNull
    public nx0 getAppTheme() {
        return new tkd(this);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f15829d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f15828c = new svb(this);
        C4367c c4367c = new C4367c(this);
        this.f15829d = c4367c;
        this.f15828c.mo51532C(c4367c);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f15828c.mo39470a0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        this.f15828c.m186060o0(menu);
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onHomePressed() {
        super.onHomePressed();
        if (this.f15828c.m186058l0()) {
            zvf0.m220399u("e_picture_editing_page_operation_button", "p_picture_editing_page", j760.m140076a("confirm_cancel_picture", "cancel"));
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        if (getIntent().getBooleanExtra("keep_width_bigger_than_540", false)) {
            this.f15829d.m21063f();
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f15828c.m186062q0(getIntent().getStringExtra("image_uri"));
        this.f15828c.m186061p0(getIntent().getBooleanExtra("crop_new_profile_picture", false));
        this.f15828c.m186064s0(getIntent().getBooleanExtra("crop_new_43_picture", false));
        this.f15828c.m186063r0(getIntent().getBooleanExtra("is_crop_live_cover", false));
        if (getIntent().getBooleanExtra("is_new_ui1", false)) {
            checkGradientColors();
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
        if (getIntent().getBooleanExtra("is_new_ui1", false)) {
            setTheme(n8c0.f137629m);
        }
    }
}
