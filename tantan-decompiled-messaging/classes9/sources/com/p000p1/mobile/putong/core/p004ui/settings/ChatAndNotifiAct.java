package com.p000p1.mobile.putong.core.p004ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import p006l.at4;
import p006l.rs4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ChatAndNotifiAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public rs4 f5597c;

    /* JADX INFO: renamed from: d */
    public at4 f5598d;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f5598d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f5597c = new rs4(this);
        at4 at4Var = new at4(this);
        this.f5598d = at4Var;
        this.f5597c.C(at4Var);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f5597c.m22904a0();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_notification_and_chat_settings_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f5597c.m22901A0(getIntent().getStringExtra("from"));
    }
}
