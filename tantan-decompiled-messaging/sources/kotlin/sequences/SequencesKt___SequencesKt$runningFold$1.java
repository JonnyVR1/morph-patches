package kotlin.sequences;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m87232d2 = {"<anonymous>", "", "R", "Lkotlin/sequences/SequenceScope;"}, m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", m87374f = "_Sequences.kt", m87375l = {2423, 2427}, m87376m = "invokeSuspend", m87377v = 2)
final class SequencesKt___SequencesKt$runningFold$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Object $initial;
    final /* synthetic */ Function2<Object, Object, Object> $operation;
    final /* synthetic */ Sequence<Object> $this_runningFold;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningFold$1(Object obj, Sequence<Object> sequence, Function2<Object, Object, Object> function2, Continuation<? super SequencesKt___SequencesKt$runningFold$1> continuation) {
        super(2, continuation);
        this.$initial = obj;
        this.$this_runningFold = sequence;
        this.$operation = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.$initial, this.$this_runningFold, this.$operation, continuation);
        sequencesKt___SequencesKt$runningFold$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<Object> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SequencesKt___SequencesKt$runningFold$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:14:0x0040->B:24:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r0.mo93258c(r7, r6) == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.L$0
            kotlin.sequences.SequenceScope r0 = (kotlin.sequences.SequenceScope) r0
            java.lang.Object r1 = p149l.uwp.m196133e()
            int r2 = r6.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L28
            if (r2 == r4) goto L24
            if (r2 != r3) goto L1d
            java.lang.Object r2 = r6.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r6.L$1
            kotlin.ResultKt.m87239b(r7)
            r7 = r4
            goto L40
        L1d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r6)
            r6 = 0
            return r6
        L24:
            kotlin.ResultKt.m87239b(r7)
            goto L38
        L28:
            kotlin.ResultKt.m87239b(r7)
            java.lang.Object r7 = r6.$initial
            r6.L$0 = r0
            r6.label = r4
            java.lang.Object r7 = r0.mo93258c(r7, r6)
            if (r7 != r1) goto L38
            goto L64
        L38:
            java.lang.Object r7 = r6.$initial
            kotlin.sequences.Sequence<java.lang.Object> r2 = r6.$this_runningFold
            java.util.Iterator r2 = r2.iterator()
        L40:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L65
            java.lang.Object r4 = r2.next()
            kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Object> r5 = r6.$operation
            java.lang.Object r7 = r5.invoke(r7, r4)
            r6.L$0 = r0
            r6.L$1 = r7
            r6.L$2 = r2
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.m87384a(r4)
            r6.L$3 = r4
            r6.label = r3
            java.lang.Object r4 = r0.mo93258c(r7, r6)
            if (r4 != r1) goto L40
        L64:
            return r1
        L65:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFold$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
