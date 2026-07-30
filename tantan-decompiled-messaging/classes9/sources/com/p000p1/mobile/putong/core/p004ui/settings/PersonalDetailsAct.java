package com.p000p1.mobile.putong.core.p004ui.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.p004ui.settings.personaldetails.PersonalDetailsPresenter;
import l.zvf0;
import p006l.ll60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PersonalDetailsAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public PersonalDetailsPresenter f5632c;

    /* JADX INFO: renamed from: d */
    public ll60 f5633d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m8395V1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) PersonalDetailsAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean disableAutoPV() {
        return true;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f5633d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f5632c = new PersonalDetailsPresenter(this);
        ll60 ll60Var = new ll60(this);
        this.f5633d = ll60Var;
        this.f5632c.C(ll60Var);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f5632c.m9062a0();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 532) {
            this.f5633d.m18886P();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        zvf0.r("e_edit_basic_info_cancel_button", "p_edit_basic_info_view");
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f5632c.m9065r0(getIntent().getStringExtra("from"));
    }
}
