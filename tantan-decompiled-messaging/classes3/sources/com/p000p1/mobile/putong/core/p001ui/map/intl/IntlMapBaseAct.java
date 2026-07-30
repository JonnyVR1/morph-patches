package com.p000p1.mobile.putong.core.p001ui.map.intl;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongMvpAct;
import java.util.ArrayList;
import l.j760;
import l.vwb;
import l.xao;
import p003l.d30;
import p003l.pvl;
import p003l.rbo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class IntlMapBaseAct extends PutongMvpAct<xao, rbo> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m413Z1(Intent intent, int i, String str) {
        intent.putExtra("placePickerType", i);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m414a2(Intent intent, int i, boolean z) {
        intent.putExtra("placePickerType", i);
        intent.putExtra("search_enabled", z);
        return intent;
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public xao m415V1() {
        return new xao(this, this);
    }

    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public rbo m416X1() {
        return new rbo(this);
    }

    /* JADX INFO: renamed from: d2 */
    public abstract pvl m419d2();

    public ArrayList<j760<String, d30>> debugItems() {
        return vwb.f0(new j760[]{vwb.Y("show passed location!", new d30() { // from class: l.v9o
            @Override // p003l.d30
            public final void call() {
                this.f8249a.lambda$debugItems$0();
            }
        })});
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((rbo) ((PutongMvpAct) this).d).inflateView(layoutInflater, viewGroup);
    }

    public final /* synthetic */ void lambda$debugItems$0() {
    }

    public void onBackPressed() {
        if (((PutongMvpAct) this).c.g1()) {
            return;
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return ((PutongMvpAct) this).c.h1(menu);
    }

    public String pageId() {
        return "p_browse_map_and_select_location_view";
    }

    public void pendChangeActionButtonTypeface() {
        ((PutongMvpAct) this).c.j1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        Intent intent = getIntent();
        ((PutongMvpAct) this).c.P0(intent.getIntExtra("placePickerType", 0), intent.getBooleanExtra("search_enabled", true), intent.getStringExtra("from"));
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
    }

    public boolean shouldBlockOnCreate(Bundle bundle) {
        return super/*com.p1.mobile.putong.app.PutongAct*/.shouldBlockOnCreate(bundle);
    }

    public boolean shouldBlockOnResume() {
        return super/*com.p1.mobile.putong.app.PutongAct*/.shouldBlockOnResume();
    }

    public boolean shouldBlockOnStart() {
        return super/*com.p1.mobile.putong.app.PutongAct*/.shouldBlockOnStart();
    }
}
