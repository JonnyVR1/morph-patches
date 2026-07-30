package kotlin.reflect;

import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import p149l.cjj;
import p149l.l9r;
import p149l.lfj0;
import p149l.qhg0;
import p149l.xej0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u000b\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\t8BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Lkotlin/reflect/KType;", "", "forceWrapper", "Ljava/lang/reflect/Type;", "c", "(Lkotlin/reflect/KType;Z)Ljava/lang/reflect/Type;", "Ljava/lang/Class;", "jClass", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "e", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Type;", "type", "", "h", "(Ljava/lang/reflect/Type;)Ljava/lang/String;", "f", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "javaType", "g", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "(Lkotlin/reflect/KTypeProjection;)V", "kotlin-stdlib"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class TypesJVMKt {

    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f63579a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f63579a = iArr;
        }
    }

    @ExperimentalStdlibApi
    /* JADX INFO: renamed from: c */
    public static final Type m87619c(KType kType, boolean z) {
        KClassifier kClassifierMo87559i = kType.mo87559i();
        if (kClassifierMo87559i instanceof KTypeParameter) {
            return new xej0((KTypeParameter) kClassifierMo87559i);
        }
        if (!(kClassifierMo87559i instanceof KClass)) {
            lfj0.m149710a("Unsupported type classifier: ", kType);
            return null;
        }
        KClass kClass = (KClass) kClassifierMo87559i;
        Class clsM87453c = z ? JvmClassMappingKt.m87453c(kClass) : JvmClassMappingKt.m87452b(kClass);
        List<KTypeProjection> listMo87560j = kType.mo87560j();
        if (listMo87560j.isEmpty()) {
            return clsM87453c;
        }
        if (!clsM87453c.isArray()) {
            return m87621e(clsM87453c, listMo87560j);
        }
        if (clsM87453c.getComponentType().isPrimitive()) {
            return clsM87453c;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.singleOrNull((List) listMo87560j);
        if (kTypeProjection == null) {
            qhg0.m174539a("kotlin.Array must have exactly one type argument: ", kType);
            return null;
        }
        KVariance variance = kTypeProjection.getVariance();
        KType type = kTypeProjection.getType();
        int i = variance == null ? -1 : WhenMappings.f63579a[variance.ordinal()];
        if (i == -1 || i == 1) {
            return clsM87453c;
        }
        if (i != 2 && i != 3) {
            l9r.m149037a();
            return null;
        }
        type.getClass();
        Type typeM87620d = m87620d(type, false, 1, null);
        return typeM87620d instanceof Class ? clsM87453c : new cjj(typeM87620d);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Type m87620d(KType kType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m87619c(kType, z);
    }

    @ExperimentalStdlibApi
    /* JADX INFO: renamed from: e */
    public static final Type m87621e(Class<?> cls, List<KTypeProjection> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<KTypeProjection> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(m87623g((KTypeProjection) it.next()));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<KTypeProjection> list3 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(m87623g((KTypeProjection) it2.next()));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeM87621e = m87621e(declaringClass, list.subList(length, list.size()));
        List<KTypeProjection> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList, 10));
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(m87623g((KTypeProjection) it3.next()));
        }
        return new ParameterizedTypeImpl(cls, typeM87621e, arrayList3);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Type m87622f(@NotNull KType kType) {
        Type typeMo87503b;
        kType.getClass();
        return (!(kType instanceof KTypeBase) || (typeMo87503b = ((KTypeBase) kType).mo87503b()) == null) ? m87620d(kType, false, 1, null) : typeMo87503b;
    }

    /* JADX INFO: renamed from: g */
    public static final Type m87623g(KTypeProjection kTypeProjection) {
        KVariance kVarianceM87612d = kTypeProjection.m87612d();
        if (kVarianceM87612d == null) {
            return WildcardTypeImpl.Companion.m87626a();
        }
        KType kTypeM87611c = kTypeProjection.m87611c();
        kTypeM87611c.getClass();
        int i = WhenMappings.f63579a[kVarianceM87612d.ordinal()];
        if (i == 1) {
            return new WildcardTypeImpl(null, m87619c(kTypeM87611c, true));
        }
        if (i == 2) {
            return m87619c(kTypeM87611c, true);
        }
        if (i == 3) {
            return new WildcardTypeImpl(m87619c(kTypeM87611c, true), null);
        }
        l9r.m149037a();
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final String m87624h(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        Sequence sequenceM93274n = SequencesKt__SequencesKt.m93274n(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
        return ((Class) SequencesKt___SequencesKt.m93293M(sequenceM93274n)).getName() + C15386d.m93475B(WeJson.EMPTY_ARR, SequencesKt___SequencesKt.m93308y(sequenceM93274n));
    }
}
