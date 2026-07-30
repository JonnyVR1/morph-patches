package kotlin.sequences;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "Lkotlin/sequences/SequenceScope;"}, m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", m87374f = "Sequences.kt", m87375l = {102, 104}, m87376m = "invokeSuspend", m87377v = 2)
final class SequencesKt__SequencesKt$ifEmpty$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Sequence<Object>> $defaultValue;
    final /* synthetic */ Sequence<Object> $this_ifEmpty;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt__SequencesKt$ifEmpty$1(Sequence<Object> sequence, Function0<? extends Sequence<Object>> function0, Continuation<? super SequencesKt__SequencesKt$ifEmpty$1> continuation) {
        super(2, continuation);
        this.$this_ifEmpty = sequence;
        this.$defaultValue = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequencesKt__SequencesKt$ifEmpty$1 sequencesKt__SequencesKt$ifEmpty$1 = new SequencesKt__SequencesKt$ifEmpty$1(this.$this_ifEmpty, this.$defaultValue, continuation);
        sequencesKt__SequencesKt$ifEmpty$1.L$0 = obj;
        return sequencesKt__SequencesKt$ifEmpty$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<Object> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SequencesKt__SequencesKt$ifEmpty$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r0.mo93259d(r6, r5) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r0.m93260e(r2, r5) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        return r1;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = r5.L$0
            kotlin.sequences.SequenceScope r0 = (kotlin.sequences.SequenceScope) r0
            java.lang.Object r1 = p149l.uwp.m196133e()
            int r2 = r5.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1a
            if (r2 != r3) goto L13
            goto L1a
        L13:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r5)
            r5 = 0
            return r5
        L1a:
            java.lang.Object r5 = r5.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            kotlin.ResultKt.m87239b(r6)
            goto L63
        L22:
            kotlin.ResultKt.m87239b(r6)
            kotlin.sequences.Sequence<java.lang.Object> r6 = r5.$this_ifEmpty
            java.util.Iterator r6 = r6.iterator()
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.m87384a(r0)
            r5.L$0 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.m87384a(r6)
            r5.L$1 = r2
            r5.label = r4
            java.lang.Object r5 = r0.mo93259d(r6, r5)
            if (r5 != r1) goto L63
            goto L62
        L46:
            kotlin.jvm.functions.Function0<kotlin.sequences.Sequence<java.lang.Object>> r2 = r5.$defaultValue
            java.lang.Object r2 = r2.invoke()
            kotlin.sequences.Sequence r2 = (kotlin.sequences.Sequence) r2
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.m87384a(r0)
            r5.L$0 = r4
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.m87384a(r6)
            r5.L$1 = r6
            r5.label = r3
            java.lang.Object r5 = r0.m93260e(r2, r5)
            if (r5 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
