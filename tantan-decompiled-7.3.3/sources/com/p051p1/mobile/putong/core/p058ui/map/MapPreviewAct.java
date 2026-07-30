package com.p051p1.mobile.putong.core.p058ui.map;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.MessageLocation;
import p153l.fxw;
import p153l.jxw;

/* JADX INFO: loaded from: classes3.dex */
public class MapPreviewAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public fxw f31224c;

    /* JADX INFO: renamed from: d */
    public jxw f31225d;

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f31225d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f31224c = new fxw(this);
        jxw jxwVar = new jxw(this);
        this.f31225d = jxwVar;
        this.f31224c.mo52715C(jxwVar);
        this.f31224c.m128039h0((MessageLocation) getIntent().getSerializableExtra("location"));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f31224c.mo40473a0();
    }
}
