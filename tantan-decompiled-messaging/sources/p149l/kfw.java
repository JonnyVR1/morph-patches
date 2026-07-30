package p149l;

import android.text.SpannableStringBuilder;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;

/* JADX INFO: loaded from: classes4.dex */
public class kfw {

    /* JADX INFO: renamed from: a */
    public SpannableStringBuilder f122978a;

    /* JADX INFO: renamed from: b */
    public LongLinkGiftMessage.LuckyPrizeMsg f122979b;

    public kfw(SpannableStringBuilder spannableStringBuilder, LongLinkGiftMessage.LuckyPrizeMsg luckyPrizeMsg) {
        this.f122978a = spannableStringBuilder;
        this.f122979b = luckyPrizeMsg;
    }

    /* JADX INFO: renamed from: a */
    public String m145873a() {
        return this.f122979b.getJumpRoomID();
    }

    /* JADX INFO: renamed from: b */
    public String m145874b() {
        return this.f122979b.getLiveID();
    }

    /* JADX INFO: renamed from: c */
    public SpannableStringBuilder m145875c() {
        return this.f122978a;
    }

    /* JADX INFO: renamed from: d */
    public String m145876d() {
        return this.f122979b.getIconUrl();
    }
}
