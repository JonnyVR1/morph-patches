package com.p046p1.mobile.putong.core.p053ui.verification;

import android.content.Intent;
import com.cosmos.photon.push.channel.ChannelConstant;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.gsw;
import p149l.rsw;

/* JADX INFO: loaded from: classes9.dex */
public class ManualFaceVerificationAct extends PutongMvpAct<gsw, rsw> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m55987Y1(Act act, String str) {
        Intent intent = new Intent(act, (Class<?>) ManualFaceVerificationAct.class);
        intent.putExtra(ChannelConstant.Keys.KEY_TOKEN, str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public gsw mo28672V1() {
        return new gsw(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public rsw mo28673X1() {
        return new rsw(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_avatar_verification_video";
    }
}
