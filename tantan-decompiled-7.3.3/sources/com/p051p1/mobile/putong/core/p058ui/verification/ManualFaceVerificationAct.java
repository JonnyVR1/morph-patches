package com.p051p1.mobile.putong.core.p058ui.verification;

import android.content.Intent;
import com.cosmos.photon.push.channel.ChannelConstant;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.fvw;
import p153l.qvw;

/* JADX INFO: loaded from: classes12.dex */
public class ManualFaceVerificationAct extends PutongMvpAct<fvw, qvw> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m57170Z1(Act act, String str) {
        Intent intent = new Intent(act, (Class<?>) ManualFaceVerificationAct.class);
        intent.putExtra(ChannelConstant.Keys.KEY_TOKEN, str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public fvw mo29671X1() {
        return new fvw(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public qvw mo29672Y1() {
        return new qvw(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_avatar_verification_video";
    }
}
