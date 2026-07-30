package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p1.mobile.longlink.msg.template.Template;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class te3 extends vp2<LongLinkGiftMessage.LiveBreakingLeaderboard> {
    public te3(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo10148w(String str, LongLinkGiftMessage.LiveBreakingLeaderboard liveBreakingLeaderboard, String str2) {
        return new LiveControlMessage(str, "breaking_leader_board").setContent(liveBreakingLeaderboard.getUserID());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkGiftMessage.LiveBreakingLeaderboard liveBreakingLeaderboard, String str2) {
        return m24092n(str, liveBreakingLeaderboard.getTempdata().getId(), null, null, (Template.TemplateData) Template.TemplateData.newBuilder().setId(liveBreakingLeaderboard.getTempdata().getId()).addAllFields(liveBreakingLeaderboard.getTempdata().getFieldsList()).build());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveBreakingLeaderboard> mo9244b() {
        return LongLinkGiftMessage.LiveBreakingLeaderboard.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.gift.breakingLeaderboard";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkGiftMessage.LiveBreakingLeaderboard liveBreakingLeaderboard, String str) {
        return this.f21259c.m23565a() != null && liveBreakingLeaderboard.getRoomID().equals(this.f21259c.m23565a().room.id);
    }
}
