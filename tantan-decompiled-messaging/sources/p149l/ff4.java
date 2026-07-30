package p149l;

import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u001ax\u0010\u000e\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032%\b\u0002\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0011\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\f0\u00032\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0014\u001a\u00020\f2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m87232d2 = {"R", j6f.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "receiver", "completion", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "cause", "", "onCancellation", "c", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function1;)V", "fatalCompletion", "b", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/Continuation;)V", "e", "a", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ff4 {
    /* JADX INFO: renamed from: a */
    public static final void m121105a(Continuation<?> continuation, Throwable th) throws Throwable {
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m223820constructorimpl(ResultKt.m87238a(th)));
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static final void m121106b(@NotNull Continuation<? super Unit> continuation, @NotNull Continuation<?> continuation2) throws Throwable {
        try {
            Continuation continuationM87368c = IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation);
            Result.Companion companion = Result.INSTANCE;
            y3e.m212799c(continuationM87368c, Result.m223820constructorimpl(Unit.INSTANCE), null, 2, null);
        } catch (Throwable th) {
            m121105a(continuation2, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final <R, T> void m121107c(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, @NotNull Continuation<? super T> continuation, @Nullable Function1<? super Throwable, Unit> function1) throws Throwable {
        try {
            Continuation continuationM87368c = IntrinsicsKt__IntrinsicsJvmKt.m87368c(IntrinsicsKt__IntrinsicsJvmKt.m87366a(function2, r, continuation));
            Result.Companion companion = Result.INSTANCE;
            y3e.m212798b(continuationM87368c, Result.m223820constructorimpl(Unit.INSTANCE), function1);
        } catch (Throwable th) {
            m121105a(continuation, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m121108d(Function2 function2, Object obj, Continuation continuation, Function1 function1, int i, Object obj2) throws Throwable {
        if ((i & 4) != 0) {
            function1 = null;
        }
        m121107c(function2, obj, continuation, function1);
    }
}
