package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationItemView;

/* JADX INFO: loaded from: classes4.dex */
public class v060 extends qq2<OperationItemView, u060> {
    public v060(dum dumVar) {
        super(dumVar);
    }

    @Override // p153l.u1m
    /* JADX INFO: renamed from: a */
    public int mo194022a() {
        return yec0.f198828L4;
    }

    @Override // p153l.u1m
    /* JADX INFO: renamed from: c */
    public void mo194024c(BLiveOperationItem bLiveOperationItem) {
        ((OperationItemView) this.f158942c).mo76234a(bLiveOperationItem);
    }

    @Override // p153l.u1m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public u060 mo194023b(BLiveOperationItem bLiveOperationItem) {
        return new u060(this.f158940a, bLiveOperationItem);
    }
}
