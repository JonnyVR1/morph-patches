package com.p051p1.mobile.putong.live.external.internal.vchat.recharge;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import java.util.Objects;
import p153l.isu;
import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatRechargeAct extends PutongAct {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m70867Y1(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) LiveVChatRechargeAct.class);
        intent.putExtra("live_is_no_balance", z);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m70868Z1(Context context, boolean z, int i) {
        Intent intent = new Intent(context, (Class<?>) LiveVChatRechargeAct.class);
        intent.putExtra("live_is_no_balance", z);
        intent.putExtra("incoming_price", i);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m70869a2() {
        act().setResult(1);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        overridePendingTransition(0, 0);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        boolean booleanExtra = getIntent().getBooleanExtra("live_is_no_balance", false);
        isu.C17796c c17796cM141968e = new isu.C17796c(this.act).m141965b(booleanExtra).m141966c(getIntent().getIntExtra("incoming_price", 0)).m141968e(new x20() { // from class: l.lru
            @Override // p153l.x20
            public final void call() {
                this.f133366a.m70869a2();
            }
        });
        final Act act = this.act;
        Objects.requireNonNull(act);
        c17796cM141968e.m141967d(new x20() { // from class: l.mru
            @Override // p153l.x20
            public final void call() {
                act.lambda$debugItems$19();
            }
        }).m141969f();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }
}
