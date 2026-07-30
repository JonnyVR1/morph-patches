package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import l.p3g0;
import l.u5t;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class za10 extends bk2<LongLinkMultiCallMessage.MultiCallMessage, u5t> {
    public za10(p3g0<u5t, u5t> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkMultiCallMessage.MultiCallMessage multiCallMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkMultiCallMessage.MultiCallMessage multiCallMessage, String str2) {
        if (!multiCallMessage.hasTemplate() || multiCallMessage.getTemplate().getId() == 0) {
            return super.mo9247x(str, multiCallMessage, str2);
        }
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.applyCallId = multiCallMessage.getMultiCall().getId();
        return m24093o(str, multiCallMessage.getTemplate().getId(), null, null, multiCallMessage.getTemplate(), extInfo);
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public u5t mo9251z(String str, LongLinkMultiCallMessage.MultiCallMessage multiCallMessage) {
        return new u5t(multiCallMessage);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMultiCallMessage.MultiCallMessage> mo9244b() {
        return LongLinkMultiCallMessage.MultiCallMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.live.multi.call";
    }
}
