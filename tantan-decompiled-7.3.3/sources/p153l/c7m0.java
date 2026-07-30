package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveUserDressUp;
import com.p051p1.mobile.putong.live.livingroom.virtual.userCard.dressup.VirtualUserDressUpItemView;

/* JADX INFO: loaded from: classes5.dex */
public class c7m0 extends d3q<VirtualUserDressUpItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveUserDressUp f80120a;

    /* JADX INFO: renamed from: b */
    public y20<BLiveUserDressUp> f80121b;

    public c7m0(BLiveUserDressUp bLiveUserDressUp, y20<BLiveUserDressUp> y20Var) {
        this.f80120a = bLiveUserDressUp;
        this.f80121b = y20Var;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VirtualUserDressUpItemView virtualUserDressUpItemView) {
        super.mo71749u(virtualUserDressUpItemView);
        virtualUserDressUpItemView.m78744c(this.f80120a, this.f80121b);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199219q7;
    }
}
