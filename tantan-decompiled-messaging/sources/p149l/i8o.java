package p149l;

import com.p046p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplate;

/* JADX INFO: loaded from: classes4.dex */
public class i8o extends bk2<LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect, vui0> {
    public i8o(p3g0<vui0, vui0> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect giftLeaderboardTopEffect, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public vui0 mo94461z(String str, LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect giftLeaderboardTopEffect) {
        BLiveTemplate bLiveTemplateM171773f = this.f182445c.m194417d().m171773f(giftLeaderboardTopEffect.getTemplate().getId());
        if (bLiveTemplateM171773f == null) {
            return null;
        }
        return new vui0(this.f182445c.m194417d().m171771d(Template.TemplateData.newBuilder().setId(giftLeaderboardTopEffect.getTemplate().getId()).addAllFields(giftLeaderboardTopEffect.getTemplate().getFieldsList()).build(), bLiveTemplateM171773f.format, null), giftLeaderboardTopEffect);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect> mo94398b() {
        return LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.intl.giftLeaderboard.topEffect";
    }
}
