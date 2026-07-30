package com.p046p1.mobile.putong.core.p053ui.settings;

import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.jq2;
import p149l.pv4;
import p149l.s7m;
import p149l.sv4;

/* JADX INFO: loaded from: classes9.dex */
public class ChatInputSettingAct extends PutongMvpAct {
    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: V1 */
    public jq2 mo28672V1() {
        return new pv4(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: X1 */
    public s7m mo28673X1() {
        return new sv4(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_chat_keyboard_setting";
    }
}
