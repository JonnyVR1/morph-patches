package com.p051p1.mobile.putong.core.newui.partner;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.a15;
import p153l.d15;

/* JADX INFO: loaded from: classes11.dex */
public class ChatPartnerHistoryAct extends PutongMvpAct<a15, d15> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m44113Z1(Act act) {
        return new Intent(act, (Class<?>) ChatPartnerHistoryAct.class);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public a15 mo29671X1() {
        return new a15(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public d15 mo29672Y1() {
        return new d15(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_chatting_partner_signal_list";
    }
}
