package p153l;

import java.io.IOException;
import java.util.ResourceBundle;

/* JADX INFO: loaded from: classes2.dex */
public class qs40 extends ese0 {

    /* JADX INFO: renamed from: b */
    public static ResourceBundle f159245b = ResourceBundle.getBundle("javax.servlet.http.LocalStrings");

    /* JADX INFO: renamed from: a */
    public int f159246a = 0;

    /* JADX INFO: renamed from: k */
    public int m177724k() {
        return this.f159246a;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i2 >= 0) {
            this.f159246a += i2;
        } else {
            zpg0.m220844a(f159245b.getString("err.io.negativelength"));
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f159246a++;
    }
}
