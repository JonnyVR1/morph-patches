package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationItemView;

/* JADX INFO: loaded from: classes4.dex */
public class ps50 extends zp2<OperationItemView, os50> {
    public ps50(bsm bsmVar) {
        super(bsmVar);
    }

    @Override // p149l.zyl
    /* JADX INFO: renamed from: a */
    public int mo171106a() {
        return t6c0.f168096L4;
    }

    @Override // p149l.zyl
    /* JADX INFO: renamed from: c */
    public void mo171108c(BLiveOperationItem bLiveOperationItem) {
        ((OperationItemView) this.f204171c).mo75051a(bLiveOperationItem);
    }

    @Override // p149l.zyl
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public os50 mo171107b(BLiveOperationItem bLiveOperationItem) {
        return new os50(this.f204169a, bLiveOperationItem);
    }
}
