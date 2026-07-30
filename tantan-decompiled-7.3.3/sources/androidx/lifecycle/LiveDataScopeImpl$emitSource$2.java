package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.spongycastle.asn1.eac.EACTags;
import p153l.drb;
import p153l.uyp;
import p153l.wtq0;
import p153l.z5e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "Ll/z5e;", "<anonymous>", "(Ll/drb;)Ll/z5e;"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", m88263f = "CoroutineLiveData.kt", m88264l = {EACTags.TAG_LIST}, m88265m = "invokeSuspend")
final class LiveDataScopeImpl$emitSource$2 extends SuspendLambda implements Function2<drb, Continuation<? super z5e>, Object> {
    final /* synthetic */ LiveData<Object> $source;
    int label;
    final /* synthetic */ LiveDataScopeImpl<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDataScopeImpl$emitSource$2(LiveDataScopeImpl<Object> liveDataScopeImpl, LiveData<Object> liveData, Continuation<? super LiveDataScopeImpl$emitSource$2> continuation) {
        super(2, continuation);
        this.this$0 = liveDataScopeImpl;
        this.$source = liveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveDataScopeImpl$emitSource$2(this.this$0, this.$source, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super z5e> continuation) {
        return ((LiveDataScopeImpl$emitSource$2) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            this.this$0.m2991a();
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            ResultKt.m88128b(obj);
            return obj;
        }
        wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
