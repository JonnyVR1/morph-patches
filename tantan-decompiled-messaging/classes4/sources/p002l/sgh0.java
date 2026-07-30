package p002l;

import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import l.uep0;
import l.yb2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sgh0 {

    /* JADX INFO: renamed from: a */
    public SpannableStringBuilder f19011a;

    /* JADX INFO: renamed from: b */
    public LongLinkGiftMessage.SystemLiveCommentsMsg f19012b;

    public sgh0(SpannableStringBuilder spannableStringBuilder, LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg) {
        this.f19011a = spannableStringBuilder;
        this.f19012b = systemLiveCommentsMsg;
    }

    /* JADX INFO: renamed from: a */
    public LongLinkGiftMessage.Alignment m22453a() {
        return this.f19012b.getAlignment();
    }

    /* JADX INFO: renamed from: b */
    public String m22454b() {
        return this.f19012b.getBackground().getBottomImgUrl();
    }

    /* JADX INFO: renamed from: c */
    public SpannableStringBuilder m22455c() {
        return this.f19011a;
    }

    /* JADX INFO: renamed from: d */
    public String m22456d() {
        return this.f19012b.getBackground().getCoverImgUrl();
    }

    /* JADX INFO: renamed from: e */
    public GradientDrawable m22457e() {
        return yb2.j(uep0.B(this.f19012b.getStartColor()), uep0.B(this.f19012b.getEndColor()), 11);
    }

    /* JADX INFO: renamed from: f */
    public String m22458f() {
        return this.f19012b.getBackground().getHeaderImgUrl();
    }

    /* JADX INFO: renamed from: g */
    public String m22459g() {
        return this.f19012b.getBackground().getMiddleImgUrl();
    }

    /* JADX INFO: renamed from: h */
    public LongLinkGiftMessage.SystemLiveCommentsMsg m22460h() {
        return this.f19012b;
    }

    /* JADX INFO: renamed from: i */
    public SpannableStringBuilder m22461i() {
        return this.f19011a;
    }

    /* JADX INFO: renamed from: j */
    public String m22462j() {
        return this.f19012b.getIconUrl();
    }

    /* JADX INFO: renamed from: k */
    public boolean m22463k() {
        return this.f19012b.getPriority() == 1;
    }

    /* JADX INFO: renamed from: l */
    public boolean m22464l() {
        return !TextUtils.isEmpty(this.f19012b.getGotoSchema());
    }

    /* JADX INFO: renamed from: m */
    public boolean m22465m() {
        return (this.f19012b.getBackground() == null || TextUtils.isEmpty(this.f19012b.getBackground().getHeaderImgUrl()) || TextUtils.isEmpty(this.f19012b.getBackground().getMiddleImgUrl()) || TextUtils.isEmpty(this.f19012b.getBackground().getBottomImgUrl())) ? false : true;
    }
}
