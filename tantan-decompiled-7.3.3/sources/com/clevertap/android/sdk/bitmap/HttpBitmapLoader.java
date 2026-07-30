package com.clevertap.android.sdk.bitmap;

import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import org.eclipse.jetty.http.HttpHeaders;
import org.jetbrains.annotations.NotNull;
import p153l.ky40;
import p153l.l23;
import p153l.mwk;
import p153l.nbr;
import p153l.t13;
import p153l.tnl;
import p153l.u13;
import p153l.w13;
import p153l.x13;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0011"}, m88121d2 = {"Lcom/clevertap/android/sdk/bitmap/HttpBitmapLoader;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/bitmap/HttpBitmapLoader$HttpBitmapOperation;", "bitmapOperation", "Ll/t13;", "bitmapDownloadRequest", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "a", "(Lcom/clevertap/android/sdk/bitmap/HttpBitmapLoader$HttpBitmapOperation;Ll/t13;)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "Ll/tnl;", "Ll/tnl;", "standardGzipHttpUrlConnectionParams", "b", "inAppStandardHttpUrlConnectionParams", "HttpBitmapOperation", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class HttpBitmapLoader {

    @NotNull
    public static final HttpBitmapLoader INSTANCE = new HttpBitmapLoader();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final tnl standardGzipHttpUrlConnectionParams = new tnl(1000, 5000, true, true, MapsKt.mapOf(TuplesKt.m88129a(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate")));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final tnl inAppStandardHttpUrlConnectionParams = new tnl(5000, NetWorkParam.DEFAULT_CONNECT_TIME_OUT, true, true, null, 16, null);

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m88121d2 = {"Lcom/clevertap/android/sdk/bitmap/HttpBitmapLoader$HttpBitmapOperation;", "", "<init>", "(Ljava/lang/String;I)V", "DOWNLOAD_NOTIFICATION_BITMAP", "DOWNLOAD_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT", "DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP", "DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT", "DOWNLOAD_INAPP_BITMAP", "DOWNLOAD_ANY_BITMAP", "DOWNLOAD_BYTES", "DOWNLOAD_BYTES_WITH_TIME_LIMIT", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public enum HttpBitmapOperation {
        DOWNLOAD_NOTIFICATION_BITMAP,
        DOWNLOAD_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT,
        DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP,
        DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT,
        DOWNLOAD_INAPP_BITMAP,
        DOWNLOAD_ANY_BITMAP,
        DOWNLOAD_BYTES,
        DOWNLOAD_BYTES_WITH_TIME_LIMIT;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<HttpBitmapOperation> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.bitmap.HttpBitmapLoader$a */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C1193a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4896a;

        static {
            int[] iArr = new int[HttpBitmapOperation.values().length];
            try {
                iArr[HttpBitmapOperation.DOWNLOAD_NOTIFICATION_BITMAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpBitmapOperation.DOWNLOAD_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HttpBitmapOperation.DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HttpBitmapOperation.DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HttpBitmapOperation.DOWNLOAD_INAPP_BITMAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HttpBitmapOperation.DOWNLOAD_ANY_BITMAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HttpBitmapOperation.DOWNLOAD_BYTES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HttpBitmapOperation.DOWNLOAD_BYTES_WITH_TIME_LIMIT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f4896a = iArr;
        }
    }

    private HttpBitmapLoader() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final DownloadedBitmap m6001a(@NotNull HttpBitmapOperation bitmapOperation, @NotNull t13 bitmapDownloadRequest) {
        bitmapOperation.getClass();
        bitmapDownloadRequest.getClass();
        int i = 3;
        boolean z = false;
        Logger logger = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        switch (C1193a.f4896a[bitmapOperation.ordinal()]) {
            case 1:
                return new ky40(new u13(new x13(standardGzipHttpUrlConnectionParams, new l23(false, false, null, 7, null), null, 4, 0 == true ? 1 : 0))).mo151950a(bitmapDownloadRequest);
            case 2:
                return new w13(new ky40(new u13(new x13(standardGzipHttpUrlConnectionParams, new mwk(z, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), null, 4, null)))).mo151950a(bitmapDownloadRequest);
            case 3:
                return new ky40(new u13(new x13(standardGzipHttpUrlConnectionParams, new mwk(z, objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0), new Pair(Boolean.TRUE, Integer.valueOf(bitmapDownloadRequest.getDownloadSizeLimitInBytes()))))).mo151950a(bitmapDownloadRequest);
            case 4:
                return new w13(new ky40(new u13(new x13(standardGzipHttpUrlConnectionParams, new mwk(z, objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0), new Pair(Boolean.TRUE, Integer.valueOf(bitmapDownloadRequest.getDownloadSizeLimitInBytes())))))).mo151950a(bitmapDownloadRequest);
            case 5:
                return new u13(new x13(inAppStandardHttpUrlConnectionParams, new l23(true, false, null, 6, null), null, 4, 0 == true ? 1 : 0)).mo151950a(bitmapDownloadRequest);
            case 6:
                return new u13(new x13(standardGzipHttpUrlConnectionParams, new mwk(z, logger, i, objArr7 == true ? 1 : 0), null, 4, null)).mo151950a(bitmapDownloadRequest);
            case 7:
                return new u13(new x13(inAppStandardHttpUrlConnectionParams, new l23(true, false, null, 4, null), null, 4, 0 == true ? 1 : 0)).mo151950a(bitmapDownloadRequest);
            case 8:
                return new w13(new u13(new x13(standardGzipHttpUrlConnectionParams, new l23(true, false, null, 4, null), null, 4, 0 == true ? 1 : 0))).mo151950a(bitmapDownloadRequest);
            default:
                nbr.m162172a();
                return null;
        }
    }
}
