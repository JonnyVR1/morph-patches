package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class s180 extends bk2<LongLinkLiveMessage.PkSeekTimeout, LivePkMessage> {
    public s180(p3g0<LivePkMessage, LivePkMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.PkSeekTimeout pkSeekTimeout, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LivePkMessage mo9251z(String str, LongLinkLiveMessage.PkSeekTimeout pkSeekTimeout) {
        return new LivePkMessage(pkSeekTimeout.getSeekId(), "pk_seek_timeout");
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.PkSeekTimeout> mo9244b() {
        return LongLinkLiveMessage.PkSeekTimeout.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.pk.seek.timeout";
    }
}
