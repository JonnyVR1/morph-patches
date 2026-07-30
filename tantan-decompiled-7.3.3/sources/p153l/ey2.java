package p153l;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class ey2 {

    /* JADX INFO: renamed from: a */
    public final C16857a f96368a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC16862f f96369b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public C16859c f96370c;

    /* JADX INFO: renamed from: d */
    public final int f96371d;

    /* JADX INFO: renamed from: l.ey2$a */
    public static class C16857a implements mke0 {

        /* JADX INFO: renamed from: a */
        public final InterfaceC16860d f96372a;

        /* JADX INFO: renamed from: b */
        public final long f96373b;

        /* JADX INFO: renamed from: c */
        public final long f96374c;

        /* JADX INFO: renamed from: d */
        public final long f96375d;

        /* JADX INFO: renamed from: e */
        public final long f96376e;

        /* JADX INFO: renamed from: f */
        public final long f96377f;

        /* JADX INFO: renamed from: g */
        public final long f96378g;

        public C16857a(InterfaceC16860d interfaceC16860d, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f96372a = interfaceC16860d;
            this.f96373b = j;
            this.f96374c = j2;
            this.f96375d = j3;
            this.f96376e = j4;
            this.f96377f = j5;
            this.f96378g = j6;
        }

        @Override // p153l.mke0
        /* JADX INFO: renamed from: d */
        public mke0.C18640a mo107791d(long j) {
            return new mke0.C18640a(new oke0(j, C16859c.m123151h(this.f96372a.mo123143a(j), this.f96374c, this.f96375d, this.f96376e, this.f96377f, this.f96378g)));
        }

        @Override // p153l.mke0
        /* JADX INFO: renamed from: e */
        public boolean mo107792e() {
            return true;
        }

        @Override // p153l.mke0
        /* JADX INFO: renamed from: i */
        public long mo107793i() {
            return this.f96373b;
        }

        /* JADX INFO: renamed from: k */
        public long m123142k(long j) {
            return this.f96372a.mo123143a(j);
        }
    }

    /* JADX INFO: renamed from: l.ey2$c */
    public static class C16859c {

        /* JADX INFO: renamed from: a */
        public final long f96379a;

        /* JADX INFO: renamed from: b */
        public final long f96380b;

        /* JADX INFO: renamed from: c */
        public final long f96381c;

        /* JADX INFO: renamed from: d */
        public long f96382d;

        /* JADX INFO: renamed from: e */
        public long f96383e;

        /* JADX INFO: renamed from: f */
        public long f96384f;

        /* JADX INFO: renamed from: g */
        public long f96385g;

        /* JADX INFO: renamed from: h */
        public long f96386h;

        public C16859c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f96379a = j;
            this.f96380b = j2;
            this.f96382d = j3;
            this.f96383e = j4;
            this.f96384f = j5;
            this.f96385g = j6;
            this.f96381c = j7;
            this.f96386h = m123151h(j2, j3, j4, j5, j6, j7);
        }

        /* JADX INFO: renamed from: h */
        public static long m123151h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return bmk0.m105164r(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* JADX INFO: renamed from: i */
        public final long m123152i() {
            return this.f96385g;
        }

        /* JADX INFO: renamed from: j */
        public final long m123153j() {
            return this.f96384f;
        }

        /* JADX INFO: renamed from: k */
        public final long m123154k() {
            return this.f96386h;
        }

        /* JADX INFO: renamed from: l */
        public final long m123155l() {
            return this.f96379a;
        }

        /* JADX INFO: renamed from: m */
        public final long m123156m() {
            return this.f96380b;
        }

        /* JADX INFO: renamed from: n */
        public final void m123157n() {
            this.f96386h = m123151h(this.f96380b, this.f96382d, this.f96383e, this.f96384f, this.f96385g, this.f96381c);
        }

        /* JADX INFO: renamed from: o */
        public final void m123158o(long j, long j2) {
            this.f96383e = j;
            this.f96385g = j2;
            m123157n();
        }

        /* JADX INFO: renamed from: p */
        public final void m123159p(long j, long j2) {
            this.f96382d = j;
            this.f96384f = j2;
            m123157n();
        }
    }

    /* JADX INFO: renamed from: l.ey2$d */
    public interface InterfaceC16860d {
        /* JADX INFO: renamed from: a */
        long mo123143a(long j);
    }

    /* JADX INFO: renamed from: l.ey2$e */
    public static final class C16861e {

        /* JADX INFO: renamed from: d */
        public static final C16861e f96387d = new C16861e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a */
        public final int f96388a;

        /* JADX INFO: renamed from: b */
        public final long f96389b;

        /* JADX INFO: renamed from: c */
        public final long f96390c;

        public C16861e(int i, long j, long j2) {
            this.f96388a = i;
            this.f96389b = j;
            this.f96390c = j2;
        }

        /* JADX INFO: renamed from: d */
        public static C16861e m123163d(long j, long j2) {
            return new C16861e(-1, j, j2);
        }

        /* JADX INFO: renamed from: e */
        public static C16861e m123164e(long j) {
            return new C16861e(0, -9223372036854775807L, j);
        }

        /* JADX INFO: renamed from: f */
        public static C16861e m123165f(long j, long j2) {
            return new C16861e(-2, j, j2);
        }
    }

    public ey2(InterfaceC16860d interfaceC16860d, InterfaceC16862f interfaceC16862f, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f96369b = interfaceC16862f;
        this.f96371d = i;
        this.f96368a = new C16857a(interfaceC16860d, j, j2, j3, j4, j5, j6);
    }

    /* JADX INFO: renamed from: a */
    public C16859c m123128a(long j) {
        return new C16859c(j, this.f96368a.m123142k(j), this.f96368a.f96374c, this.f96368a.f96375d, this.f96368a.f96376e, this.f96368a.f96377f, this.f96368a.f96378g);
    }

    /* JADX INFO: renamed from: b */
    public final mke0 m123129b() {
        return this.f96368a;
    }

    /* JADX INFO: renamed from: c */
    public int m123130c(asf asfVar, ll80 ll80Var) throws IOException {
        while (true) {
            C16859c c16859c = (C16859c) w11.m204373i(this.f96370c);
            long jM123153j = c16859c.m123153j();
            long jM123152i = c16859c.m123152i();
            long jM123154k = c16859c.m123154k();
            if (jM123152i - jM123153j <= this.f96371d) {
                m123132e(false, jM123153j);
                return m123134g(asfVar, jM123153j, ll80Var);
            }
            if (!m123136i(asfVar, jM123154k)) {
                return m123134g(asfVar, jM123154k, ll80Var);
            }
            asfVar.mo99902h();
            C16861e c16861eMo123166a = this.f96369b.mo123166a(asfVar, c16859c.m123156m());
            int i = c16861eMo123166a.f96388a;
            if (i == -3) {
                m123132e(false, jM123154k);
                return m123134g(asfVar, jM123154k, ll80Var);
            }
            if (i == -2) {
                c16859c.m123159p(c16861eMo123166a.f96389b, c16861eMo123166a.f96390c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        wtq0.m207906a("Invalid case");
                        return 0;
                    }
                    m123136i(asfVar, c16861eMo123166a.f96390c);
                    m123132e(true, c16861eMo123166a.f96390c);
                    return m123134g(asfVar, c16861eMo123166a.f96390c, ll80Var);
                }
                c16859c.m123158o(c16861eMo123166a.f96389b, c16861eMo123166a.f96390c);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m123131d() {
        return this.f96370c != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m123132e(boolean z, long j) {
        this.f96370c = null;
        this.f96369b.mo123167b();
        m123133f(z, j);
    }

    /* JADX INFO: renamed from: g */
    public final int m123134g(asf asfVar, long j, ll80 ll80Var) {
        if (j == asfVar.getPosition()) {
            return 0;
        }
        ll80Var.f132534a = j;
        return 1;
    }

    /* JADX INFO: renamed from: h */
    public final void m123135h(long j) {
        C16859c c16859c = this.f96370c;
        if (c16859c == null || c16859c.m123155l() != j) {
            this.f96370c = m123128a(j);
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m123136i(asf asfVar, long j) throws IOException {
        long position = j - asfVar.getPosition();
        if (position < 0 || position > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        asfVar.mo99905o((int) position);
        return true;
    }

    /* JADX INFO: renamed from: l.ey2$f */
    public interface InterfaceC16862f {
        /* JADX INFO: renamed from: a */
        C16861e mo123166a(asf asfVar, long j) throws IOException;

        /* JADX INFO: renamed from: b */
        default void mo123167b() {
        }
    }

    /* JADX INFO: renamed from: l.ey2$b */
    public static final class C16858b implements InterfaceC16860d {
        @Override // p153l.ey2.InterfaceC16860d
        /* JADX INFO: renamed from: a */
        public long mo123143a(long j) {
            return j;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m123133f(boolean z, long j) {
    }
}
