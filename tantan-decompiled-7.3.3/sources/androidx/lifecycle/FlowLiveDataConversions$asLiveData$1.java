package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p153l.aui;
import p153l.bui;
import p153l.g8s;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/g8s;", "", "<anonymous>", "(Ll/g8s;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", m88263f = "FlowLiveData.kt", m88264l = {78}, m88265m = "invokeSuspend")
final class FlowLiveDataConversions$asLiveData$1 extends SuspendLambda implements Function2<g8s<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ aui<Object> $this_asLiveData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$a */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C0454a<T> implements bui {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g8s<T> f2265a;

        public C0454a(g8s<T> g8sVar) {
            this.f2265a = g8sVar;
        }

        @Override // p153l.bui
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            Object objEmit = this.f2265a.emit(t, continuation);
            return objEmit == uyp.m198688e() ? objEmit : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asLiveData$1(aui<Object> auiVar, Continuation<? super FlowLiveDataConversions$asLiveData$1> continuation) {
        super(2, continuation);
        this.$this_asLiveData = auiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(this.$this_asLiveData, continuation);
        flowLiveDataConversions$asLiveData$1.L$0 = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(g8s<Object> g8sVar, Continuation<? super Unit> continuation) {
        return ((FlowLiveDataConversions$asLiveData$1) create(g8sVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            g8s g8sVar = (g8s) this.L$0;
            aui<Object> auiVar = this.$this_asLiveData;
            C0454a c0454a = new C0454a(g8sVar);
            this.label = 1;
            if (auiVar.collect(c0454a, this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        return Unit.INSTANCE;
    }
}
