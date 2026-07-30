package com.p051p1.mobile.putong.core.p058ui.settings.datastorage;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.k5c;
import p153l.z4c;

/* JADX INFO: loaded from: classes12.dex */
public class DataAndStorageAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public z4c f36894c;

    /* JADX INFO: renamed from: d */
    public k5c f36895d;

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f36895d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f36894c = new z4c(this);
        k5c k5cVar = new k5c(this);
        this.f36895d = k5cVar;
        this.f36894c.mo52715C(k5cVar);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f36894c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f36894c.m218560C0(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_data_and_cache_settings_view";
    }
}
