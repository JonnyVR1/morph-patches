package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeConstructor extends TypeConstructorMarker {
    @NotNull
    /* JADX INFO: renamed from: a */
    TypeConstructor mo88677a(@NotNull KotlinTypeRefiner kotlinTypeRefiner);

    @NotNull
    /* JADX INFO: renamed from: c */
    Collection<KotlinType> mo88678c();

    @Nullable
    /* JADX INFO: renamed from: e */
    ClassifierDescriptor mo88316e();

    @NotNull
    /* JADX INFO: renamed from: f */
    KotlinBuiltIns mo88679f();

    /* JADX INFO: renamed from: g */
    boolean mo88317g();

    @NotNull
    List<TypeParameterDescriptor> getParameters();
}
