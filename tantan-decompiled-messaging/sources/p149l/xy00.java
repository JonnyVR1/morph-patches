package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class xy00 implements dse {

    /* JADX INFO: renamed from: a */
    public final d860 f194986a;

    /* JADX INFO: renamed from: b */
    public final yy00.C21578a f194987b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f194988c;

    /* JADX INFO: renamed from: d */
    public m6j0 f194989d;

    /* JADX INFO: renamed from: e */
    public String f194990e;

    /* JADX INFO: renamed from: f */
    public int f194991f;

    /* JADX INFO: renamed from: g */
    public int f194992g;

    /* JADX INFO: renamed from: h */
    public boolean f194993h;

    /* JADX INFO: renamed from: i */
    public boolean f194994i;

    /* JADX INFO: renamed from: j */
    public long f194995j;

    /* JADX INFO: renamed from: k */
    public int f194996k;

    /* JADX INFO: renamed from: l */
    public long f194997l;

    public xy00(@Nullable String str) {
        this.f194991f = 0;
        d860 d860Var = new d860(4);
        this.f194986a = d860Var;
        d860Var.m110299e()[0] = -1;
        this.f194987b = new yy00.C21578a();
        this.f194997l = -9223372036854775807L;
        this.f194988c = str;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: a */
    public void mo95480a(d860 d860Var) {
        p11.m167015i(this.f194989d);
        while (d860Var.m110295a() > 0) {
            int i = this.f194991f;
            if (i == 0) {
                m211655f(d860Var);
            } else if (i == 1) {
                m211657h(d860Var);
            } else {
                if (i != 2) {
                    ohg0.m164364a();
                    return;
                }
                m211656g(d860Var);
            }
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: b */
    public void mo95481b() {
        this.f194991f = 0;
        this.f194992g = 0;
        this.f194994i = false;
        this.f194997l = -9223372036854775807L;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: d */
    public void mo95483d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f194997l = j;
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: e */
    public void mo95484e(uqf uqfVar, fbj0.C16793d c16793d) {
        c16793d.m120357a();
        this.f194990e = c16793d.m120358b();
        this.f194989d = uqfVar.mo11362b(c16793d.m120359c(), 1);
    }

    /* JADX INFO: renamed from: f */
    public final void m211655f(d860 d860Var) {
        byte[] bArrM110299e = d860Var.m110299e();
        int iM110301g = d860Var.m110301g();
        for (int iM110300f = d860Var.m110300f(); iM110300f < iM110301g; iM110300f++) {
            byte b = bArrM110299e[iM110300f];
            boolean z = (b & 255) == 255;
            boolean z2 = this.f194994i && (b & 224) == 224;
            this.f194994i = z;
            if (z2) {
                d860Var.m110292U(iM110300f + 1);
                this.f194994i = false;
                this.f194986a.m110299e()[1] = bArrM110299e[iM110300f];
                this.f194992g = 2;
                this.f194991f = 1;
                return;
            }
        }
        d860Var.m110292U(iM110301g);
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: g */
    public final void m211656g(d860 d860Var) {
        int iMin = Math.min(d860Var.m110295a(), this.f194996k - this.f194992g);
        this.f194989d.m153238d(d860Var, iMin);
        int i = this.f194992g + iMin;
        this.f194992g = i;
        int i2 = this.f194996k;
        if (i < i2) {
            return;
        }
        long j = this.f194997l;
        if (j != -9223372036854775807L) {
            this.f194989d.mo11109a(j, 1, i2, 0, null);
            this.f194997l += this.f194995j;
        }
        this.f194992g = 0;
        this.f194991f = 0;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: h */
    public final void m211657h(d860 d860Var) {
        int iMin = Math.min(d860Var.m110295a(), 4 - this.f194992g);
        d860Var.m110306l(this.f194986a.m110299e(), this.f194992g, iMin);
        int i = this.f194992g + iMin;
        this.f194992g = i;
        if (i < 4) {
            return;
        }
        this.f194986a.m110292U(0);
        if (!this.f194987b.m216510a(this.f194986a.m110311q())) {
            this.f194992g = 0;
            this.f194991f = 1;
            return;
        }
        yy00.C21578a c21578a = this.f194987b;
        this.f194996k = c21578a.f200701c;
        if (!this.f194993h) {
            this.f194995j = (((long) c21578a.f200705g) * 1000000) / ((long) c21578a.f200702d);
            this.f194989d.mo11110b(new C1871k.b().m10334U(this.f194990e).m10346g0(this.f194987b.f200700b).m10338Y(4096).m10323J(this.f194987b.f200703e).m10347h0(this.f194987b.f200702d).m10337X(this.f194988c).m10320G());
            this.f194993h = true;
        }
        this.f194986a.m110292U(0);
        this.f194989d.m153238d(this.f194986a, 4);
        this.f194991f = 2;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: c */
    public void mo95482c() {
    }

    public xy00() {
        this(null);
    }
}
