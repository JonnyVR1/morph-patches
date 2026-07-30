package p149l;

import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;

/* JADX INFO: loaded from: classes4.dex */
public class sgh0 {

    /* JADX INFO: renamed from: a */
    public SpannableStringBuilder f164420a;

    /* JADX INFO: renamed from: b */
    public LongLinkGiftMessage.SystemLiveCommentsMsg f164421b;

    public sgh0(SpannableStringBuilder spannableStringBuilder, LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg) {
        this.f164420a = spannableStringBuilder;
        this.f164421b = systemLiveCommentsMsg;
    }

    /* JADX INFO: renamed from: a */
    public LongLinkGiftMessage.Alignment m184070a() {
        return this.f164421b.getAlignment();
    }

    /* JADX INFO: renamed from: b */
    public String m184071b() {
        return this.f164421b.getBackground().getBottomImgUrl();
    }

    /* JADX INFO: renamed from: c */
    public SpannableStringBuilder m184072c() {
        return this.f164420a;
    }

    /* JADX INFO: renamed from: d */
    public String m184073d() {
        return this.f164421b.getBackground().getCoverImgUrl();
    }

    /* JADX INFO: renamed from: e */
    public GradientDrawable m184074e() {
        return yb2.m213885j(uep0.m193307B(this.f164421b.getStartColor()), uep0.m193307B(this.f164421b.getEndColor()), 11);
    }

    /* JADX INFO: renamed from: f */
    public String m184075f() {
        return this.f164421b.getBackground().getHeaderImgUrl();
    }

    /* JADX INFO: renamed from: g */
    public String m184076g() {
        return this.f164421b.getBackground().getMiddleImgUrl();
    }

    /* JADX INFO: renamed from: h */
    public LongLinkGiftMessage.SystemLiveCommentsMsg m184077h() {
        return this.f164421b;
    }

    /* JADX INFO: renamed from: i */
    public SpannableStringBuilder m184078i() {
        return this.f164420a;
    }

    /* JADX INFO: renamed from: j */
    public String m184079j() {
        return this.f164421b.getIconUrl();
    }

    /* JADX INFO: renamed from: k */
    public boolean m184080k() {
        return this.f164421b.getPriority() == 1;
    }

    /* JADX INFO: renamed from: l */
    public boolean m184081l() {
        return !TextUtils.isEmpty(this.f164421b.getGotoSchema());
    }

    /* JADX INFO: renamed from: m */
    public boolean m184082m() {
        return (this.f164421b.getBackground() == null || TextUtils.isEmpty(this.f164421b.getBackground().getHeaderImgUrl()) || TextUtils.isEmpty(this.f164421b.getBackground().getMiddleImgUrl()) || TextUtils.isEmpty(this.f164421b.getBackground().getBottomImgUrl())) ? false : true;
    }
}
