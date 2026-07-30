package p153l;

import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;

/* JADX INFO: loaded from: classes4.dex */
public class zoh0 {

    /* JADX INFO: renamed from: a */
    public SpannableStringBuilder f205352a;

    /* JADX INFO: renamed from: b */
    public LongLinkGiftMessage.SystemLiveCommentsMsg f205353b;

    public zoh0(SpannableStringBuilder spannableStringBuilder, LongLinkGiftMessage.SystemLiveCommentsMsg systemLiveCommentsMsg) {
        this.f205352a = spannableStringBuilder;
        this.f205353b = systemLiveCommentsMsg;
    }

    /* JADX INFO: renamed from: a */
    public LongLinkGiftMessage.Alignment m220765a() {
        return this.f205353b.getAlignment();
    }

    /* JADX INFO: renamed from: b */
    public String m220766b() {
        return this.f205353b.getBackground().getBottomImgUrl();
    }

    /* JADX INFO: renamed from: c */
    public SpannableStringBuilder m220767c() {
        return this.f205352a;
    }

    /* JADX INFO: renamed from: d */
    public String m220768d() {
        return this.f205353b.getBackground().getCoverImgUrl();
    }

    /* JADX INFO: renamed from: e */
    public GradientDrawable m220769e() {
        return fc2.m124980j(ynp0.m216917B(this.f205353b.getStartColor()), ynp0.m216917B(this.f205353b.getEndColor()), 11);
    }

    /* JADX INFO: renamed from: f */
    public String m220770f() {
        return this.f205353b.getBackground().getHeaderImgUrl();
    }

    /* JADX INFO: renamed from: g */
    public String m220771g() {
        return this.f205353b.getBackground().getMiddleImgUrl();
    }

    /* JADX INFO: renamed from: h */
    public LongLinkGiftMessage.SystemLiveCommentsMsg m220772h() {
        return this.f205353b;
    }

    /* JADX INFO: renamed from: i */
    public SpannableStringBuilder m220773i() {
        return this.f205352a;
    }

    /* JADX INFO: renamed from: j */
    public String m220774j() {
        return this.f205353b.getIconUrl();
    }

    /* JADX INFO: renamed from: k */
    public boolean m220775k() {
        return this.f205353b.getPriority() == 1;
    }

    /* JADX INFO: renamed from: l */
    public boolean m220776l() {
        return !TextUtils.isEmpty(this.f205353b.getGotoSchema());
    }

    /* JADX INFO: renamed from: m */
    public boolean m220777m() {
        return (this.f205353b.getBackground() == null || TextUtils.isEmpty(this.f205353b.getBackground().getHeaderImgUrl()) || TextUtils.isEmpty(this.f205353b.getBackground().getMiddleImgUrl()) || TextUtils.isEmpty(this.f205353b.getBackground().getBottomImgUrl())) ? false : true;
    }
}
