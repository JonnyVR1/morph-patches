package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.AbstractC0787a;
import com.clevertap.android.sdk.Constants;
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
import p149l.cz5;
import p149l.j6f;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/ad90;", "Landroidx/work/impl/constraints/a;", "", "<anonymous>", "(Ll/ad90;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", m87374f = "ContraintControllers.kt", m87375l = {63}, m87376m = "invokeSuspend")
public final class BaseConstraintController$track$1 extends SuspendLambda implements Function2<ad90<? super AbstractC0787a>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseConstraintController<T> this$0;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$a */
    @Metadata(m87231d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"androidx/work/impl/constraints/controllers/BaseConstraintController$track$1$a", "Ll/cz5;", Constants.KEY_NEW_VALUE, "", "a", "(Ljava/lang/Object;)V", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C0789a<T> implements cz5<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseConstraintController<T> f3591a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ad90<AbstractC0787a> f3592b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0789a(BaseConstraintController<T> baseConstraintController, ad90<? super AbstractC0787a> ad90Var) {
            this.f3591a = baseConstraintController;
            this.f3592b = ad90Var;
        }

        @Override // p149l.cz5
        /* JADX INFO: renamed from: a */
        public void mo4588a(T newValue) {
            this.f3592b.getChannel().mo93791l(this.f3591a.mo4587f(newValue) ? new AbstractC0787a.b(this.f3591a.getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String()) : AbstractC0787a.a.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseConstraintController$track$1(BaseConstraintController<T> baseConstraintController, Continuation<? super BaseConstraintController$track$1> continuation) {
        super(2, continuation);
        this.this$0 = baseConstraintController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseConstraintController$track$1 baseConstraintController$track$1 = new BaseConstraintController$track$1(this.this$0, continuation);
        baseConstraintController$track$1.L$0 = obj;
        return baseConstraintController$track$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ad90<? super AbstractC0787a> ad90Var, Continuation<? super Unit> continuation) {
        return ((BaseConstraintController$track$1) create(ad90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            ad90 ad90Var = (ad90) this.L$0;
            final C0789a c0789a = new C0789a(this.this$0, ad90Var);
            this.this$0.tracker.m118841b(c0789a);
            final BaseConstraintController<T> baseConstraintController = this.this$0;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    baseConstraintController.tracker.m118844e(c0789a);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
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
