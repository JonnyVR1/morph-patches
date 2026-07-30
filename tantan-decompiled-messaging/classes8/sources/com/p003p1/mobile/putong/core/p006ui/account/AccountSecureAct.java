package com.p003p1.mobile.putong.core.p006ui.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import p007l.C0549fx;
import p007l.C0818zx;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class AccountSecureAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public C0818zx f1780c;

    /* JADX INFO: renamed from: d */
    public C0549fx f1781d;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1780c.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1780c = new C0818zx(this);
        C0549fx c0549fx = new C0549fx(this);
        this.f1781d = c0549fx;
        c0549fx.mo8556C(this.f1780c);
    }

    public void initSubscription() {
        super.initSubscription();
        this.f1781d.mo8872a0();
    }

    public String pageId() {
        return "p_account_and_security_view";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
