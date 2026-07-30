package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;

/* JADX INFO: loaded from: classes4.dex */
public class lsq extends o2e0<zit> {
    /* JADX WARN: Type inference failed for: r3v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v8, types: [l.oo2] */
    @Override // p153l.o2e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo97254a(zit zitVar, gae0 gae0Var, bae0.C15954b c15954b) {
        String strM219937g = zitVar.m219937g("liveId");
        String strM219937g2 = zitVar.m219937g("roomId");
        String strM219937g3 = zitVar.m219937g("source");
        zitVar.m219937g("liveMode");
        afu.m97559h(kfd0.m149385x().m149403l(0).m149414w(strM219937g3).m149409r(strM219937g).m149410s("").m149388A("").m149412u("onlive").m149392a(), "p_user_live_room");
        boolean zM219938h = zitVar.m219938h(zitVar.f112155b);
        gae0Var.m213811F2().JumpRoomEvent.jumpRoom().mo199273j(new JumpRoomData.C12924a().m74214t(gae0Var.m213810E2().mo160117o0()).m74212r(gae0Var.m213810E2().m202191k()).m74213s(gae0Var.m213810E2().mo183435j().room.f45267id).m74211q(gae0Var.m213810E2().m168532l0().name).m74216v(strM219937g).m74217w(strM219937g2).m74215u(strM219937g3).m74208n(zM219938h ? JumpRoomType.CHANGE_SOURCE_NO_BACK : JumpRoomType.CHANGE_SOURCE_WITH_BACK).m74210p(zM219938h ? BLiveAbsData.VOICE_LIVE : "live").m74207m());
    }
}
