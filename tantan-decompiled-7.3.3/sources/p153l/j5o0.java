package p153l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplate;

/* JADX INFO: loaded from: classes4.dex */
public class j5o0 extends jk2<VoiceLiveBullet.SystemVoiceLiveCommentsMsg, iun0> {
    public j5o0(wbg0<iun0, iun0> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m143548B(VoiceLiveBullet.SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg) {
        return m143549C(systemVoiceLiveCommentsMsg) || m143551E(systemVoiceLiveCommentsMsg);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m143549C(VoiceLiveBullet.SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg) {
        return (TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getIconUrl()) || TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getStartColor()) || TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getEndColor())) ? false : true;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(VoiceLiveBullet.SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg, String str) {
        boolean z = m143548B(systemVoiceLiveCommentsMsg) && systemVoiceLiveCommentsMsg.getDisplayDuration() > 0 && (TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getRoomID()) || m159460r(systemVoiceLiveCommentsMsg.getRoomID(), "no_care", "no_care"));
        if (!z) {
            zun0.m221679c(systemVoiceLiveCommentsMsg, this.f137993c, str);
        }
        return z;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m143551E(VoiceLiveBullet.SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg) {
        return (systemVoiceLiveCommentsMsg.getBackground() == null || TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getBackground().getHeaderImgUrl()) || TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getBackground().getMiddleImgUrl()) || TextUtils.isEmpty(systemVoiceLiveCommentsMsg.getBackground().getBottomImgUrl())) ? false : true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public h5o0 mo95993z(String str, VoiceLiveBullet.SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg) {
        BLiveTemplate bLiveTemplateM157079f = this.f137993c.m220736d().m157079f(systemVoiceLiveCommentsMsg.getTemplateData().getId());
        if (bLiveTemplateM157079f == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilderM157077d = this.f137993c.m220736d().m157077d(Template.TemplateData.newBuilder().setId(systemVoiceLiveCommentsMsg.getTemplateData().getId()).addAllFields(systemVoiceLiveCommentsMsg.getTemplateData().getFieldsList()).build(), bLiveTemplateM157079f.format, null);
        li3.m154289d(spannableStringBuilderM157077d);
        return new h5o0(new i5o0(spannableStringBuilderM157077d, systemVoiceLiveCommentsMsg));
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<VoiceLiveBullet.SystemVoiceLiveCommentsMsg> mo95510b() {
        return VoiceLiveBullet.SystemVoiceLiveCommentsMsg.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voiceLive.leaderboard.commentsMsg";
    }
}
