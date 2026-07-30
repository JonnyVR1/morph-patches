package p149l;

import com.p046p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;

/* JADX INFO: loaded from: classes4.dex */
public class hdj0 extends bk2<LongLinkMedalMessage.TurboCardResultNotice, LongLinkMedalMessage.TurboCardResultNotice> {
    public hdj0(p3g0<LongLinkMedalMessage.TurboCardResultNotice, LongLinkMedalMessage.TurboCardResultNotice> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkMedalMessage.TurboCardResultNotice turboCardResultNotice, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMedalMessage.TurboCardResultNotice> mo94398b() {
        return LongLinkMedalMessage.TurboCardResultNotice.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.medal.TurboCardEndEvent";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkMedalMessage.TurboCardResultNotice mo94461z(String str, LongLinkMedalMessage.TurboCardResultNotice turboCardResultNotice) {
        return turboCardResultNotice;
    }
}
