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
import p149l.j760;
import p149l.wwp;
import p149l.zvf0;
import p149l.zwp;

/* JADX INFO: loaded from: classes9.dex */
public class IntroductionAct extends PutongAct {

    /* JADX INFO: renamed from: g */
    public static String f36676g = "auth_from";

    /* JADX INFO: renamed from: c */
    public wwp f36677c;

    /* JADX INFO: renamed from: d */
    public zwp f36678d;

    /* JADX INFO: renamed from: e */
    public String f36679e;

    /* JADX INFO: renamed from: f */
    public boolean f36680f;

    /* JADX INFO: renamed from: V1 */
    public static Intent m56068V1(Context context, String str) {
        return m56069X1(context, str, false);
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m56069X1(Context context, String str, boolean z) {
        TextUtils.isEmpty(str);
        Intent intent = new Intent(context, (Class<?>) IntroductionAct.class);
        intent.putExtra(f36676g, str);
        intent.putExtra("upgrade", z);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public String m56070Y1() {
        return this.f36679e;
    }

    /* JADX INFO: renamed from: Z1 */
    public boolean m56071Z1() {
        return this.f36680f;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f36678d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f36677c = new wwp(this);
        zwp zwpVar = new zwp(this);
        this.f36678d = zwpVar;
        this.f36677c.mo51532C(zwpVar);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f36677c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            m66873d2();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        zvf0.m220396r("e_id_verification_poster_cancel_click", "p_id_verification_poster_view");
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.f36679e)) {
            bundle.putString(f36676g, this.f36679e);
        }
        bundle.putBoolean("upgrade", this.f36680f);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_id_verification_poster_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.m81303a(bundle)) {
            this.f36679e = bundle.getString(f36676g);
            this.f36680f = bundle.getBoolean("upgrade");
        } else {
            this.f36679e = getIntent().getStringExtra(f36676g);
            this.f36680f = getIntent().getBooleanExtra("upgrade", false);
        }
        this.pageHelper.m109040p(j760.m140076a("id_verification_poster_form", this.f36680f ? "upgrade_guide" : "function_tip"));
    }
}
