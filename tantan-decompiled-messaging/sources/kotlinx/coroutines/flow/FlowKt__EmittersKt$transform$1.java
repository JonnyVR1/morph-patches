package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.j6f;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "R", "Ll/fri;", "", "<anonymous>", "(Ll/fri;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", m87374f = "Emitters.kt", m87375l = {36}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class FlowKt__EmittersKt$transform$1 extends SuspendLambda implements Function2<fri<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ eri<Object> $this_transform;
    final /* synthetic */ Function3<fri<Object>, Object, Continuation<? super Unit>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1 */
    @Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 176)
    @SourceDebugExtension
    public static final class C154341<T> implements fri {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function3<fri<Object>, T, Continuation<? super Unit>, Object> f66812a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ fri<Object> f66813b;

        /* JADX WARN: Multi-variable type inference failed */
        public C154341(Function3<? super fri<Object>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, fri<Object> friVar) {
            this.f66812a = function3;
            this.f66813b = friVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p149l.fri
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
            FlowKt__EmittersKt$transform$1$1$emit$1 flowKt__EmittersKt$transform$1$1$emit$1;
            if (continuation instanceof FlowKt__EmittersKt$transform$1$1$emit$1) {
                flowKt__EmittersKt$transform$1$1$emit$1 = (FlowKt__EmittersKt$transform$1$1$emit$1) continuation;
                int i = flowKt__EmittersKt$transform$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    flowKt__EmittersKt$transform$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    flowKt__EmittersKt$transform$1$1$emit$1 = new FlowKt__EmittersKt$transform$1$1$emit$1(this, continuation);
                }
            } else {
                flowKt__EmittersKt$transform$1$1$emit$1 = new FlowKt__EmittersKt$transform$1$1$emit$1(this, continuation);
            }
            Object obj = flowKt__EmittersKt$transform$1$1$emit$1.result;
            Object objM196133e = uwp.m196133e();
            int i2 = flowKt__EmittersKt$transform$1$1$emit$1.label;
            if (i2 == 0) {
                ResultKt.m87239b(obj);
                Function3<fri<Object>, T, Continuation<? super Unit>, Object> function3 = this.f66812a;
                fri<Object> friVar = this.f66813b;
                flowKt__EmittersKt$transform$1$1$emit$1.label = 1;
                if (function3.invoke(friVar, t, flowKt__EmittersKt$transform$1$1$emit$1) == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i2 != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$transform$1(eri<Object> eriVar, Function3<? super fri<Object>, Object, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super FlowKt__EmittersKt$transform$1> continuation) {
        super(2, continuation);
        this.$this_transform = eriVar;
        this.$transform = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__EmittersKt$transform$1 flowKt__EmittersKt$transform$1 = new FlowKt__EmittersKt$transform$1(this.$this_transform, this.$transform, continuation);
        flowKt__EmittersKt$transform$1.L$0 = obj;
        return flowKt__EmittersKt$transform$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull fri<Object> friVar, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__EmittersKt$transform$1) create(friVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            fri friVar = (fri) this.L$0;
            eri<Object> eriVar = this.$this_transform;
            C154341 c154341 = new C154341(this.$transform, friVar);
            this.label = 1;
            if (eriVar.collect(c154341, this) == objM196133e) {
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

    @Nullable
    public final Object invokeSuspend$$forInline(@NotNull Object obj) {
        fri friVar = (fri) this.L$0;
        eri<Object> eriVar = this.$this_transform;
        C154341 c154341 = new C154341(this.$transform, friVar);
        InlineMarker.m87484c(0);
        eriVar.collect(c154341, this);
        InlineMarker.m87484c(1);
        return Unit.INSTANCE;
    }
}
