package p153l;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class krd implements he80 {

    /* JADX INFO: renamed from: i */
    public static final b7h0<String> f128436i = new b7h0() { // from class: l.jrd
        @Override // p153l.b7h0
        public final Object get() {
            return krd.m151007m();
        }
    };

    /* JADX INFO: renamed from: j */
    public static final Random f128437j = new Random();

    /* JADX INFO: renamed from: a */
    public final AbstractC1857c0.d f128438a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1857c0.b f128439b;

    /* JADX INFO: renamed from: c */
    public final HashMap<String, C18246a> f128440c;

    /* JADX INFO: renamed from: d */
    public final b7h0<String> f128441d;

    /* JADX INFO: renamed from: e */
    public he80.InterfaceC17443a f128442e;

    /* JADX INFO: renamed from: f */
    public AbstractC1857c0 f128443f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public String f128444g;

    /* JADX INFO: renamed from: h */
    public long f128445h;

    /* JADX INFO: renamed from: l.krd$a */
    public final class C18246a {

        /* JADX INFO: renamed from: a */
        public final String f128446a;

        /* JADX INFO: renamed from: b */
        public int f128447b;

        /* JADX INFO: renamed from: c */
        public long f128448c;

        /* JADX INFO: renamed from: d */
        public InterfaceC1988i.b f128449d;

        /* JADX INFO: renamed from: e */
        public boolean f128450e;

        /* JADX INFO: renamed from: f */
        public boolean f128451f;

        public C18246a(String str, @Nullable int i, InterfaceC1988i.b bVar) {
            this.f128446a = str;
            this.f128447b = i;
            this.f128448c = bVar == null ? -1L : bVar.f101425d;
            if (bVar == null || !bVar.m128142b()) {
                return;
            }
            this.f128449d = bVar;
        }

        /* JADX INFO: renamed from: i */
        public boolean m151020i(int i, @Nullable InterfaceC1988i.b bVar) {
            if (bVar == null) {
                return i == this.f128447b;
            }
            InterfaceC1988i.b bVar2 = this.f128449d;
            if (bVar2 == null) {
                return !bVar.m128142b() && bVar.f101425d == this.f128448c;
            }
            return bVar.f101425d == bVar2.f101425d && bVar.f101423b == bVar2.f101423b && bVar.f101424c == bVar2.f101424c;
        }

        /* JADX INFO: renamed from: j */
        public boolean m151021j(hk0.C17480a c17480a) {
            InterfaceC1988i.b bVar = c17480a.f110350d;
            if (bVar == null) {
                return this.f128447b != c17480a.f110349c;
            }
            long j = this.f128448c;
            if (j == -1) {
                return false;
            }
            if (bVar.f101425d > j) {
                return true;
            }
            if (this.f128449d == null) {
                return false;
            }
            int iMo9450f = c17480a.f110348b.mo9450f(bVar.f101422a);
            int iMo9450f2 = c17480a.f110348b.mo9450f(this.f128449d.f101422a);
            InterfaceC1988i.b bVar2 = c17480a.f110350d;
            if (bVar2.f101425d < this.f128449d.f101425d || iMo9450f < iMo9450f2) {
                return false;
            }
            if (iMo9450f > iMo9450f2) {
                return true;
            }
            boolean zM128142b = bVar2.m128142b();
            InterfaceC1988i.b bVar3 = c17480a.f110350d;
            if (!zM128142b) {
                int i = bVar3.f101426e;
                return i == -1 || i > this.f128449d.f101423b;
            }
            int i2 = bVar3.f101423b;
            int i3 = bVar3.f101424c;
            InterfaceC1988i.b bVar4 = this.f128449d;
            int i4 = bVar4.f101423b;
            return i2 > i4 || (i2 == i4 && i3 > bVar4.f101424c);
        }

        /* JADX INFO: renamed from: k */
        public void m151022k(int i, @Nullable InterfaceC1988i.b bVar) {
            if (this.f128448c != -1 || i != this.f128447b || bVar == null || bVar.f101425d < krd.this.m151009n()) {
                return;
            }
            this.f128448c = bVar.f101425d;
        }

        /* JADX INFO: renamed from: l */
        public final int m151023l(AbstractC1857c0 abstractC1857c0, AbstractC1857c0 abstractC1857c1, int i) {
            if (i >= abstractC1857c0.mo9775t()) {
                if (i < abstractC1857c1.mo9775t()) {
                    return i;
                }
                return -1;
            }
            abstractC1857c0.m9774r(i, krd.this.f128438a);
            for (int i2 = krd.this.f128438a.f7379o; i2 <= krd.this.f128438a.f7380p; i2++) {
                int iMo9450f = abstractC1857c1.mo9450f(abstractC1857c0.mo9456q(i2));
                if (iMo9450f != -1) {
                    return abstractC1857c1.m9770j(iMo9450f, krd.this.f128439b).f7339c;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: m */
        public boolean m151024m(AbstractC1857c0 abstractC1857c0, AbstractC1857c0 abstractC1857c1) {
            int iM151023l = m151023l(abstractC1857c0, abstractC1857c1, this.f128447b);
            this.f128447b = iM151023l;
            if (iM151023l == -1) {
                return false;
            }
            InterfaceC1988i.b bVar = this.f128449d;
            return bVar == null || abstractC1857c1.mo9450f(bVar.f101422a) != -1;
        }
    }

    public krd(b7h0<String> b7h0Var) {
        this.f128441d = b7h0Var;
        this.f128438a = new AbstractC1857c0.d();
        this.f128439b = new AbstractC1857c0.b();
        this.f128440c = new HashMap<>();
        this.f128443f = AbstractC1857c0.f7326a;
        this.f128445h = -1L;
    }

    /* JADX INFO: renamed from: m */
    public static String m151007m() {
        byte[] bArr = new byte[12];
        f128437j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // p153l.he80
    /* JADX INFO: renamed from: a */
    public synchronized void mo134622a(hk0.C17480a c17480a, int i) {
        try {
            w11.m204369e(this.f128442e);
            boolean z = i == 0;
            Iterator<C18246a> it = this.f128440c.values().iterator();
            while (it.hasNext()) {
                C18246a next = it.next();
                if (next.m151021j(c17480a)) {
                    it.remove();
                    if (next.f128450e) {
                        boolean zEquals = next.f128446a.equals(this.f128444g);
                        boolean z2 = z && zEquals && next.f128451f;
                        if (zEquals) {
                            m151008l(next);
                        }
                        this.f128442e.mo100968x(c17480a, next.f128446a, z2);
                    }
                }
            }
            m151011p(c17480a);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.he80
    /* JADX INFO: renamed from: b */
    public void mo134623b(he80.InterfaceC17443a interfaceC17443a) {
        this.f128442e = interfaceC17443a;
    }

    @Override // p153l.he80
    /* JADX INFO: renamed from: c */
    public synchronized void mo134624c(hk0.C17480a c17480a) {
        try {
            w11.m204369e(this.f128442e);
            AbstractC1857c0 abstractC1857c0 = this.f128443f;
            this.f128443f = c17480a.f110348b;
            Iterator<C18246a> it = this.f128440c.values().iterator();
            while (it.hasNext()) {
                C18246a next = it.next();
                if (!next.m151024m(abstractC1857c0, this.f128443f) || next.m151021j(c17480a)) {
                    it.remove();
                    if (next.f128450e) {
                        if (next.f128446a.equals(this.f128444g)) {
                            m151008l(next);
                        }
                        this.f128442e.mo100968x(c17480a, next.f128446a, false);
                    }
                }
            }
            m151011p(c17480a);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.he80
    /* JADX INFO: renamed from: d */
    public synchronized void mo134625d(hk0.C17480a c17480a) {
        he80.InterfaceC17443a interfaceC17443a;
        try {
            String str = this.f128444g;
            if (str != null) {
                m151008l((C18246a) w11.m204369e(this.f128440c.get(str)));
            }
            Iterator<C18246a> it = this.f128440c.values().iterator();
            while (it.hasNext()) {
                C18246a next = it.next();
                it.remove();
                if (next.f128450e && (interfaceC17443a = this.f128442e) != null) {
                    interfaceC17443a.mo100968x(c17480a, next.f128446a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.he80
    @Nullable
    /* JADX INFO: renamed from: e */
    public synchronized String mo134626e() {
        return this.f128444g;
    }

    @Override // p153l.he80
    /* JADX INFO: renamed from: f */
    public synchronized void mo134627f(hk0.C17480a c17480a) {
        w11.m204369e(this.f128442e);
        if (c17480a.f110348b.m9776u()) {
            return;
        }
        InterfaceC1988i.b bVar = c17480a.f110350d;
        if (bVar != null) {
            if (bVar.f101425d < m151009n()) {
                return;
            }
            C18246a c18246a = this.f128440c.get(this.f128444g);
            if (c18246a != null && c18246a.f128448c == -1 && c18246a.f128447b != c17480a.f110349c) {
                return;
            }
        }
        C18246a c18246aM151010o = m151010o(c17480a.f110349c, c17480a.f110350d);
        if (this.f128444g == null) {
            this.f128444g = c18246aM151010o.f128446a;
        }
        InterfaceC1988i.b bVar2 = c17480a.f110350d;
        if (bVar2 != null && bVar2.m128142b()) {
            InterfaceC1988i.b bVar3 = c17480a.f110350d;
            InterfaceC1988i.b bVar4 = new InterfaceC1988i.b(bVar3.f101422a, bVar3.f101425d, bVar3.f101423b);
            C18246a c18246aM151010o2 = m151010o(c17480a.f110349c, bVar4);
            if (!c18246aM151010o2.f128450e) {
                c18246aM151010o2.f128450e = true;
                c17480a.f110348b.mo9454l(c17480a.f110350d.f101422a, this.f128439b);
                this.f128442e.mo100960V(new hk0.C17480a(c17480a.f110347a, c17480a.f110348b, c17480a.f110349c, bVar4, Math.max(0L, bmk0.m105152l1(this.f128439b.m9786i(c17480a.f110350d.f101423b)) + this.f128439b.m9793p()), c17480a.f110352f, c17480a.f110353g, c17480a.f110354h, c17480a.f110355i, c17480a.f110356j), c18246aM151010o2.f128446a);
            }
        }
        if (!c18246aM151010o.f128450e) {
            c18246aM151010o.f128450e = true;
            this.f128442e.mo100960V(c17480a, c18246aM151010o.f128446a);
        }
        if (c18246aM151010o.f128446a.equals(this.f128444g) && !c18246aM151010o.f128451f) {
            c18246aM151010o.f128451f = true;
            this.f128442e.mo100963d(c17480a, c18246aM151010o.f128446a);
        }
    }

    @Override // p153l.he80
    /* JADX INFO: renamed from: g */
    public synchronized String mo134628g(AbstractC1857c0 abstractC1857c0, InterfaceC1988i.b bVar) {
        return m151010o(abstractC1857c0.mo9454l(bVar.f101422a, this.f128439b).f7339c, bVar).f128446a;
    }

    /* JADX INFO: renamed from: l */
    public final void m151008l(C18246a c18246a) {
        if (c18246a.f128448c != -1) {
            this.f128445h = c18246a.f128448c;
        }
        this.f128444g = null;
    }

    /* JADX INFO: renamed from: n */
    public final long m151009n() {
        C18246a c18246a = this.f128440c.get(this.f128444g);
        return (c18246a == null || c18246a.f128448c == -1) ? this.f128445h + 1 : c18246a.f128448c;
    }

    /* JADX INFO: renamed from: o */
    public final C18246a m151010o(int i, @Nullable InterfaceC1988i.b bVar) {
        C18246a c18246a = null;
        long j = Long.MAX_VALUE;
        for (C18246a c18246a2 : this.f128440c.values()) {
            c18246a2.m151022k(i, bVar);
            if (c18246a2.m151020i(i, bVar)) {
                long j2 = c18246a2.f128448c;
                if (j2 == -1 || j2 < j) {
                    c18246a = c18246a2;
                    j = j2;
                } else if (j2 == j && ((C18246a) bmk0.m105144j(c18246a)).f128449d != null && c18246a2.f128449d != null) {
                    c18246a = c18246a2;
                }
            }
        }
        if (c18246a != null) {
            return c18246a;
        }
        String str = this.f128441d.get();
        C18246a c18246a3 = new C18246a(str, i, bVar);
        this.f128440c.put(str, c18246a3);
        return c18246a3;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    /* JADX INFO: renamed from: p */
    public final void m151011p(hk0.C17480a c17480a) {
        if (c17480a.f110348b.m9776u()) {
            String str = this.f128444g;
            if (str != null) {
                m151008l((C18246a) w11.m204369e(this.f128440c.get(str)));
                return;
            }
            return;
        }
        C18246a c18246a = this.f128440c.get(this.f128444g);
        C18246a c18246aM151010o = m151010o(c17480a.f110349c, c17480a.f110350d);
        this.f128444g = c18246aM151010o.f128446a;
        mo134627f(c17480a);
        InterfaceC1988i.b bVar = c17480a.f110350d;
        if (bVar == null || !bVar.m128142b()) {
            return;
        }
        if (c18246a != null && c18246a.f128448c == c17480a.f110350d.f101425d && c18246a.f128449d != null && c18246a.f128449d.f101423b == c17480a.f110350d.f101423b && c18246a.f128449d.f101424c == c17480a.f110350d.f101424c) {
            return;
        }
        InterfaceC1988i.b bVar2 = c17480a.f110350d;
        this.f128442e.mo100949M(c17480a, m151010o(c17480a.f110349c, new InterfaceC1988i.b(bVar2.f101422a, bVar2.f101425d)).f128446a, c18246aM151010o.f128446a);
    }

    public krd() {
        this(f128436i);
    }
}
