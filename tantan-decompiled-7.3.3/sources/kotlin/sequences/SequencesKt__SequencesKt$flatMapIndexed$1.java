package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m88121d2 = {"<anonymous>", "", "R", "Lkotlin/sequences/SequenceScope;"}, m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", m88263f = "Sequences.kt", m88264l = {383}, m88265m = "invokeSuspend", m88266v = 2)
final class SequencesKt__SequencesKt$flatMapIndexed$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Object, Iterator<Object>> $iterator;
    final /* synthetic */ Sequence<Object> $source;
    final /* synthetic */ Function2<Integer, Object, Object> $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt__SequencesKt$flatMapIndexed$1(Sequence<Object> sequence, Function2<? super Integer, Object, Object> function2, Function1<Object, ? extends Iterator<Object>> function1, Continuation<? super SequencesKt__SequencesKt$flatMapIndexed$1> continuation) {
        super(2, continuation);
        this.$source = sequence;
        this.$transform = function2;
        this.$iterator = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new SequencesKt__SequencesKt$flatMapIndexed$1(this.$source, this.$transform, this.$iterator, continuation);
        sequencesKt__SequencesKt$flatMapIndexed$1.L$0 = obj;
        return sequencesKt__SequencesKt$flatMapIndexed$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<Object> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SequencesKt__SequencesKt$flatMapIndexed$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Iterator<Object> it;
        SequenceScope sequenceScope = (SequenceScope) this.L$0;
        Object objM198688e = uyp.m198688e();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            i = 0;
            it = this.$source.iterator();
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            it = (Iterator) this.L$1;
            ResultKt.m88128b(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            Function2<Integer, Object, Object> function2 = this.$transform;
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Object objInvoke = function2.invoke(Boxing.m88260b(i), next);
            Iterator<Object> itInvoke = this.$iterator.invoke(objInvoke);
            this.L$0 = sequenceScope;
            this.L$1 = it;
            this.L$2 = SpillingKt.m88273a(next);
            this.L$3 = SpillingKt.m88273a(objInvoke);
            this.I$0 = i3;
            this.label = 1;
            if (sequenceScope.mo94150d(itInvoke, this) == objM198688e) {
                return objM198688e;
            }
            i = i3;
        }
        return Unit.INSTANCE;
    }
}
