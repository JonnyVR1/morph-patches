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

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0003H\u0016R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\""}, m88121d2 = {"Lcom/tantanapp/common/nativelib/manager/bean/ProjectLibrary;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "md5", "size", "", "abi", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getAbi", "()Ljava/lang/String;", "setAbi", "(Ljava/lang/String;)V", "getMd5", "setMd5", "getName", "setName", "getSize", "()Ljava/lang/Long;", "setSize", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/tantanapp/common/nativelib/manager/bean/ProjectLibrary;", "equals", "", "other", "hashCode", "", "toString", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final /* data */ class ProjectLibrary {

    @Expose
    @Nullable
    private String abi;

    @Expose
    @Nullable
    private String md5;

    @Expose
    @Nullable
    private String name;

    @Expose
    @Nullable
    private Long size;

    public /* synthetic */ ProjectLibrary(String str, String str2, Long l2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : l2, (i & 8) != 0 ? "" : str3);
    }

    public static /* synthetic */ ProjectLibrary copy$default(ProjectLibrary projectLibrary, String str, String str2, Long l2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectLibrary.name;
        }
        if ((i & 2) != 0) {
            str2 = projectLibrary.md5;
        }
        if ((i & 4) != 0) {
            l2 = projectLibrary.size;
        }
        if ((i & 8) != 0) {
            str3 = projectLibrary.abi;
        }
        return projectLibrary.copy(str, str2, l2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAbi() {
        return this.abi;
    }

    @NotNull
    public final ProjectLibrary copy(@Nullable String name, @Nullable String md5, @Nullable Long size, @Nullable String abi) {
        return new ProjectLibrary(name, md5, size, abi);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m88377d(ProjectLibrary.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        ProjectLibrary projectLibrary = (ProjectLibrary) other;
        return Intrinsics.m88377d(this.name, projectLibrary.name) && Intrinsics.m88377d(this.md5, projectLibrary.md5) && Intrinsics.m88377d(this.size, projectLibrary.size) && Intrinsics.m88377d(this.abi, projectLibrary.abi);
    }

    @Nullable
    public final String getAbi() {
        return this.abi;
    }

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Long getSize() {
        return this.size;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.md5;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l2 = this.size;
        int iHashCode3 = (iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str3 = this.abi;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAbi(@Nullable String str) {
        this.abi = str;
    }

    public final void setMd5(@Nullable String str) {
        this.md5 = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSize(@Nullable Long l2) {
        this.size = l2;
    }

    @NotNull
    public String toString() {
        return "Library(name='" + this.name + "', md5='" + this.md5 + "', size=" + this.size + ", abi=" + this.abi + "  )";
    }

    public ProjectLibrary(@Nullable String str, @Nullable String str2, @Nullable Long l2, @Nullable String str3) {
        this.name = str;
        this.md5 = str2;
        this.size = l2;
        this.abi = str3;
    }

    public ProjectLibrary() {
        this(null, null, null, null, 15, null);
    }
}
