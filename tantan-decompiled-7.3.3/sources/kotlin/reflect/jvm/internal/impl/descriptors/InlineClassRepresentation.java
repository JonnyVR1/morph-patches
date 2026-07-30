package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class InlineClassRepresentation<Type extends RigidTypeMarker> extends ValueClassRepresentation<Type> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Name f64713a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Type f64714b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineClassRepresentation(@NotNull Name name, @NotNull Type type) {
        super(null);
        name.getClass();
        type.getClass();
        this.f64713a = name;
        this.f64714b = type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    /* JADX INFO: renamed from: a */
    public boolean mo89427a(@NotNull Name name) {
        name.getClass();
        return Intrinsics.m88377d(this.f64713a, name);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Name m89428c() {
        return this.f64713a;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Type m89429d() {
        return this.f64714b;
    }

    @NotNull
    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f64713a + ", underlyingType=" + this.f64714b + ')';
    }
}
