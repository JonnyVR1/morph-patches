package com.p046p1.mobile.putong.core.newui.partner;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.c15;
import p149l.x05;

/* JADX INFO: loaded from: classes11.dex */
public class ChatPartnerSelectStatusAct extends PutongMvpAct<x05, c15> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m43109Y1(Act act) {
        return new Intent(act, (Class<?>) ChatPartnerSelectStatusAct.class);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public x05 mo28672V1() {
        return new x05(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public c15 mo28673X1() {
        return new c15(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_chatting_partner_signal";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        super.setTransparentStatusBar();
        PutongAct.setLightStatusBar(act().getWindow(), 1024);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
