package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class pcu extends mq2<LongLinkLiveMessage.SchemaJumpMessage> {
    public pcu(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.SchemaJumpMessage schemaJumpMessage, String str2) {
        if (this.f137993c.m220736d().m157079f(schemaJumpMessage.getTemplateData().getId()) == null) {
            return null;
        }
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.scheme = schemaJumpMessage.getSchema();
        return m159458o(str, schemaJumpMessage.getTemplateData().getId(), LongLinkLiveMessage.UserInfo.newBuilder().setId(schemaJumpMessage.getUserID()).build(), null, schemaJumpMessage.getTemplateData(), extInfo);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.SchemaJumpMessage> mo95510b() {
        return LongLinkLiveMessage.SchemaJumpMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.gift.surpriseBox";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.SchemaJumpMessage schemaJumpMessage, String str) {
        return m159460r(schemaJumpMessage.getRoomID(), "no_care", "no_care");
    }
}
