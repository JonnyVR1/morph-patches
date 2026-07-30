package com.p003p1.mobile.putong.core.p006ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import p007l.ge20;
import p007l.oe20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class NewAccountSecureAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public oe20 f1822c;

    /* JADX INFO: renamed from: d */
    public ge20 f1823d;

    /* JADX INFO: renamed from: V1 */
    public ge20 m8544V1() {
        return this.f1823d;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1822c.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1822c = new oe20(this);
        ge20 ge20Var = new ge20(this);
        this.f1823d = ge20Var;
        ge20Var.mo8556C(this.f1822c);
    }

    public void initSubscription() {
        super.initSubscription();
        this.f1823d.mo8872a0();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f1823d.m9242d1(i, i2, intent);
    }

    public String pageId() {
        return "p_account_and_security_view";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
