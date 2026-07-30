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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import p149l.j6f;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m87232d2 = {"<anonymous>", "", j6f.LATITUDE_SOUTH, "Lkotlin/sequences/SequenceScope;"}, m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", m87374f = "_Sequences.kt", m87375l = {2509, 2513}, m87376m = "invokeSuspend", m87377v = 2)
final class SequencesKt___SequencesKt$runningReduceIndexed$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<Integer, Object, Object, Object> $operation;
    final /* synthetic */ Sequence<Object> $this_runningReduceIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$runningReduceIndexed$1(Sequence<Object> sequence, Function3<? super Integer, Object, Object, Object> function3, Continuation<? super SequencesKt___SequencesKt$runningReduceIndexed$1> continuation) {
        super(2, continuation);
        this.$this_runningReduceIndexed = sequence;
        this.$operation = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequencesKt___SequencesKt$runningReduceIndexed$1 sequencesKt___SequencesKt$runningReduceIndexed$1 = new SequencesKt___SequencesKt$runningReduceIndexed$1(this.$this_runningReduceIndexed, this.$operation, continuation);
        sequencesKt___SequencesKt$runningReduceIndexed$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningReduceIndexed$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<Object> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SequencesKt___SequencesKt$runningReduceIndexed$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator<Object> it;
        Object next;
        SequenceScope sequenceScope = (SequenceScope) this.L$0;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            ResultKt.m87239b(obj);
            it = this.$this_runningReduceIndexed.iterator();
            if (it.hasNext()) {
                next = it.next();
                this.L$0 = sequenceScope;
                this.L$1 = it;
                this.L$2 = next;
                this.label = 1;
                if (sequenceScope.mo93258c(next, this) != objM196133e) {
                }
                return objM196133e;
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            next = this.L$2;
            it = (Iterator) this.L$1;
            ResultKt.m87239b(obj);
        } else {
            if (i != 2) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.I$0;
            Object obj2 = this.L$2;
            it = (Iterator) this.L$1;
            ResultKt.m87239b(obj);
            i2 = i3;
            next = obj2;
        }
        while (it.hasNext()) {
            Function3<Integer, Object, Object, Object> function3 = this.$operation;
            int i4 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Object objInvoke = function3.invoke(Boxing.m87371b(i2), next, it.next());
            this.L$0 = sequenceScope;
            this.L$1 = it;
            this.L$2 = objInvoke;
            this.I$0 = i4;
            this.label = 2;
            if (sequenceScope.mo93258c(objInvoke, this) == objM196133e) {
                return objM196133e;
            }
            next = objInvoke;
            i2 = i4;
        }
        return Unit.INSTANCE;
    }
}
