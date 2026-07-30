package p149l;

import com.p046p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class ufx extends vp2<LongLinkMedalMessage.LiveMedalChangedMsg> {
    public ufx(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkMedalMessage.LiveMedalChangedMsg liveMedalChangedMsg, String str2) {
        return m199209n(str, liveMedalChangedMsg.getTemplate().getId(), LongLinkLiveMessage.UserInfo.newBuilder().setName(liveMedalChangedMsg.getUserName()).setId(liveMedalChangedMsg.getUserID()).build(), null, liveMedalChangedMsg.getTemplate());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMedalMessage.LiveMedalChangedMsg> mo94398b() {
        return LongLinkMedalMessage.LiveMedalChangedMsg.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.medal.change";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkMedalMessage.LiveMedalChangedMsg liveMedalChangedMsg, String str) {
        return m199212r(liveMedalChangedMsg.getRoomID(), "no_care", "no_care");
    }
}
