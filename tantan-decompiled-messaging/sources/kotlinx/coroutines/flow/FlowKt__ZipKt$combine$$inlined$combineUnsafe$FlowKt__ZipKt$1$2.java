package kotlinx.coroutines.flow;

import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fri;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "R", "Ll/fri;", "", Careers.f38732it, "", "<anonymous>", "(Ll/fri;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", m87374f = "Zip.kt", m87375l = {329, 258}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2 extends SuspendLambda implements Function3<fri<Object>, Object[], Continuation<? super Unit>, Object> {
    final /* synthetic */ Function4 $transform$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2(Continuation continuation, Function4 function4) {
        super(3, continuation);
        this.$transform$inlined = function4;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull fri<Object> friVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2 = new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2(continuation, this.$transform$inlined);
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2.L$0 = friVar;
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2.L$1 = objArr;
        return flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r8.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L19
            if (r1 != r3) goto L13
            kotlin.ResultKt.m87239b(r9)
            goto L54
        L13:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r8)
            return r2
        L19:
            java.lang.Object r1 = r8.L$0
            l.fri r1 = (p149l.fri) r1
            kotlin.ResultKt.m87239b(r9)
            goto L49
        L21:
            kotlin.ResultKt.m87239b(r9)
            java.lang.Object r9 = r8.L$0
            r1 = r9
            l.fri r1 = (p149l.fri) r1
            java.lang.Object r9 = r8.L$1
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            kotlin.jvm.functions.Function4 r5 = r8.$transform$inlined
            r6 = 0
            r6 = r9[r6]
            r7 = r9[r4]
            r9 = r9[r3]
            r8.L$0 = r1
            r8.label = r4
            r4 = 6
            kotlin.jvm.internal.InlineMarker.m87484c(r4)
            java.lang.Object r9 = r5.invoke(r6, r7, r9, r8)
            r4 = 7
            kotlin.jvm.internal.InlineMarker.m87484c(r4)
            if (r9 != r0) goto L49
            goto L53
        L49:
            r8.L$0 = r2
            r8.label = r3
            java.lang.Object r8 = r1.emit(r9, r8)
            if (r8 != r0) goto L54
        L53:
            return r0
        L54:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
