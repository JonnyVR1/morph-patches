package p153l;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.C2070a;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class f6c extends zi2 {

    /* JADX INFO: renamed from: e */
    @Nullable
    public C2070a f97390e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public byte[] f97391f;

    /* JADX INFO: renamed from: g */
    public int f97392g;

    /* JADX INFO: renamed from: h */
    public int f97393h;

    public f6c() {
        super(false);
    }

    @Override // p153l.g6c
    public void close() {
        if (this.f97391f != null) {
            this.f97391f = null;
            m219719r();
        }
        this.f97390e = null;
    }

    @Override // p153l.g6c
    @Nullable
    /* JADX INFO: renamed from: d */
    public Uri mo11176d() {
        C2070a c2070a = this.f97390e;
        if (c2070a != null) {
            return c2070a.f9529a;
        }
        return null;
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: n */
    public long mo11179n(C2070a c2070a) throws IOException {
        m219720s(c2070a);
        this.f97390e = c2070a;
        Uri uriNormalizeScheme = c2070a.f9529a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        w11.m204366b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrM105119a1 = bmk0.m105119a1(uriNormalizeScheme.getSchemeSpecificPart(), Constants.SEPARATOR_COMMA);
        if (strArrM105119a1.length != 2) {
            throw ParserException.createForMalformedDataOfUnknownType("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrM105119a1[1];
        if (strArrM105119a1[0].contains(";base64")) {
            try {
                this.f97391f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw ParserException.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e);
            }
        } else {
            this.f97391f = bmk0.m105165r0(URLDecoder.decode(str, et4.f95687a.name()));
        }
        long j = c2070a.f9535g;
        byte[] bArr = this.f97391f;
        if (j > bArr.length) {
            this.f97391f = null;
            throw new DataSourceException(2008);
        }
        int i = (int) j;
        this.f97392g = i;
        int length = bArr.length - i;
        this.f97393h = length;
        long j2 = c2070a.f9536h;
        if (j2 != -1) {
            this.f97393h = (int) Math.min(length, j2);
        }
        m219721t(c2070a);
        long j3 = c2070a.f9536h;
        return j3 != -1 ? j3 : this.f97393h;
    }

    @Override // p153l.e6c
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f97393h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(bmk0.m105144j(this.f97391f), this.f97392g, bArr, i, iMin);
        this.f97392g += iMin;
        this.f97393h -= iMin;
        m219718q(iMin);
        return iMin;
    }
}
