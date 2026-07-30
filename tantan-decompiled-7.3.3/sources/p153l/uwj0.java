package p153l;

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
@Metadata(m88120d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001aX\u0010\r\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aX\u0010\u000f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m88121d2 = {"R", p7f.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "receiver", "completion", "", "a", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "Ll/mbe0;", "Lkotlin/ExtensionFunctionType;", "block", "b", "(Ll/mbe0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class uwj0 {
    /* JADX INFO: renamed from: a */
    public static final <R, T> void m198379a(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, @NotNull Continuation<? super T> continuation) {
        Continuation continuationM88270a = DebugProbesKt.m88270a(continuation);
        try {
            CoroutineContext context = continuation.getContext();
            Object objM95110c = ThreadContextKt.m95110c(context, null);
            try {
                Object objM88258d = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.m88258d(function2, r, continuationM88270a) : ((Function2) TypeIntrinsics.m88429g(function2, 2)).invoke(r, continuationM88270a);
                ThreadContextKt.m95108a(context, objM95110c);
                if (objM88258d != uyp.m198688e()) {
                    continuationM88270a.resumeWith(Result.m225066constructorimpl(objM88258d));
                }
            } catch (Throwable th) {
                ThreadContextKt.m95108a(context, objM95110c);
                throw th;
            }
        } catch (Throwable th2) {
            Result.Companion companion = Result.INSTANCE;
            continuationM88270a.resumeWith(Result.m225066constructorimpl(ResultKt.m88127a(th2)));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T, R> Object m198380b(@NotNull mbe0<? super T> mbe0Var, R r, @NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        Object to5Var;
        try {
            to5Var = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.m88258d(function2, r, mbe0Var) : ((Function2) TypeIntrinsics.m88429g(function2, 2)).invoke(r, mbe0Var);
        } catch (Throwable th) {
            to5Var = new to5(th, false, 2, null);
        }
        if (to5Var == uyp.m198688e()) {
            return uyp.m198688e();
        }
        Object objM94531D0 = mbe0Var.m94531D0(to5Var);
        if (objM94531D0 == npq.f143117b) {
            return uyp.m198688e();
        }
        if (objM94531D0 instanceof to5) {
            throw ((to5) objM94531D0).cause;
        }
        return npq.m164243h(objM94531D0);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T, R> Object m198381c(@NotNull mbe0<? super T> mbe0Var, R r, @NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) throws Throwable {
        Object to5Var;
        try {
            to5Var = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.m88258d(function2, r, mbe0Var) : ((Function2) TypeIntrinsics.m88429g(function2, 2)).invoke(r, mbe0Var);
        } catch (Throwable th) {
            to5Var = new to5(th, false, 2, null);
        }
        if (to5Var == uyp.m198688e()) {
            return uyp.m198688e();
        }
        Object objM94531D0 = mbe0Var.m94531D0(to5Var);
        if (objM94531D0 == npq.f143117b) {
            return uyp.m198688e();
        }
        if (objM94531D0 instanceof to5) {
            Throwable th2 = ((to5) objM94531D0).cause;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).coroutine != mbe0Var) {
                throw th2;
            }
            if (to5Var instanceof to5) {
                throw ((to5) to5Var).cause;
            }
        } else {
            to5Var = npq.m164243h(objM94531D0);
        }
        return to5Var;
    }
}
