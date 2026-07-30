package p149l;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class end implements hje {

    /* JADX INFO: renamed from: a */
    public final byte[] f92297a = new byte[8];

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<C16649b> f92298b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c */
    public final jsk0 f92299c = new jsk0();

    /* JADX INFO: renamed from: d */
    public gje f92300d;

    /* JADX INFO: renamed from: e */
    public int f92301e;

    /* JADX INFO: renamed from: f */
    public int f92302f;

    /* JADX INFO: renamed from: g */
    public long f92303g;

    /* JADX INFO: renamed from: l.end$b */
    public static final class C16649b {

        /* JADX INFO: renamed from: a */
        public final int f92304a;

        /* JADX INFO: renamed from: b */
        public final long f92305b;

        public C16649b(int i, long j) {
            this.f92304a = i;
            this.f92305b = j;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m117258f(tqf tqfVar, int i) throws IOException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        tqfVar.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // p149l.hje
    /* JADX INFO: renamed from: a */
    public boolean mo117259a(tqf tqfVar) throws IOException {
        p11.m167015i(this.f92300d);
        while (true) {
            C16649b c16649bPeek = this.f92298b.peek();
            if (c16649bPeek != null && tqfVar.getPosition() >= c16649bPeek.f92305b) {
                this.f92300d.mo126469a(this.f92298b.pop().f92304a);
                return true;
            }
            if (this.f92301e == 0) {
                long jM143050d = this.f92299c.m143050d(tqfVar, true, false, 4);
                if (jM143050d == -2) {
                    jM143050d = m117261c(tqfVar);
                }
                if (jM143050d == -1) {
                    return false;
                }
                this.f92302f = (int) jM143050d;
                this.f92301e = 1;
            }
            if (this.f92301e == 1) {
                this.f92303g = this.f92299c.m143050d(tqfVar, false, true, 8);
                this.f92301e = 2;
            }
            int iMo126474f = this.f92300d.mo126474f(this.f92302f);
            if (iMo126474f != 0) {
                if (iMo126474f == 1) {
                    long position = tqfVar.getPosition();
                    this.f92298b.push(new C16649b(this.f92302f, this.f92303g + position));
                    this.f92300d.mo126473e(this.f92302f, position, this.f92303g);
                    this.f92301e = 0;
                    return true;
                }
                if (iMo126474f == 2) {
                    long j = this.f92303g;
                    if (j <= 8) {
                        this.f92300d.mo126471c(this.f92302f, m117263e(tqfVar, (int) j));
                        this.f92301e = 0;
                        return true;
                    }
                    throw ParserException.createForMalformedContainer("Invalid integer size: " + this.f92303g, null);
                }
                if (iMo126474f == 3) {
                    long j2 = this.f92303g;
                    if (j2 <= 2147483647L) {
                        this.f92300d.mo126472d(this.f92302f, m117258f(tqfVar, (int) j2));
                        this.f92301e = 0;
                        return true;
                    }
                    throw ParserException.createForMalformedContainer("String element size: " + this.f92303g, null);
                }
                if (iMo126474f == 4) {
                    this.f92300d.mo126476h(this.f92302f, (int) this.f92303g, tqfVar);
                    this.f92301e = 0;
                    return true;
                }
                if (iMo126474f != 5) {
                    throw ParserException.createForMalformedContainer("Invalid element type " + iMo126474f, null);
                }
                long j3 = this.f92303g;
                if (j3 == 4 || j3 == 8) {
                    this.f92300d.mo126470b(this.f92302f, m117262d(tqfVar, (int) j3));
                    this.f92301e = 0;
                    return true;
                }
                throw ParserException.createForMalformedContainer("Invalid float size: " + this.f92303g, null);
            }
            tqfVar.mo150661o((int) this.f92303g);
            this.f92301e = 0;
        }
    }

    @Override // p149l.hje
    /* JADX INFO: renamed from: b */
    public void mo117260b(gje gjeVar) {
        this.f92300d = gjeVar;
    }

    @RequiresNonNull({"processor"})
    /* JADX INFO: renamed from: c */
    public final long m117261c(tqf tqfVar) throws IOException {
        tqfVar.mo150657h();
        while (true) {
            tqfVar.mo150655f(this.f92297a, 0, 4);
            int iM143048c = jsk0.m143048c(this.f92297a[0]);
            if (iM143048c != -1 && iM143048c <= 4) {
                int iM143047a = (int) jsk0.m143047a(this.f92297a, iM143048c, false);
                if (this.f92300d.mo126475g(iM143047a)) {
                    tqfVar.mo150661o(iM143048c);
                    return iM143047a;
                }
            }
            tqfVar.mo150661o(1);
        }
    }

    /* JADX INFO: renamed from: d */
    public final double m117262d(tqf tqfVar, int i) throws IOException {
        long jM117263e = m117263e(tqfVar, i);
        return i == 4 ? Float.intBitsToFloat((int) jM117263e) : Double.longBitsToDouble(jM117263e);
    }

    /* JADX INFO: renamed from: e */
    public final long m117263e(tqf tqfVar, int i) throws IOException {
        tqfVar.readFully(this.f92297a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f92297a[i2] & 255));
        }
        return j;
    }

    @Override // p149l.hje
    public void reset() {
        this.f92301e = 0;
        this.f92298b.clear();
        this.f92299c.m143051e();
    }
}
