package p149l;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class tpd implements b680 {

    /* JADX INFO: renamed from: i */
    public static final tyg0<String> f171454i = new tyg0() { // from class: l.spd
        @Override // p149l.tyg0
        public final Object get() {
            return tpd.m189970m();
        }
    };

    /* JADX INFO: renamed from: j */
    public static final Random f171455j = new Random();

    /* JADX INFO: renamed from: a */
    public final AbstractC1834c0.d f171456a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1834c0.b f171457b;

    /* JADX INFO: renamed from: c */
    public final HashMap<String, C20235a> f171458c;

    /* JADX INFO: renamed from: d */
    public final tyg0<String> f171459d;

    /* JADX INFO: renamed from: e */
    public b680.InterfaceC15816a f171460e;

    /* JADX INFO: renamed from: f */
    public AbstractC1834c0 f171461f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public String f171462g;

    /* JADX INFO: renamed from: h */
    public long f171463h;

    /* JADX INFO: renamed from: l.tpd$a */
    public final class C20235a {

        /* JADX INFO: renamed from: a */
        public final String f171464a;

        /* JADX INFO: renamed from: b */
        public int f171465b;

        /* JADX INFO: renamed from: c */
        public long f171466c;

        /* JADX INFO: renamed from: d */
        public InterfaceC1965i.b f171467d;

        /* JADX INFO: renamed from: e */
        public boolean f171468e;

        /* JADX INFO: renamed from: f */
        public boolean f171469f;

        public C20235a(String str, @Nullable int i, InterfaceC1965i.b bVar) {
            this.f171464a = str;
            this.f171465b = i;
            this.f171466c = bVar == null ? -1L : bVar.f114358d;
            if (bVar == null || !bVar.m137607b()) {
                return;
            }
            this.f171467d = bVar;
        }

        /* JADX INFO: renamed from: i */
        public boolean m189983i(int i, @Nullable InterfaceC1965i.b bVar) {
            if (bVar == null) {
                return i == this.f171465b;
            }
            InterfaceC1965i.b bVar2 = this.f171467d;
            if (bVar2 == null) {
                return !bVar.m137607b() && bVar.f114358d == this.f171466c;
            }
            return bVar.f114358d == bVar2.f114358d && bVar.f114356b == bVar2.f114356b && bVar.f114357c == bVar2.f114357c;
        }

        /* JADX INFO: renamed from: j */
        public boolean m189984j(lk0.C18238a c18238a) {
            InterfaceC1965i.b bVar = c18238a.f128432d;
            if (bVar == null) {
                return this.f171465b != c18238a.f128431c;
            }
            long j = this.f171466c;
            if (j == -1) {
                return false;
            }
            if (bVar.f114358d > j) {
                return true;
            }
            if (this.f171467d == null) {
                return false;
            }
            int iMo9396f = c18238a.f128430b.mo9396f(bVar.f114355a);
            int iMo9396f2 = c18238a.f128430b.mo9396f(this.f171467d.f114355a);
            InterfaceC1965i.b bVar2 = c18238a.f128432d;
            if (bVar2.f114358d < this.f171467d.f114358d || iMo9396f < iMo9396f2) {
                return false;
            }
            if (iMo9396f > iMo9396f2) {
                return true;
            }
            boolean zM137607b = bVar2.m137607b();
            InterfaceC1965i.b bVar3 = c18238a.f128432d;
            if (!zM137607b) {
                int i = bVar3.f114359e;
                return i == -1 || i > this.f171467d.f114356b;
            }
            int i2 = bVar3.f114356b;
            int i3 = bVar3.f114357c;
            InterfaceC1965i.b bVar4 = this.f171467d;
            int i4 = bVar4.f114356b;
            return i2 > i4 || (i2 == i4 && i3 > bVar4.f114357c);
        }

        /* JADX INFO: renamed from: k */
        public void m189985k(int i, @Nullable InterfaceC1965i.b bVar) {
            if (this.f171466c != -1 || i != this.f171465b || bVar == null || bVar.f114358d < tpd.this.m189972n()) {
                return;
            }
            this.f171466c = bVar.f114358d;
        }

        /* JADX INFO: renamed from: l */
        public final int m189986l(AbstractC1834c0 abstractC1834c0, AbstractC1834c0 abstractC1834c1, int i) {
            if (i >= abstractC1834c0.mo9721t()) {
                if (i < abstractC1834c1.mo9721t()) {
                    return i;
                }
                return -1;
            }
            abstractC1834c0.m9720r(i, tpd.this.f171456a);
            for (int i2 = tpd.this.f171456a.f7342o; i2 <= tpd.this.f171456a.f7343p; i2++) {
                int iMo9396f = abstractC1834c1.mo9396f(abstractC1834c0.mo9402q(i2));
                if (iMo9396f != -1) {
                    return abstractC1834c1.m9716j(iMo9396f, tpd.this.f171457b).f7302c;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: m */
        public boolean m189987m(AbstractC1834c0 abstractC1834c0, AbstractC1834c0 abstractC1834c1) {
            int iM189986l = m189986l(abstractC1834c0, abstractC1834c1, this.f171465b);
            this.f171465b = iM189986l;
            if (iM189986l == -1) {
                return false;
            }
            InterfaceC1965i.b bVar = this.f171467d;
            return bVar == null || abstractC1834c1.mo9396f(bVar.f114355a) != -1;
        }
    }

    public tpd(tyg0<String> tyg0Var) {
        this.f171459d = tyg0Var;
        this.f171456a = new AbstractC1834c0.d();
        this.f171457b = new AbstractC1834c0.b();
        this.f171458c = new HashMap<>();
        this.f171461f = AbstractC1834c0.f7289a;
        this.f171463h = -1L;
    }

    /* JADX INFO: renamed from: m */
    public static String m189970m() {
        byte[] bArr = new byte[12];
        f171455j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // p149l.b680
    /* JADX INFO: renamed from: a */
    public synchronized void mo100391a(lk0.C18238a c18238a, int i) {
        try {
            p11.m167011e(this.f171460e);
            boolean z = i == 0;
            Iterator<C20235a> it = this.f171458c.values().iterator();
            while (it.hasNext()) {
                C20235a next = it.next();
                if (next.m189984j(c18238a)) {
                    it.remove();
                    if (next.f171468e) {
                        boolean zEquals = next.f171464a.equals(this.f171462g);
                        boolean z2 = z && zEquals && next.f171469f;
                        if (zEquals) {
                            m189971l(next);
                        }
                        this.f171460e.mo100401x(c18238a, next.f171464a, z2);
                    }
                }
            }
            m189974p(c18238a);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.b680
    /* JADX INFO: renamed from: b */
    public void mo100392b(b680.InterfaceC15816a interfaceC15816a) {
        this.f171460e = interfaceC15816a;
    }

    @Override // p149l.b680
    /* JADX INFO: renamed from: c */
    public synchronized void mo100393c(lk0.C18238a c18238a) {
        try {
            p11.m167011e(this.f171460e);
            AbstractC1834c0 abstractC1834c0 = this.f171461f;
            this.f171461f = c18238a.f128430b;
            Iterator<C20235a> it = this.f171458c.values().iterator();
            while (it.hasNext()) {
                C20235a next = it.next();
                if (!next.m189987m(abstractC1834c0, this.f171461f) || next.m189984j(c18238a)) {
                    it.remove();
                    if (next.f171468e) {
                        if (next.f171464a.equals(this.f171462g)) {
                            m189971l(next);
                        }
                        this.f171460e.mo100401x(c18238a, next.f171464a, false);
                    }
                }
            }
            m189974p(c18238a);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.b680
    /* JADX INFO: renamed from: d */
    public synchronized void mo100394d(lk0.C18238a c18238a) {
        b680.InterfaceC15816a interfaceC15816a;
        try {
            String str = this.f171462g;
            if (str != null) {
                m189971l((C20235a) p11.m167011e(this.f171458c.get(str)));
            }
            Iterator<C20235a> it = this.f171458c.values().iterator();
            while (it.hasNext()) {
                C20235a next = it.next();
                it.remove();
                if (next.f171468e && (interfaceC15816a = this.f171460e) != null) {
                    interfaceC15816a.mo100401x(c18238a, next.f171464a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.b680
    @Nullable
    /* JADX INFO: renamed from: e */
    public synchronized String mo100395e() {
        return this.f171462g;
    }

    @Override // p149l.b680
    /* JADX INFO: renamed from: f */
    public synchronized void mo100396f(lk0.C18238a c18238a) {
        p11.m167011e(this.f171460e);
        if (c18238a.f128430b.m9722u()) {
            return;
        }
        InterfaceC1965i.b bVar = c18238a.f128432d;
        if (bVar != null) {
            if (bVar.f114358d < m189972n()) {
                return;
            }
            C20235a c20235a = this.f171458c.get(this.f171462g);
            if (c20235a != null && c20235a.f171466c == -1 && c20235a.f171465b != c18238a.f128431c) {
                return;
            }
        }
        C20235a c20235aM189973o = m189973o(c18238a.f128431c, c18238a.f128432d);
        if (this.f171462g == null) {
            this.f171462g = c20235aM189973o.f171464a;
        }
        InterfaceC1965i.b bVar2 = c18238a.f128432d;
        if (bVar2 != null && bVar2.m137607b()) {
            InterfaceC1965i.b bVar3 = c18238a.f128432d;
            InterfaceC1965i.b bVar4 = new InterfaceC1965i.b(bVar3.f114355a, bVar3.f114358d, bVar3.f114356b);
            C20235a c20235aM189973o2 = m189973o(c18238a.f128431c, bVar4);
            if (!c20235aM189973o2.f171468e) {
                c20235aM189973o2.f171468e = true;
                c18238a.f128430b.mo9400l(c18238a.f128432d.f114355a, this.f171457b);
                this.f171460e.mo100399V(new lk0.C18238a(c18238a.f128429a, c18238a.f128430b, c18238a.f128431c, bVar4, Math.max(0L, vck0.m197874l1(this.f171457b.m9732i(c18238a.f128432d.f114356b)) + this.f171457b.m9739p()), c18238a.f128434f, c18238a.f128435g, c18238a.f128436h, c18238a.f128437i, c18238a.f128438j), c20235aM189973o2.f171464a);
            }
        }
        if (!c20235aM189973o.f171468e) {
            c20235aM189973o.f171468e = true;
            this.f171460e.mo100399V(c18238a, c20235aM189973o.f171464a);
        }
        if (c20235aM189973o.f171464a.equals(this.f171462g) && !c20235aM189973o.f171469f) {
            c20235aM189973o.f171469f = true;
            this.f171460e.mo100400d(c18238a, c20235aM189973o.f171464a);
        }
    }

    @Override // p149l.b680
    /* JADX INFO: renamed from: g */
    public synchronized String mo100397g(AbstractC1834c0 abstractC1834c0, InterfaceC1965i.b bVar) {
        return m189973o(abstractC1834c0.mo9400l(bVar.f114355a, this.f171457b).f7302c, bVar).f171464a;
    }

    /* JADX INFO: renamed from: l */
    public final void m189971l(C20235a c20235a) {
        if (c20235a.f171466c != -1) {
            this.f171463h = c20235a.f171466c;
        }
        this.f171462g = null;
    }

    /* JADX INFO: renamed from: n */
    public final long m189972n() {
        C20235a c20235a = this.f171458c.get(this.f171462g);
        return (c20235a == null || c20235a.f171466c == -1) ? this.f171463h + 1 : c20235a.f171466c;
    }

    /* JADX INFO: renamed from: o */
    public final C20235a m189973o(int i, @Nullable InterfaceC1965i.b bVar) {
        C20235a c20235a = null;
        long j = Long.MAX_VALUE;
        for (C20235a c20235a2 : this.f171458c.values()) {
            c20235a2.m189985k(i, bVar);
            if (c20235a2.m189983i(i, bVar)) {
                long j2 = c20235a2.f171466c;
                if (j2 == -1 || j2 < j) {
                    c20235a = c20235a2;
                    j = j2;
                } else if (j2 == j && ((C20235a) vck0.m197866j(c20235a)).f171467d != null && c20235a2.f171467d != null) {
                    c20235a = c20235a2;
                }
            }
        }
        if (c20235a != null) {
            return c20235a;
        }
        String str = this.f171459d.get();
        C20235a c20235a3 = new C20235a(str, i, bVar);
        this.f171458c.put(str, c20235a3);
        return c20235a3;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    /* JADX INFO: renamed from: p */
    public final void m189974p(lk0.C18238a c18238a) {
        if (c18238a.f128430b.m9722u()) {
            String str = this.f171462g;
            if (str != null) {
                m189971l((C20235a) p11.m167011e(this.f171458c.get(str)));
                return;
            }
            return;
        }
        C20235a c20235a = this.f171458c.get(this.f171462g);
        C20235a c20235aM189973o = m189973o(c18238a.f128431c, c18238a.f128432d);
        this.f171462g = c20235aM189973o.f171464a;
        mo100396f(c18238a);
        InterfaceC1965i.b bVar = c18238a.f128432d;
        if (bVar == null || !bVar.m137607b()) {
            return;
        }
        if (c20235a != null && c20235a.f171466c == c18238a.f128432d.f114358d && c20235a.f171467d != null && c20235a.f171467d.f114356b == c18238a.f128432d.f114356b && c20235a.f171467d.f114357c == c18238a.f128432d.f114357c) {
            return;
        }
        InterfaceC1965i.b bVar2 = c18238a.f128432d;
        this.f171460e.mo100398M(c18238a, m189973o(c18238a.f128431c, new InterfaceC1965i.b(bVar2.f114355a, bVar2.f114358d)).f171464a, c20235aM189973o.f171464a);
    }

    public tpd() {
        this(f171454i);
    }
}
