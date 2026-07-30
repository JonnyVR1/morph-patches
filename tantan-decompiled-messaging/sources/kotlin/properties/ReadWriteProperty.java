package kotlin.properties;

import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003J$\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H¦\u0002¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\t\u001a\u00028\u0001H¦\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Lkotlin/properties/ReadWriteProperty;", j6f.GPS_DIRECTION_TRUE, j6f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/properties/ReadOnlyProperty;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "a", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "", "b", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public interface ReadWriteProperty<T, V> extends ReadOnlyProperty<T, V> {
    @Override // kotlin.properties.ReadOnlyProperty
    /* JADX INFO: renamed from: a */
    V mo1436a(T thisRef, @NotNull KProperty<?> property);

    /* JADX INFO: renamed from: b */
    void mo87564b(T thisRef, @NotNull KProperty<?> property, V value);
}
