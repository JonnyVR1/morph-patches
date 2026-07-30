package p153l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.w6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC21030w6 extends AbstractC17410h7 {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f187569a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    @Override // p153l.su80
    /* JADX INFO: renamed from: a */
    public azk mo16403a(int i) {
        this.f187569a.putInt(i);
        return m205001l(4);
    }

    @Override // p153l.su80
    /* JADX INFO: renamed from: b */
    public azk mo16404b(long j) {
        this.f187569a.putLong(j);
        return m205001l(8);
    }

    @Override // p153l.AbstractC17410h7, p153l.azk
    /* JADX INFO: renamed from: h */
    public azk mo16406h(byte[] bArr, int i, int i2) {
        xn80.m212116u(i, i + i2, bArr.length);
        mo16386p(bArr, i, i2);
        return this;
    }

    @Override // p153l.azk
    /* JADX INFO: renamed from: i */
    public azk mo16407i(ByteBuffer byteBuffer) {
        mo16394n(byteBuffer);
        return this;
    }

    @Override // p153l.AbstractC17410h7, p153l.su80
    /* JADX INFO: renamed from: j */
    public azk mo133755f(byte[] bArr) {
        xn80.m212111p(bArr);
        m205002o(bArr);
        return this;
    }

    @Override // p153l.AbstractC17410h7
    /* JADX INFO: renamed from: k */
    public azk mo16408k(char c) {
        this.f187569a.putChar(c);
        return m205001l(2);
    }

    /* JADX INFO: renamed from: l */
    public final azk m205001l(int i) {
        try {
            mo16386p(this.f187569a.array(), 0, i);
            return this;
        } finally {
            wlq.m207068a(this.f187569a);
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo16385m(byte b);

    /* JADX INFO: renamed from: n */
    public void mo16394n(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            mo16386p(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            wlq.m207070c(byteBuffer, byteBuffer.limit());
        } else {
            for (int iRemaining = byteBuffer.remaining(); iRemaining > 0; iRemaining--) {
                mo16385m(byteBuffer.get());
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m205002o(byte[] bArr) {
        mo16386p(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo16386p(byte[] bArr, int i, int i2);
}
