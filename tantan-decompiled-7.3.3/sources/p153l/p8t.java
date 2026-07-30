package p153l;

import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class p8t extends jk2<LongLinkSocketMessage.MysteryBoxRecord, LongLinkSocketMessage.MysteryBoxRecord> {
    public p8t(wbg0<LongLinkSocketMessage.MysteryBoxRecord, LongLinkSocketMessage.MysteryBoxRecord> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkSocketMessage.MysteryBoxRecord mysteryBoxRecord, String str) {
        return true;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkSocketMessage.MysteryBoxRecord mysteryBoxRecord, String str2) {
        LiveMessage liveMessageM159457n = m159457n(str, mysteryBoxRecord.getTemplate().getId(), null, null, mysteryBoxRecord.getTemplate());
        liveMessageM159457n.setMysteryBoxRecord(mysteryBoxRecord);
        return liveMessageM159457n;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.MysteryBoxRecord> mo95510b() {
        return LongLinkSocketMessage.MysteryBoxRecord.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.campaign.mysteryBoxChatMsg";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.MysteryBoxRecord mo95993z(String str, LongLinkSocketMessage.MysteryBoxRecord mysteryBoxRecord) {
        return mysteryBoxRecord;
    }
}
