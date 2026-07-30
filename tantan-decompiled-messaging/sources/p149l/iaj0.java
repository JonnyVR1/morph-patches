package p149l;

import com.p046p1.mobile.putong.core.data.Item;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/iaj0;", j6f.GPS_DIRECTION_TRUE, "", "rootIterator", "Lkotlin/Function1;", "getChildIterator", "<init>", "(Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", Item.TYPE, "", "a", "(Ljava/lang/Object;)V", "Lkotlin/jvm/functions/Function1;", "", "b", "Ljava/util/List;", "stack", "c", "Ljava/util/Iterator;", "iterator", "core-ktx_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class iaj0<T> implements Iterator<T>, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<T, Iterator<T>> getChildIterator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<Iterator<T>> stack = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public Iterator<? extends T> iterator;

    /* JADX WARN: Multi-variable type inference failed */
    public iaj0(@NotNull Iterator<? extends T> it, @NotNull Function1<? super T, ? extends Iterator<? extends T>> function1) {
        this.getChildIterator = function1;
        this.iterator = it;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: a */
    public final void m135160a(T item) {
        Iterator<T> itInvoke = this.getChildIterator.invoke(item);
        if (itInvoke != null && itInvoke.hasNext()) {
            this.stack.add((Iterator<T>) this.iterator);
            this.iterator = itInvoke;
        } else {
            while (!this.iterator.hasNext() && !this.stack.isEmpty()) {
                this.iterator = (Iterator) CollectionsKt.last((List) this.stack);
                CollectionsKt.removeLast(this.stack);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        T next = this.iterator.next();
        m135160a(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
