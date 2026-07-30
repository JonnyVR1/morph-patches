package com.p046p1.mobile.putong.core.p053ui.messages.question;

import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.dam;
import p149l.oam;

/* JADX INFO: loaded from: classes4.dex */
public class IceBreakingQuestionEditAct extends PutongMvpAct<dam, oam> {
    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public dam mo28672V1() {
        return new dam(this, this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public oam mo28673X1() {
        return new oam(this);
    }

    /* JADX INFO: renamed from: a2 */
    public void m49593a2() {
        super.lambda$debugItems$19();
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        ((dam) this.f17172c).m110624n0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_chat_topics_setting";
    }
}
