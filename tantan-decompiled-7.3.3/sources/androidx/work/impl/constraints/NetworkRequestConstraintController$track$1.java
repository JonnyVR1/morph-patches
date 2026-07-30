package androidx.work.impl.constraints;

import android.net.NetworkRequest;
import android.os.Build;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC15593o;
import kotlinx.coroutines.channels.ProduceKt;
import p153l.el90;
import p153l.l06;
import p153l.sme0;
import p153l.uyp;
import p153l.wtq0;
import p153l.xh3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"Ll/el90;", "Landroidx/work/impl/constraints/a;", "", "<anonymous>", "(Ll/el90;)V"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", m88263f = "WorkConstraintsTracker.kt", m88264l = {178}, m88265m = "invokeSuspend")
public final class NetworkRequestConstraintController$track$1 extends SuspendLambda implements Function2<el90<? super AbstractC0789a>, Continuation<? super Unit>, Object> {
    final /* synthetic */ l06 $constraints;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NetworkRequestConstraintController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRequestConstraintController$track$1(l06 l06Var, NetworkRequestConstraintController networkRequestConstraintController, Continuation<? super NetworkRequestConstraintController$track$1> continuation) {
        super(2, continuation);
        this.$constraints = l06Var;
        this.this$0 = networkRequestConstraintController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NetworkRequestConstraintController$track$1 networkRequestConstraintController$track$1 = new NetworkRequestConstraintController$track$1(this.$constraints, this.this$0, continuation);
        networkRequestConstraintController$track$1.L$0 = obj;
        return networkRequestConstraintController$track$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(el90<? super AbstractC0789a> el90Var, Continuation<? super Unit> continuation) {
        return ((NetworkRequestConstraintController$track$1) create(el90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            final el90 el90Var = (el90) this.L$0;
            NetworkRequest networkRequestM152310d = this.$constraints.m152310d();
            if (networkRequestM152310d == null) {
                sme0.C20105a.m186808a(el90Var.getChannel(), null, 1, null);
                return Unit.INSTANCE;
            }
            final InterfaceC15593o interfaceC15593oM210980d = xh3.m210980d(el90Var, null, null, new NetworkRequestConstraintController$track$1$timeoutJob$1(this.this$0, el90Var, null), 3, null);
            Function1<AbstractC0789a, Unit> function1 = new Function1<AbstractC0789a, Unit>() { // from class: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$onConstraintState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AbstractC0789a abstractC0789a) {
                    abstractC0789a.getClass();
                    InterfaceC15593o.a.m95138a(interfaceC15593oM210980d, null, 1, null);
                    el90Var.mo94683l(abstractC0789a);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AbstractC0789a abstractC0789a) {
                    invoke2(abstractC0789a);
                    return Unit.INSTANCE;
                }
            };
            final Function0<Unit> function0M4579c = Build.VERSION.SDK_INT >= 30 ? SharedNetworkCallback.INSTANCE.m4579c(this.this$0.connManager, networkRequestM152310d, function1) : IndividualNetworkCallback.INSTANCE.m4571a(this.this$0.connManager, networkRequestM152310d, function1);
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    function0M4579c.invoke();
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
