package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.network.C1318a;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Ll/mwk;", "Ll/l23;", "", "saveBytes", "Lcom/clevertap/android/sdk/Logger;", "logger", "<init>", "(ZLcom/clevertap/android/sdk/Logger;)V", "Ljava/io/ByteArrayOutputStream;", "dataReadFromStream", "", "downloadStartTimeInMilliseconds", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "c", "(Ljava/io/ByteArrayOutputStream;J)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "Ljava/io/InputStream;", "inputStream", "Ljava/net/HttpURLConnection;", "connection", "a", "(Ljava/io/InputStream;Ljava/net/HttpURLConnection;J)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class mwk extends l23 {
    public /* synthetic */ mwk(boolean z, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : logger);
    }

    /* JADX INFO: renamed from: c */
    private final DownloadedBitmap m160556c(ByteArrayOutputStream dataReadFromStream, long downloadStartTimeInMilliseconds) {
        byte[] byteArray = dataReadFromStream.toByteArray();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        C1318a c1318a = C1318a.INSTANCE;
        bitmapDecodeByteArray.getClass();
        return C1318a.m6867e(c1318a, bitmapDecodeByteArray, Utils.m5975r() - downloadStartTimeInMilliseconds, null, 4, null);
    }

    @Override // p153l.l23, p153l.mpl
    @NotNull
    /* JADX INFO: renamed from: a */
    public DownloadedBitmap mo152557a(@NotNull InputStream inputStream, @NotNull HttpURLConnection connection, long downloadStartTimeInMilliseconds) throws IOException {
        inputStream.getClass();
        connection.getClass();
        Logger.m5927v("reading bitmap input stream in GzipBitmapInputStreamReader....");
        String contentEncoding = connection.getContentEncoding();
        if (!(contentEncoding != null ? StringsKt.m94303P(contentEncoding, HttpHeaderValues.GZIP, false, 2, null) : false)) {
            return super.mo152557a(inputStream, connection, downloadStartTimeInMilliseconds);
        }
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = gZIPInputStream.read(bArr);
            if (i == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
        Logger logger = getLogger();
        if (logger != null) {
            logger.verbose("Total decompressed download size for bitmap from output stream = " + byteArrayOutputStream.size());
        }
        return m160556c(byteArrayOutputStream, downloadStartTimeInMilliseconds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mwk() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public mwk(boolean z, @Nullable Logger logger) {
        super(z, false, logger, 2, null);
    }
}
