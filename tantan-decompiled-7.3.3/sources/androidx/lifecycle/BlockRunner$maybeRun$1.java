package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.drb;
import p153l.k43;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "androidx.lifecycle.BlockRunner$maybeRun$1", m88263f = "CoroutineLiveData.kt", m88264l = {CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256}, m88265m = "invokeSuspend")
final class BlockRunner$maybeRun$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k43<Object> this$0;

    public BlockRunner$maybeRun$1(k43<Object> k43Var, Continuation<? super BlockRunner$maybeRun$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BlockRunner$maybeRun$1 blockRunner$maybeRun$1 = new BlockRunner$maybeRun$1(null, continuation);
        blockRunner$maybeRun$1.L$0 = obj;
        return blockRunner$maybeRun$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((BlockRunner$maybeRun$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            drb drbVar = (drb) this.L$0;
            k43.m148219b(null);
            LiveDataScopeImpl liveDataScopeImpl = new LiveDataScopeImpl(null, drbVar.getCoroutineContext());
            Function2 function2M148218a = k43.m148218a(null);
            this.label = 1;
            if (function2M148218a.invoke(liveDataScopeImpl, this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        k43.m148220c(null).invoke();
        return Unit.INSTANCE;
    }
}
