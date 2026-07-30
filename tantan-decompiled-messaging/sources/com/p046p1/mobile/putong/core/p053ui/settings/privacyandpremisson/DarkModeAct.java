package com.p046p1.mobile.putong.core.p053ui.settings.privacyandpremisson;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.o2c;
import p149l.v2c;

/* JADX INFO: loaded from: classes9.dex */
public class DarkModeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public o2c f36337c;

    /* JADX INFO: renamed from: d */
    public v2c f36338d;

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f36338d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f36337c = new o2c(this);
        v2c v2cVar = new v2c(this);
        this.f36338d = v2cVar;
        this.f36337c.mo51532C(v2cVar);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f36337c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
