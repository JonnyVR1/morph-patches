package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class m0s0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f134330a = new byte[256];

    /* JADX INFO: renamed from: b */
    public int f134331b;

    /* JADX INFO: renamed from: c */
    public int f134332c;

    public m0s0(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f134330a[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = this.f134330a;
            byte b = bArr2[i3];
            i2 = (i2 + b + bArr[i3 % bArr.length]) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b;
        }
        this.f134331b = 0;
        this.f134332c = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m156533a(byte[] bArr) {
        int i = this.f134331b;
        int i2 = this.f134332c;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = this.f134330a;
            i = (i + 1) & 255;
            byte b = bArr2[i];
            i2 = (i2 + b) & 255;
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + b) & 255] ^ bArr[i3]);
        }
        this.f134331b = i;
        this.f134332c = i2;
    }
}
