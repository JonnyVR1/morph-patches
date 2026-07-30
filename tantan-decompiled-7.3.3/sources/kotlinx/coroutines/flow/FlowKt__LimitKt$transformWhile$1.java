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
import p153l.aui;
import p153l.bui;
import p153l.eui;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "R", "Ll/bui;", "", "<anonymous>", "(Ll/bui;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", m88263f = "Limit.kt", m88264l = {149}, m88265m = "invokeSuspend")
@SourceDebugExtension
final class FlowKt__LimitKt$transformWhile$1 extends SuspendLambda implements Function2<bui<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ aui<Object> $this_transformWhile;
    final /* synthetic */ Function3<bui<Object>, Object, Continuation<? super Boolean>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$transformWhile$1(aui<Object> auiVar, Function3<? super bui<Object>, Object, ? super Continuation<? super Boolean>, ? extends Object> function3, Continuation<? super FlowKt__LimitKt$transformWhile$1> continuation) {
        super(2, continuation);
        this.$this_transformWhile = auiVar;
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
    public final Object invoke(@NotNull bui<Object> buiVar, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__LimitKt$transformWhile$1) create(buiVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        C15547xdf1aa1b6 c15547xdf1aa1b6;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            bui buiVar = (bui) this.L$0;
            aui<Object> auiVar = this.$this_transformWhile;
            C15547xdf1aa1b6 c15547xdf1aa1b7 = new C15547xdf1aa1b6(this.$transform, buiVar);
            try {
                this.L$0 = c15547xdf1aa1b7;
                this.label = 1;
                if (auiVar.collect(c15547xdf1aa1b7, this) == objM198688e) {
                    return objM198688e;
                }
            } catch (AbortFlowException e) {
                e = e;
                c15547xdf1aa1b6 = c15547xdf1aa1b7;
                eui.m122570a(e, c15547xdf1aa1b6);
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c15547xdf1aa1b6 = (C15547xdf1aa1b6) this.L$0;
            try {
                ResultKt.m88128b(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                eui.m122570a(e, c15547xdf1aa1b6);
            }
        }
        return Unit.INSTANCE;
    }
}
