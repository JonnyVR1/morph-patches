package com.p046p1.mobile.putong.core.newui.loveletter;

import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.e30;
import p149l.rbw;
import p149l.wcw;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterAct extends PutongMvpAct<rbw, wcw> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m39546Z1(Act act) {
        return new Intent(act, (Class<?>) LoveLetterAct.class);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m39547a2(Act act, String str, String str2) {
        Intent intent = new Intent(act, (Class<?>) LoveLetterAct.class);
        intent.putExtra("extra_user_id", str);
        intent.putExtra("extra_msg_id", str2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        setTransparentStatusBar();
        setLightStatusBar(16);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public rbw mo28672V1() {
        return new rbw(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public wcw mo28673X1() {
        return new wcw(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.x9w
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191663a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }
}
