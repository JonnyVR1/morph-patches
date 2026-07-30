package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class t0y0 {

    /* JADX INFO: renamed from: a */
    public long f167217a;

    /* JADX INFO: renamed from: b */
    public float f167218b;

    /* JADX INFO: renamed from: c */
    public long f167219c;

    public t0y0() {
        this.f167217a = -9223372036854775807L;
        this.f167218b = -3.4028235E38f;
        this.f167219c = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: d */
    public final t0y0 m186882d(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        f5v0.m119533d(z);
        this.f167219c = j;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final t0y0 m186883e(long j) {
        this.f167217a = j;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final t0y0 m186884f(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        f5v0.m119533d(z);
        this.f167218b = f;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final a1y0 m186885g() {
        return new a1y0(this, null);
    }

    public /* synthetic */ t0y0(a1y0 a1y0Var, o0y0 o0y0Var) {
        this.f167217a = a1y0Var.f67207a;
        this.f167218b = a1y0Var.f67208b;
        this.f167219c = a1y0Var.f67209c;
    }
}
