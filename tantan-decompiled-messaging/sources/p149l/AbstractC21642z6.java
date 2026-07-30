package p149l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.z6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC21642z6 extends AbstractC18410m7 {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f201881a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    @Override // p149l.om80
    /* JADX INFO: renamed from: a */
    public kwk mo16348a(int i) {
        this.f201881a.putInt(i);
        return m217386k(4);
    }

    @Override // p149l.om80
    /* JADX INFO: renamed from: b */
    public kwk mo16349b(long j) {
        this.f201881a.putLong(j);
        return m217386k(8);
    }

    @Override // p149l.AbstractC18410m7, p149l.kwk
    /* JADX INFO: renamed from: g */
    public kwk mo16351g(byte[] bArr, int i, int i2) {
        sf80.m183899u(i, i + i2, bArr.length);
        mo16331o(bArr, i, i2);
        return this;
    }

    @Override // p149l.kwk
    /* JADX INFO: renamed from: h */
    public kwk mo16352h(ByteBuffer byteBuffer) {
        mo16339m(byteBuffer);
        return this;
    }

    @Override // p149l.AbstractC18410m7, p149l.om80
    /* JADX INFO: renamed from: i */
    public kwk mo153319e(byte[] bArr) {
        sf80.m183894p(bArr);
        m217387n(bArr);
        return this;
    }

    @Override // p149l.AbstractC18410m7
    /* JADX INFO: renamed from: j */
    public kwk mo16353j(char c) {
        this.f201881a.putChar(c);
        return m217386k(2);
    }

    /* JADX INFO: renamed from: k */
    public final kwk m217386k(int i) {
        try {
            mo16331o(this.f201881a.array(), 0, i);
            return this;
        } finally {
            xjq.m209735a(this.f201881a);
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo16330l(byte b);

    /* JADX INFO: renamed from: m */
    public void mo16339m(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            mo16331o(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            xjq.m209737c(byteBuffer, byteBuffer.limit());
        } else {
            for (int iRemaining = byteBuffer.remaining(); iRemaining > 0; iRemaining--) {
                mo16330l(byteBuffer.get());
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m217387n(byte[] bArr) {
        mo16331o(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo16331o(byte[] bArr, int i, int i2);
}
