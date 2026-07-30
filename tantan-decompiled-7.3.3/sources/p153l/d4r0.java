package p153l;

/* JADX INFO: loaded from: classes2.dex */
public final class d4r0 extends e4r0 {

    /* JADX INFO: renamed from: a */
    private byte[] f85065a;

    /* JADX INFO: renamed from: b */
    private int f85066b;

    /* JADX INFO: renamed from: c */
    private int f85067c;

    @Override // p153l.e4r0
    /* JADX INFO: renamed from: a */
    public int mo102509a(byte[] bArr, int i, int i2) {
        int iMo114232f = mo114232f();
        if (i2 > iMo114232f) {
            i2 = iMo114232f;
        }
        if (i2 > 0) {
            System.arraycopy(this.f85065a, this.f85066b, bArr, i, i2);
            mo114229b(i2);
        }
        return i2;
    }

    @Override // p153l.e4r0
    /* JADX INFO: renamed from: b */
    public void mo114229b(int i) {
        this.f85066b += i;
    }

    @Override // p153l.e4r0
    /* JADX INFO: renamed from: c */
    public void mo102510c(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // p153l.e4r0
    /* JADX INFO: renamed from: d */
    public byte[] mo114230d() {
        return this.f85065a;
    }

    @Override // p153l.e4r0
    /* JADX INFO: renamed from: e */
    public int mo114231e() {
        return this.f85066b;
    }

    @Override // p153l.e4r0
    /* JADX INFO: renamed from: f */
    public int mo114232f() {
        return this.f85067c - this.f85066b;
    }

    /* JADX INFO: renamed from: h */
    public void m114233h(byte[] bArr) {
        m114234i(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: i */
    public void m114234i(byte[] bArr, int i, int i2) {
        this.f85065a = bArr;
        this.f85066b = i;
        this.f85067c = i + i2;
    }
}
