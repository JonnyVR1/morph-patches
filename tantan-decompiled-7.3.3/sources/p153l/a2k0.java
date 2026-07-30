package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftPagerItemView;

/* JADX INFO: loaded from: classes4.dex */
public class a2k0 extends i1k0<UpgradeGiftPagerItemView> {

    /* JADX INFO: renamed from: c */
    public BLiveUpgradeGiftInfoItem f68008c;

    /* JADX INFO: renamed from: d */
    public String f68009d;

    public a2k0(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem, String str, o1k0 o1k0Var) {
        super(o1k0Var);
        this.f68008c = bLiveUpgradeGiftInfoItem;
        this.f68009d = str;
    }

    @Override // p153l.i1k0
    /* JADX INFO: renamed from: b */
    public int mo95708b() {
        return yec0.f199283v6;
    }

    /* JADX INFO: renamed from: d */
    public BLiveUpgradeGiftInfoItem m95710d() {
        return this.f68008c;
    }

    /* JADX INFO: renamed from: e */
    public String m95711e() {
        return this.f68009d;
    }

    /* JADX INFO: renamed from: f */
    public boolean m95712f() {
        return this.f68008c.isEquipped();
    }

    @Override // p153l.i1k0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo95709c(UpgradeGiftPagerItemView upgradeGiftPagerItemView) {
        upgradeGiftPagerItemView.m75518o0(this);
    }
}
