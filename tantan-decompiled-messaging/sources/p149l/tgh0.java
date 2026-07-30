package p149l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplate;

/* JADX INFO: loaded from: classes4.dex */
public class tgh0 extends bk2<LongLinkGiftMessage.SystemLiveCommentsMsg, if2> {
    public tgh0(p3g0<if2, if2> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m188814B(LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg) {
        return m188815C(systemLiveCommentsMsg) || m188817E(systemLiveCommentsMsg);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m188815C(LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg) {
        return (TextUtils.isEmpty(systemLiveCommentsMsg.getIconUrl()) || TextUtils.isEmpty(systemLiveCommentsMsg.getStartColor()) || TextUtils.isEmpty(systemLiveCommentsMsg.getEndColor())) ? false : true;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg, String str) {
        boolean z = m188814B(systemLiveCommentsMsg) && systemLiveCommentsMsg.getDisplayDuration() > 0 && (TextUtils.isEmpty(systemLiveCommentsMsg.getRoomID()) || m199212r(systemLiveCommentsMsg.getRoomID(), "no_care", "no_care"));
        if (!z) {
            xh3.m208744c(systemLiveCommentsMsg, this.f182445c, str);
        }
        return z;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m188817E(LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg) {
        return (systemLiveCommentsMsg.getBackground() == null || TextUtils.isEmpty(systemLiveCommentsMsg.getBackground().getHeaderImgUrl()) || TextUtils.isEmpty(systemLiveCommentsMsg.getBackground().getMiddleImgUrl()) || TextUtils.isEmpty(systemLiveCommentsMsg.getBackground().getBottomImgUrl())) ? false : true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public if2 mo94461z(String str, LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg) {
        BLiveTemplate bLiveTemplateM171773f = this.f182445c.m194417d().m171773f(systemLiveCommentsMsg.getTemplate().getId());
        if (bLiveTemplateM171773f == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilderM171771d = this.f182445c.m194417d().m171771d(Template.TemplateData.newBuilder().setId(systemLiveCommentsMsg.getTemplate().getId()).addAllFields(systemLiveCommentsMsg.getTemplate().getFieldsList()).build(), bLiveTemplateM171773f.format, null);
        xh3.m208745d(spannableStringBuilderM171771d);
        return new rgh0(new sgh0(spannableStringBuilderM171771d, systemLiveCommentsMsg));
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.SystemLiveCommentsMsg> mo94398b() {
        return LongLinkGiftMessage.SystemLiveCommentsMsg.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.common.systemlivecomments";
    }
}
