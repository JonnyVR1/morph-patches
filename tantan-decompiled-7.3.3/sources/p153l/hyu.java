package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople;

/* JADX INFO: loaded from: classes4.dex */
public class hyu extends jk2<LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage, LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage> {
    public hyu(wbg0<LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage, LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage liveMultiCallPartyFinderMessage, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage> mo95510b() {
        return LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.multi.call.party.finder";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage mo95993z(String str, LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage liveMultiCallPartyFinderMessage) {
        return liveMultiCallPartyFinderMessage;
    }
}
