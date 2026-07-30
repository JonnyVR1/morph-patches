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
import p149l.eri;
import p149l.fri;
import p149l.gnq;
import p149l.gvf0;
import p149l.hvf0;
import p149l.in5;
import p149l.j6f;
import p149l.mt10;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;
import p149l.zdc0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", m87374f = "Share.kt", m87375l = {336}, m87376m = "invokeSuspend")
final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ in5<gvf0<Object>> $result;
    final /* synthetic */ eri<Object> $upstream;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$a */
    @Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C15451a<T> implements fri {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.ObjectRef<mt10<T>> f66848a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ppb f66849b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ in5<gvf0<T>> f66850c;

        public C15451a(Ref.ObjectRef<mt10<T>> objectRef, ppb ppbVar, in5<gvf0<T>> in5Var) {
            this.f66848a = objectRef;
            this.f66849b = ppbVar;
            this.f66850c = in5Var;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, l.gvf0, l.mt10] */
        @Override // p149l.fri
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            Unit unit;
            mt10<T> mt10Var = this.f66848a.element;
            if (mt10Var != null) {
                mt10Var.setValue(t);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                ppb ppbVar = this.f66849b;
                Ref.ObjectRef<mt10<T>> objectRef = this.f66848a;
                in5<gvf0<T>> in5Var = this.f66850c;
                ?? r3 = (T) hvf0.m133163a(t);
                in5Var.mo137124h(new zdc0(r3, gnq.m127171l(ppbVar.getCoroutineContext())));
                objectRef.element = r3;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharingDeferred$1(eri<Object> eriVar, in5<gvf0<Object>> in5Var, Continuation<? super FlowKt__ShareKt$launchSharingDeferred$1> continuation) {
        super(2, continuation);
        this.$upstream = eriVar;
        this.$result = in5Var;
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
    public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Unit] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.m87239b(obj);
                ppb ppbVar = (ppb) this.L$0;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                eri<Object> eriVar = this.$upstream;
                C15451a c15451a = new C15451a(objectRef, ppbVar, this.$result);
                this.label = 1;
                if (eriVar.collect(c15451a, this) == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
            }
            this = Unit.INSTANCE;
            return this;
        } catch (Throwable th) {
            this.$result.mo137123g(th);
            throw th;
        }
    }
}
