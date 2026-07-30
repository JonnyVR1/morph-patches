package p149l;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.C2047a;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class z4c extends si2 {

    /* JADX INFO: renamed from: e */
    @Nullable
    public C2047a f201454e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public byte[] f201455f;

    /* JADX INFO: renamed from: g */
    public int f201456g;

    /* JADX INFO: renamed from: h */
    public int f201457h;

    public z4c() {
        super(false);
    }

    @Override // p149l.a5c
    @Nullable
    /* JADX INFO: renamed from: a */
    public Uri mo11121a() {
        C2047a c2047a = this.f201454e;
        if (c2047a != null) {
            return c2047a.f9492a;
        }
        return null;
    }

    @Override // p149l.a5c
    public void close() {
        if (this.f201455f != null) {
            this.f201455f = null;
            m184311r();
        }
        this.f201454e = null;
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: n */
    public long mo11125n(C2047a c2047a) throws IOException {
        m184312s(c2047a);
        this.f201454e = c2047a;
        Uri uriNormalizeScheme = c2047a.f9492a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        p11.m167008b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrM197841a1 = vck0.m197841a1(uriNormalizeScheme.getSchemeSpecificPart(), Constants.SEPARATOR_COMMA);
        if (strArrM197841a1.length != 2) {
            throw ParserException.createForMalformedDataOfUnknownType("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrM197841a1[1];
        if (strArrM197841a1[0].contains(";base64")) {
            try {
                this.f201455f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw ParserException.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e);
            }
        } else {
            this.f201455f = vck0.m197887r0(URLDecoder.decode(str, fs4.f99034a.name()));
        }
        long j = c2047a.f9498g;
        byte[] bArr = this.f201455f;
        if (j > bArr.length) {
            this.f201455f = null;
            throw new DataSourceException(2008);
        }
        int i = (int) j;
        this.f201456g = i;
        int length = bArr.length - i;
        this.f201457h = length;
        long j2 = c2047a.f9499h;
        if (j2 != -1) {
            this.f201457h = (int) Math.min(length, j2);
        }
        m184313t(c2047a);
        long j3 = c2047a.f9499h;
        return j3 != -1 ? j3 : this.f201457h;
    }

    @Override // p149l.w4c
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f201457h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(vck0.m197866j(this.f201455f), this.f201456g, bArr, i, iMin);
        this.f201456g += iMin;
        this.f201457h -= iMin;
        m184310q(iMin);
        return iMin;
    }
}
