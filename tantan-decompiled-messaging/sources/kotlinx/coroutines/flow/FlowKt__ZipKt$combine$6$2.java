package kotlinx.coroutines.flow;

import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fri;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "R", "Ll/fri;", "", Careers.f38732it, "", "<anonymous>", "(Ll/fri;Lkotlin/Array;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", m87374f = "Zip.kt", m87375l = {288, 288}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class FlowKt__ZipKt$combine$6$2 extends SuspendLambda implements Function3<fri<Object>, Object[], Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Object[], Continuation<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$6$2(Function2<? super Object[], ? super Continuation<Object>, ? extends Object> function2, Continuation<? super FlowKt__ZipKt$combine$6$2> continuation) {
        super(3, continuation);
        this.$transform = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull fri<Object> friVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
        Intrinsics.m87492h();
        FlowKt__ZipKt$combine$6$2 flowKt__ZipKt$combine$6$2 = new FlowKt__ZipKt$combine$6$2(this.$transform, continuation);
        flowKt__ZipKt$combine$6$2.L$0 = friVar;
        flowKt__ZipKt$combine$6$2.L$1 = objArr;
        return flowKt__ZipKt$combine$6$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) throws java.lang.Throwable {
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
            goto L46
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r5)
            r5 = 0
            return r5
        L19:
            java.lang.Object r1 = r5.L$0
            l.fri r1 = (p149l.fri) r1
            kotlin.ResultKt.m87239b(r6)
            goto L3a
        L21:
            kotlin.ResultKt.m87239b(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            l.fri r1 = (p149l.fri) r1
            java.lang.Object r6 = r5.L$1
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            kotlin.jvm.functions.Function2<java.lang.Object[], kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> r4 = r5.$transform
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r0) goto L3a
            goto L45
        L3a:
            r3 = 0
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r5 = r1.emit(r6, r5)
            if (r5 != r0) goto L46
        L45:
            return r0
        L46:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Nullable
    public final Object invokeSuspend$$forInline(@NotNull Object obj) {
        fri friVar = (fri) this.L$0;
        Object objInvoke = this.$transform.invoke((Object[]) this.L$1, this);
        InlineMarker.m87484c(0);
        friVar.emit(objInvoke, this);
        InlineMarker.m87484c(1);
        return Unit.INSTANCE;
    }
}
