package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class p44 extends bk2<LongLinkLiveMessage.CallMessage, LiveCallMessage> {
    public p44(p3g0<LiveCallMessage, LiveCallMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.CallMessage callMessage, String str) {
        return true;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.CallMessage callMessage, String str2) {
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.callInviteId = callMessage.getCall().getInviteId();
        return (callMessage.getTemplateData() == null || callMessage.getTemplateData().getId() == 0) ? super.mo94401x(str, callMessage, str2) : m199210o(str, callMessage.getTemplateData().getId(), null, null, callMessage.getTemplateData(), extInfo);
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LiveCallMessage mo94461z(String str, LongLinkLiveMessage.CallMessage callMessage) {
        return new LiveCallMessage(callMessage.getCall(), callMessage.getType()).setBullet(callMessage.getBulletText());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.CallMessage> mo94398b() {
        return LongLinkLiveMessage.CallMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.call";
    }
}
