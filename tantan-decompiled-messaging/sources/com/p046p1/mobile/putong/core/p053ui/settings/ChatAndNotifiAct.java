package com.p046p1.mobile.putong.core.p053ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.at4;
import p149l.rs4;

/* JADX INFO: loaded from: classes9.dex */
public class ChatAndNotifiAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public rs4 f35816c;

    /* JADX INFO: renamed from: d */
    public at4 f35817d;

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f35817d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f35816c = new rs4(this);
        at4 at4Var = new at4(this);
        this.f35817d = at4Var;
        this.f35816c.mo51532C(at4Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f35816c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_notification_and_chat_settings_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f35816c.m180628A0(getIntent().getStringExtra("from"));
    }
}
