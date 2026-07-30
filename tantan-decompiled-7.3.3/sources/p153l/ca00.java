package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ca00 extends kzh0 {
    /* JADX INFO: renamed from: e */
    public ca00 m108463e(int i, ByteBuffer byteBuffer) {
        m108464f(i, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public void m108464f(int i, ByteBuffer byteBuffer) {
        this.f129421a = i;
        this.f129422b = byteBuffer;
    }

    /* JADX INFO: renamed from: g */
    public int m108465g(int i) {
        int iM152174b = m152174b(16);
        if (iM152174b != 0) {
            return this.f129422b.getInt(m152175c(iM152174b) + (i * 4));
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public int m108466h() {
        int iM152174b = m152174b(16);
        if (iM152174b != 0) {
            return m152176d(iM152174b);
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m108467i() {
        int iM152174b = m152174b(6);
        return (iM152174b == 0 || this.f129422b.get(iM152174b + this.f129421a) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public short m108468j() {
        int iM152174b = m152174b(14);
        if (iM152174b != 0) {
            return this.f129422b.getShort(iM152174b + this.f129421a);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: k */
    public int m108469k() {
        int iM152174b = m152174b(4);
        if (iM152174b != 0) {
            return this.f129422b.getInt(iM152174b + this.f129421a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public short m108470l() {
        int iM152174b = m152174b(12);
        if (iM152174b != 0) {
            return this.f129422b.getShort(iM152174b + this.f129421a);
        }
        return (short) 0;
    }
}
