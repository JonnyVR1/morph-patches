package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class za10 extends bk2<LongLinkMultiCallMessage.MultiCallMessage, u5t> {
    public za10(p3g0<u5t, u5t> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkMultiCallMessage.MultiCallMessage multiCallMessage, String str) {
        return true;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkMultiCallMessage.MultiCallMessage multiCallMessage, String str2) {
        if (!multiCallMessage.hasTemplate() || multiCallMessage.getTemplate().getId() == 0) {
            return super.mo94401x(str, multiCallMessage, str2);
        }
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.applyCallId = multiCallMessage.getMultiCall().getId();
        return m199210o(str, multiCallMessage.getTemplate().getId(), null, null, multiCallMessage.getTemplate(), extInfo);
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public u5t mo94461z(String str, LongLinkMultiCallMessage.MultiCallMessage multiCallMessage) {
        return new u5t(multiCallMessage);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMultiCallMessage.MultiCallMessage> mo94398b() {
        return LongLinkMultiCallMessage.MultiCallMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.live.multi.call";
    }
}
