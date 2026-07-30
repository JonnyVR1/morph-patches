package kotlin.reflect;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m87232d2 = {"Lkotlin/reflect/KMutableProperty0;", j6f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/KMutableProperty;", "Lkotlin/reflect/KMutableProperty0$Setter;", "getSetter", "()Lkotlin/reflect/KMutableProperty0$Setter;", "setter", "Setter", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public interface KMutableProperty0<V> extends KProperty0<V>, KMutableProperty<V> {

    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, m87232d2 = {"Lkotlin/reflect/KMutableProperty0$Setter;", j6f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/KMutableProperty$Setter;", "Lkotlin/Function1;", "", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface Setter<V> extends KMutableProperty.Setter<V>, Function1<V, Unit> {
    }

    @Override // kotlin.reflect.KMutableProperty
    @NotNull
    Setter<V> getSetter();
}
