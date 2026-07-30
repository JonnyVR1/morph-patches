package p149l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class br3 extends a33 {
    public br3(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    /* JADX INFO: renamed from: k */
    private int m103443k() throws IOException {
        int i = 0;
        while (m94644c() == 0) {
            i++;
        }
        if (i <= 0) {
            return 0;
        }
        return (int) (((long) ((1 << i) - 1)) + m94645d(i));
    }

    /* JADX INFO: renamed from: m */
    private void m103444m(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        String strValueOf = String.valueOf(a33.f67318f - this.f67323e.m205091c());
        int length = 8 - strValueOf.length();
        sb.append("@".concat(strValueOf));
        for (int i = 0; i < length; i++) {
            sb.append(' ');
        }
        sb.append(str);
        int length2 = (100 - sb.length()) - this.f67323e.m205091c();
        for (int i2 = 0; i2 < length2; i2++) {
            sb.append(' ');
        }
        sb.append(this.f67323e);
        sb.append(" (" + str2 + ")");
        this.f67323e.m205090b();
        h8c.m129881a(sb.toString());
    }

    /* JADX INFO: renamed from: f */
    public boolean m103445f(String str) throws IOException {
        boolean z = m94644c() != 0;
        m103444m(str, z ? "1" : "0");
        return z;
    }

    /* JADX INFO: renamed from: g */
    public long m103446g(int i, String str) throws IOException {
        long jM94645d = m94645d(i);
        m103444m(str, String.valueOf(jM94645d));
        return jM94645d;
    }

    /* JADX INFO: renamed from: h */
    public int m103447h(String str) throws IOException {
        int iM103443k = m103443k();
        int i = iM103443k & 1;
        int i2 = ((iM103443k >> 1) + i) * ((i << 1) - 1);
        m103444m(str, String.valueOf(i2));
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public void m103448i() throws IOException {
        m94644c();
        m94646e();
    }

    /* JADX INFO: renamed from: j */
    public int m103449j(int i, String str) throws IOException {
        return (int) m103446g(i, str);
    }

    /* JADX INFO: renamed from: l */
    public int m103450l(String str) throws IOException {
        int iM103443k = m103443k();
        m103444m(str, String.valueOf(iM103443k));
        return iM103443k;
    }
}
