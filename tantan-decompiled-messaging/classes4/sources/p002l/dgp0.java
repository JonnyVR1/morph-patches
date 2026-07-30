package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p1.mobile.android.app.Act;
import l.c4g0;
import l.e30;
import l.egp0;
import l.ffw;
import l.mkd0;
import l.mqi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dgp0 extends lcr {

    /* JADX INFO: renamed from: g */
    public final String f9250g;

    /* JADX INFO: renamed from: h */
    public long f9251h;

    /* JADX INFO: renamed from: i */
    public boolean f9252i;

    /* JADX INFO: renamed from: j */
    public c4g0 f9253j;

    public dgp0(RoomFrag roomFrag, String str) {
        super(roomFrag);
        this.f9252i = false;
        this.f9250g = str;
        m11880L2();
    }

    @Override // p002l.lcr
    /* JADX INFO: renamed from: E2 */
    public void mo11878E2(bsm bsmVar) {
        super.mo11878E2(bsmVar);
        egp0.a(bsmVar.f8339h, "liveroom", "ending", mqi0.o() - this.f9251h, this.f9250g, bsmVar.f8339h.m14495D0());
    }

    @Override // p002l.lcr
    /* JADX INFO: renamed from: F2 */
    public void mo11879F2(bsm bsmVar) {
        super.mo11879F2(bsmVar);
        D d = bsmVar.f8339h;
        egp0.a(d, "liveroom", "start", 0L, this.f9250g, d.m14495D0());
        this.f9251h = mqi0.o();
    }

    /* JADX INFO: renamed from: L2 */
    public final void m11880L2() {
        this.f9253j = Act.foreground().skip(1).subscribe(ffw.d(new e30() { // from class: l.cgp0
            public final void call(Object obj) {
                this.f8663a.m11881M2((Act.r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m11881M2(Act.r rVar) {
        if (m17134D2() == null || this.f14767e.m5169R4().m17072Q0()) {
            return;
        }
        D d = m17134D2().f8339h;
        if (rVar == null) {
            this.f9252i = true;
            egp0.a(d, "liveroom", "ending", mqi0.o() - this.f9251h, this.f9250g, d.m14495D0());
            egp0.a(d, "backgroundroom", "start", 0L, this.f9250g, d.m14495D0());
        } else if (this.f9252i) {
            this.f9252i = false;
            egp0.a(d, "backgroundroom", "ending", mqi0.o() - this.f9251h, this.f9250g, d.m14495D0());
            egp0.a(d, "liveroom", "start", 0L, this.f9250g, d.m14495D0());
        }
        this.f9251h = mqi0.o();
    }

    /* JADX INFO: renamed from: s2 */
    public void m11882s2() {
        super.s2();
        mkd0.z(this.f9253j);
    }
}
