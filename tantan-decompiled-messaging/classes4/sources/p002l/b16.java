package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import java.util.ArrayList;
import java.util.List;
import l.p3g0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class b16 extends bk2<LongLinkGiftMessage.ContentUpdateNotice, List<LongLinkGiftMessage.LiveCampaignInfo>> {
    public b16(p3g0<List<LongLinkGiftMessage.LiveCampaignInfo>, List<LongLinkGiftMessage.LiveCampaignInfo>> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkGiftMessage.ContentUpdateNotice contentUpdateNotice, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo10148w(String str, LongLinkGiftMessage.ContentUpdateNotice contentUpdateNotice, String str2) {
        if (contentUpdateNotice.getPosition() == LongLinkGiftMessage.LongLinkUpdatePosition.GiftList && contentUpdateNotice.getAction() == LongLinkGiftMessage.LongLinkUpdateAction.Refresh) {
            return new LiveControlMessage(str, "re_request_room_gift_list");
        }
        if (contentUpdateNotice.getPosition() == LongLinkGiftMessage.LongLinkUpdatePosition.FirstRechargeCampaign && contentUpdateNotice.getAction() == LongLinkGiftMessage.LongLinkUpdateAction.Complete) {
            return new LiveControlMessage(str, "complete_first_recharge");
        }
        if (contentUpdateNotice.getPosition() == LongLinkGiftMessage.LongLinkUpdatePosition.FirstRechargeStimulus && contentUpdateNotice.getAction() == LongLinkGiftMessage.LongLinkUpdateAction.Complete) {
            return new LiveControlMessage(str, "complete_first_recharge_stimulus");
        }
        return null;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public List<LongLinkGiftMessage.LiveCampaignInfo> mo9251z(String str, LongLinkGiftMessage.ContentUpdateNotice contentUpdateNotice) {
        if (contentUpdateNotice.getPosition() == LongLinkGiftMessage.LongLinkUpdatePosition.LiveCampaign && contentUpdateNotice.getAction() == LongLinkGiftMessage.LongLinkUpdateAction.Refresh && !vwb.J(contentUpdateNotice.getLiveCampaignsList())) {
            return contentUpdateNotice.getLiveCampaignsList();
        }
        if (contentUpdateNotice.getPosition() == LongLinkGiftMessage.LongLinkUpdatePosition.CampaignEntrance) {
            return new ArrayList();
        }
        return null;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.ContentUpdateNotice> mo9244b() {
        return LongLinkGiftMessage.ContentUpdateNotice.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.notice.contentUpdate";
    }
}
