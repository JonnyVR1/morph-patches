package p149l;

import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class o6t extends bk2<LongLinkSocketMessage.MysteryBoxRecord, LongLinkSocketMessage.MysteryBoxRecord> {
    public o6t(p3g0<LongLinkSocketMessage.MysteryBoxRecord, LongLinkSocketMessage.MysteryBoxRecord> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkSocketMessage.MysteryBoxRecord mysteryBoxRecord, String str) {
        return true;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkSocketMessage.MysteryBoxRecord mysteryBoxRecord, String str2) {
        LiveMessage liveMessageM199209n = m199209n(str, mysteryBoxRecord.getTemplate().getId(), null, null, mysteryBoxRecord.getTemplate());
        liveMessageM199209n.setMysteryBoxRecord(mysteryBoxRecord);
        return liveMessageM199209n;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.MysteryBoxRecord> mo94398b() {
        return LongLinkSocketMessage.MysteryBoxRecord.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.campaign.mysteryBoxChatMsg";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.MysteryBoxRecord mo94461z(String str, LongLinkSocketMessage.MysteryBoxRecord mysteryBoxRecord) {
        return mysteryBoxRecord;
    }
}
