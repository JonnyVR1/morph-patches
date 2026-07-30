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
    public static final List<TypeProjection> m93826a(UnwrappedType unwrappedType, CaptureStatus captureStatus) {
        if (unwrappedType.mo92779E0().size() != unwrappedType.mo92781G0().getParameters().size()) {
            return null;
        }
        List<TypeProjection> listMo92779E0 = unwrappedType.mo92779E0();
        List<TypeProjection> list = listMo92779E0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((TypeProjection) it.next()).mo93558c() != Variance.INVARIANT) {
                    List<TypeParameterDescriptor> parameters = unwrappedType.mo92781G0().getParameters();
                    parameters.getClass();
                    List<Pair> listZip = CollectionsKt.zip(list, parameters);
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listZip, 10));
                    for (Pair pair : listZip) {
                        TypeProjection typeProjectionM93975d = (TypeProjection) pair.component1();
                        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.component2();
                        if (typeProjectionM93975d.mo93558c() != Variance.INVARIANT) {
                            UnwrappedType unwrappedTypeMo93516J0 = (typeProjectionM93975d.mo93557b() || typeProjectionM93975d.mo93558c() != Variance.IN_VARIANCE) ? null : typeProjectionM93975d.getType().mo93516J0();
                            typeParameterDescriptor.getClass();
                            typeProjectionM93975d = TypeUtilsKt.m93975d(new NewCapturedType(captureStatus, unwrappedTypeMo93516J0, typeProjectionM93975d, typeParameterDescriptor));
                        }
                        arrayList.add(typeProjectionM93975d);
                    }
                    TypeSubstitutor typeSubstitutorM93648c = TypeConstructorSubstitution.Companion.m93630b(unwrappedType.mo92781G0(), arrayList).m93648c();
                    int size = listMo92779E0.size();
                    for (int i = 0; i < size; i++) {
                        TypeProjection typeProjection = listMo92779E0.get(i);
                        TypeProjection typeProjection2 = (TypeProjection) arrayList.get(i);
                        if (typeProjection.mo93558c() != Variance.INVARIANT) {
                            List<KotlinType> upperBounds = unwrappedType.mo92781G0().getParameters().get(i).getUpperBounds();
                            upperBounds.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(KotlinTypePreparator.Default.INSTANCE.mo93449a(typeSubstitutorM93648c.m93672o((KotlinType) it2.next(), Variance.INVARIANT).mo93516J0()));
                            }
                            if (!typeProjection.mo93557b() && typeProjection.mo93558c() == Variance.OUT_VARIANCE) {
                                arrayList2.add(KotlinTypePreparator.Default.INSTANCE.mo93449a(typeProjection.getType().mo93516J0()));
                            }
                            KotlinType type = typeProjection2.getType();
                            type.getClass();
                            ((NewCapturedType) type).mo92781G0().m93824p(arrayList2);
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
    public static final SimpleType m93827b(@NotNull SimpleType simpleType, @NotNull CaptureStatus captureStatus) {
        simpleType.getClass();
        captureStatus.getClass();
        List<TypeProjection> listM93826a = m93826a(simpleType, captureStatus);
        if (listM93826a != null) {
            return m93828c(simpleType, listM93826a);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final SimpleType m93828c(UnwrappedType unwrappedType, List<? extends TypeProjection> list) {
        return KotlinTypeFactory.m93525k(unwrappedType.mo92780F0(), unwrappedType.mo92781G0(), list, unwrappedType.mo90857H0(), null, 16, null);
    }
}
