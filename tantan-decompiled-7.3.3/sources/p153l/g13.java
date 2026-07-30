package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class g13 {

    /* JADX INFO: renamed from: a */
    private ByteBuffer f101713a;

    /* JADX INFO: renamed from: b */
    int f101714b;

    /* JADX INFO: renamed from: c */
    int f101715c;

    public g13(ByteBuffer byteBuffer) {
        this.f101713a = byteBuffer;
        this.f101714b = byteBuffer.position();
    }

    /* JADX INFO: renamed from: a */
    public int m128488a(int i) {
        int iM128488a;
        int i2 = this.f101713a.get(this.f101714b + (this.f101715c / 8));
        if (i2 < 0) {
            i2 += 256;
        }
        int i3 = this.f101715c;
        int i4 = 8 - (i3 % 8);
        if (i <= i4) {
            iM128488a = ((i2 << (i3 % 8)) & 255) >> ((i3 % 8) + (i4 - i));
            this.f101715c = i3 + i;
        } else {
            int i5 = i - i4;
            iM128488a = (m128488a(i4) << i5) + m128488a(i5);
        }
        this.f101713a.position(this.f101714b + ((int) Math.ceil(((double) this.f101715c) / 8.0d)));
        return iM128488a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m128489b() {
        return m128488a(1) == 1;
    }

    /* JADX INFO: renamed from: c */
    public int m128490c() {
        return (this.f101713a.limit() * 8) - this.f101715c;
    }
}
