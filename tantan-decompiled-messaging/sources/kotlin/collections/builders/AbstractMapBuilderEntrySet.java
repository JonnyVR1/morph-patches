package kotlin.collections.builders;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b \u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0002*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0002H&¨\u0006\r"}, m87232d2 = {"Lkotlin/collections/builders/AbstractMapBuilderEntrySet;", "E", "", "K", j6f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/AbstractMutableSet;", "<init>", "()V", "contains", "", "element", "(Ljava/util/Map$Entry;)Z", "containsEntry", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class AbstractMapBuilderEntrySet<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractMutableSet<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean containsEntry(@NotNull Map.Entry<? extends K, ? extends V> element);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return remove((Map.Entry<?, ?>) obj);
        }
        return false;
    }

    public final boolean contains(@NotNull E element) {
        element.getClass();
        return containsEntry(element);
    }

    public /* bridge */ boolean remove(Map.Entry<?, ?> entry) {
        return super.remove((Object) entry);
    }
}
