package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class rd1 extends bc1 {

    /* JADX INFO: renamed from: d */
    private ByteBuffer f162274d;

    /* JADX INFO: renamed from: e */
    private float f162275e = 1.0f;

    /* JADX INFO: renamed from: f */
    private byte[] f162276f;

    /* JADX INFO: renamed from: e */
    private ByteBuffer m180835e(ByteBuffer byteBuffer, int i, float f) {
        if (byteBuffer == null || i == 0) {
            return null;
        }
        byte[] bArr = this.f162276f;
        if (bArr == null || bArr.length < i) {
            this.f162276f = new byte[i];
        }
        byte[] bArr2 = this.f162276f;
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

    @Override // p153l.bc1
    /* JADX INFO: renamed from: b */
    public ad60 mo103472b(ad60 ad60Var, int i, long j) {
        ByteBuffer byteBuffer = this.f162274d;
        if (byteBuffer == null || i > byteBuffer.capacity()) {
            this.f162274d = ByteBuffer.allocate(i);
        }
        ByteBuffer byteBufferM97015a = ad60Var.m97015a();
        byteBufferM97015a.position(0);
        byteBufferM97015a.get(this.f162274d.array(), 0, i);
        this.f162274d.position(0);
        ByteBuffer byteBuffer2 = this.f162274d;
        m180835e(byteBuffer2, byteBuffer2.remaining(), this.f162275e);
        this.f162274d.position(0);
        ad60Var.m97019e(this.f162274d);
        return ad60Var;
    }

    /* JADX INFO: renamed from: f */
    public void m180836f() {
        this.f162274d = null;
        this.f162276f = null;
        this.f162275e = 1.0f;
    }

    /* JADX INFO: renamed from: g */
    public void m180837g(float f) {
        this.f162275e = f;
    }
}
