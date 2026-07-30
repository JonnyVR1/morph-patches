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
import p153l.aui;
import p153l.bui;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "R", "Ll/bui;", "", "<anonymous>", "(Ll/bui;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", m88263f = "Emitters.kt", m88264l = {36}, m88265m = "invokeSuspend")
@SourceDebugExtension
public final class FlowKt__EmittersKt$transform$1 extends SuspendLambda implements Function2<bui<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ aui<Object> $this_transform;
    final /* synthetic */ Function3<bui<Object>, Object, Continuation<? super Unit>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1 */
    @Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 176)
    @SourceDebugExtension
    public static final class C155411<T> implements bui {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function3<bui<Object>, T, Continuation<? super Unit>, Object> f67486a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ bui<Object> f67487b;

        /* JADX WARN: Multi-variable type inference failed */
        public C155411(Function3<? super bui<Object>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, bui<Object> buiVar) {
            this.f67486a = function3;
            this.f67487b = buiVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p153l.bui
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
            Object objM198688e = uyp.m198688e();
            int i2 = flowKt__EmittersKt$transform$1$1$emit$1.label;
            if (i2 == 0) {
                ResultKt.m88128b(obj);
                Function3<bui<Object>, T, Continuation<? super Unit>, Object> function3 = this.f67486a;
                bui<Object> buiVar = this.f67487b;
                flowKt__EmittersKt$transform$1$1$emit$1.label = 1;
                if (function3.invoke(buiVar, t, flowKt__EmittersKt$transform$1$1$emit$1) == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i2 != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$transform$1(aui<Object> auiVar, Function3<? super bui<Object>, Object, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super FlowKt__EmittersKt$transform$1> continuation) {
        super(2, continuation);
        this.$this_transform = auiVar;
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
    public final Object invoke(@NotNull bui<Object> buiVar, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__EmittersKt$transform$1) create(buiVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            bui buiVar = (bui) this.L$0;
            aui<Object> auiVar = this.$this_transform;
            C155411 c155411 = new C155411(this.$transform, buiVar);
            this.label = 1;
            if (auiVar.collect(c155411, this) == objM198688e) {
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

    @Nullable
    public final Object invokeSuspend$$forInline(@NotNull Object obj) {
        bui buiVar = (bui) this.L$0;
        aui<Object> auiVar = this.$this_transform;
        C155411 c155411 = new C155411(this.$transform, buiVar);
        InlineMarker.m88373c(0);
        auiVar.collect(c155411, this);
        InlineMarker.m88373c(1);
        return Unit.INSTANCE;
    }
}
