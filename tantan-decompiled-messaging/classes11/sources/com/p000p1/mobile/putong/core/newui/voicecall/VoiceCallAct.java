package com.p000p1.mobile.putong.core.newui.voicecall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p1.mobile.putong.app.PutongMvpAct;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.j760;
import p009l.lsm0;
import p009l.mtm0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceCallAct extends PutongMvpAct<lsm0, mtm0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m8088Z1(Context context) {
        return new Intent(context, (Class<?>) VoiceCallAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public lsm0 m8089V1() {
        return new lsm0(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public mtm0 m8090X1() {
        return new mtm0(this);
    }

    public ArrayList<j760<String, d30>> debugItems() {
        return super/*com.p1.mobile.putong.app.PutongAct*/.debugItems();
    }

    public boolean disableAutoPV() {
        return true;
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.olm0
            public final void call(Object obj) {
                this.f18136a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        ((lsm0) ((PutongMvpAct) this).c).m18031I0();
    }
}
