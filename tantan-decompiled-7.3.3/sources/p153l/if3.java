package p153l;

import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class if3 extends mq2<LongLinkGiftMessage.LiveBreakingLeaderboard> {
    public if3(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo95513w(String str, LongLinkGiftMessage.LiveBreakingLeaderboard liveBreakingLeaderboard, String str2) {
        return new LiveControlMessage(str, "breaking_leader_board").setContent(liveBreakingLeaderboard.getUserID());
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkGiftMessage.LiveBreakingLeaderboard liveBreakingLeaderboard, String str2) {
        return m159457n(str, liveBreakingLeaderboard.getTempdata().getId(), null, null, Template.TemplateData.newBuilder().setId(liveBreakingLeaderboard.getTempdata().getId()).addAllFields(liveBreakingLeaderboard.getTempdata().getFieldsList()).build());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveBreakingLeaderboard> mo95510b() {
        return LongLinkGiftMessage.LiveBreakingLeaderboard.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.gift.breakingLeaderboard";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkGiftMessage.LiveBreakingLeaderboard liveBreakingLeaderboard, String str) {
        return this.f137993c.m220733a() != null && liveBreakingLeaderboard.getRoomID().equals(this.f137993c.m220733a().room.f45267id);
    }
}
