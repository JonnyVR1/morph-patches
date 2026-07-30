package kotlinx.coroutines.flow;

import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fri;
import p149l.j6f;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "R", "Ll/fri;", Careers.f38732it, "", "<anonymous>"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", m87374f = "Merge.kt", m87375l = {213, 213}, m87376m = "invokeSuspend")
public final class FlowKt__MergeKt$mapLatest$1<R, T> extends SuspendLambda implements Function3<fri<? super R>, T, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<T, Continuation<? super R>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MergeKt$mapLatest$1(Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super FlowKt__MergeKt$mapLatest$1> continuation) {
        super(3, continuation);
        this.$transform = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull fri<? super R> friVar, T t, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__MergeKt$mapLatest$1 flowKt__MergeKt$mapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.$transform, continuation);
        flowKt__MergeKt$mapLatest$1.L$0 = friVar;
        flowKt__MergeKt$mapLatest$1.L$1 = t;
        return flowKt__MergeKt$mapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1<R, T> for r5v3 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 == r3) goto L19
            if (r1 != r2) goto L12
            kotlin.ResultKt.m87239b(r6)
            goto L44
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r5)
            r5 = 0
            return r5
        L19:
            java.lang.Object r1 = r5.L$0
            l.fri r1 = (p149l.fri) r1
            kotlin.ResultKt.m87239b(r6)
            goto L38
        L21:
            kotlin.ResultKt.m87239b(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            l.fri r1 = (p149l.fri) r1
            java.lang.Object r6 = r5.L$1
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r5.$transform
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r0) goto L38
            goto L43
        L38:
            r3 = 0
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r5 = r1.emit(r6, r5)
            if (r5 != r0) goto L44
        L43:
            return r0
        L44:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
