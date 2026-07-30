package p002l;

import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationItemView;
import com.p1.mobile.putong.live.base.data.BLiveOperationItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ps50 extends zp2<OperationItemView, os50> {
    public ps50(bsm bsmVar) {
        super(bsmVar);
    }

    @Override // p002l.zyl
    /* JADX INFO: renamed from: a */
    public int mo20649a() {
        return t6c0.f19592L4;
    }

    @Override // p002l.zyl
    /* JADX INFO: renamed from: c */
    public void mo20651c(BLiveOperationItem bLiveOperationItem) {
        ((OperationItemView) this.f23532c).mo8662a(bLiveOperationItem);
    }

    @Override // p002l.zyl
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public os50 mo20650b(BLiveOperationItem bLiveOperationItem) {
        return new os50(this.f23530a, bLiveOperationItem);
    }
}
