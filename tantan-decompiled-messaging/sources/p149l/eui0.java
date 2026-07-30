package p149l;

import com.p046p1.mobile.longlink.msg.liveright.liveRight;

/* JADX INFO: loaded from: classes4.dex */
public class eui0 extends bk2<liveRight.TopChatUpdateNotice, liveRight.TopChatUpdateNotice> {

    /* JADX INFO: renamed from: h */
    public long f93241h;

    public eui0(p3g0<liveRight.TopChatUpdateNotice, liveRight.TopChatUpdateNotice> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(liveRight.TopChatUpdateNotice topChatUpdateNotice, String str) {
        if (topChatUpdateNotice == null || topChatUpdateNotice.getTimestamp() <= this.f93241h) {
            return false;
        }
        this.f93241h = topChatUpdateNotice.getTimestamp();
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<liveRight.TopChatUpdateNotice> mo94398b() {
        return liveRight.TopChatUpdateNotice.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.topChat.update";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public liveRight.TopChatUpdateNotice mo94461z(String str, liveRight.TopChatUpdateNotice topChatUpdateNotice) {
        return topChatUpdateNotice;
    }
}
