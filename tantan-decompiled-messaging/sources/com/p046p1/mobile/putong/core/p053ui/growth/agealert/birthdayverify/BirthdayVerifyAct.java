package com.p046p1.mobile.putong.core.p053ui.growth.agealert.birthdayverify;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.i03;
import p149l.k03;

/* JADX INFO: loaded from: classes10.dex */
public class BirthdayVerifyAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public i03 f29509c;

    /* JADX INFO: renamed from: d */
    public k03 f29510d;

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f29510d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f29509c = new i03(this);
        k03 k03Var = new k03(this);
        this.f29510d = k03Var;
        this.f29509c.mo51532C(k03Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f29509c.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_birthday_tips_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
