package p149l;

import com.p046p1.mobile.putong.live.base.data.BLivePKCardItem;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.LivePkCardShowItemView;

/* JADX INFO: loaded from: classes5.dex */
public class cl4 extends d1q<LivePkCardShowItemView> {

    /* JADX INFO: renamed from: a */
    public BLivePKCardItem f81366a;

    public cl4(BLivePKCardItem bLivePKCardItem) {
        this.f81366a = bLivePKCardItem;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LivePkCardShowItemView livePkCardShowItemView) {
        super.mo70566u(livePkCardShowItemView);
        livePkCardShowItemView.m76139i0(this.f81366a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return v050.m196470a(this.f81366a, ((cl4) obj).f81366a);
    }

    public int hashCode() {
        BLivePKCardItem bLivePKCardItem = this.f81366a;
        return v050.m196471b(bLivePKCardItem.name, bLivePKCardItem.icon);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f167963A3;
    }
}
