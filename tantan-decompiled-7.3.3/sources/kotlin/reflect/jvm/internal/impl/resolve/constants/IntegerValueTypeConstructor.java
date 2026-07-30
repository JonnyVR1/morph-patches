package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class IntegerValueTypeConstructor implements TypeConstructor {

    /* JADX INFO: renamed from: a */
    public final long f66533a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ModuleDescriptor f66534b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ArrayList<KotlinType> f66535c;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: a */
    public TypeConstructor mo89568a(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<KotlinType> mo89569c() {
        return this.f66535c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ ClassifierDescriptor mo89207e() {
        return (ClassifierDescriptor) m92838h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: f */
    public KotlinBuiltIns mo89570f() {
        return this.f66534b.mo89437f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: g */
    public boolean mo89208g() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public Void m92838h() {
        return null;
    }

    @NotNull
    public String toString() {
        return "IntegerValueType(" + this.f66533a + ')';
    }
}
