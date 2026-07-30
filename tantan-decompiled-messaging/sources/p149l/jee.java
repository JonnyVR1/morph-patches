package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class jee implements dse {

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f117558b;

    /* JADX INFO: renamed from: c */
    public String f117559c;

    /* JADX INFO: renamed from: d */
    public m6j0 f117560d;

    /* JADX INFO: renamed from: f */
    public int f117562f;

    /* JADX INFO: renamed from: g */
    public int f117563g;

    /* JADX INFO: renamed from: h */
    public long f117564h;

    /* JADX INFO: renamed from: i */
    public C1871k f117565i;

    /* JADX INFO: renamed from: j */
    public int f117566j;

    /* JADX INFO: renamed from: a */
    public final d860 f117557a = new d860(new byte[18]);

    /* JADX INFO: renamed from: e */
    public int f117561e = 0;

    /* JADX INFO: renamed from: k */
    public long f117567k = -9223372036854775807L;

    public jee(@Nullable String str) {
        this.f117558b = str;
    }

    /* JADX INFO: renamed from: f */
    private boolean m141122f(d860 d860Var, byte[] bArr, int i) {
        int iMin = Math.min(d860Var.m110295a(), i - this.f117562f);
        d860Var.m110306l(bArr, this.f117562f, iMin);
        int i2 = this.f117562f + iMin;
        this.f117562f = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: g */
    private void m141123g() {
        byte[] bArrM110299e = this.f117557a.m110299e();
        if (this.f117565i == null) {
            C1871k c1871kM145768g = kee.m145768g(bArrM110299e, this.f117559c, this.f117558b, null);
            this.f117565i = c1871kM145768g;
            this.f117560d.mo11110b(c1871kM145768g);
        }
        this.f117566j = kee.m145762a(bArrM110299e);
        this.f117564h = (int) ((((long) kee.m145767f(bArrM110299e)) * 1000000) / ((long) this.f117565i.f7762z));
    }

    /* JADX INFO: renamed from: h */
    private boolean m141124h(d860 d860Var) {
        while (d860Var.m110295a() > 0) {
            int i = this.f117563g << 8;
            this.f117563g = i;
            int iM110279H = i | d860Var.m110279H();
            this.f117563g = iM110279H;
            if (kee.m145765d(iM110279H)) {
                byte[] bArrM110299e = this.f117557a.m110299e();
                int i2 = this.f117563g;
                bArrM110299e[0] = (byte) ((i2 >> 24) & 255);
                bArrM110299e[1] = (byte) ((i2 >> 16) & 255);
                bArrM110299e[2] = (byte) ((i2 >> 8) & 255);
                bArrM110299e[3] = (byte) (i2 & 255);
                this.f117562f = 4;
                this.f117563g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: a */
    public void mo95480a(d860 d860Var) {
        p11.m167015i(this.f117560d);
        while (d860Var.m110295a() > 0) {
            int i = this.f117561e;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        ohg0.m164364a();
                        return;
                    }
                    int iMin = Math.min(d860Var.m110295a(), this.f117566j - this.f117562f);
                    this.f117560d.m153238d(d860Var, iMin);
                    int i2 = this.f117562f + iMin;
                    this.f117562f = i2;
                    int i3 = this.f117566j;
                    if (i2 == i3) {
                        long j = this.f117567k;
                        if (j != -9223372036854775807L) {
                            this.f117560d.mo11109a(j, 1, i3, 0, null);
                            this.f117567k += this.f117564h;
                        }
                        this.f117561e = 0;
                    }
                } else if (m141122f(d860Var, this.f117557a.m110299e(), 18)) {
                    m141123g();
                    this.f117557a.m110292U(0);
                    this.f117560d.m153238d(this.f117557a, 18);
                    this.f117561e = 2;
                }
            } else if (m141124h(d860Var)) {
                this.f117561e = 1;
            }
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: b */
    public void mo95481b() {
        this.f117561e = 0;
        this.f117562f = 0;
        this.f117563g = 0;
        this.f117567k = -9223372036854775807L;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: d */
    public void mo95483d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f117567k = j;
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: e */
    public void mo95484e(uqf uqfVar, fbj0.C16793d c16793d) {
        c16793d.m120357a();
        this.f117559c = c16793d.m120358b();
        this.f117560d = uqfVar.mo11362b(c16793d.m120359c(), 1);
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: c */
    public void mo95482c() {
    }
}
