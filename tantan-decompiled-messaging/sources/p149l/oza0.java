package p149l;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class oza0 implements sqf {

    /* JADX INFO: renamed from: l */
    public static final xqf f146392l = new xqf() { // from class: l.nza0
        @Override // p149l.xqf
        /* JADX INFO: renamed from: b */
        public final sqf[] mo95334b() {
            return oza0.m166742c();
        }
    };

    /* JADX INFO: renamed from: a */
    public final eri0 f146393a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<C19083a> f146394b;

    /* JADX INFO: renamed from: c */
    public final d860 f146395c;

    /* JADX INFO: renamed from: d */
    public final mza0 f146396d;

    /* JADX INFO: renamed from: e */
    public boolean f146397e;

    /* JADX INFO: renamed from: f */
    public boolean f146398f;

    /* JADX INFO: renamed from: g */
    public boolean f146399g;

    /* JADX INFO: renamed from: h */
    public long f146400h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public lza0 f146401i;

    /* JADX INFO: renamed from: j */
    public uqf f146402j;

    /* JADX INFO: renamed from: k */
    public boolean f146403k;

    /* JADX INFO: renamed from: l.oza0$a */
    public static final class C19083a {

        /* JADX INFO: renamed from: a */
        public final dse f146404a;

        /* JADX INFO: renamed from: b */
        public final eri0 f146405b;

        /* JADX INFO: renamed from: c */
        public final c860 f146406c = new c860(new byte[64]);

        /* JADX INFO: renamed from: d */
        public boolean f146407d;

        /* JADX INFO: renamed from: e */
        public boolean f146408e;

        /* JADX INFO: renamed from: f */
        public boolean f146409f;

        /* JADX INFO: renamed from: g */
        public int f146410g;

        /* JADX INFO: renamed from: h */
        public long f146411h;

        public C19083a(dse dseVar, eri0 eri0Var) {
            this.f146404a = dseVar;
            this.f146405b = eri0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m166744a(d860 d860Var) throws ParserException {
            d860Var.m110306l(this.f146406c.f79701a, 0, 3);
            this.f146406c.m105672p(0);
            m166745b();
            d860Var.m110306l(this.f146406c.f79701a, 0, this.f146410g);
            this.f146406c.m105672p(0);
            m166746c();
            this.f146404a.mo95483d(this.f146411h, 4);
            this.f146404a.mo95480a(d860Var);
            this.f146404a.mo95482c();
        }

        /* JADX INFO: renamed from: b */
        public final void m166745b() {
            this.f146406c.m105674r(8);
            this.f146407d = this.f146406c.m105663g();
            this.f146408e = this.f146406c.m105663g();
            this.f146406c.m105674r(6);
            this.f146410g = this.f146406c.m105664h(8);
        }

        /* JADX INFO: renamed from: c */
        public final void m166746c() {
            this.f146411h = 0L;
            if (this.f146407d) {
                this.f146406c.m105674r(4);
                long jM105664h = ((long) this.f146406c.m105664h(3)) << 30;
                this.f146406c.m105674r(1);
                long jM105664h2 = jM105664h | ((long) (this.f146406c.m105664h(15) << 15));
                this.f146406c.m105674r(1);
                long jM105664h3 = jM105664h2 | ((long) this.f146406c.m105664h(15));
                this.f146406c.m105674r(1);
                if (!this.f146409f && this.f146408e) {
                    this.f146406c.m105674r(4);
                    long jM105664h4 = ((long) this.f146406c.m105664h(3)) << 30;
                    this.f146406c.m105674r(1);
                    long jM105664h5 = jM105664h4 | ((long) (this.f146406c.m105664h(15) << 15));
                    this.f146406c.m105674r(1);
                    long jM105664h6 = jM105664h5 | ((long) this.f146406c.m105664h(15));
                    this.f146406c.m105674r(1);
                    this.f146405b.m117837b(jM105664h6);
                    this.f146409f = true;
                }
                this.f146411h = this.f146405b.m117837b(jM105664h3);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m166747d() {
            this.f146409f = false;
            this.f146404a.mo95481b();
        }
    }

    public oza0(eri0 eri0Var) {
        this.f146393a = eri0Var;
        this.f146395c = new d860(4096);
        this.f146394b = new SparseArray<>();
        this.f146396d = new mza0();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ sqf[] m166742c() {
        return new sqf[]{new oza0()};
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        boolean z = this.f146393a.m117840e() == -9223372036854775807L;
        if (!z) {
            long jM117838c = this.f146393a.m117838c();
            z = (jM117838c == -9223372036854775807L || jM117838c == 0 || jM117838c == j2) ? false : true;
        }
        if (z) {
            this.f146393a.m117842h(j2);
        }
        lza0 lza0Var = this.f146401i;
        if (lza0Var != null) {
            lza0Var.m171788h(j2);
        }
        for (int i = 0; i < this.f146394b.size(); i++) {
            this.f146394b.valueAt(i).m166747d();
        }
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public void mo10976b(uqf uqfVar) {
        this.f146402j = uqfVar;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: d */
    public final void m166743d(long j) {
        if (this.f146403k) {
            return;
        }
        this.f146403k = true;
        if (this.f146396d.m157110c() == -9223372036854775807L) {
            this.f146402j.mo11370k(new hce0.C17275b(this.f146396d.m157110c()));
            return;
        }
        lza0 lza0Var = new lza0(this.f146396d.m157111d(), this.f146396d.m157110c(), j);
        this.f146401i = lza0Var;
        this.f146402j.mo11370k(lza0Var.m171782b());
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: f */
    public boolean mo10977f(tqf tqfVar) throws IOException {
        byte[] bArr = new byte[14];
        tqfVar.mo150655f(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        tqfVar.mo150660m(bArr[13] & 7);
        tqfVar.mo150655f(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException {
        dse xtkVar;
        p11.m167015i(this.f146402j);
        long length = tqfVar.getLength();
        if (length != -1 && !this.f146396d.m157112e()) {
            return this.f146396d.m157114g(tqfVar, fd80Var);
        }
        m166743d(length);
        lza0 lza0Var = this.f146401i;
        if (lza0Var != null && lza0Var.m171784d()) {
            return this.f146401i.m171783c(tqfVar, fd80Var);
        }
        tqfVar.mo150657h();
        long jMo150659k = length != -1 ? length - tqfVar.mo150659k() : -1L;
        if ((jMo150659k != -1 && jMo150659k < 4) || !tqfVar.mo150656g(this.f146395c.m110299e(), 0, 4, true)) {
            return -1;
        }
        this.f146395c.m110292U(0);
        int iM110311q = this.f146395c.m110311q();
        if (iM110311q == 441) {
            return -1;
        }
        if (iM110311q == 442) {
            tqfVar.mo150655f(this.f146395c.m110299e(), 0, 10);
            this.f146395c.m110292U(9);
            tqfVar.mo150661o((this.f146395c.m110279H() & 7) + 14);
            return 0;
        }
        if (iM110311q == 443) {
            tqfVar.mo150655f(this.f146395c.m110299e(), 0, 2);
            this.f146395c.m110292U(0);
            tqfVar.mo150661o(this.f146395c.m110285N() + 6);
            return 0;
        }
        if (((iM110311q & (-256)) >> 8) != 1) {
            tqfVar.mo150661o(1);
            return 0;
        }
        int i = iM110311q & 255;
        C19083a c19083a = this.f146394b.get(i);
        if (!this.f146397e) {
            if (c19083a == null) {
                if (i == 189) {
                    xtkVar = new C16314d9();
                    this.f146398f = true;
                    this.f146400h = tqfVar.getPosition();
                } else if ((iM110311q & 224) == 192) {
                    xtkVar = new xy00();
                    this.f146398f = true;
                    this.f146400h = tqfVar.getPosition();
                } else if ((iM110311q & 240) == 224) {
                    xtkVar = new xtk();
                    this.f146399g = true;
                    this.f146400h = tqfVar.getPosition();
                } else {
                    xtkVar = null;
                }
                if (xtkVar != null) {
                    xtkVar.mo95484e(this.f146402j, new fbj0.C16793d(i, 256));
                    c19083a = new C19083a(xtkVar, this.f146393a);
                    this.f146394b.put(i, c19083a);
                }
            }
            if (tqfVar.getPosition() > ((this.f146398f && this.f146399g) ? this.f146400h + 8192 : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.f146397e = true;
                this.f146402j.mo11371l();
            }
        }
        tqfVar.mo150655f(this.f146395c.m110299e(), 0, 2);
        this.f146395c.m110292U(0);
        int iM110285N = this.f146395c.m110285N() + 6;
        if (c19083a == null) {
            tqfVar.mo150661o(iM110285N);
        } else {
            this.f146395c.m110288Q(iM110285N);
            tqfVar.readFully(this.f146395c.m110299e(), 0, iM110285N);
            this.f146395c.m110292U(6);
            c19083a.m166744a(this.f146395c);
            d860 d860Var = this.f146395c;
            d860Var.m110291T(d860Var.m110296b());
        }
        return 0;
    }

    @Override // p149l.sqf
    public void release() {
    }

    public oza0() {
        this(new eri0(0L));
    }
}
