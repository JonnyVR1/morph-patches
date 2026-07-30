package com.p051p1.mobile.putong.core.p058ui.wallet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import p153l.fdc0;
import p153l.h9c0;
import p153l.rec0;
import p153l.w1j0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class TanTanCoinAct extends PutongAct implements w1j0 {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m59260Y1(Context context) {
        return m59261Z1(context, false);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m59261Z1(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) TanTanCoinAct.class);
        intent.putExtra("show_recharge_dialog", z);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (fragmentManager().m2555h0(fdc0.f98347G0) == null) {
            fragmentManager().m2568m().m2812s(fdc0.f98347G0, TanTanCoinFrag.m59276O4(shouldShowGradientStatusBar(), getIntent().getBooleanExtra("show_recharge_dialog", false))).mo2708i();
            fragmentManager().m2546e0();
        }
    }

    @Override // p153l.w1j0
    /* JADX INFO: renamed from: G */
    public boolean mo37586G() {
        return false;
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
        creates(new y20() { // from class: l.g3i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101992a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return OMSDialogPositon.p_wallet;
    }
}
