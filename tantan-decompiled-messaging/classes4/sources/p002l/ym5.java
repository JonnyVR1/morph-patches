package p002l;

import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import java.util.Objects;
import l.e30;
import l.fld0;
import l.ggv;
import l.q2f;
import l.qnq;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ym5 implements htl {

    /* JADX INFO: renamed from: a */
    public final String f22970a;

    /* JADX INFO: renamed from: b */
    public final String f22971b;

    /* JADX INFO: renamed from: c */
    public final e30<String> f22972c;

    public ym5(String str, String str2, e30<String> e30Var) {
        this.f22970a = str;
        this.f22971b = str2;
        this.f22972c = e30Var;
    }

    @Override // p002l.htl
    /* JADX INFO: renamed from: a */
    public void mo14806a(h4t h4tVar, String str, final zfv.C0940a.a aVar) {
        q2f.d dVarSendGift = h4tVar.m25548F2().SendGiftEventGroup.sendGift();
        cfe0.C0512a c0512a = new cfe0.C0512a();
        BLiveGiftItem bLiveGiftItemM = ((ggv) ypv.l(fld0.c)).m(str);
        Objects.requireNonNull(aVar);
        dVarSendGift.j(c0512a.m10985w(bLiveGiftItemM, new vm5(aVar), new e30() { // from class: l.wm5
            public final void call(Object obj) {
                aVar.mo5857c();
            }
        }, new e30() { // from class: l.xm5
            public final void call(Object obj) {
                aVar.mo5857c();
            }
        }, true, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("fans"))));
    }

    @Override // p002l.htl
    /* JADX INFO: renamed from: b */
    public qnq mo14807b() {
        return new qnq(this.f22971b, this.f22972c);
    }
}
