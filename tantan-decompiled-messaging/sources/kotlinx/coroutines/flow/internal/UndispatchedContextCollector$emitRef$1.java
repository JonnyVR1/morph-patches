package kotlinx.coroutines.flow.internal;

import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fri;
import p149l.j6f;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, Careers.f38732it}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", m87374f = "ChannelFlow.kt", m87375l = {208}, m87376m = "invokeSuspend")
public final class UndispatchedContextCollector$emitRef$1<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
    final /* synthetic */ fri<T> $downstream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UndispatchedContextCollector$emitRef$1(fri<? super T> friVar, Continuation<? super UndispatchedContextCollector$emitRef$1> continuation) {
        super(2, continuation);
        this.$downstream = friVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.$downstream, continuation);
        undispatchedContextCollector$emitRef$1.L$0 = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(T t, @Nullable Continuation<? super Unit> continuation) {
        return ((UndispatchedContextCollector$emitRef$1) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1<T> for r3v3 'this'  kotlin.coroutines.Continuation
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
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Lf
            kotlin.ResultKt.m87239b(r4)
            goto L26
        Lf:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r3)
            r3 = 0
            return r3
        L16:
            kotlin.ResultKt.m87239b(r4)
            java.lang.Object r4 = r3.L$0
            l.fri<T> r1 = r3.$downstream
            r3.label = r2
            java.lang.Object r3 = r1.emit(r4, r3)
            if (r3 != r0) goto L26
            return r0
        L26:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
