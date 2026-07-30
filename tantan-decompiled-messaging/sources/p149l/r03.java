package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class r03 {

    /* JADX INFO: renamed from: a */
    private ByteBuffer f157135a;

    /* JADX INFO: renamed from: b */
    int f157136b;

    /* JADX INFO: renamed from: c */
    int f157137c;

    public r03(ByteBuffer byteBuffer) {
        this.f157135a = byteBuffer;
        this.f157136b = byteBuffer.position();
    }

    /* JADX INFO: renamed from: a */
    public int m177327a(int i) {
        int iM177327a;
        int i2 = this.f157135a.get(this.f157136b + (this.f157137c / 8));
        if (i2 < 0) {
            i2 += 256;
        }
        int i3 = this.f157137c;
        int i4 = 8 - (i3 % 8);
        if (i <= i4) {
            iM177327a = ((i2 << (i3 % 8)) & 255) >> ((i3 % 8) + (i4 - i));
            this.f157137c = i3 + i;
        } else {
            int i5 = i - i4;
            iM177327a = (m177327a(i4) << i5) + m177327a(i5);
        }
        this.f157135a.position(this.f157136b + ((int) Math.ceil(((double) this.f157137c) / 8.0d)));
        return iM177327a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m177328b() {
        return m177327a(1) == 1;
    }

    /* JADX INFO: renamed from: c */
    public int m177329c() {
        return (this.f157135a.limit() * 8) - this.f157137c;
    }
}
