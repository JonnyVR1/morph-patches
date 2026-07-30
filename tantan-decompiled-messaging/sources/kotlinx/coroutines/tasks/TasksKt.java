package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.p046p1.mobile.putong.data.Careers;
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
import kotlinx.coroutines.C15407c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.bf4;
import p149l.i1e;
import p149l.j6f;
import p149l.jf4;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Lcom/google/android/gms/tasks/Task;", "a", "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/jf4;", "cancellationTokenSource", "b", "(Lcom/google/android/gms/tasks/Task;Ll/jf4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-play-services"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class TasksKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.tasks.TasksKt$a */
    @Metadata(m87231d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, Careers.f38732it, "Lcom/google/android/gms/tasks/Task;", "kotlin.jvm.PlatformType", "onComplete"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class C15502a<TResult> implements OnCompleteListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bf4<T> f66998a;

        /* JADX WARN: Multi-variable type inference failed */
        public C15502a(bf4<? super T> bf4Var) {
            this.f66998a = bf4Var;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(@NotNull Task<T> task) {
            Exception excMo15372k = task.mo15372k();
            if (excMo15372k != null) {
                Continuation continuation = this.f66998a;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m223820constructorimpl(ResultKt.m87238a(excMo15372k)));
                return;
            }
            boolean zMo15375n = task.mo15375n();
            bf4<T> bf4Var = this.f66998a;
            if (zMo15375n) {
                bf4.C15848a.m101511a(bf4Var, null, 1, null);
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                bf4Var.resumeWith(Result.m223820constructorimpl(task.mo15373l()));
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m94393a(@NotNull Task<T> task, @NotNull Continuation<? super T> continuation) {
        return m94394b(task, null, continuation);
    }

    /* JADX INFO: renamed from: b */
    public static final <T> Object m94394b(Task<T> task, final jf4 jf4Var, Continuation<? super T> continuation) throws Exception {
        if (task.mo15376o()) {
            Exception excMo15372k = task.mo15372k();
            if (excMo15372k != null) {
                throw excMo15372k;
            }
            if (!task.mo15375n()) {
                return task.mo15373l();
            }
            throw new CancellationException("Task " + task + " was cancelled normally.");
        }
        C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
        c15407c.m93745G();
        task.mo15363b(i1e.INSTANCE, new C15502a(c15407c));
        if (jf4Var != null) {
            c15407c.mo93780x(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2
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
                    jf4Var.m141172a();
                }
            });
        }
        Object objM93778v = c15407c.m93778v();
        if (objM93778v == uwp.m196133e()) {
            DebugProbesKt.m87383c(continuation);
        }
        return objM93778v;
    }
}
