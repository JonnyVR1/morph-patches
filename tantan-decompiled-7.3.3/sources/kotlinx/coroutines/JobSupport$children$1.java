package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"Lkotlin/sequences/SequenceScope;", "Lkotlinx/coroutines/o;", "", "<anonymous>", "(Lkotlin/sequences/SequenceScope;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.JobSupport$children$1", m88263f = "JobSupport.kt", m88264l = {963, 965}, m88265m = "invokeSuspend")
@SourceDebugExtension
public final class JobSupport$children$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super InterfaceC15593o>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ JobSupport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(JobSupport jobSupport, Continuation<? super JobSupport$children$1> continuation) {
        super(2, continuation);
        this.this$0 = jobSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.this$0, continuation);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull SequenceScope<? super InterfaceC15593o> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
        return ((JobSupport$children$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0068 -> B:27:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:27:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = p153l.uyp.m198688e()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1e
            java.lang.Object r1 = r5.L$2
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            java.lang.Object r3 = r5.L$1
            l.dyv r3 = (p153l.dyv) r3
            java.lang.Object r4 = r5.L$0
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.m88128b(r6)
            goto L7e
        L1e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p153l.wtq0.m207906a(r5)
            r5 = 0
            return r5
        L25:
            kotlin.ResultKt.m88128b(r6)
            goto L83
        L29:
            kotlin.ResultKt.m88128b(r6)
            java.lang.Object r6 = r5.L$0
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            kotlinx.coroutines.JobSupport r1 = r5.this$0
            java.lang.Object r1 = r1.m94591r0()
            boolean r4 = r1 instanceof p153l.g45
            if (r4 == 0) goto L47
            l.g45 r1 = (p153l.g45) r1
            l.h45 r1 = r1.childJob
            r5.label = r3
            java.lang.Object r5 = r6.mo94149c(r1, r5)
            if (r5 != r0) goto L83
            goto L7d
        L47:
            boolean r3 = r1 instanceof p153l.ptm
            if (r3 == 0) goto L83
            l.ptm r1 = (p153l.ptm) r1
            l.yt40 r1 = r1.getList()
            if (r1 == 0) goto L83
            java.lang.Object r3 = r1.m95094i()
            r3.getClass()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L60:
            boolean r6 = kotlin.jvm.internal.Intrinsics.m88377d(r1, r3)
            if (r6 != 0) goto L83
            boolean r6 = r1 instanceof p153l.g45
            if (r6 == 0) goto L7e
            r6 = r1
            l.g45 r6 = (p153l.g45) r6
            l.h45 r6 = r6.childJob
            r5.L$0 = r4
            r5.L$1 = r3
            r5.L$2 = r1
            r5.label = r2
            java.lang.Object r6 = r4.mo94149c(r6, r5)
            if (r6 != r0) goto L7e
        L7d:
            return r0
        L7e:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.m95095j()
            goto L60
        L83:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
