package p153l;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class jod implements lke {

    /* JADX INFO: renamed from: a */
    public final byte[] f121985a = new byte[8];

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<C17995b> f121986b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c */
    public final p1l0 f121987c = new p1l0();

    /* JADX INFO: renamed from: d */
    public kke f121988d;

    /* JADX INFO: renamed from: e */
    public int f121989e;

    /* JADX INFO: renamed from: f */
    public int f121990f;

    /* JADX INFO: renamed from: g */
    public long f121991g;

    /* JADX INFO: renamed from: l.jod$b */
    public static final class C17995b {

        /* JADX INFO: renamed from: a */
        public final int f121992a;

        /* JADX INFO: renamed from: b */
        public final long f121993b;

        public C17995b(int i, long j) {
            this.f121992a = i;
            this.f121993b = j;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m146435f(asf asfVar, int i) throws IOException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        asfVar.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // p153l.lke
    /* JADX INFO: renamed from: a */
    public boolean mo146436a(asf asfVar) throws IOException {
        w11.m204373i(this.f121988d);
        while (true) {
            C17995b c17995bPeek = this.f121986b.peek();
            if (c17995bPeek != null && asfVar.getPosition() >= c17995bPeek.f121993b) {
                this.f121988d.mo150089a(this.f121986b.pop().f121992a);
                return true;
            }
            if (this.f121989e == 0) {
                long jM170215d = this.f121987c.m170215d(asfVar, true, false, 4);
                if (jM170215d == -2) {
                    jM170215d = m146438c(asfVar);
                }
                if (jM170215d == -1) {
                    return false;
                }
                this.f121990f = (int) jM170215d;
                this.f121989e = 1;
            }
            if (this.f121989e == 1) {
                this.f121991g = this.f121987c.m170215d(asfVar, false, true, 8);
                this.f121989e = 2;
            }
            int iMo150094f = this.f121988d.mo150094f(this.f121990f);
            if (iMo150094f != 0) {
                if (iMo150094f == 1) {
                    long position = asfVar.getPosition();
                    this.f121986b.push(new C17995b(this.f121990f, this.f121991g + position));
                    this.f121988d.mo150093e(this.f121990f, position, this.f121991g);
                    this.f121989e = 0;
                    return true;
                }
                if (iMo150094f == 2) {
                    long j = this.f121991g;
                    if (j <= 8) {
                        this.f121988d.mo150091c(this.f121990f, m146440e(asfVar, (int) j));
                        this.f121989e = 0;
                        return true;
                    }
                    throw ParserException.createForMalformedContainer("Invalid integer size: " + this.f121991g, null);
                }
                if (iMo150094f == 3) {
                    long j2 = this.f121991g;
                    if (j2 <= 2147483647L) {
                        this.f121988d.mo150092d(this.f121990f, m146435f(asfVar, (int) j2));
                        this.f121989e = 0;
                        return true;
                    }
                    throw ParserException.createForMalformedContainer("String element size: " + this.f121991g, null);
                }
                if (iMo150094f == 4) {
                    this.f121988d.mo150096h(this.f121990f, (int) this.f121991g, asfVar);
                    this.f121989e = 0;
                    return true;
                }
                if (iMo150094f != 5) {
                    throw ParserException.createForMalformedContainer("Invalid element type " + iMo150094f, null);
                }
                long j3 = this.f121991g;
                if (j3 == 4 || j3 == 8) {
                    this.f121988d.mo150090b(this.f121990f, m146439d(asfVar, (int) j3));
                    this.f121989e = 0;
                    return true;
                }
                throw ParserException.createForMalformedContainer("Invalid float size: " + this.f121991g, null);
            }
            asfVar.mo99905o((int) this.f121991g);
            this.f121989e = 0;
        }
    }

    @Override // p153l.lke
    /* JADX INFO: renamed from: b */
    public void mo146437b(kke kkeVar) {
        this.f121988d = kkeVar;
    }

    @RequiresNonNull({"processor"})
    /* JADX INFO: renamed from: c */
    public final long m146438c(asf asfVar) throws IOException {
        asfVar.mo99902h();
        while (true) {
            asfVar.mo99900f(this.f121985a, 0, 4);
            int iM170213c = p1l0.m170213c(this.f121985a[0]);
            if (iM170213c != -1 && iM170213c <= 4) {
                int iM170212a = (int) p1l0.m170212a(this.f121985a, iM170213c, false);
                if (this.f121988d.mo150095g(iM170212a)) {
                    asfVar.mo99905o(iM170213c);
                    return iM170212a;
                }
            }
            asfVar.mo99905o(1);
        }
    }

    /* JADX INFO: renamed from: d */
    public final double m146439d(asf asfVar, int i) throws IOException {
        long jM146440e = m146440e(asfVar, i);
        return i == 4 ? Float.intBitsToFloat((int) jM146440e) : Double.longBitsToDouble(jM146440e);
    }

    /* JADX INFO: renamed from: e */
    public final long m146440e(asf asfVar, int i) throws IOException {
        asfVar.readFully(this.f121985a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f121985a[i2] & 255));
        }
        return j;
    }

    @Override // p153l.lke
    public void reset() {
        this.f121989e = 0;
        this.f121986b.clear();
        this.f121987c.m170216e();
    }
}
