package com.tantanapp.common.nativelib.manager.bean;

import androidx.annotation.Keep;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.Expose;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, m87232d2 = {"Lcom/tantanapp/common/nativelib/manager/bean/ZipFileInfo;", "", "md5", "", "size", "", "abi", "module", AuthenticationTokenClaims.JSON_KEY_NAME, "url", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAbi", "()Ljava/lang/String;", "getMd5", "getModule", "getName", "getSize", "()J", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Companion", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final /* data */ class ZipFileInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ZipFileInfo EMPTY = new ZipFileInfo("", 0, "", "", "", "");

    @Expose
    @NotNull
    private final String abi;

    @Expose
    @NotNull
    private final String md5;

    @Expose
    @NotNull
    private final String module;

    @Expose
    @NotNull
    private final String name;

    @Expose
    private final long size;

    @Expose
    @NotNull
    private final String url;

    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/tantanapp/common/nativelib/manager/bean/ZipFileInfo$Companion;", "", "()V", "EMPTY", "Lcom/tantanapp/common/nativelib/manager/bean/ZipFileInfo;", "getEMPTY", "()Lcom/tantanapp/common/nativelib/manager/bean/ZipFileInfo;", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ZipFileInfo getEMPTY() {
            return ZipFileInfo.EMPTY;
        }

        private Companion() {
        }
    }

    public ZipFileInfo(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.md5 = str;
        this.size = j;
        this.abi = str2;
        this.module = str3;
        this.name = str4;
        this.url = str5;
    }

    public static /* synthetic */ ZipFileInfo copy$default(ZipFileInfo zipFileInfo, String str, long j, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zipFileInfo.md5;
        }
        if ((i & 2) != 0) {
            j = zipFileInfo.size;
        }
        if ((i & 4) != 0) {
            str2 = zipFileInfo.abi;
        }
        if ((i & 8) != 0) {
            str3 = zipFileInfo.module;
        }
        if ((i & 16) != 0) {
            str4 = zipFileInfo.name;
        }
        if ((i & 32) != 0) {
            str5 = zipFileInfo.url;
        }
        return zipFileInfo.copy(str, j, str2, str3, str4, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAbi() {
        return this.abi;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModule() {
        return this.module;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final ZipFileInfo copy(@NotNull String md5, long size, @NotNull String abi, @NotNull String module, @NotNull String name, @NotNull String url) {
        md5.getClass();
        abi.getClass();
        module.getClass();
        name.getClass();
        url.getClass();
        return new ZipFileInfo(md5, size, abi, module, name, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZipFileInfo)) {
            return false;
        }
        ZipFileInfo zipFileInfo = (ZipFileInfo) other;
        return Intrinsics.m87488d(this.md5, zipFileInfo.md5) && this.size == zipFileInfo.size && Intrinsics.m87488d(this.abi, zipFileInfo.abi) && Intrinsics.m87488d(this.module, zipFileInfo.module) && Intrinsics.m87488d(this.name, zipFileInfo.name) && Intrinsics.m87488d(this.url, zipFileInfo.url);
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
    public final String getModule() {
        return this.module;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getSize() {
        return this.size;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((((this.md5.hashCode() * 31) + Long.hashCode(this.size)) * 31) + this.abi.hashCode()) * 31) + this.module.hashCode()) * 31) + this.name.hashCode()) * 31) + this.url.hashCode();
    }

    @NotNull
    public String toString() {
        return "ZipFileInfo(md5=" + this.md5 + ", size=" + this.size + ", abi=" + this.abi + ", module=" + this.module + ", name=" + this.name + ", url=" + this.url + ')';
    }
}
