package p002l;

import com.p000p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftPagerItemView;
import com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xsj0 extends fsj0<UpgradeGiftPagerItemView> {

    /* JADX INFO: renamed from: c */
    public BLiveUpgradeGiftInfoItem f22446c;

    /* JADX INFO: renamed from: d */
    public String f22447d;

    public xsj0(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem, String str, lsj0 lsj0Var) {
        super(lsj0Var);
        this.f22446c = bLiveUpgradeGiftInfoItem;
        this.f22447d = str;
    }

    @Override // p002l.fsj0
    /* JADX INFO: renamed from: b */
    public int mo13483b() {
        return t6c0.f20047v6;
    }

    /* JADX INFO: renamed from: d */
    public BLiveUpgradeGiftInfoItem m26104d() {
        return this.f22446c;
    }

    /* JADX INFO: renamed from: e */
    public String m26105e() {
        return this.f22447d;
    }

    /* JADX INFO: renamed from: f */
    public boolean m26106f() {
        return this.f22446c.isEquipped();
    }

    @Override // p002l.fsj0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo13484c(UpgradeGiftPagerItemView upgradeGiftPagerItemView) {
        upgradeGiftPagerItemView.m7916o0(this);
    }
}
