package p153l;

import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class uil extends mq2<LongLinkGiftMessage.PreHourLeaderboardsTopChat> {
    public uil(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkGiftMessage.PreHourLeaderboardsTopChat preHourLeaderboardsTopChat, String str2) {
        LongLinkGiftMessage.TemplateData tempdata = preHourLeaderboardsTopChat.getTempdata();
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.liveId = preHourLeaderboardsTopChat.getTopLiveId();
        extInfo.roomId = preHourLeaderboardsTopChat.getRoomId();
        return m159458o("", preHourLeaderboardsTopChat.getTempdata().getId(), null, null, Template.TemplateData.newBuilder().setId(tempdata.getId()).addAllFields(tempdata.getFieldsList()).build(), extInfo);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.PreHourLeaderboardsTopChat> mo95510b() {
        return LongLinkGiftMessage.PreHourLeaderboardsTopChat.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.gift.preHourLeaderboardsTopChat";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkGiftMessage.PreHourLeaderboardsTopChat preHourLeaderboardsTopChat, String str) {
        return true;
    }
}
