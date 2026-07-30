package kotlin.sequences;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m87232d2 = {"<anonymous>", "", "R", "Lkotlin/sequences/SequenceScope;"}, m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", m87374f = "_Sequences.kt", m87375l = {2451, 2456}, m87376m = "invokeSuspend", m87377v = 2)
final class SequencesKt___SequencesKt$runningFoldIndexed$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Object $initial;
    final /* synthetic */ Function3<Integer, Object, Object, Object> $operation;
    final /* synthetic */ Sequence<Object> $this_runningFoldIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$runningFoldIndexed$1(Object obj, Sequence<Object> sequence, Function3<? super Integer, Object, Object, Object> function3, Continuation<? super SequencesKt___SequencesKt$runningFoldIndexed$1> continuation) {
        super(2, continuation);
        this.$initial = obj;
        this.$this_runningFoldIndexed = sequence;
        this.$operation = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequencesKt___SequencesKt$runningFoldIndexed$1 sequencesKt___SequencesKt$runningFoldIndexed$1 = new SequencesKt___SequencesKt$runningFoldIndexed$1(this.$initial, this.$this_runningFoldIndexed, this.$operation, continuation);
        sequencesKt___SequencesKt$runningFoldIndexed$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFoldIndexed$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<Object> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SequencesKt___SequencesKt$runningFoldIndexed$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x0078 A[LOOP:0: B:14:0x0046->B:22:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r0.mo93258c(r10, r9) == r1) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = r9.L$0
            kotlin.sequences.SequenceScope r0 = (kotlin.sequences.SequenceScope) r0
            java.lang.Object r1 = p149l.uwp.m196133e()
            int r2 = r9.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L2a
            if (r2 == r4) goto L26
            if (r2 != r3) goto L1f
            int r2 = r9.I$0
            java.lang.Object r4 = r9.L$2
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r9.L$1
            kotlin.ResultKt.m87239b(r10)
            r10 = r5
            goto L46
        L1f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r9)
            r9 = 0
            return r9
        L26:
            kotlin.ResultKt.m87239b(r10)
            goto L3a
        L2a:
            kotlin.ResultKt.m87239b(r10)
            java.lang.Object r10 = r9.$initial
            r9.L$0 = r0
            r9.label = r4
            java.lang.Object r10 = r0.mo93258c(r10, r9)
            if (r10 != r1) goto L3a
            goto L77
        L3a:
            java.lang.Object r10 = r9.$initial
            kotlin.sequences.Sequence<java.lang.Object> r2 = r9.$this_runningFoldIndexed
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
            r8 = r4
            r4 = r2
            r2 = r8
        L46:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L7a
            java.lang.Object r5 = r4.next()
            kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.Object> r6 = r9.$operation
            int r7 = r2 + 1
            if (r2 >= 0) goto L59
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L59:
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.m87371b(r2)
            java.lang.Object r10 = r6.invoke(r2, r10, r5)
            r9.L$0 = r0
            r9.L$1 = r10
            r9.L$2 = r4
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.m87384a(r5)
            r9.L$3 = r2
            r9.I$0 = r7
            r9.label = r3
            java.lang.Object r2 = r0.mo93258c(r10, r9)
            if (r2 != r1) goto L78
        L77:
            return r1
        L78:
            r2 = r7
            goto L46
        L7a:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
