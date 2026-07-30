package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.AbstractC0789a;
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
import p153l.el90;
import p153l.h06;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/el90;", "Landroidx/work/impl/constraints/a;", "", "<anonymous>", "(Ll/el90;)V"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", m88263f = "ContraintControllers.kt", m88264l = {63}, m88265m = "invokeSuspend")
public final class BaseConstraintController$track$1 extends SuspendLambda implements Function2<el90<? super AbstractC0789a>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseConstraintController<T> this$0;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$a */
    @Metadata(m88120d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"androidx/work/impl/constraints/controllers/BaseConstraintController$track$1$a", "Ll/h06;", Constants.KEY_NEW_VALUE, "", "a", "(Ljava/lang/Object;)V", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C0791a<T> implements h06<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseConstraintController<T> f3591a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ el90<AbstractC0789a> f3592b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0791a(BaseConstraintController<T> baseConstraintController, el90<? super AbstractC0789a> el90Var) {
            this.f3591a = baseConstraintController;
            this.f3592b = el90Var;
        }

        @Override // p153l.h06
        /* JADX INFO: renamed from: a */
        public void mo4590a(T newValue) {
            this.f3592b.getChannel().mo94683l(this.f3591a.mo4589f(newValue) ? new AbstractC0789a.b(this.f3591a.getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String()) : AbstractC0789a.a.INSTANCE);
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
    public final Object invoke(el90<? super AbstractC0789a> el90Var, Continuation<? super Unit> continuation) {
        return ((BaseConstraintController$track$1) create(el90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            el90 el90Var = (el90) this.L$0;
            final C0791a c0791a = new C0791a(this.this$0, el90Var);
            this.this$0.tracker.m142907b(c0791a);
            final BaseConstraintController<T> baseConstraintController = this.this$0;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    baseConstraintController.tracker.m142909e(c0791a);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
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
