package p149l;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class mp1 implements sqf {

    /* JADX INFO: renamed from: c */
    public int f134983c;

    /* JADX INFO: renamed from: e */
    public np1 f134985e;

    /* JADX INFO: renamed from: h */
    public long f134988h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public r35 f134989i;

    /* JADX INFO: renamed from: m */
    public int f134993m;

    /* JADX INFO: renamed from: n */
    public boolean f134994n;

    /* JADX INFO: renamed from: a */
    public final d860 f134981a = new d860(12);

    /* JADX INFO: renamed from: b */
    public final C18525c f134982b = new C18525c();

    /* JADX INFO: renamed from: d */
    public uqf f134984d = new mee();

    /* JADX INFO: renamed from: g */
    public r35[] f134987g = new r35[0];

    /* JADX INFO: renamed from: k */
    public long f134991k = -1;

    /* JADX INFO: renamed from: l */
    public long f134992l = -1;

    /* JADX INFO: renamed from: j */
    public int f134990j = -1;

    /* JADX INFO: renamed from: f */
    public long f134986f = -9223372036854775807L;

    /* JADX INFO: renamed from: l.mp1$b */
    public class C18524b implements hce0 {

        /* JADX INFO: renamed from: a */
        public final long f134995a;

        public C18524b(long j) {
            this.f134995a = j;
        }

        @Override // p149l.hce0
        /* JADX INFO: renamed from: d */
        public hce0.C17274a mo98121d(long j) {
            hce0.C17274a c17274aM177648i = mp1.this.f134987g[0].m177648i(j);
            for (int i = 1; i < mp1.this.f134987g.length; i++) {
                hce0.C17274a c17274aM177648i2 = mp1.this.f134987g[i].m177648i(j);
                if (c17274aM177648i2.f107040a.f117296b < c17274aM177648i.f107040a.f117296b) {
                    c17274aM177648i = c17274aM177648i2;
                }
            }
            return c17274aM177648i;
        }

        @Override // p149l.hce0
        /* JADX INFO: renamed from: e */
        public boolean mo98122e() {
            return true;
        }

        @Override // p149l.hce0
        /* JADX INFO: renamed from: i */
        public long mo98123i() {
            return this.f134995a;
        }
    }

    /* JADX INFO: renamed from: l.mp1$c */
    public static class C18525c {

        /* JADX INFO: renamed from: a */
        public int f134997a;

        /* JADX INFO: renamed from: b */
        public int f134998b;

        /* JADX INFO: renamed from: c */
        public int f134999c;

        public C18525c() {
        }

        /* JADX INFO: renamed from: a */
        public void m155759a(d860 d860Var) {
            this.f134997a = d860Var.m110315u();
            this.f134998b = d860Var.m110315u();
            this.f134999c = 0;
        }

        /* JADX INFO: renamed from: b */
        public void m155760b(d860 d860Var) throws ParserException {
            m155759a(d860Var);
            if (this.f134997a == 1414744396) {
                this.f134999c = d860Var.m110315u();
            } else {
                throw ParserException.createForMalformedContainer("LIST expected, found: " + this.f134997a, null);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m155751d(tqf tqfVar) throws IOException {
        if ((tqfVar.getPosition() & 1) == 1) {
            tqfVar.mo150661o(1);
        }
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        this.f134988h = -1L;
        this.f134989i = null;
        for (r35 r35Var : this.f134987g) {
            r35Var.m177654o(j);
        }
        if (j != 0) {
            this.f134983c = 6;
        } else if (this.f134987g.length == 0) {
            this.f134983c = 0;
        } else {
            this.f134983c = 3;
        }
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public void mo10976b(uqf uqfVar) {
        this.f134983c = 0;
        this.f134984d = uqfVar;
        this.f134988h = -1L;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final r35 m155752e(int i) {
        for (r35 r35Var : this.f134987g) {
            if (r35Var.m177649j(i)) {
                return r35Var;
            }
        }
        return null;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: f */
    public boolean mo10977f(tqf tqfVar) throws IOException {
        tqfVar.mo150655f(this.f134981a.m110299e(), 0, 12);
        this.f134981a.m110292U(0);
        if (this.f134981a.m110315u() != 1179011410) {
            return false;
        }
        this.f134981a.m110293V(4);
        return this.f134981a.m110315u() == 541677121;
    }

    /* JADX INFO: renamed from: g */
    public final void m155753g(d860 d860Var) throws IOException {
        wmr wmrVarM204051c = wmr.m204051c(1819436136, d860Var);
        if (wmrVarM204051c.getType() != 1819436136) {
            throw ParserException.createForMalformedContainer("Unexpected header list type " + wmrVarM204051c.getType(), null);
        }
        np1 np1Var = (np1) wmrVarM204051c.m204052b(np1.class);
        if (np1Var == null) {
            throw ParserException.createForMalformedContainer("AviHeader not found", null);
        }
        this.f134985e = np1Var;
        this.f134986f = ((long) np1Var.f139904c) * ((long) np1Var.f139902a);
        ArrayList arrayList = new ArrayList();
        dpj0<lp1> it = wmrVarM204051c.f187156a.iterator();
        int i = 0;
        while (it.hasNext()) {
            lp1 next = it.next();
            if (next.getType() == 1819440243) {
                int i2 = i + 1;
                r35 r35VarM155756k = m155756k((wmr) next, i);
                if (r35VarM155756k != null) {
                    arrayList.add(r35VarM155756k);
                }
                i = i2;
            }
        }
        this.f134987g = (r35[]) arrayList.toArray(new r35[0]);
        this.f134984d.mo11371l();
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException {
        if (m155758m(tqfVar, fd80Var)) {
            return 1;
        }
        switch (this.f134983c) {
            case 0:
                if (!mo10977f(tqfVar)) {
                    throw ParserException.createForMalformedContainer("AVI Header List not found", null);
                }
                tqfVar.mo150661o(12);
                this.f134983c = 1;
                return 0;
            case 1:
                tqfVar.readFully(this.f134981a.m110299e(), 0, 12);
                this.f134981a.m110292U(0);
                this.f134982b.m155760b(this.f134981a);
                C18525c c18525c = this.f134982b;
                if (c18525c.f134999c == 1819436136) {
                    this.f134990j = c18525c.f134998b;
                    this.f134983c = 2;
                    return 0;
                }
                throw ParserException.createForMalformedContainer("hdrl expected, found: " + this.f134982b.f134999c, null);
            case 2:
                int i = this.f134990j - 4;
                d860 d860Var = new d860(i);
                tqfVar.readFully(d860Var.m110299e(), 0, i);
                m155753g(d860Var);
                this.f134983c = 3;
                return 0;
            case 3:
                if (this.f134991k != -1) {
                    long position = tqfVar.getPosition();
                    long j = this.f134991k;
                    if (position != j) {
                        this.f134988h = j;
                        return 0;
                    }
                }
                tqfVar.mo150655f(this.f134981a.m110299e(), 0, 12);
                tqfVar.mo150657h();
                this.f134981a.m110292U(0);
                this.f134982b.m155759a(this.f134981a);
                int iM110315u = this.f134981a.m110315u();
                int i2 = this.f134982b.f134997a;
                if (i2 == 1179011410) {
                    tqfVar.mo150661o(12);
                    return 0;
                }
                if (i2 != 1414744396 || iM110315u != 1769369453) {
                    this.f134988h = tqfVar.getPosition() + ((long) this.f134982b.f134998b) + 8;
                    return 0;
                }
                long position2 = tqfVar.getPosition();
                this.f134991k = position2;
                this.f134992l = position2 + ((long) this.f134982b.f134998b) + 8;
                if (!this.f134994n) {
                    if (((np1) p11.m167011e(this.f134985e)).m160441a()) {
                        this.f134983c = 4;
                        this.f134988h = this.f134992l;
                        return 0;
                    }
                    this.f134984d.mo11370k(new hce0.C17275b(this.f134986f));
                    this.f134994n = true;
                }
                this.f134988h = tqfVar.getPosition() + 12;
                this.f134983c = 6;
                return 0;
            case 4:
                tqfVar.readFully(this.f134981a.m110299e(), 0, 8);
                this.f134981a.m110292U(0);
                int iM110315u2 = this.f134981a.m110315u();
                int iM110315u3 = this.f134981a.m110315u();
                if (iM110315u2 == 829973609) {
                    this.f134983c = 5;
                    this.f134993m = iM110315u3;
                } else {
                    this.f134988h = tqfVar.getPosition() + ((long) iM110315u3);
                }
                return 0;
            case 5:
                d860 d860Var2 = new d860(this.f134993m);
                tqfVar.readFully(d860Var2.m110299e(), 0, this.f134993m);
                m155754i(d860Var2);
                this.f134983c = 6;
                this.f134988h = this.f134991k;
                return 0;
            case 6:
                return m155757l(tqfVar);
            default:
                shg0.m184191a();
                return 0;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m155754i(d860 d860Var) {
        long jM155755j = m155755j(d860Var);
        while (d860Var.m110295a() >= 16) {
            int iM110315u = d860Var.m110315u();
            int iM110315u2 = d860Var.m110315u();
            long jM110315u = ((long) d860Var.m110315u()) + jM155755j;
            d860Var.m110315u();
            r35 r35VarM155752e = m155752e(iM110315u);
            if (r35VarM155752e != null) {
                if ((iM110315u2 & 16) == 16) {
                    r35VarM155752e.m177642b(jM110315u);
                }
                r35VarM155752e.m177650k();
            }
        }
        for (r35 r35Var : this.f134987g) {
            r35Var.m177643c();
        }
        this.f134994n = true;
        this.f134984d.mo11370k(new C18524b(this.f134986f));
    }

    /* JADX INFO: renamed from: j */
    public final long m155755j(d860 d860Var) {
        if (d860Var.m110295a() < 16) {
            return 0L;
        }
        int iM110300f = d860Var.m110300f();
        d860Var.m110293V(8);
        long jM110315u = d860Var.m110315u();
        long j = this.f134991k;
        long j2 = jM110315u <= j ? j + 8 : 0L;
        d860Var.m110292U(iM110300f);
        return j2;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final r35 m155756k(wmr wmrVar, int i) {
        op1 op1Var = (op1) wmrVar.m204052b(op1.class);
        ezf0 ezf0Var = (ezf0) wmrVar.m204052b(ezf0.class);
        if (op1Var == null) {
            jwv.m143689i("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (ezf0Var == null) {
            jwv.m143689i("AviExtractor", "Missing Stream Format");
            return null;
        }
        long jM165289a = op1Var.m165289a();
        C1871k c1871k = ezf0Var.f93894a;
        C1871k.b bVarM10282b = c1871k.m10282b();
        bVarM10282b.m10333T(i);
        int i2 = op1Var.f144943f;
        if (i2 != 0) {
            bVarM10282b.m10338Y(i2);
        }
        izf0 izf0Var = (izf0) wmrVar.m204052b(izf0.class);
        if (izf0Var != null) {
            bVarM10282b.m10336W(izf0Var.f115570a);
        }
        int iM157529k = n200.m157529k(c1871k.f7748l);
        if (iM157529k != 1 && iM157529k != 2) {
            return null;
        }
        m6j0 m6j0VarMo11362b = this.f134984d.mo11362b(i, iM157529k);
        m6j0VarMo11362b.mo11110b(bVarM10282b.m10320G());
        r35 r35Var = new r35(i, iM157529k, jM165289a, op1Var.f144942e, m6j0VarMo11362b);
        this.f134986f = jM165289a;
        return r35Var;
    }

    /* JADX INFO: renamed from: l */
    public final int m155757l(tqf tqfVar) throws IOException {
        if (tqfVar.getPosition() >= this.f134992l) {
            return -1;
        }
        r35 r35Var = this.f134989i;
        if (r35Var == null) {
            m155751d(tqfVar);
            tqfVar.mo150655f(this.f134981a.m110299e(), 0, 12);
            this.f134981a.m110292U(0);
            int iM110315u = this.f134981a.m110315u();
            d860 d860Var = this.f134981a;
            if (iM110315u == 1414744396) {
                d860Var.m110292U(8);
                tqfVar.mo150661o(this.f134981a.m110315u() != 1769369453 ? 8 : 12);
                tqfVar.mo150657h();
                return 0;
            }
            int iM110315u2 = d860Var.m110315u();
            if (iM110315u == 1263424842) {
                this.f134988h = tqfVar.getPosition() + ((long) iM110315u2) + 8;
                return 0;
            }
            tqfVar.mo150661o(8);
            tqfVar.mo150657h();
            r35 r35VarM155752e = m155752e(iM110315u);
            if (r35VarM155752e == null) {
                this.f134988h = tqfVar.getPosition() + ((long) iM110315u2);
                return 0;
            }
            r35VarM155752e.m177653n(iM110315u2);
            this.f134989i = r35VarM155752e;
        } else if (r35Var.m177652m(tqfVar)) {
            this.f134989i = null;
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m155758m(tqf tqfVar, fd80 fd80Var) throws IOException {
        boolean z;
        if (this.f134988h != -1) {
            long position = tqfVar.getPosition();
            long j = this.f134988h;
            if (j < position || j > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + position) {
                fd80Var.f97018a = j;
                z = true;
            } else {
                tqfVar.mo150661o((int) (j - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.f134988h = -1L;
        return z;
    }

    @Override // p149l.sqf
    public void release() {
    }
}
