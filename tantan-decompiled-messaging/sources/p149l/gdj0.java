package p149l;

import com.p046p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;

/* JADX INFO: loaded from: classes4.dex */
public class gdj0 extends bk2<LongLinkMedalMessage.TurboCardReceiveEvent, LongLinkMedalMessage.TurboCardReceiveEvent> {
    public gdj0(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkMedalMessage.TurboCardReceiveEvent turboCardReceiveEvent, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMedalMessage.TurboCardReceiveEvent> mo94398b() {
        return LongLinkMedalMessage.TurboCardReceiveEvent.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.medal.TurboCardReceiveEvent";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkMedalMessage.TurboCardReceiveEvent mo94461z(String str, LongLinkMedalMessage.TurboCardReceiveEvent turboCardReceiveEvent) {
        return turboCardReceiveEvent;
    }
}
