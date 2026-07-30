package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiFieldValueClassRepresentation<Type extends RigidTypeMarker> extends ValueClassRepresentation<Type> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<Pair<Name, Type>> f64043a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Map<Name, Type> f64044b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MultiFieldValueClassRepresentation(@NotNull List<? extends Pair<Name, ? extends Type>> list) {
        super(null);
        list.getClass();
        this.f64043a = list;
        this.f64044b = MapsKt.toMap(m88551c());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    /* JADX INFO: renamed from: a */
    public boolean mo88536a(@NotNull Name name) {
        name.getClass();
        return this.f64044b.containsKey(name);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public List<Pair<Name, Type>> m88551c() {
        return this.f64043a;
    }

    @NotNull
    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + m88551c() + ')';
    }
}
