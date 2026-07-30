package com.p000p1.mobile.putong.core.p004ui.wallet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import l.b1c0;
import l.e30;
import l.m6c0;
import l.tsi0;
import l.z4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TanTanCoinAct extends PutongAct implements tsi0 {
    /* JADX INFO: renamed from: X1 */
    public static Intent m11602X1(Context context) {
        return m11603Y1(context, false);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m11603Y1(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) TanTanCoinAct.class);
        intent.putExtra("show_recharge_dialog", z);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (fragmentManager().h0(z4c0.G0) == null) {
            fragmentManager().m().s(z4c0.G0, TanTanCoinFrag.m11625O4(shouldShowGradientStatusBar(), getIntent().getBooleanExtra("show_recharge_dialog", false))).i();
            fragmentManager().e0();
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m11604F() {
        return false;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.K2, (ViewGroup) null);
        viewInflate.setBackgroundColor(getResources().getColor(b1c0.e0));
        return viewInflate;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.yuh0
            public final void call(Object obj) {
                this.f28395a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_wallet";
    }
}
