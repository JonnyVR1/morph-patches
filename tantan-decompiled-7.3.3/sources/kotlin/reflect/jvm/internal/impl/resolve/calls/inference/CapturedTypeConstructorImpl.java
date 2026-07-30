package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class CapturedTypeConstructorImpl implements CapturedTypeConstructor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TypeProjection f66517a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public NewCapturedTypeConstructor f66518b;

    public CapturedTypeConstructorImpl(@NotNull TypeProjection typeProjection) {
        typeProjection.getClass();
        this.f66517a = typeProjection;
        mo92785d().mo93558c();
        Variance variance = Variance.INVARIANT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<KotlinType> mo89569c() {
        KotlinType type = mo92785d().mo93558c() == Variance.OUT_VARIANCE ? mo92785d().getType() : mo89570f().m89105J();
        type.getClass();
        return CollectionsKt.listOf(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    @NotNull
    /* JADX INFO: renamed from: d */
    public TypeProjection mo92785d() {
        return this.f66517a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ ClassifierDescriptor mo89207e() {
        return (ClassifierDescriptor) m92786h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: f */
    public KotlinBuiltIns mo89570f() {
        KotlinBuiltIns kotlinBuiltInsMo89570f = mo92785d().getType().mo92781G0().mo89570f();
        kotlinBuiltInsMo89570f.getClass();
        return kotlinBuiltInsMo89570f;
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
    public Void m92786h() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final NewCapturedTypeConstructor m92787i() {
        return this.f66518b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public CapturedTypeConstructorImpl mo89568a(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        TypeProjection typeProjectionMo93556a = mo92785d().mo93556a(kotlinTypeRefiner);
        typeProjectionMo93556a.getClass();
        return new CapturedTypeConstructorImpl(typeProjectionMo93556a);
    }

    /* JADX INFO: renamed from: k */
    public final void m92789k(@Nullable NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.f66518b = newCapturedTypeConstructor;
    }

    @NotNull
    public String toString() {
        return "CapturedTypeConstructor(" + mo92785d() + ')';
    }
}
