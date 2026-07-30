package p153l;

import com.p051p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;

/* JADX INFO: loaded from: classes4.dex */
public class lmj0 extends jk2<LongLinkMedalMessage.TurboCardResultNotice, LongLinkMedalMessage.TurboCardResultNotice> {
    public lmj0(wbg0<LongLinkMedalMessage.TurboCardResultNotice, LongLinkMedalMessage.TurboCardResultNotice> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkMedalMessage.TurboCardResultNotice turboCardResultNotice, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMedalMessage.TurboCardResultNotice> mo95510b() {
        return LongLinkMedalMessage.TurboCardResultNotice.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.medal.TurboCardEndEvent";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkMedalMessage.TurboCardResultNotice mo95993z(String str, LongLinkMedalMessage.TurboCardResultNotice turboCardResultNotice) {
        return turboCardResultNotice;
    }
}
