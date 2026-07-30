package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FunctionTypesKt {
    /* JADX INFO: renamed from: a */
    public static final int m88144a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        AnnotationDescriptor annotationDescriptorMo88638b = kotlinType.getAnnotations().mo88638b(StandardNames.FqNames.f63839C);
        if (annotationDescriptorMo88638b == null) {
            return 0;
        }
        ConstantValue constantValue = (ConstantValue) MapsKt.getValue(annotationDescriptorMo88638b.mo88630a(), StandardNames.f63824p);
        constantValue.getClass();
        return ((IntValue) constantValue).mo91918b().intValue();
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final SimpleType m88145b(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull Annotations annotations, @Nullable KotlinType kotlinType, @NotNull List<? extends KotlinType> list, @NotNull List<? extends KotlinType> list2, @Nullable List<Name> list3, @NotNull KotlinType kotlinType2, boolean z) {
        kotlinBuiltIns.getClass();
        annotations.getClass();
        list.getClass();
        list2.getClass();
        kotlinType2.getClass();
        List<TypeProjection> listM88150g = m88150g(kotlinType, list, list2, list3, kotlinType2, kotlinBuiltIns);
        ClassDescriptor classDescriptorM88149f = m88149f(kotlinBuiltIns, list2.size() + list.size() + (kotlinType == null ? 0 : 1), z);
        if (kotlinType != null) {
            annotations = m88165v(annotations, kotlinBuiltIns);
        }
        if (!list.isEmpty()) {
            annotations = m88164u(annotations, kotlinBuiltIns, list.size());
        }
        return KotlinTypeFactory.m92631h(TypeAttributesKt.m92711b(annotations), classDescriptorM88149f, listM88150g);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final Name m88147d(@NotNull KotlinType kotlinType) {
        String strMo91918b;
        kotlinType.getClass();
        AnnotationDescriptor annotationDescriptorMo88638b = kotlinType.getAnnotations().mo88638b(StandardNames.FqNames.f63841D);
        if (annotationDescriptorMo88638b == null) {
            return null;
        }
        Object objSingleOrNull = CollectionsKt.singleOrNull(annotationDescriptorMo88638b.mo88630a().values());
        StringValue stringValue = objSingleOrNull instanceof StringValue ? (StringValue) objSingleOrNull : null;
        if (stringValue != null && (strMo91918b = stringValue.mo91918b()) != null) {
            if (!Name.m91080m(strMo91918b)) {
                strMo91918b = null;
            }
            if (strMo91918b != null) {
                return Name.m91079i(strMo91918b);
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final List<KotlinType> m88148e(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        m88159p(kotlinType);
        int iM88144a = m88144a(kotlinType);
        if (iM88144a == 0) {
            return CollectionsKt.emptyList();
        }
        List<TypeProjection> listSubList = kotlinType.mo91888E0().subList(0, iM88144a);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final ClassDescriptor m88149f(@NotNull KotlinBuiltIns kotlinBuiltIns, int i, boolean z) {
        kotlinBuiltIns.getClass();
        ClassDescriptor classDescriptorM88226Y = z ? kotlinBuiltIns.m88226Y(i) : kotlinBuiltIns.m88207D(i);
        classDescriptorM88226Y.getClass();
        return classDescriptorM88226Y;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final List<TypeProjection> m88150g(@Nullable KotlinType kotlinType, @NotNull List<? extends KotlinType> list, @NotNull List<? extends KotlinType> list2, @Nullable List<Name> list3, @NotNull KotlinType kotlinType2, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        Name name;
        KotlinBuiltIns kotlinBuiltIns2;
        list.getClass();
        list2.getClass();
        kotlinType2.getClass();
        kotlinBuiltIns.getClass();
        int i = 0;
        ArrayList arrayList = new ArrayList(list2.size() + list.size() + (kotlinType != null ? 1 : 0) + 1);
        List<? extends KotlinType> list4 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        Iterator<T> it = list4.iterator();
        while (it.hasNext()) {
            arrayList2.add(TypeUtilsKt.m93084d((KotlinType) it.next()));
        }
        arrayList.addAll(arrayList2);
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93178a(arrayList, kotlinType != null ? TypeUtilsKt.m93084d(kotlinType) : null);
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            KotlinType kotlinTypeM93077C = (KotlinType) obj;
            if (list3 == null || (name = list3.get(i)) == null || name.m91085j()) {
                name = null;
            }
            if (name != null) {
                FqName fqName = StandardNames.FqNames.f63841D;
                Name name2 = StandardNames.f63820l;
                String strM91082b = name.m91082b();
                strM91082b.getClass();
                Map mapMapOf = MapsKt.mapOf(TuplesKt.m87240a(name2, new StringValue(strM91082b)));
                kotlinBuiltIns2 = kotlinBuiltIns;
                kotlinTypeM93077C = TypeUtilsKt.m93077C(kotlinTypeM93077C, Annotations.Companion.m88640a(CollectionsKt.plus(kotlinTypeM93077C.getAnnotations(), new BuiltInAnnotationDescriptor(kotlinBuiltIns2, fqName, mapMapOf, false, 8, null))));
            } else {
                kotlinBuiltIns2 = kotlinBuiltIns;
            }
            arrayList.add(TypeUtilsKt.m93084d(kotlinTypeM93077C));
            i = i2;
            kotlinBuiltIns = kotlinBuiltIns2;
        }
        arrayList.add(TypeUtilsKt.m93084d(kotlinType2));
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final FunctionTypeKind m88151h(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        if ((declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.m88169C0(declarationDescriptor)) {
            return m88152i(DescriptorUtilsKt.m91983p(declarationDescriptor));
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final FunctionTypeKind m88152i(FqNameUnsafe fqNameUnsafe) {
        if (!fqNameUnsafe.m91062f() || fqNameUnsafe.m91061e()) {
            return null;
        }
        FunctionTypeKindExtractor functionTypeKindExtractorM88334a = FunctionTypeKindExtractor.Companion.m88334a();
        FqName fqNameM91049d = fqNameUnsafe.m91068m().m91049d();
        String strM91082b = fqNameUnsafe.m91065j().m91082b();
        strM91082b.getClass();
        return functionTypeKindExtractorM88334a.m88331b(fqNameM91049d, strM91082b);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final FunctionTypeKind m88153j(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        if (classifierDescriptorMo88316e != null) {
            return m88151h(classifierDescriptorMo88316e);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final KotlinType m88154k(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        m88159p(kotlinType);
        if (!m88163t(kotlinType)) {
            return null;
        }
        return kotlinType.mo91888E0().get(m88144a(kotlinType)).getType();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final KotlinType m88155l(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        m88159p(kotlinType);
        KotlinType type = ((TypeProjection) CollectionsKt.last((List) kotlinType.mo91888E0())).getType();
        type.getClass();
        return type;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final List<TypeProjection> m88156m(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        m88159p(kotlinType);
        List<TypeProjection> listMo91888E0 = kotlinType.mo91888E0();
        return listMo91888E0.subList(m88144a(kotlinType) + (m88157n(kotlinType) ? 1 : 0), listMo91888E0.size() - 1);
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m88157n(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return m88159p(kotlinType) && m88163t(kotlinType);
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m88158o(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        FunctionTypeKind functionTypeKindM88151h = m88151h(declarationDescriptor);
        return Intrinsics.m87488d(functionTypeKindM88151h, FunctionTypeKind.Function.INSTANCE) || Intrinsics.m87488d(functionTypeKindM88151h, FunctionTypeKind.SuspendFunction.INSTANCE);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m88159p(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        return classifierDescriptorMo88316e != null && m88158o(classifierDescriptorMo88316e);
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m88160q(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return Intrinsics.m87488d(m88153j(kotlinType), FunctionTypeKind.Function.INSTANCE);
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m88161r(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return fqNameUnsafe.m91067l(StandardNames.f63834z) && Intrinsics.m87488d(m88152i(fqNameUnsafe), FunctionTypeKind.Function.INSTANCE);
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m88162s(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return Intrinsics.m87488d(m88153j(kotlinType), FunctionTypeKind.SuspendFunction.INSTANCE);
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m88163t(KotlinType kotlinType) {
        return kotlinType.getAnnotations().mo88638b(StandardNames.FqNames.f63837B) != null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public static final Annotations m88164u(@NotNull Annotations annotations, @NotNull KotlinBuiltIns kotlinBuiltIns, int i) {
        annotations.getClass();
        kotlinBuiltIns.getClass();
        FqName fqName = StandardNames.FqNames.f63839C;
        return annotations.mo88639c0(fqName) ? annotations : Annotations.Companion.m88640a(CollectionsKt.plus(annotations, new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, MapsKt.mapOf(TuplesKt.m87240a(StandardNames.f63824p, new IntValue(i))), false, 8, null)));
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static final Annotations m88165v(@NotNull Annotations annotations, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        annotations.getClass();
        kotlinBuiltIns.getClass();
        FqName fqName = StandardNames.FqNames.f63837B;
        return annotations.mo88639c0(fqName) ? annotations : Annotations.Companion.m88640a(CollectionsKt.plus(annotations, new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, MapsKt.emptyMap(), false, 8, null)));
    }
}
