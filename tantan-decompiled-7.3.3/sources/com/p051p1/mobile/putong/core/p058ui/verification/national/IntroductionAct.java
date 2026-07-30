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
import p153l.i4g0;
import p153l.pf60;
import p153l.wyp;
import p153l.zyp;

/* JADX INFO: loaded from: classes12.dex */
public class IntroductionAct extends PutongAct {

    /* JADX INFO: renamed from: g */
    public static String f37524g = "auth_from";

    /* JADX INFO: renamed from: c */
    public wyp f37525c;

    /* JADX INFO: renamed from: d */
    public zyp f37526d;

    /* JADX INFO: renamed from: e */
    public String f37527e;

    /* JADX INFO: renamed from: f */
    public boolean f37528f;

    /* JADX INFO: renamed from: X1 */
    public static Intent m57251X1(Context context, String str) {
        return m57252Y1(context, str, false);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m57252Y1(Context context, String str, boolean z) {
        TextUtils.isEmpty(str);
        Intent intent = new Intent(context, (Class<?>) IntroductionAct.class);
        intent.putExtra(f37524g, str);
        intent.putExtra("upgrade", z);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public String m57253Z1() {
        return this.f37527e;
    }

    /* JADX INFO: renamed from: a2 */
    public boolean m57254a2() {
        return this.f37528f;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f37526d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f37525c = new wyp(this);
        zyp zypVar = new zyp(this);
        this.f37526d = zypVar;
        this.f37525c.mo52715C(zypVar);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f37525c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            m68056e2();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        i4g0.m138520r("e_id_verification_poster_cancel_click", "p_id_verification_poster_view");
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.f37527e)) {
            bundle.putString(f37524g, this.f37527e);
        }
        bundle.putBoolean("upgrade", this.f37528f);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_id_verification_poster_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.m82486a(bundle)) {
            this.f37527e = bundle.getString(f37524g);
            this.f37528f = bundle.getBoolean("upgrade");
        } else {
            this.f37527e = getIntent().getStringExtra(f37524g);
            this.f37528f = getIntent().getBooleanExtra("upgrade", false);
        }
        this.pageHelper.m152781p(pf60.m172085a("id_verification_poster_form", this.f37528f ? "upgrade_guide" : "function_tip"));
    }
}
