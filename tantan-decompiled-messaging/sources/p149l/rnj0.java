package p149l;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001aX\u0010\r\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aX\u0010\u000f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"R", j6f.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "receiver", "completion", "", "a", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "Ll/i3e0;", "Lkotlin/ExtensionFunctionType;", "block", "b", "(Ll/i3e0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class rnj0 {
    /* JADX INFO: renamed from: a */
    public static final <R, T> void m180069a(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, @NotNull Continuation<? super T> continuation) {
        Continuation continuationM87381a = DebugProbesKt.m87381a(continuation);
        try {
            CoroutineContext context = continuation.getContext();
            Object objM94217c = ThreadContextKt.m94217c(context, null);
            try {
                Object objM87369d = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.m87369d(function2, r, continuationM87381a) : ((Function2) TypeIntrinsics.m87540g(function2, 2)).invoke(r, continuationM87381a);
                ThreadContextKt.m94215a(context, objM94217c);
                if (objM87369d != uwp.m196133e()) {
                    continuationM87381a.resumeWith(Result.m223820constructorimpl(objM87369d));
                }
            } catch (Throwable th) {
                ThreadContextKt.m94215a(context, objM94217c);
                throw th;
            }
        } catch (Throwable th2) {
            Result.Companion companion = Result.INSTANCE;
            continuationM87381a.resumeWith(Result.m223820constructorimpl(ResultKt.m87238a(th2)));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T, R> Object m180070b(@NotNull i3e0<? super T> i3e0Var, R r, @NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        Object pn5Var;
        try {
            pn5Var = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.m87369d(function2, r, i3e0Var) : ((Function2) TypeIntrinsics.m87540g(function2, 2)).invoke(r, i3e0Var);
        } catch (Throwable th) {
            pn5Var = new pn5(th, false, 2, null);
        }
        if (pn5Var == uwp.m196133e()) {
            return uwp.m196133e();
        }
        Object objM93640D0 = i3e0Var.m93640D0(pn5Var);
        if (objM93640D0 == onq.f144810b) {
            return uwp.m196133e();
        }
        if (objM93640D0 instanceof pn5) {
            throw ((pn5) objM93640D0).cause;
        }
        return onq.m165223h(objM93640D0);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T, R> Object m180071c(@NotNull i3e0<? super T> i3e0Var, R r, @NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) throws Throwable {
        Object pn5Var;
        try {
            pn5Var = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.m87369d(function2, r, i3e0Var) : ((Function2) TypeIntrinsics.m87540g(function2, 2)).invoke(r, i3e0Var);
        } catch (Throwable th) {
            pn5Var = new pn5(th, false, 2, null);
        }
        if (pn5Var == uwp.m196133e()) {
            return uwp.m196133e();
        }
        Object objM93640D0 = i3e0Var.m93640D0(pn5Var);
        if (objM93640D0 == onq.f144810b) {
            return uwp.m196133e();
        }
        if (objM93640D0 instanceof pn5) {
            Throwable th2 = ((pn5) objM93640D0).cause;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).coroutine != i3e0Var) {
                throw th2;
            }
            if (pn5Var instanceof pn5) {
                throw ((pn5) pn5Var).cause;
            }
        } else {
            pn5Var = onq.m165223h(objM93640D0);
        }
        return pn5Var;
    }
}
