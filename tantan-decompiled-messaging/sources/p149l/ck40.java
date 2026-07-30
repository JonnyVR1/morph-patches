package p149l;

import java.io.IOException;
import java.util.ResourceBundle;

/* JADX INFO: loaded from: classes2.dex */
public class ck40 extends zje0 {

    /* JADX INFO: renamed from: b */
    public static ResourceBundle f81274b = ResourceBundle.getBundle("javax.servlet.http.LocalStrings");

    /* JADX INFO: renamed from: a */
    public int f81275a = 0;

    /* JADX INFO: renamed from: k */
    public int m107357k() {
        return this.f81275a;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i2 >= 0) {
            this.f81275a += i2;
        } else {
            rhg0.m179353a(f81274b.getString("err.io.negativelength"));
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f81275a++;
    }
}
