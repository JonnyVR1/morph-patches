package com.p000p1.mobile.putong.core.p004ui.verification;

import android.content.Context;
import android.content.Intent;
import com.p000p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.android.app.Act;
import p006l.gsw;
import p006l.rsw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ManualFaceVerificationAct extends PutongMvpAct<gsw, rsw> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m9407Y1(Act act, String str) {
        Intent intent = new Intent((Context) act, (Class<?>) ManualFaceVerificationAct.class);
        intent.putExtra("key_token", str);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public gsw mo571V1() {
        return new gsw(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public rsw mo572X1() {
        return new rsw(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_avatar_verification_video";
    }
}
