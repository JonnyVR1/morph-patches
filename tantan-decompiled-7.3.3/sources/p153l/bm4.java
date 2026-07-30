package p153l;

import com.p051p1.mobile.putong.live.base.data.BLivePKCardItem;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.LivePkCardShowItemView;

/* JADX INFO: loaded from: classes5.dex */
public class bm4 extends d3q<LivePkCardShowItemView> {

    /* JADX INFO: renamed from: a */
    public BLivePKCardItem f77255a;

    public bm4(BLivePKCardItem bLivePKCardItem) {
        this.f77255a = bLivePKCardItem;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LivePkCardShowItemView livePkCardShowItemView) {
        super.mo71749u(livePkCardShowItemView);
        livePkCardShowItemView.m77322i0(this.f77255a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return k950.m148863a(this.f77255a, ((bm4) obj).f77255a);
    }

    public int hashCode() {
        BLivePKCardItem bLivePKCardItem = this.f77255a;
        return k950.m148864b(bLivePKCardItem.name, bLivePKCardItem.icon);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198695A3;
    }
}
