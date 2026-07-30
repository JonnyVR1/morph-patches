package com.p046p1.mobile.putong.core.p053ui.gift.act;

import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.hzj;
import p149l.ozj;
import p149l.tsi0;

/* JADX INFO: loaded from: classes10.dex */
public class GiftWallOptAct extends PutongMvpAct<hzj, ozj> implements tsi0 {
    @Override // p149l.tsi0
    /* JADX INFO: renamed from: F */
    public boolean mo36583F() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public hzj mo28672V1() {
        return new hzj(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public ozj mo28673X1() {
        return new ozj(this.act);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_presentwall";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        super.setTransparentStatusBar();
        PutongAct.setLightStatusBar(getWindow(), 1024);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
