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
import p149l.ad90;
import p149l.jcr;
import p149l.nee0;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"Ll/ad90;", "Landroidx/lifecycle/Lifecycle$Event;", "", "<anonymous>", "(Ll/ad90;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "androidx.lifecycle.LifecycleKt$eventFlow$1", m87374f = "Lifecycle.kt", m87375l = {373}, m87376m = "invokeSuspend")
final class LifecycleKt$eventFlow$1 extends SuspendLambda implements Function2<ad90<? super Lifecycle.Event>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Lifecycle $this_eventFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleKt$eventFlow$1(Lifecycle lifecycle, Continuation<? super LifecycleKt$eventFlow$1> continuation) {
        super(2, continuation);
        this.$this_eventFlow = lifecycle;
    }

    /* JADX INFO: renamed from: h */
    public static Unit m2974h(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        lifecycle.mo2969d(lifecycleEventObserver);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static void m2975j(ad90 ad90Var, jcr jcrVar, Lifecycle.Event event) {
        ad90Var.mo93791l(event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            nee0.C18682a.m159110a(ad90Var, null, 1, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.$this_eventFlow, continuation);
        lifecycleKt$eventFlow$1.L$0 = obj;
        return lifecycleKt$eventFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ad90<? super Lifecycle.Event> ad90Var, Continuation<? super Unit> continuation) {
        return ((LifecycleKt$eventFlow$1) create(ad90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            final ad90 ad90Var = (ad90) this.L$0;
            final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.h
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(jcr jcrVar, Lifecycle.Event event) {
                    LifecycleKt$eventFlow$1.m2975j(ad90Var, jcrVar, event);
                }
            };
            this.$this_eventFlow.mo2966a(lifecycleEventObserver);
            final Lifecycle lifecycle = this.$this_eventFlow;
            Function0 function0 = new Function0() { // from class: androidx.lifecycle.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LifecycleKt$eventFlow$1.m2974h(lifecycle, lifecycleEventObserver);
                }
            };
            this.label = 1;
            if (ProduceKt.m93979a(ad90Var, function0, this) == objM196133e) {
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
