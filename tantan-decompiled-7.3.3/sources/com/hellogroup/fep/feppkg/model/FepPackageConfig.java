package com.hellogroup.fep.feppkg.model;

import androidx.annotation.Keep;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 12\u00020\u0001:\u00012BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013Jh\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0013J\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b.\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b/\u0010\u0013R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b0\u0010\u0013¨\u00063"}, m88121d2 = {"Lcom/hellogroup/fep/feppkg/model/FepPackageConfig;", "", "", "bid", "", "version", "expired", "", "frequency", "url", FepPackageConfig.KEY_VERSION_STR, FepPackageConfig.KEY_MULTI, FepPackageConfig.KEY_OFFLINE_TYPE, "<init>", "(Ljava/lang/String;JJDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "isSandbox", "()Z", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "()D", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "(Ljava/lang/String;JJDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/hellogroup/fep/feppkg/model/FepPackageConfig;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBid", "J", "getVersion", "getExpired", "D", "getFrequency", "getUrl", "getVersionStr", "getMulti", "getOfflineType", "Companion", "a", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class FepPackageConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String KEY_BID = "id";
    private static final String KEY_EXPIRED = "expired";
    private static final String KEY_FREQUENCY = "frequency";
    private static final String KEY_MULTI = "multi";
    private static final String KEY_OFFLINE_TYPE = "offlineType";
    private static final String KEY_URL = "url";
    private static final String KEY_VERSION = "version";
    private static final String KEY_VERSION_STR = "versionStr";

    @NotNull
    private final String bid;
    private final long expired;
    private final double frequency;

    @Nullable
    private final String multi;

    @Nullable
    private final String offlineType;

    @Nullable
    private final String url;
    private final long version;

    @Nullable
    private final String versionStr;

    public /* synthetic */ FepPackageConfig(String str, long j, long j2, double d, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, d, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5);
    }

    public static /* synthetic */ FepPackageConfig copy$default(FepPackageConfig fepPackageConfig, String str, long j, long j2, double d, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fepPackageConfig.bid;
        }
        if ((i & 2) != 0) {
            j = fepPackageConfig.version;
        }
        if ((i & 4) != 0) {
            j2 = fepPackageConfig.expired;
        }
        if ((i & 8) != 0) {
            d = fepPackageConfig.frequency;
        }
        if ((i & 16) != 0) {
            str2 = fepPackageConfig.url;
        }
        if ((i & 32) != 0) {
            str3 = fepPackageConfig.versionStr;
        }
        if ((i & 64) != 0) {
            str4 = fepPackageConfig.multi;
        }
        if ((i & 128) != 0) {
            str5 = fepPackageConfig.offlineType;
        }
        double d2 = d;
        long j3 = j2;
        return fepPackageConfig.copy(str, j, j3, d2, str2, str3, str4, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBid() {
        return this.bid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getExpired() {
        return this.expired;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getFrequency() {
        return this.frequency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVersionStr() {
        return this.versionStr;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMulti() {
        return this.multi;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOfflineType() {
        return this.offlineType;
    }

    @NotNull
    public final FepPackageConfig copy(@NotNull String bid, long version, long expired, double frequency, @Nullable String url, @Nullable String versionStr, @Nullable String multi, @Nullable String offlineType) {
        bid.getClass();
        return new FepPackageConfig(bid, version, expired, frequency, url, versionStr, multi, offlineType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FepPackageConfig)) {
            return false;
        }
        FepPackageConfig fepPackageConfig = (FepPackageConfig) other;
        return Intrinsics.m88377d(this.bid, fepPackageConfig.bid) && this.version == fepPackageConfig.version && this.expired == fepPackageConfig.expired && Double.compare(this.frequency, fepPackageConfig.frequency) == 0 && Intrinsics.m88377d(this.url, fepPackageConfig.url) && Intrinsics.m88377d(this.versionStr, fepPackageConfig.versionStr) && Intrinsics.m88377d(this.multi, fepPackageConfig.multi) && Intrinsics.m88377d(this.offlineType, fepPackageConfig.offlineType);
    }

    @NotNull
    public final String getBid() {
        return this.bid;
    }

    public final long getExpired() {
        return this.expired;
    }

    public final double getFrequency() {
        return this.frequency;
    }

    @Nullable
    public final String getMulti() {
        return this.multi;
    }

    @Nullable
    public final String getOfflineType() {
        return this.offlineType;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final long getVersion() {
        return this.version;
    }

    @Nullable
    public final String getVersionStr() {
        return this.versionStr;
    }

    public int hashCode() {
        String str = this.bid;
        int iHashCode = (((((((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.version)) * 31) + Long.hashCode(this.expired)) * 31) + Double.hashCode(this.frequency)) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.versionStr;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.multi;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.offlineType;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isSandbox() {
        return Intrinsics.m88377d(this.offlineType, "sandbox");
    }

    @NotNull
    public String toString() {
        return "FepPackageConfig(bid=" + this.bid + ", version=" + this.version + ", expired=" + this.expired + ", frequency=" + this.frequency + ", url=" + this.url + ", versionStr=" + this.versionStr + ", multi=" + this.multi + ", offlineType=" + this.offlineType + ")";
    }

    /* JADX INFO: renamed from: com.hellogroup.fep.feppkg.model.FepPackageConfig$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\n¨\u0006\u0012"}, m88121d2 = {"Lcom/hellogroup/fep/feppkg/model/FepPackageConfig$a;", "", "<init>", "()V", "", "jsonStr", "Lcom/hellogroup/fep/feppkg/model/FepPackageConfig;", "a", "(Ljava/lang/String;)Lcom/hellogroup/fep/feppkg/model/FepPackageConfig;", "KEY_BID", "Ljava/lang/String;", "KEY_EXPIRED", "KEY_FREQUENCY", "KEY_MULTI", "KEY_OFFLINE_TYPE", "KEY_URL", "KEY_VERSION", "KEY_VERSION_STR", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final FepPackageConfig m17743a(@NotNull String jsonStr) throws JSONException {
            jsonStr.getClass();
            JSONObject jSONObject = new JSONObject(jsonStr);
            String strOptString = jSONObject.optString("id");
            strOptString.getClass();
            long jOptLong = jSONObject.optLong("version");
            double dOptDouble = jSONObject.optDouble("frequency");
            return new FepPackageConfig(strOptString, jOptLong, jSONObject.optLong("expired"), dOptDouble, jSONObject.optString("url"), jSONObject.optString(FepPackageConfig.KEY_VERSION_STR, ""), jSONObject.optString(FepPackageConfig.KEY_MULTI), jSONObject.optString(FepPackageConfig.KEY_OFFLINE_TYPE, ""));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FepPackageConfig(@NotNull String str, long j, long j2, double d, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        str.getClass();
        this.bid = str;
        this.version = j;
        this.expired = j2;
        this.frequency = d;
        this.url = str2;
        this.versionStr = str3;
        this.multi = str4;
        this.offlineType = str5;
    }
}
