package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p1.mobile.longlink.msg.template.Template;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dgl extends vp2<LongLinkGiftMessage.PreHourLeaderboardsTopChat> {
    public dgl(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkGiftMessage.PreHourLeaderboardsTopChat preHourLeaderboardsTopChat, String str2) {
        LongLinkGiftMessage.TemplateData tempdata = preHourLeaderboardsTopChat.getTempdata();
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.liveId = preHourLeaderboardsTopChat.getTopLiveId();
        extInfo.roomId = preHourLeaderboardsTopChat.getRoomId();
        return m24093o("", preHourLeaderboardsTopChat.getTempdata().getId(), null, null, (Template.TemplateData) Template.TemplateData.newBuilder().setId(tempdata.getId()).addAllFields(tempdata.getFieldsList()).build(), extInfo);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.PreHourLeaderboardsTopChat> mo9244b() {
        return LongLinkGiftMessage.PreHourLeaderboardsTopChat.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.gift.preHourLeaderboardsTopChat";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkGiftMessage.PreHourLeaderboardsTopChat preHourLeaderboardsTopChat, String str) {
        return true;
    }
}
