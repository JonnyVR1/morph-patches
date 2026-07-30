package kotlinx.coroutines.flow;

import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fri;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "R", "Ll/fri;", "", Careers.f38732it, "", "<anonymous>", "(Ll/fri;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", m87374f = "Zip.kt", m87375l = {329, 258}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 extends SuspendLambda implements Function3<fri<Object>, Object[], Continuation<? super Unit>, Object> {
    final /* synthetic */ Function6 $transform$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2(Continuation continuation, Function6 function6) {
        super(3, continuation);
        this.$transform$inlined = function6;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull fri<Object> friVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 = new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2(continuation, this.$transform$inlined);
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.L$0 = friVar;
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.L$1 = objArr;
        return flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (r1.emit(r13, r11) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r12.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L19
            if (r1 != r3) goto L13
            kotlin.ResultKt.m87239b(r13)
            goto L5c
        L13:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r12)
            return r2
        L19:
            java.lang.Object r1 = r12.L$0
            l.fri r1 = (p149l.fri) r1
            kotlin.ResultKt.m87239b(r13)
            r11 = r12
            goto L51
        L22:
            kotlin.ResultKt.m87239b(r13)
            java.lang.Object r13 = r12.L$0
            r1 = r13
            l.fri r1 = (p149l.fri) r1
            java.lang.Object r13 = r12.L$1
            java.lang.Object[] r13 = (java.lang.Object[]) r13
            kotlin.jvm.functions.Function6 r5 = r12.$transform$inlined
            r6 = 0
            r6 = r13[r6]
            r7 = r13[r4]
            r8 = r13[r3]
            r9 = 3
            r9 = r13[r9]
            r10 = 4
            r10 = r13[r10]
            r12.L$0 = r1
            r12.label = r4
            r13 = 6
            kotlin.jvm.internal.InlineMarker.m87484c(r13)
            r11 = r12
            java.lang.Object r13 = r5.invoke(r6, r7, r8, r9, r10, r11)
            r12 = 7
            kotlin.jvm.internal.InlineMarker.m87484c(r12)
            if (r13 != r0) goto L51
            goto L5b
        L51:
            r11.L$0 = r2
            r11.label = r3
            java.lang.Object r12 = r1.emit(r13, r11)
            if (r12 != r0) goto L5c
        L5b:
            return r0
        L5c:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
