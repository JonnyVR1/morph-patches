package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "Lkotlin/sequences/SequenceScope;"}, m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", m88263f = "Sequences.kt", m88264l = {102, 104}, m88265m = "invokeSuspend", m88266v = 2)
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
    
        if (r0.mo94150d(r6, r5) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r0.m94151e(r2, r5) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        return r1;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        SequenceScope sequenceScope = (SequenceScope) this.L$0;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            Iterator<Object> it = this.$this_ifEmpty.iterator();
            if (it.hasNext()) {
                this.L$0 = SpillingKt.m88273a(sequenceScope);
                this.L$1 = SpillingKt.m88273a(it);
                this.label = 1;
            } else {
                Sequence<Object> sequenceInvoke = this.$defaultValue.invoke();
                this.L$0 = SpillingKt.m88273a(sequenceScope);
                this.L$1 = SpillingKt.m88273a(it);
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        return Unit.INSTANCE;
    }
}
