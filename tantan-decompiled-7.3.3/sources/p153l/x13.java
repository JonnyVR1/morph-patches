package p153l;

import android.net.TrafficStats;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.network.C1318a;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 #2\u00020\u0001:\u0001\u000fB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m88121d2 = {"Ll/x13;", "", "Ll/tnl;", "httpUrlConnectionParams", "Ll/mpl;", "bitmapInputStreamReader", "Lkotlin/Pair;", "", "", "sizeConstrainedPair", "<init>", "(Ll/tnl;Ll/mpl;Lkotlin/Pair;)V", "Ljava/net/URL;", "url", "Ljava/net/HttpURLConnection;", "a", "(Ljava/net/URL;)Ljava/net/HttpURLConnection;", "", "srcUrl", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "b", "(Ljava/lang/String;)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "Ll/tnl;", "Ll/mpl;", "c", "Lkotlin/Pair;", "", Constants.INAPP_DATA_TAG, "J", "downloadStartTimeInMilliseconds", "e", "Ljava/net/HttpURLConnection;", "connection", "f", "Ljava/lang/String;", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class x13 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final tnl httpUrlConnectionParams;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final mpl bitmapInputStreamReader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Pair<Boolean, Integer> sizeConstrainedPair;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long downloadStartTimeInMilliseconds;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private HttpURLConnection connection;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String srcUrl;

    public /* synthetic */ x13(tnl tnlVar, mpl mplVar, Pair pair, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tnlVar, mplVar, (i & 4) != 0 ? new Pair(Boolean.FALSE, 0) : pair);
    }

    /* JADX INFO: renamed from: a */
    private final HttpURLConnection m208903a(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        uRLConnectionOpenConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout(this.httpUrlConnectionParams.getConnectTimeout());
        httpURLConnection.setReadTimeout(this.httpUrlConnectionParams.getReadTimeout());
        httpURLConnection.setUseCaches(this.httpUrlConnectionParams.getUseCaches());
        httpURLConnection.setDoInput(this.httpUrlConnectionParams.getDoInput());
        for (Map.Entry<String, String> entry : this.httpUrlConnectionParams.m191952d().entrySet()) {
            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        return httpURLConnection;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x007b A[PHI: r15
      0x007b: PHI (r15v9 com.clevertap.android.sdk.network.DownloadedBitmap) = 
      (r15v5 com.clevertap.android.sdk.network.DownloadedBitmap)
      (r15v6 com.clevertap.android.sdk.network.DownloadedBitmap)
      (r15v10 com.clevertap.android.sdk.network.DownloadedBitmap)
     binds: [B:26:0x00ec, B:22:0x00d8, B:12:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x007f A[PHI: r14 r15
      0x007f: PHI (r14v7 java.net.HttpURLConnection) = (r14v5 java.net.HttpURLConnection), (r14v6 java.net.HttpURLConnection), (r14v8 java.net.HttpURLConnection) binds: [B:26:0x00ec, B:22:0x00d8, B:12:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x007f: PHI (r15v7 com.clevertap.android.sdk.network.DownloadedBitmap) = 
      (r15v5 com.clevertap.android.sdk.network.DownloadedBitmap)
      (r15v6 com.clevertap.android.sdk.network.DownloadedBitmap)
      (r15v10 com.clevertap.android.sdk.network.DownloadedBitmap)
     binds: [B:26:0x00ec, B:22:0x00d8, B:12:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    @NotNull
    /* JADX INFO: renamed from: b */
    public final DownloadedBitmap m208904b(@NotNull String srcUrl) {
        DownloadedBitmap downloadedBitmapMo152557a;
        HttpURLConnection httpURLConnection;
        srcUrl.getClass();
        Logger.m5928v("BitmapDownloader", "Initiating bitmap download in BitmapDownloader...");
        this.srcUrl = srcUrl;
        this.downloadStartTimeInMilliseconds = Utils.m5975r();
        HttpURLConnection httpURLConnection2 = null;
        try {
            TrafficStats.setThreadStatsTag(21);
            HttpURLConnection httpURLConnectionM208903a = m208903a(new URL(srcUrl));
            this.connection = httpURLConnectionM208903a;
            if (httpURLConnectionM208903a == null) {
                Intrinsics.m88391r("connection");
                httpURLConnectionM208903a = null;
            }
            httpURLConnectionM208903a.connect();
            if (httpURLConnectionM208903a.getResponseCode() != 200) {
                String str = "HTTP Error : " + httpURLConnectionM208903a.getResponseCode();
                Logger.m5920d("BitmapDownloader", "File not loaded completely. URL was: " + srcUrl + ", Reason: " + str);
                downloadedBitmapMo152557a = C1318a.INSTANCE.m6869b(DownloadedBitmap.Status.DOWNLOAD_FAILED, str);
                httpURLConnection = this.connection;
                if (httpURLConnection == null) {
                    Intrinsics.m88391r("connection");
                } else {
                    httpURLConnection2 = httpURLConnection;
                }
            } else {
                Logger.m5928v("BitmapDownloader", "Downloading " + srcUrl + "....");
                int contentLength = httpURLConnectionM208903a.getContentLength();
                Pair<Boolean, Integer> pair = this.sizeConstrainedPair;
                boolean zBooleanValue = pair.component1().booleanValue();
                int iIntValue = pair.component2().intValue();
                if (!zBooleanValue || contentLength <= iIntValue) {
                    mpl mplVar = this.bitmapInputStreamReader;
                    InputStream inputStream = httpURLConnectionM208903a.getInputStream();
                    inputStream.getClass();
                    downloadedBitmapMo152557a = mplVar.mo152557a(inputStream, httpURLConnectionM208903a, this.downloadStartTimeInMilliseconds);
                    httpURLConnection = this.connection;
                    if (httpURLConnection == null) {
                        Intrinsics.m88391r("connection");
                    } else {
                        httpURLConnection2 = httpURLConnection;
                    }
                } else {
                    Logger.m5928v("BitmapDownloader", "Image size is larger than " + iIntValue + " bytes. Cancelling download!");
                    downloadedBitmapMo152557a = C1318a.m6866c(C1318a.INSTANCE, DownloadedBitmap.Status.SIZE_LIMIT_EXCEEDED, null, 2, null);
                    httpURLConnection = this.connection;
                    if (httpURLConnection == null) {
                        Intrinsics.m88391r("connection");
                    } else {
                        httpURLConnection2 = httpURLConnection;
                    }
                }
            }
            httpURLConnection2.disconnect();
            TrafficStats.clearThreadStatsTag();
            return downloadedBitmapMo152557a;
        } catch (Throwable th) {
            try {
                String str2 = "Exception : " + th.getClass().getSimpleName() + " : " + th.getMessage();
                Logger.m5929v("BitmapDownloader", "Couldn't download the notification media. URL was: " + srcUrl + ", Reason: " + str2, th);
                return C1318a.INSTANCE.m6869b(DownloadedBitmap.Status.DOWNLOAD_FAILED, str2);
            } finally {
                try {
                    HttpURLConnection httpURLConnection3 = this.connection;
                    if (httpURLConnection3 == null) {
                        Intrinsics.m88391r("connection");
                    } else {
                        httpURLConnection2 = httpURLConnection3;
                    }
                    httpURLConnection2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } catch (Throwable th2) {
                    Logger.m5929v("BitmapDownloader", "Couldn't close connection!", th2);
                }
            }
        }
    }

    public x13(@NotNull tnl tnlVar, @NotNull mpl mplVar, @NotNull Pair<Boolean, Integer> pair) {
        tnlVar.getClass();
        mplVar.getClass();
        pair.getClass();
        this.httpUrlConnectionParams = tnlVar;
        this.bitmapInputStreamReader = mplVar;
        this.sizeConstrainedPair = pair;
    }
}
