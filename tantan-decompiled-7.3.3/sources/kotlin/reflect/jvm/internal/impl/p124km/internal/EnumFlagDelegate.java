package kotlin.reflect.jvm.internal.impl.p124km.internal;

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
    public final KMutableProperty1<Node, Integer> f65255a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Flags.FlagField<? extends Internal.EnumLite> f65256b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final EnumEntries<E> f65257c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final List<FlagImpl> f65258d;

    public EnumFlagDelegate(@NotNull KMutableProperty1<Node, Integer> kMutableProperty1, @NotNull Flags.FlagField<? extends Internal.EnumLite> flagField, @NotNull EnumEntries<E> enumEntries, @NotNull List<FlagImpl> list) {
        kMutableProperty1.getClass();
        flagField.getClass();
        enumEntries.getClass();
        list.getClass();
        this.f65255a = kMutableProperty1;
        this.f65256b = flagField;
        this.f65257c = enumEntries;
        this.f65258d = list;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final E m90097a(Node node, @NotNull KProperty<?> kProperty) {
        kProperty.getClass();
        return this.f65257c.get(this.f65256b.mo91766d(this.f65255a.get(node).intValue()).getNumber());
    }
}
