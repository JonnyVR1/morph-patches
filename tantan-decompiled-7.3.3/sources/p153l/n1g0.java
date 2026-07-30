package p153l;

import com.google.android.exoplayer2.C1953s;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class n1g0 implements erx {

    /* JADX INFO: renamed from: a */
    public final qa5 f139757a;

    /* JADX INFO: renamed from: b */
    public boolean f139758b;

    /* JADX INFO: renamed from: c */
    public long f139759c;

    /* JADX INFO: renamed from: d */
    public long f139760d;

    /* JADX INFO: renamed from: e */
    public C1953s f139761e = C1953s.f8284d;

    public n1g0(qa5 qa5Var) {
        this.f139757a = qa5Var;
    }

    /* JADX INFO: renamed from: a */
    public void m161113a(long j) {
        this.f139759c = j;
        if (this.f139758b) {
            this.f139760d = this.f139757a.elapsedRealtime();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m161114b() {
        if (this.f139758b) {
            return;
        }
        this.f139760d = this.f139757a.elapsedRealtime();
        this.f139758b = true;
    }

    /* JADX INFO: renamed from: c */
    public void m161115c() {
        if (this.f139758b) {
            m161113a(mo9715z());
            this.f139758b = false;
        }
    }

    @Override // p153l.erx
    public C1953s getPlaybackParameters() {
        return this.f139761e;
    }

    @Override // p153l.erx
    public void setPlaybackParameters(C1953s c1953s) {
        if (this.f139758b) {
            m161113a(mo9715z());
        }
        this.f139761e = c1953s;
    }

    @Override // p153l.erx
    /* JADX INFO: renamed from: z */
    public long mo9715z() {
        long j = this.f139759c;
        if (!this.f139758b) {
            return j;
        }
        long jElapsedRealtime = this.f139757a.elapsedRealtime() - this.f139760d;
        C1953s c1953s = this.f139761e;
        return j + (c1953s.f8288a == 1.0f ? bmk0.m105084J0(jElapsedRealtime) : c1953s.m10951b(jElapsedRealtime));
    }
}
