package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class ke2 {

    /* JADX INFO: renamed from: a */
    public final byte[] f125289a;

    /* JADX INFO: renamed from: b */
    public int f125290b = 0;

    public ke2(int i) {
        this.f125289a = new byte[i];
    }

    /* JADX INFO: renamed from: a */
    public void m149290a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f125290b;
            this.f125290b = i3 + 1;
            m149292c(i3, z);
        }
    }

    /* JADX INFO: renamed from: b */
    public byte[] m149291b(int i) {
        int length = this.f125289a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f125289a[i2 / i];
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public final void m149292c(int i, boolean z) {
        this.f125289a[i] = z ? (byte) 1 : (byte) 0;
    }
}
