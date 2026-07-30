package p153l;

import com.immomo.molive.apm.cpu.CpuUtils;

/* JADX INFO: loaded from: classes7.dex */
public class hk90 {

    /* JADX INFO: renamed from: a */
    public long f110388a;

    /* JADX INFO: renamed from: b */
    public long f110389b;

    /* JADX INFO: renamed from: c */
    public long f110390c;

    /* JADX INFO: renamed from: d */
    public long f110391d;

    /* JADX INFO: renamed from: e */
    public long f110392e;

    /* JADX INFO: renamed from: f */
    public int f110393f;

    /* JADX INFO: renamed from: g */
    public long f110394g;

    /* JADX INFO: renamed from: h */
    public String f110395h = "";

    /* JADX INFO: renamed from: i */
    public String f110396i = "";

    /* JADX INFO: renamed from: j */
    public String f110397j = "";

    /* JADX INFO: renamed from: k */
    public String f110398k = "";

    /* JADX INFO: renamed from: l */
    public boolean f110399l = true;

    /* JADX INFO: renamed from: a */
    public long m135619a() {
        return this.f110389b + this.f110390c;
    }

    /* JADX INFO: renamed from: b */
    public long m135620b() {
        return m135619a() * CpuUtils.INSTANCE.m19527j();
    }

    public String toString() {
        return "ProcStatSummary(sampleWallTime=" + this.f110388a + ", pid='" + this.f110395h + "', name='" + this.f110396i + "', state='" + this.f110397j + "', utime=" + this.f110389b + ", stime=" + this.f110390c + ", cutime=" + this.f110391d + ", cstime=" + this.f110392e + ", nice='" + this.f110398k + "', numThreads=" + this.f110393f + ", vsize=" + this.f110394g + ", totalUsedCpuTime=" + m135619a() + ", totalUsedCpuTimeMs=" + m135620b() + ')';
    }
}
