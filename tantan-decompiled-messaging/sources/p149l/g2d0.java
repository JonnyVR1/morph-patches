package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveRightAnchorInfo;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightEquipAnchorItemView;

/* JADX INFO: loaded from: classes13.dex */
public class g2d0 extends d1q<RightEquipAnchorItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveRightAnchorInfo f100257a;

    /* JADX INFO: renamed from: b */
    public boolean f100258b;

    public g2d0(BLiveRightAnchorInfo bLiveRightAnchorInfo) {
        this.f100257a = bLiveRightAnchorInfo;
        this.f100258b = bLiveRightAnchorInfo.isEquipped();
    }

    /* JADX INFO: renamed from: H */
    public boolean m124147H() {
        return !this.f100257a.isEquipped() && this.f100258b;
    }

    /* JADX INFO: renamed from: I */
    public boolean m124148I() {
        return this.f100257a.isEquipped() && !this.f100258b;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo70566u(RightEquipAnchorItemView rightEquipAnchorItemView) {
        super.mo70566u(rightEquipAnchorItemView);
        rightEquipAnchorItemView.m70593k0(this);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162741d1;
    }
}
