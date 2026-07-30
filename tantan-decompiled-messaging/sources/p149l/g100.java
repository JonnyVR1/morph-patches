package p149l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class g100 extends crh0 {
    /* JADX INFO: renamed from: g */
    public static g100 m124042g(ByteBuffer byteBuffer) {
        return m124043h(byteBuffer, new g100());
    }

    /* JADX INFO: renamed from: h */
    public static g100 m124043h(ByteBuffer byteBuffer, g100 g100Var) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return g100Var.m124044e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* JADX INFO: renamed from: e */
    public g100 m124044e(int i, ByteBuffer byteBuffer) {
        m124045f(i, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public void m124045f(int i, ByteBuffer byteBuffer) {
        this.f82219a = i;
        this.f82220b = byteBuffer;
    }

    /* JADX INFO: renamed from: i */
    public f100 m124046i(f100 f100Var, int i) {
        int iM108363b = m108363b(6);
        if (iM108363b != 0) {
            return f100Var.m119060e(m108362a(m108364c(iM108363b) + (i * 4)), this.f82220b);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public int m124047j() {
        int iM108363b = m108363b(6);
        if (iM108363b != 0) {
            return m108365d(iM108363b);
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public int m124048k() {
        int iM108363b = m108363b(4);
        if (iM108363b != 0) {
            return this.f82220b.getInt(iM108363b + this.f82219a);
        }
        return 0;
    }
}
