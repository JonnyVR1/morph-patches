package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.ParserException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class C2048b implements InterfaceC2049c {

    /* JADX INFO: renamed from: a */
    public final int f9513a;

    public C2048b(int i) {
        this.f9513a = i;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC2049c
    /* JADX INFO: renamed from: a */
    public long mo12118a(InterfaceC2049c.c cVar) {
        IOException iOException = cVar.f9522c;
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException) || DataSourceException.isCausedByPositionOutOfRange(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f9523d - 1) * 1000, 5000);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC2049c
    @Nullable
    /* JADX INFO: renamed from: b */
    public InterfaceC2049c.b mo12119b(InterfaceC2049c.a aVar, InterfaceC2049c.c cVar) {
        if (!m12121e(cVar.f9522c)) {
            return null;
        }
        if (aVar.m12123a(1)) {
            return new InterfaceC2049c.b(1, Constants.INBOX_V2_THROTTLE_WINDOW_MS);
        }
        if (aVar.m12123a(2)) {
            return new InterfaceC2049c.b(2, Constants.ONE_MIN_IN_MILLIS);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC2049c
    /* JADX INFO: renamed from: d */
    public int mo12120d(int i) {
        int i2 = this.f9513a;
        if (i2 == -1) {
            return i == 7 ? 6 : 3;
        }
        return i2;
    }

    /* JADX INFO: renamed from: e */
    public boolean m12121e(IOException iOException) {
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException)) {
            return false;
        }
        int i = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode;
        return i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503;
    }

    public C2048b() {
        this(-1);
    }
}
