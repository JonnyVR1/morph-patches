package p149l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class a33 {

    /* JADX INFO: renamed from: f */
    protected static int f67318f;

    /* JADX INFO: renamed from: a */
    private InputStream f67319a;

    /* JADX INFO: renamed from: b */
    private int f67320b;

    /* JADX INFO: renamed from: c */
    private int f67321c;

    /* JADX INFO: renamed from: d */
    int f67322d;

    /* JADX INFO: renamed from: e */
    protected wr4 f67323e = new wr4(50);

    public a33(InputStream inputStream) throws IOException {
        this.f67319a = inputStream;
        this.f67320b = inputStream.read();
        this.f67321c = inputStream.read();
    }

    /* JADX INFO: renamed from: a */
    private void m94642a() throws IOException {
        this.f67320b = this.f67321c;
        this.f67321c = this.f67319a.read();
        this.f67322d = 0;
    }

    /* JADX INFO: renamed from: b */
    public boolean m94643b() throws IOException {
        if (this.f67322d == 8) {
            m94642a();
        }
        int i = 1 << (7 - this.f67322d);
        int i2 = this.f67320b;
        return (i2 == -1 || (this.f67321c == -1 && ((((i << 1) - 1) & i2) == i))) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public int m94644c() throws IOException {
        if (this.f67322d == 8) {
            m94642a();
            if (this.f67320b == -1) {
                return -1;
            }
        }
        int i = this.f67320b;
        int i2 = this.f67322d;
        int i3 = (i >> (7 - i2)) & 1;
        this.f67322d = i2 + 1;
        this.f67323e.m205089a(i3 == 0 ? '0' : '1');
        f67318f++;
        return i3;
    }

    /* JADX INFO: renamed from: d */
    public long m94645d(int i) throws IOException {
        if (i > 64) {
            ig3.m135964a("Can not readByte more then 64 bit");
            return 0L;
        }
        long jM94644c = 0;
        for (int i2 = 0; i2 < i; i2++) {
            jM94644c = (jM94644c << 1) | ((long) m94644c());
        }
        return jM94644c;
    }

    /* JADX INFO: renamed from: e */
    public long m94646e() throws IOException {
        return m94645d(8 - this.f67322d);
    }
}
