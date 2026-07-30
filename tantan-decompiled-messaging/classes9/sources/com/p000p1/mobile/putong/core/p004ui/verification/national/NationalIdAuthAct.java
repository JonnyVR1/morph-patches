package com.p000p1.mobile.putong.core.p004ui.verification.national;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.o6j0;
import l.vwb;
import p006l.c520;
import p006l.t420;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NationalIdAuthAct extends PutongAct {

    /* JADX INFO: renamed from: g */
    public static String f6462g = "auth_from";

    /* JADX INFO: renamed from: c */
    public c520 f6463c;

    /* JADX INFO: renamed from: d */
    public t420 f6464d;

    /* JADX INFO: renamed from: e */
    public String f6465e;

    /* JADX INFO: renamed from: f */
    public boolean f6466f;

    /* JADX INFO: renamed from: V1 */
    public static Intent m9497V1(Context context, String str) {
        return m9498X1(context, str, false);
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m9498X1(Context context, String str, boolean z) {
        TextUtils.isEmpty(str);
        Intent intent = new Intent(context, (Class<?>) NationalIdAuthAct.class);
        intent.putExtra(f6462g, str);
        intent.putExtra("upgrade", z);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m9499Y1(Intent intent, boolean z) {
        intent.putExtra("new_process", z);
        return intent;
    }

    public void finish() {
        super.finish();
        act().hideInput();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f6463c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f6463c = new c520(this);
        t420 t420Var = new t420(this);
        this.f6464d = t420Var;
        t420Var.C(this.f6463c);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f6464d.m24441a0();
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        o6j0.c("e_id_verification_info_input_cancel_click", "p_id_verification_info_input_view", new o6j0.a[0]);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.f6465e)) {
            bundle.putString(f6462g, this.f6465e);
        }
        bundle.putBoolean("upgrade", this.f6466f);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_id_verification_info_input_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.a(bundle)) {
            this.f6465e = bundle.getString(f6462g);
            this.f6466f = bundle.getBoolean("upgrade");
        } else {
            this.f6465e = getIntent().getStringExtra(f6462g);
            this.f6466f = getIntent().getBooleanExtra("upgrade", false);
        }
        this.f6464d.m24447n0(this.f6466f);
        this.f6464d.m24446m0(this.f6465e);
        if (TextUtils.isEmpty(this.f6465e) || !NullChecker.a(this.pageHelper)) {
            return;
        }
        if (TextUtils.equals(this.f6465e, "fromPicVerificationDlg") || TextUtils.equals(this.f6465e, "fromNameVerificationDlg")) {
            this.pageHelper.p(new j760[]{vwb.Y("id_verification_ask_from", ""), vwb.Y("verification_scene", "security_force_verification")});
        } else {
            this.pageHelper.p(new j760[]{vwb.Y("id_verification_ask_from", this.f6465e), vwb.Y("verification_scene", "")});
        }
    }
}
