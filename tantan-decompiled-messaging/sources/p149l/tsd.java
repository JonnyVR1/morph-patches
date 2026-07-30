package p149l;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B%\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Ll/tsd;", "Ll/sc90;", "Ll/fa5;", "Ll/da5;", "inputProducer", "Ljava/util/concurrent/ScheduledExecutorService;", "backgroundTasksExecutor", "<init>", "(Ll/sc90;Ljava/util/concurrent/ScheduledExecutorService;)V", "Ll/uz5;", "consumer", "Ll/uc90;", "context", "", "b", "(Ll/uz5;Ll/uc90;)V", "a", "Ll/sc90;", "Ljava/util/concurrent/ScheduledExecutorService;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class tsd implements sc90<fa5<da5>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final sc90<fa5<da5>> inputProducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final ScheduledExecutorService backgroundTasksExecutor;

    public tsd(@NotNull sc90<fa5<da5>> sc90Var, @Nullable ScheduledExecutorService scheduledExecutorService) {
        sc90Var.getClass();
        this.inputProducer = sc90Var;
        this.backgroundTasksExecutor = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: c */
    public static void m190526c(tsd tsdVar, uz5 uz5Var, uc90 uc90Var) {
        tsdVar.getClass();
        uz5Var.getClass();
        uc90Var.getClass();
        tsdVar.inputProducer.mo8485b(uz5Var, uc90Var);
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(@NotNull final uz5<fa5<da5>> consumer, @NotNull final uc90 context) {
        consumer.getClass();
        context.getClass();
        ImageRequest imageRequestMo155873t = context.mo155873t();
        ScheduledExecutorService scheduledExecutorService = this.backgroundTasksExecutor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new Runnable() { // from class: l.ssd
                @Override // java.lang.Runnable
                public final void run() {
                    tsd.m190526c(this.f166177a, consumer, context);
                }
            }, imageRequestMo155873t.m8568f(), TimeUnit.MILLISECONDS);
        } else {
            this.inputProducer.mo8485b(consumer, context);
        }
    }
}
