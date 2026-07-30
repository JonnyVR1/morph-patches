package p149l;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class z90 implements sqf {

    /* JADX INFO: renamed from: m */
    public static final xqf f202249m = new xqf() { // from class: l.y90
        @Override // p149l.xqf
        /* JADX INFO: renamed from: b */
        public final sqf[] mo95334b() {
            return z90.m217652c();
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f202250a;

    /* JADX INFO: renamed from: b */
    public final aa0 f202251b;

    /* JADX INFO: renamed from: c */
    public final d860 f202252c;

    /* JADX INFO: renamed from: d */
    public final d860 f202253d;

    /* JADX INFO: renamed from: e */
    public final c860 f202254e;

    /* JADX INFO: renamed from: f */
    public uqf f202255f;

    /* JADX INFO: renamed from: g */
    public long f202256g;

    /* JADX INFO: renamed from: h */
    public long f202257h;

    /* JADX INFO: renamed from: i */
    public int f202258i;

    /* JADX INFO: renamed from: j */
    public boolean f202259j;

    /* JADX INFO: renamed from: k */
    public boolean f202260k;

    /* JADX INFO: renamed from: l */
    public boolean f202261l;

    public z90(int i) {
        this.f202250a = (i & 2) != 0 ? i | 1 : i;
        this.f202251b = new aa0(true);
        this.f202252c = new d860(2048);
        this.f202258i = -1;
        this.f202257h = -1L;
        d860 d860Var = new d860(10);
        this.f202253d = d860Var;
        this.f202254e = new c860(d860Var.m110299e());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ sqf[] m217652c() {
        return new sqf[]{new z90()};
    }

    /* JADX INFO: renamed from: e */
    private static int m217653e(int i, long j) {
        return (int) ((((long) i) * 8000000) / j);
    }

    /* JADX INFO: renamed from: g */
    private hce0 m217654g(long j, boolean z) {
        return new zw5(j, this.f202257h, m217653e(this.f202258i, this.f202251b.m95489k()), this.f202258i, z);
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        this.f202260k = false;
        this.f202251b.mo95481b();
        this.f202256g = j2;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public void mo10976b(uqf uqfVar) {
        this.f202255f = uqfVar;
        this.f202251b.mo95484e(uqfVar, new fbj0.C16793d(0, 1));
        uqfVar.mo11371l();
    }

    /* JADX INFO: renamed from: d */
    public final void m217655d(tqf tqfVar) throws IOException {
        if (this.f202259j) {
            return;
        }
        this.f202258i = -1;
        tqfVar.mo150657h();
        long j = 0;
        if (tqfVar.getPosition() == 0) {
            m217657j(tqfVar);
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                if (tqfVar.mo150656g(this.f202253d.m110299e(), 0, 2, true)) {
                    this.f202253d.m110292U(0);
                    if (!aa0.m95479m(this.f202253d.m110285N())) {
                        break;
                    }
                    if (tqfVar.mo150656g(this.f202253d.m110299e(), 0, 4, true)) {
                        this.f202254e.m105672p(14);
                        int iM105664h = this.f202254e.m105664h(13);
                        if (iM105664h <= 6) {
                            this.f202259j = true;
                            throw ParserException.createForMalformedContainer("Malformed ADTS stream", null);
                        }
                        j += (long) iM105664h;
                        i2++;
                        if (i2 != 1000 && tqfVar.mo150662p(iM105664h - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i = i2;
            break;
        }
        tqfVar.mo150657h();
        if (i > 0) {
            this.f202258i = (int) (j / ((long) i));
        } else {
            this.f202258i = -1;
        }
        this.f202259j = true;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: f */
    public boolean mo10977f(tqf tqfVar) throws IOException {
        int iM217657j = m217657j(tqfVar);
        int i = iM217657j;
        int i2 = 0;
        int i3 = 0;
        do {
            tqfVar.mo150655f(this.f202253d.m110299e(), 0, 2);
            this.f202253d.m110292U(0);
            if (aa0.m95479m(this.f202253d.m110285N())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                tqfVar.mo150655f(this.f202253d.m110299e(), 0, 4);
                this.f202254e.m105672p(14);
                int iM105664h = this.f202254e.m105664h(13);
                if (iM105664h <= 6) {
                    i++;
                    tqfVar.mo150657h();
                    tqfVar.mo150660m(i);
                } else {
                    tqfVar.mo150660m(iM105664h - 6);
                    i3 += iM105664h;
                }
            } else {
                i++;
                tqfVar.mo150657h();
                tqfVar.mo150660m(i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iM217657j < 8192);
        return false;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException {
        p11.m167015i(this.f202255f);
        long length = tqfVar.getLength();
        int i = this.f202250a;
        if ((i & 2) != 0 || ((i & 1) != 0 && length != -1)) {
            m217655d(tqfVar);
        }
        int i2 = tqfVar.read(this.f202252c.m110299e(), 0, 2048);
        boolean z = i2 == -1;
        m217656i(length, z);
        if (z) {
            return -1;
        }
        this.f202252c.m110292U(0);
        this.f202252c.m110291T(i2);
        if (!this.f202260k) {
            this.f202251b.mo95483d(this.f202256g, 4);
            this.f202260k = true;
        }
        this.f202251b.mo95480a(this.f202252c);
        return 0;
    }

    @RequiresNonNull({"extractorOutput"})
    /* JADX INFO: renamed from: i */
    public final void m217656i(long j, boolean z) {
        if (this.f202261l) {
            return;
        }
        boolean z2 = (this.f202250a & 1) != 0 && this.f202258i > 0;
        if (z2 && this.f202251b.m95489k() == -9223372036854775807L && !z) {
            return;
        }
        if (!z2 || this.f202251b.m95489k() == -9223372036854775807L) {
            this.f202255f.mo11370k(new hce0.C17275b(-9223372036854775807L));
        } else {
            this.f202255f.mo11370k(m217654g(j, (this.f202250a & 2) != 0));
        }
        this.f202261l = true;
    }

    /* JADX INFO: renamed from: j */
    public final int m217657j(tqf tqfVar) throws IOException {
        int i = 0;
        while (true) {
            tqfVar.mo150655f(this.f202253d.m110299e(), 0, 10);
            this.f202253d.m110292U(0);
            if (this.f202253d.m110282K() != 4801587) {
                break;
            }
            this.f202253d.m110293V(3);
            int iM110278G = this.f202253d.m110278G();
            i += iM110278G + 10;
            tqfVar.mo150660m(iM110278G);
        }
        tqfVar.mo150657h();
        tqfVar.mo150660m(i);
        if (this.f202257h == -1) {
            this.f202257h = i;
        }
        return i;
    }

    @Override // p149l.sqf
    public void release() {
    }

    public z90() {
        this(0);
    }
}
