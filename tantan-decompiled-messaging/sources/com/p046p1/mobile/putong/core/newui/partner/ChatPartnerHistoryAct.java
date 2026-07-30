package com.p046p1.mobile.putong.core.newui.partner;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.b05;
import p149l.e05;

/* JADX INFO: loaded from: classes11.dex */
public class ChatPartnerHistoryAct extends PutongMvpAct<b05, e05> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m43102Y1(Act act) {
        return new Intent(act, (Class<?>) ChatPartnerHistoryAct.class);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public b05 mo28672V1() {
        return new b05(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public e05 mo28673X1() {
        return new e05(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_chatting_partner_signal_list";
    }
}
