package p002l;

import android.text.SpannableStringBuilder;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kfw {

    /* JADX INFO: renamed from: a */
    public SpannableStringBuilder f14314a;

    /* JADX INFO: renamed from: b */
    public LongLinkGiftMessage.LuckyPrizeMsg f14315b;

    public kfw(SpannableStringBuilder spannableStringBuilder, LongLinkGiftMessage.LuckyPrizeMsg luckyPrizeMsg) {
        this.f14314a = spannableStringBuilder;
        this.f14315b = luckyPrizeMsg;
    }

    /* JADX INFO: renamed from: a */
    public String m16611a() {
        return this.f14315b.getJumpRoomID();
    }

    /* JADX INFO: renamed from: b */
    public String m16612b() {
        return this.f14315b.getLiveID();
    }

    /* JADX INFO: renamed from: c */
    public SpannableStringBuilder m16613c() {
        return this.f14314a;
    }

    /* JADX INFO: renamed from: d */
    public String m16614d() {
        return this.f14315b.getIconUrl();
    }
}
