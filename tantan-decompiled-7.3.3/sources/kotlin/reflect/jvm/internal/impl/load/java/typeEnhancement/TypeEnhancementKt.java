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
import p153l.l2f;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeEnhancementKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Annotations f65663a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final l2f f65664b;

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65665a;

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
            f65665a = iArr;
        }
    }

    static {
        FqName fqName = JvmAnnotationNames.f65388v;
        fqName.getClass();
        f65663a = new l2f(fqName);
        FqName fqName2 = JvmAnnotationNames.f65389w;
        fqName2.getClass();
        f65664b = new l2f(fqName2);
    }

    /* JADX INFO: renamed from: e */
    public static final Annotations m91000e(List<? extends Annotations> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new CompositeAnnotations((List<? extends Annotations>) CollectionsKt.toList(list)) : (Annotations) CollectionsKt.single((List) list);
        }
        wtq0.m207906a("At least one Annotations object expected");
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final ClassifierDescriptor m91001f(ClassifierDescriptor classifierDescriptor, JavaTypeQualifiers javaTypeQualifiers, TypeComponentPosition typeComponentPosition) {
        JavaToKotlinClassMapper javaToKotlinClassMapper = JavaToKotlinClassMapper.INSTANCE;
        if (!TypeComponentPositionKt.m90993a(typeComponentPosition) || !(classifierDescriptor instanceof ClassDescriptor)) {
            return null;
        }
        if (javaTypeQualifiers.m90852e() == MutabilityQualifier.READ_ONLY && typeComponentPosition == TypeComponentPosition.FLEXIBLE_LOWER) {
            ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptor;
            if (javaToKotlinClassMapper.m89257c(classDescriptor)) {
                return javaToKotlinClassMapper.m89255a(classDescriptor);
            }
        }
        if (javaTypeQualifiers.m90852e() == MutabilityQualifier.MUTABLE && typeComponentPosition == TypeComponentPosition.FLEXIBLE_UPPER) {
            ClassDescriptor classDescriptor2 = (ClassDescriptor) classifierDescriptor;
            if (javaToKotlinClassMapper.m89258d(classDescriptor2)) {
                return javaToKotlinClassMapper.m89256b(classDescriptor2);
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final Annotations m91002g() {
        return f65663a;
    }

    /* JADX INFO: renamed from: h */
    public static final Boolean m91003h(JavaTypeQualifiers javaTypeQualifiers, TypeComponentPosition typeComponentPosition) {
        if (!TypeComponentPositionKt.m90993a(typeComponentPosition)) {
            return null;
        }
        NullabilityQualifier nullabilityQualifierM90853f = javaTypeQualifiers.m90853f();
        int i = nullabilityQualifierM90853f == null ? -1 : WhenMappings.f65665a[nullabilityQualifierM90853f.ordinal()];
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m91004i(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return TypeEnhancementUtilsKt.m91007c(SimpleClassicTypeSystemContext.INSTANCE, kotlinType);
    }
}
