package kotlinx.coroutines;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.a0j0;
import p153l.drb;
import p153l.fpq;
import p153l.iud;
import p153l.p7f;
import p153l.uwj0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u001aI\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@¢\u0006\u0004\b\u000b\u0010\n\u001a^\u0010\u000f\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "", "timeMillis", "Lkotlin/Function2;", "Ll/drb;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "c", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constants.INAPP_DATA_TAG, "U", "Ll/a0j0;", "coroutine", "b", "(Ll/a0j0;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "time", "Lkotlinx/coroutines/h;", "delay", "Lkotlinx/coroutines/o;", "Lkotlinx/coroutines/TimeoutCancellationException;", "a", "(JLkotlinx/coroutines/h;Lkotlinx/coroutines/o;)Lkotlinx/coroutines/TimeoutCancellationException;", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class TimeoutKt {
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:9:0x0018, please report this as an issue */
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final TimeoutCancellationException m94619a(long j, @NotNull InterfaceC15584h interfaceC15584h, @NotNull InterfaceC15593o interfaceC15593o) {
        String strM142181i;
        iud iudVar = interfaceC15584h instanceof iud ? (iud) interfaceC15584h : null;
        if (iudVar != null) {
            Duration.Companion companion = Duration.INSTANCE;
            strM142181i = iudVar.m142181i(DurationKt.m94453p(j, DurationUnit.MILLISECONDS));
            if (strM142181i == null) {
                strM142181i = "Timed out waiting for " + j + " ms";
            }
        } else {
            strM142181i = "Timed out waiting for " + j + " ms";
        }
        return new TimeoutCancellationException(strM142181i, interfaceC15593o);
    }

    /* JADX INFO: renamed from: b */
    public static final <U, T extends U> Object m94620b(a0j0<U, ? super T> a0j0Var, Function2<? super drb, ? super Continuation<? super T>, ? extends Object> function2) {
        fpq.m126710i(a0j0Var, DelayKt.m94503c(a0j0Var.uCont.getContext()).invokeOnTimeout(a0j0Var.time, a0j0Var, a0j0Var.getContext()));
        return uwj0.m198381c(a0j0Var, a0j0Var, function2);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m94621c(long j, @NotNull Function2<? super drb, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        if (j <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object objM94620b = m94620b(new a0j0(j, continuation), function2);
        if (objM94620b == uyp.m198688e()) {
            DebugProbesKt.m88272c(continuation);
        }
        return objM94620b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, l.a0j0] */
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <T> Object m94622d(long j, @NotNull Function2<? super drb, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Throwable {
        TimeoutKt$withTimeoutOrNull$1 timeoutKt$withTimeoutOrNull$1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof TimeoutKt$withTimeoutOrNull$1) {
            timeoutKt$withTimeoutOrNull$1 = (TimeoutKt$withTimeoutOrNull$1) continuation;
            int i = timeoutKt$withTimeoutOrNull$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timeoutKt$withTimeoutOrNull$1.label = i - Integer.MIN_VALUE;
            } else {
                timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(continuation);
            }
        } else {
            timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(continuation);
        }
        Object obj = timeoutKt$withTimeoutOrNull$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = timeoutKt$withTimeoutOrNull$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            if (j <= 0) {
                return null;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                timeoutKt$withTimeoutOrNull$1.L$0 = function2;
                timeoutKt$withTimeoutOrNull$1.L$1 = objectRef2;
                timeoutKt$withTimeoutOrNull$1.J$0 = j;
                timeoutKt$withTimeoutOrNull$1.label = 1;
                ?? r2 = (T) new a0j0(j, timeoutKt$withTimeoutOrNull$1);
                objectRef2.element = r2;
                Object objM94620b = m94620b(r2, function2);
                if (objM94620b == uyp.m198688e()) {
                    DebugProbesKt.m88272c(timeoutKt$withTimeoutOrNull$1);
                }
                return objM94620b == objM198688e ? objM198688e : objM94620b;
            } catch (TimeoutCancellationException e) {
                e = e;
                objectRef = objectRef2;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objectRef = (Ref.ObjectRef) timeoutKt$withTimeoutOrNull$1.L$1;
            try {
                ResultKt.m88128b(obj);
                return obj;
            } catch (TimeoutCancellationException e2) {
                e = e2;
            }
        }
        if (e.coroutine == objectRef.element) {
            return null;
        }
        throw e;
    }
}
