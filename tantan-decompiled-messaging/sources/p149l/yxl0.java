package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveUserDressUp;
import com.p046p1.mobile.putong.live.livingroom.virtual.userCard.dressup.VirtualUserDressUpItemView;

/* JADX INFO: loaded from: classes5.dex */
public class yxl0 extends d1q<VirtualUserDressUpItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveUserDressUp f200635a;

    /* JADX INFO: renamed from: b */
    public e30<BLiveUserDressUp> f200636b;

    public yxl0(BLiveUserDressUp bLiveUserDressUp, e30<BLiveUserDressUp> e30Var) {
        this.f200635a = bLiveUserDressUp;
        this.f200636b = e30Var;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VirtualUserDressUpItemView virtualUserDressUpItemView) {
        super.mo70566u(virtualUserDressUpItemView);
        virtualUserDressUpItemView.m77561c(this.f200635a, this.f200636b);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168487q7;
    }
}
