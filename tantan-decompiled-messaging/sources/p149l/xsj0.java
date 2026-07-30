package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftPagerItemView;

/* JADX INFO: loaded from: classes4.dex */
public class xsj0 extends fsj0<UpgradeGiftPagerItemView> {

    /* JADX INFO: renamed from: c */
    public BLiveUpgradeGiftInfoItem f194280c;

    /* JADX INFO: renamed from: d */
    public String f194281d;

    public xsj0(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem, String str, lsj0 lsj0Var) {
        super(lsj0Var);
        this.f194280c = bLiveUpgradeGiftInfoItem;
        this.f194281d = str;
    }

    @Override // p149l.fsj0
    /* JADX INFO: renamed from: b */
    public int mo122952b() {
        return t6c0.f168551v6;
    }

    /* JADX INFO: renamed from: d */
    public BLiveUpgradeGiftInfoItem m210777d() {
        return this.f194280c;
    }

    /* JADX INFO: renamed from: e */
    public String m210778e() {
        return this.f194281d;
    }

    /* JADX INFO: renamed from: f */
    public boolean m210779f() {
        return this.f194280c.isEquipped();
    }

    @Override // p149l.fsj0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo122953c(UpgradeGiftPagerItemView upgradeGiftPagerItemView) {
        upgradeGiftPagerItemView.m74335o0(this);
    }
}
