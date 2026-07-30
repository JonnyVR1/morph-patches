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
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Lcom/clevertap/android/sdk/network/a;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/network/DownloadedBitmap$Status;", NotificationCompat.CATEGORY_STATUS, "", "failureReason", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "b", "(Lcom/clevertap/android/sdk/network/DownloadedBitmap$Status;Ljava/lang/String;)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "Landroid/graphics/Bitmap;", "bitmap", "", "downloadTime", "", "data", Constants.INAPP_DATA_TAG, "(Landroid/graphics/Bitmap;J[B)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "f", "(J[B)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class C1318a {

    @NotNull
    public static final C1318a INSTANCE = new C1318a();

    private C1318a() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ DownloadedBitmap m6866c(C1318a c1318a, DownloadedBitmap.Status status, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return c1318a.m6869b(status, str);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ DownloadedBitmap m6867e(C1318a c1318a, Bitmap bitmap, long j, byte[] bArr, int i, Object obj) {
        if ((i & 4) != 0) {
            bArr = null;
        }
        return c1318a.m6870d(bitmap, j, bArr);
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: a */
    public final DownloadedBitmap m6868a(@NotNull DownloadedBitmap.Status status) {
        status.getClass();
        return m6866c(this, status, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: b */
    public final DownloadedBitmap m6869b(@NotNull DownloadedBitmap.Status status, @Nullable String failureReason) {
        status.getClass();
        return new DownloadedBitmap(null, status, -1L, null, failureReason);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final DownloadedBitmap m6870d(@NotNull Bitmap bitmap, long downloadTime, @Nullable byte[] data) {
        bitmap.getClass();
        return new DownloadedBitmap(bitmap, DownloadedBitmap.Status.SUCCESS, downloadTime, data, null, 16, null);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final DownloadedBitmap m6871f(long downloadTime, @NotNull byte[] data) {
        data.getClass();
        return new DownloadedBitmap(null, DownloadedBitmap.Status.SUCCESS, downloadTime, data, null, 16, null);
    }
}
