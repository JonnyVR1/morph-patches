package p153l;

import android.text.SpannableStringBuilder;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;

/* JADX INFO: loaded from: classes4.dex */
public class ihw {

    /* JADX INFO: renamed from: a */
    public SpannableStringBuilder f115024a;

    /* JADX INFO: renamed from: b */
    public LongLinkGiftMessage.LuckyPrizeMsg f115025b;

    public ihw(SpannableStringBuilder spannableStringBuilder, LongLinkGiftMessage.LuckyPrizeMsg luckyPrizeMsg) {
        this.f115024a = spannableStringBuilder;
        this.f115025b = luckyPrizeMsg;
    }

    /* JADX INFO: renamed from: a */
    public String m140037a() {
        return this.f115025b.getJumpRoomID();
    }

    /* JADX INFO: renamed from: b */
    public String m140038b() {
        return this.f115025b.getLiveID();
    }

    /* JADX INFO: renamed from: c */
    public SpannableStringBuilder m140039c() {
        return this.f115024a;
    }

    /* JADX INFO: renamed from: d */
    public String m140040d() {
        return this.f115025b.getIconUrl();
    }
}
