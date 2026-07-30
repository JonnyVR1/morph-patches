package com.tantanapp.common.nativelib.manager.bean;

import androidx.annotation.Keep;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.Expose;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0013\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\b\u0010*\u001a\u00020\u0003H\u0016R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\u0004R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\u0004R\u001e\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\u0004R\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\u0004R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\u0004¨\u0006+"}, m87232d2 = {"Lcom/tantanapp/common/nativelib/manager/bean/LibraryZipInfo;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "(Ljava/lang/String;)V", "abi", "getAbi", "()Ljava/lang/String;", "setAbi", SocialConstants.PARAM_APP_DESC, "getDesc", "setDesc", "installedPath", "getInstalledPath", "setInstalledPath", "md5", "getMd5", "setMd5", "module", "getModule", "setModule", "getName", "setName", "path", "getPath", "setPath", "size", "", "getSize", "()J", "setSize", "(J)V", "url", "getUrl", "setUrl", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final /* data */ class LibraryZipInfo {

    @Expose
    @NotNull
    private String abi;

    @Expose
    @NotNull
    private String desc;

    @NotNull
    private String installedPath;

    @Expose
    @NotNull
    private String md5;

    @Expose
    @NotNull
    private String module;

    @Expose
    @NotNull
    private String name;

    @NotNull
    private String path;

    @Expose
    private long size;

    @Expose
    @NotNull
    private String url;

    public LibraryZipInfo(@NotNull String str) {
        str.getClass();
        this.name = str;
        this.abi = "";
        this.module = "";
        this.url = "";
        this.md5 = "";
        this.desc = "";
        this.path = "";
        this.installedPath = "";
    }

    public static /* synthetic */ LibraryZipInfo copy$default(LibraryZipInfo libraryZipInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = libraryZipInfo.name;
        }
        return libraryZipInfo.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final LibraryZipInfo copy(@NotNull String name) {
        name.getClass();
        return new LibraryZipInfo(name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LibraryZipInfo) && Intrinsics.m87488d(this.name, ((LibraryZipInfo) other).name);
    }

    @NotNull
    public final String getAbi() {
        return this.abi;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getInstalledPath() {
        return this.installedPath;
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

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public final long getSize() {
        return this.size;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public final void setAbi(@NotNull String str) {
        str.getClass();
        this.abi = str;
    }

    public final void setDesc(@NotNull String str) {
        str.getClass();
        this.desc = str;
    }

    public final void setInstalledPath(@NotNull String str) {
        str.getClass();
        this.installedPath = str;
    }

    public final void setMd5(@NotNull String str) {
        str.getClass();
        this.md5 = str;
    }

    public final void setModule(@NotNull String str) {
        str.getClass();
        this.module = str;
    }

    public final void setName(@NotNull String str) {
        str.getClass();
        this.name = str;
    }

    public final void setPath(@NotNull String str) {
        str.getClass();
        this.path = str;
    }

    public final void setSize(long j) {
        this.size = j;
    }

    public final void setUrl(@NotNull String str) {
        str.getClass();
        this.url = str;
    }

    @NotNull
    public String toString() {
        return "LibraryZipInfo(name='" + this.name + "', abi='" + this.abi + "', module='" + this.module + "', url='" + this.url + "', md5='" + this.md5 + "', size=" + this.size + ", desc='" + this.desc + "', path='" + this.path + "', installedPath='" + this.installedPath + "')";
    }
}
