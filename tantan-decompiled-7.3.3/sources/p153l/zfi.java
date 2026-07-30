package p153l;

import com.google.firebase.messaging.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u001d\u0010#R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b$\u0010#R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b \u0010\u0010¨\u0006("}, m88121d2 = {"Ll/zfi;", "", "", "hashStr", "", "needUpdate", "", "switchDic", "mkConfig", "", "rules", "recommendConfig", Constants.MessagePayloadKeys.RAW_DATA, "<init>", "(Ljava/lang/String;ZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "isLocalData", "()Z", "f", "(Z)V", "b", "Ljava/lang/String;", "c", com.clevertap.android.sdk.Constants.INAPP_DATA_TAG, "Ljava/util/Map;", "getSwitchDic", "()Ljava/util/Map;", "e", "g", "getRecommendConfig", "h", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class zfi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isLocalData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final String hashStr;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean needUpdate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Map<String, String> switchDic;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Object> mkConfig;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Object> rules;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Object> recommendConfig;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private final String rawData;

    public /* synthetic */ zfi(String str, boolean z, Map map, Map map2, Map map3, Map map4, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? MapsKt.emptyMap() : map2, (i & 16) != 0 ? new LinkedHashMap() : map3, (i & 32) != 0 ? MapsKt.emptyMap() : map4, (i & 64) != 0 ? null : str2);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHashStr() {
        return this.hashStr;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<String, Object> m219537b() {
        return this.mkConfig;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getNeedUpdate() {
        return this.needUpdate;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRawData() {
        return this.rawData;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final synchronized Map<String, Object> m219540e() {
        return this.rules;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof zfi)) {
            return false;
        }
        zfi zfiVar = (zfi) other;
        return Intrinsics.m88377d(this.hashStr, zfiVar.hashStr) && this.needUpdate == zfiVar.needUpdate && Intrinsics.m88377d(this.switchDic, zfiVar.switchDic) && Intrinsics.m88377d(this.mkConfig, zfiVar.mkConfig) && Intrinsics.m88377d(this.rules, zfiVar.rules) && Intrinsics.m88377d(this.recommendConfig, zfiVar.recommendConfig) && Intrinsics.m88377d(this.rawData, zfiVar.rawData);
    }

    /* JADX INFO: renamed from: f */
    public final void m219541f(boolean z) {
        this.isLocalData = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    public int hashCode() {
        String str = this.hashStr;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.needUpdate;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        Map<String, String> map = this.switchDic;
        int iHashCode2 = (i + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, Object> map2 = this.mkConfig;
        int iHashCode3 = (iHashCode2 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, Object> map3 = this.rules;
        int iHashCode4 = (iHashCode3 + (map3 != null ? map3.hashCode() : 0)) * 31;
        Map<String, Object> map4 = this.recommendConfig;
        int iHashCode5 = (iHashCode4 + (map4 != null ? map4.hashCode() : 0)) * 31;
        String str2 = this.rawData;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FepConfigData(hashStr=" + this.hashStr + ", needUpdate=" + this.needUpdate + ", switchDic=" + this.switchDic + ", mkConfig=" + this.mkConfig + ", rules=" + this.rules + ", recommendConfig=" + this.recommendConfig + ", rawData=" + this.rawData + ")";
    }

    public zfi(@Nullable String str, boolean z, @NotNull Map<String, String> map, @NotNull Map<String, ? extends Object> map2, @NotNull Map<String, Object> map3, @NotNull Map<String, ? extends Object> map4, @Nullable String str2) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        this.hashStr = str;
        this.needUpdate = z;
        this.switchDic = map;
        this.mkConfig = map2;
        this.rules = map3;
        this.recommendConfig = map4;
        this.rawData = str2;
    }

    public zfi() {
        this(null, false, null, null, null, null, null, 127, null);
    }
}
