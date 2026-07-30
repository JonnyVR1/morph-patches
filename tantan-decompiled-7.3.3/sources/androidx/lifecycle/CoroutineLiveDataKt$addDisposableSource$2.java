package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p153l.crb;
import p153l.drb;
import p153l.f8y;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "Landroidx/lifecycle/EmittedSource;", "<anonymous>", "(Ll/drb;)Landroidx/lifecycle/EmittedSource;"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", m88263f = "CoroutineLiveData.kt", m88264l = {}, m88265m = "invokeSuspend")
final class CoroutineLiveDataKt$addDisposableSource$2 extends SuspendLambda implements Function2<drb, Continuation<? super EmittedSource>, Object> {
    final /* synthetic */ LiveData<Object> $source;
    final /* synthetic */ f8y<Object> $this_addDisposableSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveDataKt$addDisposableSource$2(f8y<Object> f8yVar, LiveData<Object> liveData, Continuation<? super CoroutineLiveDataKt$addDisposableSource$2> continuation) {
        super(2, continuation);
        this.$this_addDisposableSource = f8yVar;
        this.$source = liveData;
    }

    /* JADX INFO: renamed from: h */
    public static Unit m2959h(f8y f8yVar, Object obj) {
        f8yVar.mo2990o(obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoroutineLiveDataKt$addDisposableSource$2(this.$this_addDisposableSource, this.$source, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super EmittedSource> continuation) {
        return ((CoroutineLiveDataKt$addDisposableSource$2) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        final f8y<Object> f8yVar = this.$this_addDisposableSource;
        f8yVar.m124573p(this.$source, new crb(new Function1() { // from class: androidx.lifecycle.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return CoroutineLiveDataKt$addDisposableSource$2.m2959h(f8yVar, obj2);
            }
        }));
        return new EmittedSource(this.$source, this.$this_addDisposableSource);
    }
}
