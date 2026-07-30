package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aui;
import p153l.bui;
import p153l.drb;
import p153l.fpq;
import p153l.gmc0;
import p153l.mo5;
import p153l.p3g0;
import p153l.p7f;
import p153l.q3g0;
import p153l.u120;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", m88263f = "Share.kt", m88264l = {336}, m88265m = "invokeSuspend")
final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ mo5<p3g0<Object>> $result;
    final /* synthetic */ aui<Object> $upstream;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$a */
    @Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C15558a<T> implements bui {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.ObjectRef<u120<T>> f67522a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ drb f67523b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ mo5<p3g0<T>> f67524c;

        public C15558a(Ref.ObjectRef<u120<T>> objectRef, drb drbVar, mo5<p3g0<T>> mo5Var) {
            this.f67522a = objectRef;
            this.f67523b = drbVar;
            this.f67524c = mo5Var;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, l.p3g0, l.u120] */
        @Override // p153l.bui
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            Unit unit;
            u120<T> u120Var = this.f67522a.element;
            if (u120Var != null) {
                u120Var.setValue(t);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                drb drbVar = this.f67523b;
                Ref.ObjectRef<u120<T>> objectRef = this.f67522a;
                mo5<p3g0<T>> mo5Var = this.f67524c;
                ?? r3 = (T) q3g0.m175121a(t);
                mo5Var.mo159237h(new gmc0(r3, fpq.m126713l(drbVar.getCoroutineContext())));
                objectRef.element = r3;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharingDeferred$1(aui<Object> auiVar, mo5<p3g0<Object>> mo5Var, Continuation<? super FlowKt__ShareKt$launchSharingDeferred$1> continuation) {
        super(2, continuation);
        this.$upstream = auiVar;
        this.$result = mo5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.$upstream, this.$result, continuation);
        flowKt__ShareKt$launchSharingDeferred$1.L$0 = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Unit] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.m88128b(obj);
                drb drbVar = (drb) this.L$0;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                aui<Object> auiVar = this.$upstream;
                C15558a c15558a = new C15558a(objectRef, drbVar, this.$result);
                this.label = 1;
                if (auiVar.collect(c15558a, this) == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
            }
            this = Unit.INSTANCE;
            return this;
        } catch (Throwable th) {
            this.$result.mo159236g(th);
            throw th;
        }
    }
}
