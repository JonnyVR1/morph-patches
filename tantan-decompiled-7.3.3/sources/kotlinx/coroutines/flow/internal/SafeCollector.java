package kotlinx.coroutines.flow.internal;

import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
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
import kotlin.text.C15491b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bt40;
import p153l.bui;
import p153l.fpq;
import p153l.mae;
import p153l.p7f;
import p153l.uyp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000e2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000f\u0010\"R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010&\u001a\u00020%8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010$R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, m88121d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", p7f.GPS_DIRECTION_TRUE, "Ll/bui;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collector", "Lkotlin/coroutines/CoroutineContext;", "collectContext", "<init>", "(Ll/bui;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/coroutines/Continuation;", "", "uCont", "value", "", "emit", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)Ljava/lang/Object;", "currentContext", "previousContext", "checkContext", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Ll/mae;", "exception", "exceptionTransparencyViolated", "(Ll/mae;Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", LovePlanetStage.result, "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/bui;", "Lkotlin/coroutines/CoroutineContext;", "", "collectContextSize", "I", "lastEmissionContext", "completion_", "Lkotlin/coroutines/Continuation;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class SafeCollector<T> extends ContinuationImpl implements bui<T>, CoroutineStackFrame {

    @JvmField
    @NotNull
    public final CoroutineContext collectContext;

    @JvmField
    public final int collectContextSize;

    @JvmField
    @NotNull
    public final bui<T> collector;

    @Nullable
    private Continuation<? super Unit> completion_;

    @Nullable
    private CoroutineContext lastEmissionContext;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(@NotNull bui<? super T> buiVar, @NotNull CoroutineContext coroutineContext) {
        super(bt40.INSTANCE, EmptyCoroutineContext.INSTANCE);
        this.collector = buiVar;
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
        if (previousContext instanceof mae) {
            exceptionTransparencyViolated((mae) previousContext, value);
        }
        SafeCollector_commonKt.m95068a(this, currentContext);
    }

    private final Object emit(Continuation<? super Unit> uCont, T value) {
        CoroutineContext f64117a = uCont.getContext();
        fpq.m126711j(f64117a);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != f64117a) {
            checkContext(f64117a, coroutineContext, value);
            this.lastEmissionContext = f64117a;
        }
        this.completion_ = uCont;
        Function3 function3 = SafeCollectorKt.f67568a;
        bui<T> buiVar = this.collector;
        buiVar.getClass();
        Object objInvoke = function3.invoke(buiVar, value, this);
        if (!Intrinsics.m88377d(objInvoke, uyp.m198688e())) {
            this.completion_ = null;
        }
        return objInvoke;
    }

    private final void exceptionTransparencyViolated(mae exception, Object value) {
        throw new IllegalStateException(C15491b.m94361i("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + exception.e + ", but then emission attempt of value '" + value + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
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
        Throwable thM225069exceptionOrNullimpl = Result.m225069exceptionOrNullimpl(result);
        if (thM225069exceptionOrNullimpl != null) {
            this.lastEmissionContext = new mae(thM225069exceptionOrNullimpl, getContext());
        }
        Continuation<? super Unit> continuation = this.completion_;
        if (continuation != null) {
            continuation.resumeWith(result);
        }
        return uyp.m198688e();
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // p153l.bui
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        try {
            Object objEmit = emit(continuation, t);
            if (objEmit == uyp.m198688e()) {
                DebugProbesKt.m88272c(continuation);
            }
            return objEmit == uyp.m198688e() ? objEmit : Unit.INSTANCE;
        } catch (Throwable th) {
            this.lastEmissionContext = new mae(th, continuation.getContext());
            throw th;
        }
    }
}
