package kotlin.coroutines.intrinsics;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aX\u0010\b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\\\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"R", j6f.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "receiver", "completion", Constants.INAPP_DATA_TAG, "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "c", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "b", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
@SourceDebugExtension
public class IntrinsicsKt__IntrinsicsJvmKt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin
    @NotNull
    /* JADX INFO: renamed from: a */
    public static <R, T> Continuation<Unit> m87366a(@NotNull final Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, final R r, @NotNull Continuation<? super T> continuation) {
        function2.getClass();
        continuation.getClass();
        final Continuation<?> continuationM87381a = DebugProbesKt.m87381a(continuation);
        if (function2 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function2).create(r, continuationM87381a);
        }
        final CoroutineContext context = continuationM87381a.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(continuationM87381a, function2, r) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ Function2 $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(continuationM87381a);
                this.$this_createCoroutineUnintercepted$inlined = function2;
                this.$receiver$inlined = r;
                continuationM87381a.getClass();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) throws Throwable {
                int i = this.label;
                if (i == 0) {
                    this.label = 1;
                    ResultKt.m87239b(result);
                    this.$this_createCoroutineUnintercepted$inlined.getClass();
                    return ((Function2) TypeIntrinsics.m87540g(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
                }
                if (i != 1) {
                    qkq0.m175383a("This coroutine had already completed");
                    return null;
                }
                this.label = 2;
                ResultKt.m87239b(result);
                return result;
            }
        } : new ContinuationImpl(continuationM87381a, context, function2, r) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ Function2 $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(continuationM87381a, context);
                this.$this_createCoroutineUnintercepted$inlined = function2;
                this.$receiver$inlined = r;
                continuationM87381a.getClass();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) throws Throwable {
                int i = this.label;
                if (i == 0) {
                    this.label = 1;
                    ResultKt.m87239b(result);
                    this.$this_createCoroutineUnintercepted$inlined.getClass();
                    return ((Function2) TypeIntrinsics.m87540g(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
                }
                if (i != 1) {
                    qkq0.m175383a("This coroutine had already completed");
                    return null;
                }
                this.label = 2;
                ResultKt.m87239b(result);
                return result;
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public static final <T> Continuation<T> m87367b(final Continuation<? super T> continuation) {
        final CoroutineContext context = continuation.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(continuation) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(continuation);
                continuation.getClass();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) throws Throwable {
                ResultKt.m87239b(result);
                return result;
            }
        } : new ContinuationImpl(continuation, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(continuation, context);
                continuation.getClass();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) throws Throwable {
                ResultKt.m87239b(result);
                return result;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin
    @NotNull
    /* JADX INFO: renamed from: c */
    public static <T> Continuation<T> m87368c(@NotNull Continuation<? super T> continuation) {
        Continuation<T> continuation2;
        continuation.getClass();
        ContinuationImpl continuationImpl = continuation instanceof ContinuationImpl ? (ContinuationImpl) continuation : null;
        return (continuationImpl == null || (continuation2 = (Continuation<T>) continuationImpl.intercepted()) == null) ? continuation : continuation2;
    }

    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: d */
    public static <R, T> Object m87369d(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, @NotNull Continuation<? super T> continuation) {
        function2.getClass();
        continuation.getClass();
        return ((Function2) TypeIntrinsics.m87540g(function2, 2)).invoke(r, m87367b(DebugProbesKt.m87381a(continuation)));
    }
}
