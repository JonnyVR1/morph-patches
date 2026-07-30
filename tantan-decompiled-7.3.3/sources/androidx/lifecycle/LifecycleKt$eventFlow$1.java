package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import p153l.el90;
import p153l.ker;
import p153l.sme0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"Ll/el90;", "Landroidx/lifecycle/Lifecycle$Event;", "", "<anonymous>", "(Ll/el90;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "androidx.lifecycle.LifecycleKt$eventFlow$1", m88263f = "Lifecycle.kt", m88264l = {373}, m88265m = "invokeSuspend")
final class LifecycleKt$eventFlow$1 extends SuspendLambda implements Function2<el90<? super Lifecycle.Event>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Lifecycle $this_eventFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleKt$eventFlow$1(Lifecycle lifecycle, Continuation<? super LifecycleKt$eventFlow$1> continuation) {
        super(2, continuation);
        this.$this_eventFlow = lifecycle;
    }

    /* JADX INFO: renamed from: h */
    public static Unit m2975h(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        lifecycle.mo2970d(lifecycleEventObserver);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static void m2976j(el90 el90Var, ker kerVar, Lifecycle.Event event) {
        el90Var.mo94683l(event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            sme0.C20105a.m186808a(el90Var, null, 1, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.$this_eventFlow, continuation);
        lifecycleKt$eventFlow$1.L$0 = obj;
        return lifecycleKt$eventFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(el90<? super Lifecycle.Event> el90Var, Continuation<? super Unit> continuation) {
        return ((LifecycleKt$eventFlow$1) create(el90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            final el90 el90Var = (el90) this.L$0;
            final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.h
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(ker kerVar, Lifecycle.Event event) {
                    LifecycleKt$eventFlow$1.m2976j(el90Var, kerVar, event);
                }
            };
            this.$this_eventFlow.mo2967a(lifecycleEventObserver);
            final Lifecycle lifecycle = this.$this_eventFlow;
            Function0 function0 = new Function0() { // from class: androidx.lifecycle.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LifecycleKt$eventFlow$1.m2975h(lifecycle, lifecycleEventObserver);
                }
            };
            this.label = 1;
            if (ProduceKt.m94871a(el90Var, function0, this) == objM198688e) {
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
