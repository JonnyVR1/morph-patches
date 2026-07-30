package p149l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplate;

/* JADX INFO: loaded from: classes4.dex */
public class lfw extends bk2<LongLinkGiftMessage.LuckyPrizeMsg, if2> {
    public lfw(p3g0<if2, if2> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkGiftMessage.LuckyPrizeMsg luckyPrizeMsg, String str) {
        if (TextUtils.isEmpty(luckyPrizeMsg.getIconUrl())) {
            return false;
        }
        return TextUtils.isEmpty(luckyPrizeMsg.getJumpRoomID()) || !TextUtils.equals(luckyPrizeMsg.getJumpRoomID(), this.f182445c.m194414a().room.f44419id);
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public if2 mo94461z(String str, LongLinkGiftMessage.LuckyPrizeMsg luckyPrizeMsg) {
        BLiveTemplate bLiveTemplateM171773f = this.f182445c.m194417d().m171773f(luckyPrizeMsg.getTemplate().getId());
        if (bLiveTemplateM171773f == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilderM171771d = this.f182445c.m194417d().m171771d(Template.TemplateData.newBuilder().setId(luckyPrizeMsg.getTemplate().getId()).addAllFields(luckyPrizeMsg.getTemplate().getFieldsList()).build(), bLiveTemplateM171773f.format, null);
        xh3.m208750i(spannableStringBuilderM171771d);
        return new l3k(new kfw(spannableStringBuilderM171771d, luckyPrizeMsg));
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LuckyPrizeMsg> mo94398b() {
        return LongLinkGiftMessage.LuckyPrizeMsg.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.common.luckygiftprize";
    }
}
