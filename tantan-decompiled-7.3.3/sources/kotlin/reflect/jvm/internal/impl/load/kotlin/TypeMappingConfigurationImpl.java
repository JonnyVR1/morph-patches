package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeMappingConfigurationImpl implements TypeMappingConfiguration<JvmType> {

    @NotNull
    public static final TypeMappingConfigurationImpl INSTANCE = new TypeMappingConfigurationImpl();

    private TypeMappingConfigurationImpl() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    @Nullable
    /* JADX INFO: renamed from: b */
    public String mo91289b(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    @Nullable
    /* JADX INFO: renamed from: c */
    public KotlinType mo91290c(KotlinType kotlinType) {
        kotlinType.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    @Nullable
    /* JADX INFO: renamed from: d */
    public String mo91291d(ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    /* JADX INFO: renamed from: e */
    public void mo91292e(@NotNull KotlinType kotlinType, @NotNull ClassDescriptor classDescriptor) {
        kotlinType.getClass();
        classDescriptor.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    @Nullable
    /* JADX INFO: renamed from: f */
    public KotlinBuiltIns mo91293f() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    @NotNull
    /* JADX INFO: renamed from: g */
    public KotlinType mo91294g(@NotNull Collection<? extends KotlinType> collection) {
        collection.getClass();
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + CollectionsKt.joinToString$default(collection, null, null, null, 0, null, null, 63, null));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    @Nullable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public JvmType mo91288a(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        return null;
    }
}
