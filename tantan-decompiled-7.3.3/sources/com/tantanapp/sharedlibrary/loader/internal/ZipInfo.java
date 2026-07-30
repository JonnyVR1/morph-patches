package com.tantanapp.sharedlibrary.loader.internal;

import androidx.annotation.Keep;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, m88121d2 = {"Lcom/tantanapp/sharedlibrary/loader/internal/ZipInfo;", "", "abi", "", AuthenticationTokenClaims.JSON_KEY_NAME, "md5", "size", "", "url", "soInfoList", "", "Lcom/tantanapp/sharedlibrary/loader/internal/SoInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V", "getAbi", "()Ljava/lang/String;", "getMd5", "getName", "getSize", "()J", "getSoInfoList", "()Ljava/util/List;", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "loader_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final /* data */ class ZipInfo {

    @NotNull
    private final String abi;

    @NotNull
    private final String md5;

    @NotNull
    private final String name;
    private final long size;

    @NotNull
    private final List<SoInfo> soInfoList;

    @NotNull
    private final String url;

    public ZipInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, @NotNull List<SoInfo> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.abi = str;
        this.name = str2;
        this.md5 = str3;
        this.size = j;
        this.url = str4;
        this.soInfoList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZipInfo copy$default(ZipInfo zipInfo, String str, String str2, String str3, long j, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zipInfo.abi;
        }
        if ((i & 2) != 0) {
            str2 = zipInfo.name;
        }
        if ((i & 4) != 0) {
            str3 = zipInfo.md5;
        }
        if ((i & 8) != 0) {
            j = zipInfo.size;
        }
        if ((i & 16) != 0) {
            str4 = zipInfo.url;
        }
        if ((i & 32) != 0) {
            list = zipInfo.soInfoList;
        }
        long j2 = j;
        String str5 = str3;
        return zipInfo.copy(str, str2, str5, j2, str4, list);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final List<SoInfo> component6() {
        return this.soInfoList;
    }

    @NotNull
    public final ZipInfo copy(@NotNull String abi, @NotNull String name, @NotNull String md5, long size, @NotNull String url, @NotNull List<SoInfo> soInfoList) {
        abi.getClass();
        name.getClass();
        md5.getClass();
        url.getClass();
        soInfoList.getClass();
        return new ZipInfo(abi, name, md5, size, url, soInfoList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZipInfo)) {
            return false;
        }
        ZipInfo zipInfo = (ZipInfo) other;
        return Intrinsics.m88377d(this.abi, zipInfo.abi) && Intrinsics.m88377d(this.name, zipInfo.name) && Intrinsics.m88377d(this.md5, zipInfo.md5) && this.size == zipInfo.size && Intrinsics.m88377d(this.url, zipInfo.url) && Intrinsics.m88377d(this.soInfoList, zipInfo.soInfoList);
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

    public final long getSize() {
        return this.size;
    }

    @NotNull
    public final List<SoInfo> getSoInfoList() {
        return this.soInfoList;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((((this.abi.hashCode() * 31) + this.name.hashCode()) * 31) + this.md5.hashCode()) * 31) + Long.hashCode(this.size)) * 31) + this.url.hashCode()) * 31) + this.soInfoList.hashCode();
    }

    @NotNull
    public String toString() {
        return "ZipInfo(abi=" + this.abi + ", name=" + this.name + ", md5=" + this.md5 + ", size=" + this.size + ", url=" + this.url + ", soInfoList=" + this.soInfoList + ')';
    }
}
