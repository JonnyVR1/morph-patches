package p153l;

import com.google.common.hash.Funnel;
import com.google.common.hash.HashCode;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.g7 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC17172g7 implements syk {
    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        xn80.m212116u(i, i + i2, bArr.length);
        return newHasher(i2).mo16406h(bArr, i, i2).mo16384e();
    }

    public HashCode hashInt(int i) {
        return newHasher(4).mo16403a(i).mo16384e();
    }

    public HashCode hashLong(long j) {
        return newHasher(8).mo16404b(j).mo16384e();
    }

    @Override // p153l.syk
    public <T> HashCode hashObject(T t, Funnel<? super T> funnel) {
        return newHasher().mo101073g(t, funnel).mo16384e();
    }

    public HashCode hashString(CharSequence charSequence, Charset charset) {
        return newHasher().mo16405d(charSequence, charset).mo16384e();
    }

    public HashCode hashUnencodedChars(CharSequence charSequence) {
        return newHasher(charSequence.length() * 2).mo101072c(charSequence).mo16384e();
    }

    public azk newHasher(int i) {
        xn80.m212101f(i >= 0, "expectedInputSize must be >= 0 but was %s", i);
        return newHasher();
    }

    public HashCode hashBytes(byte[] bArr) {
        return hashBytes(bArr, 0, bArr.length);
    }

    public HashCode hashBytes(ByteBuffer byteBuffer) {
        return newHasher(byteBuffer.remaining()).mo16407i(byteBuffer).mo16384e();
    }
}
