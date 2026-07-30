package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;

/* JADX INFO: loaded from: classes4.dex */
public class dgp0 extends lcr {

    /* JADX INFO: renamed from: g */
    public final String f86148g;

    /* JADX INFO: renamed from: h */
    public long f86149h;

    /* JADX INFO: renamed from: i */
    public boolean f86150i;

    /* JADX INFO: renamed from: j */
    public c4g0 f86151j;

    public dgp0(RoomFrag roomFrag, String str) {
        super(roomFrag);
        this.f86150i = false;
        this.f86148g = str;
        m111725L2();
    }

    @Override // p149l.lcr
    /* JADX INFO: renamed from: E2 */
    public void mo111723E2(bsm bsmVar) {
        super.mo111723E2(bsmVar);
        egp0.m116297a(bsmVar.f77102h, "liveroom", "ending", mqi0.m155944o() - this.f86149h, this.f86148g, bsmVar.f77102h.m132060D0());
    }

    @Override // p149l.lcr
    /* JADX INFO: renamed from: F2 */
    public void mo111724F2(bsm bsmVar) {
        super.mo111724F2(bsmVar);
        D d = bsmVar.f77102h;
        egp0.m116297a(d, "liveroom", "start", 0L, this.f86148g, d.m132060D0());
        this.f86149h = mqi0.m155944o();
    }

    /* JADX INFO: renamed from: L2 */
    public final void m111725L2() {
        this.f86151j = Act.foreground().skip(1).subscribe(ffw.m121193d(new e30() { // from class: l.cgp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80787a.m111726M2((Act.C4299r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m111726M2(Act.C4299r c4299r) {
        if (m149341D2() == null || this.f127445e.m71800R4().m148881Q0()) {
            return;
        }
        D d = m149341D2().f77102h;
        if (c4299r == null) {
            this.f86150i = true;
            egp0.m116297a(d, "liveroom", "ending", mqi0.m155944o() - this.f86149h, this.f86148g, d.m132060D0());
            egp0.m116297a(d, "backgroundroom", "start", 0L, this.f86148g, d.m132060D0());
        } else if (this.f86150i) {
            this.f86150i = false;
            egp0.m116297a(d, "backgroundroom", "ending", mqi0.m155944o() - this.f86149h, this.f86148g, d.m132060D0());
            egp0.m116297a(d, "liveroom", "start", 0L, this.f86148g, d.m132060D0());
        }
        this.f86149h = mqi0.m155944o();
    }

    @Override // p149l.k4t
    /* JADX INFO: renamed from: s2 */
    public void mo111727s2() {
        super.mo111727s2();
        mkd0.m154992z(this.f86151j);
    }
}
