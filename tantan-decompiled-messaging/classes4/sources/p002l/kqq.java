package p002l;

import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import l.gwr;
import l.h7d0;
import l.ygt;
import l.zcu;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kqq extends kud0<ygt> {
    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v8, types: [l.ho2] */
    @Override // p002l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9496a(ygt ygtVar, c2e0 c2e0Var, x1e0.C0892b c0892b) {
        String strG = ygtVar.g("liveId");
        String strG2 = ygtVar.g("roomId");
        String strG3 = ygtVar.g("source");
        ygtVar.g("liveMode");
        zcu.h(h7d0.x().l(0).w(strG3).r(strG).s("").A("").u("onlive").a(), "p_user_live_room");
        boolean zH = ygtVar.h(((gwr) ygtVar).b);
        c2e0Var.m25548F2().JumpRoomEvent.jumpRoom().j(new JumpRoomData.C0350a().m6554t(c2e0Var.m25547E2().mo14591o0()).m6552r(c2e0Var.m25547E2().m17235k()).m6553s(c2e0Var.m25547E2().m17234j().room.id).m6551q(c2e0Var.m25547E2().m14582l0().name).m6556v(strG).m6557w(strG2).m6555u(strG3).m6548n(zH ? JumpRoomType.CHANGE_SOURCE_NO_BACK : JumpRoomType.CHANGE_SOURCE_WITH_BACK).m6550p(zH ? "voice-live" : "live").m6547m());
    }
}
