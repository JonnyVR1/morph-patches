package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import l.b6t;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dk10 extends bk2<LongLinkMultiCallMessage.MultiCallInviteMessage, b6t> {
    public dk10(p3g0<b6t, b6t> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkMultiCallMessage.MultiCallInviteMessage multiCallInviteMessage, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public b6t mo9251z(String str, LongLinkMultiCallMessage.MultiCallInviteMessage multiCallInviteMessage) {
        return new b6t(multiCallInviteMessage);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMultiCallMessage.MultiCallInviteMessage> mo9244b() {
        return LongLinkMultiCallMessage.MultiCallInviteMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.live.multi.call.invite";
    }
}
