package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;

/* JADX INFO: loaded from: classes4.dex */
public class mer extends l6t {

    /* JADX INFO: renamed from: e */
    public final RoomFrag f136558e;

    /* JADX INFO: renamed from: f */
    public dum f136559f;

    public mer(RoomFrag roomFrag) {
        super(roomFrag);
        this.f136558e = roomFrag;
    }

    /* JADX INFO: renamed from: D2 */
    public dum m158073D2() {
        return this.f136559f;
    }

    /* JADX INFO: renamed from: H2 */
    public l6t m158074H2(l6t l6tVar, dum dumVar) {
        l6t l6tVarM153103z2 = super.m153103z2(l6tVar);
        if (l6tVar instanceof mer) {
            ((mer) l6tVar).m158075I2(dumVar);
        }
        return l6tVarM153103z2;
    }

    /* JADX INFO: renamed from: I2 */
    public l6t m158075I2(dum dumVar) {
        this.f136559f = dumVar;
        return this;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public final void mo70300n() {
        dum dumVar = this.f136559f;
        if (dumVar != null && dumVar.f90822h.mo183435j() != null) {
            mo136575E2(this.f136559f);
        }
        super.mo70300n();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public final void mo73648t() {
        dum dumVar = this.f136559f;
        if (dumVar != null && dumVar.f90822h.mo183435j() != null) {
            mo136576F2(this.f136559f);
        }
        super.mo73648t();
    }

    /* JADX INFO: renamed from: E2 */
    public void mo136575E2(dum dumVar) {
    }

    /* JADX INFO: renamed from: F2 */
    public void mo136576F2(dum dumVar) {
    }
}
