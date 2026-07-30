package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\rR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, m88121d2 = {"Ll/fgi;", "", "Ll/wfi;", "baseConfig", "", "configFetchURL", "packageRootPath", "packageCheckUpdateURL", "", "extraParams", "<init>", "(Ll/wfi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll/wfi;", "()Ll/wfi;", "b", "Ljava/lang/String;", "c", "e", Constants.INAPP_DATA_TAG, "Ljava/util/Map;", "()Ljava/util/Map;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class fgi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final wfi baseConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String configFetchURL;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String packageRootPath;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String packageCheckUpdateURL;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Map<String, String> extraParams;

    public fgi(@NotNull wfi wfiVar, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map) {
        wfiVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        this.baseConfig = wfiVar;
        this.configFetchURL = str;
        this.packageRootPath = str2;
        this.packageCheckUpdateURL = str3;
        this.extraParams = map;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final wfi getBaseConfig() {
        return this.baseConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getConfigFetchURL() {
        return this.configFetchURL;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Map<String, String> m125497c() {
        return this.extraParams;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPackageCheckUpdateURL() {
        return this.packageCheckUpdateURL;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPackageRootPath() {
        return this.packageRootPath;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof fgi)) {
            return false;
        }
        fgi fgiVar = (fgi) other;
        return Intrinsics.m88377d(this.baseConfig, fgiVar.baseConfig) && Intrinsics.m88377d(this.configFetchURL, fgiVar.configFetchURL) && Intrinsics.m88377d(this.packageRootPath, fgiVar.packageRootPath) && Intrinsics.m88377d(this.packageCheckUpdateURL, fgiVar.packageCheckUpdateURL) && Intrinsics.m88377d(this.extraParams, fgiVar.extraParams);
    }

    public int hashCode() {
        wfi wfiVar = this.baseConfig;
        int iHashCode = (wfiVar != null ? wfiVar.hashCode() : 0) * 31;
        String str = this.configFetchURL;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.packageRootPath;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.packageCheckUpdateURL;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Map<String, String> map = this.extraParams;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FepConfiguration(baseConfig=" + this.baseConfig + ", configFetchURL=" + this.configFetchURL + ", packageRootPath=" + this.packageRootPath + ", packageCheckUpdateURL=" + this.packageCheckUpdateURL + ", extraParams=" + this.extraParams + ")";
    }

    public /* synthetic */ fgi(wfi wfiVar, String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wfiVar, str, str2, str3, (i & 16) != 0 ? MapsKt.emptyMap() : map);
    }
}
