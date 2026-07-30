package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p149l.eri;
import p149l.f6s;
import p149l.fri;
import p149l.j6f;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/f6s;", "", "<anonymous>", "(Ll/f6s;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", m87374f = "FlowLiveData.kt", m87375l = {78}, m87376m = "invokeSuspend")
final class FlowLiveDataConversions$asLiveData$1 extends SuspendLambda implements Function2<f6s<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ eri<Object> $this_asLiveData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$a */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C0453a<T> implements fri {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f6s<T> f2265a;

        public C0453a(f6s<T> f6sVar) {
            this.f2265a = f6sVar;
        }

        @Override // p149l.fri
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            Object objEmit = this.f2265a.emit(t, continuation);
            return objEmit == uwp.m196133e() ? objEmit : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asLiveData$1(eri<Object> eriVar, Continuation<? super FlowLiveDataConversions$asLiveData$1> continuation) {
        super(2, continuation);
        this.$this_asLiveData = eriVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(this.$this_asLiveData, continuation);
        flowLiveDataConversions$asLiveData$1.L$0 = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(f6s<Object> f6sVar, Continuation<? super Unit> continuation) {
        return ((FlowLiveDataConversions$asLiveData$1) create(f6sVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            f6s f6sVar = (f6s) this.L$0;
            eri<Object> eriVar = this.$this_asLiveData;
            C0453a c0453a = new C0453a(f6sVar);
            this.label = 1;
            if (eriVar.collect(c0453a, this) == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
        }
        return Unit.INSTANCE;
    }
}
