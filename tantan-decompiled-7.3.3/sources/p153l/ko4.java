package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class ko4 implements odg0 {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque<C18223b> f127680a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<sdg0> f127681b;

    /* JADX INFO: renamed from: c */
    public final PriorityQueue<C18223b> f127682c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public C18223b f127683d;

    /* JADX INFO: renamed from: e */
    public long f127684e;

    /* JADX INFO: renamed from: f */
    public long f127685f;

    /* JADX INFO: renamed from: l.ko4$b */
    public static final class C18223b extends rdg0 implements Comparable<C18223b> {

        /* JADX INFO: renamed from: j */
        public long f127686j;

        public C18223b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public int compareTo(C18223b c18223b) {
            if (m97779p() != c18223b.m97779p()) {
                return m97779p() ? 1 : -1;
            }
            long j = this.f7414e - c18223b.f7414e;
            if (j == 0) {
                j = this.f127686j - c18223b.f127686j;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: l.ko4$c */
    public static final class C18224c extends sdg0 {

        /* JADX INFO: renamed from: f */
        public lid.InterfaceC18399a<C18224c> f127687f;

        public C18224c(lid.InterfaceC18399a<C18224c> interfaceC18399a) {
            this.f127687f = interfaceC18399a;
        }

        @Override // p153l.lid
        /* JADX INFO: renamed from: u */
        public final void mo150584u() {
            this.f127687f.mo146329a(this);
        }
    }

    public ko4() {
        for (int i = 0; i < 10; i++) {
            this.f127680a.add(new C18223b());
        }
        this.f127681b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f127681b.add(new C18224c(new lid.InterfaceC18399a() { // from class: l.jo4
                @Override // p153l.lid.InterfaceC18399a
                /* JADX INFO: renamed from: a */
                public final void mo146329a(lid lidVar) {
                    this.f121938a.m150581n((ko4.C18224c) lidVar);
                }
            }));
        }
        this.f127682c = new PriorityQueue<>();
    }

    @Override // p153l.odg0
    /* JADX INFO: renamed from: b */
    public void mo131055b(long j) {
        this.f127684e = j;
    }

    /* JADX INFO: renamed from: e */
    public abstract mdg0 mo131057e();

    /* JADX INFO: renamed from: f */
    public abstract void mo131058f(rdg0 rdg0Var);

    @Override // p153l.hid
    public void flush() {
        this.f127685f = 0L;
        this.f127684e = 0L;
        while (!this.f127682c.isEmpty()) {
            m150580m((C18223b) bmk0.m105144j(this.f127682c.poll()));
        }
        C18223b c18223b = this.f127683d;
        if (c18223b != null) {
            m150580m(c18223b);
            this.f127683d = null;
        }
    }

    @Override // p153l.hid
    @Nullable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public rdg0 mo135120a() throws SubtitleDecoderException {
        w11.m204371g(this.f127683d == null);
        if (this.f127680a.isEmpty()) {
            return null;
        }
        C18223b c18223bPollFirst = this.f127680a.pollFirst();
        this.f127683d = c18223bPollFirst;
        return c18223bPollFirst;
    }

    @Override // p153l.hid
    @Nullable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public sdg0 mo131056c() throws SubtitleDecoderException {
        if (this.f127681b.isEmpty()) {
            return null;
        }
        while (!this.f127682c.isEmpty() && ((C18223b) bmk0.m105144j(this.f127682c.peek())).f7414e <= this.f127684e) {
            C18223b c18223b = (C18223b) bmk0.m105144j(this.f127682c.poll());
            if (c18223b.m97779p()) {
                sdg0 sdg0Var = (sdg0) bmk0.m105144j(this.f127681b.pollFirst());
                sdg0Var.m97774h(4);
                m150580m(c18223b);
                return sdg0Var;
            }
            mo131058f(c18223b);
            if (mo131061k()) {
                mdg0 mdg0VarMo131057e = mo131057e();
                sdg0 sdg0Var2 = (sdg0) bmk0.m105144j(this.f127681b.pollFirst());
                sdg0Var2.m185463v(c18223b.f7414e, mdg0VarMo131057e, Long.MAX_VALUE);
                m150580m(c18223b);
                return sdg0Var2;
            }
            m150580m(c18223b);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final sdg0 m150578i() {
        return this.f127681b.pollFirst();
    }

    /* JADX INFO: renamed from: j */
    public final long m150579j() {
        return this.f127684e;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo131061k();

    @Override // p153l.hid
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo135121d(rdg0 rdg0Var) throws SubtitleDecoderException {
        w11.m204365a(rdg0Var == this.f127683d);
        C18223b c18223b = (C18223b) rdg0Var;
        if (c18223b.m97778o()) {
            m150580m(c18223b);
        } else {
            long j = this.f127685f;
            this.f127685f = 1 + j;
            c18223b.f127686j = j;
            this.f127682c.add(c18223b);
        }
        this.f127683d = null;
    }

    /* JADX INFO: renamed from: m */
    public final void m150580m(C18223b c18223b) {
        c18223b.mo9857i();
        this.f127680a.add(c18223b);
    }

    /* JADX INFO: renamed from: n */
    public void m150581n(sdg0 sdg0Var) {
        sdg0Var.mo9857i();
        this.f127681b.add(sdg0Var);
    }

    @Override // p153l.hid
    public void release() {
    }
}
