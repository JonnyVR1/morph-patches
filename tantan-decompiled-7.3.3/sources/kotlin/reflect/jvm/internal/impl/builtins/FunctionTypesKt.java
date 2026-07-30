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
    public static final int m89035a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        AnnotationDescriptor annotationDescriptorMo89529b = kotlinType.getAnnotations().mo89529b(StandardNames.FqNames.f64513C);
        if (annotationDescriptorMo89529b == null) {
            return 0;
        }
        ConstantValue constantValue = (ConstantValue) MapsKt.getValue(annotationDescriptorMo89529b.mo89521a(), StandardNames.f64498p);
        constantValue.getClass();
        return ((IntValue) constantValue).mo92809b().intValue();
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final SimpleType m89036b(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull Annotations annotations, @Nullable KotlinType kotlinType, @NotNull List<? extends KotlinType> list, @NotNull List<? extends KotlinType> list2, @Nullable List<Name> list3, @NotNull KotlinType kotlinType2, boolean z) {
        kotlinBuiltIns.getClass();
        annotations.getClass();
        list.getClass();
        list2.getClass();
        kotlinType2.getClass();
        List<TypeProjection> listM89041g = m89041g(kotlinType, list, list2, list3, kotlinType2, kotlinBuiltIns);
        ClassDescriptor classDescriptorM89040f = m89040f(kotlinBuiltIns, list2.size() + list.size() + (kotlinType == null ? 0 : 1), z);
        if (kotlinType != null) {
            annotations = m89056v(annotations, kotlinBuiltIns);
        }
        if (!list.isEmpty()) {
            annotations = m89055u(annotations, kotlinBuiltIns, list.size());
        }
        return KotlinTypeFactory.m93522h(TypeAttributesKt.m93602b(annotations), classDescriptorM89040f, listM89041g);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final Name m89038d(@NotNull KotlinType kotlinType) {
        String strMo92809b;
        kotlinType.getClass();
        AnnotationDescriptor annotationDescriptorMo89529b = kotlinType.getAnnotations().mo89529b(StandardNames.FqNames.f64515D);
        if (annotationDescriptorMo89529b == null) {
            return null;
        }
        Object objSingleOrNull = CollectionsKt.singleOrNull(annotationDescriptorMo89529b.mo89521a().values());
        StringValue stringValue = objSingleOrNull instanceof StringValue ? (StringValue) objSingleOrNull : null;
        if (stringValue != null && (strMo92809b = stringValue.mo92809b()) != null) {
            if (!Name.m91971m(strMo92809b)) {
                strMo92809b = null;
            }
            if (strMo92809b != null) {
                return Name.m91970i(strMo92809b);
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final List<KotlinType> m89039e(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        m89050p(kotlinType);
        int iM89035a = m89035a(kotlinType);
        if (iM89035a == 0) {
            return CollectionsKt.emptyList();
        }
        List<TypeProjection> listSubList = kotlinType.mo92779E0().subList(0, iM89035a);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final ClassDescriptor m89040f(@NotNull KotlinBuiltIns kotlinBuiltIns, int i, boolean z) {
        kotlinBuiltIns.getClass();
        ClassDescriptor classDescriptorM89117Y = z ? kotlinBuiltIns.m89117Y(i) : kotlinBuiltIns.m89098D(i);
        classDescriptorM89117Y.getClass();
        return classDescriptorM89117Y;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final List<TypeProjection> m89041g(@Nullable KotlinType kotlinType, @NotNull List<? extends KotlinType> list, @NotNull List<? extends KotlinType> list2, @Nullable List<Name> list3, @NotNull KotlinType kotlinType2, @NotNull KotlinBuiltIns kotlinBuiltIns) {
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
            arrayList2.add(TypeUtilsKt.m93975d((KotlinType) it.next()));
        }
        arrayList.addAll(arrayList2);
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94069a(arrayList, kotlinType != null ? TypeUtilsKt.m93975d(kotlinType) : null);
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            KotlinType kotlinTypeM93968C = (KotlinType) obj;
            if (list3 == null || (name = list3.get(i)) == null || name.m91976j()) {
                name = null;
            }
            if (name != null) {
                FqName fqName = StandardNames.FqNames.f64515D;
                Name name2 = StandardNames.f64494l;
                String strM91973b = name.m91973b();
                strM91973b.getClass();
                Map mapMapOf = MapsKt.mapOf(TuplesKt.m88129a(name2, new StringValue(strM91973b)));
                kotlinBuiltIns2 = kotlinBuiltIns;
                kotlinTypeM93968C = TypeUtilsKt.m93968C(kotlinTypeM93968C, Annotations.Companion.m89531a(CollectionsKt.plus(kotlinTypeM93968C.getAnnotations(), new BuiltInAnnotationDescriptor(kotlinBuiltIns2, fqName, mapMapOf, false, 8, null))));
            } else {
                kotlinBuiltIns2 = kotlinBuiltIns;
            }
            arrayList.add(TypeUtilsKt.m93975d(kotlinTypeM93968C));
            i = i2;
            kotlinBuiltIns = kotlinBuiltIns2;
        }
        arrayList.add(TypeUtilsKt.m93975d(kotlinType2));
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final FunctionTypeKind m89042h(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        if ((declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.m89060C0(declarationDescriptor)) {
            return m89043i(DescriptorUtilsKt.m92874p(declarationDescriptor));
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final FunctionTypeKind m89043i(FqNameUnsafe fqNameUnsafe) {
        if (!fqNameUnsafe.m91953f() || fqNameUnsafe.m91952e()) {
            return null;
        }
        FunctionTypeKindExtractor functionTypeKindExtractorM89225a = FunctionTypeKindExtractor.Companion.m89225a();
        FqName fqNameM91940d = fqNameUnsafe.m91959m().m91940d();
        String strM91973b = fqNameUnsafe.m91956j().m91973b();
        strM91973b.getClass();
        return functionTypeKindExtractorM89225a.m89222b(fqNameM91940d, strM91973b);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final FunctionTypeKind m89044j(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        if (classifierDescriptorMo89207e != null) {
            return m89042h(classifierDescriptorMo89207e);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final KotlinType m89045k(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        m89050p(kotlinType);
        if (!m89054t(kotlinType)) {
            return null;
        }
        return kotlinType.mo92779E0().get(m89035a(kotlinType)).getType();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final KotlinType m89046l(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        m89050p(kotlinType);
        KotlinType type = ((TypeProjection) CollectionsKt.last((List) kotlinType.mo92779E0())).getType();
        type.getClass();
        return type;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final List<TypeProjection> m89047m(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        m89050p(kotlinType);
        List<TypeProjection> listMo92779E0 = kotlinType.mo92779E0();
        return listMo92779E0.subList(m89035a(kotlinType) + (m89048n(kotlinType) ? 1 : 0), listMo92779E0.size() - 1);
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m89048n(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return m89050p(kotlinType) && m89054t(kotlinType);
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m89049o(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        FunctionTypeKind functionTypeKindM89042h = m89042h(declarationDescriptor);
        return Intrinsics.m88377d(functionTypeKindM89042h, FunctionTypeKind.Function.INSTANCE) || Intrinsics.m88377d(functionTypeKindM89042h, FunctionTypeKind.SuspendFunction.INSTANCE);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m89050p(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        return classifierDescriptorMo89207e != null && m89049o(classifierDescriptorMo89207e);
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m89051q(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return Intrinsics.m88377d(m89044j(kotlinType), FunctionTypeKind.Function.INSTANCE);
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m89052r(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return fqNameUnsafe.m91958l(StandardNames.f64508z) && Intrinsics.m88377d(m89043i(fqNameUnsafe), FunctionTypeKind.Function.INSTANCE);
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m89053s(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return Intrinsics.m88377d(m89044j(kotlinType), FunctionTypeKind.SuspendFunction.INSTANCE);
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m89054t(KotlinType kotlinType) {
        return kotlinType.getAnnotations().mo89529b(StandardNames.FqNames.f64511B) != null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public static final Annotations m89055u(@NotNull Annotations annotations, @NotNull KotlinBuiltIns kotlinBuiltIns, int i) {
        annotations.getClass();
        kotlinBuiltIns.getClass();
        FqName fqName = StandardNames.FqNames.f64513C;
        return annotations.mo89530d0(fqName) ? annotations : Annotations.Companion.m89531a(CollectionsKt.plus(annotations, new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, MapsKt.mapOf(TuplesKt.m88129a(StandardNames.f64498p, new IntValue(i))), false, 8, null)));
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static final Annotations m89056v(@NotNull Annotations annotations, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        annotations.getClass();
        kotlinBuiltIns.getClass();
        FqName fqName = StandardNames.FqNames.f64511B;
        return annotations.mo89530d0(fqName) ? annotations : Annotations.Companion.m89531a(CollectionsKt.plus(annotations, new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, MapsKt.emptyMap(), false, 8, null)));
    }
}
