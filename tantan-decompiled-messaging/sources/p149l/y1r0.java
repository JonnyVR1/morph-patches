package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class y1r0 {

    /* JADX INFO: renamed from: c */
    public boolean f195438c;

    /* JADX INFO: renamed from: e */
    public int f195440e;

    /* JADX INFO: renamed from: a */
    public x1r0 f195436a = new x1r0();

    /* JADX INFO: renamed from: b */
    public x1r0 f195437b = new x1r0();

    /* JADX INFO: renamed from: d */
    public long f195439d = -9223372036854775807L;

    /* JADX INFO: renamed from: a */
    public final float m212261a() {
        if (this.f195436a.m206762f()) {
            return (float) (1.0E9d / this.f195436a.m206757a());
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: b */
    public final int m212262b() {
        return this.f195440e;
    }

    /* JADX INFO: renamed from: c */
    public final long m212263c() {
        if (this.f195436a.m206762f()) {
            return this.f195436a.m206757a();
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: d */
    public final long m212264d() {
        if (this.f195436a.m206762f()) {
            return this.f195436a.m206758b();
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: e */
    public final void m212265e(long j) {
        this.f195436a.m206759c(j);
        if (this.f195436a.m206762f()) {
            this.f195438c = false;
        } else if (this.f195439d != -9223372036854775807L) {
            if (!this.f195438c || this.f195437b.m206761e()) {
                this.f195437b.m206760d();
                this.f195437b.m206759c(this.f195439d);
            }
            this.f195438c = true;
            this.f195437b.m206759c(j);
        }
        if (this.f195438c && this.f195437b.m206762f()) {
            x1r0 x1r0Var = this.f195436a;
            this.f195436a = this.f195437b;
            this.f195437b = x1r0Var;
            this.f195438c = false;
        }
        this.f195439d = j;
        this.f195440e = this.f195436a.m206762f() ? 0 : this.f195440e + 1;
    }

    /* JADX INFO: renamed from: f */
    public final void m212266f() {
        this.f195436a.m206760d();
        this.f195437b.m206760d();
        this.f195438c = false;
        this.f195439d = -9223372036854775807L;
        this.f195440e = 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m212267g() {
        return this.f195436a.m206762f();
    }
}
