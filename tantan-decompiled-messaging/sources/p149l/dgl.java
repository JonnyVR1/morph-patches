package p149l;

import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class dgl extends vp2<LongLinkGiftMessage.PreHourLeaderboardsTopChat> {
    public dgl(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkGiftMessage.PreHourLeaderboardsTopChat preHourLeaderboardsTopChat, String str2) {
        LongLinkGiftMessage.TemplateData tempdata = preHourLeaderboardsTopChat.getTempdata();
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.liveId = preHourLeaderboardsTopChat.getTopLiveId();
        extInfo.roomId = preHourLeaderboardsTopChat.getRoomId();
        return m199210o("", preHourLeaderboardsTopChat.getTempdata().getId(), null, null, Template.TemplateData.newBuilder().setId(tempdata.getId()).addAllFields(tempdata.getFieldsList()).build(), extInfo);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.PreHourLeaderboardsTopChat> mo94398b() {
        return LongLinkGiftMessage.PreHourLeaderboardsTopChat.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.gift.preHourLeaderboardsTopChat";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkGiftMessage.PreHourLeaderboardsTopChat preHourLeaderboardsTopChat, String str) {
        return true;
    }
}
