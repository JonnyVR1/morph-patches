package p002l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveTemplate;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tgh0 extends bk2<LongLinkGiftMessage.SystemLiveCommentsMsg, if2> {
    public tgh0(p3g0<if2, if2> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m22952B(LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg) {
        return m22953C(systemLiveCommentsMsg) || m22955E(systemLiveCommentsMsg);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m22953C(LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg) {
        return (TextUtils.isEmpty(systemLiveCommentsMsg.getIconUrl()) || TextUtils.isEmpty(systemLiveCommentsMsg.getStartColor()) || TextUtils.isEmpty(systemLiveCommentsMsg.getEndColor())) ? false : true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg, String str) {
        boolean z = m22952B(systemLiveCommentsMsg) && systemLiveCommentsMsg.getDisplayDuration() > 0 && (TextUtils.isEmpty(systemLiveCommentsMsg.getRoomID()) || m24095r(systemLiveCommentsMsg.getRoomID(), "no_care", "no_care"));
        if (!z) {
            xh3.m25933c(systemLiveCommentsMsg, this.f21259c, str);
        }
        return z;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m22955E(LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg) {
        return (systemLiveCommentsMsg.getBackground() == null || TextUtils.isEmpty(systemLiveCommentsMsg.getBackground().getHeaderImgUrl()) || TextUtils.isEmpty(systemLiveCommentsMsg.getBackground().getMiddleImgUrl()) || TextUtils.isEmpty(systemLiveCommentsMsg.getBackground().getBottomImgUrl())) ? false : true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public if2 mo9251z(String str, LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg) {
        BLiveTemplate bLiveTemplateM20739f = this.f21259c.m23568d().m20739f(systemLiveCommentsMsg.getTemplate().getId());
        if (bLiveTemplateM20739f == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilderM20737d = this.f21259c.m23568d().m20737d(Template.TemplateData.newBuilder().setId(systemLiveCommentsMsg.getTemplate().getId()).addAllFields(systemLiveCommentsMsg.getTemplate().getFieldsList()).build(), bLiveTemplateM20739f.format, null);
        xh3.m25934d(spannableStringBuilderM20737d);
        return new rgh0(new sgh0(spannableStringBuilderM20737d, systemLiveCommentsMsg));
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.SystemLiveCommentsMsg> mo9244b() {
        return LongLinkGiftMessage.SystemLiveCommentsMsg.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.common.systemlivecomments";
    }
}
