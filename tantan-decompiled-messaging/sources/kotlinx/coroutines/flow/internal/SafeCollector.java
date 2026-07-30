package kotlinx.coroutines.flow.internal;

import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15384b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fri;
import p149l.gnq;
import p149l.i9e;
import p149l.j6f;
import p149l.nk40;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000e2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000f\u0010\"R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010&\u001a\u00020%8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010$R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, m87232d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", j6f.GPS_DIRECTION_TRUE, "Ll/fri;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collector", "Lkotlin/coroutines/CoroutineContext;", "collectContext", "<init>", "(Ll/fri;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/coroutines/Continuation;", "", "uCont", "value", "", "emit", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)Ljava/lang/Object;", "currentContext", "previousContext", "checkContext", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Ll/i9e;", "exception", "exceptionTransparencyViolated", "(Ll/i9e;Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", LovePlanetStage.result, "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/fri;", "Lkotlin/coroutines/CoroutineContext;", "", "collectContextSize", "I", "lastEmissionContext", "completion_", "Lkotlin/coroutines/Continuation;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class SafeCollector<T> extends ContinuationImpl implements fri<T>, CoroutineStackFrame {

    @JvmField
    @NotNull
    public final CoroutineContext collectContext;

    @JvmField
    public final int collectContextSize;

    @JvmField
    @NotNull
    public final fri<T> collector;

    @Nullable
    private Continuation<? super Unit> completion_;

    @Nullable
    private CoroutineContext lastEmissionContext;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(@NotNull fri<? super T> friVar, @NotNull CoroutineContext coroutineContext) {
        super(nk40.INSTANCE, EmptyCoroutineContext.INSTANCE);
        this.collector = friVar;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.fold(0, new Function2<Integer, CoroutineContext.Element, Integer>() { // from class: kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.Element element) {
                return invoke(num.intValue(), element);
            }

            @NotNull
            public final Integer invoke(int i, @NotNull CoroutineContext.Element element) {
                return Integer.valueOf(i + 1);
            }
        })).intValue();
    }

    private final void checkContext(CoroutineContext currentContext, CoroutineContext previousContext, T value) {
        if (previousContext instanceof i9e) {
            exceptionTransparencyViolated((i9e) previousContext, value);
        }
        SafeCollector_commonKt.m94175a(this, currentContext);
    }

    private final Object emit(Continuation<? super Unit> uCont, T value) {
        CoroutineContext f63443a = uCont.getContext();
        gnq.m127169j(f63443a);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != f63443a) {
            checkContext(f63443a, coroutineContext, value);
            this.lastEmissionContext = f63443a;
        }
        this.completion_ = uCont;
        Function3 function3 = SafeCollectorKt.f66894a;
        fri<T> friVar = this.collector;
        friVar.getClass();
        Object objInvoke = function3.invoke(friVar, value, this);
        if (!Intrinsics.m87488d(objInvoke, uwp.m196133e())) {
            this.completion_ = null;
        }
        return objInvoke;
    }

    private final void exceptionTransparencyViolated(i9e exception, Object value) {
        throw new IllegalStateException(C15384b.m93470i("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + exception.e + ", but then emission attempt of value '" + value + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<? super Unit> continuation = this.completion_;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        return coroutineContext == null ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public Object invokeSuspend(@NotNull Object result) {
        Throwable thM223823exceptionOrNullimpl = Result.m223823exceptionOrNullimpl(result);
        if (thM223823exceptionOrNullimpl != null) {
            this.lastEmissionContext = new i9e(thM223823exceptionOrNullimpl, getContext());
        }
        Continuation<? super Unit> continuation = this.completion_;
        if (continuation != null) {
            continuation.resumeWith(result);
        }
        return uwp.m196133e();
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // p149l.fri
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        try {
            Object objEmit = emit(continuation, t);
            if (objEmit == uwp.m196133e()) {
                DebugProbesKt.m87383c(continuation);
            }
            return objEmit == uwp.m196133e() ? objEmit : Unit.INSTANCE;
        } catch (Throwable th) {
            this.lastEmissionContext = new i9e(th, continuation.getContext());
            throw th;
        }
    }
}
