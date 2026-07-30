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
import p149l.j6f;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "Lkotlin/sequences/SequenceScope;"}, m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", m87374f = "Sequences.kt", m87375l = {178}, m87376m = "invokeSuspend", m87377v = 2)
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
        List listM93303W;
        SequenceScope sequenceScope = (SequenceScope) this.L$0;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            listM93303W = SequencesKt___SequencesKt.m93303W(this.$this_shuffled);
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            listM93303W = (List) this.L$1;
            ResultKt.m87239b(obj);
        }
        while (!listM93303W.isEmpty()) {
            int iNextInt = this.$random.nextInt(listM93303W.size());
            Object objRemoveLast = CollectionsKt.removeLast(listM93303W);
            Object obj2 = iNextInt < listM93303W.size() ? listM93303W.set(iNextInt, objRemoveLast) : objRemoveLast;
            this.L$0 = sequenceScope;
            this.L$1 = listM93303W;
            this.L$2 = SpillingKt.m87384a(objRemoveLast);
            this.L$3 = SpillingKt.m87384a(obj2);
            this.I$0 = iNextInt;
            this.label = 1;
            if (sequenceScope.mo93258c(obj2, this) == objM196133e) {
                return objM196133e;
            }
        }
        return Unit.INSTANCE;
    }
}
