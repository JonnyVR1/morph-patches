package p153l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class as3 extends q33 {
    public as3(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    /* JADX INFO: renamed from: k */
    private int m99855k() throws IOException {
        int i = 0;
        while (m175113c() == 0) {
            i++;
        }
        if (i <= 0) {
            return 0;
        }
        return (int) (((long) ((1 << i) - 1)) + m175114d(i));
    }

    /* JADX INFO: renamed from: m */
    private void m99856m(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        String strValueOf = String.valueOf(q33.f155415f - this.f155420e.m202572c());
        int length = 8 - strValueOf.length();
        sb.append("@".concat(strValueOf));
        for (int i = 0; i < length; i++) {
            sb.append(' ');
        }
        sb.append(str);
        int length2 = (100 - sb.length()) - this.f155420e.m202572c();
        for (int i2 = 0; i2 < length2; i2++) {
            sb.append(' ');
        }
        sb.append(this.f155420e);
        sb.append(" (" + str2 + ")");
        this.f155420e.m202571b();
        n9c.m161973a(sb.toString());
    }

    /* JADX INFO: renamed from: f */
    public boolean m99857f(String str) throws IOException {
        boolean z = m175113c() != 0;
        m99856m(str, z ? "1" : "0");
        return z;
    }

    /* JADX INFO: renamed from: g */
    public long m99858g(int i, String str) throws IOException {
        long jM175114d = m175114d(i);
        m99856m(str, String.valueOf(jM175114d));
        return jM175114d;
    }

    /* JADX INFO: renamed from: h */
    public int m99859h(String str) throws IOException {
        int iM99855k = m99855k();
        int i = iM99855k & 1;
        int i2 = ((iM99855k >> 1) + i) * ((i << 1) - 1);
        m99856m(str, String.valueOf(i2));
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public void m99860i() throws IOException {
        m175113c();
        m175115e();
    }

    /* JADX INFO: renamed from: j */
    public int m99861j(int i, String str) throws IOException {
        return (int) m99858g(i, str);
    }

    /* JADX INFO: renamed from: l */
    public int m99862l(String str) throws IOException {
        int iM99855k = m99855k();
        m99856m(str, String.valueOf(iM99855k));
        return iM99855k;
    }
}
