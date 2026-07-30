package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import p153l.nbr;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class KotlinTypePreparator extends AbstractTypePreparator {

    public static final class Default extends KotlinTypePreparator {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UnwrappedType mo93449a(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        UnwrappedType unwrappedTypeM93520e;
        kotlinTypeMarker.getClass();
        if (!(kotlinTypeMarker instanceof KotlinType)) {
            wg3.m206174a("Failed requirement.");
            return null;
        }
        UnwrappedType unwrappedTypeMo93516J0 = ((KotlinType) kotlinTypeMarker).mo93516J0();
        if (unwrappedTypeMo93516J0 instanceof SimpleType) {
            unwrappedTypeM93520e = m93797c((SimpleType) unwrappedTypeMo93516J0);
        } else {
            if (!(unwrappedTypeMo93516J0 instanceof FlexibleType)) {
                nbr.m162172a();
                return null;
            }
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeMo93516J0;
            SimpleType simpleTypeM93797c = m93797c(flexibleType.m93488O0());
            SimpleType simpleTypeM93797c2 = m93797c(flexibleType.m93489P0());
            unwrappedTypeM93520e = (simpleTypeM93797c == flexibleType.m93488O0() && simpleTypeM93797c2 == flexibleType.m93489P0()) ? unwrappedTypeMo93516J0 : KotlinTypeFactory.m93520e(simpleTypeM93797c, simpleTypeM93797c2);
        }
        return TypeWithEnhancementKt.m93708c(unwrappedTypeM93520e, unwrappedTypeMo93516J0, new KotlinTypePreparator$prepareType$1(this));
    }

    /* JADX INFO: renamed from: c */
    public final SimpleType m93797c(SimpleType simpleType) {
        KotlinType type;
        TypeConstructor typeConstructorMo92781G0 = simpleType.mo92781G0();
        IntersectionTypeConstructor intersectionTypeConstructorM93514t = null;
        unwrappedTypeMo93516J0 = null;
        UnwrappedType unwrappedTypeMo93516J0 = null;
        if (typeConstructorMo92781G0 instanceof CapturedTypeConstructorImpl) {
            CapturedTypeConstructorImpl capturedTypeConstructorImpl = (CapturedTypeConstructorImpl) typeConstructorMo92781G0;
            TypeProjection typeProjectionMo92785d = capturedTypeConstructorImpl.mo92785d();
            if (typeProjectionMo92785d.mo93558c() != Variance.IN_VARIANCE) {
                typeProjectionMo92785d = null;
            }
            if (typeProjectionMo92785d != null && (type = typeProjectionMo92785d.getType()) != null) {
                unwrappedTypeMo93516J0 = type.mo93516J0();
            }
            UnwrappedType unwrappedType = unwrappedTypeMo93516J0;
            if (capturedTypeConstructorImpl.m92787i() == null) {
                TypeProjection typeProjectionMo92785d2 = capturedTypeConstructorImpl.mo92785d();
                Collection<KotlinType> collectionMo89569c = capturedTypeConstructorImpl.mo89569c();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo89569c, 10));
                Iterator<T> it = collectionMo89569c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((KotlinType) it.next()).mo93516J0());
                }
                capturedTypeConstructorImpl.m92789k(new NewCapturedTypeConstructor(typeProjectionMo92785d2, arrayList, null, 4, null));
            }
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            NewCapturedTypeConstructor newCapturedTypeConstructorM92787i = capturedTypeConstructorImpl.m92787i();
            newCapturedTypeConstructorM92787i.getClass();
            return new NewCapturedType(captureStatus, newCapturedTypeConstructorM92787i, unwrappedType, simpleType.mo92780F0(), simpleType.mo90857H0(), false, 32, null);
        }
        boolean z = false;
        if (typeConstructorMo92781G0 instanceof IntegerValueTypeConstructor) {
            Collection<KotlinType> collectionMo89569c2 = ((IntegerValueTypeConstructor) typeConstructorMo92781G0).mo89569c();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo89569c2, 10));
            Iterator<T> it2 = collectionMo89569c2.iterator();
            while (it2.hasNext()) {
                KotlinType kotlinTypeM93696p = TypeUtils.m93696p((KotlinType) it2.next(), simpleType.mo90857H0());
                kotlinTypeM93696p.getClass();
                arrayList2.add(kotlinTypeM93696p);
            }
            return KotlinTypeFactory.m93527m(simpleType.mo92780F0(), new IntersectionTypeConstructor(arrayList2), CollectionsKt.emptyList(), false, simpleType.mo90791n());
        }
        if (!(typeConstructorMo92781G0 instanceof IntersectionTypeConstructor) || !simpleType.mo90857H0()) {
            return simpleType;
        }
        IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) typeConstructorMo92781G0;
        Collection<KotlinType> collectionMo89569c3 = intersectionTypeConstructor.mo89569c();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo89569c3, 10));
        Iterator<T> it3 = collectionMo89569c3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(TypeUtilsKt.m93967B((KotlinType) it3.next()));
            z = true;
        }
        if (z) {
            KotlinType kotlinTypeM93511n = intersectionTypeConstructor.m93511n();
            intersectionTypeConstructorM93514t = new IntersectionTypeConstructor(arrayList3).m93514t(kotlinTypeM93511n != null ? TypeUtilsKt.m93967B(kotlinTypeM93511n) : null);
        }
        if (intersectionTypeConstructorM93514t != null) {
            intersectionTypeConstructor = intersectionTypeConstructorM93514t;
        }
        return intersectionTypeConstructor.m93510l();
    }
}
