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
    public final TypeProjection f65843a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public NewCapturedTypeConstructor f65844b;

    public CapturedTypeConstructorImpl(@NotNull TypeProjection typeProjection) {
        typeProjection.getClass();
        this.f65843a = typeProjection;
        mo91894d().mo92667c();
        Variance variance = Variance.INVARIANT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<KotlinType> mo88678c() {
        KotlinType type = mo91894d().mo92667c() == Variance.OUT_VARIANCE ? mo91894d().getType() : mo88679f().m88214J();
        type.getClass();
        return CollectionsKt.listOf(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    @NotNull
    /* JADX INFO: renamed from: d */
    public TypeProjection mo91894d() {
        return this.f65843a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ ClassifierDescriptor mo88316e() {
        return (ClassifierDescriptor) m91895h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: f */
    public KotlinBuiltIns mo88679f() {
        KotlinBuiltIns kotlinBuiltInsMo88679f = mo91894d().getType().mo91890G0().mo88679f();
        kotlinBuiltInsMo88679f.getClass();
        return kotlinBuiltInsMo88679f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: g */
    public boolean mo88317g() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public Void m91895h() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final NewCapturedTypeConstructor m91896i() {
        return this.f65844b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public CapturedTypeConstructorImpl mo88677a(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        TypeProjection typeProjectionMo92665a = mo91894d().mo92665a(kotlinTypeRefiner);
        typeProjectionMo92665a.getClass();
        return new CapturedTypeConstructorImpl(typeProjectionMo92665a);
    }

    /* JADX INFO: renamed from: k */
    public final void m91898k(@Nullable NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.f65844b = newCapturedTypeConstructor;
    }

    @NotNull
    public String toString() {
        return "CapturedTypeConstructor(" + mo91894d() + ')';
    }
}
