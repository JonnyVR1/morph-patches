package kotlin.jvm;

import com.clevertap.android.sdk.Constants;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u001b\n\u0002\b\u0004\"-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018G¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"-\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004\"+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004\"+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00028G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"'\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0010*\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "Ljava/lang/Class;", "b", "(Lkotlin/reflect/KClass;)Ljava/lang/Class;", "getJavaClass$annotations", "(Lkotlin/reflect/KClass;)V", "java", "", Constants.INAPP_DATA_TAG, "javaPrimitiveType", "c", "javaObjectType", "e", "(Ljava/lang/Class;)Lkotlin/reflect/KClass;", "kotlin", "", "a", "(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;", "annotationClass", "kotlin-stdlib"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@JvmName
public final class JvmClassMappingKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T extends Annotation> KClass<? extends T> m87451a(@NotNull T t) {
        t.getClass();
        Class<? extends Annotation> clsAnnotationType = t.annotationType();
        clsAnnotationType.getClass();
        KClass<? extends T> kClassM87455e = m87455e(clsAnnotationType);
        kClassM87455e.getClass();
        return kClassM87455e;
    }

    @JvmName
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> Class<T> m87452b(@NotNull KClass<T> kClass) {
        kClass.getClass();
        Class<T> cls = (Class<T>) ((ClassBasedDeclarationContainer) kClass).mo87465d();
        cls.getClass();
        return cls;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> Class<T> m87453c(@NotNull KClass<T> kClass) {
        kClass.getClass();
        Class<T> cls = (Class<T>) ((ClassBasedDeclarationContainer) kClass).mo87465d();
        if (!cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals(com.meituan.robust.Constants.DOUBLE) ? cls : Double.class;
            case 104431:
                return !name.equals(com.meituan.robust.Constants.INT) ? cls : Integer.class;
            case 3039496:
                return !name.equals(com.meituan.robust.Constants.BYTE) ? cls : Byte.class;
            case 3052374:
                return !name.equals(com.meituan.robust.Constants.CHAR) ? cls : Character.class;
            case 3327612:
                return !name.equals(com.meituan.robust.Constants.LONG) ? cls : Long.class;
            case 3625364:
                return !name.equals(com.meituan.robust.Constants.VOID) ? cls : Void.class;
            case 64711720:
                return !name.equals(com.meituan.robust.Constants.BOOLEAN) ? cls : Boolean.class;
            case 97526364:
                return !name.equals(com.meituan.robust.Constants.FLOAT) ? cls : Float.class;
            case 109413500:
                return !name.equals(com.meituan.robust.Constants.SHORT) ? cls : Short.class;
            default:
                return cls;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <T> Class<T> m87454d(@NotNull KClass<T> kClass) {
        kClass.getClass();
        Class<T> cls = (Class<T>) ((ClassBasedDeclarationContainer) kClass).mo87465d();
        if (cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals(com.meituan.robust.Constants.LANG_INT)) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals(com.meituan.robust.Constants.LANG_FLOAT)) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals(com.meituan.robust.Constants.LANG_SHORT)) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals(com.meituan.robust.Constants.LANG_BOOLEAN)) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals(com.meituan.robust.Constants.LANG_BYTE)) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals(com.meituan.robust.Constants.LANG_LONG)) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals(com.meituan.robust.Constants.LANG_VOID)) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals(com.meituan.robust.Constants.LANG_DOUBLE)) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    @JvmName
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> KClass<T> m87455e(@NotNull Class<T> cls) {
        cls.getClass();
        return Reflection.m87507b(cls);
    }
}
