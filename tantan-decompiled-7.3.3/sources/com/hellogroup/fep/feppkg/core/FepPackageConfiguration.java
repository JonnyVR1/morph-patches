package com.hellogroup.fep.feppkg.core;

import android.net.Uri;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ngi;
import p153l.wfi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJG\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b%\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b)\u0010\u001cR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, m88121d2 = {"Lcom/hellogroup/fep/feppkg/core/FepPackageConfiguration;", "", "Ll/wfi;", "baseConfig", "", "rootPath", "checkUpdateURL", "", "maxKeepVersionCount", "", "extraParams", "<init>", "(Ll/wfi;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;)V", "", "e", "()Z", "bid", "baseVersion", "currentUrl", "", "localVersion", "Ll/ngi;", "fepGreyState", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLl/ngi;)Ljava/util/Map;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/io/File;", "Lkotlin/Lazy;", "getRootPathFile", "()Ljava/io/File;", "rootPathFile", "b", "Ll/wfi;", "getBaseConfig", "()Ll/wfi;", "c", "Ljava/lang/String;", Constants.INAPP_DATA_TAG, "I", "f", "Ljava/util/Map;", "getExtraParams", "()Ljava/util/Map;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class FepPackageConfiguration {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy rootPathFile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final wfi baseConfig;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String rootPath;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String checkUpdateURL;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int maxKeepVersionCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Map<String, String> extraParams;

    public FepPackageConfiguration(@NotNull wfi wfiVar, @NotNull String str, @NotNull String str2, int i, @NotNull Map<String, String> map) {
        wfiVar.getClass();
        str.getClass();
        str2.getClass();
        map.getClass();
        this.baseConfig = wfiVar;
        this.rootPath = str;
        this.checkUpdateURL = str2;
        this.maxKeepVersionCount = i;
        this.extraParams = map;
        this.rootPathFile = LazyKt__LazyJVMKt.m88118b(new Function0<File>() { // from class: com.hellogroup.fep.feppkg.core.FepPackageConfiguration$rootPathFile$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final File invoke() {
                return new File(this.this$0.getRootPath());
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<String, String> m17647a(@NotNull String bid, @Nullable String baseVersion, @Nullable String currentUrl, long localVersion, @Nullable ngi fepGreyState) {
        bid.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.extraParams);
        this.baseConfig.m206126a(linkedHashMap);
        linkedHashMap.put("bid", bid);
        linkedHashMap.put(WBConstants.AUTH_PARAMS_VERSION, String.valueOf(localVersion));
        if (baseVersion == null) {
            baseVersion = "default";
        } else {
            if (StringsKt.m94329e0(baseVersion)) {
                baseVersion = null;
            }
            if (baseVersion == null) {
                baseVersion = "default";
            }
        }
        linkedHashMap.put("bigVersion", baseVersion);
        if (currentUrl != null && !StringsKt.m94329e0(currentUrl)) {
            linkedHashMap.put("grey", fepGreyState != null ? fepGreyState.m162970e() : false ? "1" : "0");
            if (this.baseConfig.getUseOldApiParam()) {
                linkedHashMap.put(RequestParameters.SUBRESOURCE_REFERER, currentUrl);
            }
            linkedHashMap.put("refererUrl", currentUrl);
            try {
                Result.Companion companion = Result.INSTANCE;
                Uri uri = Uri.parse(currentUrl);
                uri.getClass();
                String host = uri.getHost();
                if (host == null) {
                    host = "";
                }
                linkedHashMap.put("localHost", host);
                Result.m225066constructorimpl(Unit.INSTANCE);
                return linkedHashMap;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m225066constructorimpl(ResultKt.m88127a(th));
            }
        }
        return linkedHashMap;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCheckUpdateURL() {
        return this.checkUpdateURL;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaxKeepVersionCount() {
        return this.maxKeepVersionCount;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRootPath() {
        return this.rootPath;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m17651e() {
        return (StringsKt.m94329e0(this.rootPath) || StringsKt.m94329e0(this.checkUpdateURL) || StringsKt.m94329e0(this.baseConfig.getClientVersion()) || StringsKt.m94329e0(this.baseConfig.getChannel())) ? false : true;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FepPackageConfiguration)) {
            return false;
        }
        FepPackageConfiguration fepPackageConfiguration = (FepPackageConfiguration) other;
        return Intrinsics.m88377d(this.baseConfig, fepPackageConfiguration.baseConfig) && Intrinsics.m88377d(this.rootPath, fepPackageConfiguration.rootPath) && Intrinsics.m88377d(this.checkUpdateURL, fepPackageConfiguration.checkUpdateURL) && this.maxKeepVersionCount == fepPackageConfiguration.maxKeepVersionCount && Intrinsics.m88377d(this.extraParams, fepPackageConfiguration.extraParams);
    }

    public int hashCode() {
        wfi wfiVar = this.baseConfig;
        int iHashCode = (wfiVar != null ? wfiVar.hashCode() : 0) * 31;
        String str = this.rootPath;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.checkUpdateURL;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.maxKeepVersionCount)) * 31;
        Map<String, String> map = this.extraParams;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FepPackageConfiguration(baseConfig=" + this.baseConfig + ", rootPath=" + this.rootPath + ", checkUpdateURL=" + this.checkUpdateURL + ", maxKeepVersionCount=" + this.maxKeepVersionCount + ", extraParams=" + this.extraParams + ")";
    }

    public /* synthetic */ FepPackageConfiguration(wfi wfiVar, String str, String str2, int i, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(wfiVar, str, str2, (i2 & 8) != 0 ? 2 : i, (i2 & 16) != 0 ? MapsKt.emptyMap() : map);
    }
}
