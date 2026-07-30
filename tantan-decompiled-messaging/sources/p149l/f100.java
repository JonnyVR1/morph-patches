package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class f100 extends crh0 {
    /* JADX INFO: renamed from: e */
    public f100 m119060e(int i, ByteBuffer byteBuffer) {
        m119061f(i, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public void m119061f(int i, ByteBuffer byteBuffer) {
        this.f82219a = i;
        this.f82220b = byteBuffer;
    }

    /* JADX INFO: renamed from: g */
    public int m119062g(int i) {
        int iM108363b = m108363b(16);
        if (iM108363b != 0) {
            return this.f82220b.getInt(m108364c(iM108363b) + (i * 4));
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public int m119063h() {
        int iM108363b = m108363b(16);
        if (iM108363b != 0) {
            return m108365d(iM108363b);
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m119064i() {
        int iM108363b = m108363b(6);
        return (iM108363b == 0 || this.f82220b.get(iM108363b + this.f82219a) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public short m119065j() {
        int iM108363b = m108363b(14);
        if (iM108363b != 0) {
            return this.f82220b.getShort(iM108363b + this.f82219a);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: k */
    public int m119066k() {
        int iM108363b = m108363b(4);
        if (iM108363b != 0) {
            return this.f82220b.getInt(iM108363b + this.f82219a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public short m119067l() {
        int iM108363b = m108363b(12);
        if (iM108363b != 0) {
            return this.f82220b.getShort(iM108363b + this.f82219a);
        }
        return (short) 0;
    }
}
