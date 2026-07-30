package p149l;

import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet;

/* JADX INFO: loaded from: classes5.dex */
public class ewn0 {

    /* JADX INFO: renamed from: a */
    public SpannableStringBuilder f93510a;

    /* JADX INFO: renamed from: b */
    public VoiceLiveBullet.SystemVoiceLiveCommentsMsg f93511b;

    public ewn0(SpannableStringBuilder spannableStringBuilder, VoiceLiveBullet.SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg) {
        this.f93510a = spannableStringBuilder;
        this.f93511b = systemVoiceLiveCommentsMsg;
    }

    /* JADX INFO: renamed from: a */
    public VoiceLiveBullet.Alignment m118474a() {
        return this.f93511b.getAlignment();
    }

    /* JADX INFO: renamed from: b */
    public String m118475b() {
        return this.f93511b.getBackground().getBottomImgUrl();
    }

    /* JADX INFO: renamed from: c */
    public SpannableStringBuilder m118476c() {
        return this.f93510a;
    }

    /* JADX INFO: renamed from: d */
    public String m118477d() {
        return this.f93511b.getBackground().getCoverImgUrl();
    }

    /* JADX INFO: renamed from: e */
    public GradientDrawable m118478e() {
        return yb2.m213885j(uep0.m193307B(this.f93511b.getStartColor()), uep0.m193307B(this.f93511b.getEndColor()), 18);
    }

    /* JADX INFO: renamed from: f */
    public String m118479f() {
        return this.f93511b.getBackground().getHeaderImgUrl();
    }

    /* JADX INFO: renamed from: g */
    public String m118480g() {
        return this.f93511b.getBackground().getMiddleImgUrl();
    }

    /* JADX INFO: renamed from: h */
    public VoiceLiveBullet.SystemVoiceLiveCommentsMsg m118481h() {
        return this.f93511b;
    }

    /* JADX INFO: renamed from: i */
    public String m118482i() {
        return this.f93511b.getIconUrl();
    }

    /* JADX INFO: renamed from: j */
    public boolean m118483j() {
        return this.f93511b.getPriority() == 1;
    }

    /* JADX INFO: renamed from: k */
    public boolean m118484k() {
        return !TextUtils.isEmpty(this.f93511b.getGotoSchema());
    }

    /* JADX INFO: renamed from: l */
    public boolean m118485l() {
        return (this.f93511b.getBackground() == null || TextUtils.isEmpty(this.f93511b.getBackground().getHeaderImgUrl()) || TextUtils.isEmpty(this.f93511b.getBackground().getMiddleImgUrl()) || TextUtils.isEmpty(this.f93511b.getBackground().getBottomImgUrl())) ? false : true;
    }
}
