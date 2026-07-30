package com.p000p1.mobile.putong.core.p004ui.wallet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.api.C0171k;
import l.b1c0;
import l.e30;
import l.j760;
import l.m6c0;
import l.vwb;
import l.z4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TanTanCoinCheckstandAct extends PutongAct {
    /* JADX INFO: renamed from: X1 */
    public static Intent m11606X1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) TanTanCoinCheckstandAct.class);
        intent.putExtra("from", str);
        intent.putExtra("url", C0171k.m6116u3(str));
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (fragmentManager().h0(z4c0.G0) == null) {
            fragmentManager().m().s(z4c0.G0, TanTanCoinCheckstandFrag.m11607M4(shouldShowGradientStatusBar(), getIntent().getStringExtra("url"))).i();
            fragmentManager().e0();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.K2, (ViewGroup) null);
        viewInflate.setBackgroundColor(getResources().getColor(b1c0.e0));
        return viewInflate;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.hvh0
            public final void call(Object obj) {
                this.f14101a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_third_party_payment";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.pageHelper.q(pageId());
        this.pageHelper.p(new j760[]{vwb.Y("payment_show_from", getIntent().getStringExtra("from")), vwb.Y("third_party_name", "codapay")});
    }
}
