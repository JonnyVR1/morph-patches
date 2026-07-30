package kotlin.reflect;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0007R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m88121d2 = {"Lkotlin/reflect/KMutableProperty;", p7f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/KProperty;", "setter", "Lkotlin/reflect/KMutableProperty$Setter;", "getSetter", "()Lkotlin/reflect/KMutableProperty$Setter;", "Setter", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface KMutableProperty<V> extends KProperty<V> {

    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, m88121d2 = {"Lkotlin/reflect/KMutableProperty$Setter;", p7f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface Setter<V> extends KProperty.Accessor<V>, KFunction<Unit> {
    }

    @NotNull
    Setter<V> getSetter();
}
