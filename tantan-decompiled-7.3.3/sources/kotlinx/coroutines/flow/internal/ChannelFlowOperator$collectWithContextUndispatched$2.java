package kotlinx.coroutines.flow.internal;

import com.p051p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bui;
import p153l.p7f;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {p7f.LATITUDE_SOUTH, p7f.GPS_DIRECTION_TRUE, "Ll/bui;", Careers.f39580it, "", "<anonymous>", "(Ll/bui;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", m88263f = "ChannelFlow.kt", m88264l = {148}, m88265m = "invokeSuspend")
public final class ChannelFlowOperator$collectWithContextUndispatched$2<T> extends SuspendLambda implements Function2<bui<? super T>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelFlowOperator<S, T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowOperator$collectWithContextUndispatched$2(ChannelFlowOperator<S, T> channelFlowOperator, Continuation<? super ChannelFlowOperator$collectWithContextUndispatched$2> continuation) {
        super(2, continuation);
        this.this$0 = channelFlowOperator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelFlowOperator$collectWithContextUndispatched$2 channelFlowOperator$collectWithContextUndispatched$2 = new ChannelFlowOperator$collectWithContextUndispatched$2(this.this$0, continuation);
        channelFlowOperator$collectWithContextUndispatched$2.L$0 = obj;
        return channelFlowOperator$collectWithContextUndispatched$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull bui<? super T> buiVar, @Nullable Continuation<? super Unit> continuation) {
        return ((ChannelFlowOperator$collectWithContextUndispatched$2) create(buiVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2<T> for r3v3 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = p153l.uyp.m198688e()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Lf
            kotlin.ResultKt.m88128b(r4)
            goto L28
        Lf:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            p153l.wtq0.m207906a(r3)
            r3 = 0
            return r3
        L16:
            kotlin.ResultKt.m88128b(r4)
            java.lang.Object r4 = r3.L$0
            l.bui r4 = (p153l.bui) r4
            kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> r1 = r3.this$0
            r3.label = r2
            java.lang.Object r3 = r1.mo95064o(r4, r3)
            if (r3 != r0) goto L28
            return r0
        L28:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
