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
import p149l.ig3;
import p149l.l9r;

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
    public UnwrappedType mo92558a(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        UnwrappedType unwrappedTypeM92629e;
        kotlinTypeMarker.getClass();
        if (!(kotlinTypeMarker instanceof KotlinType)) {
            ig3.m135964a("Failed requirement.");
            return null;
        }
        UnwrappedType unwrappedTypeMo92625J0 = ((KotlinType) kotlinTypeMarker).mo92625J0();
        if (unwrappedTypeMo92625J0 instanceof SimpleType) {
            unwrappedTypeM92629e = m92906c((SimpleType) unwrappedTypeMo92625J0);
        } else {
            if (!(unwrappedTypeMo92625J0 instanceof FlexibleType)) {
                l9r.m149037a();
                return null;
            }
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeMo92625J0;
            SimpleType simpleTypeM92906c = m92906c(flexibleType.m92597O0());
            SimpleType simpleTypeM92906c2 = m92906c(flexibleType.m92598P0());
            unwrappedTypeM92629e = (simpleTypeM92906c == flexibleType.m92597O0() && simpleTypeM92906c2 == flexibleType.m92598P0()) ? unwrappedTypeMo92625J0 : KotlinTypeFactory.m92629e(simpleTypeM92906c, simpleTypeM92906c2);
        }
        return TypeWithEnhancementKt.m92817c(unwrappedTypeM92629e, unwrappedTypeMo92625J0, new KotlinTypePreparator$prepareType$1(this));
    }

    /* JADX INFO: renamed from: c */
    public final SimpleType m92906c(SimpleType simpleType) {
        KotlinType type;
        TypeConstructor typeConstructorMo91890G0 = simpleType.mo91890G0();
        IntersectionTypeConstructor intersectionTypeConstructorM92623t = null;
        unwrappedTypeMo92625J0 = null;
        UnwrappedType unwrappedTypeMo92625J0 = null;
        if (typeConstructorMo91890G0 instanceof CapturedTypeConstructorImpl) {
            CapturedTypeConstructorImpl capturedTypeConstructorImpl = (CapturedTypeConstructorImpl) typeConstructorMo91890G0;
            TypeProjection typeProjectionMo91894d = capturedTypeConstructorImpl.mo91894d();
            if (typeProjectionMo91894d.mo92667c() != Variance.IN_VARIANCE) {
                typeProjectionMo91894d = null;
            }
            if (typeProjectionMo91894d != null && (type = typeProjectionMo91894d.getType()) != null) {
                unwrappedTypeMo92625J0 = type.mo92625J0();
            }
            UnwrappedType unwrappedType = unwrappedTypeMo92625J0;
            if (capturedTypeConstructorImpl.m91896i() == null) {
                TypeProjection typeProjectionMo91894d2 = capturedTypeConstructorImpl.mo91894d();
                Collection<KotlinType> collectionMo88678c = capturedTypeConstructorImpl.mo88678c();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo88678c, 10));
                Iterator<T> it = collectionMo88678c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((KotlinType) it.next()).mo92625J0());
                }
                capturedTypeConstructorImpl.m91898k(new NewCapturedTypeConstructor(typeProjectionMo91894d2, arrayList, null, 4, null));
            }
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            NewCapturedTypeConstructor newCapturedTypeConstructorM91896i = capturedTypeConstructorImpl.m91896i();
            newCapturedTypeConstructorM91896i.getClass();
            return new NewCapturedType(captureStatus, newCapturedTypeConstructorM91896i, unwrappedType, simpleType.mo91889F0(), simpleType.mo89966H0(), false, 32, null);
        }
        boolean z = false;
        if (typeConstructorMo91890G0 instanceof IntegerValueTypeConstructor) {
            Collection<KotlinType> collectionMo88678c2 = ((IntegerValueTypeConstructor) typeConstructorMo91890G0).mo88678c();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo88678c2, 10));
            Iterator<T> it2 = collectionMo88678c2.iterator();
            while (it2.hasNext()) {
                KotlinType kotlinTypeM92805p = TypeUtils.m92805p((KotlinType) it2.next(), simpleType.mo89966H0());
                kotlinTypeM92805p.getClass();
                arrayList2.add(kotlinTypeM92805p);
            }
            return KotlinTypeFactory.m92636m(simpleType.mo91889F0(), new IntersectionTypeConstructor(arrayList2), CollectionsKt.emptyList(), false, simpleType.mo89900n());
        }
        if (!(typeConstructorMo91890G0 instanceof IntersectionTypeConstructor) || !simpleType.mo89966H0()) {
            return simpleType;
        }
        IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) typeConstructorMo91890G0;
        Collection<KotlinType> collectionMo88678c3 = intersectionTypeConstructor.mo88678c();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo88678c3, 10));
        Iterator<T> it3 = collectionMo88678c3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(TypeUtilsKt.m93076B((KotlinType) it3.next()));
            z = true;
        }
        if (z) {
            KotlinType kotlinTypeM92620n = intersectionTypeConstructor.m92620n();
            intersectionTypeConstructorM92623t = new IntersectionTypeConstructor(arrayList3).m92623t(kotlinTypeM92620n != null ? TypeUtilsKt.m93076B(kotlinTypeM92620n) : null);
        }
        if (intersectionTypeConstructorM92623t != null) {
            intersectionTypeConstructor = intersectionTypeConstructorM92623t;
        }
        return intersectionTypeConstructor.m92619l();
    }
}
