package com.p051p1.mobile.putong.core.newui.loveletter;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.pdw;
import p153l.uew;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterAct extends PutongMvpAct<pdw, uew> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m40549a2(Act act) {
        return new Intent(act, (Class<?>) LoveLetterAct.class);
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m40550b2(Act act, String str, String str2) {
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

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public pdw mo29671X1() {
        return new pdw(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public uew mo29672Y1() {
        return new uew(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.vbw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183296a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }
}
