package com.p051p1.mobile.putong.core.p058ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.qt4;
import p153l.zt4;

/* JADX INFO: loaded from: classes12.dex */
public class ChatAndNotifiAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public qt4 f36664c;

    /* JADX INFO: renamed from: d */
    public zt4 f36665d;

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f36665d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f36664c = new qt4(this);
        zt4 zt4Var = new zt4(this);
        this.f36665d = zt4Var;
        this.f36664c.mo52715C(zt4Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f36664c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_notification_and_chat_settings_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f36664c.m177880A0(getIntent().getStringExtra("from"));
    }
}
