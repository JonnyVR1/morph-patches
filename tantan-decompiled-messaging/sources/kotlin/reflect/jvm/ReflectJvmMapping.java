package kotlin.reflect.jvm;

import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\b\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\f\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"/\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\r8F¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m87232d2 = {"Lkotlin/reflect/KProperty;", "Ljava/lang/reflect/Field;", "b", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Field;", "javaField", "Ljava/lang/reflect/Method;", "c", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Method;", "javaGetter", "Lkotlin/reflect/KMutableProperty;", "e", "(Lkotlin/reflect/KMutableProperty;)Ljava/lang/reflect/Method;", "javaSetter", "Lkotlin/reflect/KFunction;", Constants.INAPP_DATA_TAG, "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Method;", "javaMethod", j6f.GPS_DIRECTION_TRUE, "Ljava/lang/reflect/Constructor;", "a", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Constructor;", "getJavaConstructor$annotations", "(Lkotlin/reflect/KFunction;)V", "javaConstructor", "Lkotlin/reflect/KType;", "Ljava/lang/reflect/Type;", "f", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "javaType", "kotlin-reflection"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@JvmName
@SourceDebugExtension
public final class ReflectJvmMapping {

    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f63584a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f63584a = iArr;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Constructor<T> m87641a(@NotNull KFunction<? extends T> kFunction) {
        Caller<?> callerMo87732Q;
        kFunction.getClass();
        KCallableImpl<?> kCallableImplM88039b = UtilKt.m88039b(kFunction);
        Member memberMo88059b = (kCallableImplM88039b == null || (callerMo87732Q = kCallableImplM88039b.mo87732Q()) == null) ? null : callerMo87732Q.mo88059b();
        if (memberMo88059b instanceof Constructor) {
            return (Constructor) memberMo88059b;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Field m87642b(@NotNull KProperty<?> kProperty) {
        kProperty.getClass();
        KPropertyImpl<?> kPropertyImplM88041d = UtilKt.m88041d(kProperty);
        if (kPropertyImplM88041d != null) {
            return kPropertyImplM88041d.m87944i0();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Method m87643c(@NotNull KProperty<?> kProperty) {
        kProperty.getClass();
        return m87644d(kProperty.mo87919h0());
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final Method m87644d(@NotNull KFunction<?> kFunction) {
        Caller<?> callerMo87732Q;
        kFunction.getClass();
        KCallableImpl<?> kCallableImplM88039b = UtilKt.m88039b(kFunction);
        Member memberMo88059b = (kCallableImplM88039b == null || (callerMo87732Q = kCallableImplM88039b.mo87732Q()) == null) ? null : callerMo87732Q.mo88059b();
        if (memberMo88059b instanceof Method) {
            return (Method) memberMo88059b;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final Method m87645e(@NotNull KMutableProperty<?> kMutableProperty) {
        kMutableProperty.getClass();
        return m87644d(kMutableProperty.getSetter());
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Type m87646f(@NotNull KType kType) {
        kType.getClass();
        return TypesJVMKt.m87622f(kType);
    }
}
