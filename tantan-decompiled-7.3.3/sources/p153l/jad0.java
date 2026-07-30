package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveRightAnchorInfo;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightEquipAnchorItemView;

/* JADX INFO: loaded from: classes9.dex */
public class jad0 extends d3q<RightEquipAnchorItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveRightAnchorInfo f118975a;

    /* JADX INFO: renamed from: b */
    public boolean f118976b;

    public jad0(BLiveRightAnchorInfo bLiveRightAnchorInfo) {
        this.f118975a = bLiveRightAnchorInfo;
        this.f118976b = bLiveRightAnchorInfo.isEquipped();
    }

    /* JADX INFO: renamed from: H */
    public boolean m144013H() {
        return !this.f118975a.isEquipped() && this.f118976b;
    }

    /* JADX INFO: renamed from: I */
    public boolean m144014I() {
        return this.f118975a.isEquipped() && !this.f118976b;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71749u(RightEquipAnchorItemView rightEquipAnchorItemView) {
        super.mo71749u(rightEquipAnchorItemView);
        rightEquipAnchorItemView.m71776k0(this);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193855d1;
    }
}
