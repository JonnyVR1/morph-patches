package p149l;

import com.google.common.hash.HashCode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.i8 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC17506i8 extends AbstractC18410m7 {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f111963a;

    /* JADX INFO: renamed from: b */
    public final int f111964b;

    /* JADX INFO: renamed from: c */
    public final int f111965c;

    public AbstractC17506i8(int i, int i2) {
        sf80.m183882d(i2 % i == 0);
        this.f111963a = ByteBuffer.allocate(i2 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f111964b = i2;
        this.f111965c = i;
    }

    @Override // p149l.om80
    /* JADX INFO: renamed from: a */
    public final kwk mo16348a(int i) {
        this.f111963a.putInt(i);
        m134928m();
        return this;
    }

    @Override // p149l.om80
    /* JADX INFO: renamed from: b */
    public final kwk mo16349b(long j) {
        this.f111963a.putLong(j);
        m134928m();
        return this;
    }

    @Override // p149l.AbstractC18410m7, p149l.kwk
    /* JADX INFO: renamed from: g */
    public final kwk mo16351g(byte[] bArr, int i, int i2) {
        return m134929p(ByteBuffer.wrap(bArr, i, i2).order(ByteOrder.LITTLE_ENDIAN));
    }

    @Override // p149l.kwk
    /* JADX INFO: renamed from: h */
    public final kwk mo16352h(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder = byteBuffer.order();
        try {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return m134929p(byteBuffer);
        } finally {
            byteBuffer.order(byteOrderOrder);
        }
    }

    @Override // p149l.kwk
    public final HashCode hash() {
        m134927l();
        xjq.m209736b(this.f111963a);
        if (this.f111963a.remaining() > 0) {
            mo16346o(this.f111963a);
            ByteBuffer byteBuffer = this.f111963a;
            xjq.m209737c(byteBuffer, byteBuffer.limit());
        }
        return mo16344k();
    }

    @Override // p149l.AbstractC18410m7
    /* JADX INFO: renamed from: j */
    public final kwk mo16353j(char c) {
        this.f111963a.putChar(c);
        m134928m();
        return this;
    }

    /* JADX INFO: renamed from: k */
    public abstract HashCode mo16344k();

    /* JADX INFO: renamed from: l */
    public final void m134927l() {
        xjq.m209736b(this.f111963a);
        while (true) {
            int iRemaining = this.f111963a.remaining();
            int i = this.f111965c;
            ByteBuffer byteBuffer = this.f111963a;
            if (iRemaining < i) {
                byteBuffer.compact();
                return;
            }
            mo16345n(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m134928m() {
        if (this.f111963a.remaining() < 8) {
            m134927l();
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo16345n(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: o */
    public abstract void mo16346o(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: p */
    public final kwk m134929p(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.f111963a.remaining()) {
            this.f111963a.put(byteBuffer);
            m134928m();
            return this;
        }
        int iPosition = this.f111964b - this.f111963a.position();
        for (int i = 0; i < iPosition; i++) {
            this.f111963a.put(byteBuffer.get());
        }
        m134927l();
        while (byteBuffer.remaining() >= this.f111965c) {
            mo16345n(byteBuffer);
        }
        this.f111963a.put(byteBuffer);
        return this;
    }

    public AbstractC17506i8(int i) {
        this(i, i);
    }
}
