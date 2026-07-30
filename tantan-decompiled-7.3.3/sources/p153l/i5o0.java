package p153l;

import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet;

/* JADX INFO: loaded from: classes5.dex */
public class i5o0 {

    /* JADX INFO: renamed from: a */
    public SpannableStringBuilder f113086a;

    /* JADX INFO: renamed from: b */
    public VoiceLiveBullet.SystemVoiceLiveCommentsMsg f113087b;

    public i5o0(SpannableStringBuilder spannableStringBuilder, VoiceLiveBullet.SystemVoiceLiveCommentsMsg systemVoiceLiveCommentsMsg) {
        this.f113086a = spannableStringBuilder;
        this.f113087b = systemVoiceLiveCommentsMsg;
    }

    /* JADX INFO: renamed from: a */
    public VoiceLiveBullet.Alignment m138751a() {
        return this.f113087b.getAlignment();
    }

    /* JADX INFO: renamed from: b */
    public String m138752b() {
        return this.f113087b.getBackground().getBottomImgUrl();
    }

    /* JADX INFO: renamed from: c */
    public SpannableStringBuilder m138753c() {
        return this.f113086a;
    }

    /* JADX INFO: renamed from: d */
    public String m138754d() {
        return this.f113087b.getBackground().getCoverImgUrl();
    }

    /* JADX INFO: renamed from: e */
    public GradientDrawable m138755e() {
        return fc2.m124980j(ynp0.m216917B(this.f113087b.getStartColor()), ynp0.m216917B(this.f113087b.getEndColor()), 18);
    }

    /* JADX INFO: renamed from: f */
    public String m138756f() {
        return this.f113087b.getBackground().getHeaderImgUrl();
    }

    /* JADX INFO: renamed from: g */
    public String m138757g() {
        return this.f113087b.getBackground().getMiddleImgUrl();
    }

    /* JADX INFO: renamed from: h */
    public VoiceLiveBullet.SystemVoiceLiveCommentsMsg m138758h() {
        return this.f113087b;
    }

    /* JADX INFO: renamed from: i */
    public String m138759i() {
        return this.f113087b.getIconUrl();
    }

    /* JADX INFO: renamed from: j */
    public boolean m138760j() {
        return this.f113087b.getPriority() == 1;
    }

    /* JADX INFO: renamed from: k */
    public boolean m138761k() {
        return !TextUtils.isEmpty(this.f113087b.getGotoSchema());
    }

    /* JADX INFO: renamed from: l */
    public boolean m138762l() {
        return (this.f113087b.getBackground() == null || TextUtils.isEmpty(this.f113087b.getBackground().getHeaderImgUrl()) || TextUtils.isEmpty(this.f113087b.getBackground().getMiddleImgUrl()) || TextUtils.isEmpty(this.f113087b.getBackground().getBottomImgUrl())) ? false : true;
    }
}
