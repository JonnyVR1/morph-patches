package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class oau extends vp2<LongLinkLiveMessage.SchemaJumpMessage> {
    public oau(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.SchemaJumpMessage schemaJumpMessage, String str2) {
        if (this.f182445c.m194417d().m171773f(schemaJumpMessage.getTemplateData().getId()) == null) {
            return null;
        }
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.scheme = schemaJumpMessage.getSchema();
        return m199210o(str, schemaJumpMessage.getTemplateData().getId(), LongLinkLiveMessage.UserInfo.newBuilder().setId(schemaJumpMessage.getUserID()).build(), null, schemaJumpMessage.getTemplateData(), extInfo);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.SchemaJumpMessage> mo94398b() {
        return LongLinkLiveMessage.SchemaJumpMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.gift.surpriseBox";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.SchemaJumpMessage schemaJumpMessage, String str) {
        return m199212r(schemaJumpMessage.getRoomID(), "no_care", "no_care");
    }
}
