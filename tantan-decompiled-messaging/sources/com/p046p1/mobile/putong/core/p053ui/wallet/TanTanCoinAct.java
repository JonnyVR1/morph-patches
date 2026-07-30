package com.p046p1.mobile.putong.core.p053ui.wallet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import p149l.b1c0;
import p149l.e30;
import p149l.m6c0;
import p149l.tsi0;
import p149l.z4c0;

/* JADX INFO: loaded from: classes9.dex */
public class TanTanCoinAct extends PutongAct implements tsi0 {
    /* JADX INFO: renamed from: X1 */
    public static Intent m58077X1(Context context) {
        return m58078Y1(context, false);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m58078Y1(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) TanTanCoinAct.class);
        intent.putExtra("show_recharge_dialog", z);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (fragmentManager().m2554h0(z4c0.f201471G0) == null) {
            fragmentManager().m2567m().m2811s(z4c0.f201471G0, TanTanCoinFrag.m58093O4(shouldShowGradientStatusBar(), getIntent().getBooleanExtra("show_recharge_dialog", false))).mo2707i();
            fragmentManager().m2545e0();
        }
    }

    @Override // p149l.tsi0
    /* JADX INFO: renamed from: F */
    public boolean mo36583F() {
        return false;
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
        creates(new e30() { // from class: l.yuh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200082a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return OMSDialogPositon.p_wallet;
    }
}
