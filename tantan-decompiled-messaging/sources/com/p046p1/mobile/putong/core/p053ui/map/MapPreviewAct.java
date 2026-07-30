package com.p046p1.mobile.putong.core.p053ui.map;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.MessageLocation;
import p149l.guw;
import p149l.kuw;

/* JADX INFO: loaded from: classes3.dex */
public class MapPreviewAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public guw f30376c;

    /* JADX INFO: renamed from: d */
    public kuw f30377d;

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f30377d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f30376c = new guw(this);
        kuw kuwVar = new kuw(this);
        this.f30377d = kuwVar;
        this.f30376c.mo51532C(kuwVar);
        this.f30376c.m128079h0((MessageLocation) getIntent().getSerializableExtra("location"));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f30376c.mo39470a0();
    }
}
