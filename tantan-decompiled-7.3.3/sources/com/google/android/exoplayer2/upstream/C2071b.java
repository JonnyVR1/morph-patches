package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.ParserException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class C2071b implements InterfaceC2072c {

    /* JADX INFO: renamed from: a */
    public final int f9550a;

    public C2071b(int i) {
        this.f9550a = i;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC2072c
    /* JADX INFO: renamed from: a */
    public long mo12172a(InterfaceC2072c.c cVar) {
        IOException iOException = cVar.f9559c;
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException) || DataSourceException.isCausedByPositionOutOfRange(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f9560d - 1) * 1000, 5000);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC2072c
    @Nullable
    /* JADX INFO: renamed from: b */
    public InterfaceC2072c.b mo12173b(InterfaceC2072c.a aVar, InterfaceC2072c.c cVar) {
        if (!m12175e(cVar.f9559c)) {
            return null;
        }
        if (aVar.m12177a(1)) {
            return new InterfaceC2072c.b(1, Constants.INBOX_V2_THROTTLE_WINDOW_MS);
        }
        if (aVar.m12177a(2)) {
            return new InterfaceC2072c.b(2, Constants.ONE_MIN_IN_MILLIS);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC2072c
    /* JADX INFO: renamed from: d */
    public int mo12174d(int i) {
        int i2 = this.f9550a;
        if (i2 == -1) {
            return i == 7 ? 6 : 3;
        }
        return i2;
    }

    /* JADX INFO: renamed from: e */
    public boolean m12175e(IOException iOException) {
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException)) {
            return false;
        }
        int i = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode;
        return i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503;
    }

    public C2071b() {
        this(-1);
    }
}
