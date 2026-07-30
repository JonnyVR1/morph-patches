package com.p000p1.mobile.putong.core.p001ui.map;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.MessageLocation;
import p003l.guw;
import p003l.kuw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MapPreviewAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public guw f267c;

    /* JADX INFO: renamed from: d */
    public kuw f268d;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f268d.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f267c = new guw(this);
        kuw kuwVar = new kuw(this);
        this.f268d = kuwVar;
        this.f267c.C(kuwVar);
        this.f267c.m4708h0((MessageLocation) getIntent().getSerializableExtra("location"));
    }

    public void initSubscription() {
        super.initSubscription();
        this.f267c.m4707a0();
    }
}
