package com.p051p1.mobile.putong.live.external.square.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.tantan.live.search.eventbus.LiveSearchEventBus;
import p153l.bnt;
import p153l.ent;
import p153l.imt;
import p153l.wmt;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSearchAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public ent f47070c;

    /* JADX INFO: renamed from: d */
    public bnt f47071d;

    /* JADX INFO: renamed from: e */
    public String f47072e = "";

    /* JADX INFO: renamed from: Z1 */
    public static Intent m72011Z1(Context context) {
        return m72012a2(context, "");
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m72012a2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) LiveSearchAct.class);
        intent.putExtra("search_from", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public void m72013b2(Bundle bundle) {
        wmt.m207133a(this.f47071d, this.f47070c);
        this.f47071d.mo71381T();
        this.f47071d.m150395F2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
        this.f47071d.mo70300n();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f47070c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f47070c = new ent(this);
        bnt bntVar = new bnt(this, new imt(new LiveSearchEventBus(), this));
        this.f47071d = bntVar;
        bntVar.mo52715C(this.f47070c);
        creates(new y20() { // from class: l.flt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99691a.m72013b2((Bundle) obj);
            }
        }, new x20() { // from class: l.glt
            @Override // p153l.x20
            public final void call() {
                this.f104882a.destroy();
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_live_search";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        String stringExtra = getIntent().getStringExtra("search_from");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f47072e = stringExtra;
    }
}
