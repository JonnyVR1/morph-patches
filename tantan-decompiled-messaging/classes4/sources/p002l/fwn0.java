package p002l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet;
import com.p1.mobile.putong.live.base.data.BLiveTemplate;
import l.dwn0;
import l.eln0;
import l.ewn0;
import l.p3g0;
import l.vln0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fwn0 extends bk2<VoiceLiveBullet.SystemVoiceLiveCommentsMsg, eln0> {
    public fwn0(p3g0<eln0, eln0> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m13501B(VoiceLiveBullet.SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg) {
        return m13502C(systemVoiceLiveCommentsMsg) || m13504E(systemVoiceLiveCommentsMsg);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m13502C(VoiceLiveBullet.SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg) {
        return (TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getIconUrl()) || TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getStartColor()) || TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getEndColor())) ? false : true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(VoiceLiveBullet.SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg, String str) {
        boolean z = m13501B(systemVoiceLiveCommentsMsg) && systemVoiceLiveCommentsMsg.getDisplayDuration() > 0 && (TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getRoomID()) || m24095r(systemVoiceLiveCommentsMsg.getRoomID(), "no_care", "no_care"));
        if (!z) {
            vln0.c(systemVoiceLiveCommentsMsg, this.f21259c, str);
        }
        return z;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m13504E(VoiceLiveBullet.SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg) {
        return (systemVoiceLiveCommentsMsg.getBackground() == null || TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getBackground().getHeaderImgUrl()) || TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getBackground().getMiddleImgUrl()) || TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getBackground().getBottomImgUrl())) ? false : true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public dwn0 mo9251z(String str, VoiceLiveBullet.SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg) {
        BLiveTemplate bLiveTemplateM20739f = this.f21259c.m23568d().m20739f(systemVoiceLiveCommentsMsg.getTemplateData().getId());
        if (bLiveTemplateM20739f == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilderM20737d = this.f21259c.m23568d().m20737d(Template.TemplateData.newBuilder().setId(systemVoiceLiveCommentsMsg.getTemplateData().getId()).addAllFields(systemVoiceLiveCommentsMsg.getTemplateData().getFieldsList()).build(), bLiveTemplateM20739f.format, null);
        xh3.m25934d(spannableStringBuilderM20737d);
        return new dwn0(new ewn0(spannableStringBuilderM20737d, systemVoiceLiveCommentsMsg));
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<VoiceLiveBullet.SystemVoiceLiveCommentsMsg> mo9244b() {
        return VoiceLiveBullet.SystemVoiceLiveCommentsMsg.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voiceLive.leaderboard.commentsMsg";
    }
}
