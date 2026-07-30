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
import kotlinx.coroutines.InterfaceC15486o;
import kotlinx.coroutines.channels.ProduceKt;
import p149l.ad90;
import p149l.gz5;
import p149l.jh3;
import p149l.nee0;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"Ll/ad90;", "Landroidx/work/impl/constraints/a;", "", "<anonymous>", "(Ll/ad90;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", m87374f = "WorkConstraintsTracker.kt", m87375l = {178}, m87376m = "invokeSuspend")
public final class NetworkRequestConstraintController$track$1 extends SuspendLambda implements Function2<ad90<? super AbstractC0787a>, Continuation<? super Unit>, Object> {
    final /* synthetic */ gz5 $constraints;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NetworkRequestConstraintController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRequestConstraintController$track$1(gz5 gz5Var, NetworkRequestConstraintController networkRequestConstraintController, Continuation<? super NetworkRequestConstraintController$track$1> continuation) {
        super(2, continuation);
        this.$constraints = gz5Var;
        this.this$0 = networkRequestConstraintController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NetworkRequestConstraintController$track$1 networkRequestConstraintController$track$1 = new NetworkRequestConstraintController$track$1(this.$constraints, this.this$0, continuation);
        networkRequestConstraintController$track$1.L$0 = obj;
        return networkRequestConstraintController$track$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ad90<? super AbstractC0787a> ad90Var, Continuation<? super Unit> continuation) {
        return ((NetworkRequestConstraintController$track$1) create(ad90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            final ad90 ad90Var = (ad90) this.L$0;
            NetworkRequest networkRequestM128823d = this.$constraints.m128823d();
            if (networkRequestM128823d == null) {
                nee0.C18682a.m159110a(ad90Var.getChannel(), null, 1, null);
                return Unit.INSTANCE;
            }
            final InterfaceC15486o interfaceC15486oM141367d = jh3.m141367d(ad90Var, null, null, new NetworkRequestConstraintController$track$1$timeoutJob$1(this.this$0, ad90Var, null), 3, null);
            Function1<AbstractC0787a, Unit> function1 = new Function1<AbstractC0787a, Unit>() { // from class: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$onConstraintState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AbstractC0787a abstractC0787a) {
                    abstractC0787a.getClass();
                    InterfaceC15486o.a.m94245a(interfaceC15486oM141367d, null, 1, null);
                    ad90Var.mo93791l(abstractC0787a);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AbstractC0787a abstractC0787a) {
                    invoke2(abstractC0787a);
                    return Unit.INSTANCE;
                }
            };
            final Function0<Unit> function0M4577c = Build.VERSION.SDK_INT >= 30 ? SharedNetworkCallback.INSTANCE.m4577c(this.this$0.connManager, networkRequestM128823d, function1) : IndividualNetworkCallback.INSTANCE.m4569a(this.this$0.connManager, networkRequestM128823d, function1);
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
                    function0M4577c.invoke();
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
