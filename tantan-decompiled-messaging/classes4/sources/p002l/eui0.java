package p002l;

import com.p1.mobile.longlink.msg.liveright.liveRight;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class eui0 extends bk2<liveRight.TopChatUpdateNotice, liveRight.TopChatUpdateNotice> {

    /* JADX INFO: renamed from: h */
    public long f9971h;

    public eui0(p3g0<liveRight.TopChatUpdateNotice, liveRight.TopChatUpdateNotice> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(liveRight.TopChatUpdateNotice topChatUpdateNotice, String str) {
        if (topChatUpdateNotice == null || topChatUpdateNotice.getTimestamp() <= this.f9971h) {
            return false;
        }
        this.f9971h = topChatUpdateNotice.getTimestamp();
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<liveRight.TopChatUpdateNotice> mo9244b() {
        return liveRight.TopChatUpdateNotice.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.topChat.update";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public liveRight.TopChatUpdateNotice mo9251z(String str, liveRight.TopChatUpdateNotice topChatUpdateNotice) {
        return topChatUpdateNotice;
    }
}
