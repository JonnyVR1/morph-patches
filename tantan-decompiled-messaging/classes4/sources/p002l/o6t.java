package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o6t extends bk2<LongLinkSocketMessage.MysteryBoxRecord, LongLinkSocketMessage.MysteryBoxRecord> {
    public o6t(p3g0<LongLinkSocketMessage.MysteryBoxRecord, LongLinkSocketMessage.MysteryBoxRecord> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkSocketMessage.MysteryBoxRecord mysteryBoxRecord, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkSocketMessage.MysteryBoxRecord mysteryBoxRecord, String str2) {
        LiveMessage liveMessageM24092n = m24092n(str, mysteryBoxRecord.getTemplate().getId(), null, null, mysteryBoxRecord.getTemplate());
        liveMessageM24092n.setMysteryBoxRecord(mysteryBoxRecord);
        return liveMessageM24092n;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.MysteryBoxRecord> mo9244b() {
        return LongLinkSocketMessage.MysteryBoxRecord.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.campaign.mysteryBoxChatMsg";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.MysteryBoxRecord mo9251z(String str, LongLinkSocketMessage.MysteryBoxRecord mysteryBoxRecord) {
        return mysteryBoxRecord;
    }
}
