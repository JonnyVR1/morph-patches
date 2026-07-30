package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u001cR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u001cR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u001cR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001a\u0004\b \u0010\u0011\"\u0004\b$\u0010\u001cR6\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\u001d\u0010'\"\u0004\b(\u0010)R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010*\u001a\u0004\b%\u0010+\"\u0004\b,\u0010-R\"\u0010\f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010*\u001a\u0004\b\u0018\u0010+\"\u0004\b.\u0010-R\"\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010*\u001a\u0004\b#\u0010+\"\u0004\b/\u0010-¨\u00060"}, m87232d2 = {"Ll/bi60;", "", "", "title", "subtitle", "sticker", "dayPriceSticker", "Lkotlin/Triple;", "", "bubble", "", "showTotalPrice", "autoPay", "needTrackSticker", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/Triple;ZZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "p", "(Ljava/lang/String;)V", "b", "g", "o", "c", "f", "n", Constants.INAPP_DATA_TAG, "k", "e", "Lkotlin/Triple;", "()Lkotlin/Triple;", "j", "(Lkotlin/Triple;)V", "Z", "()Z", "m", "(Z)V", RXScreenCaptureService.KEY_INDEX, BLiveStormDanmakuGiftResourceType.f44444l, "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* data */ class bi60 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public String sticker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String dayPriceSticker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Triple<String, Long, String> bubble;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean showTotalPrice;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean autoPay;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean needTrackSticker;

    public /* synthetic */ bi60(String str, String str2, String str3, String str4, Triple triple, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : triple, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAutoPay() {
        return this.autoPay;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Triple<String, Long, String> m101972b() {
        return this.bubble;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDayPriceSticker() {
        return this.dayPriceSticker;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getNeedTrackSticker() {
        return this.needTrackSticker;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowTotalPrice() {
        return this.showTotalPrice;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof bi60)) {
            return false;
        }
        bi60 bi60Var = (bi60) other;
        return Intrinsics.m87488d(this.title, bi60Var.title) && Intrinsics.m87488d(this.subtitle, bi60Var.subtitle) && Intrinsics.m87488d(this.sticker, bi60Var.sticker) && Intrinsics.m87488d(this.dayPriceSticker, bi60Var.dayPriceSticker) && Intrinsics.m87488d(this.bubble, bi60Var.bubble) && this.showTotalPrice == bi60Var.showTotalPrice && this.autoPay == bi60Var.autoPay && this.needTrackSticker == bi60Var.needTrackSticker;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSticker() {
        return this.sticker;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sticker;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dayPriceSticker;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Triple<String, Long, String> triple = this.bubble;
        return ((((((iHashCode4 + (triple != null ? triple.hashCode() : 0)) * 31) + Boolean.hashCode(this.showTotalPrice)) * 31) + Boolean.hashCode(this.autoPay)) * 31) + Boolean.hashCode(this.needTrackSticker);
    }

    /* JADX INFO: renamed from: i */
    public final void m101979i(boolean z) {
        this.autoPay = z;
    }

    /* JADX INFO: renamed from: j */
    public final void m101980j(@Nullable Triple<String, Long, String> triple) {
        this.bubble = triple;
    }

    /* JADX INFO: renamed from: k */
    public final void m101981k(@Nullable String str) {
        this.dayPriceSticker = str;
    }

    /* JADX INFO: renamed from: l */
    public final void m101982l(boolean z) {
        this.needTrackSticker = z;
    }

    /* JADX INFO: renamed from: m */
    public final void m101983m(boolean z) {
        this.showTotalPrice = z;
    }

    /* JADX INFO: renamed from: n */
    public final void m101984n(@Nullable String str) {
        this.sticker = str;
    }

    /* JADX INFO: renamed from: o */
    public final void m101985o(@Nullable String str) {
        this.subtitle = str;
    }

    /* JADX INFO: renamed from: p */
    public final void m101986p(@NotNull String str) {
        str.getClass();
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "PaymentTextResponseData(title=" + this.title + ", subtitle=" + this.subtitle + ", sticker=" + this.sticker + ", dayPriceSticker=" + this.dayPriceSticker + ", bubble=" + this.bubble + ", showTotalPrice=" + this.showTotalPrice + ", autoPay=" + this.autoPay + ", needTrackSticker=" + this.needTrackSticker + ")";
    }

    public bi60(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Triple<String, Long, String> triple, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.title = str;
        this.subtitle = str2;
        this.sticker = str3;
        this.dayPriceSticker = str4;
        this.bubble = triple;
        this.showTotalPrice = z;
        this.autoPay = z2;
        this.needTrackSticker = z3;
    }

    public bi60() {
        this(null, null, null, null, null, false, false, false, 255, null);
    }
}
