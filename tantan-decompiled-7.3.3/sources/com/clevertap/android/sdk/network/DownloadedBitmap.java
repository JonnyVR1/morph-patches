package com.clevertap.android.sdk.network;

import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001:\u0001%B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001a\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b!\u0010\u0016¨\u0006&"}, m88121d2 = {"Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/clevertap/android/sdk/network/DownloadedBitmap$Status;", NotificationCompat.CATEGORY_STATUS, "", "downloadTime", "", HttpHeaderValues.BYTES, "", "failureReason", "<init>", "(Landroid/graphics/Bitmap;Lcom/clevertap/android/sdk/network/DownloadedBitmap$Status;J[BLjava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "Lcom/clevertap/android/sdk/network/DownloadedBitmap$Status;", "e", "()Lcom/clevertap/android/sdk/network/DownloadedBitmap$Status;", "c", "J", "()J", Constants.INAPP_DATA_TAG, "[B", "()[B", "Ljava/lang/String;", "Status", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final /* data */ class DownloadedBitmap {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Bitmap bitmap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Status status;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long downloadTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final byte[] bytes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final String failureReason;

    @Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m88121d2 = {"Lcom/clevertap/android/sdk/network/DownloadedBitmap$Status;", "", "statusValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getStatusValue", "()Ljava/lang/String;", "NO_IMAGE", "SUCCESS", "DOWNLOAD_FAILED", "NO_NETWORK", "INIT_ERROR", "SIZE_LIMIT_EXCEEDED", "GIF_SUCCESS", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public enum Status {
        NO_IMAGE("NO_IMAGE"),
        SUCCESS("SUCCESS"),
        DOWNLOAD_FAILED("DOWNLOAD_FAILED"),
        NO_NETWORK("NO_NETWORK"),
        INIT_ERROR("INIT_ERROR"),
        SIZE_LIMIT_EXCEEDED("SIZE_LIMIT_EXCEEDED"),
        GIF_SUCCESS("GIF_SUCCESS");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        private final String statusValue;

        Status(String str) {
            this.statusValue = str;
        }

        @NotNull
        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getStatusValue() {
            return this.statusValue;
        }
    }

    public DownloadedBitmap(@Nullable Bitmap bitmap, @NotNull Status status, long j, @Nullable byte[] bArr, @Nullable String str) {
        status.getClass();
        this.bitmap = bitmap;
        this.status = status;
        this.downloadTime = j;
        this.bytes = bArr;
        this.failureReason = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getBytes() {
        return this.bytes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getDownloadTime() {
        return this.downloadTime;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFailureReason() {
        return this.failureReason;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m88377d(DownloadedBitmap.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        DownloadedBitmap downloadedBitmap = (DownloadedBitmap) other;
        return Intrinsics.m88377d(this.bitmap, downloadedBitmap.bitmap) && this.status == downloadedBitmap.status && this.downloadTime == downloadedBitmap.downloadTime && Arrays.equals(this.bytes, downloadedBitmap.bytes) && Intrinsics.m88377d(this.failureReason, downloadedBitmap.failureReason);
    }

    public int hashCode() {
        Bitmap bitmap = this.bitmap;
        int iHashCode = (((((((bitmap != null ? bitmap.hashCode() : 0) * 31) + this.status.hashCode()) * 31) + Long.hashCode(this.downloadTime)) * 31) + Arrays.hashCode(this.bytes)) * 31;
        String str = this.failureReason;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DownloadedBitmap(bitmap=" + this.bitmap + ", status=" + this.status + ", downloadTime=" + this.downloadTime + ", bytes=" + Arrays.toString(this.bytes) + ", failureReason=" + this.failureReason + ')';
    }

    public /* synthetic */ DownloadedBitmap(Bitmap bitmap, Status status, long j, byte[] bArr, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, status, j, (i & 8) != 0 ? null : bArr, (i & 16) != 0 ? null : str);
    }
}
