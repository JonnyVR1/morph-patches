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
import p149l.gg4;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class CapturedTypeConstructorKt {
    /* JADX INFO: renamed from: c */
    public static final TypeProjection m91901c(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null || typeProjection.mo92667c() == Variance.INVARIANT) {
            return typeProjection;
        }
        if (typeParameterDescriptor.mo88601h() != typeProjection.mo92667c()) {
            return new TypeProjectionImpl(m91903e(typeProjection));
        }
        if (!typeProjection.mo92666b()) {
            return new TypeProjectionImpl(typeProjection.getType());
        }
        StorageManager storageManager = LockBasedStorageManager.f66165e;
        storageManager.getClass();
        return new TypeProjectionImpl(new LazyWrappedType(storageManager, new gg4(typeProjection)));
    }

    /* JADX INFO: renamed from: d */
    public static final KotlinType m91902d(TypeProjection typeProjection) {
        KotlinType type = typeProjection.getType();
        type.getClass();
        return type;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final KotlinType m91903e(@NotNull TypeProjection typeProjection) {
        typeProjection.getClass();
        return new CapturedType(typeProjection, null, false, null, 14, null);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m91904f(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.mo91890G0() instanceof CapturedTypeConstructor;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final TypeSubstitution m91905g(@NotNull final TypeSubstitution typeSubstitution, final boolean z) {
        typeSubstitution.getClass();
        if (!(typeSubstitution instanceof IndexedParametersSubstitution)) {
            return new DelegatedTypeSubstitution(typeSubstitution) { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$wrapWithCapturingSubstitution$2
                @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                /* JADX INFO: renamed from: b */
                public boolean mo91907b() {
                    return z;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                /* JADX INFO: renamed from: e */
                public TypeProjection mo89881e(KotlinType kotlinType) {
                    kotlinType.getClass();
                    TypeProjection typeProjectionMo89881e = super.mo89881e(kotlinType);
                    if (typeProjectionMo89881e == null) {
                        return null;
                    }
                    ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
                    return CapturedTypeConstructorKt.m91901c(typeProjectionMo89881e, classifierDescriptorMo88316e instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo88316e : null);
                }
            };
        }
        IndexedParametersSubstitution indexedParametersSubstitution = (IndexedParametersSubstitution) typeSubstitution;
        TypeParameterDescriptor[] typeParameterDescriptorArrM92610j = indexedParametersSubstitution.m92610j();
        List<Pair> listZip = ArraysKt.zip(indexedParametersSubstitution.m92609i(), indexedParametersSubstitution.m92610j());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listZip, 10));
        for (Pair pair : listZip) {
            arrayList.add(m91901c((TypeProjection) pair.getFirst(), (TypeParameterDescriptor) pair.getSecond()));
        }
        return new IndexedParametersSubstitution(typeParameterDescriptorArrM92610j, (TypeProjection[]) arrayList.toArray(new TypeProjection[0]), z);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ TypeSubstitution m91906h(TypeSubstitution typeSubstitution, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return m91905g(typeSubstitution, z);
    }
}
