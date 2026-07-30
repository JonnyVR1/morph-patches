package com.tantanapp.sharedlibrary.loader.internal;

import androidx.annotation.Keep;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u001a\u001a\u00020\bJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006!"}, m87232d2 = {"Lcom/tantanapp/sharedlibrary/loader/internal/ModuleZipInfo;", "", "abi", "", AuthenticationTokenClaims.JSON_KEY_NAME, "md5", "zipInfoList", "", "Lcom/tantanapp/sharedlibrary/loader/internal/ZipInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAbi", "()Ljava/lang/String;", "getMd5", "getName", "getZipInfoList", "()Ljava/util/List;", "setZipInfoList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "getObbZipInfo", "hashCode", "", "setObbInfo", "", "url", "toString", "loader_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final /* data */ class ModuleZipInfo {

    @NotNull
    private final String abi;

    @NotNull
    private final String md5;

    @NotNull
    private final String name;

    @NotNull
    private List<ZipInfo> zipInfoList;

    public ModuleZipInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<ZipInfo> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.abi = str;
        this.name = str2;
        this.md5 = str3;
        this.zipInfoList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModuleZipInfo copy$default(ModuleZipInfo moduleZipInfo, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = moduleZipInfo.abi;
        }
        if ((i & 2) != 0) {
            str2 = moduleZipInfo.name;
        }
        if ((i & 4) != 0) {
            str3 = moduleZipInfo.md5;
        }
        if ((i & 8) != 0) {
            list = moduleZipInfo.zipInfoList;
        }
        return moduleZipInfo.copy(str, str2, str3, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAbi() {
        return this.abi;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    public final List<ZipInfo> component4() {
        return this.zipInfoList;
    }

    @NotNull
    public final ModuleZipInfo copy(@NotNull String abi, @NotNull String name, @NotNull String md5, @NotNull List<ZipInfo> zipInfoList) {
        abi.getClass();
        name.getClass();
        md5.getClass();
        zipInfoList.getClass();
        return new ModuleZipInfo(abi, name, md5, zipInfoList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModuleZipInfo)) {
            return false;
        }
        ModuleZipInfo moduleZipInfo = (ModuleZipInfo) other;
        return Intrinsics.m87488d(this.abi, moduleZipInfo.abi) && Intrinsics.m87488d(this.name, moduleZipInfo.name) && Intrinsics.m87488d(this.md5, moduleZipInfo.md5) && Intrinsics.m87488d(this.zipInfoList, moduleZipInfo.zipInfoList);
    }

    @NotNull
    public final String getAbi() {
        return this.abi;
    }

    @NotNull
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ZipInfo getObbZipInfo() {
        return (ZipInfo) CollectionsKt.first((List) this.zipInfoList);
    }

    @NotNull
    public final List<ZipInfo> getZipInfoList() {
        return this.zipInfoList;
    }

    public int hashCode() {
        return (((((this.abi.hashCode() * 31) + this.name.hashCode()) * 31) + this.md5.hashCode()) * 31) + this.zipInfoList.hashCode();
    }

    public final void setObbInfo(@NotNull String url, @NotNull String name) {
        url.getClass();
        name.getClass();
        this.zipInfoList = CollectionsKt.listOf(ZipInfo.copy$default(getObbZipInfo(), null, name, null, 0L, url, null, 45, null));
    }

    public final void setZipInfoList(@NotNull List<ZipInfo> list) {
        list.getClass();
        this.zipInfoList = list;
    }

    @NotNull
    public String toString() {
        return "ModuleZipInfo(abi=" + this.abi + ", name=" + this.name + ", md5=" + this.md5 + ", zipInfoList=" + this.zipInfoList + ')';
    }
}
