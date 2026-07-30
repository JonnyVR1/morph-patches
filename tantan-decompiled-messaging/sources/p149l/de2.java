package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class de2 {

    /* JADX INFO: renamed from: a */
    public final byte[] f85695a;

    /* JADX INFO: renamed from: b */
    public int f85696b = 0;

    public de2(int i) {
        this.f85695a = new byte[i];
    }

    /* JADX INFO: renamed from: a */
    public void m111090a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f85696b;
            this.f85696b = i3 + 1;
            m111092c(i3, z);
        }
    }

    /* JADX INFO: renamed from: b */
    public byte[] m111091b(int i) {
        int length = this.f85695a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f85695a[i2 / i];
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public final void m111092c(int i, boolean z) {
        this.f85695a[i] = z ? (byte) 1 : (byte) 0;
    }
}
