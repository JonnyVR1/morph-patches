package p002l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveTemplate;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lfw extends bk2<LongLinkGiftMessage.LuckyPrizeMsg, if2> {
    public lfw(p3g0<if2, if2> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkGiftMessage.LuckyPrizeMsg luckyPrizeMsg, String str) {
        if (TextUtils.isEmpty(luckyPrizeMsg.getIconUrl())) {
            return false;
        }
        return TextUtils.isEmpty(luckyPrizeMsg.getJumpRoomID()) || !TextUtils.equals(luckyPrizeMsg.getJumpRoomID(), this.f21259c.m23565a().room.id);
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public if2 mo9251z(String str, LongLinkGiftMessage.LuckyPrizeMsg luckyPrizeMsg) {
        BLiveTemplate bLiveTemplateM20739f = this.f21259c.m23568d().m20739f(luckyPrizeMsg.getTemplate().getId());
        if (bLiveTemplateM20739f == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilderM20737d = this.f21259c.m23568d().m20737d(Template.TemplateData.newBuilder().setId(luckyPrizeMsg.getTemplate().getId()).addAllFields(luckyPrizeMsg.getTemplate().getFieldsList()).build(), bLiveTemplateM20739f.format, null);
        xh3.m25939i(spannableStringBuilderM20737d);
        return new l3k(new kfw(spannableStringBuilderM20737d, luckyPrizeMsg));
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LuckyPrizeMsg> mo9244b() {
        return LongLinkGiftMessage.LuckyPrizeMsg.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.common.luckygiftprize";
    }
}
