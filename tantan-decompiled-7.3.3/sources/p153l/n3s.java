package p153l;

import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;

/* JADX INFO: loaded from: classes4.dex */
public class n3s extends jk2<LongLinkSocketMessage.DragonScourgeRecords, LongLinkSocketMessage.DragonScourgeRecords> {
    public n3s(wbg0<LongLinkSocketMessage.DragonScourgeRecords, LongLinkSocketMessage.DragonScourgeRecords> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkSocketMessage.DragonScourgeRecords dragonScourgeRecords, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.DragonScourgeRecords> mo95510b() {
        return LongLinkSocketMessage.DragonScourgeRecords.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.campaign.dragonScourgeChatMsg";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.DragonScourgeRecords mo95993z(String str, LongLinkSocketMessage.DragonScourgeRecords dragonScourgeRecords) {
        return dragonScourgeRecords;
    }
}
