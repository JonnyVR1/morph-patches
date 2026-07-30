package p153l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplate;

/* JADX INFO: loaded from: classes4.dex */
public class aph0 extends jk2<LongLinkGiftMessage.SystemLiveCommentsMsg, pf2> {
    public aph0(wbg0<pf2, pf2> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m99317B(LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg) {
        return m99318C(systemLiveCommentsMsg) || m99320E(systemLiveCommentsMsg);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m99318C(LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg) {
        return (TextUtils.isEmpty(systemLiveCommentsMsg.getIconUrl()) || TextUtils.isEmpty(systemLiveCommentsMsg.getStartColor()) || TextUtils.isEmpty(systemLiveCommentsMsg.getEndColor())) ? false : true;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg, String str) {
        boolean z = m99317B(systemLiveCommentsMsg) && systemLiveCommentsMsg.getDisplayDuration() > 0 && (TextUtils.isEmpty(systemLiveCommentsMsg.getRoomID()) || m159460r(systemLiveCommentsMsg.getRoomID(), "no_care", "no_care"));
        if (!z) {
            li3.m154288c(systemLiveCommentsMsg, this.f137993c, str);
        }
        return z;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m99320E(LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg) {
        return (systemLiveCommentsMsg.getBackground() == null || TextUtils.isEmpty(systemLiveCommentsMsg.getBackground().getHeaderImgUrl()) || TextUtils.isEmpty(systemLiveCommentsMsg.getBackground().getMiddleImgUrl()) || TextUtils.isEmpty(systemLiveCommentsMsg.getBackground().getBottomImgUrl())) ? false : true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public pf2 mo95993z(String str, LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg) {
        BLiveTemplate bLiveTemplateM157079f = this.f137993c.m220736d().m157079f(systemLiveCommentsMsg.getTemplate().getId());
        if (bLiveTemplateM157079f == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilderM157077d = this.f137993c.m220736d().m157077d(Template.TemplateData.newBuilder().setId(systemLiveCommentsMsg.getTemplate().getId()).addAllFields(systemLiveCommentsMsg.getTemplate().getFieldsList()).build(), bLiveTemplateM157079f.format, null);
        li3.m154289d(spannableStringBuilderM157077d);
        return new yoh0(new zoh0(spannableStringBuilderM157077d, systemLiveCommentsMsg));
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.SystemLiveCommentsMsg> mo95510b() {
        return LongLinkGiftMessage.SystemLiveCommentsMsg.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.common.systemlivecomments";
    }
}
