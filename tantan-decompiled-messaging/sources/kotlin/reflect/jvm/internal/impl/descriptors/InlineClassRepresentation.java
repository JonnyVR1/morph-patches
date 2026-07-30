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
    public final Name f64039a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Type f64040b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineClassRepresentation(@NotNull Name name, @NotNull Type type) {
        super(null);
        name.getClass();
        type.getClass();
        this.f64039a = name;
        this.f64040b = type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    /* JADX INFO: renamed from: a */
    public boolean mo88536a(@NotNull Name name) {
        name.getClass();
        return Intrinsics.m87488d(this.f64039a, name);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Name m88537c() {
        return this.f64039a;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Type m88538d() {
        return this.f64040b;
    }

    @NotNull
    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f64039a + ", underlyingType=" + this.f64040b + ')';
    }
}
