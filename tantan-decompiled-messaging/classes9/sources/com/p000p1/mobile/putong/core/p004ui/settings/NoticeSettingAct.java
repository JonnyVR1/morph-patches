package com.p000p1.mobile.putong.core.p004ui.settings;

import com.p000p1.mobile.putong.app.PutongMvpAct;
import l.jq2;
import l.s7m;
import p006l.bp40;
import p006l.np40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NoticeSettingAct extends PutongMvpAct {
    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: V1 */
    public jq2 mo571V1() {
        return new bp40(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: X1 */
    public s7m mo572X1() {
        return new np40(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_push_setting";
    }
}
