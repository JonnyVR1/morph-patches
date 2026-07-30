package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z1j extends lcr {

    /* JADX INFO: renamed from: g */
    public AudienceStartData f23181g;

    /* JADX INFO: renamed from: h */
    public dgp0 f23182h;

    /* JADX INFO: renamed from: i */
    public jwt f23183i;

    public z1j(RoomFrag roomFrag, String str, AudienceStartData audienceStartData) {
        super(roomFrag);
        this.f23181g = audienceStartData;
        this.f23182h = new dgp0(roomFrag, str);
        if (audienceStartData.withMute) {
            this.f23183i = new jwt(roomFrag);
        }
    }

    @Override // p002l.lcr
    /* JADX INFO: renamed from: F2 */
    public void mo11879F2(bsm bsmVar) {
        m17135H2(this.f23182h, bsmVar);
        jwt jwtVar = this.f23183i;
        if (jwtVar != null) {
            m17135H2(jwtVar, bsmVar);
        }
        super.mo11879F2(bsmVar);
    }

    /* JADX INFO: renamed from: s2 */
    public void m27041s2() {
        this.f23182h.m11882s2();
    }
}
