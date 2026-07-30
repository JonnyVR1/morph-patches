package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class i13 {

    /* JADX INFO: renamed from: a */
    private ByteBuffer f112483a;

    /* JADX INFO: renamed from: b */
    int f112484b;

    /* JADX INFO: renamed from: c */
    int f112485c = 0;

    public i13(ByteBuffer byteBuffer) {
        this.f112483a = byteBuffer;
        this.f112484b = byteBuffer.position();
    }

    /* JADX INFO: renamed from: a */
    public void m138073a(int i, int i2) {
        int i3 = this.f112485c;
        int i4 = 8 - (i3 % 8);
        if (i2 <= i4) {
            int i5 = this.f112483a.get(this.f112484b + (i3 / 8));
            if (i5 < 0) {
                i5 += 256;
            }
            int i6 = i5 + (i << (i4 - i2));
            ByteBuffer byteBuffer = this.f112483a;
            int i7 = this.f112484b + (this.f112485c / 8);
            if (i6 > 127) {
                i6 -= 256;
            }
            byteBuffer.put(i7, (byte) i6);
            this.f112485c += i2;
        } else {
            int i8 = i2 - i4;
            m138073a(i >> i8, i4);
            m138073a(i & ((1 << i8) - 1), i8);
        }
        ByteBuffer byteBuffer2 = this.f112483a;
        int i9 = this.f112484b;
        int i10 = this.f112485c;
        byteBuffer2.position(i9 + (i10 / 8) + (i10 % 8 <= 0 ? 0 : 1));
    }
}
