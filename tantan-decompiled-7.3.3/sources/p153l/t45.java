package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.InterfaceC1877b;
import com.google.android.exoplayer2.drm.InterfaceC1878c;
import com.google.android.exoplayer2.source.C1996q;
import com.google.android.exoplayer2.source.InterfaceC1989j;
import com.google.android.exoplayer2.source.InterfaceC1997r;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p153l.u45;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class t45<T extends u45> implements xwd0, InterfaceC1997r, Loader.InterfaceC2064b<o45>, Loader.InterfaceC2068f {

    /* JADX INFO: renamed from: a */
    public final int f171977a;

    /* JADX INFO: renamed from: b */
    public final int[] f171978b;

    /* JADX INFO: renamed from: c */
    public final C1894k[] f171979c;

    /* JADX INFO: renamed from: d */
    public final boolean[] f171980d;

    /* JADX INFO: renamed from: e */
    public final T f171981e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1997r.a<t45<T>> f171982f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1989j.a f171983g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2072c f171984h;

    /* JADX INFO: renamed from: i */
    public final Loader f171985i;

    /* JADX INFO: renamed from: j */
    public final q45 f171986j;

    /* JADX INFO: renamed from: k */
    public final ArrayList<cq2> f171987k;

    /* JADX INFO: renamed from: l */
    public final List<cq2> f171988l;

    /* JADX INFO: renamed from: m */
    public final C1996q f171989m;

    /* JADX INFO: renamed from: n */
    public final C1996q[] f171990n;

    /* JADX INFO: renamed from: o */
    public final eq2 f171991o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public o45 f171992p;

    /* JADX INFO: renamed from: q */
    public C1894k f171993q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public InterfaceC20230b<T> f171994r;

    /* JADX INFO: renamed from: s */
    public long f171995s;

    /* JADX INFO: renamed from: t */
    public long f171996t;

    /* JADX INFO: renamed from: u */
    public int f171997u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public cq2 f171998v;

    /* JADX INFO: renamed from: w */
    public boolean f171999w;

    /* JADX INFO: renamed from: l.t45$b */
    public interface InterfaceC20230b<T extends u45> {
        /* JADX INFO: renamed from: b */
        void mo11110b(t45<T> t45Var);
    }

    public t45(int i, @Nullable int[] iArr, @Nullable C1894k[] c1894kArr, T t, InterfaceC1997r.a<t45<T>> aVar, oj0 oj0Var, long j, InterfaceC1878c interfaceC1878c, InterfaceC1877b.a aVar2, InterfaceC2072c interfaceC2072c, InterfaceC1989j.a aVar3) {
        this.f171977a = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f171978b = iArr;
        this.f171979c = c1894kArr == null ? new C1894k[0] : c1894kArr;
        this.f171981e = t;
        this.f171982f = aVar;
        this.f171983g = aVar3;
        this.f171984h = interfaceC2072c;
        this.f171985i = new Loader("ChunkSampleStream");
        this.f171986j = new q45();
        ArrayList<cq2> arrayList = new ArrayList<>();
        this.f171987k = arrayList;
        this.f171988l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f171990n = new C1996q[length];
        this.f171980d = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        C1996q[] c1996qArr = new C1996q[i3];
        C1996q c1996qM11465k = C1996q.m11465k(oj0Var, interfaceC1878c, aVar2);
        this.f171989m = c1996qM11465k;
        iArr2[0] = i;
        c1996qArr[0] = c1996qM11465k;
        while (i2 < length) {
            C1996q c1996qM11466l = C1996q.m11466l(oj0Var);
            this.f171990n[i2] = c1996qM11466l;
            int i4 = i2 + 1;
            c1996qArr[i4] = c1996qM11466l;
            iArr2[i4] = this.f171978b[i2];
            i2 = i4;
        }
        this.f171991o = new eq2(iArr2, c1996qArr);
        this.f171995s = j;
        this.f171996t = j;
    }

    /* JADX INFO: renamed from: A */
    public final void m189151A(int i) {
        int iMin = Math.min(m189164N(i, 0), this.f171997u);
        if (iMin > 0) {
            bmk0.m105106U0(this.f171987k, 0, iMin);
            this.f171997u -= iMin;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m189152B(int i) {
        w11.m204371g(!this.f171985i.m12142j());
        int size = this.f171987k.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (!m189156F(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = m189155E().f144933h;
        cq2 cq2VarM189153C = m189153C(i);
        if (this.f171987k.isEmpty()) {
            this.f171995s = this.f171996t;
        }
        this.f171999w = false;
        this.f171983g.m11347w(this.f171977a, cq2VarM189153C.f144932g, j);
    }

    /* JADX INFO: renamed from: C */
    public final cq2 m189153C(int i) {
        cq2 cq2Var = this.f171987k.get(i);
        ArrayList<cq2> arrayList = this.f171987k;
        bmk0.m105106U0(arrayList, i, arrayList.size());
        this.f171997u = Math.max(this.f171997u, this.f171987k.size());
        int i2 = 0;
        this.f171989m.m11510u(cq2Var.m111875i(0));
        while (true) {
            C1996q[] c1996qArr = this.f171990n;
            if (i2 >= c1996qArr.length) {
                return cq2Var;
            }
            C1996q c1996q = c1996qArr[i2];
            i2++;
            c1996q.m11510u(cq2Var.m111875i(i2));
        }
    }

    /* JADX INFO: renamed from: D */
    public T m189154D() {
        return this.f171981e;
    }

    /* JADX INFO: renamed from: E */
    public final cq2 m189155E() {
        ArrayList<cq2> arrayList = this.f171987k;
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: F */
    public final boolean m189156F(int i) {
        int iM11469C;
        cq2 cq2Var = this.f171987k.get(i);
        if (this.f171989m.m11469C() > cq2Var.m111875i(0)) {
            return true;
        }
        int i2 = 0;
        do {
            C1996q[] c1996qArr = this.f171990n;
            if (i2 >= c1996qArr.length) {
                return false;
            }
            iM11469C = c1996qArr[i2].m11469C();
            i2++;
        } while (iM11469C <= cq2Var.m111875i(i2));
        return true;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m189157G(o45 o45Var) {
        return o45Var instanceof cq2;
    }

    /* JADX INFO: renamed from: H */
    public boolean m189158H() {
        return this.f171995s != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: I */
    public final void m189159I() {
        int iM189164N = m189164N(this.f171989m.m11469C(), this.f171997u - 1);
        while (true) {
            int i = this.f171997u;
            if (i > iM189164N) {
                return;
            }
            this.f171997u = i + 1;
            m189160J(i);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m189160J(int i) {
        cq2 cq2Var = this.f171987k.get(i);
        C1894k c1894k = cq2Var.f144929d;
        if (!c1894k.equals(this.f171993q)) {
            this.f171983g.m11332h(this.f171977a, c1894k, cq2Var.f144930e, cq2Var.f144931f, cq2Var.f144932g);
        }
        this.f171993q = c1894k;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo11078n(o45 o45Var, long j, long j2, boolean z) {
        this.f171992p = null;
        this.f171998v = null;
        mtv mtvVar = new mtv(o45Var.f144926a, o45Var.f144927b, o45Var.m165972f(), o45Var.m165971e(), j, j2, o45Var.m165969b());
        this.f171984h.m12176c(o45Var.f144926a);
        this.f171983g.m11335k(mtvVar, o45Var.f144928c, this.f171977a, o45Var.f144929d, o45Var.f144930e, o45Var.f144931f, o45Var.f144932g, o45Var.f144933h);
        if (z) {
            return;
        }
        if (m189158H()) {
            m189167Q();
        } else if (m189157G(o45Var)) {
            m189153C(this.f171987k.size() - 1);
            if (this.f171987k.isEmpty()) {
                this.f171995s = this.f171996t;
            }
        }
        this.f171982f.mo10270j(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo11079o(o45 o45Var, long j, long j2) {
        this.f171992p = null;
        this.f171981e.mo11122j(o45Var);
        mtv mtvVar = new mtv(o45Var.f144926a, o45Var.f144927b, o45Var.m165972f(), o45Var.m165971e(), j, j2, o45Var.m165969b());
        this.f171984h.m12176c(o45Var.f144926a);
        this.f171983g.m11338n(mtvVar, o45Var.f144928c, this.f171977a, o45Var.f144929d, o45Var.f144930e, o45Var.f144931f, o45Var.f144932g, o45Var.f144933h);
        this.f171982f.mo10270j(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public Loader.C2065c mo11080q(o45 o45Var, long j, long j2, IOException iOException, int i) {
        Loader.C2065c c2065cM12138h;
        long jM165969b = o45Var.m165969b();
        boolean zM189157G = m189157G(o45Var);
        int size = this.f171987k.size() - 1;
        boolean z = (jM165969b != 0 && zM189157G && m189156F(size)) ? false : true;
        mtv mtvVar = new mtv(o45Var.f144926a, o45Var.f144927b, o45Var.m165972f(), o45Var.m165971e(), j, j2, jM165969b);
        InterfaceC2072c.c cVar = new InterfaceC2072c.c(mtvVar, new ktx(o45Var.f144928c, this.f171977a, o45Var.f144929d, o45Var.f144930e, o45Var.f144931f, bmk0.m105152l1(o45Var.f144932g), bmk0.m105152l1(o45Var.f144933h)), iOException, i);
        if (!this.f171981e.mo11119e(o45Var, z, cVar, this.f171984h)) {
            c2065cM12138h = null;
        } else if (z) {
            c2065cM12138h = Loader.f9495f;
            if (zM189157G) {
                w11.m204371g(m189153C(size) == o45Var);
                if (this.f171987k.isEmpty()) {
                    this.f171995s = this.f171996t;
                }
            }
        } else {
            kyv.m152151i("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            c2065cM12138h = null;
        }
        if (c2065cM12138h == null) {
            long jMo12172a = this.f171984h.mo12172a(cVar);
            c2065cM12138h = jMo12172a != -9223372036854775807L ? Loader.m12138h(false, jMo12172a) : Loader.f9496g;
        }
        boolean zM12149c = c2065cM12138h.m12149c();
        this.f171983g.m11340p(mtvVar, o45Var.f144928c, this.f171977a, o45Var.f144929d, o45Var.f144930e, o45Var.f144931f, o45Var.f144932g, o45Var.f144933h, iOException, !zM12149c);
        if (!zM12149c) {
            this.f171992p = null;
            this.f171984h.m12176c(o45Var.f144926a);
            this.f171982f.mo10270j(this);
        }
        return c2065cM12138h;
    }

    /* JADX INFO: renamed from: N */
    public final int m189164N(int i, int i2) {
        ArrayList<cq2> arrayList;
        do {
            i2++;
            int size = this.f171987k.size();
            arrayList = this.f171987k;
            if (i2 >= size) {
                return arrayList.size() - 1;
            }
        } while (arrayList.get(i2).m111875i(0) <= i);
        return i2 - 1;
    }

    /* JADX INFO: renamed from: O */
    public void m189165O() {
        m189166P(null);
    }

    /* JADX INFO: renamed from: P */
    public void m189166P(@Nullable InterfaceC20230b<T> interfaceC20230b) {
        this.f171994r = interfaceC20230b;
        this.f171989m.m11483Q();
        for (C1996q c1996q : this.f171990n) {
            c1996q.m11483Q();
        }
        this.f171985i.m12145m(this);
    }

    /* JADX INFO: renamed from: Q */
    public final void m189167Q() {
        this.f171989m.m11487U();
        for (C1996q c1996q : this.f171990n) {
            c1996q.m11487U();
        }
    }

    /* JADX INFO: renamed from: R */
    public void m189168R(long j) throws Throwable {
        cq2 cq2Var;
        boolean zM11491Y;
        this.f171996t = j;
        if (m189158H()) {
            this.f171995s = j;
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < this.f171987k.size()) {
                cq2Var = this.f171987k.get(i2);
                long j2 = cq2Var.f144932g;
                if (j2 == j && cq2Var.f83062k == -9223372036854775807L) {
                    break;
                } else if (j2 <= j) {
                    i2++;
                }
            }
            cq2Var = null;
            break;
        }
        C1996q c1996q = this.f171989m;
        if (cq2Var != null) {
            zM11491Y = c1996q.m11490X(cq2Var.m111875i(0));
        } else {
            zM11491Y = c1996q.m11491Y(j, j < mo10980f());
        }
        if (zM11491Y) {
            this.f171997u = m189164N(this.f171989m.m11469C(), 0);
            C1996q[] c1996qArr = this.f171990n;
            int length = c1996qArr.length;
            while (i < length) {
                c1996qArr[i].m11491Y(j, true);
                i++;
            }
            return;
        }
        this.f171995s = j;
        this.f171999w = false;
        this.f171987k.clear();
        this.f171997u = 0;
        if (!this.f171985i.m12142j()) {
            this.f171985i.m12140g();
            m189167Q();
            return;
        }
        this.f171989m.m11507r();
        C1996q[] c1996qArr2 = this.f171990n;
        int length2 = c1996qArr2.length;
        while (i < length2) {
            c1996qArr2[i].m11507r();
            i++;
        }
        this.f171985i.m12139f();
    }

    /* JADX INFO: renamed from: S */
    public t45<T>.C20229a m189169S(long j, int i) throws Throwable {
        for (int i2 = 0; i2 < this.f171990n.length; i2++) {
            if (this.f171978b[i2] == i) {
                w11.m204371g(!this.f171980d[i2]);
                this.f171980d[i2] = true;
                this.f171990n[i2].m11491Y(j, true);
                return new C20229a(this, this.f171990n[i2], i2);
            }
        }
        wpg0.m207458a();
        return null;
    }

    @Override // p153l.xwd0
    /* JADX INFO: renamed from: a */
    public void mo10993a() throws IOException {
        this.f171985i.mo11081a();
        this.f171989m.m11479M();
        if (this.f171985i.m12142j()) {
            return;
        }
        this.f171981e.mo11116a();
    }

    @Override // p153l.xwd0
    /* JADX INFO: renamed from: b */
    public boolean mo10994b() {
        return !m189158H() && this.f171989m.m11477K(this.f171999w);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: c */
    public boolean mo10977c(long j) {
        List<cq2> list;
        long j2;
        if (this.f171999w || this.f171985i.m12142j() || this.f171985i.m12141i()) {
            return false;
        }
        boolean zM189158H = m189158H();
        if (zM189158H) {
            list = Collections.EMPTY_LIST;
            j2 = this.f171995s;
        } else {
            list = this.f171988l;
            j2 = m189155E().f144933h;
        }
        this.f171981e.mo11121h(j, j2, list, this.f171986j);
        q45 q45Var = this.f171986j;
        boolean z = q45Var.f155521b;
        o45 o45Var = q45Var.f155520a;
        q45Var.m175195a();
        if (z) {
            this.f171995s = -9223372036854775807L;
            this.f171999w = true;
            return true;
        }
        if (o45Var == null) {
            return false;
        }
        this.f171992p = o45Var;
        if (m189157G(o45Var)) {
            cq2 cq2Var = (cq2) o45Var;
            if (zM189158H) {
                long j3 = cq2Var.f144932g;
                long j4 = this.f171995s;
                if (j3 != j4) {
                    this.f171989m.m11493a0(j4);
                    for (C1996q c1996q : this.f171990n) {
                        c1996q.m11493a0(this.f171995s);
                    }
                }
                this.f171995s = -9223372036854775807L;
            }
            cq2Var.m111877k(this.f171991o);
            this.f171987k.add(cq2Var);
        } else if (o45Var instanceof gum) {
            ((gum) o45Var).m132345g(this.f171991o);
        }
        this.f171983g.m11344t(new mtv(o45Var.f144926a, o45Var.f144927b, this.f171985i.m12146n(o45Var, this, this.f171984h.mo12174d(o45Var.f144928c))), o45Var.f144928c, this.f171977a, o45Var.f144929d, o45Var.f144930e, o45Var.f144931f, o45Var.f144932g, o45Var.f144933h);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: d */
    public long mo10978d() {
        if (this.f171999w) {
            return Long.MIN_VALUE;
        }
        if (m189158H()) {
            return this.f171995s;
        }
        long jMax = this.f171996t;
        cq2 cq2VarM189155E = m189155E();
        if (!cq2VarM189155E.mo112090h()) {
            if (this.f171987k.size() > 1) {
                ArrayList<cq2> arrayList = this.f171987k;
                cq2VarM189155E = arrayList.get(arrayList.size() - 2);
            } else {
                cq2VarM189155E = null;
            }
        }
        if (cq2VarM189155E != null) {
            jMax = Math.max(jMax, cq2VarM189155E.f144933h);
        }
        return Math.max(jMax, this.f171989m.m11515z());
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: e */
    public void mo10979e(long j) {
        if (this.f171985i.m12141i() || m189158H()) {
            return;
        }
        if (!this.f171985i.m12142j()) {
            int iMo11118d = this.f171981e.mo11118d(j, this.f171988l);
            if (iMo11118d < this.f171987k.size()) {
                m189152B(iMo11118d);
                return;
            }
            return;
        }
        o45 o45Var = (o45) w11.m204369e(this.f171992p);
        if (!(m189157G(o45Var) && m189156F(this.f171987k.size() - 1)) && this.f171981e.mo11117c(j, o45Var, this.f171988l)) {
            this.f171985i.m12139f();
            if (m189157G(o45Var)) {
                this.f171998v = (cq2) o45Var;
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: f */
    public long mo10980f() {
        if (m189158H()) {
            return this.f171995s;
        }
        if (this.f171999w) {
            return Long.MIN_VALUE;
        }
        return m189155E().f144933h;
    }

    /* JADX INFO: renamed from: g */
    public long m189170g(long j, nke0 nke0Var) {
        return this.f171981e.mo11120g(j, nke0Var);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    public boolean isLoading() {
        return this.f171985i.m12142j();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2068f
    /* JADX INFO: renamed from: j */
    public void mo11423j() {
        this.f171989m.m11485S();
        for (C1996q c1996q : this.f171990n) {
            c1996q.m11485S();
        }
        this.f171981e.release();
        InterfaceC20230b<T> interfaceC20230b = this.f171994r;
        if (interfaceC20230b != null) {
            interfaceC20230b.mo11110b(this);
        }
    }

    @Override // p153l.xwd0
    /* JADX INFO: renamed from: k */
    public int mo10996k(long j) throws Throwable {
        if (m189158H()) {
            return 0;
        }
        int iM11471E = this.f171989m.m11471E(j, this.f171999w);
        cq2 cq2Var = this.f171998v;
        if (cq2Var != null) {
            iM11471E = Math.min(iM11471E, cq2Var.m111875i(0) - this.f171989m.m11469C());
        }
        this.f171989m.m11496d0(iM11471E);
        m189159I();
        return iM11471E;
    }

    @Override // p153l.xwd0
    /* JADX INFO: renamed from: l */
    public int mo10997l(p1j p1jVar, DecoderInputBuffer decoderInputBuffer, int i) {
        if (m189158H()) {
            return -3;
        }
        cq2 cq2Var = this.f171998v;
        if (cq2Var != null && cq2Var.m111875i(0) <= this.f171989m.m11469C()) {
            return -3;
        }
        m189159I();
        return this.f171989m.m11484R(p1jVar, decoderInputBuffer, i, this.f171999w);
    }

    /* JADX INFO: renamed from: t */
    public void m189171t(long j, boolean z) {
        if (m189158H()) {
            return;
        }
        int iM11513x = this.f171989m.m11513x();
        this.f171989m.m11506q(j, z, true);
        int iM11513x2 = this.f171989m.m11513x();
        if (iM11513x2 > iM11513x) {
            long jM11514y = this.f171989m.m11514y();
            int i = 0;
            while (true) {
                C1996q[] c1996qArr = this.f171990n;
                if (i >= c1996qArr.length) {
                    break;
                }
                c1996qArr[i].m11506q(jM11514y, z, this.f171980d[i]);
                i++;
            }
        }
        m189151A(iM11513x2);
    }

    /* JADX INFO: renamed from: l.t45$a */
    public final class C20229a implements xwd0 {

        /* JADX INFO: renamed from: a */
        public final t45<T> f172000a;

        /* JADX INFO: renamed from: b */
        public final C1996q f172001b;

        /* JADX INFO: renamed from: c */
        public final int f172002c;

        /* JADX INFO: renamed from: d */
        public boolean f172003d;

        public C20229a(t45<T> t45Var, C1996q c1996q, int i) {
            this.f172000a = t45Var;
            this.f172001b = c1996q;
            this.f172002c = i;
        }

        /* JADX INFO: renamed from: c */
        private void m189172c() {
            if (this.f172003d) {
                return;
            }
            t45.this.f171983g.m11332h(t45.this.f171978b[this.f172002c], t45.this.f171979c[this.f172002c], 0, null, t45.this.f171996t);
            this.f172003d = true;
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: b */
        public boolean mo10994b() {
            return !t45.this.m189158H() && this.f172001b.m11477K(t45.this.f171999w);
        }

        /* JADX INFO: renamed from: d */
        public void m189173d() {
            w11.m204371g(t45.this.f171980d[this.f172002c]);
            t45.this.f171980d[this.f172002c] = false;
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: k */
        public int mo10996k(long j) throws Throwable {
            if (t45.this.m189158H()) {
                return 0;
            }
            int iM11471E = this.f172001b.m11471E(j, t45.this.f171999w);
            if (t45.this.f171998v != null) {
                iM11471E = Math.min(iM11471E, t45.this.f171998v.m111875i(this.f172002c + 1) - this.f172001b.m11469C());
            }
            this.f172001b.m11496d0(iM11471E);
            if (iM11471E > 0) {
                m189172c();
            }
            return iM11471E;
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: l */
        public int mo10997l(p1j p1jVar, DecoderInputBuffer decoderInputBuffer, int i) {
            if (t45.this.m189158H()) {
                return -3;
            }
            if (t45.this.f171998v != null && t45.this.f171998v.m111875i(this.f172002c + 1) <= this.f172001b.m11469C()) {
                return -3;
            }
            m189172c();
            return this.f172001b.m11484R(p1jVar, decoderInputBuffer, i, t45.this.f171999w);
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: a */
        public void mo10993a() {
        }
    }
}
