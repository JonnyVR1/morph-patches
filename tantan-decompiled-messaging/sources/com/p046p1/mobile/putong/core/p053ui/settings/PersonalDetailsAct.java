package com.p046p1.mobile.putong.core.p053ui.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.p053ui.settings.personaldetails.PersonalDetailsPresenter;
import p149l.ll60;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class PersonalDetailsAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public PersonalDetailsPresenter f35851c;

    /* JADX INFO: renamed from: d */
    public ll60 f35852d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m55029V1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) PersonalDetailsAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f35852d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f35851c = new PersonalDetailsPresenter(this);
        ll60 ll60Var = new ll60(this);
        this.f35852d = ll60Var;
        this.f35851c.mo51532C(ll60Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f35851c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 532) {
            this.f35852d.m150442P();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        zvf0.m220396r("e_edit_basic_info_cancel_button", "p_edit_basic_info_view");
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f35851c.m55668r0(getIntent().getStringExtra("from"));
    }
}
