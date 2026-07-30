package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import l.k4t;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lcr extends k4t {

    /* JADX INFO: renamed from: e */
    public final RoomFrag f14767e;

    /* JADX INFO: renamed from: f */
    public bsm f14768f;

    public lcr(RoomFrag roomFrag) {
        super(roomFrag);
        this.f14767e = roomFrag;
    }

    /* JADX INFO: renamed from: D2 */
    public bsm m17134D2() {
        return this.f14768f;
    }

    /* JADX INFO: renamed from: H2 */
    public k4t m17135H2(k4t k4tVar, bsm bsmVar) {
        k4t k4tVarZ2 = super.z2(k4tVar);
        if (k4tVar instanceof lcr) {
            ((lcr) k4tVar).m17136I2(bsmVar);
        }
        return k4tVarZ2;
    }

    /* JADX INFO: renamed from: I2 */
    public k4t m17136I2(bsm bsmVar) {
        this.f14768f = bsmVar;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m17137n() {
        bsm bsmVar = this.f14768f;
        if (bsmVar != null && bsmVar.f8339h.m17234j() != null) {
            mo11878E2(this.f14768f);
        }
        super.n();
    }

    /* JADX INFO: renamed from: t */
    public final void m17138t() {
        bsm bsmVar = this.f14768f;
        if (bsmVar != null && bsmVar.f8339h.m17234j() != null) {
            mo11879F2(this.f14768f);
        }
        super.t();
    }

    /* JADX INFO: renamed from: E2 */
    public void mo11878E2(bsm bsmVar) {
    }

    /* JADX INFO: renamed from: F2 */
    public void mo11879F2(bsm bsmVar) {
    }
}
