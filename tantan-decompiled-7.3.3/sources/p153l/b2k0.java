package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfo;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftView;

/* JADX INFO: loaded from: classes4.dex */
public class b2k0 extends i1k0<UpgradeGiftView> {

    /* JADX INFO: renamed from: c */
    public BLiveUpgradeGiftInfo f74637c;

    public b2k0(BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo, o1k0 o1k0Var) {
        super(o1k0Var);
        this.f74637c = bLiveUpgradeGiftInfo;
        this.f112532a = o1k0Var;
        this.f112533b = bLiveUpgradeGiftInfo.name;
    }

    @Override // p153l.i1k0
    /* JADX INFO: renamed from: b */
    public int mo95708b() {
        return yec0.f199296w6;
    }

    /* JADX INFO: renamed from: d */
    public BLiveUpgradeGiftInfo m102201d() {
        return this.f74637c;
    }

    @Override // p153l.i1k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo95709c(UpgradeGiftView upgradeGiftView) {
        upgradeGiftView.m75543c(this);
    }
}
