package com.p000p1.mobile.putong.core.p001ui.messages.question;

import com.p1.mobile.putong.app.PutongMvpAct;
import p002l.dam;
import p002l.oam;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class IceBreakingQuestionEditAct extends PutongMvpAct<dam, oam> {
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public dam m0V1() {
        return new dam(this, this);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public oam m1X1() {
        return new oam(this);
    }

    /* JADX INFO: renamed from: a2 */
    public void m4a2() {
        super/*com.p1.mobile.android.app.Act*/.finish();
    }

    public void finish() {
        ((dam) ((PutongMvpAct) this).c).m11725n0();
    }

    public String pageId() {
        return "p_chat_topics_setting";
    }
}
