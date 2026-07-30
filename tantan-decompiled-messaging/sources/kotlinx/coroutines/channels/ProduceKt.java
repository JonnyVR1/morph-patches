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
import kotlinx.coroutines.C15407c;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC15486o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ad90;
import p149l.bf4;
import p149l.or4;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;
import p149l.wc90;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001ad\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a§\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152-\b\u0002\u0010\u001d\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017j\u0004\u0018\u0001`\u001c2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0000¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m87232d2 = {"Ll/ad90;", "Lkotlin/Function0;", "", "block", "a", "(Ll/ad90;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E", "Ll/ppb;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "b", "(Ll/ppb;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "cause", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "c", "(Ll/ppb;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ProduceKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m93979a(@NotNull ad90<?> ad90Var, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) throws Throwable {
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
        Object objM196133e = uwp.m196133e();
        int i2 = produceKt$awaitClose$1.label;
        try {
            if (i2 == 0) {
                ResultKt.m87239b(obj);
                if (produceKt$awaitClose$1.getContext().get(InterfaceC15486o.INSTANCE) != ad90Var) {
                    qkq0.m175383a("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                produceKt$awaitClose$1.L$0 = ad90Var;
                produceKt$awaitClose$1.L$1 = function0;
                produceKt$awaitClose$1.label = 1;
                final C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(produceKt$awaitClose$1), 1);
                c15407c.m93745G();
                ad90Var.mo93883j(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Throwable th) {
                        bf4<Unit> bf4Var = c15407c;
                        Result.Companion companion = Result.INSTANCE;
                        bf4Var.resumeWith(Result.m223820constructorimpl(Unit.INSTANCE));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }
                });
                Object objM93778v = c15407c.m93778v();
                if (objM93778v == uwp.m196133e()) {
                    DebugProbesKt.m87383c(produceKt$awaitClose$1);
                }
                if (objM93778v == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i2 != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function0 = (Function0) produceKt$awaitClose$1.L$1;
                ResultKt.m87239b(obj);
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
    public static final <E> ReceiveChannel<E> m93980b(@NotNull ppb ppbVar, @NotNull CoroutineContext coroutineContext, int i, @BuilderInference @NotNull Function2<? super ad90<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return m93981c(ppbVar, coroutineContext, i, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, function2);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <E> ReceiveChannel<E> m93981c(@NotNull ppb ppbVar, @NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow, @NotNull CoroutineStart coroutineStart, @Nullable Function1<? super Throwable, Unit> function1, @BuilderInference @NotNull Function2<? super ad90<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        wc90 wc90Var = new wc90(CoroutineContextKt.m93607e(ppbVar, coroutineContext), or4.m165524c(i, bufferOverflow, null, 4, null));
        if (function1 != null) {
            wc90Var.mo93701u(function1);
        }
        wc90Var.m93734g1(coroutineStart, wc90Var, function2);
        return wc90Var;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ ReceiveChannel m93982d(ppb ppbVar, CoroutineContext coroutineContext, int i, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m93980b(ppbVar, coroutineContext, i, function2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ ReceiveChannel m93983e(ppb ppbVar, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, Function1 function1, Function2 function2, int i2, Object obj) {
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
        return m93981c(ppbVar, coroutineContext, i, bufferOverflow, coroutineStart, function3, function2);
    }
}
