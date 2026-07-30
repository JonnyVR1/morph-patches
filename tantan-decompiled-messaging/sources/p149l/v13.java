package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.network.C1295a;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, m87232d2 = {"Ll/v13;", "Ll/bnl;", "", "saveBytes", "saveBitmap", "Lcom/clevertap/android/sdk/Logger;", "logger", "<init>", "(ZZLcom/clevertap/android/sdk/Logger;)V", "Ljava/io/InputStream;", "inputStream", "Ljava/net/HttpURLConnection;", "connection", "", "downloadStartTimeInMilliseconds", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "a", "(Ljava/io/InputStream;Ljava/net/HttpURLConnection;J)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "Z", "getSaveBytes", "()Z", "b", "getSaveBitmap", "c", "Lcom/clevertap/android/sdk/Logger;", "()Lcom/clevertap/android/sdk/Logger;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public class v13 implements bnl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean saveBytes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean saveBitmap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final Logger logger;

    public /* synthetic */ v13(boolean z, boolean z2, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? null : logger);
    }

    @Override // p149l.bnl
    @NotNull
    /* JADX INFO: renamed from: a */
    public DownloadedBitmap mo102797a(@NotNull InputStream inputStream, @NotNull HttpURLConnection connection, long downloadStartTimeInMilliseconds) throws IOException {
        inputStream.getClass();
        connection.getClass();
        Logger logger = this.logger;
        if (logger != null) {
            logger.verbose("reading bitmap input stream in BitmapInputStreamDecoder....");
        }
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                break;
            }
            i += i2;
            byteArrayOutputStream.write(bArr, 0, i2);
            Logger logger2 = this.logger;
            if (logger2 != null) {
                logger2.verbose("Downloaded " + i + " bytes");
            }
        }
        Logger logger3 = this.logger;
        if (logger3 != null) {
            logger3.verbose("Total download size for bitmap = " + i);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int contentLength = connection.getContentLength();
        if (contentLength != -1 && contentLength != i) {
            Logger logger4 = this.logger;
            if (logger4 != null) {
                logger4.debug("File not loaded completely not going forward. URL was: " + connection.getURL() + ", Reason: Incomplete Download");
            }
            return C1295a.INSTANCE.m6815b(DownloadedBitmap.Status.DOWNLOAD_FAILED, "Incomplete Download");
        }
        if (!this.saveBitmap) {
            C1295a c1295a = C1295a.INSTANCE;
            long jM5921r = Utils.m5921r() - downloadStartTimeInMilliseconds;
            byteArray.getClass();
            return c1295a.m6817f(jM5921r, byteArray);
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        if (bitmapDecodeByteArray == null) {
            Logger logger5 = this.logger;
            if (logger5 != null) {
                logger5.debug("DecodeByteArray error");
            }
            return C1295a.INSTANCE.m6815b(DownloadedBitmap.Status.DOWNLOAD_FAILED, "DecodeByteArray error");
        }
        C1295a c1295a2 = C1295a.INSTANCE;
        long jM5921r2 = Utils.m5921r() - downloadStartTimeInMilliseconds;
        if (!this.saveBytes) {
            byteArray = null;
        }
        return c1295a2.m6816d(bitmapDecodeByteArray, jM5921r2, byteArray);
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Logger getLogger() {
        return this.logger;
    }

    public v13(boolean z, boolean z2, @Nullable Logger logger) {
        this.saveBytes = z;
        this.saveBitmap = z2;
        this.logger = logger;
    }

    public v13() {
        this(false, false, null, 7, null);
    }
}
