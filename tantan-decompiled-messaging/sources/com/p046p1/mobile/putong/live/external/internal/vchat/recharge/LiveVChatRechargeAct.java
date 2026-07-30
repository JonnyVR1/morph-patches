package com.p046p1.mobile.putong.live.external.internal.vchat.recharge;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import java.util.Objects;
import p149l.d30;
import p149l.hqu;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatRechargeAct extends PutongAct {
    /* JADX INFO: renamed from: X1 */
    public static Intent m69684X1(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) LiveVChatRechargeAct.class);
        intent.putExtra("live_is_no_balance", z);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m69685Y1(Context context, boolean z, int i) {
        Intent intent = new Intent(context, (Class<?>) LiveVChatRechargeAct.class);
        intent.putExtra("live_is_no_balance", z);
        intent.putExtra("incoming_price", i);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public /* synthetic */ void m69686Z1() {
        act().setResult(1);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        overridePendingTransition(0, 0);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        boolean booleanExtra = getIntent().getBooleanExtra("live_is_no_balance", false);
        hqu.C17377c c17377cM132583e = new hqu.C17377c(this.act).m132580b(booleanExtra).m132581c(getIntent().getIntExtra("incoming_price", 0)).m132583e(new d30() { // from class: l.kpu
            @Override // p149l.d30
            public final void call() {
                this.f124197a.m69686Z1();
            }
        });
        final Act act = this.act;
        Objects.requireNonNull(act);
        c17377cM132583e.m132582d(new d30() { // from class: l.lpu
            @Override // p149l.d30
            public final void call() {
                act.lambda$debugItems$19();
            }
        }).m132584f();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }
}
