package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p149l.ad90;
import p149l.eri;
import p149l.fri;
import p149l.j6f;
import p149l.nee0;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/ad90;", "", "<anonymous>", "(Ll/ad90;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", m87374f = "FlowExt.kt", m87375l = {90}, m87376m = "invokeSuspend")
final class FlowExtKt$flowWithLifecycle$1 extends SuspendLambda implements Function2<ad90<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ eri<Object> $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
    @DebugMetadata(m87373c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", m87374f = "FlowExt.kt", m87375l = {90}, m87376m = "invokeSuspend")
    public static final class C04501 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ ad90<Object> $$this$callbackFlow;
        final /* synthetic */ eri<Object> $this_flowWithLifecycle;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1$a */
        @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final class a<T> implements fri {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ad90<T> f2264a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(ad90<? super T> ad90Var) {
                this.f2264a = ad90Var;
            }

            @Override // p149l.fri
            public final Object emit(T t, Continuation<? super Unit> continuation) {
                Object objMo93787E = this.f2264a.mo93787E(t, continuation);
                return objMo93787E == uwp.m196133e() ? objMo93787E : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04501(eri<Object> eriVar, ad90<Object> ad90Var, Continuation<? super C04501> continuation) {
            super(2, continuation);
            this.$this_flowWithLifecycle = eriVar;
            this.$$this$callbackFlow = ad90Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C04501(this.$this_flowWithLifecycle, this.$$this$callbackFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return ((C04501) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                eri<Object> eriVar = this.$this_flowWithLifecycle;
                a aVar = new a(this.$$this$callbackFlow);
                this.label = 1;
                if (eriVar.collect(aVar, this) == objM196133e) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, eri<Object> eriVar, Continuation<? super FlowExtKt$flowWithLifecycle$1> continuation) {
        super(2, continuation);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = eriVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, continuation);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ad90<Object> ad90Var, Continuation<? super Unit> continuation) {
        return ((FlowExtKt$flowWithLifecycle$1) create(ad90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ad90 ad90Var;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            ad90 ad90Var2 = (ad90) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            C04501 c04501 = new C04501(this.$this_flowWithLifecycle, ad90Var2, null);
            this.L$0 = ad90Var2;
            this.label = 1;
            if (RepeatOnLifecycleKt.m2997a(lifecycle, state, c04501, this) == objM196133e) {
                return objM196133e;
            }
            ad90Var = ad90Var2;
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ad90Var = (ad90) this.L$0;
            ResultKt.m87239b(obj);
        }
        nee0.C18682a.m159110a(ad90Var, null, 1, null);
        return Unit.INSTANCE;
    }
}
