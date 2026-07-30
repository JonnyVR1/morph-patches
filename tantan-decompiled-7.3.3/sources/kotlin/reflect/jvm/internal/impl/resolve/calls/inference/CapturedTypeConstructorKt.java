package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import p153l.fh4;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class CapturedTypeConstructorKt {
    /* JADX INFO: renamed from: c */
    public static final TypeProjection m92792c(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null || typeProjection.mo93558c() == Variance.INVARIANT) {
            return typeProjection;
        }
        if (typeParameterDescriptor.mo89492h() != typeProjection.mo93558c()) {
            return new TypeProjectionImpl(m92794e(typeProjection));
        }
        if (!typeProjection.mo93557b()) {
            return new TypeProjectionImpl(typeProjection.getType());
        }
        StorageManager storageManager = LockBasedStorageManager.f66839e;
        storageManager.getClass();
        return new TypeProjectionImpl(new LazyWrappedType(storageManager, new fh4(typeProjection)));
    }

    /* JADX INFO: renamed from: d */
    public static final KotlinType m92793d(TypeProjection typeProjection) {
        KotlinType type = typeProjection.getType();
        type.getClass();
        return type;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final KotlinType m92794e(@NotNull TypeProjection typeProjection) {
        typeProjection.getClass();
        return new CapturedType(typeProjection, null, false, null, 14, null);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m92795f(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.mo92781G0() instanceof CapturedTypeConstructor;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final TypeSubstitution m92796g(@NotNull final TypeSubstitution typeSubstitution, final boolean z) {
        typeSubstitution.getClass();
        if (!(typeSubstitution instanceof IndexedParametersSubstitution)) {
            return new DelegatedTypeSubstitution(typeSubstitution) { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$wrapWithCapturingSubstitution$2
                @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                /* JADX INFO: renamed from: b */
                public boolean mo92798b() {
                    return z;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                /* JADX INFO: renamed from: e */
                public TypeProjection mo90772e(KotlinType kotlinType) {
                    kotlinType.getClass();
                    TypeProjection typeProjectionMo90772e = super.mo90772e(kotlinType);
                    if (typeProjectionMo90772e == null) {
                        return null;
                    }
                    ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
                    return CapturedTypeConstructorKt.m92792c(typeProjectionMo90772e, classifierDescriptorMo89207e instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo89207e : null);
                }
            };
        }
        IndexedParametersSubstitution indexedParametersSubstitution = (IndexedParametersSubstitution) typeSubstitution;
        TypeParameterDescriptor[] typeParameterDescriptorArrM93501j = indexedParametersSubstitution.m93501j();
        List<Pair> listZip = ArraysKt.zip(indexedParametersSubstitution.m93500i(), indexedParametersSubstitution.m93501j());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listZip, 10));
        for (Pair pair : listZip) {
            arrayList.add(m92792c((TypeProjection) pair.getFirst(), (TypeParameterDescriptor) pair.getSecond()));
        }
        return new IndexedParametersSubstitution(typeParameterDescriptorArrM93501j, (TypeProjection[]) arrayList.toArray(new TypeProjection[0]), z);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ TypeSubstitution m92797h(TypeSubstitution typeSubstitution, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return m92796g(typeSubstitution, z);
    }
}
