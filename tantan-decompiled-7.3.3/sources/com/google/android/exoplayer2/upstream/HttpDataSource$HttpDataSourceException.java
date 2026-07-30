package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import p153l.i11;

/* JADX INFO: loaded from: classes6.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public static final int TYPE_CLOSE = 3;
    public static final int TYPE_OPEN = 1;
    public static final int TYPE_READ = 2;
    public final C2070a dataSpec;
    public final int type;

    public HttpDataSource$HttpDataSourceException(C2070a c2070a, int i, int i2) {
        super(assignErrorCode(i, i2));
        this.dataSpec = c2070a;
        this.type = i2;
    }

    private static int assignErrorCode(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    public static HttpDataSource$HttpDataSourceException createForIOException(final IOException iOException, final C2070a c2070a, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !i11.m138051e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i2 == 2007 ? new HttpDataSource$HttpDataSourceException(iOException, c2070a) { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
        } : new HttpDataSource$HttpDataSourceException(iOException, c2070a, i2, i);
    }

    @Deprecated
    public HttpDataSource$HttpDataSourceException(C2070a c2070a, int i) {
        this(c2070a, 2000, i);
    }

    @Deprecated
    public HttpDataSource$HttpDataSourceException(String str, C2070a c2070a, int i) {
        this(str, c2070a, 2000, i);
    }

    public HttpDataSource$HttpDataSourceException(String str, C2070a c2070a, int i, int i2) {
        super(str, assignErrorCode(i, i2));
        this.dataSpec = c2070a;
        this.type = i2;
    }

    @Deprecated
    public HttpDataSource$HttpDataSourceException(IOException iOException, C2070a c2070a, int i) {
        this(iOException, c2070a, 2000, i);
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, C2070a c2070a, int i, int i2) {
        super(iOException, assignErrorCode(i, i2));
        this.dataSpec = c2070a;
        this.type = i2;
    }

    @Deprecated
    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, C2070a c2070a, int i) {
        this(str, iOException, c2070a, 2000, i);
    }

    public HttpDataSource$HttpDataSourceException(String str, @Nullable IOException iOException, C2070a c2070a, int i, int i2) {
        super(str, iOException, assignErrorCode(i, i2));
        this.dataSpec = c2070a;
        this.type = i2;
    }
}
