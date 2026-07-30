package com.p046p1.mobile.putong.live.external.square.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.tantan.live.search.eventbus.LiveSearchEventBus;
import p149l.alt;
import p149l.d30;
import p149l.dlt;
import p149l.e30;
import p149l.hkt;
import p149l.vkt;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSearchAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public dlt f46222c;

    /* JADX INFO: renamed from: d */
    public alt f46223d;

    /* JADX INFO: renamed from: e */
    public String f46224e = "";

    /* JADX INFO: renamed from: Y1 */
    public static Intent m70828Y1(Context context) {
        return m70829Z1(context, "");
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m70829Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) LiveSearchAct.class);
        intent.putExtra("search_from", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public void m70830a2(Bundle bundle) {
        vkt.m198755a(this.f46223d, this.f46222c);
        this.f46223d.mo70198T();
        this.f46223d.m141816F2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
        this.f46223d.mo69117n();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46222c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f46222c = new dlt(this);
        alt altVar = new alt(this, new hkt(new LiveSearchEventBus(), this));
        this.f46223d = altVar;
        altVar.mo51532C(this.f46222c);
        creates(new e30() { // from class: l.ejt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91781a.m70830a2((Bundle) obj);
            }
        }, new d30() { // from class: l.fjt
            @Override // p149l.d30
            public final void call() {
                this.f97863a.destroy();
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_live_search";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        String stringExtra = getIntent().getStringExtra("search_from");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f46224e = stringExtra;
    }
}
