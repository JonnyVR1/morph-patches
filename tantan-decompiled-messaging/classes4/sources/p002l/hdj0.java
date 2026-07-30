package p002l;

import com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hdj0 extends bk2<LongLinkMedalMessage.TurboCardResultNotice, LongLinkMedalMessage.TurboCardResultNotice> {
    public hdj0(p3g0<LongLinkMedalMessage.TurboCardResultNotice, LongLinkMedalMessage.TurboCardResultNotice> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkMedalMessage.TurboCardResultNotice turboCardResultNotice, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMedalMessage.TurboCardResultNotice> mo9244b() {
        return LongLinkMedalMessage.TurboCardResultNotice.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.medal.TurboCardEndEvent";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkMedalMessage.TurboCardResultNotice mo9251z(String str, LongLinkMedalMessage.TurboCardResultNotice turboCardResultNotice) {
        return turboCardResultNotice;
    }
}
