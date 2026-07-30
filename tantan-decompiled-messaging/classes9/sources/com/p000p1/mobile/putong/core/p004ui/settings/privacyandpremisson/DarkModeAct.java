package com.p000p1.mobile.putong.core.p004ui.settings.privacyandpremisson;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import p006l.o2c;
import p006l.v2c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class DarkModeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public o2c f6118c;

    /* JADX INFO: renamed from: d */
    public v2c f6119d;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f6119d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f6118c = new o2c(this);
        v2c v2cVar = new v2c(this);
        this.f6119d = v2cVar;
        this.f6118c.C(v2cVar);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f6118c.m20296a0();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
