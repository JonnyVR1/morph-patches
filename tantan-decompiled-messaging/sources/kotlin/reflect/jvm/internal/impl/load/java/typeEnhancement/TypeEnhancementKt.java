package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import org.jetbrains.annotations.NotNull;
import p149l.g1f;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeEnhancementKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Annotations f64989a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final g1f f64990b;

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64991a;

        static {
            int[] iArr = new int[NullabilityQualifier.values().length];
            try {
                iArr[NullabilityQualifier.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NullabilityQualifier.NOT_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64991a = iArr;
        }
    }

    static {
        FqName fqName = JvmAnnotationNames.f64714v;
        fqName.getClass();
        f64989a = new g1f(fqName);
        FqName fqName2 = JvmAnnotationNames.f64715w;
        fqName2.getClass();
        f64990b = new g1f(fqName2);
    }

    /* JADX INFO: renamed from: e */
    public static final Annotations m90109e(List<? extends Annotations> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new CompositeAnnotations((List<? extends Annotations>) CollectionsKt.toList(list)) : (Annotations) CollectionsKt.single((List) list);
        }
        qkq0.m175383a("At least one Annotations object expected");
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final ClassifierDescriptor m90110f(ClassifierDescriptor classifierDescriptor, JavaTypeQualifiers javaTypeQualifiers, TypeComponentPosition typeComponentPosition) {
        JavaToKotlinClassMapper javaToKotlinClassMapper = JavaToKotlinClassMapper.INSTANCE;
        if (!TypeComponentPositionKt.m90102a(typeComponentPosition) || !(classifierDescriptor instanceof ClassDescriptor)) {
            return null;
        }
        if (javaTypeQualifiers.m89961e() == MutabilityQualifier.READ_ONLY && typeComponentPosition == TypeComponentPosition.FLEXIBLE_LOWER) {
            ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptor;
            if (javaToKotlinClassMapper.m88366c(classDescriptor)) {
                return javaToKotlinClassMapper.m88364a(classDescriptor);
            }
        }
        if (javaTypeQualifiers.m89961e() == MutabilityQualifier.MUTABLE && typeComponentPosition == TypeComponentPosition.FLEXIBLE_UPPER) {
            ClassDescriptor classDescriptor2 = (ClassDescriptor) classifierDescriptor;
            if (javaToKotlinClassMapper.m88367d(classDescriptor2)) {
                return javaToKotlinClassMapper.m88365b(classDescriptor2);
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final Annotations m90111g() {
        return f64989a;
    }

    /* JADX INFO: renamed from: h */
    public static final Boolean m90112h(JavaTypeQualifiers javaTypeQualifiers, TypeComponentPosition typeComponentPosition) {
        if (!TypeComponentPositionKt.m90102a(typeComponentPosition)) {
            return null;
        }
        NullabilityQualifier nullabilityQualifierM89962f = javaTypeQualifiers.m89962f();
        int i = nullabilityQualifierM89962f == null ? -1 : WhenMappings.f64991a[nullabilityQualifierM89962f.ordinal()];
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m90113i(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return TypeEnhancementUtilsKt.m90116c(SimpleClassicTypeSystemContext.INSTANCE, kotlinType);
    }
}
