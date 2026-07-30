package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;

/* JADX INFO: loaded from: classes4.dex */
public class hpp0 extends mer {

    /* JADX INFO: renamed from: g */
    public final String f111041g;

    /* JADX INFO: renamed from: h */
    public long f111042h;

    /* JADX INFO: renamed from: i */
    public boolean f111043i;

    /* JADX INFO: renamed from: j */
    public kcg0 f111044j;

    public hpp0(RoomFrag roomFrag, String str) {
        super(roomFrag);
        this.f111043i = false;
        this.f111041g = str;
        m136577L2();
    }

    @Override // p153l.mer
    /* JADX INFO: renamed from: E2 */
    public void mo136575E2(dum dumVar) {
        super.mo136575E2(dumVar);
        ipp0.m141533a(dumVar.f90822h, "liveroom", "ending", pzi0.m174454o() - this.f111042h, this.f111041g, dumVar.f90822h.m168449D0());
    }

    @Override // p153l.mer
    /* JADX INFO: renamed from: F2 */
    public void mo136576F2(dum dumVar) {
        super.mo136576F2(dumVar);
        D d = dumVar.f90822h;
        ipp0.m141533a(d, "liveroom", "start", 0L, this.f111041g, d.m168449D0());
        this.f111042h = pzi0.m174454o();
    }

    /* JADX INFO: renamed from: L2 */
    public final void m136577L2() {
        this.f111044j = Act.foreground().skip(1).subscribe(dhw.m115825d(new y20() { // from class: l.gpp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105475a.m136578M2((Act.C4450r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m136578M2(Act.C4450r c4450r) {
        if (m158073D2() == null || this.f136558e.m72983R4().m167556Q0()) {
            return;
        }
        D d = m158073D2().f90822h;
        if (c4450r == null) {
            this.f111043i = true;
            ipp0.m141533a(d, "liveroom", "ending", pzi0.m174454o() - this.f111042h, this.f111041g, d.m168449D0());
            ipp0.m141533a(d, "backgroundroom", "start", 0L, this.f111041g, d.m168449D0());
        } else if (this.f111043i) {
            this.f111043i = false;
            ipp0.m141533a(d, "backgroundroom", "ending", pzi0.m174454o() - this.f111042h, this.f111041g, d.m168449D0());
            ipp0.m141533a(d, "liveroom", "start", 0L, this.f111041g, d.m168449D0());
        }
        this.f111042h = pzi0.m174454o();
    }

    @Override // p153l.l6t
    /* JADX INFO: renamed from: s2 */
    public void mo120629s2() {
        super.mo120629s2();
        psd0.m173633z(this.f111044j);
    }
}
