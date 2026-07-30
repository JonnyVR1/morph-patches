package com.p000p1.mobile.putong.core.newui.partner;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongMvpAct;
import p009l.c15;
import p009l.x05;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ChatPartnerSelectStatusAct extends PutongMvpAct<x05, c15> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m7319Y1(Act act) {
        return new Intent((Context) act, (Class<?>) ChatPartnerSelectStatusAct.class);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public x05 m7320V1() {
        return new x05(this);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public c15 m7321X1() {
        return new c15(this);
    }

    public String pageId() {
        return "p_chatting_partner_signal";
    }

    public void setTransparentStatusBar() {
        super/*com.p1.mobile.putong.app.PutongAct*/.setTransparentStatusBar();
        PutongAct.setLightStatusBar(act().getWindow(), 1024);
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
