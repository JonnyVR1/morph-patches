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
@DebugMetadata(m88262c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", m88263f = "_Sequences.kt", m88264l = {2979}, m88265m = "invokeSuspend", m88266v = 2)
final class SequencesKt___SequencesKt$zipWithNext$2 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Sequence<Object> $this_zipWithNext;
    final /* synthetic */ Function2<Object, Object, Object> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$zipWithNext$2(Sequence<Object> sequence, Function2<Object, Object, Object> function2, Continuation<? super SequencesKt___SequencesKt$zipWithNext$2> continuation) {
        super(2, continuation);
        this.$this_zipWithNext = sequence;
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2 = new SequencesKt___SequencesKt$zipWithNext$2(this.$this_zipWithNext, this.$transform, continuation);
        sequencesKt___SequencesKt$zipWithNext$2.L$0 = obj;
        return sequencesKt___SequencesKt$zipWithNext$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<Object> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SequencesKt___SequencesKt$zipWithNext$2) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Iterator<Object> it;
        SequenceScope sequenceScope = (SequenceScope) this.L$0;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            Iterator<Object> it2 = this.$this_zipWithNext.iterator();
            if (!it2.hasNext()) {
                return Unit.INSTANCE;
            }
            next = it2.next();
            it = it2;
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            next = this.L$3;
            it = (Iterator) this.L$1;
            ResultKt.m88128b(obj);
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            Object objInvoke = this.$transform.invoke(next, next2);
            this.L$0 = sequenceScope;
            this.L$1 = it;
            this.L$2 = SpillingKt.m88273a(next);
            this.L$3 = next2;
            this.label = 1;
            if (sequenceScope.mo94149c(objInvoke, this) == objM198688e) {
                return objM198688e;
            }
            next = next2;
        }
        return Unit.INSTANCE;
    }
}
