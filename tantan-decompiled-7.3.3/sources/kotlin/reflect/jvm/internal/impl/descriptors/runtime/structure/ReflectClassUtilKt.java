package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.meituan.robust.Constants;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.c4s;
import p153l.p7f;
import p153l.ruc0;
import p153l.suc0;
import p153l.ypg0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReflectClassUtilKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final List<KClass<? extends Object>> f65015a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<Class<? extends Object>, Class<? extends Object>> f65016b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Map<Class<? extends Object>, Class<? extends Object>> f65017c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<Class<? extends Function<?>>, Integer> f65018d;

    static {
        int i = 0;
        List<KClass<? extends Object>> listListOf = CollectionsKt.listOf((Object[]) new KClass[]{Reflection.m88396b(Boolean.TYPE), Reflection.m88396b(Byte.TYPE), Reflection.m88396b(Character.TYPE), Reflection.m88396b(Double.TYPE), Reflection.m88396b(Float.TYPE), Reflection.m88396b(Integer.TYPE), Reflection.m88396b(Long.TYPE), Reflection.m88396b(Short.TYPE)});
        f65015a = listListOf;
        List<KClass<? extends Object>> list = listListOf;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KClass kClass = (KClass) it.next();
            arrayList.add(TuplesKt.m88129a(JvmClassMappingKt.m88342c(kClass), JvmClassMappingKt.m88343d(kClass)));
        }
        f65016b = MapsKt.toMap(arrayList);
        List<KClass<? extends Object>> list2 = f65015a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            KClass kClass2 = (KClass) it2.next();
            arrayList2.add(TuplesKt.m88129a(JvmClassMappingKt.m88343d(kClass2), JvmClassMappingKt.m88342c(kClass2)));
        }
        f65017c = MapsKt.toMap(arrayList2);
        List listListOf2 = CollectionsKt.listOf((Object[]) new Class[]{Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class});
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf2, 10));
        for (Object obj : listListOf2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList3.add(TuplesKt.m88129a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f65018d = MapsKt.toMap(arrayList3);
    }

    /* JADX INFO: renamed from: a */
    public static final ParameterizedType m89878a(ParameterizedType parameterizedType) {
        parameterizedType.getClass();
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final Sequence m89879b(ParameterizedType parameterizedType) {
        parameterizedType.getClass();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return ArraysKt.asSequence(actualTypeArguments);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final ClassId m89882e(@NotNull Class<?> cls) {
        ClassId classIdM89882e;
        cls.getClass();
        if (cls.isPrimitive()) {
            ypg0.m217021a("Can't compute ClassId for primitive type: ", cls);
            return null;
        }
        if (cls.isArray()) {
            ypg0.m217021a("Can't compute ClassId for array type: ", cls);
            return null;
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            FqName fqName = new FqName(cls.getName());
            return new ClassId(fqName.m91940d(), FqName.Companion.m91946a(fqName.m91942f()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null && (classIdM89882e = m89882e(declaringClass)) != null) {
            Name nameM91970i = Name.m91970i(cls.getSimpleName());
            nameM91970i.getClass();
            ClassId classIdM91927d = classIdM89882e.m91927d(nameM91970i);
            if (classIdM91927d != null) {
                return classIdM91927d;
            }
        }
        return ClassId.Companion.m91936c(new FqName(cls.getName()));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m89883f(@NotNull Class<?> cls) {
        cls.getClass();
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return C15493d.m94369E(cls.getName(), '.', '/', false, 4, null);
            }
            return "L" + C15493d.m94369E(cls.getName(), '.', '/', false, 4, null) + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals(Constants.DOUBLE)) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals(Constants.INT)) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals(Constants.BYTE)) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals(Constants.CHAR)) {
                    return c4s.C_ZONE;
                }
                break;
            case 3327612:
                if (name.equals(Constants.LONG)) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals(Constants.VOID)) {
                    return p7f.GPS_MEASUREMENT_INTERRUPTED;
                }
                break;
            case 64711720:
                if (name.equals(Constants.BOOLEAN)) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals(Constants.FLOAT)) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals(Constants.SHORT)) {
                    return p7f.LATITUDE_SOUTH;
                }
                break;
        }
        ypg0.m217021a("Unsupported primitive type: ", cls);
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final Integer m89884g(@NotNull Class<?> cls) {
        cls.getClass();
        return f65018d.get(cls);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final List<Type> m89885h(@NotNull Type type) {
        type.getClass();
        if (!(type instanceof ParameterizedType)) {
            return CollectionsKt.emptyList();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return SequencesKt___SequencesKt.m94193V(SequencesKt___SequencesKt.m94180I(SequencesKt__SequencesKt.m94165n(type, ruc0.INSTANCE), suc0.INSTANCE));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return ArraysKt.toList(actualTypeArguments);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static final Class<?> m89886i(@NotNull Class<?> cls) {
        cls.getClass();
        return f65016b.get(cls);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final ClassLoader m89887j(@NotNull Class<?> cls) {
        cls.getClass();
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        systemClassLoader.getClass();
        return systemClassLoader;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final Class<?> m89888k(@NotNull Class<?> cls) {
        cls.getClass();
        return f65017c.get(cls);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m89889l(@NotNull Class<?> cls) {
        cls.getClass();
        return Enum.class.isAssignableFrom(cls);
    }
}
