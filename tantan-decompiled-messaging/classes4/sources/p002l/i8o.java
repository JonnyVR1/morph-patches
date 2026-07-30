package p002l;

import com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveTemplate;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class i8o extends bk2<LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect, vui0> {
    public i8o(p3g0<vui0, vui0> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect giftLeaderboardTopEffect, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public vui0 mo9251z(String str, LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect giftLeaderboardTopEffect) {
        BLiveTemplate bLiveTemplateM20739f = this.f21259c.m23568d().m20739f(giftLeaderboardTopEffect.getTemplate().getId());
        if (bLiveTemplateM20739f == null) {
            return null;
        }
        return new vui0(this.f21259c.m23568d().m20737d(Template.TemplateData.newBuilder().setId(giftLeaderboardTopEffect.getTemplate().getId()).addAllFields(giftLeaderboardTopEffect.getTemplate().getFieldsList()).build(), bLiveTemplateM20739f.format, null), giftLeaderboardTopEffect);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect> mo9244b() {
        return LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.intl.giftLeaderboard.topEffect";
    }
}
