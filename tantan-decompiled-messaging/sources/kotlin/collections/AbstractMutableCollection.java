package kotlin.collections;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.markers.KMutableCollection;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\t¨\u0006\n"}, m87232d2 = {"Lkotlin/collections/AbstractMutableCollection;", "E", "", "Ljava/util/AbstractCollection;", "<init>", "()V", "add", "", "element", "(Ljava/lang/Object;)Z", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class AbstractMutableCollection<E> extends java.util.AbstractCollection<E> implements Collection<E>, KMutableCollection {
    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E element);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
