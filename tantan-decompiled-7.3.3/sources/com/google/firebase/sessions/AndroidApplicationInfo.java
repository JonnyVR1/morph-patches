package com.google.firebase.sessions;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, m88121d2 = {"Lcom/google/firebase/sessions/AndroidApplicationInfo;", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "versionName", "appBuildVersion", "deviceManufacturer", "currentProcessDetails", "Lcom/google/firebase/sessions/ProcessDetails;", "appProcessDetails", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/ProcessDetails;Ljava/util/List;)V", "getAppBuildVersion", "()Ljava/lang/String;", "getAppProcessDetails", "()Ljava/util/List;", "getCurrentProcessDetails", "()Lcom/google/firebase/sessions/ProcessDetails;", "getDeviceManufacturer", "getPackageName", "getVersionName", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final /* data */ class AndroidApplicationInfo {

    @NotNull
    private final String appBuildVersion;

    @NotNull
    private final List<ProcessDetails> appProcessDetails;

    @NotNull
    private final ProcessDetails currentProcessDetails;

    @NotNull
    private final String deviceManufacturer;

    @NotNull
    private final String packageName;

    @NotNull
    private final String versionName;

    public AndroidApplicationInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull ProcessDetails processDetails, @NotNull List<ProcessDetails> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        processDetails.getClass();
        list.getClass();
        this.packageName = str;
        this.versionName = str2;
        this.appBuildVersion = str3;
        this.deviceManufacturer = str4;
        this.currentProcessDetails = processDetails;
        this.appProcessDetails = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidApplicationInfo copy$default(AndroidApplicationInfo androidApplicationInfo, String str, String str2, String str3, String str4, ProcessDetails processDetails, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = androidApplicationInfo.packageName;
        }
        if ((i & 2) != 0) {
            str2 = androidApplicationInfo.versionName;
        }
        if ((i & 4) != 0) {
            str3 = androidApplicationInfo.appBuildVersion;
        }
        if ((i & 8) != 0) {
            str4 = androidApplicationInfo.deviceManufacturer;
        }
        if ((i & 16) != 0) {
            processDetails = androidApplicationInfo.currentProcessDetails;
        }
        if ((i & 32) != 0) {
            list = androidApplicationInfo.appProcessDetails;
        }
        ProcessDetails processDetails2 = processDetails;
        List list2 = list;
        return androidApplicationInfo.copy(str, str2, str3, str4, processDetails2, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    @NotNull
    public final List<ProcessDetails> component6() {
        return this.appProcessDetails;
    }

    @NotNull
    public final AndroidApplicationInfo copy(@NotNull String packageName, @NotNull String versionName, @NotNull String appBuildVersion, @NotNull String deviceManufacturer, @NotNull ProcessDetails currentProcessDetails, @NotNull List<ProcessDetails> appProcessDetails) {
        packageName.getClass();
        versionName.getClass();
        appBuildVersion.getClass();
        deviceManufacturer.getClass();
        currentProcessDetails.getClass();
        appProcessDetails.getClass();
        return new AndroidApplicationInfo(packageName, versionName, appBuildVersion, deviceManufacturer, currentProcessDetails, appProcessDetails);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidApplicationInfo)) {
            return false;
        }
        AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) other;
        return Intrinsics.m88377d(this.packageName, androidApplicationInfo.packageName) && Intrinsics.m88377d(this.versionName, androidApplicationInfo.versionName) && Intrinsics.m88377d(this.appBuildVersion, androidApplicationInfo.appBuildVersion) && Intrinsics.m88377d(this.deviceManufacturer, androidApplicationInfo.deviceManufacturer) && Intrinsics.m88377d(this.currentProcessDetails, androidApplicationInfo.currentProcessDetails) && Intrinsics.m88377d(this.appProcessDetails, androidApplicationInfo.appProcessDetails);
    }

    @NotNull
    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    @NotNull
    public final List<ProcessDetails> getAppProcessDetails() {
        return this.appProcessDetails;
    }

    @NotNull
    public final ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    @NotNull
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return (((((((((this.packageName.hashCode() * 31) + this.versionName.hashCode()) * 31) + this.appBuildVersion.hashCode()) * 31) + this.deviceManufacturer.hashCode()) * 31) + this.currentProcessDetails.hashCode()) * 31) + this.appProcessDetails.hashCode();
    }

    @NotNull
    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.packageName + ", versionName=" + this.versionName + ", appBuildVersion=" + this.appBuildVersion + ", deviceManufacturer=" + this.deviceManufacturer + ", currentProcessDetails=" + this.currentProcessDetails + ", appProcessDetails=" + this.appProcessDetails + ')';
    }
}
