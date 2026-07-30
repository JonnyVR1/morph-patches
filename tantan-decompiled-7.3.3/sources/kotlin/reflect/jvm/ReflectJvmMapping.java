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
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\b\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\f\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"/\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\r8F¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Lkotlin/reflect/KProperty;", "Ljava/lang/reflect/Field;", "b", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Field;", "javaField", "Ljava/lang/reflect/Method;", "c", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Method;", "javaGetter", "Lkotlin/reflect/KMutableProperty;", "e", "(Lkotlin/reflect/KMutableProperty;)Ljava/lang/reflect/Method;", "javaSetter", "Lkotlin/reflect/KFunction;", Constants.INAPP_DATA_TAG, "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Method;", "javaMethod", p7f.GPS_DIRECTION_TRUE, "Ljava/lang/reflect/Constructor;", "a", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Constructor;", "getJavaConstructor$annotations", "(Lkotlin/reflect/KFunction;)V", "javaConstructor", "Lkotlin/reflect/KType;", "Ljava/lang/reflect/Type;", "f", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "javaType", "kotlin-reflection"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@JvmName
@SourceDebugExtension
public final class ReflectJvmMapping {

    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64258a;

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
            f64258a = iArr;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Constructor<T> m88532a(@NotNull KFunction<? extends T> kFunction) {
        Caller<?> callerMo88623Q;
        kFunction.getClass();
        KCallableImpl<?> kCallableImplM88930b = UtilKt.m88930b(kFunction);
        Member memberMo88950b = (kCallableImplM88930b == null || (callerMo88623Q = kCallableImplM88930b.mo88623Q()) == null) ? null : callerMo88623Q.mo88950b();
        if (memberMo88950b instanceof Constructor) {
            return (Constructor) memberMo88950b;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Field m88533b(@NotNull KProperty<?> kProperty) {
        kProperty.getClass();
        KPropertyImpl<?> kPropertyImplM88932d = UtilKt.m88932d(kProperty);
        if (kPropertyImplM88932d != null) {
            return kPropertyImplM88932d.m88835i0();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Method m88534c(@NotNull KProperty<?> kProperty) {
        kProperty.getClass();
        return m88535d(kProperty.mo88810h0());
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final Method m88535d(@NotNull KFunction<?> kFunction) {
        Caller<?> callerMo88623Q;
        kFunction.getClass();
        KCallableImpl<?> kCallableImplM88930b = UtilKt.m88930b(kFunction);
        Member memberMo88950b = (kCallableImplM88930b == null || (callerMo88623Q = kCallableImplM88930b.mo88623Q()) == null) ? null : callerMo88623Q.mo88950b();
        if (memberMo88950b instanceof Method) {
            return (Method) memberMo88950b;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final Method m88536e(@NotNull KMutableProperty<?> kMutableProperty) {
        kMutableProperty.getClass();
        return m88535d(kMutableProperty.getSetter());
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Type m88537f(@NotNull KType kType) {
        kType.getClass();
        return TypesJVMKt.m88513f(kType);
    }
}
