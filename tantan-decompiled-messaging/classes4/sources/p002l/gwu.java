package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gwu extends bk2<LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage, LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage> {
    public gwu(p3g0<LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage, LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage liveMultiCallPartyFinderMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage> mo9244b() {
        return LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.multi.call.party.finder";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage mo9251z(String str, LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage liveMultiCallPartyFinderMessage) {
        return liveMultiCallPartyFinderMessage;
    }
}
