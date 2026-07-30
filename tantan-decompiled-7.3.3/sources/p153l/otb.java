package p153l;

import android.os.Build;
import android.os.SystemClock;
import com.immomo.molive.apm.cpu.CpuUtils;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010&\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, m88121d2 = {"Ll/otb;", "Ll/cs2;", "Ll/btb;", "Ll/ci2;", "cpuConfig", "<init>", "(Ll/ci2;)V", "", "sampleIntervalMs", "Lkotlin/Pair;", "Ll/ntb;", "h", "(J)Lkotlin/Pair;", "j", "()Ll/btb;", "", RXScreenCaptureService.KEY_INDEX, "()Z", "", "g", "()V", "Ljava/text/DecimalFormat;", "e", "Ljava/text/DecimalFormat;", "getDf", "()Ljava/text/DecimalFormat;", "df", "f", "J", "getLastSampleTs", "()J", "setLastSampleTs", "(J)V", "lastSampleTs", "Z", "getCpuTracerEnable", "setCpuTracerEnable", "(Z)V", "cpuTracerEnable", "Ll/btb;", "cupUsageInfo", "Ll/ci2;", "getCpuConfig", "()Ll/ci2;", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class otb extends cs2<btb> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final DecimalFormat df;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long lastSampleTs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean cpuTracerEnable;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final btb cupUsageInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final ci2 cpuConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otb(@NotNull ci2 ci2Var) {
        super(ci2Var);
        ci2Var.getClass();
        this.cpuConfig = ci2Var;
        this.df = new DecimalFormat("#.#");
        this.cpuTracerEnable = true;
        this.cupUsageInfo = new btb(0.0f, 0.0f, 0);
    }

    /* JADX INFO: renamed from: h */
    private final Pair<ntb, ntb> m169078h(long sampleIntervalMs) {
        if (Build.VERSION.SDK_INT < 26) {
            return CpuUtils.INSTANCE.m19522e();
        }
        CpuUtils cpuUtils = CpuUtils.INSTANCE;
        return new Pair<>(cpuUtils.m19523f(sampleIntervalMs), cpuUtils.m19525h());
    }

    @Override // p153l.cs2
    /* JADX INFO: renamed from: g */
    public void mo19549g() {
        super.mo19549g();
        this.lastSampleTs = 0L;
        this.cupUsageInfo.m106327f(0.0f);
        this.cupUsageInfo.m106325d(0.0f);
        this.cpuTracerEnable = true;
        itb.INSTANCE.m142032l();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public boolean getCpuTracerEnable() {
        return this.cpuTracerEnable;
    }

    @Override // p153l.cs2
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public btb mo19547c() {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j = this.lastSampleTs;
            if (j != 0) {
                long j2 = jUptimeMillis - j;
                if (j2 <= 0) {
                    this.cupUsageInfo.m106327f(0.0f);
                    this.cupUsageInfo.m106325d(0.0f);
                    this.cupUsageInfo.m106326e(0);
                    return this.cupUsageInfo;
                }
                Pair<ntb, ntb> pairM169078h = m169078h(j2);
                if (pairM169078h.getFirst().getEnable() && pairM169078h.getSecond().getEnable()) {
                    long time = pairM169078h.getFirst().getTime();
                    long time2 = pairM169078h.getSecond().getTime();
                    CpuUtils cpuUtils = CpuUtils.INSTANCE;
                    float f = time2;
                    float fM19526i = (cpuUtils.m19526i() / f) * 100.0f;
                    btb btbVar = this.cupUsageInfo;
                    String str = this.df.format(Float.valueOf(((f - time) / f) * 100.0f));
                    btbVar.m106327f(str != null ? Float.parseFloat(str) : 0.0f);
                    btb btbVar2 = this.cupUsageInfo;
                    String str2 = this.df.format(Float.valueOf(fM19526i));
                    btbVar2.m106325d(str2 != null ? Float.parseFloat(str2) : 0.0f);
                    this.cupUsageInfo.m106326e(cpuUtils.m19521d());
                }
                this.cpuTracerEnable = false;
                this.cupUsageInfo.m106327f(0.0f);
                this.cupUsageInfo.m106325d(0.0f);
                this.cupUsageInfo.m106326e(0);
                return this.cupUsageInfo;
            }
            m169078h(this.cpuConfig.getSampleIntervalMs());
            CpuUtils.INSTANCE.m19526i();
            this.lastSampleTs = jUptimeMillis;
        } catch (Exception unused) {
            this.cpuTracerEnable = false;
        }
        return this.cupUsageInfo;
    }
}
