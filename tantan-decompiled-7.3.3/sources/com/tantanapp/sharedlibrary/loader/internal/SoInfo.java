package com.tantanapp.sharedlibrary.loader.internal;

import androidx.annotation.Keep;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m88121d2 = {"Lcom/tantanapp/sharedlibrary/loader/internal/SoInfo;", "", "abi", "", AuthenticationTokenClaims.JSON_KEY_NAME, "md5", "size", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getAbi", "()Ljava/lang/String;", "getMd5", "getName", "getSize", "()J", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "loader_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final /* data */ class SoInfo {

    @NotNull
    private final String abi;

    @NotNull
    private final String md5;

    @NotNull
    private final String name;
    private final long size;

    public SoInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.abi = str;
        this.name = str2;
        this.md5 = str3;
        this.size = j;
    }

    public static /* synthetic */ SoInfo copy$default(SoInfo soInfo, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = soInfo.abi;
        }
        if ((i & 2) != 0) {
            str2 = soInfo.name;
        }
        if ((i & 4) != 0) {
            str3 = soInfo.md5;
        }
        if ((i & 8) != 0) {
            j = soInfo.size;
        }
        String str4 = str3;
        return soInfo.copy(str, str2, str4, j);
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
    public final SoInfo copy(@NotNull String abi, @NotNull String name, @NotNull String md5, long size) {
        abi.getClass();
        name.getClass();
        md5.getClass();
        return new SoInfo(abi, name, md5, size);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SoInfo)) {
            return false;
        }
        SoInfo soInfo = (SoInfo) other;
        return Intrinsics.m88377d(this.abi, soInfo.abi) && Intrinsics.m88377d(this.name, soInfo.name) && Intrinsics.m88377d(this.md5, soInfo.md5) && this.size == soInfo.size;
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

    public int hashCode() {
        return (((((this.abi.hashCode() * 31) + this.name.hashCode()) * 31) + this.md5.hashCode()) * 31) + Long.hashCode(this.size);
    }

    @NotNull
    public String toString() {
        return "SoInfo(abi=" + this.abi + ", name=" + this.name + ", md5=" + this.md5 + ", size=" + this.size + ')';
    }
}
