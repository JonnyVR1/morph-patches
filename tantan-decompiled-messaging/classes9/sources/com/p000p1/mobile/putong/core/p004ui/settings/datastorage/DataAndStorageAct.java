package com.p000p1.mobile.putong.core.p004ui.settings.datastorage;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import p006l.b4c;
import p006l.q3c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class DataAndStorageAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public q3c f5827c;

    /* JADX INFO: renamed from: d */
    public b4c f5828d;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f5828d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f5827c = new q3c(this);
        b4c b4cVar = new b4c(this);
        this.f5828d = b4cVar;
        this.f5827c.C(b4cVar);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f5827c.m21942a0();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f5827c.m21940C0(i, i2, intent);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_data_and_cache_settings_view";
    }
}
