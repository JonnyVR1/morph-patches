package p153l;

import com.google.common.hash.HashCode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.d8 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC16478d8 extends AbstractC17410h7 {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f85560a;

    /* JADX INFO: renamed from: b */
    public final int f85561b;

    /* JADX INFO: renamed from: c */
    public final int f85562c;

    public AbstractC16478d8(int i, int i2) {
        xn80.m212099d(i2 % i == 0);
        this.f85560a = ByteBuffer.allocate(i2 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f85561b = i2;
        this.f85562c = i;
    }

    @Override // p153l.su80
    /* JADX INFO: renamed from: a */
    public final azk mo16403a(int i) {
        this.f85560a.putInt(i);
        m114766n();
        return this;
    }

    @Override // p153l.su80
    /* JADX INFO: renamed from: b */
    public final azk mo16404b(long j) {
        this.f85560a.putLong(j);
        m114766n();
        return this;
    }

    @Override // p153l.azk
    /* JADX INFO: renamed from: e */
    public final HashCode mo16384e() {
        m114765m();
        wlq.m207069b(this.f85560a);
        if (this.f85560a.remaining() > 0) {
            mo16401p(this.f85560a);
            ByteBuffer byteBuffer = this.f85560a;
            wlq.m207070c(byteBuffer, byteBuffer.limit());
        }
        return mo16399l();
    }

    @Override // p153l.AbstractC17410h7, p153l.azk
    /* JADX INFO: renamed from: h */
    public final azk mo16406h(byte[] bArr, int i, int i2) {
        return m114767q(ByteBuffer.wrap(bArr, i, i2).order(ByteOrder.LITTLE_ENDIAN));
    }

    @Override // p153l.azk
    /* JADX INFO: renamed from: i */
    public final azk mo16407i(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder = byteBuffer.order();
        try {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return m114767q(byteBuffer);
        } finally {
            byteBuffer.order(byteOrderOrder);
        }
    }

    @Override // p153l.AbstractC17410h7
    /* JADX INFO: renamed from: k */
    public final azk mo16408k(char c) {
        this.f85560a.putChar(c);
        m114766n();
        return this;
    }

    /* JADX INFO: renamed from: l */
    public abstract HashCode mo16399l();

    /* JADX INFO: renamed from: m */
    public final void m114765m() {
        wlq.m207069b(this.f85560a);
        while (true) {
            int iRemaining = this.f85560a.remaining();
            int i = this.f85562c;
            ByteBuffer byteBuffer = this.f85560a;
            if (iRemaining < i) {
                byteBuffer.compact();
                return;
            }
            mo16400o(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m114766n() {
        if (this.f85560a.remaining() < 8) {
            m114765m();
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo16400o(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: p */
    public abstract void mo16401p(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: q */
    public final azk m114767q(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.f85560a.remaining()) {
            this.f85560a.put(byteBuffer);
            m114766n();
            return this;
        }
        int iPosition = this.f85561b - this.f85560a.position();
        for (int i = 0; i < iPosition; i++) {
            this.f85560a.put(byteBuffer.get());
        }
        m114765m();
        while (byteBuffer.remaining() >= this.f85562c) {
            mo16400o(byteBuffer);
        }
        this.f85560a.put(byteBuffer);
        return this;
    }

    public AbstractC16478d8(int i) {
        this(i, i);
    }
}
