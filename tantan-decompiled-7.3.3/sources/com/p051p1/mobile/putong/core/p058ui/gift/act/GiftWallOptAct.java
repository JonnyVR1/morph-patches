package com.p051p1.mobile.putong.core.p058ui.gift.act;

import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.e2k;
import p153l.w1j0;
import p153l.x1k;

/* JADX INFO: loaded from: classes3.dex */
public class GiftWallOptAct extends PutongMvpAct<x1k, e2k> implements w1j0 {
    @Override // p153l.w1j0
    /* JADX INFO: renamed from: G */
    public boolean mo37586G() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public x1k mo29671X1() {
        return new x1k(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public e2k mo29672Y1() {
        return new e2k(this.act);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_presentwall";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        super.setTransparentStatusBar();
        PutongAct.setLightStatusBar(getWindow(), 1024);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
