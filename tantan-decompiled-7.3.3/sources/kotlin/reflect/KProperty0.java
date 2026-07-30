package kotlin.reflect;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000bJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m88121d2 = {"Lkotlin/reflect/KProperty0;", p7f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/KProperty;", "Lkotlin/Function0;", "", "getDelegate", "()Ljava/lang/Object;", "Lkotlin/reflect/KProperty0$Getter;", "getGetter", "()Lkotlin/reflect/KProperty0$Getter;", "getter", "Getter", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface KProperty0<V> extends KProperty<V>, Function0<V> {

    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003¨\u0006\u0004"}, m88121d2 = {"Lkotlin/reflect/KProperty0$Getter;", p7f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/KProperty$Getter;", "Lkotlin/Function0;", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface Getter<V> extends KProperty.Getter<V>, Function0<V> {
    }

    @SinceKotlin
    @Nullable
    Object getDelegate();

    @Override // kotlin.reflect.KProperty
    @NotNull
    /* JADX INFO: renamed from: getGetter */
    Getter<V> mo88810h0();
}
