package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import p149l.j6f;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m87232d2 = {"<anonymous>", "", j6f.LATITUDE_SOUTH, "Lkotlin/sequences/SequenceScope;"}, m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", m87374f = "_Sequences.kt", m87375l = {2480, 2483}, m87376m = "invokeSuspend", m87377v = 2)
final class SequencesKt___SequencesKt$runningReduce$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Object, Object, Object> $operation;
    final /* synthetic */ Sequence<Object> $this_runningReduce;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningReduce$1(Sequence<Object> sequence, Function2<Object, Object, Object> function2, Continuation<? super SequencesKt___SequencesKt$runningReduce$1> continuation) {
        super(2, continuation);
        this.$this_runningReduce = sequence;
        this.$operation = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequencesKt___SequencesKt$runningReduce$1 sequencesKt___SequencesKt$runningReduce$1 = new SequencesKt___SequencesKt$runningReduce$1(this.$this_runningReduce, this.$operation, continuation);
        sequencesKt___SequencesKt$runningReduce$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningReduce$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<Object> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SequencesKt___SequencesKt$runningReduce$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Iterator<Object> it;
        SequenceScope sequenceScope = (SequenceScope) this.L$0;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            Iterator<Object> it2 = this.$this_runningReduce.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                this.L$0 = sequenceScope;
                this.L$1 = it2;
                this.L$2 = next;
                this.label = 1;
                if (sequenceScope.mo93258c(next, this) != objM196133e) {
                    it = it2;
                }
                return objM196133e;
            }
            return Unit.INSTANCE;
        }
        if (i != 1 && i != 2) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        next = this.L$2;
        it = (Iterator) this.L$1;
        ResultKt.m87239b(obj);
        while (it.hasNext()) {
            next = this.$operation.invoke(next, it.next());
            this.L$0 = sequenceScope;
            this.L$1 = it;
            this.L$2 = next;
            this.label = 2;
            if (sequenceScope.mo93258c(next, this) == objM196133e) {
                return objM196133e;
            }
        }
        return Unit.INSTANCE;
    }
}
