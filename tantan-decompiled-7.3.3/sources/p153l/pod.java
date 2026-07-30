package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00182\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0019"}, m88121d2 = {"Ll/pod;", "Ll/d7f;", "", "numCpuBoundThreads", "<init>", "(I)V", "Ljava/util/concurrent/Executor;", "c", "()Ljava/util/concurrent/Executor;", "e", "g", "b", "Ljava/util/concurrent/ScheduledExecutorService;", "f", "()Ljava/util/concurrent/ScheduledExecutorService;", "a", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/Executor;", "ioBoundExecutor", "decodeExecutor", "backgroundExecutor", "lightWeightBackgroundExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "backgroundScheduledExecutorService", "Companion", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class pod implements d7f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Executor ioBoundExecutor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Executor decodeExecutor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Executor backgroundExecutor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Executor lightWeightBackgroundExecutor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ScheduledExecutorService backgroundScheduledExecutorService;

    public pod(int i) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2, new jv80(10, "FrescoIoBoundExecutor", true));
        executorServiceNewFixedThreadPool.getClass();
        this.ioBoundExecutor = executorServiceNewFixedThreadPool;
        ExecutorService executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(i, new jv80(10, "FrescoDecodeExecutor", true));
        executorServiceNewFixedThreadPool2.getClass();
        this.decodeExecutor = executorServiceNewFixedThreadPool2;
        ExecutorService executorServiceNewFixedThreadPool3 = Executors.newFixedThreadPool(i, new jv80(10, "FrescoBackgroundExecutor", true));
        executorServiceNewFixedThreadPool3.getClass();
        this.backgroundExecutor = executorServiceNewFixedThreadPool3;
        ExecutorService executorServiceNewFixedThreadPool4 = Executors.newFixedThreadPool(1, new jv80(10, "FrescoLightWeightBackgroundExecutor", true));
        executorServiceNewFixedThreadPool4.getClass();
        this.lightWeightBackgroundExecutor = executorServiceNewFixedThreadPool4;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i, new jv80(10, "FrescoBackgroundExecutor", true));
        scheduledExecutorServiceNewScheduledThreadPool.getClass();
        this.backgroundScheduledExecutorService = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // p153l.d7f
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public Executor getLightWeightBackgroundExecutor() {
        return this.lightWeightBackgroundExecutor;
    }

    @Override // p153l.d7f
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public Executor getBackgroundExecutor() {
        return this.backgroundExecutor;
    }

    @Override // p153l.d7f
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public Executor getIoBoundExecutor() {
        return this.ioBoundExecutor;
    }

    @Override // p153l.d7f
    @NotNull
    /* JADX INFO: renamed from: d */
    public Executor mo114730d() {
        return this.ioBoundExecutor;
    }

    @Override // p153l.d7f
    @NotNull
    /* JADX INFO: renamed from: e */
    public Executor mo114731e() {
        return this.ioBoundExecutor;
    }

    @Override // p153l.d7f
    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public ScheduledExecutorService getBackgroundScheduledExecutorService() {
        return this.backgroundScheduledExecutorService;
    }

    @Override // p153l.d7f
    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public Executor getDecodeExecutor() {
        return this.decodeExecutor;
    }
}
