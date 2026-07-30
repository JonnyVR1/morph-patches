package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, m87232d2 = {"l/eod0", "Ll/eri;", "Ll/fri;", "collector", "", "collect", "(Ll/fri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T> implements eri<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eri f66818a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function4 f66819b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", m87374f = "Errors.kt", m87375l = {116, 118}, m87376m = "collect")
    @SourceDebugExtension
    public static final class C154361 extends ContinuationImpl {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C154361(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(eri eriVar, Function4 function4) {
        this.f66818a = eriVar;
        this.f66819b = function4;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9 A[PHI: r2 r6 r7 r13
      0x00a9: PHI (r2v6 int) = (r2v1 int), (r2v8 int) binds: [B:22:0x0079, B:29:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r6v4 l.fri<? super T>) = (r6v1 l.fri<? super T>), (r6v6 l.fri<? super T>) binds: [B:22:0x0079, B:29:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r7v2 kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T>) = 
      (r7v0 kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T>)
      (r7v3 kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T>)
     binds: [B:22:0x0079, B:29:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r13v4 long) = (r13v1 long), (r13v8 long) binds: [B:22:0x0079, B:29:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0079 -> B:30:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009a -> B:27:0x009d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p149l.eri
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull p149l.fri<? super T> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.C154361
            if (r0 == 0) goto L13
            r0 = r15
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.C154361) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = p149l.uwp.m196133e()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L58
            if (r2 == r5) goto L42
            if (r2 != r4) goto L3c
            long r13 = r0.J$0
            java.lang.Object r2 = r0.L$2
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r6 = r0.L$1
            l.fri r6 = (p149l.fri) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r7 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r7
            kotlin.ResultKt.m87239b(r15)
            goto L9d
        L3c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r13)
            return r3
        L42:
            int r13 = r0.I$0
            long r6 = r0.J$0
            java.lang.Object r14 = r0.L$1
            l.fri r14 = (p149l.fri) r14
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r2 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r2
            kotlin.ResultKt.m87239b(r15)
            r10 = r2
            r2 = r13
            r11 = r6
            r6 = r14
            r7 = r10
            r13 = r11
            goto L77
        L58:
            kotlin.ResultKt.m87239b(r15)
            r6 = 0
        L5d:
            l.eri r15 = r13.f66818a
            r0.L$0 = r13
            r0.L$1 = r14
            r0.L$2 = r3
            r0.J$0 = r6
            r2 = 0
            r0.I$0 = r2
            r0.label = r5
            java.lang.Object r15 = p149l.jri.m142948g(r15, r14, r0)
            if (r15 != r1) goto L73
            goto L99
        L73:
            r10 = r6
            r7 = r13
            r6 = r14
            r13 = r10
        L77:
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            if (r15 == 0) goto La9
            kotlin.jvm.functions.Function4 r2 = r7.f66819b
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.m87372c(r13)
            r0.L$0 = r7
            r0.L$1 = r6
            r0.L$2 = r15
            r0.J$0 = r13
            r0.label = r4
            r9 = 6
            kotlin.jvm.internal.InlineMarker.m87484c(r9)
            java.lang.Object r2 = r2.invoke(r6, r15, r8, r0)
            r8 = 7
            kotlin.jvm.internal.InlineMarker.m87484c(r8)
            if (r2 != r1) goto L9a
        L99:
            return r1
        L9a:
            r10 = r2
            r2 = r15
            r15 = r10
        L9d:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto Lae
            r8 = 1
            long r13 = r13 + r8
            r2 = r5
        La9:
            r10 = r13
            r14 = r6
            r13 = r7
            r6 = r10
            goto Laf
        Lae:
            throw r2
        Laf:
            if (r2 != 0) goto L5d
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.collect(l.fri, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
