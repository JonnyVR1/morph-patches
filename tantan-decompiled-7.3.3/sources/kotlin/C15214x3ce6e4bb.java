package kotlin;

import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import p153l.cjd;

/* JADX INFO: renamed from: kotlin.DeepRecursiveScopeImpl$crossFunctionCompletion$$inlined$Continuation$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0002\u0010\nR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b¸\u0006\u0000"}, m88121d2 = {"kotlin/coroutines/ContinuationKt$Continuation$1", "Lkotlin/coroutines/Continuation;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "resumeWith", "", LovePlanetStage.result, "Lkotlin/Result;", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C15214x3ce6e4bb implements Continuation<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoroutineContext f64053a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function3 f64054b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Continuation f64055c;

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public CoroutineContext getF64053a() {
        return this.f64053a;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        cjd.m110111c(null, this.f64054b);
        cjd.m110110b(null, this.f64055c);
        cjd.m110112d(null, result);
    }
}
