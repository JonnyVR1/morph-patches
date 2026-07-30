package p149l;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class x5j0 {

    /* JADX INFO: renamed from: a */
    public lqd f191151a;

    /* JADX INFO: renamed from: b */
    public long f191152b;

    /* JADX INFO: renamed from: c */
    public long f191153c;

    /* JADX INFO: renamed from: d */
    public long f191154d;

    /* JADX INFO: renamed from: e */
    public int f191155e;

    /* JADX INFO: renamed from: f */
    public int f191156f;

    /* JADX INFO: renamed from: l */
    public boolean f191162l;

    /* JADX INFO: renamed from: n */
    @Nullable
    public v5j0 f191164n;

    /* JADX INFO: renamed from: p */
    public boolean f191166p;

    /* JADX INFO: renamed from: q */
    public long f191167q;

    /* JADX INFO: renamed from: r */
    public boolean f191168r;

    /* JADX INFO: renamed from: g */
    public long[] f191157g = new long[0];

    /* JADX INFO: renamed from: h */
    public int[] f191158h = new int[0];

    /* JADX INFO: renamed from: i */
    public int[] f191159i = new int[0];

    /* JADX INFO: renamed from: j */
    public long[] f191160j = new long[0];

    /* JADX INFO: renamed from: k */
    public boolean[] f191161k = new boolean[0];

    /* JADX INFO: renamed from: m */
    public boolean[] f191163m = new boolean[0];

    /* JADX INFO: renamed from: o */
    public final d860 f191165o = new d860();

    /* JADX INFO: renamed from: a */
    public void m207086a(tqf tqfVar) throws IOException {
        tqfVar.readFully(this.f191165o.m110299e(), 0, this.f191165o.m110301g());
        this.f191165o.m110292U(0);
        this.f191166p = false;
    }

    /* JADX INFO: renamed from: b */
    public void m207087b(d860 d860Var) {
        d860Var.m110306l(this.f191165o.m110299e(), 0, this.f191165o.m110301g());
        this.f191165o.m110292U(0);
        this.f191166p = false;
    }

    /* JADX INFO: renamed from: c */
    public long m207088c(int i) {
        return this.f191160j[i];
    }

    /* JADX INFO: renamed from: d */
    public void m207089d(int i) {
        this.f191165o.m110288Q(i);
        this.f191162l = true;
        this.f191166p = true;
    }

    /* JADX INFO: renamed from: e */
    public void m207090e(int i, int i2) {
        this.f191155e = i;
        this.f191156f = i2;
        if (this.f191158h.length < i) {
            this.f191157g = new long[i];
            this.f191158h = new int[i];
        }
        if (this.f191159i.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.f191159i = new int[i3];
            this.f191160j = new long[i3];
            this.f191161k = new boolean[i3];
            this.f191163m = new boolean[i3];
        }
    }

    /* JADX INFO: renamed from: f */
    public void m207091f() {
        this.f191155e = 0;
        this.f191167q = 0L;
        this.f191168r = false;
        this.f191162l = false;
        this.f191166p = false;
        this.f191164n = null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m207092g(int i) {
        return this.f191162l && this.f191163m[i];
    }
}
