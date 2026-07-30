package com.p046p1.mobile.putong.core.p053ui.settings;

import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.jq2;
import p149l.nfb0;
import p149l.s7m;
import p149l.seb0;

/* JADX INFO: loaded from: classes9.dex */
public class PushMsgSettingAct extends PutongMvpAct {
    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: V1 */
    public jq2 mo28672V1() {
        return new seb0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: X1 */
    public s7m mo28673X1() {
        return new nfb0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_message_push_settings";
    }
}
