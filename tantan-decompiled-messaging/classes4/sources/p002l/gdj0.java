package p002l;

import com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gdj0 extends bk2<LongLinkMedalMessage.TurboCardReceiveEvent, LongLinkMedalMessage.TurboCardReceiveEvent> {
    public gdj0(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkMedalMessage.TurboCardReceiveEvent turboCardReceiveEvent, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMedalMessage.TurboCardReceiveEvent> mo9244b() {
        return LongLinkMedalMessage.TurboCardReceiveEvent.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.medal.TurboCardReceiveEvent";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkMedalMessage.TurboCardReceiveEvent mo9251z(String str, LongLinkMedalMessage.TurboCardReceiveEvent turboCardReceiveEvent) {
        return turboCardReceiveEvent;
    }
}
