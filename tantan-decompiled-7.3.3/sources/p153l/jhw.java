package p153l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplate;

/* JADX INFO: loaded from: classes4.dex */
public class jhw extends jk2<LongLinkGiftMessage.LuckyPrizeMsg, pf2> {
    public jhw(wbg0<pf2, pf2> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkGiftMessage.LuckyPrizeMsg luckyPrizeMsg, String str) {
        if (TextUtils.isEmpty(luckyPrizeMsg.getIconUrl())) {
            return false;
        }
        return TextUtils.isEmpty(luckyPrizeMsg.getJumpRoomID()) || !TextUtils.equals(luckyPrizeMsg.getJumpRoomID(), this.f137993c.m220733a().room.f45267id);
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public pf2 mo95993z(String str, LongLinkGiftMessage.LuckyPrizeMsg luckyPrizeMsg) {
        BLiveTemplate bLiveTemplateM157079f = this.f137993c.m220736d().m157079f(luckyPrizeMsg.getTemplate().getId());
        if (bLiveTemplateM157079f == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilderM157077d = this.f137993c.m220736d().m157077d(Template.TemplateData.newBuilder().setId(luckyPrizeMsg.getTemplate().getId()).addAllFields(luckyPrizeMsg.getTemplate().getFieldsList()).build(), bLiveTemplateM157079f.format, null);
        li3.m154294i(spannableStringBuilderM157077d);
        return new d6k(new ihw(spannableStringBuilderM157077d, luckyPrizeMsg));
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LuckyPrizeMsg> mo95510b() {
        return LongLinkGiftMessage.LuckyPrizeMsg.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.common.luckygiftprize";
    }
}
