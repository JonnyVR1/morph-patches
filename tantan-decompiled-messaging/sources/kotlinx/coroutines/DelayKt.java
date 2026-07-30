package kotlinx.coroutines;

import com.clevertap.android.sdk.Constants;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.jnd;
import p149l.l9r;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0016\u0010\t\u001a\u00020\u0003*\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\"\u0018\u0010\u000f\u001a\u00020\f*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, m87232d2 = {"", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timeMillis", "", "b", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/time/Duration;", Constants.INAPP_DATA_TAG, "(J)J", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/h;", "c", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/h;", "delay", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class DelayKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m93610a(@NotNull Continuation<?> continuation) throws Throwable {
        DelayKt$awaitCancellation$1 delayKt$awaitCancellation$1;
        if (continuation instanceof DelayKt$awaitCancellation$1) {
            delayKt$awaitCancellation$1 = (DelayKt$awaitCancellation$1) continuation;
            int i = delayKt$awaitCancellation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                delayKt$awaitCancellation$1.label = i - Integer.MIN_VALUE;
            } else {
                delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(continuation);
            }
        } else {
            delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(continuation);
        }
        Object obj = delayKt$awaitCancellation$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = delayKt$awaitCancellation$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            delayKt$awaitCancellation$1.label = 1;
            C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(delayKt$awaitCancellation$1), 1);
            c15407c.m93745G();
            Object objM93778v = c15407c.m93778v();
            if (objM93778v == uwp.m196133e()) {
                DebugProbesKt.m87383c(delayKt$awaitCancellation$1);
            }
            if (objM93778v == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m93611b(long j, @NotNull Continuation<? super Unit> continuation) {
        if (j <= 0) {
            return Unit.INSTANCE;
        }
        C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
        c15407c.m93745G();
        if (j < Long.MAX_VALUE) {
            m93612c(c15407c.getContext()).scheduleResumeAfterDelay(j, c15407c);
        }
        Object objM93778v = c15407c.m93778v();
        if (objM93778v == uwp.m196133e()) {
            DebugProbesKt.m87383c(continuation);
        }
        return objM93778v == uwp.m196133e() ? objM93778v : Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC15477h m93612c(@NotNull CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.INSTANCE);
        InterfaceC15477h interfaceC15477h = element instanceof InterfaceC15477h ? (InterfaceC15477h) element : null;
        return interfaceC15477h == null ? jnd.m142372a() : interfaceC15477h;
    }

    /* JADX INFO: renamed from: d */
    public static final long m93613d(long j) {
        boolean zM93515L = Duration.m93515L(j);
        if (zM93515L) {
            return Duration.m93535u(Duration.m93517N(j, DurationKt.m93562p(999999L, DurationUnit.NANOSECONDS)));
        }
        if (!zM93515L) {
            return 0L;
        }
        l9r.m149037a();
        return 0L;
    }
}
