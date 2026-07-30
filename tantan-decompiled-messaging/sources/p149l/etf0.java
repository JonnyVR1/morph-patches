package p149l;

import com.google.android.exoplayer2.C1930s;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class etf0 implements hix {

    /* JADX INFO: renamed from: a */
    public final p95 f93109a;

    /* JADX INFO: renamed from: b */
    public boolean f93110b;

    /* JADX INFO: renamed from: c */
    public long f93111c;

    /* JADX INFO: renamed from: d */
    public long f93112d;

    /* JADX INFO: renamed from: e */
    public C1930s f93113e = C1930s.f8247d;

    public etf0(p95 p95Var) {
        this.f93109a = p95Var;
    }

    /* JADX INFO: renamed from: a */
    public void m118083a(long j) {
        this.f93111c = j;
        if (this.f93110b) {
            this.f93112d = this.f93109a.elapsedRealtime();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m118084b() {
        if (this.f93110b) {
            return;
        }
        this.f93112d = this.f93109a.elapsedRealtime();
        this.f93110b = true;
    }

    /* JADX INFO: renamed from: c */
    public void m118085c() {
        if (this.f93110b) {
            m118083a(mo9661z());
            this.f93110b = false;
        }
    }

    @Override // p149l.hix
    public C1930s getPlaybackParameters() {
        return this.f93113e;
    }

    @Override // p149l.hix
    public void setPlaybackParameters(C1930s c1930s) {
        if (this.f93110b) {
            m118083a(mo9661z());
        }
        this.f93113e = c1930s;
    }

    @Override // p149l.hix
    /* JADX INFO: renamed from: z */
    public long mo9661z() {
        long j = this.f93111c;
        if (!this.f93110b) {
            return j;
        }
        long jElapsedRealtime = this.f93109a.elapsedRealtime() - this.f93112d;
        C1930s c1930s = this.f93113e;
        return j + (c1930s.f8251a == 1.0f ? vck0.m197806J0(jElapsedRealtime) : c1930s.m10897b(jElapsedRealtime));
    }
}
