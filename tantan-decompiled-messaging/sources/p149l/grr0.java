package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class grr0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f104084a = new byte[256];

    /* JADX INFO: renamed from: b */
    public int f104085b;

    /* JADX INFO: renamed from: c */
    public int f104086c;

    public grr0(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f104084a[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = this.f104084a;
            byte b = bArr2[i3];
            i2 = (i2 + b + bArr[i3 % bArr.length]) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b;
        }
        this.f104085b = 0;
        this.f104086c = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m127764a(byte[] bArr) {
        int i = this.f104085b;
        int i2 = this.f104086c;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = this.f104084a;
            i = (i + 1) & 255;
            byte b = bArr2[i];
            i2 = (i2 + b) & 255;
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + b) & 255] ^ bArr[i3]);
        }
        this.f104085b = i;
        this.f104086c = i2;
    }
}
