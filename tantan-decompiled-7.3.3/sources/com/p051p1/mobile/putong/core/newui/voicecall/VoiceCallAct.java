package com.p051p1.mobile.putong.core.newui.voicecall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import java.util.ArrayList;
import p153l.p1n0;
import p153l.pf60;
import p153l.q2n0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceCallAct extends PutongMvpAct<p1n0, q2n0> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m45010a2(Context context) {
        return new Intent(context, (Class<?>) VoiceCallAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public p1n0 mo29671X1() {
        return new p1n0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public q2n0 mo29672Y1() {
        return new q2n0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public ArrayList<pf60<String, x20>> debugItems() {
        return super.debugItems();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.sum0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170699a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        ((p1n0) this.f17891c).m170237I0();
    }
}
