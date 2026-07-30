package kotlinx.coroutines;

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
import p149l.gnq;
import p149l.j6f;
import p149l.ppb;
import p149l.qkq0;
import p149l.rnj0;
import p149l.usd;
import p149l.uwp;
import p149l.xqi0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a^\u0010\u000e\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "", "timeMillis", "Lkotlin/Function2;", "Ll/ppb;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "c", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "U", "Ll/xqi0;", "coroutine", "b", "(Ll/xqi0;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "time", "Lkotlinx/coroutines/h;", "delay", "Lkotlinx/coroutines/o;", "Lkotlinx/coroutines/TimeoutCancellationException;", "a", "(JLkotlinx/coroutines/h;Lkotlinx/coroutines/o;)Lkotlinx/coroutines/TimeoutCancellationException;", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class TimeoutKt {
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:9:0x0018, please report this as an issue */
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final TimeoutCancellationException m93728a(long j, @NotNull InterfaceC15477h interfaceC15477h, @NotNull InterfaceC15486o interfaceC15486o) {
        String strM195182i;
        usd usdVar = interfaceC15477h instanceof usd ? (usd) interfaceC15477h : null;
        if (usdVar != null) {
            Duration.Companion companion = Duration.INSTANCE;
            strM195182i = usdVar.m195182i(DurationKt.m93562p(j, DurationUnit.MILLISECONDS));
            if (strM195182i == null) {
                strM195182i = "Timed out waiting for " + j + " ms";
            }
        } else {
            strM195182i = "Timed out waiting for " + j + " ms";
        }
        return new TimeoutCancellationException(strM195182i, interfaceC15486o);
    }

    /* JADX INFO: renamed from: b */
    public static final <U, T extends U> Object m93729b(xqi0<U, ? super T> xqi0Var, Function2<? super ppb, ? super Continuation<? super T>, ? extends Object> function2) {
        gnq.m127168i(xqi0Var, DelayKt.m93612c(xqi0Var.uCont.getContext()).invokeOnTimeout(xqi0Var.time, xqi0Var, xqi0Var.getContext()));
        return rnj0.m180071c(xqi0Var, xqi0Var, function2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, l.xqi0] */
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m93730c(long j, @NotNull Function2<? super ppb, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Throwable {
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
        Object objM196133e = uwp.m196133e();
        int i2 = timeoutKt$withTimeoutOrNull$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            if (j <= 0) {
                return null;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                timeoutKt$withTimeoutOrNull$1.L$0 = function2;
                timeoutKt$withTimeoutOrNull$1.L$1 = objectRef2;
                timeoutKt$withTimeoutOrNull$1.J$0 = j;
                timeoutKt$withTimeoutOrNull$1.label = 1;
                ?? r2 = (T) new xqi0(j, timeoutKt$withTimeoutOrNull$1);
                objectRef2.element = r2;
                Object objM93729b = m93729b(r2, function2);
                if (objM93729b == uwp.m196133e()) {
                    DebugProbesKt.m87383c(timeoutKt$withTimeoutOrNull$1);
                }
                return objM93729b == objM196133e ? objM196133e : objM93729b;
            } catch (TimeoutCancellationException e) {
                e = e;
                objectRef = objectRef2;
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objectRef = (Ref.ObjectRef) timeoutKt$withTimeoutOrNull$1.L$1;
            try {
                ResultKt.m87239b(obj);
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
