package p153l;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0011j\b\u0012\u0004\u0012\u00028\u0001`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m88121d2 = {"Ll/d6e;", p7f.GPS_DIRECTION_TRUE, "K", "Lkotlin/collections/AbstractIterator;", "", "source", "Lkotlin/Function1;", "keySelector", "<init>", "(Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;)V", "", "computeNext", "()V", "a", "Ljava/util/Iterator;", "b", "Lkotlin/jvm/functions/Function1;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "c", "Ljava/util/HashSet;", "observed", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class d6e<T, K> extends AbstractIterator<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Iterator<T> source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<T, K> keySelector;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final HashSet<K> observed;

    /* JADX WARN: Multi-variable type inference failed */
    public d6e(@NotNull Iterator<? extends T> it, @NotNull Function1<? super T, ? extends K> function1) {
        it.getClass();
        function1.getClass();
        this.source = it;
        this.keySelector = function1;
        this.observed = new HashSet<>();
    }

    @Override // kotlin.collections.AbstractIterator
    public void computeNext() {
        while (this.source.hasNext()) {
            T next = this.source.next();
            if (this.observed.add(this.keySelector.invoke(next))) {
                setNext(next);
                return;
            }
        }
        done();
    }
}
