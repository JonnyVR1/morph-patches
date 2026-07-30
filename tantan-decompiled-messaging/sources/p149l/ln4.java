package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class ln4 implements g5g0 {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque<C18265b> f128957a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<k5g0> f128958b;

    /* JADX INFO: renamed from: c */
    public final PriorityQueue<C18265b> f128959c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public C18265b f128960d;

    /* JADX INFO: renamed from: e */
    public long f128961e;

    /* JADX INFO: renamed from: f */
    public long f128962f;

    /* JADX INFO: renamed from: l.ln4$b */
    public static final class C18265b extends j5g0 implements Comparable<C18265b> {

        /* JADX INFO: renamed from: j */
        public long f128963j;

        public C18265b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public int compareTo(C18265b c18265b) {
            if (m154495p() != c18265b.m154495p()) {
                return m154495p() ? 1 : -1;
            }
            long j = this.f7377e - c18265b.f7377e;
            if (j == 0) {
                j = this.f128963j - c18265b.f128963j;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: l.ln4$c */
    public static final class C18266c extends k5g0 {

        /* JADX INFO: renamed from: f */
        public fhd.InterfaceC16832a<C18266c> f128964f;

        public C18266c(fhd.InterfaceC16832a<C18266c> interfaceC16832a) {
            this.f128964f = interfaceC16832a;
        }

        @Override // p149l.fhd
        /* JADX INFO: renamed from: u */
        public final void mo121353u() {
            this.f128964f.mo121354a(this);
        }
    }

    public ln4() {
        for (int i = 0; i < 10; i++) {
            this.f128957a.add(new C18265b());
        }
        this.f128958b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f128958b.add(new C18266c(new fhd.InterfaceC16832a() { // from class: l.kn4
                @Override // p149l.fhd.InterfaceC16832a
                /* JADX INFO: renamed from: a */
                public final void mo121354a(fhd fhdVar) {
                    this.f123858a.m150650n((ln4.C18266c) fhdVar);
                }
            }));
        }
        this.f128959c = new PriorityQueue<>();
    }

    @Override // p149l.g5g0
    /* JADX INFO: renamed from: b */
    public void mo124526b(long j) {
        this.f128961e = j;
    }

    /* JADX INFO: renamed from: e */
    public abstract e5g0 mo131851e();

    /* JADX INFO: renamed from: f */
    public abstract void mo131852f(j5g0 j5g0Var);

    @Override // p149l.bhd
    public void flush() {
        this.f128962f = 0L;
        this.f128961e = 0L;
        while (!this.f128959c.isEmpty()) {
            m150649m((C18265b) vck0.m197866j(this.f128959c.poll()));
        }
        C18265b c18265b = this.f128960d;
        if (c18265b != null) {
            m150649m(c18265b);
            this.f128960d = null;
        }
    }

    @Override // p149l.bhd
    @Nullable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public j5g0 mo101811a() throws SubtitleDecoderException {
        p11.m167013g(this.f128960d == null);
        if (this.f128957a.isEmpty()) {
            return null;
        }
        C18265b c18265bPollFirst = this.f128957a.pollFirst();
        this.f128960d = c18265bPollFirst;
        return c18265bPollFirst;
    }

    @Override // p149l.bhd
    @Nullable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public k5g0 mo101812c() throws SubtitleDecoderException {
        if (this.f128958b.isEmpty()) {
            return null;
        }
        while (!this.f128959c.isEmpty() && ((C18265b) vck0.m197866j(this.f128959c.peek())).f7377e <= this.f128961e) {
            C18265b c18265b = (C18265b) vck0.m197866j(this.f128959c.poll());
            if (c18265b.m154495p()) {
                k5g0 k5g0Var = (k5g0) vck0.m197866j(this.f128958b.pollFirst());
                k5g0Var.m154490h(4);
                m150649m(c18265b);
                return k5g0Var;
            }
            mo131852f(c18265b);
            if (mo131855k()) {
                e5g0 e5g0VarMo131851e = mo131851e();
                k5g0 k5g0Var2 = (k5g0) vck0.m197866j(this.f128958b.pollFirst());
                k5g0Var2.m144539v(c18265b.f7377e, e5g0VarMo131851e, Long.MAX_VALUE);
                m150649m(c18265b);
                return k5g0Var2;
            }
            m150649m(c18265b);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final k5g0 m150647i() {
        return this.f128958b.pollFirst();
    }

    /* JADX INFO: renamed from: j */
    public final long m150648j() {
        return this.f128961e;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo131855k();

    @Override // p149l.bhd
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo101813d(j5g0 j5g0Var) throws SubtitleDecoderException {
        p11.m167007a(j5g0Var == this.f128960d);
        C18265b c18265b = (C18265b) j5g0Var;
        if (c18265b.m154494o()) {
            m150649m(c18265b);
        } else {
            long j = this.f128962f;
            this.f128962f = 1 + j;
            c18265b.f128963j = j;
            this.f128959c.add(c18265b);
        }
        this.f128960d = null;
    }

    /* JADX INFO: renamed from: m */
    public final void m150649m(C18265b c18265b) {
        c18265b.mo9803i();
        this.f128957a.add(c18265b);
    }

    /* JADX INFO: renamed from: n */
    public void m150650n(k5g0 k5g0Var) {
        k5g0Var.mo9803i();
        this.f128958b.add(k5g0Var);
    }

    @Override // p149l.bhd
    public void release() {
    }
}
