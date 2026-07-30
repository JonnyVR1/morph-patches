package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftActInfo;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftWebView;

/* JADX INFO: loaded from: classes4.dex */
public class a3k0 extends i1k0<UpgradeGiftWebView> {

    /* JADX INFO: renamed from: c */
    public BLiveUpgradeGiftActInfo f68295c;

    public a3k0(BLiveUpgradeGiftActInfo bLiveUpgradeGiftActInfo, o1k0 o1k0Var) {
        super(o1k0Var);
        this.f68295c = bLiveUpgradeGiftActInfo;
        this.f112533b = bLiveUpgradeGiftActInfo.name;
    }

    @Override // p153l.i1k0
    /* JADX INFO: renamed from: b */
    public int mo95708b() {
        return yec0.f199309x6;
    }

    /* JADX INFO: renamed from: d */
    public BLiveUpgradeGiftActInfo m95805d() {
        return this.f68295c;
    }

    @Override // p153l.i1k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo95709c(UpgradeGiftWebView upgradeGiftWebView) {
        upgradeGiftWebView.m75551g(this);
    }
}
