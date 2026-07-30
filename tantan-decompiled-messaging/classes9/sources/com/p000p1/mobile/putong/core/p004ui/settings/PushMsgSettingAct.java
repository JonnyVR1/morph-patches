package com.p000p1.mobile.putong.core.p004ui.settings;

import com.p000p1.mobile.putong.app.PutongMvpAct;
import l.jq2;
import l.s7m;
import p006l.nfb0;
import p006l.seb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PushMsgSettingAct extends PutongMvpAct {
    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: V1 */
    public jq2 mo571V1() {
        return new seb0(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: X1 */
    public s7m mo572X1() {
        return new nfb0(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_message_push_settings";
    }
}
