package com.clevertap.android.sdk.network;

import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.clevertap.android.sdk.network.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m87232d2 = {"Lcom/clevertap/android/sdk/network/a;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/network/DownloadedBitmap$Status;", NotificationCompat.CATEGORY_STATUS, "", "failureReason", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "b", "(Lcom/clevertap/android/sdk/network/DownloadedBitmap$Status;Ljava/lang/String;)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "Landroid/graphics/Bitmap;", "bitmap", "", "downloadTime", "", "data", Constants.INAPP_DATA_TAG, "(Landroid/graphics/Bitmap;J[B)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "f", "(J[B)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class C1295a {

    @NotNull
    public static final C1295a INSTANCE = new C1295a();

    private C1295a() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ DownloadedBitmap m6812c(C1295a c1295a, DownloadedBitmap.Status status, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return c1295a.m6815b(status, str);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ DownloadedBitmap m6813e(C1295a c1295a, Bitmap bitmap, long j, byte[] bArr, int i, Object obj) {
        if ((i & 4) != 0) {
            bArr = null;
        }
        return c1295a.m6816d(bitmap, j, bArr);
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: a */
    public final DownloadedBitmap m6814a(@NotNull DownloadedBitmap.Status status) {
        status.getClass();
        return m6812c(this, status, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: b */
    public final DownloadedBitmap m6815b(@NotNull DownloadedBitmap.Status status, @Nullable String failureReason) {
        status.getClass();
        return new DownloadedBitmap(null, status, -1L, null, failureReason);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final DownloadedBitmap m6816d(@NotNull Bitmap bitmap, long downloadTime, @Nullable byte[] data) {
        bitmap.getClass();
        return new DownloadedBitmap(bitmap, DownloadedBitmap.Status.SUCCESS, downloadTime, data, null, 16, null);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final DownloadedBitmap m6817f(long downloadTime, @NotNull byte[] data) {
        data.getClass();
        return new DownloadedBitmap(null, DownloadedBitmap.Status.SUCCESS, downloadTime, data, null, 16, null);
    }
}
