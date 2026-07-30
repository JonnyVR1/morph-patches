package com.p051p1.mobile.putong.core.p058ui.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.p058ui.settings.personaldetails.PersonalDetailsPresenter;
import p153l.i4g0;
import p153l.rt60;

/* JADX INFO: loaded from: classes12.dex */
public class PersonalDetailsAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public PersonalDetailsPresenter f36699c;

    /* JADX INFO: renamed from: d */
    public rt60 f36700d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m56212X1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) PersonalDetailsAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f36700d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f36699c = new PersonalDetailsPresenter(this);
        rt60 rt60Var = new rt60(this);
        this.f36700d = rt60Var;
        this.f36699c.mo52715C(rt60Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f36699c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 532) {
            this.f36700d.m183095P();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        i4g0.m138520r("e_edit_basic_info_cancel_button", "p_edit_basic_info_view");
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f36699c.m56851r0(getIntent().getStringExtra("from"));
    }
}
