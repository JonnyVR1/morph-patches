package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.iri;
import p149l.j6f;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "R", "Ll/fri;", "", "<anonymous>", "(Ll/fri;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", m87374f = "Limit.kt", m87375l = {149}, m87376m = "invokeSuspend")
@SourceDebugExtension
final class FlowKt__LimitKt$transformWhile$1 extends SuspendLambda implements Function2<fri<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ eri<Object> $this_transformWhile;
    final /* synthetic */ Function3<fri<Object>, Object, Continuation<? super Boolean>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$transformWhile$1(eri<Object> eriVar, Function3<? super fri<Object>, Object, ? super Continuation<? super Boolean>, ? extends Object> function3, Continuation<? super FlowKt__LimitKt$transformWhile$1> continuation) {
        super(2, continuation);
        this.$this_transformWhile = eriVar;
        this.$transform = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__LimitKt$transformWhile$1 flowKt__LimitKt$transformWhile$1 = new FlowKt__LimitKt$transformWhile$1(this.$this_transformWhile, this.$transform, continuation);
        flowKt__LimitKt$transformWhile$1.L$0 = obj;
        return flowKt__LimitKt$transformWhile$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull fri<Object> friVar, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__LimitKt$transformWhile$1) create(friVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        C15440xdf1aa1b6 c15440xdf1aa1b6;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            fri friVar = (fri) this.L$0;
            eri<Object> eriVar = this.$this_transformWhile;
            C15440xdf1aa1b6 c15440xdf1aa1b7 = new C15440xdf1aa1b6(this.$transform, friVar);
            try {
                this.L$0 = c15440xdf1aa1b7;
                this.label = 1;
                if (eriVar.collect(c15440xdf1aa1b7, this) == objM196133e) {
                    return objM196133e;
                }
            } catch (AbortFlowException e) {
                e = e;
                c15440xdf1aa1b6 = c15440xdf1aa1b7;
                iri.m137898a(e, c15440xdf1aa1b6);
            }
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c15440xdf1aa1b6 = (C15440xdf1aa1b6) this.L$0;
            try {
                ResultKt.m87239b(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                iri.m137898a(e, c15440xdf1aa1b6);
            }
        }
        return Unit.INSTANCE;
    }
}
