package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class wuq0 extends yuq0 {

    /* JADX INFO: renamed from: a */
    private fuq0 f188154a;

    /* JADX INFO: renamed from: b */
    private int f188155b;

    public wuq0(int i) {
        this.f188154a = new fuq0(i);
    }

    @Override // p149l.yuq0
    /* JADX INFO: renamed from: a */
    public int mo200088a(byte[] bArr, int i, int i2) {
        byte[] bArrM123210m = this.f188154a.m123210m();
        if (i2 > this.f188154a.m123209k() - this.f188155b) {
            i2 = this.f188154a.m123209k() - this.f188155b;
        }
        if (i2 > 0) {
            System.arraycopy(bArrM123210m, this.f188155b, bArr, i, i2);
            this.f188155b += i2;
        }
        return i2;
    }

    @Override // p149l.yuq0
    /* JADX INFO: renamed from: c */
    public void mo200089c(byte[] bArr, int i, int i2) throws IOException {
        this.f188154a.write(bArr, i, i2);
    }

    /* JADX INFO: renamed from: h */
    public int m205653h() {
        return this.f188154a.size();
    }
}
