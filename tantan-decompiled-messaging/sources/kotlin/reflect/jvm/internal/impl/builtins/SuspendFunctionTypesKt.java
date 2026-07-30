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
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class SuspendFunctionTypesKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MutableClassDescriptor f63934a;

    static {
        EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(ErrorUtils.INSTANCE.m93010i(), StandardNames.f63826r);
        ClassKind classKind = ClassKind.INTERFACE;
        Name nameM91051f = StandardNames.f63830v.m91051f();
        SourceElement sourceElement = SourceElement.f64063a;
        StorageManager storageManager = LockBasedStorageManager.f66165e;
        MutableClassDescriptor mutableClassDescriptor = new MutableClassDescriptor(emptyPackageFragmentDescriptor, classKind, false, false, nameM91051f, sourceElement, storageManager);
        mutableClassDescriptor.m88833F0(Modality.ABSTRACT);
        mutableClassDescriptor.m88835H0(DescriptorVisibilities.f64026e);
        mutableClassDescriptor.m88834G0(CollectionsKt.listOf(TypeParameterDescriptorImpl.m88918K0(mutableClassDescriptor, Annotations.Companion.m88641b(), false, Variance.IN_VARIANCE, Name.m91079i(j6f.GPS_DIRECTION_TRUE), 0, storageManager)));
        mutableClassDescriptor.m88831D0();
        f63934a = mutableClassDescriptor;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final SimpleType m88276a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        FunctionTypesKt.m88162s(kotlinType);
        KotlinBuiltIns kotlinBuiltInsM93094n = TypeUtilsKt.m93094n(kotlinType);
        Annotations annotations = kotlinType.getAnnotations();
        KotlinType kotlinTypeM88154k = FunctionTypesKt.m88154k(kotlinType);
        List<KotlinType> listM88148e = FunctionTypesKt.m88148e(kotlinType);
        List<TypeProjection> listM88156m = FunctionTypesKt.m88156m(kotlinType);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM88156m, 10));
        Iterator<T> it = listM88156m.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        TypeAttributes typeAttributesM92709k = TypeAttributes.Companion.m92709k();
        TypeConstructor typeConstructorMo88305l = f63934a.mo88305l();
        typeConstructorMo88305l.getClass();
        List listPlus = CollectionsKt.plus((Collection<? extends SimpleType>) arrayList, KotlinTypeFactory.m92634k(typeAttributesM92709k, typeConstructorMo88305l, CollectionsKt.listOf(TypeUtilsKt.m93084d(FunctionTypesKt.m88155l(kotlinType))), false, null, 16, null));
        SimpleType simpleTypeM88214J = TypeUtilsKt.m93094n(kotlinType).m88214J();
        simpleTypeM88214J.getClass();
        return FunctionTypesKt.m88145b(kotlinBuiltInsM93094n, annotations, kotlinTypeM88154k, listM88148e, listPlus, null, simpleTypeM88214J, (128 & 128) != 0 ? false : false).mo89967N0(kotlinType.mo89966H0());
    }
}
