package kotlin.sequences;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function2;
import kotlin.random.Random;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "Lkotlin/sequences/SequenceScope;"}, m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", m88263f = "Sequences.kt", m88264l = {178}, m88265m = "invokeSuspend", m88266v = 2)
final class SequencesKt__SequencesKt$shuffled$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Random $random;
    final /* synthetic */ Sequence<Object> $this_shuffled;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$shuffled$1(Sequence<Object> sequence, Random random, Continuation<? super SequencesKt__SequencesKt$shuffled$1> continuation) {
        super(2, continuation);
        this.$this_shuffled = sequence;
        this.$random = random;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequencesKt__SequencesKt$shuffled$1 sequencesKt__SequencesKt$shuffled$1 = new SequencesKt__SequencesKt$shuffled$1(this.$this_shuffled, this.$random, continuation);
        sequencesKt__SequencesKt$shuffled$1.L$0 = obj;
        return sequencesKt__SequencesKt$shuffled$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<Object> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SequencesKt__SequencesKt$shuffled$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List listM94194W;
        SequenceScope sequenceScope = (SequenceScope) this.L$0;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            listM94194W = SequencesKt___SequencesKt.m94194W(this.$this_shuffled);
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            listM94194W = (List) this.L$1;
            ResultKt.m88128b(obj);
        }
        while (!listM94194W.isEmpty()) {
            int iNextInt = this.$random.nextInt(listM94194W.size());
            Object objRemoveLast = CollectionsKt.removeLast(listM94194W);
            Object obj2 = iNextInt < listM94194W.size() ? listM94194W.set(iNextInt, objRemoveLast) : objRemoveLast;
            this.L$0 = sequenceScope;
            this.L$1 = listM94194W;
            this.L$2 = SpillingKt.m88273a(objRemoveLast);
            this.L$3 = SpillingKt.m88273a(obj2);
            this.I$0 = iNextInt;
            this.label = 1;
            if (sequenceScope.mo94149c(obj2, this) == objM198688e) {
                return objM198688e;
            }
        }
        return Unit.INSTANCE;
    }
}
