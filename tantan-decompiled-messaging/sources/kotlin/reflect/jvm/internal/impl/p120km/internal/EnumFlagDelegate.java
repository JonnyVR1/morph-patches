package kotlin.reflect.jvm.internal.impl.p120km.internal;

import java.lang.Enum;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class EnumFlagDelegate<Node, E extends Enum<E>> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final KMutableProperty1<Node, Integer> f64581a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Flags.FlagField<? extends Internal.EnumLite> f64582b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final EnumEntries<E> f64583c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final List<FlagImpl> f64584d;

    public EnumFlagDelegate(@NotNull KMutableProperty1<Node, Integer> kMutableProperty1, @NotNull Flags.FlagField<? extends Internal.EnumLite> flagField, @NotNull EnumEntries<E> enumEntries, @NotNull List<FlagImpl> list) {
        kMutableProperty1.getClass();
        flagField.getClass();
        enumEntries.getClass();
        list.getClass();
        this.f64581a = kMutableProperty1;
        this.f64582b = flagField;
        this.f64583c = enumEntries;
        this.f64584d = list;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final E m89206a(Node node, @NotNull KProperty<?> kProperty) {
        kProperty.getClass();
        return this.f64583c.get(this.f64582b.mo90875d(this.f64581a.get(node).intValue()).getNumber());
    }
}
