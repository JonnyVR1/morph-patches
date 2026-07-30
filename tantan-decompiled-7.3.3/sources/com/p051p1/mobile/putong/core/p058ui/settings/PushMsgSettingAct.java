package com.p051p1.mobile.putong.core.p058ui.settings;

import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.ar2;
import p153l.iam;
import p153l.rnb0;
import p153l.wmb0;

/* JADX INFO: loaded from: classes12.dex */
public class PushMsgSettingAct extends PutongMvpAct {
    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: X1 */
    public ar2 mo29671X1() {
        return new wmb0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1 */
    public iam mo29672Y1() {
        return new rnb0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_message_push_settings";
    }
}
