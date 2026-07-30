package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p149l.izx;
import p149l.opb;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "Landroidx/lifecycle/EmittedSource;", "<anonymous>", "(Ll/ppb;)Landroidx/lifecycle/EmittedSource;"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", m87374f = "CoroutineLiveData.kt", m87375l = {}, m87376m = "invokeSuspend")
final class CoroutineLiveDataKt$addDisposableSource$2 extends SuspendLambda implements Function2<ppb, Continuation<? super EmittedSource>, Object> {
    final /* synthetic */ LiveData<Object> $source;
    final /* synthetic */ izx<Object> $this_addDisposableSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveDataKt$addDisposableSource$2(izx<Object> izxVar, LiveData<Object> liveData, Continuation<? super CoroutineLiveDataKt$addDisposableSource$2> continuation) {
        super(2, continuation);
        this.$this_addDisposableSource = izxVar;
        this.$source = liveData;
    }

    /* JADX INFO: renamed from: h */
    public static Unit m2958h(izx izxVar, Object obj) {
        izxVar.mo2989o(obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoroutineLiveDataKt$addDisposableSource$2(this.$this_addDisposableSource, this.$source, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super EmittedSource> continuation) {
        return ((CoroutineLiveDataKt$addDisposableSource$2) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        uwp.m196133e();
        if (this.label != 0) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        final izx<Object> izxVar = this.$this_addDisposableSource;
        izxVar.m139076p(this.$source, new opb(new Function1() { // from class: androidx.lifecycle.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return CoroutineLiveDataKt$addDisposableSource$2.m2958h(izxVar, obj2);
            }
        }));
        return new EmittedSource(this.$source, this.$this_addDisposableSource);
    }
}
