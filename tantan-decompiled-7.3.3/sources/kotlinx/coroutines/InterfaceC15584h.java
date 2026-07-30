package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ag4;
import p153l.ood;
import p153l.uyp;
import p153l.z5e;

/* JADX INFO: renamed from: kotlinx.coroutines.h */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Lkotlinx/coroutines/h;", "", "", "timeMillis", "Ll/ag4;", "", "continuation", "scheduleResumeAfterDelay", "(JLl/ag4;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Ll/z5e;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Ll/z5e;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public interface InterfaceC15584h {

    /* JADX INFO: renamed from: kotlinx.coroutines.h$a */
    @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class a {
        @Deprecated
        @Nullable
        /* JADX INFO: renamed from: a */
        public static Object m95079a(@NotNull InterfaceC15584h interfaceC15584h, long j, @NotNull Continuation<? super Unit> continuation) {
            if (j <= 0) {
                return Unit.INSTANCE;
            }
            C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
            c15514c.m94637G();
            interfaceC15584h.scheduleResumeAfterDelay(j, c15514c);
            Object objM94670v = c15514c.m94670v();
            if (objM94670v == uyp.m198688e()) {
                DebugProbesKt.m88272c(continuation);
            }
            return objM94670v == uyp.m198688e() ? objM94670v : Unit.INSTANCE;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public static z5e m95080b(@NotNull InterfaceC15584h interfaceC15584h, long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
            return ood.m168571a().invokeOnTimeout(j, runnable, coroutineContext);
        }
    }

    @NotNull
    z5e invokeOnTimeout(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context);

    void scheduleResumeAfterDelay(long timeMillis, @NotNull ag4<? super Unit> continuation);
}
