package p149l;

import com.google.common.hash.Funnel;
import com.google.common.hash.HashCode;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.l7 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC18156l7 implements cwk {
    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        sf80.m183899u(i, i + i2, bArr.length);
        return newHasher(i2).mo16351g(bArr, i, i2).hash();
    }

    public HashCode hashInt(int i) {
        return newHasher(4).mo16348a(i).hash();
    }

    public HashCode hashLong(long j) {
        return newHasher(8).mo16349b(j).hash();
    }

    @Override // p149l.cwk
    public <T> HashCode hashObject(T t, Funnel<? super T> funnel) {
        return newHasher().mo147549f(t, funnel).hash();
    }

    public HashCode hashString(CharSequence charSequence, Charset charset) {
        return newHasher().mo16350d(charSequence, charset).hash();
    }

    public HashCode hashUnencodedChars(CharSequence charSequence) {
        return newHasher(charSequence.length() * 2).mo147548c(charSequence).hash();
    }

    public kwk newHasher(int i) {
        sf80.m183884f(i >= 0, "expectedInputSize must be >= 0 but was %s", i);
        return newHasher();
    }

    public HashCode hashBytes(byte[] bArr) {
        return hashBytes(bArr, 0, bArr.length);
    }

    public HashCode hashBytes(ByteBuffer byteBuffer) {
        return newHasher(byteBuffer.remaining()).mo16352h(byteBuffer).hash();
    }
}
