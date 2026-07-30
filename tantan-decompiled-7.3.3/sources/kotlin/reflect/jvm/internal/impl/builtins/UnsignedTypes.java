package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class UnsignedTypes {

    @NotNull
    public static final UnsignedTypes INSTANCE = new UnsignedTypes();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Set<Name> f64609a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Set<Name> f64610b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final HashMap<ClassId, ClassId> f64611c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final HashMap<ClassId, ClassId> f64612d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final HashMap<UnsignedArrayType, Name> f64613e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Set<Name> f64614f;

    static {
        UnsignedType[] unsignedTypeArrValues = UnsignedType.values();
        ArrayList arrayList = new ArrayList(unsignedTypeArrValues.length);
        for (UnsignedType unsignedType : unsignedTypeArrValues) {
            arrayList.add(unsignedType.getTypeName());
        }
        f64609a = CollectionsKt.toSet(arrayList);
        UnsignedArrayType[] unsignedArrayTypeArrValues = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(unsignedArrayTypeArrValues.length);
        for (UnsignedArrayType unsignedArrayType : unsignedArrayTypeArrValues) {
            arrayList2.add(unsignedArrayType.getTypeName());
        }
        f64610b = CollectionsKt.toSet(arrayList2);
        f64611c = new HashMap<>();
        f64612d = new HashMap<>();
        f64613e = MapsKt.hashMapOf(TuplesKt.m88129a(UnsignedArrayType.UBYTEARRAY, Name.m91970i("ubyteArrayOf")), TuplesKt.m88129a(UnsignedArrayType.USHORTARRAY, Name.m91970i("ushortArrayOf")), TuplesKt.m88129a(UnsignedArrayType.UINTARRAY, Name.m91970i("uintArrayOf")), TuplesKt.m88129a(UnsignedArrayType.ULONGARRAY, Name.m91970i("ulongArrayOf")));
        UnsignedType[] unsignedTypeArrValues2 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : unsignedTypeArrValues2) {
            linkedHashSet.add(unsignedType2.getArrayClassId().m91931h());
        }
        f64614f = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            f64611c.put(unsignedType3.getArrayClassId(), unsignedType3.getClassId());
            f64612d.put(unsignedType3.getClassId(), unsignedType3.getArrayClassId());
        }
    }

    private UnsignedTypes() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m89168d(@NotNull KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorMo89207e;
        kotlinType.getClass();
        if (TypeUtils.m93703w(kotlinType) || (classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e()) == null) {
            return false;
        }
        return INSTANCE.m89171c(classifierDescriptorMo89207e);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final ClassId m89169a(@NotNull ClassId classId) {
        classId.getClass();
        return f64611c.get(classId);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m89170b(@NotNull Name name) {
        name.getClass();
        return f64614f.contains(name);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m89171c(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        DeclarationDescriptor declarationDescriptorMo89190b = declarationDescriptor.mo89190b();
        return (declarationDescriptorMo89190b instanceof PackageFragmentDescriptor) && Intrinsics.m88377d(((PackageFragmentDescriptor) declarationDescriptorMo89190b).mo89453d(), StandardNames.f64473A) && f64609a.contains(declarationDescriptor.getName());
    }
}
