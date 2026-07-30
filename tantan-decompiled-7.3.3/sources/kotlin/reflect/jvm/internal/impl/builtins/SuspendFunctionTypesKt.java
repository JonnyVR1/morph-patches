package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class SuspendFunctionTypesKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MutableClassDescriptor f64608a;

    static {
        EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(ErrorUtils.INSTANCE.m93901i(), StandardNames.f64500r);
        ClassKind classKind = ClassKind.INTERFACE;
        Name nameM91942f = StandardNames.f64504v.m91942f();
        SourceElement sourceElement = SourceElement.f64737a;
        StorageManager storageManager = LockBasedStorageManager.f66839e;
        MutableClassDescriptor mutableClassDescriptor = new MutableClassDescriptor(emptyPackageFragmentDescriptor, classKind, false, false, nameM91942f, sourceElement, storageManager);
        mutableClassDescriptor.m89724F0(Modality.ABSTRACT);
        mutableClassDescriptor.m89726H0(DescriptorVisibilities.f64700e);
        mutableClassDescriptor.m89725G0(CollectionsKt.listOf(TypeParameterDescriptorImpl.m89809K0(mutableClassDescriptor, Annotations.Companion.m89532b(), false, Variance.IN_VARIANCE, Name.m91970i(p7f.GPS_DIRECTION_TRUE), 0, storageManager)));
        mutableClassDescriptor.m89722D0();
        f64608a = mutableClassDescriptor;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final SimpleType m89167a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        FunctionTypesKt.m89053s(kotlinType);
        KotlinBuiltIns kotlinBuiltInsM93985n = TypeUtilsKt.m93985n(kotlinType);
        Annotations annotations = kotlinType.getAnnotations();
        KotlinType kotlinTypeM89045k = FunctionTypesKt.m89045k(kotlinType);
        List<KotlinType> listM89039e = FunctionTypesKt.m89039e(kotlinType);
        List<TypeProjection> listM89047m = FunctionTypesKt.m89047m(kotlinType);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM89047m, 10));
        Iterator<T> it = listM89047m.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        TypeAttributes typeAttributesM93600k = TypeAttributes.Companion.m93600k();
        TypeConstructor typeConstructorMo89196l = f64608a.mo89196l();
        typeConstructorMo89196l.getClass();
        List listPlus = CollectionsKt.plus((Collection<? extends SimpleType>) arrayList, KotlinTypeFactory.m93525k(typeAttributesM93600k, typeConstructorMo89196l, CollectionsKt.listOf(TypeUtilsKt.m93975d(FunctionTypesKt.m89046l(kotlinType))), false, null, 16, null));
        SimpleType simpleTypeM89105J = TypeUtilsKt.m93985n(kotlinType).m89105J();
        simpleTypeM89105J.getClass();
        return FunctionTypesKt.m89036b(kotlinBuiltInsM93985n, annotations, kotlinTypeM89045k, listM89039e, listPlus, null, simpleTypeM89105J, (128 & 128) != 0 ? false : false).mo90858N0(kotlinType.mo90857H0());
    }
}
