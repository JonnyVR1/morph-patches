package p149l;

import com.google.android.exoplayer2.C1871k;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wam implements dse {

    /* JADX INFO: renamed from: b */
    public m6j0 f185484b;

    /* JADX INFO: renamed from: c */
    public boolean f185485c;

    /* JADX INFO: renamed from: e */
    public int f185487e;

    /* JADX INFO: renamed from: f */
    public int f185488f;

    /* JADX INFO: renamed from: a */
    public final d860 f185483a = new d860(10);

    /* JADX INFO: renamed from: d */
    public long f185486d = -9223372036854775807L;

    @Override // p149l.dse
    /* JADX INFO: renamed from: a */
    public void mo95480a(d860 d860Var) {
        p11.m167015i(this.f185484b);
        if (this.f185485c) {
            int iM110295a = d860Var.m110295a();
            int i = this.f185488f;
            if (i < 10) {
                int iMin = Math.min(iM110295a, 10 - i);
                System.arraycopy(d860Var.m110299e(), d860Var.m110300f(), this.f185483a.m110299e(), this.f185488f, iMin);
                if (this.f185488f + iMin == 10) {
                    this.f185483a.m110292U(0);
                    if (73 != this.f185483a.m110279H() || 68 != this.f185483a.m110279H() || 51 != this.f185483a.m110279H()) {
                        jwv.m143689i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f185485c = false;
                        return;
                    } else {
                        this.f185483a.m110293V(3);
                        this.f185487e = this.f185483a.m110278G() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iM110295a, this.f185487e - this.f185488f);
            this.f185484b.m153238d(d860Var, iMin2);
            this.f185488f += iMin2;
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: b */
    public void mo95481b() {
        this.f185485c = false;
        this.f185486d = -9223372036854775807L;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: c */
    public void mo95482c() {
        int i;
        p11.m167015i(this.f185484b);
        if (this.f185485c && (i = this.f185487e) != 0 && this.f185488f == i) {
            long j = this.f185486d;
            if (j != -9223372036854775807L) {
                this.f185484b.mo11109a(j, 1, i, 0, null);
            }
            this.f185485c = false;
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: d */
    public void mo95483d(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f185485c = true;
        if (j != -9223372036854775807L) {
            this.f185486d = j;
        }
        this.f185487e = 0;
        this.f185488f = 0;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: e */
    public void mo95484e(uqf uqfVar, fbj0.C16793d c16793d) {
        c16793d.m120357a();
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(c16793d.m120359c(), 5);
        this.f185484b = m6j0VarMo11362b;
        m6j0VarMo11362b.mo11110b(new C1871k.b().m10334U(c16793d.m120358b()).m10346g0("application/id3").m10320G());
    }
}
