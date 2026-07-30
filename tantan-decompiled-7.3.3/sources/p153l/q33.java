package p153l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class q33 {

    /* JADX INFO: renamed from: f */
    protected static int f155415f;

    /* JADX INFO: renamed from: a */
    private InputStream f155416a;

    /* JADX INFO: renamed from: b */
    private int f155417b;

    /* JADX INFO: renamed from: c */
    private int f155418c;

    /* JADX INFO: renamed from: d */
    int f155419d;

    /* JADX INFO: renamed from: e */
    protected vs4 f155420e = new vs4(50);

    public q33(InputStream inputStream) throws IOException {
        this.f155416a = inputStream;
        this.f155417b = inputStream.read();
        this.f155418c = inputStream.read();
    }

    /* JADX INFO: renamed from: a */
    private void m175111a() throws IOException {
        this.f155417b = this.f155418c;
        this.f155418c = this.f155416a.read();
        this.f155419d = 0;
    }

    /* JADX INFO: renamed from: b */
    public boolean m175112b() throws IOException {
        if (this.f155419d == 8) {
            m175111a();
        }
        int i = 1 << (7 - this.f155419d);
        int i2 = this.f155417b;
        return (i2 == -1 || (this.f155418c == -1 && ((((i << 1) - 1) & i2) == i))) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public int m175113c() throws IOException {
        if (this.f155419d == 8) {
            m175111a();
            if (this.f155417b == -1) {
                return -1;
            }
        }
        int i = this.f155417b;
        int i2 = this.f155419d;
        int i3 = (i >> (7 - i2)) & 1;
        this.f155419d = i2 + 1;
        this.f155420e.m202570a(i3 == 0 ? '0' : '1');
        f155415f++;
        return i3;
    }

    /* JADX INFO: renamed from: d */
    public long m175114d(int i) throws IOException {
        if (i > 64) {
            wg3.m206174a("Can not readByte more then 64 bit");
            return 0L;
        }
        long jM175113c = 0;
        for (int i2 = 0; i2 < i; i2++) {
            jM175113c = (jM175113c << 1) | ((long) m175113c());
        }
        return jM175113c;
    }

    /* JADX INFO: renamed from: e */
    public long m175115e() throws IOException {
        return m175114d(8 - this.f155419d);
    }
}
