package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class NewCapturedTypeKt {
    /* JADX INFO: renamed from: a */
    public static final List<TypeProjection> m92935a(UnwrappedType unwrappedType, CaptureStatus captureStatus) {
        if (unwrappedType.mo91888E0().size() != unwrappedType.mo91890G0().getParameters().size()) {
            return null;
        }
        List<TypeProjection> listMo91888E0 = unwrappedType.mo91888E0();
        List<TypeProjection> list = listMo91888E0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((TypeProjection) it.next()).mo92667c() != Variance.INVARIANT) {
                    List<TypeParameterDescriptor> parameters = unwrappedType.mo91890G0().getParameters();
                    parameters.getClass();
                    List<Pair> listZip = CollectionsKt.zip(list, parameters);
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listZip, 10));
                    for (Pair pair : listZip) {
                        TypeProjection typeProjectionM93084d = (TypeProjection) pair.component1();
                        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.component2();
                        if (typeProjectionM93084d.mo92667c() != Variance.INVARIANT) {
                            UnwrappedType unwrappedTypeMo92625J0 = (typeProjectionM93084d.mo92666b() || typeProjectionM93084d.mo92667c() != Variance.IN_VARIANCE) ? null : typeProjectionM93084d.getType().mo92625J0();
                            typeParameterDescriptor.getClass();
                            typeProjectionM93084d = TypeUtilsKt.m93084d(new NewCapturedType(captureStatus, unwrappedTypeMo92625J0, typeProjectionM93084d, typeParameterDescriptor));
                        }
                        arrayList.add(typeProjectionM93084d);
                    }
                    TypeSubstitutor typeSubstitutorM92757c = TypeConstructorSubstitution.Companion.m92739b(unwrappedType.mo91890G0(), arrayList).m92757c();
                    int size = listMo91888E0.size();
                    for (int i = 0; i < size; i++) {
                        TypeProjection typeProjection = listMo91888E0.get(i);
                        TypeProjection typeProjection2 = (TypeProjection) arrayList.get(i);
                        if (typeProjection.mo92667c() != Variance.INVARIANT) {
                            List<KotlinType> upperBounds = unwrappedType.mo91890G0().getParameters().get(i).getUpperBounds();
                            upperBounds.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(KotlinTypePreparator.Default.INSTANCE.mo92558a(typeSubstitutorM92757c.m92781o((KotlinType) it2.next(), Variance.INVARIANT).mo92625J0()));
                            }
                            if (!typeProjection.mo92666b() && typeProjection.mo92667c() == Variance.OUT_VARIANCE) {
                                arrayList2.add(KotlinTypePreparator.Default.INSTANCE.mo92558a(typeProjection.getType().mo92625J0()));
                            }
                            KotlinType type = typeProjection2.getType();
                            type.getClass();
                            ((NewCapturedType) type).mo91890G0().m92933p(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final SimpleType m92936b(@NotNull SimpleType simpleType, @NotNull CaptureStatus captureStatus) {
        simpleType.getClass();
        captureStatus.getClass();
        List<TypeProjection> listM92935a = m92935a(simpleType, captureStatus);
        if (listM92935a != null) {
            return m92937c(simpleType, listM92935a);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final SimpleType m92937c(UnwrappedType unwrappedType, List<? extends TypeProjection> list) {
        return KotlinTypeFactory.m92634k(unwrappedType.mo91889F0(), unwrappedType.mo91890G0(), list, unwrappedType.mo89966H0(), null, 16, null);
    }
}
