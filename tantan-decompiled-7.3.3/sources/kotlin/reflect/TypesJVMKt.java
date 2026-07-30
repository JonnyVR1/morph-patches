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
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import p153l.boj0;
import p153l.nbr;
import p153l.poj0;
import p153l.vlj;
import p153l.ypg0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u000b\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\t8BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Lkotlin/reflect/KType;", "", "forceWrapper", "Ljava/lang/reflect/Type;", "c", "(Lkotlin/reflect/KType;Z)Ljava/lang/reflect/Type;", "Ljava/lang/Class;", "jClass", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "e", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Type;", "type", "", "h", "(Ljava/lang/reflect/Type;)Ljava/lang/String;", "f", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "javaType", "g", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "(Lkotlin/reflect/KTypeProjection;)V", "kotlin-stdlib"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class TypesJVMKt {

    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64253a;

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
            f64253a = iArr;
        }
    }

    @ExperimentalStdlibApi
    /* JADX INFO: renamed from: c */
    public static final Type m88510c(KType kType, boolean z) {
        KClassifier kClassifierMo88449i = kType.mo88449i();
        if (kClassifierMo88449i instanceof KTypeParameter) {
            return new boj0((KTypeParameter) kClassifierMo88449i);
        }
        if (!(kClassifierMo88449i instanceof KClass)) {
            poj0.m173108a("Unsupported type classifier: ", kType);
            return null;
        }
        KClass kClass = (KClass) kClassifierMo88449i;
        Class clsM88342c = z ? JvmClassMappingKt.m88342c(kClass) : JvmClassMappingKt.m88341b(kClass);
        List<KTypeProjection> listMo88450j = kType.mo88450j();
        if (listMo88450j.isEmpty()) {
            return clsM88342c;
        }
        if (!clsM88342c.isArray()) {
            return m88512e(clsM88342c, listMo88450j);
        }
        if (clsM88342c.getComponentType().isPrimitive()) {
            return clsM88342c;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.singleOrNull((List) listMo88450j);
        if (kTypeProjection == null) {
            ypg0.m217021a("kotlin.Array must have exactly one type argument: ", kType);
            return null;
        }
        KVariance variance = kTypeProjection.getVariance();
        KType type = kTypeProjection.getType();
        int i = variance == null ? -1 : WhenMappings.f64253a[variance.ordinal()];
        if (i == -1 || i == 1) {
            return clsM88342c;
        }
        if (i != 2 && i != 3) {
            nbr.m162172a();
            return null;
        }
        type.getClass();
        Type typeM88511d = m88511d(type, false, 1, null);
        return typeM88511d instanceof Class ? clsM88342c : new vlj(typeM88511d);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Type m88511d(KType kType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m88510c(kType, z);
    }

    @ExperimentalStdlibApi
    /* JADX INFO: renamed from: e */
    public static final Type m88512e(Class<?> cls, List<KTypeProjection> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<KTypeProjection> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(m88514g((KTypeProjection) it.next()));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<KTypeProjection> list3 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(m88514g((KTypeProjection) it2.next()));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeM88512e = m88512e(declaringClass, list.subList(length, list.size()));
        List<KTypeProjection> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList, 10));
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(m88514g((KTypeProjection) it3.next()));
        }
        return new ParameterizedTypeImpl(cls, typeM88512e, arrayList3);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Type m88513f(@NotNull KType kType) {
        Type typeMo88392b;
        kType.getClass();
        return (!(kType instanceof KTypeBase) || (typeMo88392b = ((KTypeBase) kType).mo88392b()) == null) ? m88511d(kType, false, 1, null) : typeMo88392b;
    }

    /* JADX INFO: renamed from: g */
    public static final Type m88514g(KTypeProjection kTypeProjection) {
        KVariance kVarianceM88503d = kTypeProjection.m88503d();
        if (kVarianceM88503d == null) {
            return WildcardTypeImpl.Companion.m88517a();
        }
        KType kTypeM88502c = kTypeProjection.m88502c();
        kTypeM88502c.getClass();
        int i = WhenMappings.f64253a[kVarianceM88503d.ordinal()];
        if (i == 1) {
            return new WildcardTypeImpl(null, m88510c(kTypeM88502c, true));
        }
        if (i == 2) {
            return m88510c(kTypeM88502c, true);
        }
        if (i == 3) {
            return new WildcardTypeImpl(m88510c(kTypeM88502c, true), null);
        }
        nbr.m162172a();
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final String m88515h(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        Sequence sequenceM94165n = SequencesKt__SequencesKt.m94165n(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
        return ((Class) SequencesKt___SequencesKt.m94184M(sequenceM94165n)).getName() + C15493d.m94366B(WeJson.EMPTY_ARR, SequencesKt___SequencesKt.m94199y(sequenceM94165n));
    }
}
