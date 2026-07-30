package p153l;

import com.google.android.exoplayer2.C1894k;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class mdm implements hte {

    /* JADX INFO: renamed from: b */
    public qfj0 f136390b;

    /* JADX INFO: renamed from: c */
    public boolean f136391c;

    /* JADX INFO: renamed from: e */
    public int f136393e;

    /* JADX INFO: renamed from: f */
    public int f136394f;

    /* JADX INFO: renamed from: a */
    public final ig60 f136389a = new ig60(10);

    /* JADX INFO: renamed from: d */
    public long f136392d = -9223372036854775807L;

    @Override // p153l.hte
    /* JADX INFO: renamed from: a */
    public void mo108399a(ig60 ig60Var) {
        w11.m204373i(this.f136390b);
        if (this.f136391c) {
            int iM139811a = ig60Var.m139811a();
            int i = this.f136394f;
            if (i < 10) {
                int iMin = Math.min(iM139811a, 10 - i);
                System.arraycopy(ig60Var.m139815e(), ig60Var.m139816f(), this.f136389a.m139815e(), this.f136394f, iMin);
                if (this.f136394f + iMin == 10) {
                    this.f136389a.m139808U(0);
                    if (73 != this.f136389a.m139795H() || 68 != this.f136389a.m139795H() || 51 != this.f136389a.m139795H()) {
                        kyv.m152151i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f136391c = false;
                        return;
                    } else {
                        this.f136389a.m139809V(3);
                        this.f136393e = this.f136389a.m139794G() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iM139811a, this.f136393e - this.f136394f);
            this.f136390b.m176370d(ig60Var, iMin2);
            this.f136394f += iMin2;
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: b */
    public void mo108400b() {
        this.f136391c = false;
        this.f136392d = -9223372036854775807L;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: c */
    public void mo108401c() {
        int i;
        w11.m204373i(this.f136390b);
        if (this.f136391c && (i = this.f136393e) != 0 && this.f136394f == i) {
            long j = this.f136392d;
            if (j != -9223372036854775807L) {
                this.f136390b.mo11163a(j, 1, i, 0, null);
            }
            this.f136391c = false;
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: d */
    public void mo108402d(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f136391c = true;
        if (j != -9223372036854775807L) {
            this.f136392d = j;
        }
        this.f136393e = 0;
        this.f136394f = 0;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: e */
    public void mo108403e(bsf bsfVar, jkj0.C17969d c17969d) {
        c17969d.m145854a();
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(c17969d.m145856c(), 5);
        this.f136390b = qfj0VarMo11416b;
        qfj0VarMo11416b.mo11164b(new C1894k.b().m10388U(c17969d.m145855b()).m10400g0("application/id3").m10374G());
    }
}
