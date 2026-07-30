package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;

/* JADX INFO: loaded from: classes4.dex */
public class kqq extends kud0<ygt> {
    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v8, types: [l.ho2] */
    @Override // p149l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo95830a(ygt ygtVar, c2e0 c2e0Var, x1e0.C21019b c21019b) {
        String strM214763g = ygtVar.m214763g("liveId");
        String strM214763g2 = ygtVar.m214763g("roomId");
        String strM214763g3 = ygtVar.m214763g("source");
        ygtVar.m214763g("liveMode");
        zcu.m218093h(h7d0.m129655x().m129673l(0).m129684w(strM214763g3).m129679r(strM214763g).m129680s("").m129658A("").m129682u("onlive").m129662a(), "p_user_live_room");
        boolean zM214764h = ygtVar.m214764h(ygtVar.f104770b);
        c2e0Var.m206028F2().JumpRoomEvent.jumpRoom().mo172463j(new JumpRoomData.C12761a().m73031t(c2e0Var.m206027E2().mo132155o0()).m73029r(c2e0Var.m206027E2().m149814k()).m73030s(c2e0Var.m206027E2().mo149813j().room.f44419id).m73028q(c2e0Var.m206027E2().m132146l0().name).m73033v(strM214763g).m73034w(strM214763g2).m73032u(strM214763g3).m73025n(zM214764h ? JumpRoomType.CHANGE_SOURCE_NO_BACK : JumpRoomType.CHANGE_SOURCE_WITH_BACK).m73027p(zM214764h ? BLiveAbsData.VOICE_LIVE : "live").m73024m());
    }
}
