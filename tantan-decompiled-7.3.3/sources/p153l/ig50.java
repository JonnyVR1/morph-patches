package p153l;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class ig50 implements zrf {

    /* JADX INFO: renamed from: d */
    public static final esf f114747d = new esf() { // from class: l.hg50
        @Override // p153l.esf
        /* JADX INFO: renamed from: b */
        public final zrf[] mo96504b() {
            return ig50.m139785c();
        }
    };

    /* JADX INFO: renamed from: a */
    public bsf f114748a;

    /* JADX INFO: renamed from: b */
    public v7g0 f114749b;

    /* JADX INFO: renamed from: c */
    public boolean f114750c;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ zrf[] m139785c() {
        return new zrf[]{new ig50()};
    }

    /* JADX INFO: renamed from: d */
    public static ig60 m139786d(ig60 ig60Var) {
        ig60Var.m139808U(0);
        return ig60Var;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        v7g0 v7g0Var = this.f114749b;
        if (v7g0Var != null) {
            v7g0Var.m200202m(j, j2);
        }
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public void mo11030b(bsf bsfVar) {
        this.f114748a = bsfVar;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* JADX INFO: renamed from: e */
    public final boolean m139787e(asf asfVar) throws IOException {
        lg50 lg50Var = new lg50();
        if (lg50Var.m154060a(asfVar, true) && (lg50Var.f131932b & 2) == 2) {
            int iMin = Math.min(lg50Var.f131939i, 8);
            ig60 ig60Var = new ig60(iMin);
            asfVar.mo99900f(ig60Var.m139815e(), 0, iMin);
            if (vri.m202501p(m139786d(ig60Var))) {
                this.f114749b = new vri();
            } else if (bnp0.m105602r(m139786d(ig60Var))) {
                this.f114749b = new bnp0();
            } else if (v560.m199774o(m139786d(ig60Var))) {
                this.f114749b = new v560();
            }
            return true;
        }
        return false;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: f */
    public boolean mo11031f(asf asfVar) throws IOException {
        try {
            return m139787e(asfVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public int mo11032h(asf asfVar, ll80 ll80Var) throws IOException {
        w11.m204373i(this.f114748a);
        if (this.f114749b == null) {
            if (!m139787e(asfVar)) {
                throw ParserException.createForMalformedContainer("Failed to determine bitstream type", null);
            }
            asfVar.mo99902h();
        }
        if (!this.f114750c) {
            qfj0 qfj0VarMo11416b = this.f114748a.mo11416b(0, 1);
            this.f114748a.mo11425l();
            this.f114749b.m200197d(this.f114748a, qfj0VarMo11416b);
            this.f114750c = true;
        }
        return this.f114749b.m200198g(asfVar, ll80Var);
    }

    @Override // p153l.zrf
    public void release() {
    }
}
