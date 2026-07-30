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
import kotlinx.coroutines.C15594p;
import kotlinx.coroutines.DelayKt;
import p153l.cb50;
import p153l.drb;
import p153l.el90;
import p153l.gsw;
import p153l.p7f;
import p153l.r5e;
import p153l.uyp;
import p153l.vh3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/el90;", "", "<anonymous>", "(Ll/el90;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", m88263f = "FlowLiveData.kt", m88264l = {105, 106, 108}, m88265m = "invokeSuspend")
final class FlowLiveDataConversions$asFlow$1 extends SuspendLambda implements Function2<el90<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ LiveData<Object> $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
    @DebugMetadata(m88262c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", m88263f = "FlowLiveData.kt", m88264l = {}, m88265m = "invokeSuspend")
    public static final class C04521 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ cb50<Object> $observer;
        final /* synthetic */ LiveData<Object> $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04521(LiveData<Object> liveData, cb50<Object> cb50Var, Continuation<? super C04521> continuation) {
            super(2, continuation);
            this.$this_asFlow = liveData;
            this.$observer = cb50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C04521(this.$this_asFlow, this.$observer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
            return ((C04521) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            uyp.m198688e();
            if (this.label != 0) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
            this.$this_asFlow.m2985j(this.$observer);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
    @DebugMetadata(m88262c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", m88263f = "FlowLiveData.kt", m88264l = {}, m88265m = "invokeSuspend")
    public static final class C04532 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ cb50<Object> $observer;
        final /* synthetic */ LiveData<Object> $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04532(LiveData<Object> liveData, cb50<Object> cb50Var, Continuation<? super C04532> continuation) {
            super(2, continuation);
            this.$this_asFlow = liveData;
            this.$observer = cb50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C04532(this.$this_asFlow, this.$observer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
            return ((C04532) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            uyp.m198688e();
            if (this.label != 0) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
            this.$this_asFlow.mo2989n(this.$observer);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asFlow$1(LiveData<Object> liveData, Continuation<? super FlowLiveDataConversions$asFlow$1> continuation) {
        super(2, continuation);
        this.$this_asFlow = liveData;
    }

    /* JADX INFO: renamed from: h */
    public static void m2962h(el90 el90Var, Object obj) {
        el90Var.mo94683l(obj);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.$this_asFlow, continuation);
        flowLiveDataConversions$asFlow$1.L$0 = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(el90<Object> el90Var, Continuation<? super Unit> continuation) {
        return ((FlowLiveDataConversions$asFlow$1) create(el90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.cb50] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        cb50 cb50Var;
        Object objM198688e = uyp.m198688e();
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                ResultKt.m88128b(obj);
                final el90 el90Var = (el90) this.L$0;
                cb50 cb50Var2 = new cb50() { // from class: androidx.lifecycle.c
                    @Override // p153l.cb50
                    public final void onChanged(Object obj2) {
                        FlowLiveDataConversions$asFlow$1.m2962h(el90Var, obj2);
                    }
                };
                gsw immediate = r5e.m179862c().getImmediate();
                C04521 c04521 = new C04521(this.$this_asFlow, cb50Var2, null);
                this.L$0 = cb50Var2;
                this.label = 1;
                cb50Var = cb50Var2;
                if (vh3.m201255g(immediate, c04521, this) == objM198688e) {
                }
                return objM198688e;
            }
            if (r1 == 1) {
                cb50 cb50Var3 = (cb50) this.L$0;
                ResultKt.m88128b(obj);
                cb50Var = cb50Var3;
            } else {
                if (r1 != 2) {
                    if (r1 != 3) {
                        wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th = (Throwable) this.L$0;
                    ResultKt.m88128b(obj);
                    throw th;
                }
                cb50 cb50Var4 = (cb50) this.L$0;
                ResultKt.m88128b(obj);
                r1 = cb50Var4;
            }
            throw new KotlinNothingValueException();
            this.L$0 = cb50Var;
            this.label = 2;
            r1 = cb50Var;
            if (DelayKt.m94501a(this) == objM198688e) {
                return objM198688e;
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th2) {
            CoroutineContext coroutineContextPlus = r5e.m179862c().getImmediate().plus(C15594p.INSTANCE);
            C04532 c04532 = new C04532(this.$this_asFlow, r1, null);
            this.L$0 = th2;
            this.label = 3;
            if (vh3.m201255g(coroutineContextPlus, c04532, this) != objM198688e) {
                throw th2;
            }
        }
    }
}
