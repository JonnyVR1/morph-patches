package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;
import p149l.lmr;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Lkotlin/sequences/GeneratorSequence;", "", j6f.GPS_DIRECTION_TRUE, "Lkotlin/sequences/Sequence;", "Lkotlin/Function0;", "getInitialValue", "Lkotlin/Function1;", "getNextValue", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Lkotlin/jvm/functions/Function0;", "b", "Lkotlin/jvm/functions/Function1;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class GeneratorSequence<T> implements Sequence<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function0<T> getInitialValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<T, T> getNextValue;

    /* JADX INFO: renamed from: kotlin.sequences.GeneratorSequence$iterator$1 */
    @Metadata(m87231d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"kotlin/sequences/GeneratorSequence$iterator$1", "", "", "a", "()V", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "", "b", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C153721 implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public T nextItem;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int nextState = -2;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ GeneratorSequence<T> f66512c;

        public C153721(GeneratorSequence<T> generatorSequence) {
            this.f66512c = generatorSequence;
        }

        /* JADX INFO: renamed from: a */
        private final void m93252a() {
            T t;
            int i = this.nextState;
            GeneratorSequence<T> generatorSequence = this.f66512c;
            if (i == -2) {
                t = (T) generatorSequence.getInitialValue.invoke();
            } else {
                Function1 function1 = generatorSequence.getNextValue;
                T t2 = this.nextItem;
                t2.getClass();
                t = (T) function1.invoke(t2);
            }
            this.nextItem = t;
            this.nextState = t == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState < 0) {
                m93252a();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.nextState < 0) {
                m93252a();
            }
            if (this.nextState == 0) {
                lmr.m150601a();
                return null;
            }
            T t = this.nextItem;
            t.getClass();
            this.nextState = -1;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GeneratorSequence(@NotNull Function0<? extends T> function0, @NotNull Function1<? super T, ? extends T> function1) {
        function0.getClass();
        function1.getClass();
        this.getInitialValue = function0;
        this.getNextValue = function1;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new C153721(this);
    }
}
