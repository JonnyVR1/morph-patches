package p153l;

import com.p051p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplate;

/* JADX INFO: loaded from: classes4.dex */
public class iao extends jk2<LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect, z3j0> {
    public iao(wbg0<z3j0, z3j0> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect giftLeaderboardTopEffect, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public z3j0 mo95993z(String str, LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect giftLeaderboardTopEffect) {
        BLiveTemplate bLiveTemplateM157079f = this.f137993c.m220736d().m157079f(giftLeaderboardTopEffect.getTemplate().getId());
        if (bLiveTemplateM157079f == null) {
            return null;
        }
        return new z3j0(this.f137993c.m220736d().m157077d(Template.TemplateData.newBuilder().setId(giftLeaderboardTopEffect.getTemplate().getId()).addAllFields(giftLeaderboardTopEffect.getTemplate().getFieldsList()).build(), bLiveTemplateM157079f.format, null), giftLeaderboardTopEffect);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect> mo95510b() {
        return LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.intl.giftLeaderboard.topEffect";
    }
}
