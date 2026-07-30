package p153l;

import com.p051p1.mobile.longlink.msg.liveright.liveRight;

/* JADX INFO: loaded from: classes4.dex */
public class i3j0 extends jk2<liveRight.TopChatUpdateNotice, liveRight.TopChatUpdateNotice> {

    /* JADX INFO: renamed from: h */
    public long f112731h;

    public i3j0(wbg0<liveRight.TopChatUpdateNotice, liveRight.TopChatUpdateNotice> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(liveRight.TopChatUpdateNotice topChatUpdateNotice, String str) {
        if (topChatUpdateNotice == null || topChatUpdateNotice.getTimestamp() <= this.f112731h) {
            return false;
        }
        this.f112731h = topChatUpdateNotice.getTimestamp();
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<liveRight.TopChatUpdateNotice> mo95510b() {
        return liveRight.TopChatUpdateNotice.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.topChat.update";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public liveRight.TopChatUpdateNotice mo95993z(String str, liveRight.TopChatUpdateNotice topChatUpdateNotice) {
        return topChatUpdateNotice;
    }
}
