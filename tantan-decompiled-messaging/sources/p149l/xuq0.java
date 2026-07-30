package p149l;

/* JADX INFO: loaded from: classes2.dex */
public final class xuq0 extends yuq0 {

    /* JADX INFO: renamed from: a */
    private byte[] f194541a;

    /* JADX INFO: renamed from: b */
    private int f194542b;

    /* JADX INFO: renamed from: c */
    private int f194543c;

    @Override // p149l.yuq0
    /* JADX INFO: renamed from: a */
    public int mo200088a(byte[] bArr, int i, int i2) {
        int iMo211181f = mo211181f();
        if (i2 > iMo211181f) {
            i2 = iMo211181f;
        }
        if (i2 > 0) {
            System.arraycopy(this.f194541a, this.f194542b, bArr, i, i2);
            mo211178b(i2);
        }
        return i2;
    }

    @Override // p149l.yuq0
    /* JADX INFO: renamed from: b */
    public void mo211178b(int i) {
        this.f194542b += i;
    }

    @Override // p149l.yuq0
    /* JADX INFO: renamed from: c */
    public void mo200089c(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // p149l.yuq0
    /* JADX INFO: renamed from: d */
    public byte[] mo211179d() {
        return this.f194541a;
    }

    @Override // p149l.yuq0
    /* JADX INFO: renamed from: e */
    public int mo211180e() {
        return this.f194542b;
    }

    @Override // p149l.yuq0
    /* JADX INFO: renamed from: f */
    public int mo211181f() {
        return this.f194543c - this.f194542b;
    }

    /* JADX INFO: renamed from: h */
    public void m211182h(byte[] bArr) {
        m211183i(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: i */
    public void m211183i(byte[] bArr, int i, int i2) {
        this.f194541a = bArr;
        this.f194542b = i;
        this.f194543c = i + i2;
    }
}
