package com.p000p1.mobile.putong.core.p001ui.gift.act;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongMvpAct;
import l.tsi0;
import p003l.hzj;
import p003l.ozj;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GiftWallOptAct extends PutongMvpAct<hzj, ozj> implements tsi0 {
    /* JADX INFO: renamed from: F */
    public boolean m2749F() {
        return false;
    }

    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public hzj m2750V1() {
        return new hzj(this);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public ozj m2751X1() {
        return new ozj(((Act) this).act);
    }

    public String pageId() {
        return "p_presentwall";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTransparentStatusBar() {
        super/*com.p1.mobile.putong.app.PutongAct*/.setTransparentStatusBar();
        PutongAct.setLightStatusBar(getWindow(), 1024);
    }

    public boolean shouldShowGradientStatusBar() {
        return false;
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
