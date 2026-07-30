package kotlin.properties;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000e2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0012\u001a\u00028\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0014\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Lkotlin/properties/ObservableProperty;", p7f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/properties/ReadWriteProperty;", "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "Lkotlin/reflect/KProperty;", "property", Constants.KEY_OLD_VALUE, Constants.KEY_NEW_VALUE, "", Constants.INAPP_DATA_TAG, "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)Z", "", "c", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "thisRef", "a", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class ObservableProperty<V> implements ReadWriteProperty<Object, V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public V value;

    public ObservableProperty(V v2) {
        this.value = v2;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    /* JADX INFO: renamed from: a */
    public V mo1437a(@Nullable Object thisRef, @NotNull KProperty<?> property) {
        property.getClass();
        return this.value;
    }

    @Override // kotlin.properties.ReadWriteProperty
    /* JADX INFO: renamed from: b */
    public void mo88454b(@Nullable Object thisRef, @NotNull KProperty<?> property, V value) {
        property.getClass();
        V v2 = this.value;
        if (mo88453d(property, v2, value)) {
            this.value = value;
            mo88452c(property, v2, value);
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo88452c(@NotNull KProperty<?> property, V oldValue, V newValue) {
        property.getClass();
    }

    /* JADX INFO: renamed from: d */
    public boolean mo88453d(@NotNull KProperty<?> property, V oldValue, V newValue) {
        property.getClass();
        return true;
    }

    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
