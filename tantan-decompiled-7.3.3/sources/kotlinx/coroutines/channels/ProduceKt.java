package kotlinx.coroutines.channels;

import com.facebook.AuthenticationTokenClaims;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15514c;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ag4;
import p153l.al90;
import p153l.drb;
import p153l.el90;
import p153l.ns4;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001ad\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a§\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152-\b\u0002\u0010\u001d\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017j\u0004\u0018\u0001`\u001c2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0000¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {"Ll/el90;", "Lkotlin/Function0;", "", "block", "a", "(Ll/el90;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E", "Ll/drb;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "b", "(Ll/drb;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "cause", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "c", "(Ll/drb;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ProduceKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m94871a(@NotNull el90<?> el90Var, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        ProduceKt$awaitClose$1 produceKt$awaitClose$1;
        if (continuation instanceof ProduceKt$awaitClose$1) {
            produceKt$awaitClose$1 = (ProduceKt$awaitClose$1) continuation;
            int i = produceKt$awaitClose$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                produceKt$awaitClose$1.label = i - Integer.MIN_VALUE;
            } else {
                produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(continuation);
            }
        } else {
            produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(continuation);
        }
        Object obj = produceKt$awaitClose$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = produceKt$awaitClose$1.label;
        try {
            if (i2 == 0) {
                ResultKt.m88128b(obj);
                if (produceKt$awaitClose$1.getContext().get(InterfaceC15593o.INSTANCE) != el90Var) {
                    wtq0.m207906a("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                produceKt$awaitClose$1.L$0 = el90Var;
                produceKt$awaitClose$1.L$1 = function0;
                produceKt$awaitClose$1.label = 1;
                final C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(produceKt$awaitClose$1), 1);
                c15514c.m94637G();
                el90Var.mo94775j(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Throwable th) {
                        ag4<Unit> ag4Var = c15514c;
                        Result.Companion companion = Result.INSTANCE;
                        ag4Var.resumeWith(Result.m225066constructorimpl(Unit.INSTANCE));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }
                });
                Object objM94670v = c15514c.m94670v();
                if (objM94670v == uyp.m198688e()) {
                    DebugProbesKt.m88272c(produceKt$awaitClose$1);
                }
                if (objM94670v == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i2 != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function0 = (Function0) produceKt$awaitClose$1.L$1;
                ResultKt.m88128b(obj);
            }
            function0.invoke();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <E> ReceiveChannel<E> m94872b(@NotNull drb drbVar, @NotNull CoroutineContext coroutineContext, int i, @BuilderInference @NotNull Function2<? super el90<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return m94873c(drbVar, coroutineContext, i, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, function2);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <E> ReceiveChannel<E> m94873c(@NotNull drb drbVar, @NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow, @NotNull CoroutineStart coroutineStart, @Nullable Function1<? super Throwable, Unit> function1, @BuilderInference @NotNull Function2<? super el90<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        al90 al90Var = new al90(CoroutineContextKt.m94498e(drbVar, coroutineContext), ns4.m164557c(i, bufferOverflow, null, 4, null));
        if (function1 != null) {
            al90Var.mo94592u(function1);
        }
        al90Var.m94626g1(coroutineStart, al90Var, function2);
        return al90Var;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ ReceiveChannel m94874d(drb drbVar, CoroutineContext coroutineContext, int i, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m94872b(drbVar, coroutineContext, i, function2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ ReceiveChannel m94875e(drb drbVar, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, Function1 function1, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i2 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((i2 & 16) != 0) {
            function1 = null;
        }
        Function1 function3 = function1;
        return m94873c(drbVar, coroutineContext, i, bufferOverflow, coroutineStart, function3, function2);
    }
}
