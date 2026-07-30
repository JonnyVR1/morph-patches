package com.p003p1.mobile.android.p005ui.cropiwa;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p003p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import l.j760;
import l.zvf0;
import p007l.n8c0;
import p007l.nx0;
import p007l.svb;
import p007l.t0c0;
import p007l.tkd;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class CropperAct extends Act {

    /* JADX INFO: renamed from: c */
    public svb f1527c;

    /* JADX INFO: renamed from: d */
    public C0279c f1528d;

    /* JADX INFO: renamed from: E1 */
    public static Intent m1324E1(Act act, String str) {
        return m1325F1(act, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F1 */
    public static Intent m1325F1(Act act, String str, boolean z) {
        Intent intent = new Intent((Context) act, (Class<?>) CropperAct.class);
        intent.putExtra("image_uri", str);
        intent.putExtra("crop_new_profile_picture", z);
        return intent;
    }

    /* JADX INFO: renamed from: G1 */
    public static File m1326G1(Context context) {
        return new File(context.getCacheDir(), "temp_media_crop_dir");
    }

    /* JADX INFO: renamed from: H1 */
    public static boolean m1327H1(Context context, Uri uri) {
        File file = new File(uri.getPath());
        return file.exists() && m1326G1(context).equals(file.getParentFile());
    }

    /* JADX INFO: renamed from: C1 */
    public void m1328C1() {
    }

    public void checkGradientColors() {
        if (NullChecker.a(this.act.toolbar())) {
            this.act.toolbar().setBackgroundColor(this.act.color(t0c0.f4217a));
        }
        Act act = this.act;
        act.setStatusBarColor(act.color(t0c0.f4217a));
    }

    @Override // com.p003p1.mobile.android.app.Act
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        this.f1528d.m1344q();
        super.lambda$debugItems$19();
    }

    @Override // com.p003p1.mobile.android.app.Act
    @NonNull
    public nx0 getAppTheme() {
        return new tkd(this);
    }

    @Override // com.p003p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1528d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p003p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1527c = new svb(this);
        C0279c c0279c = new C0279c(this);
        this.f1528d = c0279c;
        this.f1527c.mo8556C(c0279c);
    }

    @Override // com.p003p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f1527c.mo8872a0();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.f1527c.m10742o0(menu);
        return true;
    }

    @Override // com.p003p1.mobile.android.app.Act
    public void onHomePressed() {
        super.onHomePressed();
        if (this.f1527c.m10740l0()) {
            zvf0.u("e_picture_editing_page_operation_button", "p_picture_editing_page", new j760[]{j760.a("confirm_cancel_picture", "cancel")});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p003p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        if (getIntent().getBooleanExtra("keep_width_bigger_than_540", false)) {
            this.f1528d.m1335f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p003p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f1527c.m10744q0(getIntent().getStringExtra("image_uri"));
        this.f1527c.m10743p0(getIntent().getBooleanExtra("crop_new_profile_picture", false));
        this.f1527c.m10746s0(getIntent().getBooleanExtra("crop_new_43_picture", false));
        this.f1527c.m10745r0(getIntent().getBooleanExtra("is_crop_live_cover", false));
        if (getIntent().getBooleanExtra("is_new_ui1", false)) {
            checkGradientColors();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p003p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
        if (getIntent().getBooleanExtra("is_new_ui1", false)) {
            setTheme(n8c0.f3374m);
        }
    }
}
