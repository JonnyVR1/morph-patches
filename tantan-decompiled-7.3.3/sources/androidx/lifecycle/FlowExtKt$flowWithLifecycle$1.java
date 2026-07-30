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
import p153l.drb;
import p153l.el90;
import p153l.p7f;
import p153l.sme0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/el90;", "", "<anonymous>", "(Ll/el90;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", m88263f = "FlowExt.kt", m88264l = {90}, m88265m = "invokeSuspend")
final class FlowExtKt$flowWithLifecycle$1 extends SuspendLambda implements Function2<el90<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ aui<Object> $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
    @DebugMetadata(m88262c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", m88263f = "FlowExt.kt", m88264l = {90}, m88265m = "invokeSuspend")
    public static final class C04511 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ el90<Object> $$this$callbackFlow;
        final /* synthetic */ aui<Object> $this_flowWithLifecycle;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1$a */
        @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
        public static final class a<T> implements bui {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ el90<T> f2264a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(el90<? super T> el90Var) {
                this.f2264a = el90Var;
            }

            @Override // p153l.bui
            public final Object emit(T t, Continuation<? super Unit> continuation) {
                Object objMo94679E = this.f2264a.mo94679E(t, continuation);
                return objMo94679E == uyp.m198688e() ? objMo94679E : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04511(aui<Object> auiVar, el90<Object> el90Var, Continuation<? super C04511> continuation) {
            super(2, continuation);
            this.$this_flowWithLifecycle = auiVar;
            this.$$this$callbackFlow = el90Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C04511(this.$this_flowWithLifecycle, this.$$this$callbackFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
            return ((C04511) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m88128b(obj);
                aui<Object> auiVar = this.$this_flowWithLifecycle;
                a aVar = new a(this.$$this$callbackFlow);
                this.label = 1;
                if (auiVar.collect(aVar, this) == objM198688e) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, aui<Object> auiVar, Continuation<? super FlowExtKt$flowWithLifecycle$1> continuation) {
        super(2, continuation);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = auiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, continuation);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(el90<Object> el90Var, Continuation<? super Unit> continuation) {
        return ((FlowExtKt$flowWithLifecycle$1) create(el90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        el90 el90Var;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            el90 el90Var2 = (el90) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            C04511 c04511 = new C04511(this.$this_flowWithLifecycle, el90Var2, null);
            this.L$0 = el90Var2;
            this.label = 1;
            if (RepeatOnLifecycleKt.m2998a(lifecycle, state, c04511, this) == objM198688e) {
                return objM198688e;
            }
            el90Var = el90Var2;
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            el90Var = (el90) this.L$0;
            ResultKt.m88128b(obj);
        }
        sme0.C20105a.m186808a(el90Var, null, 1, null);
        return Unit.INSTANCE;
    }
}
