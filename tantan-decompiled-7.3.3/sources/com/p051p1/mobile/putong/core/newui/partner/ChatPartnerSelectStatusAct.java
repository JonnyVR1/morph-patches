package com.p051p1.mobile.putong.core.newui.partner;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.b25;
import p153l.w15;

/* JADX INFO: loaded from: classes11.dex */
public class ChatPartnerSelectStatusAct extends PutongMvpAct<w15, b25> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m44120Z1(Act act) {
        return new Intent(act, (Class<?>) ChatPartnerSelectStatusAct.class);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public w15 mo29671X1() {
        return new w15(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public b25 mo29672Y1() {
        return new b25(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_chatting_partner_signal";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        super.setTransparentStatusBar();
        PutongAct.setLightStatusBar(act().getWindow(), 1024);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
