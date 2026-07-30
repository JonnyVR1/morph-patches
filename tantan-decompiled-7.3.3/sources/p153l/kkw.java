package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.p036mk.core.log.core.MKLogLevel;
import com.hellogroup.p036mk.core.log.core.MKLogSource;
import com.p051p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r\u0012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b)\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b+\u0010\u0017R'\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\"\u00103R'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b\u001e\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b%\u00107R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, m88121d2 = {"Ll/kkw;", "", "Lcom/hellogroup/mk/core/log/core/MKLogLevel;", FirebaseAnalytics.Param.LEVEL, "", "errorCode", "Lcom/hellogroup/mk/core/log/core/MKLogSource;", "source", "module", "bid", "url", "secondBiz", "thirdBiz", "", "infoData", "extraPutData", "", UserBanAppealSwitch.offline, "", "timestampMs", "<init>", "(Lcom/hellogroup/mk/core/log/core/MKLogLevel;Ljava/lang/String;Lcom/hellogroup/mk/core/log/core/MKLogSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ZJ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/hellogroup/mk/core/log/core/MKLogLevel;", "getLevel", "()Lcom/hellogroup/mk/core/log/core/MKLogLevel;", "b", "Ljava/lang/String;", "getErrorCode", "c", "Lcom/hellogroup/mk/core/log/core/MKLogSource;", "getSource", "()Lcom/hellogroup/mk/core/log/core/MKLogSource;", Constants.INAPP_DATA_TAG, "getModule", "e", "getBid", "f", "getUrl", "g", "h", RXScreenCaptureService.KEY_INDEX, "Ljava/util/Map;", "()Ljava/util/Map;", "j", "k", "Z", "()Z", BLiveStormDanmakuGiftResourceType.f45292l, "J", "getTimestampMs", "()J", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class kkw {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MKLogLevel level;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String errorCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MKLogSource source;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final String module;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final String bid;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final String url;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private final String secondBiz;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private final String thirdBiz;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private final Map<String, Object> infoData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private final Map<String, Object> extraPutData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean offline;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final long timestampMs;

    public /* synthetic */ kkw(MKLogLevel mKLogLevel, String str, MKLogSource mKLogSource, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mKLogLevel, str, mKLogSource, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : map, (i & 512) != 0 ? null : map2, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? System.currentTimeMillis() : j);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m150331a() {
        return this.extraPutData;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Map<String, Object> m150332b() {
        return this.infoData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getOffline() {
        return this.offline;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSecondBiz() {
        return this.secondBiz;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getThirdBiz() {
        return this.thirdBiz;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof kkw)) {
            return false;
        }
        kkw kkwVar = (kkw) other;
        return Intrinsics.m88377d(this.level, kkwVar.level) && Intrinsics.m88377d(this.errorCode, kkwVar.errorCode) && Intrinsics.m88377d(this.source, kkwVar.source) && Intrinsics.m88377d(this.module, kkwVar.module) && Intrinsics.m88377d(this.bid, kkwVar.bid) && Intrinsics.m88377d(this.url, kkwVar.url) && Intrinsics.m88377d(this.secondBiz, kkwVar.secondBiz) && Intrinsics.m88377d(this.thirdBiz, kkwVar.thirdBiz) && Intrinsics.m88377d(this.infoData, kkwVar.infoData) && Intrinsics.m88377d(this.extraPutData, kkwVar.extraPutData) && this.offline == kkwVar.offline && this.timestampMs == kkwVar.timestampMs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        MKLogLevel mKLogLevel = this.level;
        int iHashCode = (mKLogLevel != null ? mKLogLevel.hashCode() : 0) * 31;
        String str = this.errorCode;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        MKLogSource mKLogSource = this.source;
        int iHashCode3 = (iHashCode2 + (mKLogSource != null ? mKLogSource.hashCode() : 0)) * 31;
        String str2 = this.module;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.bid;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.url;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.secondBiz;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.thirdBiz;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Map<String, Object> map = this.infoData;
        int iHashCode9 = (iHashCode8 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, Object> map2 = this.extraPutData;
        int iHashCode10 = (iHashCode9 + (map2 != null ? map2.hashCode() : 0)) * 31;
        boolean z = this.offline;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode10 + r1) * 31) + Long.hashCode(this.timestampMs);
    }

    @NotNull
    public String toString() {
        return "MKLogEvent(level=" + this.level + ", errorCode=" + this.errorCode + ", source=" + this.source + ", module=" + this.module + ", bid=" + this.bid + ", url=" + this.url + ", secondBiz=" + this.secondBiz + ", thirdBiz=" + this.thirdBiz + ", infoData=" + this.infoData + ", extraPutData=" + this.extraPutData + ", offline=" + this.offline + ", timestampMs=" + this.timestampMs + ")";
    }

    public kkw(@NotNull MKLogLevel mKLogLevel, @NotNull String str, @NotNull MKLogSource mKLogSource, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Map<String, ? extends Object> map, @Nullable Map<String, ? extends Object> map2, boolean z, long j) {
        mKLogLevel.getClass();
        str.getClass();
        mKLogSource.getClass();
        this.level = mKLogLevel;
        this.errorCode = str;
        this.source = mKLogSource;
        this.module = str2;
        this.bid = str3;
        this.url = str4;
        this.secondBiz = str5;
        this.thirdBiz = str6;
        this.infoData = map;
        this.extraPutData = map2;
        this.offline = z;
        this.timestampMs = j;
    }
}
