package p149l;

import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class te3 extends vp2<LongLinkGiftMessage.LiveBreakingLeaderboard> {
    public te3(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo99811w(String str, LongLinkGiftMessage.LiveBreakingLeaderboard liveBreakingLeaderboard, String str2) {
        return new LiveControlMessage(str, "breaking_leader_board").setContent(liveBreakingLeaderboard.getUserID());
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkGiftMessage.LiveBreakingLeaderboard liveBreakingLeaderboard, String str2) {
        return m199209n(str, liveBreakingLeaderboard.getTempdata().getId(), null, null, Template.TemplateData.newBuilder().setId(liveBreakingLeaderboard.getTempdata().getId()).addAllFields(liveBreakingLeaderboard.getTempdata().getFieldsList()).build());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveBreakingLeaderboard> mo94398b() {
        return LongLinkGiftMessage.LiveBreakingLeaderboard.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.gift.breakingLeaderboard";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkGiftMessage.LiveBreakingLeaderboard liveBreakingLeaderboard, String str) {
        return this.f182445c.m194414a() != null && liveBreakingLeaderboard.getRoomID().equals(this.f182445c.m194414a().room.f44419id);
    }
}
