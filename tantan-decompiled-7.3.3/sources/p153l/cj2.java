package p153l;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
@svd(tags = {0})
public abstract class cj2 {

    /* JADX INFO: renamed from: a */
    int f82096a;

    /* JADX INFO: renamed from: b */
    int f82097b;

    /* JADX INFO: renamed from: c */
    int f82098c;

    /* JADX INFO: renamed from: a */
    public int m110047a() {
        return this.f82097b + 1 + this.f82098c;
    }

    /* JADX INFO: renamed from: b */
    public int m110048b() {
        return this.f82098c;
    }

    /* JADX INFO: renamed from: c */
    public int m110049c() {
        return this.f82097b;
    }

    /* JADX INFO: renamed from: d */
    public final void m110050d(int i, ByteBuffer byteBuffer) throws IOException {
        this.f82096a = i;
        int iM213898n = y0q.m213898n(byteBuffer);
        this.f82097b = iM213898n & 127;
        int i2 = 1;
        while ((iM213898n >>> 7) == 1) {
            iM213898n = y0q.m213898n(byteBuffer);
            i2++;
            this.f82097b = (this.f82097b << 7) | (iM213898n & 127);
        }
        this.f82098c = i2;
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(this.f82097b);
        mo98560e(byteBufferSlice);
        byteBuffer.position(byteBuffer.position() + this.f82097b);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo98560e(ByteBuffer byteBuffer) throws IOException;

    public String toString() {
        return "BaseDescriptor{tag=" + this.f82096a + ", sizeOfInstance=" + this.f82097b + '}';
    }
}
