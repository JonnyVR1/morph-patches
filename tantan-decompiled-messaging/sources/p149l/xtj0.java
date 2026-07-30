package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftActInfo;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftWebView;

/* JADX INFO: loaded from: classes4.dex */
public class xtj0 extends fsj0<UpgradeGiftWebView> {

    /* JADX INFO: renamed from: c */
    public BLiveUpgradeGiftActInfo f194394c;

    public xtj0(BLiveUpgradeGiftActInfo bLiveUpgradeGiftActInfo, lsj0 lsj0Var) {
        super(lsj0Var);
        this.f194394c = bLiveUpgradeGiftActInfo;
        this.f99084b = bLiveUpgradeGiftActInfo.name;
    }

    @Override // p149l.fsj0
    /* JADX INFO: renamed from: b */
    public int mo122952b() {
        return t6c0.f168577x6;
    }

    /* JADX INFO: renamed from: d */
    public BLiveUpgradeGiftActInfo m210972d() {
        return this.f194394c;
    }

    @Override // p149l.fsj0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo122953c(UpgradeGiftWebView upgradeGiftWebView) {
        upgradeGiftWebView.m74368g(this);
    }
}
