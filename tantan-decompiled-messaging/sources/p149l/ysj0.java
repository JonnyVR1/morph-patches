package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfo;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftView;

/* JADX INFO: loaded from: classes4.dex */
public class ysj0 extends fsj0<UpgradeGiftView> {

    /* JADX INFO: renamed from: c */
    public BLiveUpgradeGiftInfo f199788c;

    public ysj0(BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo, lsj0 lsj0Var) {
        super(lsj0Var);
        this.f199788c = bLiveUpgradeGiftInfo;
        this.f99083a = lsj0Var;
        this.f99084b = bLiveUpgradeGiftInfo.name;
    }

    @Override // p149l.fsj0
    /* JADX INFO: renamed from: b */
    public int mo122952b() {
        return t6c0.f168564w6;
    }

    /* JADX INFO: renamed from: d */
    public BLiveUpgradeGiftInfo m215913d() {
        return this.f199788c;
    }

    @Override // p149l.fsj0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo122953c(UpgradeGiftView upgradeGiftView) {
        upgradeGiftView.m74360c(this);
    }
}
