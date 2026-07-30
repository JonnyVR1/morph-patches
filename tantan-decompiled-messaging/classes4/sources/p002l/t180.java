package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class t180 extends bk2<LongLinkLiveMessage.PkStart, LivePkMessage> {
    public t180(p3g0<LivePkMessage, LivePkMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.PkStart pkStart, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LivePkMessage mo9251z(String str, LongLinkLiveMessage.PkStart pkStart) {
        return new LivePkMessage(pkStart.getPk(), "pk_start");
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.PkStart> mo9244b() {
        return LongLinkLiveMessage.PkStart.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.pk.start";
    }
}
