package com.p051p1.mobile.putong.core.p058ui.settings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.aq00;
import p153l.cq00;

/* JADX INFO: loaded from: classes12.dex */
public class MomentMutedAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public aq00 f36670c;

    /* JADX INFO: renamed from: d */
    public cq00 f36671d;

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f36671d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f36670c = new aq00(this);
        cq00 cq00Var = new cq00(this);
        this.f36671d = cq00Var;
        this.f36670c.mo52715C(cq00Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f36670c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_blocked_users_view";
    }
}
