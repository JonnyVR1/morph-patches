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
import l.zvf0;
import p006l.wwp;
import p006l.zwp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntroductionAct extends PutongAct {

    /* JADX INFO: renamed from: g */
    public static String f6457g = "auth_from";

    /* JADX INFO: renamed from: c */
    public wwp f6458c;

    /* JADX INFO: renamed from: d */
    public zwp f6459d;

    /* JADX INFO: renamed from: e */
    public String f6460e;

    /* JADX INFO: renamed from: f */
    public boolean f6461f;

    /* JADX INFO: renamed from: V1 */
    public static Intent m9493V1(Context context, String str) {
        return m9494X1(context, str, false);
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m9494X1(Context context, String str, boolean z) {
        TextUtils.isEmpty(str);
        Intent intent = new Intent(context, (Class<?>) IntroductionAct.class);
        intent.putExtra(f6457g, str);
        intent.putExtra("upgrade", z);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public String m9495Y1() {
        return this.f6460e;
    }

    /* JADX INFO: renamed from: Z1 */
    public boolean m9496Z1() {
        return this.f6461f;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f6459d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f6458c = new wwp(this);
        zwp zwpVar = new zwp(this);
        this.f6459d = zwpVar;
        this.f6458c.C(zwpVar);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f6458c.m26796a0();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            finish();
        }
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        zvf0.r("e_id_verification_poster_cancel_click", "p_id_verification_poster_view");
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.f6460e)) {
            bundle.putString(f6457g, this.f6460e);
        }
        bundle.putBoolean("upgrade", this.f6461f);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_id_verification_poster_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.a(bundle)) {
            this.f6460e = bundle.getString(f6457g);
            this.f6461f = bundle.getBoolean("upgrade");
        } else {
            this.f6460e = getIntent().getStringExtra(f6457g);
            this.f6461f = getIntent().getBooleanExtra("upgrade", false);
        }
        this.pageHelper.p(new j760[]{j760.a("id_verification_poster_form", this.f6461f ? "upgrade_guide" : "function_tip")});
    }
}
