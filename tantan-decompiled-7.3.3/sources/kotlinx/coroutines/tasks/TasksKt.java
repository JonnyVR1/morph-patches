package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.p051p1.mobile.putong.data.Careers;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15514c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ag4;
import p153l.ig4;
import p153l.p7f;
import p153l.uyp;
import p153l.w2e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Lcom/google/android/gms/tasks/Task;", "a", "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/ig4;", "cancellationTokenSource", "b", "(Lcom/google/android/gms/tasks/Task;Ll/ig4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-play-services"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class TasksKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.tasks.TasksKt$a */
    @Metadata(m88120d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, Careers.f39580it, "Lcom/google/android/gms/tasks/Task;", "kotlin.jvm.PlatformType", "onComplete"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class C15609a<TResult> implements OnCompleteListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ag4<T> f67672a;

        /* JADX WARN: Multi-variable type inference failed */
        public C15609a(ag4<? super T> ag4Var) {
            this.f67672a = ag4Var;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(@NotNull Task<T> task) {
            Exception excMo15426k = task.mo15426k();
            if (excMo15426k != null) {
                Continuation continuation = this.f67672a;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m225066constructorimpl(ResultKt.m88127a(excMo15426k)));
                return;
            }
            boolean zMo15429n = task.mo15429n();
            ag4<T> ag4Var = this.f67672a;
            if (zMo15429n) {
                ag4.C15705a.m97576a(ag4Var, null, 1, null);
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                ag4Var.resumeWith(Result.m225066constructorimpl(task.mo15427l()));
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m95286a(@NotNull Task<T> task, @NotNull Continuation<? super T> continuation) {
        return m95287b(task, null, continuation);
    }

    /* JADX INFO: renamed from: b */
    public static final <T> Object m95287b(Task<T> task, final ig4 ig4Var, Continuation<? super T> continuation) throws Exception {
        if (task.mo15430o()) {
            Exception excMo15426k = task.mo15426k();
            if (excMo15426k != null) {
                throw excMo15426k;
            }
            if (!task.mo15429n()) {
                return task.mo15427l();
            }
            throw new CancellationException("Task " + task + " was cancelled normally.");
        }
        C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
        c15514c.m94637G();
        task.mo15417b(w2e.INSTANCE, new C15609a(c15514c));
        if (ig4Var != null) {
            c15514c.mo94672x(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Throwable th) {
                    ig4Var.m139763a();
                }
            });
        }
        Object objM94670v = c15514c.m94670v();
        if (objM94670v == uyp.m198688e()) {
            DebugProbesKt.m88272c(continuation);
        }
        return objM94670v;
    }
}
