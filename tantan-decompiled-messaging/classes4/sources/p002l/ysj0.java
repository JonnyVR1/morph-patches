package p002l;

import com.p000p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftView;
import com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ysj0 extends fsj0<UpgradeGiftView> {

    /* JADX INFO: renamed from: c */
    public BLiveUpgradeGiftInfo f23068c;

    public ysj0(BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo, lsj0 lsj0Var) {
        super(lsj0Var);
        this.f23068c = bLiveUpgradeGiftInfo;
        this.f10626a = lsj0Var;
        this.f10627b = bLiveUpgradeGiftInfo.name;
    }

    @Override // p002l.fsj0
    /* JADX INFO: renamed from: b */
    public int mo13483b() {
        return t6c0.f20060w6;
    }

    /* JADX INFO: renamed from: d */
    public BLiveUpgradeGiftInfo m26916d() {
        return this.f23068c;
    }

    @Override // p002l.fsj0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo13484c(UpgradeGiftView upgradeGiftView) {
        upgradeGiftView.m7941c(this);
    }
}
