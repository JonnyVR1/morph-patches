package androidx.lifecycle;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C15487p;
import kotlinx.coroutines.DelayKt;
import p149l.ad90;
import p149l.d4e;
import p149l.hh3;
import p149l.hpw;
import p149l.j6f;
import p149l.n250;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/ad90;", "", "<anonymous>", "(Ll/ad90;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", m87374f = "FlowLiveData.kt", m87375l = {105, 106, 108}, m87376m = "invokeSuspend")
final class FlowLiveDataConversions$asFlow$1 extends SuspendLambda implements Function2<ad90<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ LiveData<Object> $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
    @DebugMetadata(m87373c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", m87374f = "FlowLiveData.kt", m87375l = {}, m87376m = "invokeSuspend")
    public static final class C04511 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ n250<Object> $observer;
        final /* synthetic */ LiveData<Object> $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04511(LiveData<Object> liveData, n250<Object> n250Var, Continuation<? super C04511> continuation) {
            super(2, continuation);
            this.$this_asFlow = liveData;
            this.$observer = n250Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C04511(this.$this_asFlow, this.$observer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return ((C04511) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            uwp.m196133e();
            if (this.label != 0) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
            this.$this_asFlow.m2984j(this.$observer);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
    @DebugMetadata(m87373c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", m87374f = "FlowLiveData.kt", m87375l = {}, m87376m = "invokeSuspend")
    public static final class C04522 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ n250<Object> $observer;
        final /* synthetic */ LiveData<Object> $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04522(LiveData<Object> liveData, n250<Object> n250Var, Continuation<? super C04522> continuation) {
            super(2, continuation);
            this.$this_asFlow = liveData;
            this.$observer = n250Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C04522(this.$this_asFlow, this.$observer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return ((C04522) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            uwp.m196133e();
            if (this.label != 0) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
            this.$this_asFlow.mo2988n(this.$observer);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asFlow$1(LiveData<Object> liveData, Continuation<? super FlowLiveDataConversions$asFlow$1> continuation) {
        super(2, continuation);
        this.$this_asFlow = liveData;
    }

    /* JADX INFO: renamed from: h */
    public static void m2961h(ad90 ad90Var, Object obj) {
        ad90Var.mo93791l(obj);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.$this_asFlow, continuation);
        flowLiveDataConversions$asFlow$1.L$0 = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ad90<Object> ad90Var, Continuation<? super Unit> continuation) {
        return ((FlowLiveDataConversions$asFlow$1) create(ad90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.n250] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        n250 n250Var;
        Object objM196133e = uwp.m196133e();
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                ResultKt.m87239b(obj);
                final ad90 ad90Var = (ad90) this.L$0;
                n250 n250Var2 = new n250() { // from class: androidx.lifecycle.c
                    @Override // p149l.n250
                    public final void onChanged(Object obj2) {
                        FlowLiveDataConversions$asFlow$1.m2961h(ad90Var, obj2);
                    }
                };
                hpw immediate = d4e.m109982c().getImmediate();
                C04511 c04511 = new C04511(this.$this_asFlow, n250Var2, null);
                this.L$0 = n250Var2;
                this.label = 1;
                n250Var = n250Var2;
                if (hh3.m130938g(immediate, c04511, this) == objM196133e) {
                }
                return objM196133e;
            }
            if (r1 == 1) {
                n250 n250Var3 = (n250) this.L$0;
                ResultKt.m87239b(obj);
                n250Var = n250Var3;
            } else {
                if (r1 != 2) {
                    if (r1 != 3) {
                        qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th = (Throwable) this.L$0;
                    ResultKt.m87239b(obj);
                    throw th;
                }
                n250 n250Var4 = (n250) this.L$0;
                ResultKt.m87239b(obj);
                r1 = n250Var4;
            }
            throw new KotlinNothingValueException();
            this.L$0 = n250Var;
            this.label = 2;
            r1 = n250Var;
            if (DelayKt.m93610a(this) == objM196133e) {
                return objM196133e;
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th2) {
            CoroutineContext coroutineContextPlus = d4e.m109982c().getImmediate().plus(C15487p.INSTANCE);
            C04522 c04522 = new C04522(this.$this_asFlow, r1, null);
            this.L$0 = th2;
            this.label = 3;
            if (hh3.m130938g(coroutineContextPlus, c04522, this) != objM196133e) {
                throw th2;
            }
        }
    }
}
