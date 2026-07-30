package com.p046p1.mobile.putong.core.newui.voicecall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import java.util.ArrayList;
import p149l.d30;
import p149l.e30;
import p149l.j760;
import p149l.lsm0;
import p149l.mtm0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceCallAct extends PutongMvpAct<lsm0, mtm0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m43824Z1(Context context) {
        return new Intent(context, (Class<?>) VoiceCallAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public lsm0 mo28672V1() {
        return new lsm0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public mtm0 mo28673X1() {
        return new mtm0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public ArrayList<j760<String, d30>> debugItems() {
        return super.debugItems();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.olm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144519a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        ((lsm0) this.f17172c).m151617I0();
    }
}
