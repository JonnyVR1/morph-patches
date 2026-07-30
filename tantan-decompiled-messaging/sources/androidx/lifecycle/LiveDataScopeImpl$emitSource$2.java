package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.spongycastle.asn1.eac.EACTags;
import p149l.l4e;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "Ll/l4e;", "<anonymous>", "(Ll/ppb;)Ll/l4e;"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", m87374f = "CoroutineLiveData.kt", m87375l = {EACTags.TAG_LIST}, m87376m = "invokeSuspend")
final class LiveDataScopeImpl$emitSource$2 extends SuspendLambda implements Function2<ppb, Continuation<? super l4e>, Object> {
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
    public final Object invoke(ppb ppbVar, Continuation<? super l4e> continuation) {
        return ((LiveDataScopeImpl$emitSource$2) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            this.this$0.m2990a();
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            ResultKt.m87239b(obj);
            return obj;
        }
        qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
