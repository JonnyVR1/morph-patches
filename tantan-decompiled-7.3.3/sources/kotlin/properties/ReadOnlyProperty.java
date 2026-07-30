package kotlin.properties;

import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003J$\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H¦\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lkotlin/properties/ReadOnlyProperty;", p7f.GPS_DIRECTION_TRUE, p7f.GPS_MEASUREMENT_INTERRUPTED, "", "thisRef", "Lkotlin/reflect/KProperty;", "property", "a", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface ReadOnlyProperty<T, V> {
    /* JADX INFO: renamed from: a */
    V mo1437a(T thisRef, @NotNull KProperty<?> property);
}
