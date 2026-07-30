package com.p000p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongMvpAct;
import l.e30;
import p009l.rbw;
import p009l.wcw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LoveLetterAct extends PutongMvpAct<rbw, wcw> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m3615Z1(Act act) {
        return new Intent((Context) act, (Class<?>) LoveLetterAct.class);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m3616a2(Act act, String str, String str2) {
        Intent intent = new Intent((Context) act, (Class<?>) LoveLetterAct.class);
        intent.putExtra("extra_user_id", str);
        intent.putExtra("extra_msg_id", str2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        setTransparentStatusBar();
        setLightStatusBar(16);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public rbw m3617V1() {
        return new rbw(this);
    }

    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public wcw m3618X1() {
        return new wcw(this);
    }

    public boolean disableAutoPV() {
        return true;
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.x9w
            public final void call(Object obj) {
                this.f22485a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }
}
