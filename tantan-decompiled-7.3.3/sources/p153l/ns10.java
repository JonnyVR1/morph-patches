package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;

/* JADX INFO: loaded from: classes4.dex */
public class ns10 extends jk2<LongLinkMultiCallMessage.MultiCallInviteMessage, c8t> {
    public ns10(wbg0<c8t, c8t> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkMultiCallMessage.MultiCallInviteMessage multiCallInviteMessage, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public c8t mo95993z(String str, LongLinkMultiCallMessage.MultiCallInviteMessage multiCallInviteMessage) {
        return new c8t(multiCallInviteMessage);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMultiCallMessage.MultiCallInviteMessage> mo95510b() {
        return LongLinkMultiCallMessage.MultiCallInviteMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.live.multi.call.invite";
    }
}
