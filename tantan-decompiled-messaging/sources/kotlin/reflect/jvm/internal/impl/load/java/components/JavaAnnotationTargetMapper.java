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
import p149l.zjq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JavaAnnotationTargetMapper {

    @NotNull
    public static final JavaAnnotationTargetMapper INSTANCE = new JavaAnnotationTargetMapper();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Map<String, EnumSet<KotlinTarget>> f64778a = MapsKt.mapOf(TuplesKt.m87240a("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), TuplesKt.m87240a("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), TuplesKt.m87240a("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), TuplesKt.m87240a("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), TuplesKt.m87240a("FIELD", EnumSet.of(KotlinTarget.FIELD)), TuplesKt.m87240a("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), TuplesKt.m87240a("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), TuplesKt.m87240a("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), TuplesKt.m87240a("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), TuplesKt.m87240a("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<String, KotlinRetention> f64779b = MapsKt.mapOf(TuplesKt.m87240a("RUNTIME", KotlinRetention.RUNTIME), TuplesKt.m87240a("CLASS", KotlinRetention.BINARY), TuplesKt.m87240a("SOURCE", KotlinRetention.SOURCE));

    private JavaAnnotationTargetMapper() {
    }

    /* JADX INFO: renamed from: e */
    public static final KotlinType m89527e(ModuleDescriptor moduleDescriptor) {
        KotlinType type;
        moduleDescriptor.getClass();
        ValueParameterDescriptor valueParameterDescriptorM89507b = DescriptorResolverUtils.m89507b(JavaAnnotationMapper.INSTANCE.m89524d(), moduleDescriptor.mo88546f().m88239p(StandardNames.FqNames.f63847G));
        return (valueParameterDescriptorM89507b == null || (type = valueParameterDescriptorM89507b.getType()) == null) ? ErrorUtils.m93002d(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final ConstantValue<?> m89528b(@Nullable JavaAnnotationArgument javaAnnotationArgument) {
        JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument ? (JavaEnumValueAnnotationArgument) javaAnnotationArgument : null;
        if (javaEnumValueAnnotationArgument != null) {
            Map<String, KotlinRetention> map = f64779b;
            Name nameMo89049d = javaEnumValueAnnotationArgument.mo89049d();
            KotlinRetention kotlinRetention = map.get(nameMo89049d != null ? nameMo89049d.m91082b() : null);
            if (kotlinRetention != null) {
                ClassId classIdM91045c = ClassId.Companion.m91045c(StandardNames.FqNames.f63853J);
                Name nameM91079i = Name.m91079i(kotlinRetention.name());
                nameM91079i.getClass();
                return new EnumValue(classIdM91045c, nameM91079i);
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Set<KotlinTarget> m89529c(@Nullable String str) {
        EnumSet<KotlinTarget> enumSet = f64778a.get(str);
        return enumSet != null ? enumSet : SetsKt.emptySet();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ConstantValue<?> m89530d(@NotNull List<? extends JavaAnnotationArgument> list) {
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
            Name nameMo89049d = javaEnumValueAnnotationArgument.mo89049d();
            CollectionsKt.addAll(arrayList2, javaAnnotationTargetMapper.m89529c(nameMo89049d != null ? nameMo89049d.m91082b() : null));
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (KotlinTarget kotlinTarget : arrayList2) {
            ClassId classIdM91045c = ClassId.Companion.m91045c(StandardNames.FqNames.f63851I);
            Name nameM91079i = Name.m91079i(kotlinTarget.name());
            nameM91079i.getClass();
            arrayList3.add(new EnumValue(classIdM91045c, nameM91079i));
        }
        return new ArrayValue(arrayList3, zjq.INSTANCE);
    }
}
