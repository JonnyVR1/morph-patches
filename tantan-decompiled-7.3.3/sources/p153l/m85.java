package p153l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class m85 extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    int f135149a;

    /* JADX INFO: renamed from: b */
    int f135150b;

    public m85(InputStream inputStream) {
        super(inputStream);
        this.f135149a = -1;
        this.f135150b = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            onl.m168333a();
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        int i3 = read();
        if (i3 == -1) {
            return -1;
        }
        bArr[i] = (byte) i3;
        int i4 = 1;
        while (i4 < i2) {
            try {
                int i5 = read();
                if (i5 == -1) {
                    break;
                }
                bArr[i + i4] = (byte) i5;
                i4++;
            } catch (IOException unused) {
            }
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = super.read();
        if (i == 3 && this.f135149a == 0 && this.f135150b == 0) {
            this.f135149a = -1;
            this.f135150b = -1;
            i = super.read();
        }
        this.f135149a = this.f135150b;
        this.f135150b = i;
        return i;
    }
}
