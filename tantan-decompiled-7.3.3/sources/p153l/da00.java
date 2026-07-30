package p153l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class da00 extends kzh0 {
    /* JADX INFO: renamed from: g */
    public static da00 m115105g(ByteBuffer byteBuffer) {
        return m115106h(byteBuffer, new da00());
    }

    /* JADX INFO: renamed from: h */
    public static da00 m115106h(ByteBuffer byteBuffer, da00 da00Var) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return da00Var.m115107e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* JADX INFO: renamed from: e */
    public da00 m115107e(int i, ByteBuffer byteBuffer) {
        m115108f(i, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public void m115108f(int i, ByteBuffer byteBuffer) {
        this.f129421a = i;
        this.f129422b = byteBuffer;
    }

    /* JADX INFO: renamed from: i */
    public ca00 m115109i(ca00 ca00Var, int i) {
        int iM152174b = m152174b(6);
        if (iM152174b != 0) {
            return ca00Var.m108463e(m152173a(m152175c(iM152174b) + (i * 4)), this.f129422b);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public int m115110j() {
        int iM152174b = m152174b(6);
        if (iM152174b != 0) {
            return m152176d(iM152174b);
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public int m115111k() {
        int iM152174b = m152174b(4);
        if (iM152174b != 0) {
            return this.f129422b.getInt(iM152174b + this.f129421a);
        }
        return 0;
    }
}
