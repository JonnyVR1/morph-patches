package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople;

/* JADX INFO: loaded from: classes4.dex */
public class gwu extends bk2<LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage, LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage> {
    public gwu(p3g0<LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage, LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage liveMultiCallPartyFinderMessage, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage> mo94398b() {
        return LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.multi.call.party.finder";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage mo94461z(String str, LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage liveMultiCallPartyFinderMessage) {
        return liveMultiCallPartyFinderMessage;
    }
}
