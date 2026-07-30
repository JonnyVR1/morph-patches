package p149l;

import com.google.android.gms.internal.ads.zzaff;
import com.google.android.gms.internal.ads.zzcc;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;

/* JADX INFO: loaded from: classes6.dex */
public final class e9r0 extends d9r0 {

    /* JADX INFO: renamed from: b */
    public final v6w0 f90118b;

    /* JADX INFO: renamed from: c */
    public final v6w0 f90119c;

    /* JADX INFO: renamed from: d */
    public int f90120d;

    /* JADX INFO: renamed from: e */
    public boolean f90121e;

    /* JADX INFO: renamed from: f */
    public boolean f90122f;

    /* JADX INFO: renamed from: g */
    public int f90123g;

    public e9r0(m7r0 m7r0Var) {
        super(m7r0Var);
        this.f90118b = new v6w0(quw0.f156548a);
        this.f90119c = new v6w0(4);
    }

    @Override // p149l.d9r0
    /* JADX INFO: renamed from: a */
    public final boolean mo105903a(v6w0 v6w0Var) throws zzaff {
        int iM197238B = v6w0Var.m197238B();
        int i = iM197238B >> 4;
        int i2 = iM197238B & 15;
        if (i2 == 7) {
            this.f90123g = i;
            return i != 5;
        }
        throw new zzaff("Video format not supported: " + i2);
    }

    @Override // p149l.d9r0
    /* JADX INFO: renamed from: b */
    public final boolean mo105904b(v6w0 v6w0Var, long j) throws zzcc {
        int i;
        int iM197238B = v6w0Var.m197238B();
        long jM197274w = v6w0Var.m197274w();
        if (iM197238B == 0) {
            if (!this.f90121e) {
                v6w0 v6w0Var2 = new v6w0(new byte[v6w0Var.m197268q()]);
                v6w0Var.m197258g(v6w0Var2.m197264m(), 0, v6w0Var.m197268q());
                d4r0 d4r0VarM109996a = d4r0.m109996a(v6w0Var2);
                this.f90120d = d4r0VarM109996a.f84338b;
                ter0 ter0Var = new ter0();
                ter0Var.m188618w(YtVideoEncoder.MIME_TYPE);
                ter0Var.m188607l0(d4r0VarM109996a.f84347k);
                ter0Var.m188590C(d4r0VarM109996a.f84339c);
                ter0Var.m188600i(d4r0VarM109996a.f84340d);
                ter0Var.m188614s(d4r0VarM109996a.f84346j);
                ter0Var.m188606l(d4r0VarM109996a.f84337a);
                this.f85142a.mo134531d(ter0Var.m188591D());
                this.f90121e = true;
                return false;
            }
        } else if (iM197238B == 1 && this.f90121e) {
            int i2 = this.f90123g == 1 ? 1 : 0;
            if (this.f90122f) {
                i = i2;
            } else if (i2 != 0) {
                i = 1;
            }
            byte[] bArrM197264m = this.f90119c.m197264m();
            bArrM197264m[0] = 0;
            bArrM197264m[1] = 0;
            bArrM197264m[2] = 0;
            int i3 = 4 - this.f90120d;
            int i4 = 0;
            while (v6w0Var.m197268q() > 0) {
                v6w0Var.m197258g(this.f90119c.m197264m(), i3, this.f90120d);
                this.f90119c.m197262k(0);
                v6w0 v6w0Var3 = this.f90119c;
                v6w0 v6w0Var4 = this.f90118b;
                int iM197241E = v6w0Var3.m197241E();
                v6w0Var4.m197262k(0);
                this.f85142a.mo134533f(this.f90118b, 4);
                this.f85142a.mo134533f(v6w0Var, iM197241E);
                i4 = i4 + 4 + iM197241E;
            }
            this.f85142a.mo134530c(j + (jM197274w * 1000), i, i4, 0, null);
            this.f90122f = true;
            return true;
        }
        return false;
    }
}
