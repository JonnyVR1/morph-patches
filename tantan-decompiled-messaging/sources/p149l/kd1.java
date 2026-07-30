package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class kd1 extends ub1 {

    /* JADX INFO: renamed from: d */
    private ByteBuffer f122529d;

    /* JADX INFO: renamed from: e */
    private float f122530e = 1.0f;

    /* JADX INFO: renamed from: f */
    private byte[] f122531f;

    /* JADX INFO: renamed from: e */
    private ByteBuffer m145611e(ByteBuffer byteBuffer, int i, float f) {
        if (byteBuffer == null || i == 0) {
            return null;
        }
        byte[] bArr = this.f122531f;
        if (bArr == null || bArr.length < i) {
            this.f122531f = new byte[i];
        }
        byte[] bArr2 = this.f122531f;
        byteBuffer.get(bArr2, 0, i);
        for (int i2 = 0; i2 < i / 2; i2++) {
            int i3 = i2 * 2;
            int i4 = i3 + 1;
            short s = (short) (((short) (((bArr2[i4] << 8) & 65280) | (bArr2[i3] & 255))) * f);
            bArr2[i4] = (byte) ((s >> 8) & 255);
            bArr2[i3] = (byte) (s & 255);
        }
        byteBuffer.clear();
        byteBuffer.put(bArr2);
        byteBuffer.rewind();
        return byteBuffer;
    }

    @Override // p149l.ub1
    /* JADX INFO: renamed from: b */
    public u460 mo130258b(u460 u460Var, int i, long j) {
        ByteBuffer byteBuffer = this.f122529d;
        if (byteBuffer == null || i > byteBuffer.capacity()) {
            this.f122529d = ByteBuffer.allocate(i);
        }
        ByteBuffer byteBufferM191672a = u460Var.m191672a();
        byteBufferM191672a.position(0);
        byteBufferM191672a.get(this.f122529d.array(), 0, i);
        this.f122529d.position(0);
        ByteBuffer byteBuffer2 = this.f122529d;
        m145611e(byteBuffer2, byteBuffer2.remaining(), this.f122530e);
        this.f122529d.position(0);
        u460Var.m191676e(this.f122529d);
        return u460Var;
    }

    /* JADX INFO: renamed from: f */
    public void m145612f() {
        this.f122529d = null;
        this.f122531f = null;
        this.f122530e = 1.0f;
    }

    /* JADX INFO: renamed from: g */
    public void m145613g(float f) {
        this.f122530e = f;
    }
}
