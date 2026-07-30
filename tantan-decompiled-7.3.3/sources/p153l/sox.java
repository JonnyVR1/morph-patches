package p153l;

import com.p051p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class sox extends mq2<LongLinkMedalMessage.LiveMedalChangedMsg> {
    public sox(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkMedalMessage.LiveMedalChangedMsg liveMedalChangedMsg, String str2) {
        return m159457n(str, liveMedalChangedMsg.getTemplate().getId(), LongLinkLiveMessage.UserInfo.newBuilder().setName(liveMedalChangedMsg.getUserName()).setId(liveMedalChangedMsg.getUserID()).build(), null, liveMedalChangedMsg.getTemplate());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMedalMessage.LiveMedalChangedMsg> mo95510b() {
        return LongLinkMedalMessage.LiveMedalChangedMsg.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.medal.change";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkMedalMessage.LiveMedalChangedMsg liveMedalChangedMsg, String str) {
        return m159460r(liveMedalChangedMsg.getRoomID(), "no_care", "no_care");
    }
}
