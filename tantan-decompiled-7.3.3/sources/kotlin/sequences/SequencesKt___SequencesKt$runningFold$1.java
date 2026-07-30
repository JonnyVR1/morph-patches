package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function2;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m88121d2 = {"<anonymous>", "", "R", "Lkotlin/sequences/SequenceScope;"}, m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", m88263f = "_Sequences.kt", m88264l = {2423, 2427}, m88265m = "invokeSuspend", m88266v = 2)
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
    
        if (r0.mo94149c(r7, r6) == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objInvoke;
        Iterator<Object> it;
        SequenceScope sequenceScope = (SequenceScope) this.L$0;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.m88128b(obj);
            } else {
                if (i != 2) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) this.L$2;
                Object obj2 = this.L$1;
                ResultKt.m88128b(obj);
                objInvoke = obj2;
            }
            while (it.hasNext()) {
                Object next = it.next();
                objInvoke = this.$operation.invoke(objInvoke, next);
                this.L$0 = sequenceScope;
                this.L$1 = objInvoke;
                this.L$2 = it;
                this.L$3 = SpillingKt.m88273a(next);
                this.label = 2;
                if (sequenceScope.mo94149c(objInvoke, this) == objM198688e) {
                    return objM198688e;
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.m88128b(obj);
        Object obj3 = this.$initial;
        this.L$0 = sequenceScope;
        this.label = 1;
        objInvoke = this.$initial;
        it = this.$this_runningFold.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            objInvoke = this.$operation.invoke(objInvoke, next2);
            this.L$0 = sequenceScope;
            this.L$1 = objInvoke;
            this.L$2 = it;
            this.L$3 = SpillingKt.m88273a(next2);
            this.label = 2;
            if (sequenceScope.mo94149c(objInvoke, this) == objM198688e) {
                return objM198688e;
            }
        }
        return Unit.INSTANCE;
    }
}
