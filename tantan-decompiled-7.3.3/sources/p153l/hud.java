package p153l;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B%\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Ll/hud;", "Ll/wk90;", "Ll/fb5;", "Ll/db5;", "inputProducer", "Ljava/util/concurrent/ScheduledExecutorService;", "backgroundTasksExecutor", "<init>", "(Ll/wk90;Ljava/util/concurrent/ScheduledExecutorService;)V", "Ll/z06;", "consumer", "Ll/yk90;", "context", "", "b", "(Ll/z06;Ll/yk90;)V", "a", "Ll/wk90;", "Ljava/util/concurrent/ScheduledExecutorService;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class hud implements wk90<fb5<db5>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final wk90<fb5<db5>> inputProducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final ScheduledExecutorService backgroundTasksExecutor;

    public hud(@NotNull wk90<fb5<db5>> wk90Var, @Nullable ScheduledExecutorService scheduledExecutorService) {
        wk90Var.getClass();
        this.inputProducer = wk90Var;
        this.backgroundTasksExecutor = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: c */
    public static void m137142c(hud hudVar, z06 z06Var, yk90 yk90Var) {
        hudVar.getClass();
        z06Var.getClass();
        yk90Var.getClass();
        hudVar.inputProducer.mo8539b(z06Var, yk90Var);
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(@NotNull final z06<fb5<db5>> consumer, @NotNull final yk90 context) {
        consumer.getClass();
        context.getClass();
        ImageRequest imageRequestMo117678t = context.mo117678t();
        ScheduledExecutorService scheduledExecutorService = this.backgroundTasksExecutor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new Runnable() { // from class: l.gud
                @Override // java.lang.Runnable
                public final void run() {
                    hud.m137142c(this.f106485a, consumer, context);
                }
            }, imageRequestMo117678t.m8622f(), TimeUnit.MILLISECONDS);
        } else {
            this.inputProducer.mo8539b(consumer, context);
        }
    }
}
