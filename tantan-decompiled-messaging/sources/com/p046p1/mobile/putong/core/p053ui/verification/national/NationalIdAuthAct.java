package com.p046p1.mobile.putong.core.p053ui.verification.national;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import p149l.c520;
import p149l.o6j0;
import p149l.t420;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
public class NationalIdAuthAct extends PutongAct {

    /* JADX INFO: renamed from: g */
    public static String f36681g = "auth_from";

    /* JADX INFO: renamed from: c */
    public c520 f36682c;

    /* JADX INFO: renamed from: d */
    public t420 f36683d;

    /* JADX INFO: renamed from: e */
    public String f36684e;

    /* JADX INFO: renamed from: f */
    public boolean f36685f;

    /* JADX INFO: renamed from: V1 */
    public static Intent m56072V1(Context context, String str) {
        return m56073X1(context, str, false);
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m56073X1(Context context, String str, boolean z) {
        TextUtils.isEmpty(str);
        Intent intent = new Intent(context, (Class<?>) NationalIdAuthAct.class);
        intent.putExtra(f36681g, str);
        intent.putExtra("upgrade", z);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m56074Y1(Intent intent, boolean z) {
        intent.putExtra("new_process", z);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        act().hideInput();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f36682c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f36682c = new c520(this);
        t420 t420Var = new t420(this);
        this.f36683d = t420Var;
        t420Var.mo51532C(this.f36682c);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f36683d.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        o6j0.m162859c("e_id_verification_info_input_cancel_click", "p_id_verification_info_input_view", new o6j0.C18854a[0]);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.f36684e)) {
            bundle.putString(f36681g, this.f36684e);
        }
        bundle.putBoolean("upgrade", this.f36685f);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_id_verification_info_input_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.m81303a(bundle)) {
            this.f36684e = bundle.getString(f36681g);
            this.f36685f = bundle.getBoolean("upgrade");
        } else {
            this.f36684e = getIntent().getStringExtra(f36681g);
            this.f36685f = getIntent().getBooleanExtra("upgrade", false);
        }
        this.f36683d.m187146n0(this.f36685f);
        this.f36683d.m187145m0(this.f36684e);
        if (TextUtils.isEmpty(this.f36684e) || !NullChecker.m81303a(this.pageHelper)) {
            return;
        }
        if (TextUtils.equals(this.f36684e, "fromPicVerificationDlg") || TextUtils.equals(this.f36684e, "fromNameVerificationDlg")) {
            this.pageHelper.m109040p(vwb.m200311Y("id_verification_ask_from", ""), vwb.m200311Y("verification_scene", "security_force_verification"));
        } else {
            this.pageHelper.m109040p(vwb.m200311Y("id_verification_ask_from", this.f36684e), vwb.m200311Y("verification_scene", ""));
        }
    }
}
