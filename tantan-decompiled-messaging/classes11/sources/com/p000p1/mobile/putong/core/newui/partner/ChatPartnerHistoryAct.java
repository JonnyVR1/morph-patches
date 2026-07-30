package com.p000p1.mobile.putong.core.newui.partner;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongMvpAct;
import p009l.b05;
import p009l.e05;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ChatPartnerHistoryAct extends PutongMvpAct<b05, e05> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m7308Y1(Act act) {
        return new Intent((Context) act, (Class<?>) ChatPartnerHistoryAct.class);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public b05 m7309V1() {
        return new b05(this);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public e05 m7310X1() {
        return new e05(this);
    }

    public String pageId() {
        return "p_chatting_partner_signal_list";
    }
}
