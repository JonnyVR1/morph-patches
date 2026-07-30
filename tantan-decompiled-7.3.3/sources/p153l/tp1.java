package p153l;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class tp1 implements zrf {

    /* JADX INFO: renamed from: c */
    public int f175533c;

    /* JADX INFO: renamed from: e */
    public up1 f175535e;

    /* JADX INFO: renamed from: h */
    public long f175538h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public s45 f175539i;

    /* JADX INFO: renamed from: m */
    public int f175543m;

    /* JADX INFO: renamed from: n */
    public boolean f175544n;

    /* JADX INFO: renamed from: a */
    public final ig60 f175531a = new ig60(12);

    /* JADX INFO: renamed from: b */
    public final C20366c f175532b = new C20366c();

    /* JADX INFO: renamed from: d */
    public bsf f175534d = new qfe();

    /* JADX INFO: renamed from: g */
    public s45[] f175537g = new s45[0];

    /* JADX INFO: renamed from: k */
    public long f175541k = -1;

    /* JADX INFO: renamed from: l */
    public long f175542l = -1;

    /* JADX INFO: renamed from: j */
    public int f175540j = -1;

    /* JADX INFO: renamed from: f */
    public long f175536f = -9223372036854775807L;

    /* JADX INFO: renamed from: l.tp1$b */
    public class C20365b implements mke0 {

        /* JADX INFO: renamed from: a */
        public final long f175545a;

        public C20365b(long j) {
            this.f175545a = j;
        }

        @Override // p153l.mke0
        /* JADX INFO: renamed from: d */
        public mke0.C18640a mo107791d(long j) {
            mke0.C18640a c18640aM184442i = tp1.this.f175537g[0].m184442i(j);
            for (int i = 1; i < tp1.this.f175537g.length; i++) {
                mke0.C18640a c18640aM184442i2 = tp1.this.f175537g[i].m184442i(j);
                if (c18640aM184442i2.f137283a.f147752b < c18640aM184442i.f137283a.f147752b) {
                    c18640aM184442i = c18640aM184442i2;
                }
            }
            return c18640aM184442i;
        }

        @Override // p153l.mke0
        /* JADX INFO: renamed from: e */
        public boolean mo107792e() {
            return true;
        }

        @Override // p153l.mke0
        /* JADX INFO: renamed from: i */
        public long mo107793i() {
            return this.f175545a;
        }
    }

    /* JADX INFO: renamed from: l.tp1$c */
    public static class C20366c {

        /* JADX INFO: renamed from: a */
        public int f175547a;

        /* JADX INFO: renamed from: b */
        public int f175548b;

        /* JADX INFO: renamed from: c */
        public int f175549c;

        public C20366c() {
        }

        /* JADX INFO: renamed from: a */
        public void m192109a(ig60 ig60Var) {
            this.f175547a = ig60Var.m139831u();
            this.f175548b = ig60Var.m139831u();
            this.f175549c = 0;
        }

        /* JADX INFO: renamed from: b */
        public void m192110b(ig60 ig60Var) throws ParserException {
            m192109a(ig60Var);
            if (this.f175547a == 1414744396) {
                this.f175549c = ig60Var.m139831u();
            } else {
                throw ParserException.createForMalformedContainer("LIST expected, found: " + this.f175547a, null);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m192101d(asf asfVar) throws IOException {
        if ((asfVar.getPosition() & 1) == 1) {
            asfVar.mo99905o(1);
        }
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        this.f175538h = -1L;
        this.f175539i = null;
        for (s45 s45Var : this.f175537g) {
            s45Var.m184448o(j);
        }
        if (j != 0) {
            this.f175533c = 6;
        } else if (this.f175537g.length == 0) {
            this.f175533c = 0;
        } else {
            this.f175533c = 3;
        }
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public void mo11030b(bsf bsfVar) {
        this.f175533c = 0;
        this.f175534d = bsfVar;
        this.f175538h = -1L;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final s45 m192102e(int i) {
        for (s45 s45Var : this.f175537g) {
            if (s45Var.m184443j(i)) {
                return s45Var;
            }
        }
        return null;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: f */
    public boolean mo11031f(asf asfVar) throws IOException {
        asfVar.mo99900f(this.f175531a.m139815e(), 0, 12);
        this.f175531a.m139808U(0);
        if (this.f175531a.m139831u() != 1179011410) {
            return false;
        }
        this.f175531a.m139809V(4);
        return this.f175531a.m139831u() == 541677121;
    }

    /* JADX INFO: renamed from: g */
    public final void m192103g(ig60 ig60Var) throws IOException {
        xor xorVarM212481c = xor.m212481c(1819436136, ig60Var);
        if (xorVarM212481c.getType() != 1819436136) {
            throw ParserException.createForMalformedContainer("Unexpected header list type " + xorVarM212481c.getType(), null);
        }
        up1 up1Var = (up1) xorVarM212481c.m212482b(up1.class);
        if (up1Var == null) {
            throw ParserException.createForMalformedContainer("AviHeader not found", null);
        }
        this.f175535e = up1Var;
        this.f175536f = ((long) up1Var.f180205c) * ((long) up1Var.f180203a);
        ArrayList arrayList = new ArrayList();
        gyj0<sp1> it = xorVarM212481c.f195595a.iterator();
        int i = 0;
        while (it.hasNext()) {
            sp1 next = it.next();
            if (next.getType() == 1819440243) {
                int i2 = i + 1;
                s45 s45VarM192106k = m192106k((xor) next, i);
                if (s45VarM192106k != null) {
                    arrayList.add(s45VarM192106k);
                }
                i = i2;
            }
        }
        this.f175537g = (s45[]) arrayList.toArray(new s45[0]);
        this.f175534d.mo11425l();
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public int mo11032h(asf asfVar, ll80 ll80Var) throws IOException {
        if (m192108m(asfVar, ll80Var)) {
            return 1;
        }
        switch (this.f175533c) {
            case 0:
                if (!mo11031f(asfVar)) {
                    throw ParserException.createForMalformedContainer("AVI Header List not found", null);
                }
                asfVar.mo99905o(12);
                this.f175533c = 1;
                return 0;
            case 1:
                asfVar.readFully(this.f175531a.m139815e(), 0, 12);
                this.f175531a.m139808U(0);
                this.f175532b.m192110b(this.f175531a);
                C20366c c20366c = this.f175532b;
                if (c20366c.f175549c == 1819436136) {
                    this.f175540j = c20366c.f175548b;
                    this.f175533c = 2;
                    return 0;
                }
                throw ParserException.createForMalformedContainer("hdrl expected, found: " + this.f175532b.f175549c, null);
            case 2:
                int i = this.f175540j - 4;
                ig60 ig60Var = new ig60(i);
                asfVar.readFully(ig60Var.m139815e(), 0, i);
                m192103g(ig60Var);
                this.f175533c = 3;
                return 0;
            case 3:
                if (this.f175541k != -1) {
                    long position = asfVar.getPosition();
                    long j = this.f175541k;
                    if (position != j) {
                        this.f175538h = j;
                        return 0;
                    }
                }
                asfVar.mo99900f(this.f175531a.m139815e(), 0, 12);
                asfVar.mo99902h();
                this.f175531a.m139808U(0);
                this.f175532b.m192109a(this.f175531a);
                int iM139831u = this.f175531a.m139831u();
                int i2 = this.f175532b.f175547a;
                if (i2 == 1179011410) {
                    asfVar.mo99905o(12);
                    return 0;
                }
                if (i2 != 1414744396 || iM139831u != 1769369453) {
                    this.f175538h = asfVar.getPosition() + ((long) this.f175532b.f175548b) + 8;
                    return 0;
                }
                long position2 = asfVar.getPosition();
                this.f175541k = position2;
                this.f175542l = position2 + ((long) this.f175532b.f175548b) + 8;
                if (!this.f175544n) {
                    if (((up1) w11.m204369e(this.f175535e)).m197036a()) {
                        this.f175533c = 4;
                        this.f175538h = this.f175542l;
                        return 0;
                    }
                    this.f175534d.mo11424k(new mke0.C18641b(this.f175536f));
                    this.f175544n = true;
                }
                this.f175538h = asfVar.getPosition() + 12;
                this.f175533c = 6;
                return 0;
            case 4:
                asfVar.readFully(this.f175531a.m139815e(), 0, 8);
                this.f175531a.m139808U(0);
                int iM139831u2 = this.f175531a.m139831u();
                int iM139831u3 = this.f175531a.m139831u();
                if (iM139831u2 == 829973609) {
                    this.f175533c = 5;
                    this.f175543m = iM139831u3;
                } else {
                    this.f175538h = asfVar.getPosition() + ((long) iM139831u3);
                }
                return 0;
            case 5:
                ig60 ig60Var2 = new ig60(this.f175543m);
                asfVar.readFully(ig60Var2.m139815e(), 0, this.f175543m);
                m192104i(ig60Var2);
                this.f175533c = 6;
                this.f175538h = this.f175541k;
                return 0;
            case 6:
                return m192107l(asfVar);
            default:
                aqg0.m99478a();
                return 0;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m192104i(ig60 ig60Var) {
        long jM192105j = m192105j(ig60Var);
        while (ig60Var.m139811a() >= 16) {
            int iM139831u = ig60Var.m139831u();
            int iM139831u2 = ig60Var.m139831u();
            long jM139831u = ((long) ig60Var.m139831u()) + jM192105j;
            ig60Var.m139831u();
            s45 s45VarM192102e = m192102e(iM139831u);
            if (s45VarM192102e != null) {
                if ((iM139831u2 & 16) == 16) {
                    s45VarM192102e.m184436b(jM139831u);
                }
                s45VarM192102e.m184444k();
            }
        }
        for (s45 s45Var : this.f175537g) {
            s45Var.m184437c();
        }
        this.f175544n = true;
        this.f175534d.mo11424k(new C20365b(this.f175536f));
    }

    /* JADX INFO: renamed from: j */
    public final long m192105j(ig60 ig60Var) {
        if (ig60Var.m139811a() < 16) {
            return 0L;
        }
        int iM139816f = ig60Var.m139816f();
        ig60Var.m139809V(8);
        long jM139831u = ig60Var.m139831u();
        long j = this.f175541k;
        long j2 = jM139831u <= j ? j + 8 : 0L;
        ig60Var.m139808U(iM139816f);
        return j2;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final s45 m192106k(xor xorVar, int i) {
        vp1 vp1Var = (vp1) xorVar.m212482b(vp1.class);
        l7g0 l7g0Var = (l7g0) xorVar.m212482b(l7g0.class);
        if (vp1Var == null) {
            kyv.m152151i("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (l7g0Var == null) {
            kyv.m152151i("AviExtractor", "Missing Stream Format");
            return null;
        }
        long jM202185a = vp1Var.m202185a();
        C1894k c1894k = l7g0Var.f130344a;
        C1894k.b bVarM10336b = c1894k.m10336b();
        bVarM10336b.m10387T(i);
        int i2 = vp1Var.f185204f;
        if (i2 != 0) {
            bVarM10336b.m10392Y(i2);
        }
        p7g0 p7g0Var = (p7g0) xorVar.m212482b(p7g0.class);
        if (p7g0Var != null) {
            bVarM10336b.m10390W(p7g0Var.f150936a);
        }
        int iM149010k = kb00.m149010k(c1894k.f7785l);
        if (iM149010k != 1 && iM149010k != 2) {
            return null;
        }
        qfj0 qfj0VarMo11416b = this.f175534d.mo11416b(i, iM149010k);
        qfj0VarMo11416b.mo11164b(bVarM10336b.m10374G());
        s45 s45Var = new s45(i, iM149010k, jM202185a, vp1Var.f185203e, qfj0VarMo11416b);
        this.f175536f = jM202185a;
        return s45Var;
    }

    /* JADX INFO: renamed from: l */
    public final int m192107l(asf asfVar) throws IOException {
        if (asfVar.getPosition() >= this.f175542l) {
            return -1;
        }
        s45 s45Var = this.f175539i;
        if (s45Var == null) {
            m192101d(asfVar);
            asfVar.mo99900f(this.f175531a.m139815e(), 0, 12);
            this.f175531a.m139808U(0);
            int iM139831u = this.f175531a.m139831u();
            ig60 ig60Var = this.f175531a;
            if (iM139831u == 1414744396) {
                ig60Var.m139808U(8);
                asfVar.mo99905o(this.f175531a.m139831u() != 1769369453 ? 8 : 12);
                asfVar.mo99902h();
                return 0;
            }
            int iM139831u2 = ig60Var.m139831u();
            if (iM139831u == 1263424842) {
                this.f175538h = asfVar.getPosition() + ((long) iM139831u2) + 8;
                return 0;
            }
            asfVar.mo99905o(8);
            asfVar.mo99902h();
            s45 s45VarM192102e = m192102e(iM139831u);
            if (s45VarM192102e == null) {
                this.f175538h = asfVar.getPosition() + ((long) iM139831u2);
                return 0;
            }
            s45VarM192102e.m184447n(iM139831u2);
            this.f175539i = s45VarM192102e;
        } else if (s45Var.m184446m(asfVar)) {
            this.f175539i = null;
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m192108m(asf asfVar, ll80 ll80Var) throws IOException {
        boolean z;
        if (this.f175538h != -1) {
            long position = asfVar.getPosition();
            long j = this.f175538h;
            if (j < position || j > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + position) {
                ll80Var.f132534a = j;
                z = true;
            } else {
                asfVar.mo99905o((int) (j - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.f175538h = -1L;
        return z;
    }

    @Override // p153l.zrf
    public void release() {
    }
}
