package p153l;

import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001c"}, m88121d2 = {"Ll/k5e;", "", "<init>", "()V", "", "g", "h", "f", Constants.INAPP_DATA_TAG, "", "b", "()Z", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "runnable", "c", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "e", "(Ljava/lang/Runnable;)V", "a", "Z", "paused", "finished", "isDraining", "Ljava/util/Queue;", "Ljava/util/Queue;", "queue", "lifecycle-common"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class k5e {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean finished;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isDraining;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean paused = true;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Queue<Runnable> queue = new ArrayDeque();

    /* JADX INFO: renamed from: a */
    public static void m148351a(k5e k5eVar, Runnable runnable) {
        k5eVar.m148355e(runnable);
    }

    @MainThread
    /* JADX INFO: renamed from: b */
    public final boolean m148352b() {
        return this.finished || !this.paused;
    }

    @AnyThread
    /* JADX INFO: renamed from: c */
    public final void m148353c(@NotNull CoroutineContext context, @NotNull final Runnable runnable) {
        context.getClass();
        runnable.getClass();
        gsw immediate = r5e.m179862c().getImmediate();
        if (immediate.isDispatchNeeded(context) || m148352b()) {
            immediate.dispatch(context, new Runnable() { // from class: l.j5e
                @Override // java.lang.Runnable
                public final void run() {
                    k5e.m148351a(this.f118421a, runnable);
                }
            });
        } else {
            m148355e(runnable);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public final void m148354d() {
        if (this.isDraining) {
            return;
        }
        try {
            this.isDraining = true;
            while (!this.queue.isEmpty() && m148352b()) {
                Runnable runnablePoll = this.queue.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
            this.isDraining = false;
        } catch (Throwable th) {
            this.isDraining = false;
            throw th;
        }
    }

    @MainThread
    /* JADX INFO: renamed from: e */
    public final void m148355e(Runnable runnable) {
        if (this.queue.offer(runnable)) {
            m148354d();
        } else {
            wtq0.m207906a("cannot enqueue any more runnables");
        }
    }

    @MainThread
    /* JADX INFO: renamed from: f */
    public final void m148356f() {
        this.finished = true;
        m148354d();
    }

    @MainThread
    /* JADX INFO: renamed from: g */
    public final void m148357g() {
        this.paused = true;
    }

    @MainThread
    /* JADX INFO: renamed from: h */
    public final void m148358h() {
        if (this.paused) {
            if (this.finished) {
                wtq0.m207906a("Cannot resume a finished dispatcher");
            } else {
                this.paused = false;
                m148354d();
            }
        }
    }
}
