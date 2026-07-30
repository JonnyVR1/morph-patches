package kotlinx.coroutines.flow;

import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fri;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u008a@¢\u0006\u0004\b\b\u0010\t"}, m87232d2 = {"T1", "T2", "R", "Ll/fri;", "", "", Careers.f38732it, "", "<anonymous>", "(Ll/fri;Lkotlin/Array;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", m87374f = "Zip.kt", m87375l = {29, 29}, m87376m = "invokeSuspend")
final class FlowKt__ZipKt$combine$1$1 extends SuspendLambda implements Function3<fri<Object>, Object[], Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<Object, Object, Continuation<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$1$1(Function3<Object, Object, ? super Continuation<Object>, ? extends Object> function3, Continuation<? super FlowKt__ZipKt$combine$1$1> continuation) {
        super(3, continuation);
        this.$transform = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull fri<Object> friVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.$transform, continuation);
        flowKt__ZipKt$combine$1$1.L$0 = friVar;
        flowKt__ZipKt$combine$1$1.L$1 = objArr;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r7.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L19
            if (r1 != r3) goto L13
            kotlin.ResultKt.m87239b(r8)
            goto L4a
        L13:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r7)
            return r2
        L19:
            java.lang.Object r1 = r7.L$0
            l.fri r1 = (p149l.fri) r1
            kotlin.ResultKt.m87239b(r8)
            goto L3f
        L21:
            kotlin.ResultKt.m87239b(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            l.fri r1 = (p149l.fri) r1
            java.lang.Object r8 = r7.L$1
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> r5 = r7.$transform
            r6 = 0
            r6 = r8[r6]
            r8 = r8[r4]
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = r5.invoke(r6, r8, r7)
            if (r8 != r0) goto L3f
            goto L49
        L3f:
            r7.L$0 = r2
            r7.label = r3
            java.lang.Object r7 = r1.emit(r8, r7)
            if (r7 != r0) goto L4a
        L49:
            return r0
        L4a:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
