package kotlin.reflect.jvm.internal.impl.util;

import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class NullableArrayMapAccessor<K, V, T extends V> extends AbstractArrayMapOwner.AbstractArrayMapAccessor<K, V, T> implements ReadOnlyProperty<AbstractArrayMapOwner<K, V>, V> {
    public NullableArrayMapAccessor(int i) {
        super(i);
    }

    @Override // kotlin.properties.ReadOnlyProperty
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public T mo1436a(@NotNull AbstractArrayMapOwner<K, V> abstractArrayMapOwner, @NotNull KProperty<?> kProperty) {
        abstractArrayMapOwner.getClass();
        kProperty.getClass();
        return m93125c(abstractArrayMapOwner);
    }
}
