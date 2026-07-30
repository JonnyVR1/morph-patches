package com.p046p1.mobile.putong.core.p053ui.map.intl;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import java.util.ArrayList;
import p149l.d30;
import p149l.j760;
import p149l.pvl;
import p149l.rbo;
import p149l.vwb;
import p149l.xao;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IntlMapBaseAct extends PutongMvpAct<xao, rbo> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m47380Z1(Intent intent, int i, String str) {
        intent.putExtra("placePickerType", i);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m47381a2(Intent intent, int i, boolean z) {
        intent.putExtra("placePickerType", i);
        intent.putExtra("search_enabled", z);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public xao mo28672V1() {
        return new xao(this, this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public rbo mo28673X1() {
        return new rbo(this);
    }

    /* JADX INFO: renamed from: d2 */
    public abstract pvl mo35948d2();

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public ArrayList<j760<String, d30>> debugItems() {
        return vwb.m200324f0(vwb.m200311Y("show passed location!", new d30() { // from class: l.v9o
            @Override // p149l.d30
            public final void call() {
                this.f180664a.lambda$debugItems$0();
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((rbo) this.f17173d).inflateView(layoutInflater, viewGroup);
    }

    public final /* synthetic */ void lambda$debugItems$0() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (((xao) this.f17172c).m207629g1()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return ((xao) this.f17172c).m207630h1(menu);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_browse_map_and_select_location_view";
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void pendChangeActionButtonTypeface() {
        ((xao) this.f17172c).m207631j1();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        Intent intent = getIntent();
        ((xao) this.f17172c).m207615P0(intent.getIntExtra("placePickerType", 0), intent.getBooleanExtra("search_enabled", true), intent.getStringExtra("from"));
        super.preCreateView(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnCreate(Bundle bundle) {
        return super.shouldBlockOnCreate(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnResume() {
        return super.shouldBlockOnResume();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnStart() {
        return super.shouldBlockOnStart();
    }
}
