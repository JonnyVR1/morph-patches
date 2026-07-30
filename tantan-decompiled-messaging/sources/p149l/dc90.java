package p149l;

import com.immomo.molive.apm.cpu.CpuUtils;

/* JADX INFO: loaded from: classes7.dex */
public class dc90 {

    /* JADX INFO: renamed from: a */
    public long f85375a;

    /* JADX INFO: renamed from: b */
    public long f85376b;

    /* JADX INFO: renamed from: c */
    public long f85377c;

    /* JADX INFO: renamed from: d */
    public long f85378d;

    /* JADX INFO: renamed from: e */
    public long f85379e;

    /* JADX INFO: renamed from: f */
    public int f85380f;

    /* JADX INFO: renamed from: g */
    public long f85381g;

    /* JADX INFO: renamed from: h */
    public String f85382h = "";

    /* JADX INFO: renamed from: i */
    public String f85383i = "";

    /* JADX INFO: renamed from: j */
    public String f85384j = "";

    /* JADX INFO: renamed from: k */
    public String f85385k = "";

    /* JADX INFO: renamed from: l */
    public boolean f85386l = true;

    /* JADX INFO: renamed from: a */
    public long m110672a() {
        return this.f85376b + this.f85377c;
    }

    /* JADX INFO: renamed from: b */
    public long m110673b() {
        return m110672a() * CpuUtils.INSTANCE.m18547j();
    }

    public String toString() {
        return "ProcStatSummary(sampleWallTime=" + this.f85375a + ", pid='" + this.f85382h + "', name='" + this.f85383i + "', state='" + this.f85384j + "', utime=" + this.f85376b + ", stime=" + this.f85377c + ", cutime=" + this.f85378d + ", cstime=" + this.f85379e + ", nice='" + this.f85385k + "', numThreads=" + this.f85380f + ", vsize=" + this.f85381g + ", totalUsedCpuTime=" + m110672a() + ", totalUsedCpuTimeMs=" + m110673b() + ')';
    }
}
