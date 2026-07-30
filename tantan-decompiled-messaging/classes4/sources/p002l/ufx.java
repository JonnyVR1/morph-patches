package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ufx extends vp2<LongLinkMedalMessage.LiveMedalChangedMsg> {
    public ufx(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkMedalMessage.LiveMedalChangedMsg liveMedalChangedMsg, String str2) {
        return m24092n(str, liveMedalChangedMsg.getTemplate().getId(), (LongLinkLiveMessage.UserInfo) LongLinkLiveMessage.UserInfo.newBuilder().setName(liveMedalChangedMsg.getUserName()).setId(liveMedalChangedMsg.getUserID()).build(), null, liveMedalChangedMsg.getTemplate());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMedalMessage.LiveMedalChangedMsg> mo9244b() {
        return LongLinkMedalMessage.LiveMedalChangedMsg.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.medal.change";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkMedalMessage.LiveMedalChangedMsg liveMedalChangedMsg, String str) {
        return m24095r(liveMedalChangedMsg.getRoomID(), "no_care", "no_care");
    }
}
