package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class p44 extends bk2<LongLinkLiveMessage.CallMessage, LiveCallMessage> {
    public p44(p3g0<LiveCallMessage, LiveCallMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.CallMessage callMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkLiveMessage.CallMessage callMessage, String str2) {
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.callInviteId = callMessage.getCall().getInviteId();
        return (callMessage.getTemplateData() == null || callMessage.getTemplateData().getId() == 0) ? super.mo9247x(str, callMessage, str2) : m24093o(str, callMessage.getTemplateData().getId(), null, null, callMessage.getTemplateData(), extInfo);
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LiveCallMessage mo9251z(String str, LongLinkLiveMessage.CallMessage callMessage) {
        return new LiveCallMessage(callMessage.getCall(), callMessage.getType()).setBullet(callMessage.getBulletText());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.CallMessage> mo9244b() {
        return LongLinkLiveMessage.CallMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.call";
    }
}
