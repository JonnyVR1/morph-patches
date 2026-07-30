package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class so60 implements fbj0 {

    /* JADX INFO: renamed from: a */
    public final dse f165550a;

    /* JADX INFO: renamed from: b */
    public final c860 f165551b = new c860(new byte[10]);

    /* JADX INFO: renamed from: c */
    public int f165552c = 0;

    /* JADX INFO: renamed from: d */
    public int f165553d;

    /* JADX INFO: renamed from: e */
    public eri0 f165554e;

    /* JADX INFO: renamed from: f */
    public boolean f165555f;

    /* JADX INFO: renamed from: g */
    public boolean f165556g;

    /* JADX INFO: renamed from: h */
    public boolean f165557h;

    /* JADX INFO: renamed from: i */
    public int f165558i;

    /* JADX INFO: renamed from: j */
    public int f165559j;

    /* JADX INFO: renamed from: k */
    public boolean f165560k;

    /* JADX INFO: renamed from: l */
    public long f165561l;

    public so60(dse dseVar) {
        this.f165550a = dseVar;
    }

    @Override // p149l.fbj0
    /* JADX INFO: renamed from: a */
    public final void mo120352a(d860 d860Var, int i) throws ParserException {
        p11.m167015i(this.f165554e);
        if ((i & 1) != 0) {
            int i2 = this.f165552c;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2) {
                    jwv.m143689i("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i2 != 3) {
                        ohg0.m164364a();
                        return;
                    }
                    if (this.f165559j != -1) {
                        jwv.m143689i("PesReader", "Unexpected start indicator: expected " + this.f165559j + " more bytes");
                    }
                    this.f165550a.mo95482c();
                }
            }
            m185239g(1);
        }
        while (d860Var.m110295a() > 0) {
            int i3 = this.f165552c;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (m185236d(d860Var, this.f165551b.f79701a, Math.min(10, this.f165558i)) && m185236d(d860Var, null, this.f165558i)) {
                            m185238f();
                            i |= this.f165560k ? 4 : 0;
                            this.f165550a.mo95483d(this.f165561l, i);
                            m185239g(3);
                        }
                    } else {
                        if (i3 != 3) {
                            ohg0.m164364a();
                            return;
                        }
                        int iM110295a = d860Var.m110295a();
                        int i4 = this.f165559j;
                        int i5 = i4 != -1 ? iM110295a - i4 : 0;
                        if (i5 > 0) {
                            iM110295a -= i5;
                            d860Var.m110291T(d860Var.m110300f() + iM110295a);
                        }
                        this.f165550a.mo95480a(d860Var);
                        int i6 = this.f165559j;
                        if (i6 != -1) {
                            int i7 = i6 - iM110295a;
                            this.f165559j = i7;
                            if (i7 == 0) {
                                this.f165550a.mo95482c();
                                m185239g(1);
                            }
                        }
                    }
                } else if (m185236d(d860Var, this.f165551b.f79701a, 9)) {
                    m185239g(m185237e() ? 2 : 0);
                }
            } else {
                d860Var.m110293V(d860Var.m110295a());
            }
        }
    }

    @Override // p149l.fbj0
    /* JADX INFO: renamed from: b */
    public final void mo120353b() {
        this.f165552c = 0;
        this.f165553d = 0;
        this.f165557h = false;
        this.f165550a.mo95481b();
    }

    @Override // p149l.fbj0
    /* JADX INFO: renamed from: c */
    public void mo120354c(eri0 eri0Var, uqf uqfVar, fbj0.C16793d c16793d) {
        this.f165554e = eri0Var;
        this.f165550a.mo95484e(uqfVar, c16793d);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m185236d(d860 d860Var, @Nullable byte[] bArr, int i) {
        int iMin = Math.min(d860Var.m110295a(), i - this.f165553d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            d860Var.m110293V(iMin);
        } else {
            d860Var.m110306l(bArr, this.f165553d, iMin);
        }
        int i2 = this.f165553d + iMin;
        this.f165553d = i2;
        return i2 == i;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m185237e() {
        this.f165551b.m105672p(0);
        int iM105664h = this.f165551b.m105664h(24);
        if (iM105664h != 1) {
            jwv.m143689i("PesReader", "Unexpected start code prefix: " + iM105664h);
            this.f165559j = -1;
            return false;
        }
        this.f165551b.m105674r(8);
        int iM105664h2 = this.f165551b.m105664h(16);
        this.f165551b.m105674r(5);
        this.f165560k = this.f165551b.m105663g();
        this.f165551b.m105674r(2);
        this.f165555f = this.f165551b.m105663g();
        this.f165556g = this.f165551b.m105663g();
        this.f165551b.m105674r(6);
        int iM105664h3 = this.f165551b.m105664h(8);
        this.f165558i = iM105664h3;
        if (iM105664h2 == 0) {
            this.f165559j = -1;
        } else {
            int i = (iM105664h2 - 3) - iM105664h3;
            this.f165559j = i;
            if (i < 0) {
                jwv.m143689i("PesReader", "Found negative packet payload size: " + this.f165559j);
                this.f165559j = -1;
            }
        }
        return true;
    }

    @RequiresNonNull({"timestampAdjuster"})
    /* JADX INFO: renamed from: f */
    public final void m185238f() {
        this.f165551b.m105672p(0);
        this.f165561l = -9223372036854775807L;
        if (this.f165555f) {
            this.f165551b.m105674r(4);
            long jM105664h = ((long) this.f165551b.m105664h(3)) << 30;
            this.f165551b.m105674r(1);
            long jM105664h2 = jM105664h | ((long) (this.f165551b.m105664h(15) << 15));
            this.f165551b.m105674r(1);
            long jM105664h3 = jM105664h2 | ((long) this.f165551b.m105664h(15));
            this.f165551b.m105674r(1);
            if (!this.f165557h && this.f165556g) {
                this.f165551b.m105674r(4);
                long jM105664h4 = ((long) this.f165551b.m105664h(3)) << 30;
                this.f165551b.m105674r(1);
                long jM105664h5 = jM105664h4 | ((long) (this.f165551b.m105664h(15) << 15));
                this.f165551b.m105674r(1);
                long jM105664h6 = jM105664h5 | ((long) this.f165551b.m105664h(15));
                this.f165551b.m105674r(1);
                this.f165554e.m117837b(jM105664h6);
                this.f165557h = true;
            }
            this.f165561l = this.f165554e.m117837b(jM105664h3);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m185239g(int i) {
        this.f165552c = i;
        this.f165553d = 0;
    }
}
