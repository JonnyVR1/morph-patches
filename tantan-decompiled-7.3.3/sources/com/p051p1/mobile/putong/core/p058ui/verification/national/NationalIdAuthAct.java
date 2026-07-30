package com.p051p1.mobile.putong.core.p058ui.verification.national;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import p153l.bd20;
import p153l.jyb;
import p153l.kd20;
import p153l.sfj0;

/* JADX INFO: loaded from: classes12.dex */
public class NationalIdAuthAct extends PutongAct {

    /* JADX INFO: renamed from: g */
    public static String f37529g = "auth_from";

    /* JADX INFO: renamed from: c */
    public kd20 f37530c;

    /* JADX INFO: renamed from: d */
    public bd20 f37531d;

    /* JADX INFO: renamed from: e */
    public String f37532e;

    /* JADX INFO: renamed from: f */
    public boolean f37533f;

    /* JADX INFO: renamed from: X1 */
    public static Intent m57255X1(Context context, String str) {
        return m57256Y1(context, str, false);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m57256Y1(Context context, String str, boolean z) {
        TextUtils.isEmpty(str);
        Intent intent = new Intent(context, (Class<?>) NationalIdAuthAct.class);
        intent.putExtra(f37529g, str);
        intent.putExtra("upgrade", z);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m57257Z1(Intent intent, boolean z) {
        intent.putExtra("new_process", z);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        act().hideInput();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f37530c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f37530c = new kd20(this);
        bd20 bd20Var = new bd20(this);
        this.f37531d = bd20Var;
        bd20Var.mo52715C(this.f37530c);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f37531d.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        sfj0.m185596c("e_id_verification_info_input_cancel_click", "p_id_verification_info_input_view", new sfj0.C20032a[0]);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.f37532e)) {
            bundle.putString(f37529g, this.f37532e);
        }
        bundle.putBoolean("upgrade", this.f37533f);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_id_verification_info_input_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.m82486a(bundle)) {
            this.f37532e = bundle.getString(f37529g);
            this.f37533f = bundle.getBoolean("upgrade");
        } else {
            this.f37532e = getIntent().getStringExtra(f37529g);
            this.f37533f = getIntent().getBooleanExtra("upgrade", false);
        }
        this.f37531d.m103590n0(this.f37533f);
        this.f37531d.m103589m0(this.f37532e);
        if (TextUtils.isEmpty(this.f37532e) || !NullChecker.m82486a(this.pageHelper)) {
            return;
        }
        if (TextUtils.equals(this.f37532e, "fromPicVerificationDlg") || TextUtils.equals(this.f37532e, "fromNameVerificationDlg")) {
            this.pageHelper.m152781p(jyb.m147494Y("id_verification_ask_from", ""), jyb.m147494Y("verification_scene", "security_force_verification"));
        } else {
            this.pageHelper.m152781p(jyb.m147494Y("id_verification_ask_from", this.f37532e), jyb.m147494Y("verification_scene", ""));
        }
    }
}
