package com.p051p1.mobile.putong.core.p058ui.messages.question;

import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.edm;
import p153l.tcm;

/* JADX INFO: loaded from: classes4.dex */
public class IceBreakingQuestionEditAct extends PutongMvpAct<tcm, edm> {
    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public tcm mo29671X1() {
        return new tcm(this, this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public edm mo29672Y1() {
        return new edm(this);
    }

    /* JADX INFO: renamed from: b2 */
    public void m50776b2() {
        super.lambda$debugItems$19();
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        ((tcm) this.f17891c).m190478n0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_chat_topics_setting";
    }
}
