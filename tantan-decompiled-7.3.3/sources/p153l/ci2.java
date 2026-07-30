package p153l;

import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/ci2;", "", "", "sampleIntervalMs", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduler", "<init>", "(JLjava/util/concurrent/ScheduledExecutorService;)V", "a", "J", "()J", "setSampleIntervalMs", "(J)V", "b", "Ljava/util/concurrent/ScheduledExecutorService;", "()Ljava/util/concurrent/ScheduledExecutorService;", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class ci2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long sampleIntervalMs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final ScheduledExecutorService scheduler;

    public ci2(long j, @Nullable ScheduledExecutorService scheduledExecutorService) {
        this.sampleIntervalMs = j;
        this.scheduler = scheduledExecutorService;
        if (j < 1000) {
            this.sampleIntervalMs = 1000L;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getSampleIntervalMs() {
        return this.sampleIntervalMs;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ScheduledExecutorService getScheduler() {
        return this.scheduler;
    }

    public ci2() {
        this(0L, null, 3, null);
    }

    public /* synthetic */ ci2(long j, ScheduledExecutorService scheduledExecutorService, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1000L : j, (i & 2) != 0 ? null : scheduledExecutorService);
    }
}
