package androidx.tracing;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.qkq0;
import p149l.t4j0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aI\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u001e\b\u0004\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0086Hø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "", "methodName", "", "cookie", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "a", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tracing-ktx_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class TraceKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m4095a(@NotNull String str, int i, @NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super T> continuation) throws Throwable {
        TraceKt$traceAsync$1 traceKt$traceAsync$1;
        if (continuation instanceof TraceKt$traceAsync$1) {
            traceKt$traceAsync$1 = (TraceKt$traceAsync$1) continuation;
            int i2 = traceKt$traceAsync$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                traceKt$traceAsync$1.label = i2 - Integer.MIN_VALUE;
            } else {
                traceKt$traceAsync$1 = new TraceKt$traceAsync$1(continuation);
            }
        } else {
            traceKt$traceAsync$1 = new TraceKt$traceAsync$1(continuation);
        }
        Object objInvoke = traceKt$traceAsync$1.result;
        Object objM196133e = uwp.m196133e();
        int i3 = traceKt$traceAsync$1.label;
        try {
            if (i3 == 0) {
                ResultKt.m87239b(objInvoke);
                t4j0.m187206a(str, i);
                traceKt$traceAsync$1.L$0 = str;
                traceKt$traceAsync$1.I$0 = i;
                traceKt$traceAsync$1.label = 1;
                objInvoke = function1.invoke(traceKt$traceAsync$1);
                if (objInvoke == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i3 != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = traceKt$traceAsync$1.I$0;
                str = (String) traceKt$traceAsync$1.L$0;
                ResultKt.m87239b(objInvoke);
            }
            InlineMarker.m87483b(1);
            t4j0.m187209d(str, i);
            InlineMarker.m87482a(1);
            return objInvoke;
        } catch (Throwable th) {
            InlineMarker.m87483b(1);
            t4j0.m187209d(str, i);
            InlineMarker.m87482a(1);
            throw th;
        }
    }
}
