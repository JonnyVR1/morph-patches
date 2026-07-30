package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;

/* JADX INFO: loaded from: classes4.dex */
public class lcr extends k4t {

    /* JADX INFO: renamed from: e */
    public final RoomFrag f127445e;

    /* JADX INFO: renamed from: f */
    public bsm f127446f;

    public lcr(RoomFrag roomFrag) {
        super(roomFrag);
        this.f127445e = roomFrag;
    }

    /* JADX INFO: renamed from: D2 */
    public bsm m149341D2() {
        return this.f127446f;
    }

    /* JADX INFO: renamed from: H2 */
    public k4t m149342H2(k4t k4tVar, bsm bsmVar) {
        k4t k4tVarM144512z2 = super.m144512z2(k4tVar);
        if (k4tVar instanceof lcr) {
            ((lcr) k4tVar).m149343I2(bsmVar);
        }
        return k4tVarM144512z2;
    }

    /* JADX INFO: renamed from: I2 */
    public k4t m149343I2(bsm bsmVar) {
        this.f127446f = bsmVar;
        return this;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public final void mo69117n() {
        bsm bsmVar = this.f127446f;
        if (bsmVar != null && bsmVar.f77102h.mo149813j() != null) {
            mo111723E2(this.f127446f);
        }
        super.mo69117n();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public final void mo72465t() {
        bsm bsmVar = this.f127446f;
        if (bsmVar != null && bsmVar.f77102h.mo149813j() != null) {
            mo111724F2(this.f127446f);
        }
        super.mo72465t();
    }

    /* JADX INFO: renamed from: E2 */
    public void mo111723E2(bsm bsmVar) {
    }

    /* JADX INFO: renamed from: F2 */
    public void mo111724F2(bsm bsmVar) {
    }
}
