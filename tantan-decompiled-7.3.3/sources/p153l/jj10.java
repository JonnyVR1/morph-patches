package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class jj10 extends jk2<LongLinkMultiCallMessage.MultiCallMessage, v7t> {
    public jj10(wbg0<v7t, v7t> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkMultiCallMessage.MultiCallMessage multiCallMessage, String str) {
        return true;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkMultiCallMessage.MultiCallMessage multiCallMessage, String str2) {
        if (!multiCallMessage.hasTemplate() || multiCallMessage.getTemplate().getId() == 0) {
            return super.mo113619x(str, multiCallMessage, str2);
        }
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.applyCallId = multiCallMessage.getMultiCall().getId();
        return m159458o(str, multiCallMessage.getTemplate().getId(), null, null, multiCallMessage.getTemplate(), extInfo);
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public v7t mo95993z(String str, LongLinkMultiCallMessage.MultiCallMessage multiCallMessage) {
        return new v7t(multiCallMessage);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMultiCallMessage.MultiCallMessage> mo95510b() {
        return LongLinkMultiCallMessage.MultiCallMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.live.multi.call";
    }
}
