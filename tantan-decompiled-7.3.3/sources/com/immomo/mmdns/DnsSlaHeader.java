package com.immomo.mmdns;

import com.clevertap.android.sdk.Constants;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0015"}, m88121d2 = {"Lcom/immomo/mmdns/DnsSlaHeader;", "", "host", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, "isHttpDns", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getHost", "()Ljava/lang/String;", "getIp", "()Z", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "mmdns_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public final /* data */ class DnsSlaHeader {

    @NotNull
    private final String host;

    @NotNull
    private final String ip;
    private final boolean isHttpDns;

    public DnsSlaHeader(@NotNull String str, @NotNull String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.host = str;
        this.ip = str2;
        this.isHttpDns = z;
    }

    public static /* synthetic */ DnsSlaHeader copy$default(DnsSlaHeader dnsSlaHeader, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dnsSlaHeader.host;
        }
        if ((i & 2) != 0) {
            str2 = dnsSlaHeader.ip;
        }
        if ((i & 4) != 0) {
            z = dnsSlaHeader.isHttpDns;
        }
        return dnsSlaHeader.copy(str, str2, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsHttpDns() {
        return this.isHttpDns;
    }

    @NotNull
    public final DnsSlaHeader copy(@NotNull String host, @NotNull String ip, boolean isHttpDns) {
        host.getClass();
        ip.getClass();
        return new DnsSlaHeader(host, ip, isHttpDns);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DnsSlaHeader)) {
            return false;
        }
        DnsSlaHeader dnsSlaHeader = (DnsSlaHeader) other;
        return Intrinsics.m88377d(this.host, dnsSlaHeader.host) && Intrinsics.m88377d(this.ip, dnsSlaHeader.ip) && this.isHttpDns == dnsSlaHeader.isHttpDns;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final String getIp() {
        return this.ip;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        String str = this.host;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.ip;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isHttpDns;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode2 + r3;
    }

    public final boolean isHttpDns() {
        return this.isHttpDns;
    }

    @NotNull
    public String toString() {
        return "DnsSlaHeader(host=" + this.host + ", ip=" + this.ip + ", isHttpDns=" + this.isHttpDns + ")";
    }
}
