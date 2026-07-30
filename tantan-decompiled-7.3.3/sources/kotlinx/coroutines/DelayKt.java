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
import p153l.nbr;
import p153l.ood;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0016\u0010\t\u001a\u00020\u0003*\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\"\u0018\u0010\u000f\u001a\u00020\f*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, m88121d2 = {"", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timeMillis", "", "b", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/time/Duration;", Constants.INAPP_DATA_TAG, "(J)J", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/h;", "c", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/h;", "delay", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class DelayKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m94501a(@NotNull Continuation<?> continuation) throws Throwable {
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
        Object objM198688e = uyp.m198688e();
        int i2 = delayKt$awaitCancellation$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            delayKt$awaitCancellation$1.label = 1;
            C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(delayKt$awaitCancellation$1), 1);
            c15514c.m94637G();
            Object objM94670v = c15514c.m94670v();
            if (objM94670v == uyp.m198688e()) {
                DebugProbesKt.m88272c(delayKt$awaitCancellation$1);
            }
            if (objM94670v == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m94502b(long j, @NotNull Continuation<? super Unit> continuation) {
        if (j <= 0) {
            return Unit.INSTANCE;
        }
        C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
        c15514c.m94637G();
        if (j < Long.MAX_VALUE) {
            m94503c(c15514c.getContext()).scheduleResumeAfterDelay(j, c15514c);
        }
        Object objM94670v = c15514c.m94670v();
        if (objM94670v == uyp.m198688e()) {
            DebugProbesKt.m88272c(continuation);
        }
        return objM94670v == uyp.m198688e() ? objM94670v : Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC15584h m94503c(@NotNull CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.INSTANCE);
        InterfaceC15584h interfaceC15584h = element instanceof InterfaceC15584h ? (InterfaceC15584h) element : null;
        return interfaceC15584h == null ? ood.m168571a() : interfaceC15584h;
    }

    /* JADX INFO: renamed from: d */
    public static final long m94504d(long j) {
        boolean zM94406L = Duration.m94406L(j);
        if (zM94406L) {
            return Duration.m94426u(Duration.m94408N(j, DurationKt.m94453p(999999L, DurationUnit.NANOSECONDS)));
        }
        if (!zM94406L) {
            return 0L;
        }
        nbr.m162172a();
        return 0L;
    }
}
