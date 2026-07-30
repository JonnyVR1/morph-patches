package p149l;

import android.os.Build;
import android.os.SystemClock;
import com.immomo.molive.apm.cpu.CpuUtils;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010&\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, m87232d2 = {"Ll/asb;", "Ll/mr2;", "Ll/nrb;", "Ll/vh2;", "cpuConfig", "<init>", "(Ll/vh2;)V", "", "sampleIntervalMs", "Lkotlin/Pair;", "Ll/zrb;", "h", "(J)Lkotlin/Pair;", "j", "()Ll/nrb;", "", RXScreenCaptureService.KEY_INDEX, "()Z", "", "g", "()V", "Ljava/text/DecimalFormat;", "e", "Ljava/text/DecimalFormat;", "getDf", "()Ljava/text/DecimalFormat;", "df", "f", "J", "getLastSampleTs", "()J", "setLastSampleTs", "(J)V", "lastSampleTs", "Z", "getCpuTracerEnable", "setCpuTracerEnable", "(Z)V", "cpuTracerEnable", "Ll/nrb;", "cupUsageInfo", "Ll/vh2;", "getCpuConfig", "()Ll/vh2;", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class asb extends mr2<nrb> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final DecimalFormat df;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long lastSampleTs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean cpuTracerEnable;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final nrb cupUsageInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final vh2 cpuConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asb(@NotNull vh2 vh2Var) {
        super(vh2Var);
        vh2Var.getClass();
        this.cpuConfig = vh2Var;
        this.df = new DecimalFormat("#.#");
        this.cpuTracerEnable = true;
        this.cupUsageInfo = new nrb(0.0f, 0.0f, 0);
    }

    /* JADX INFO: renamed from: h */
    private final Pair<zrb, zrb> m98586h(long sampleIntervalMs) {
        if (Build.VERSION.SDK_INT < 26) {
            return CpuUtils.INSTANCE.m18542e();
        }
        CpuUtils cpuUtils = CpuUtils.INSTANCE;
        return new Pair<>(cpuUtils.m18543f(sampleIntervalMs), cpuUtils.m18545h());
    }

    @Override // p149l.mr2
    /* JADX INFO: renamed from: g */
    public void mo18569g() {
        super.mo18569g();
        this.lastSampleTs = 0L;
        this.cupUsageInfo.m160736f(0.0f);
        this.cupUsageInfo.m160734d(0.0f);
        this.cpuTracerEnable = true;
        urb.INSTANCE.m195071l();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public boolean getCpuTracerEnable() {
        return this.cpuTracerEnable;
    }

    @Override // p149l.mr2
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public nrb mo18567c() {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j = this.lastSampleTs;
            if (j != 0) {
                long j2 = jUptimeMillis - j;
                if (j2 <= 0) {
                    this.cupUsageInfo.m160736f(0.0f);
                    this.cupUsageInfo.m160734d(0.0f);
                    this.cupUsageInfo.m160735e(0);
                    return this.cupUsageInfo;
                }
                Pair<zrb, zrb> pairM98586h = m98586h(j2);
                if (pairM98586h.getFirst().getEnable() && pairM98586h.getSecond().getEnable()) {
                    long time = pairM98586h.getFirst().getTime();
                    long time2 = pairM98586h.getSecond().getTime();
                    CpuUtils cpuUtils = CpuUtils.INSTANCE;
                    float f = time2;
                    float fM18546i = (cpuUtils.m18546i() / f) * 100.0f;
                    nrb nrbVar = this.cupUsageInfo;
                    String str = this.df.format(Float.valueOf(((f - time) / f) * 100.0f));
                    nrbVar.m160736f(str != null ? Float.parseFloat(str) : 0.0f);
                    nrb nrbVar2 = this.cupUsageInfo;
                    String str2 = this.df.format(Float.valueOf(fM18546i));
                    nrbVar2.m160734d(str2 != null ? Float.parseFloat(str2) : 0.0f);
                    this.cupUsageInfo.m160735e(cpuUtils.m18541d());
                }
                this.cpuTracerEnable = false;
                this.cupUsageInfo.m160736f(0.0f);
                this.cupUsageInfo.m160734d(0.0f);
                this.cupUsageInfo.m160735e(0);
                return this.cupUsageInfo;
            }
            m98586h(this.cpuConfig.getSampleIntervalMs());
            CpuUtils.INSTANCE.m18546i();
            this.lastSampleTs = jUptimeMillis;
        } catch (Exception unused) {
            this.cpuTracerEnable = false;
        }
        return this.cupUsageInfo;
    }
}
