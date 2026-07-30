package com.p046p1.mobile.putong.core.p053ui.wallet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.api.C4745k;
import p149l.b1c0;
import p149l.e30;
import p149l.m6c0;
import p149l.vwb;
import p149l.z4c0;

/* JADX INFO: loaded from: classes9.dex */
public class TanTanCoinCheckstandAct extends PutongAct {
    /* JADX INFO: renamed from: X1 */
    public static Intent m58080X1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) TanTanCoinCheckstandAct.class);
        intent.putExtra("from", str);
        intent.putExtra("url", C4745k.m34179u3(str));
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (fragmentManager().m2554h0(z4c0.f201471G0) == null) {
            fragmentManager().m2567m().m2811s(z4c0.f201471G0, TanTanCoinCheckstandFrag.m58081M4(shouldShowGradientStatusBar(), getIntent().getStringExtra("url"))).mo2707i();
            fragmentManager().m2545e0();
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131500K2, (ViewGroup) null);
        viewInflate.setBackgroundColor(getResources().getColor(b1c0.f72546e0));
        return viewInflate;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.hvh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109645a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_third_party_payment";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.pageHelper.m109041q(pageId());
        this.pageHelper.m109040p(vwb.m200311Y("payment_show_from", getIntent().getStringExtra("from")), vwb.m200311Y("third_party_name", "codapay"));
    }
}
