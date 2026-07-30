package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.h9 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C17247h9 implements dse {

    /* JADX INFO: renamed from: a */
    public final c860 f106487a;

    /* JADX INFO: renamed from: b */
    public final d860 f106488b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f106489c;

    /* JADX INFO: renamed from: d */
    public String f106490d;

    /* JADX INFO: renamed from: e */
    public m6j0 f106491e;

    /* JADX INFO: renamed from: f */
    public int f106492f;

    /* JADX INFO: renamed from: g */
    public int f106493g;

    /* JADX INFO: renamed from: h */
    public boolean f106494h;

    /* JADX INFO: renamed from: i */
    public boolean f106495i;

    /* JADX INFO: renamed from: j */
    public long f106496j;

    /* JADX INFO: renamed from: k */
    public C1871k f106497k;

    /* JADX INFO: renamed from: l */
    public int f106498l;

    /* JADX INFO: renamed from: m */
    public long f106499m;

    public C17247h9(@Nullable String str) {
        c860 c860Var = new c860(new byte[16]);
        this.f106487a = c860Var;
        this.f106488b = new d860(c860Var.f79701a);
        this.f106492f = 0;
        this.f106493g = 0;
        this.f106494h = false;
        this.f106495i = false;
        this.f106499m = -9223372036854775807L;
        this.f106489c = str;
    }

    /* JADX INFO: renamed from: f */
    private boolean m129908f(d860 d860Var, byte[] bArr, int i) {
        int iMin = Math.min(d860Var.m110295a(), i - this.f106493g);
        d860Var.m110306l(bArr, this.f106493g, iMin);
        int i2 = this.f106493g + iMin;
        this.f106493g = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: g */
    private void m129909g() {
        this.f106487a.m105672p(0);
        C17507i9.b bVarM134996d = C17507i9.m134996d(this.f106487a);
        C1871k c1871k = this.f106497k;
        if (c1871k == null || bVarM134996d.f112089c != c1871k.f7761y || bVarM134996d.f112088b != c1871k.f7762z || !"audio/ac4".equals(c1871k.f7748l)) {
            C1871k c1871kM10320G = new C1871k.b().m10334U(this.f106490d).m10346g0("audio/ac4").m10323J(bVarM134996d.f112089c).m10347h0(bVarM134996d.f112088b).m10337X(this.f106489c).m10320G();
            this.f106497k = c1871kM10320G;
            this.f106491e.mo11110b(c1871kM10320G);
        }
        this.f106498l = bVarM134996d.f112090d;
        this.f106496j = (((long) bVarM134996d.f112091e) * 1000000) / ((long) this.f106497k.f7762z);
    }

    /* JADX INFO: renamed from: h */
    private boolean m129910h(d860 d860Var) {
        while (true) {
            if (d860Var.m110295a() <= 0) {
                return false;
            }
            if (this.f106494h) {
                int iM110279H = d860Var.m110279H();
                this.f106494h = iM110279H == 172;
                if (iM110279H == 64 || iM110279H == 65) {
                    this.f106495i = iM110279H == 65;
                    return true;
                }
            } else {
                this.f106494h = d860Var.m110279H() == 172;
            }
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: a */
    public void mo95480a(d860 d860Var) {
        p11.m167015i(this.f106491e);
        while (d860Var.m110295a() > 0) {
            int i = this.f106492f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(d860Var.m110295a(), this.f106498l - this.f106493g);
                        this.f106491e.m153238d(d860Var, iMin);
                        int i2 = this.f106493g + iMin;
                        this.f106493g = i2;
                        int i3 = this.f106498l;
                        if (i2 == i3) {
                            long j = this.f106499m;
                            if (j != -9223372036854775807L) {
                                this.f106491e.mo11109a(j, 1, i3, 0, null);
                                this.f106499m += this.f106496j;
                            }
                            this.f106492f = 0;
                        }
                    }
                } else if (m129908f(d860Var, this.f106488b.m110299e(), 16)) {
                    m129909g();
                    this.f106488b.m110292U(0);
                    this.f106491e.m153238d(this.f106488b, 16);
                    this.f106492f = 2;
                }
            } else if (m129910h(d860Var)) {
                this.f106492f = 1;
                this.f106488b.m110299e()[0] = -84;
                this.f106488b.m110299e()[1] = (byte) (this.f106495i ? 65 : 64);
                this.f106493g = 2;
            }
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: b */
    public void mo95481b() {
        this.f106492f = 0;
        this.f106493g = 0;
        this.f106494h = false;
        this.f106495i = false;
        this.f106499m = -9223372036854775807L;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: d */
    public void mo95483d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f106499m = j;
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: e */
    public void mo95484e(uqf uqfVar, fbj0.C16793d c16793d) {
        c16793d.m120357a();
        this.f106490d = c16793d.m120358b();
        this.f106491e = uqfVar.mo11362b(c16793d.m120359c(), 1);
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: c */
    public void mo95482c() {
    }

    public C17247h9() {
        this(null);
    }
}
