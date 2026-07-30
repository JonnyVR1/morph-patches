package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.j6f;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aG\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/eri;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "action", "a", "(Ll/eri;Lkotlin/jvm/functions/Function2;)Ll/eri;", "kotlinx-coroutines-core"}, m87233k = 5, m87234mv = {1, 9, 0}, m87236xi = 48, m87237xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
public final /* synthetic */ class FlowKt__TransformKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> eri<T> m94109a(@NotNull final eri<? extends T> eriVar, @NotNull final Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new eri<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2 */
            @Metadata(m87231d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l/asi", "<anonymous>"}, m87233k = 3, m87234mv = {1, 9, 0})
            @SourceDebugExtension
            public static final class C154522<T> implements fri {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ fri f66853a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Function2 f66854b;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
                @DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", m87374f = "Transform.kt", m87375l = {219, 220}, m87376m = "emit")
                @SourceDebugExtension
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C154522.this.emit(null, this);
                    }
                }

                public C154522(fri friVar, Function2 function2) {
                    this.f66853a = friVar;
                    this.f66854b = function2;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
                
                    if (r6.emit(r7, r0) == r1) goto L22;
                 */
                @Override // p149l.fri
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) throws java.lang.Throwable {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C154522.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C154522.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = p149l.uwp.m196133e()
                        int r2 = r0.label
                        r3 = 0
                        r4 = 2
                        r5 = 1
                        if (r2 == 0) goto L3d
                        if (r2 == r5) goto L33
                        if (r2 != r4) goto L2d
                        kotlin.ResultKt.m87239b(r8)
                        goto L67
                    L2d:
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        p149l.qkq0.m175383a(r6)
                        return r3
                    L33:
                        java.lang.Object r6 = r0.L$1
                        l.fri r6 = (p149l.fri) r6
                        java.lang.Object r7 = r0.L$0
                        kotlin.ResultKt.m87239b(r8)
                        goto L5a
                    L3d:
                        kotlin.ResultKt.m87239b(r8)
                        l.fri r8 = r6.f66853a
                        kotlin.jvm.functions.Function2 r6 = r6.f66854b
                        r0.L$0 = r7
                        r0.L$1 = r8
                        r0.label = r5
                        r2 = 6
                        kotlin.jvm.internal.InlineMarker.m87484c(r2)
                        java.lang.Object r6 = r6.invoke(r7, r0)
                        r2 = 7
                        kotlin.jvm.internal.InlineMarker.m87484c(r2)
                        if (r6 != r1) goto L59
                        goto L66
                    L59:
                        r6 = r8
                    L5a:
                        r0.L$0 = r3
                        r0.L$1 = r3
                        r0.label = r4
                        java.lang.Object r6 = r6.emit(r7, r0)
                        if (r6 != r1) goto L67
                    L66:
                        return r1
                    L67:
                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C154522.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // p149l.eri
            @Nullable
            public Object collect(@NotNull fri friVar, @NotNull Continuation continuation) {
                Object objCollect = eriVar.collect(new C154522(friVar, function2), continuation);
                return objCollect == uwp.m196133e() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
