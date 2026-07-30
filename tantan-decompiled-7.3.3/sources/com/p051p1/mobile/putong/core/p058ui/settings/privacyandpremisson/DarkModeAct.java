package com.p051p1.mobile.putong.core.p058ui.settings.privacyandpremisson;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.e4c;
import p153l.x3c;

/* JADX INFO: loaded from: classes12.dex */
public class DarkModeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public x3c f37185c;

    /* JADX INFO: renamed from: d */
    public e4c f37186d;

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f37186d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f37185c = new x3c(this);
        e4c e4cVar = new e4c(this);
        this.f37186d = e4cVar;
        this.f37185c.mo52715C(e4cVar);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f37185c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
