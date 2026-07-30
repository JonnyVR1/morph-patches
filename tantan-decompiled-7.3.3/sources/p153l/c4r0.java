package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class c4r0 extends e4r0 {

    /* JADX INFO: renamed from: a */
    private l3r0 f79728a;

    /* JADX INFO: renamed from: b */
    private int f79729b;

    public c4r0(int i) {
        this.f79728a = new l3r0(i);
    }

    @Override // p153l.e4r0
    /* JADX INFO: renamed from: a */
    public int mo102509a(byte[] bArr, int i, int i2) {
        byte[] bArrM152736m = this.f79728a.m152736m();
        if (i2 > this.f79728a.m152735k() - this.f79729b) {
            i2 = this.f79728a.m152735k() - this.f79729b;
        }
        if (i2 > 0) {
            System.arraycopy(bArrM152736m, this.f79729b, bArr, i, i2);
            this.f79729b += i2;
        }
        return i2;
    }

    @Override // p153l.e4r0
    /* JADX INFO: renamed from: c */
    public void mo102510c(byte[] bArr, int i, int i2) throws IOException {
        this.f79728a.write(bArr, i, i2);
    }

    /* JADX INFO: renamed from: h */
    public int m107957h() {
        return this.f79728a.size();
    }
}
