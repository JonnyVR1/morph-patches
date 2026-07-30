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
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.j6f;
import p149l.mmc0;
import p149l.nmc0;
import p149l.qhg0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReflectClassUtilKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final List<KClass<? extends Object>> f64341a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<Class<? extends Object>, Class<? extends Object>> f64342b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Map<Class<? extends Object>, Class<? extends Object>> f64343c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<Class<? extends Function<?>>, Integer> f64344d;

    static {
        int i = 0;
        List<KClass<? extends Object>> listListOf = CollectionsKt.listOf((Object[]) new KClass[]{Reflection.m87507b(Boolean.TYPE), Reflection.m87507b(Byte.TYPE), Reflection.m87507b(Character.TYPE), Reflection.m87507b(Double.TYPE), Reflection.m87507b(Float.TYPE), Reflection.m87507b(Integer.TYPE), Reflection.m87507b(Long.TYPE), Reflection.m87507b(Short.TYPE)});
        f64341a = listListOf;
        List<KClass<? extends Object>> list = listListOf;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KClass kClass = (KClass) it.next();
            arrayList.add(TuplesKt.m87240a(JvmClassMappingKt.m87453c(kClass), JvmClassMappingKt.m87454d(kClass)));
        }
        f64342b = MapsKt.toMap(arrayList);
        List<KClass<? extends Object>> list2 = f64341a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            KClass kClass2 = (KClass) it2.next();
            arrayList2.add(TuplesKt.m87240a(JvmClassMappingKt.m87454d(kClass2), JvmClassMappingKt.m87453c(kClass2)));
        }
        f64343c = MapsKt.toMap(arrayList2);
        List listListOf2 = CollectionsKt.listOf((Object[]) new Class[]{Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class});
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf2, 10));
        for (Object obj : listListOf2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList3.add(TuplesKt.m87240a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f64344d = MapsKt.toMap(arrayList3);
    }

    /* JADX INFO: renamed from: a */
    public static final ParameterizedType m88987a(ParameterizedType parameterizedType) {
        parameterizedType.getClass();
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final Sequence m88988b(ParameterizedType parameterizedType) {
        parameterizedType.getClass();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return ArraysKt.asSequence(actualTypeArguments);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final ClassId m88991e(@NotNull Class<?> cls) {
        ClassId classIdM88991e;
        cls.getClass();
        if (cls.isPrimitive()) {
            qhg0.m174539a("Can't compute ClassId for primitive type: ", cls);
            return null;
        }
        if (cls.isArray()) {
            qhg0.m174539a("Can't compute ClassId for array type: ", cls);
            return null;
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            FqName fqName = new FqName(cls.getName());
            return new ClassId(fqName.m91049d(), FqName.Companion.m91055a(fqName.m91051f()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null && (classIdM88991e = m88991e(declaringClass)) != null) {
            Name nameM91079i = Name.m91079i(cls.getSimpleName());
            nameM91079i.getClass();
            ClassId classIdM91036d = classIdM88991e.m91036d(nameM91079i);
            if (classIdM91036d != null) {
                return classIdM91036d;
            }
        }
        return ClassId.Companion.m91045c(new FqName(cls.getName()));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m88992f(@NotNull Class<?> cls) {
        cls.getClass();
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return C15386d.m93478E(cls.getName(), '.', '/', false, 4, null);
            }
            return "L" + C15386d.m93478E(cls.getName(), '.', '/', false, 4, null) + ';';
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
                    return b2s.C_ZONE;
                }
                break;
            case 3327612:
                if (name.equals(Constants.LONG)) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals(Constants.VOID)) {
                    return j6f.GPS_MEASUREMENT_INTERRUPTED;
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
                    return j6f.LATITUDE_SOUTH;
                }
                break;
        }
        qhg0.m174539a("Unsupported primitive type: ", cls);
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final Integer m88993g(@NotNull Class<?> cls) {
        cls.getClass();
        return f64344d.get(cls);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final List<Type> m88994h(@NotNull Type type) {
        type.getClass();
        if (!(type instanceof ParameterizedType)) {
            return CollectionsKt.emptyList();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return SequencesKt___SequencesKt.m93302V(SequencesKt___SequencesKt.m93289I(SequencesKt__SequencesKt.m93274n(type, mmc0.INSTANCE), nmc0.INSTANCE));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return ArraysKt.toList(actualTypeArguments);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static final Class<?> m88995i(@NotNull Class<?> cls) {
        cls.getClass();
        return f64342b.get(cls);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final ClassLoader m88996j(@NotNull Class<?> cls) {
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
    public static final Class<?> m88997k(@NotNull Class<?> cls) {
        cls.getClass();
        return f64343c.get(cls);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m88998l(@NotNull Class<?> cls) {
        cls.getClass();
        return Enum.class.isAssignableFrom(cls);
    }
}
