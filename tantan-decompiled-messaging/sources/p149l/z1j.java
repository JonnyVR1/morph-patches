package p149l;

import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;

/* JADX INFO: loaded from: classes4.dex */
public class z1j extends lcr {

    /* JADX INFO: renamed from: g */
    public AudienceStartData f201078g;

    /* JADX INFO: renamed from: h */
    public dgp0 f201079h;

    /* JADX INFO: renamed from: i */
    public jwt f201080i;

    public z1j(RoomFrag roomFrag, String str, AudienceStartData audienceStartData) {
        super(roomFrag);
        this.f201078g = audienceStartData;
        this.f201079h = new dgp0(roomFrag, str);
        if (audienceStartData.withMute) {
            this.f201080i = new jwt(roomFrag);
        }
    }

    @Override // p149l.lcr
    /* JADX INFO: renamed from: F2 */
    public void mo111724F2(bsm bsmVar) {
        m149342H2(this.f201079h, bsmVar);
        jwt jwtVar = this.f201080i;
        if (jwtVar != null) {
            m149342H2(jwtVar, bsmVar);
        }
        super.mo111724F2(bsmVar);
    }

    @Override // p149l.k4t
    /* JADX INFO: renamed from: s2 */
    public void mo111727s2() {
        this.f201079h.mo111727s2();
    }
}
