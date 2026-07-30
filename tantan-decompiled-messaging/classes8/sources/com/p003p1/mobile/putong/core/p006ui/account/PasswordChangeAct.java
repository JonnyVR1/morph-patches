package com.p003p1.mobile.putong.core.p006ui.account;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import l.rol;
import p007l.i960;
import p007l.z860;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class PasswordChangeAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public z860 f1824c;

    /* JADX INFO: renamed from: d */
    public i960 f1825d;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1825d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1824c = new z860(this);
        i960 i960Var = new i960(this);
        this.f1825d = i960Var;
        this.f1824c.mo8556C(i960Var);
    }

    public void initSubscription() {
        super.initSubscription();
        this.f1824c.mo8872a0();
    }

    public String pageId() {
        return "p_edit_password_view";
    }
}
