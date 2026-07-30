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
import p149l.bf4;
import p149l.jnd;
import p149l.l4e;
import p149l.uwp;

/* JADX INFO: renamed from: kotlinx.coroutines.h */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Lkotlinx/coroutines/h;", "", "", "timeMillis", "Ll/bf4;", "", "continuation", "scheduleResumeAfterDelay", "(JLl/bf4;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Ll/l4e;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Ll/l4e;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public interface InterfaceC15477h {

    /* JADX INFO: renamed from: kotlinx.coroutines.h$a */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class a {
        @Deprecated
        @Nullable
        /* JADX INFO: renamed from: a */
        public static Object m94186a(@NotNull InterfaceC15477h interfaceC15477h, long j, @NotNull Continuation<? super Unit> continuation) {
            if (j <= 0) {
                return Unit.INSTANCE;
            }
            C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
            c15407c.m93745G();
            interfaceC15477h.scheduleResumeAfterDelay(j, c15407c);
            Object objM93778v = c15407c.m93778v();
            if (objM93778v == uwp.m196133e()) {
                DebugProbesKt.m87383c(continuation);
            }
            return objM93778v == uwp.m196133e() ? objM93778v : Unit.INSTANCE;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public static l4e m94187b(@NotNull InterfaceC15477h interfaceC15477h, long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
            return jnd.m142372a().invokeOnTimeout(j, runnable, coroutineContext);
        }
    }

    @NotNull
    l4e invokeOnTimeout(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context);

    void scheduleResumeAfterDelay(long timeMillis, @NotNull bf4<? super Unit> continuation);
}
