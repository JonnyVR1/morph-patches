package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ylq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JavaAnnotationTargetMapper {

    @NotNull
    public static final JavaAnnotationTargetMapper INSTANCE = new JavaAnnotationTargetMapper();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Map<String, EnumSet<KotlinTarget>> f65452a = MapsKt.mapOf(TuplesKt.m88129a("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), TuplesKt.m88129a("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), TuplesKt.m88129a("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), TuplesKt.m88129a("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), TuplesKt.m88129a("FIELD", EnumSet.of(KotlinTarget.FIELD)), TuplesKt.m88129a("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), TuplesKt.m88129a("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), TuplesKt.m88129a("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), TuplesKt.m88129a("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), TuplesKt.m88129a("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<String, KotlinRetention> f65453b = MapsKt.mapOf(TuplesKt.m88129a("RUNTIME", KotlinRetention.RUNTIME), TuplesKt.m88129a("CLASS", KotlinRetention.BINARY), TuplesKt.m88129a("SOURCE", KotlinRetention.SOURCE));

    private JavaAnnotationTargetMapper() {
    }

    /* JADX INFO: renamed from: e */
    public static final KotlinType m90418e(ModuleDescriptor moduleDescriptor) {
        KotlinType type;
        moduleDescriptor.getClass();
        ValueParameterDescriptor valueParameterDescriptorM90398b = DescriptorResolverUtils.m90398b(JavaAnnotationMapper.INSTANCE.m90415d(), moduleDescriptor.mo89437f().m89130p(StandardNames.FqNames.f64521G));
        return (valueParameterDescriptorM90398b == null || (type = valueParameterDescriptorM90398b.getType()) == null) ? ErrorUtils.m93893d(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final ConstantValue<?> m90419b(@Nullable JavaAnnotationArgument javaAnnotationArgument) {
        JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument ? (JavaEnumValueAnnotationArgument) javaAnnotationArgument : null;
        if (javaEnumValueAnnotationArgument != null) {
            Map<String, KotlinRetention> map = f65453b;
            Name nameMo89940d = javaEnumValueAnnotationArgument.mo89940d();
            KotlinRetention kotlinRetention = map.get(nameMo89940d != null ? nameMo89940d.m91973b() : null);
            if (kotlinRetention != null) {
                ClassId classIdM91936c = ClassId.Companion.m91936c(StandardNames.FqNames.f64527J);
                Name nameM91970i = Name.m91970i(kotlinRetention.name());
                nameM91970i.getClass();
                return new EnumValue(classIdM91936c, nameM91970i);
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Set<KotlinTarget> m90420c(@Nullable String str) {
        EnumSet<KotlinTarget> enumSet = f65452a.get(str);
        return enumSet != null ? enumSet : SetsKt.emptySet();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ConstantValue<?> m90421d(@NotNull List<? extends JavaAnnotationArgument> list) {
        list.getClass();
        ArrayList<JavaEnumValueAnnotationArgument> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof JavaEnumValueAnnotationArgument) {
                arrayList.add(obj);
            }
        }
        ArrayList<KotlinTarget> arrayList2 = new ArrayList();
        for (JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument : arrayList) {
            JavaAnnotationTargetMapper javaAnnotationTargetMapper = INSTANCE;
            Name nameMo89940d = javaEnumValueAnnotationArgument.mo89940d();
            CollectionsKt.addAll(arrayList2, javaAnnotationTargetMapper.m90420c(nameMo89940d != null ? nameMo89940d.m91973b() : null));
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (KotlinTarget kotlinTarget : arrayList2) {
            ClassId classIdM91936c = ClassId.Companion.m91936c(StandardNames.FqNames.f64525I);
            Name nameM91970i = Name.m91970i(kotlinTarget.name());
            nameM91970i.getClass();
            arrayList3.add(new EnumValue(classIdM91936c, nameM91970i));
        }
        return new ArrayValue(arrayList3, ylq.INSTANCE);
    }
}
