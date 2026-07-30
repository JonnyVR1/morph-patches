package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class oau extends vp2<LongLinkLiveMessage.SchemaJumpMessage> {
    public oau(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkLiveMessage.SchemaJumpMessage schemaJumpMessage, String str2) {
        if (this.f21259c.m23568d().m20739f(schemaJumpMessage.getTemplateData().getId()) == null) {
            return null;
        }
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.scheme = schemaJumpMessage.getSchema();
        return m24093o(str, schemaJumpMessage.getTemplateData().getId(), (LongLinkLiveMessage.UserInfo) LongLinkLiveMessage.UserInfo.newBuilder().setId(schemaJumpMessage.getUserID()).build(), null, schemaJumpMessage.getTemplateData(), extInfo);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.SchemaJumpMessage> mo9244b() {
        return LongLinkLiveMessage.SchemaJumpMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.gift.surpriseBox";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.SchemaJumpMessage schemaJumpMessage, String str) {
        return m24095r(schemaJumpMessage.getRoomID(), "no_care", "no_care");
    }
}
