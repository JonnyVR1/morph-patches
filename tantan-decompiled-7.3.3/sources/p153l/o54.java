package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class o54 extends jk2<LongLinkLiveMessage.CallMessage, LiveCallMessage> {
    public o54(wbg0<LiveCallMessage, LiveCallMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.CallMessage callMessage, String str) {
        return true;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.CallMessage callMessage, String str2) {
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.callInviteId = callMessage.getCall().getInviteId();
        return (callMessage.getTemplateData() == null || callMessage.getTemplateData().getId() == 0) ? super.mo113619x(str, callMessage, str2) : m159458o(str, callMessage.getTemplateData().getId(), null, null, callMessage.getTemplateData(), extInfo);
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LiveCallMessage mo95993z(String str, LongLinkLiveMessage.CallMessage callMessage) {
        return new LiveCallMessage(callMessage.getCall(), callMessage.getType()).setBullet(callMessage.getBulletText());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.CallMessage> mo95510b() {
        return LongLinkLiveMessage.CallMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.call";
    }
}
