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
    public static final Set<Name> f63935a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Set<Name> f63936b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final HashMap<ClassId, ClassId> f63937c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final HashMap<ClassId, ClassId> f63938d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final HashMap<UnsignedArrayType, Name> f63939e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Set<Name> f63940f;

    static {
        UnsignedType[] unsignedTypeArrValues = UnsignedType.values();
        ArrayList arrayList = new ArrayList(unsignedTypeArrValues.length);
        for (UnsignedType unsignedType : unsignedTypeArrValues) {
            arrayList.add(unsignedType.getTypeName());
        }
        f63935a = CollectionsKt.toSet(arrayList);
        UnsignedArrayType[] unsignedArrayTypeArrValues = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(unsignedArrayTypeArrValues.length);
        for (UnsignedArrayType unsignedArrayType : unsignedArrayTypeArrValues) {
            arrayList2.add(unsignedArrayType.getTypeName());
        }
        f63936b = CollectionsKt.toSet(arrayList2);
        f63937c = new HashMap<>();
        f63938d = new HashMap<>();
        f63939e = MapsKt.hashMapOf(TuplesKt.m87240a(UnsignedArrayType.UBYTEARRAY, Name.m91079i("ubyteArrayOf")), TuplesKt.m87240a(UnsignedArrayType.USHORTARRAY, Name.m91079i("ushortArrayOf")), TuplesKt.m87240a(UnsignedArrayType.UINTARRAY, Name.m91079i("uintArrayOf")), TuplesKt.m87240a(UnsignedArrayType.ULONGARRAY, Name.m91079i("ulongArrayOf")));
        UnsignedType[] unsignedTypeArrValues2 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : unsignedTypeArrValues2) {
            linkedHashSet.add(unsignedType2.getArrayClassId().m91040h());
        }
        f63940f = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            f63937c.put(unsignedType3.getArrayClassId(), unsignedType3.getClassId());
            f63938d.put(unsignedType3.getClassId(), unsignedType3.getArrayClassId());
        }
    }

    private UnsignedTypes() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m88277d(@NotNull KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorMo88316e;
        kotlinType.getClass();
        if (TypeUtils.m92812w(kotlinType) || (classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e()) == null) {
            return false;
        }
        return INSTANCE.m88280c(classifierDescriptorMo88316e);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final ClassId m88278a(@NotNull ClassId classId) {
        classId.getClass();
        return f63937c.get(classId);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m88279b(@NotNull Name name) {
        name.getClass();
        return f63940f.contains(name);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m88280c(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        DeclarationDescriptor declarationDescriptorMo88299b = declarationDescriptor.mo88299b();
        return (declarationDescriptorMo88299b instanceof PackageFragmentDescriptor) && Intrinsics.m87488d(((PackageFragmentDescriptor) declarationDescriptorMo88299b).mo88562d(), StandardNames.f63799A) && f63935a.contains(declarationDescriptor.getName());
    }
}
