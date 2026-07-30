package com.p051p1.mobile.putong.core.p058ui.map.intl;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import java.util.ArrayList;
import p153l.hyl;
import p153l.jyb;
import p153l.pf60;
import p153l.rdo;
import p153l.x20;
import p153l.xco;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IntlMapBaseAct extends PutongMvpAct<xco, rdo> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m48563a2(Intent intent, int i, String str) {
        intent.putExtra("placePickerType", i);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m48564b2(Intent intent, int i, boolean z) {
        intent.putExtra("placePickerType", i);
        intent.putExtra("search_enabled", z);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public xco mo29671X1() {
        return new xco(this, this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public rdo mo29672Y1() {
        return new rdo(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public ArrayList<pf60<String, x20>> debugItems() {
        return jyb.m147507f0(jyb.m147494Y("show passed location!", new x20() { // from class: l.vbo
            @Override // p153l.x20
            public final void call() {
                this.f183266a.lambda$debugItems$0();
            }
        }));
    }

    /* JADX INFO: renamed from: e2 */
    public abstract hyl mo36951e2();

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((rdo) this.f17892d).inflateView(layoutInflater, viewGroup);
    }

    public final /* synthetic */ void lambda$debugItems$0() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (((xco) this.f17891c).m210233g1()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return ((xco) this.f17891c).m210234h1(menu);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_browse_map_and_select_location_view";
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void pendChangeActionButtonTypeface() {
        ((xco) this.f17891c).m210235j1();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        Intent intent = getIntent();
        ((xco) this.f17891c).m210219P0(intent.getIntExtra("placePickerType", 0), intent.getBooleanExtra("search_enabled", true), intent.getStringExtra("from"));
        super.preCreateView(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnCreate(Bundle bundle) {
        return super.shouldBlockOnCreate(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnResume() {
        return super.shouldBlockOnResume();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnStart() {
        return super.shouldBlockOnStart();
    }
}
