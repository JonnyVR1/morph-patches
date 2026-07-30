package com.p000p1.mobile.putong.core.p001ui.growth.agealert.birthdayverify;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import p003l.i03;
import p003l.k03;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class BirthdayVerifyAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public i03 f1903c;

    /* JADX INFO: renamed from: d */
    public k03 f1904d;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1904d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1903c = new i03(this);
        k03 k03Var = new k03(this);
        this.f1904d = k03Var;
        this.f1903c.C(k03Var);
    }

    public void initSubscription() {
        super.initSubscription();
        this.f1903c.m7117a0();
    }

    public void onBackPressed() {
    }

    public String pageId() {
        return "p_birthday_tips_view";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
