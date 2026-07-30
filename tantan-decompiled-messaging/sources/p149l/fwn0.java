package p149l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplate;

/* JADX INFO: loaded from: classes4.dex */
public class fwn0 extends bk2<VoiceLiveBullet.SystemVoiceLiveCommentsMsg, eln0> {
    public fwn0(p3g0<eln0, eln0> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m123547B(VoiceLiveBullet.SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg) {
        return m123548C(systemVoiceLiveCommentsMsg) || m123550E(systemVoiceLiveCommentsMsg);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m123548C(VoiceLiveBullet.SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg) {
        return (TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getIconUrl()) || TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getStartColor()) || TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getEndColor())) ? false : true;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(VoiceLiveBullet.SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg, String str) {
        boolean z = m123547B(systemVoiceLiveCommentsMsg) && systemVoiceLiveCommentsMsg.getDisplayDuration() > 0 && (TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getRoomID()) || m199212r(systemVoiceLiveCommentsMsg.getRoomID(), "no_care", "no_care"));
        if (!z) {
            vln0.m198817c(systemVoiceLiveCommentsMsg, this.f182445c, str);
        }
        return z;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m123550E(VoiceLiveBullet.SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg) {
        return (systemVoiceLiveCommentsMsg.getBackground() == null || TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getBackground().getHeaderImgUrl()) || TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getBackground().getMiddleImgUrl()) || TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getBackground().getBottomImgUrl())) ? false : true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public dwn0 mo94461z(String str, VoiceLiveBullet.SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg) {
        BLiveTemplate bLiveTemplateM171773f = this.f182445c.m194417d().m171773f(systemVoiceLiveCommentsMsg.getTemplateData().getId());
        if (bLiveTemplateM171773f == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilderM171771d = this.f182445c.m194417d().m171771d(Template.TemplateData.newBuilder().setId(systemVoiceLiveCommentsMsg.getTemplateData().getId()).addAllFields(systemVoiceLiveCommentsMsg.getTemplateData().getFieldsList()).build(), bLiveTemplateM171773f.format, null);
        xh3.m208745d(spannableStringBuilderM171771d);
        return new dwn0(new ewn0(spannableStringBuilderM171771d, systemVoiceLiveCommentsMsg));
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<VoiceLiveBullet.SystemVoiceLiveCommentsMsg> mo94398b() {
        return VoiceLiveBullet.SystemVoiceLiveCommentsMsg.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voiceLive.leaderboard.commentsMsg";
    }
}
