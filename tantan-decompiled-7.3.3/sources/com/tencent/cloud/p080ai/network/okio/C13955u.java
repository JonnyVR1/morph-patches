package com.tencent.cloud.p080ai.network.okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import p153l.gig0;
import p153l.wg3;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.u */
/* JADX INFO: loaded from: classes12.dex */
public final class C13955u extends ByteString {

    /* JADX INFO: renamed from: e */
    public final transient byte[][] f57862e;

    /* JADX INFO: renamed from: f */
    public final transient int[] f57863f;

    public C13955u(C13939e c13939e, int i) {
        super(null);
        C13959y.m83164a(c13939e.f57818b, 0L, i);
        C13953s c13953s = c13939e.f57817a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c13953s.f57855c;
            int i6 = c13953s.f57854b;
            if (i5 == i6) {
                gig0.m130323a("s.limit == s.pos");
                throw null;
            }
            i3 += i5 - i6;
            i4++;
            c13953s = c13953s.f57858f;
        }
        this.f57862e = new byte[i4][];
        this.f57863f = new int[i4 * 2];
        C13953s c13953s2 = c13939e.f57817a;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f57862e;
            bArr[i7] = c13953s2.f57853a;
            int i8 = c13953s2.f57855c;
            int i9 = c13953s2.f57854b;
            i2 += i8 - i9;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f57863f;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            c13953s2.f57856d = true;
            i7++;
            c13953s2 = c13953s2.f57858f;
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    /* JADX INFO: renamed from: a */
    public void mo83072a(C13939e c13939e) {
        int length = this.f57862e.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f57863f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C13953s c13953s = new C13953s(this.f57862e[i], i3, (i3 + i4) - i2, true, false);
            C13953s c13953s2 = c13939e.f57817a;
            if (c13953s2 == null) {
                c13953s.f57859g = c13953s;
                c13953s.f57858f = c13953s;
                c13939e.f57817a = c13953s;
            } else {
                c13953s2.f57859g.m83155a(c13953s);
            }
            i++;
            i2 = i4;
        }
        c13939e.f57818b += (long) i2;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    /* JADX INFO: renamed from: b */
    public final ByteString m83161b() {
        return new ByteString(toByteArray());
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public String base64() {
        return m83161b().base64();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public String base64Url() {
        return m83161b().base64Url();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public byte getByte(int i) {
        C13959y.m83164a(this.f57863f[this.f57862e.length - 1], i, 1L);
        int iM83160a = m83160a(i);
        int i2 = iM83160a == 0 ? 0 : this.f57863f[iM83160a - 1];
        int[] iArr = this.f57863f;
        byte[][] bArr = this.f57862e;
        return bArr[iM83160a][(i - i2) + iArr[bArr.length + iM83160a]];
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public int hashCode() {
        int i = this.f57802b;
        if (i != 0) {
            return i;
        }
        int length = this.f57862e.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f57862e[i2];
            int[] iArr = this.f57863f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f57802b = i3;
        return i3;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public String hex() {
        return m83161b().hex();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public ByteString hmacSha1(ByteString byteString) {
        return m83161b().hmacSha1(byteString);
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public ByteString hmacSha256(ByteString byteString) {
        return m83161b().hmacSha256(byteString);
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public int indexOf(byte[] bArr, int i) {
        return m83161b().indexOf(bArr, i);
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public int lastIndexOf(byte[] bArr, int i) {
        return m83161b().lastIndexOf(bArr, i);
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public ByteString md5() {
        return m83161b().md5();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int iM83160a = m83160a(i);
        while (i3 > 0) {
            int i4 = iM83160a == 0 ? 0 : this.f57863f[iM83160a - 1];
            int iMin = Math.min(i3, ((this.f57863f[iM83160a] - i4) + i4) - i);
            int[] iArr = this.f57863f;
            byte[][] bArr2 = this.f57862e;
            if (!C13959y.m83166a(bArr2[iM83160a], (i - i4) + iArr[bArr2.length + iM83160a], bArr, i2, iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iM83160a++;
        }
        return true;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public ByteString sha1() {
        return m83161b().sha1();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public ByteString sha256() {
        return m83161b().sha256();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public int size() {
        return this.f57863f[this.f57862e.length - 1];
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public String string(Charset charset) {
        return m83161b().string(charset);
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public ByteString substring(int i) {
        return m83161b().substring(i);
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public ByteString toAsciiLowercase() {
        return m83161b().toAsciiLowercase();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public ByteString toAsciiUppercase() {
        return m83161b().toAsciiUppercase();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public byte[] toByteArray() {
        int[] iArr = this.f57863f;
        byte[][] bArr = this.f57862e;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f57863f;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f57862e[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public String toString() {
        return m83161b().toString();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public String utf8() {
        return m83161b().utf8();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public void write(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            wg3.m206174a("out == null");
            return;
        }
        int length = this.f57862e.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f57863f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            outputStream.write(this.f57862e[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public ByteString substring(int i, int i2) {
        return m83161b().substring(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public final int m83160a(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f57863f, 0, this.f57862e.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    /* JADX INFO: renamed from: a */
    public byte[] mo83073a() {
        return toByteArray();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.ByteString
    public boolean rangeEquals(int i, ByteString byteString, int i2, int i3) {
        if (i < 0 || i > size() - i3) {
            return false;
        }
        int iM83160a = m83160a(i);
        while (i3 > 0) {
            int i4 = iM83160a == 0 ? 0 : this.f57863f[iM83160a - 1];
            int iMin = Math.min(i3, ((this.f57863f[iM83160a] - i4) + i4) - i);
            int[] iArr = this.f57863f;
            byte[][] bArr = this.f57862e;
            if (!byteString.rangeEquals(i2, bArr[iM83160a], (i - i4) + iArr[bArr.length + iM83160a], iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iM83160a++;
        }
        return true;
    }
}
