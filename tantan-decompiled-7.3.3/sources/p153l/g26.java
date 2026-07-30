package p153l;

import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class g26 extends jk2<LongLinkGiftMessage.ContentUpdateNotice, List<LongLinkGiftMessage.LiveCampaignInfo>> {
    public g26(wbg0<List<LongLinkGiftMessage.LiveCampaignInfo>, List<LongLinkGiftMessage.LiveCampaignInfo>> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkGiftMessage.ContentUpdateNotice contentUpdateNotice, String str) {
        return true;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo95513w(String str, LongLinkGiftMessage.ContentUpdateNotice contentUpdateNotice, String str2) {
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

    @Override // p153l.jk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public List<LongLinkGiftMessage.LiveCampaignInfo> mo95993z(String str, LongLinkGiftMessage.ContentUpdateNotice contentUpdateNotice) {
        if (contentUpdateNotice.getPosition() == LongLinkGiftMessage.LongLinkUpdatePosition.LiveCampaign && contentUpdateNotice.getAction() == LongLinkGiftMessage.LongLinkUpdateAction.Refresh && !jyb.m147479J(contentUpdateNotice.getLiveCampaignsList())) {
            return contentUpdateNotice.getLiveCampaignsList();
        }
        if (contentUpdateNotice.getPosition() == LongLinkGiftMessage.LongLinkUpdatePosition.CampaignEntrance) {
            return new ArrayList();
        }
        return null;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.ContentUpdateNotice> mo95510b() {
        return LongLinkGiftMessage.ContentUpdateNotice.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.notice.contentUpdate";
    }
}
