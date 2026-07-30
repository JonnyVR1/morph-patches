package com.p051p1.mobile.putong.core.p058ui.wallet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.api.C4896k;
import p153l.fdc0;
import p153l.h9c0;
import p153l.jyb;
import p153l.rec0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class TanTanCoinCheckstandAct extends PutongAct {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m59263Y1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) TanTanCoinCheckstandAct.class);
        intent.putExtra("from", str);
        intent.putExtra("url", C4896k.m35182u3(str));
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (fragmentManager().m2555h0(fdc0.f98347G0) == null) {
            fragmentManager().m2568m().m2812s(fdc0.f98347G0, TanTanCoinCheckstandFrag.m59264M4(shouldShowGradientStatusBar(), getIntent().getStringExtra("url"))).mo2708i();
            fragmentManager().m2546e0();
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162460K2, (ViewGroup) null);
        viewInflate.setBackgroundColor(getResources().getColor(h9c0.f108366e0));
        return viewInflate;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.p3i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150408a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_third_party_payment";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.pageHelper.m152782q(pageId());
        this.pageHelper.m152781p(jyb.m147494Y("payment_show_from", getIntent().getStringExtra("from")), jyb.m147494Y("third_party_name", "codapay"));
    }
}
