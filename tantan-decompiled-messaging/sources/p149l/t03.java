package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class t03 {

    /* JADX INFO: renamed from: a */
    private ByteBuffer f167095a;

    /* JADX INFO: renamed from: b */
    int f167096b;

    /* JADX INFO: renamed from: c */
    int f167097c = 0;

    public t03(ByteBuffer byteBuffer) {
        this.f167095a = byteBuffer;
        this.f167096b = byteBuffer.position();
    }

    /* JADX INFO: renamed from: a */
    public void m186811a(int i, int i2) {
        int i3 = this.f167097c;
        int i4 = 8 - (i3 % 8);
        if (i2 <= i4) {
            int i5 = this.f167095a.get(this.f167096b + (i3 / 8));
            if (i5 < 0) {
                i5 += 256;
            }
            int i6 = i5 + (i << (i4 - i2));
            ByteBuffer byteBuffer = this.f167095a;
            int i7 = this.f167096b + (this.f167097c / 8);
            if (i6 > 127) {
                i6 -= 256;
            }
            byteBuffer.put(i7, (byte) i6);
            this.f167097c += i2;
        } else {
            int i8 = i2 - i4;
            m186811a(i >> i8, i4);
            m186811a(i & ((1 << i8) - 1), i8);
        }
        ByteBuffer byteBuffer2 = this.f167095a;
        int i9 = this.f167096b;
        int i10 = this.f167097c;
        byteBuffer2.position(i9 + (i10 / 8) + (i10 % 8 <= 0 ? 0 : 1));
    }
}
