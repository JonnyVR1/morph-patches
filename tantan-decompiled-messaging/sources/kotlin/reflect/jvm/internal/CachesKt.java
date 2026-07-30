package kotlin.reflect.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.full.KClassifiers;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;
import p149l.mx3;
import p149l.nx3;
import p149l.ox3;
import p149l.px3;
import p149l.qx3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u0012\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011\"*\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0014*\u0004\u0018\u00010\u00000\u00000\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016\"<\u0010#\u001a*\u0012&\u0012$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0 j\u0002`!\u0012\u0004\u0012\u00020\u000f0\u001f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0016*0\b\u0002\u0010$\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0 2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0 ¨\u0006%"}, m87232d2 = {"", j6f.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "jClass", "Lkotlin/reflect/jvm/internal/KClassImpl;", "m", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/KClassImpl;", "Lkotlin/reflect/KDeclarationContainer;", "n", "(Ljava/lang/Class;)Lkotlin/reflect/KDeclarationContainer;", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "", "isMarkedNullable", "Lkotlin/reflect/KType;", "k", "(Ljava/lang/Class;Ljava/util/List;Z)Lkotlin/reflect/KType;", BLiveStormDanmakuGiftResourceType.f44444l, "Lkotlin/reflect/jvm/internal/CacheByClass;", "kotlin.jvm.PlatformType", "a", "Lkotlin/reflect/jvm/internal/CacheByClass;", "K_CLASS_CACHE", "Lkotlin/reflect/jvm/internal/KPackageImpl;", "b", "K_PACKAGE_CACHE", "c", "CACHE_FOR_BASE_CLASSIFIERS", Constants.INAPP_DATA_TAG, "CACHE_FOR_NULLABLE_BASE_CLASSIFIERS", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Pair;", "Lkotlin/reflect/jvm/internal/Key;", "e", "CACHE_FOR_GENERIC_CLASSIFIERS", "Key", "kotlin-reflection"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class CachesKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CacheByClass<KClassImpl<? extends Object>> f63585a = CacheByClassKt.m87655a(mx3.INSTANCE);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final CacheByClass<KPackageImpl> f63586b = CacheByClassKt.m87655a(nx3.INSTANCE);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final CacheByClass<KType> f63587c = CacheByClassKt.m87655a(ox3.INSTANCE);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final CacheByClass<KType> f63588d = CacheByClassKt.m87655a(px3.INSTANCE);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final CacheByClass<ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, KType>> f63589e = CacheByClassKt.m87655a(qx3.INSTANCE);

    /* JADX INFO: renamed from: a */
    public static final KType m87656a(Class cls) {
        cls.getClass();
        return KClassifiers.m87636b(m87668m(cls), CollectionsKt.emptyList(), false, CollectionsKt.emptyList());
    }

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap m87657b(Class cls) {
        cls.getClass();
        return new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: c */
    public static final KType m87658c(Class cls) {
        cls.getClass();
        return KClassifiers.m87636b(m87668m(cls), CollectionsKt.emptyList(), true, CollectionsKt.emptyList());
    }

    /* JADX INFO: renamed from: d */
    public static final KClassImpl m87659d(Class cls) {
        cls.getClass();
        return new KClassImpl(cls);
    }

    /* JADX INFO: renamed from: e */
    public static final KPackageImpl m87660e(Class cls) {
        cls.getClass();
        return new KPackageImpl(cls);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final <T> KType m87666k(@NotNull Class<T> cls, @NotNull List<KTypeProjection> list, boolean z) {
        cls.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return z ? f63588d.mo87654a(cls) : f63587c.mo87654a(cls);
        }
        return m87667l(cls, list, z);
    }

    /* JADX INFO: renamed from: l */
    public static final <T> KType m87667l(Class<T> cls, List<KTypeProjection> list, boolean z) {
        ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, KType> concurrentHashMapMo87654a = f63589e.mo87654a(cls);
        Pair<List<KTypeProjection>, Boolean> pairM87240a = TuplesKt.m87240a(list, Boolean.valueOf(z));
        KType kType = concurrentHashMapMo87654a.get(pairM87240a);
        if (kType == null) {
            KType kTypeM87636b = KClassifiers.m87636b(m87668m(cls), list, z, CollectionsKt.emptyList());
            KType kTypePutIfAbsent = concurrentHashMapMo87654a.putIfAbsent(pairM87240a, kTypeM87636b);
            kType = kTypePutIfAbsent == null ? kTypeM87636b : kTypePutIfAbsent;
        }
        kType.getClass();
        return kType;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final <T> KClassImpl<T> m87668m(@NotNull Class<T> cls) {
        cls.getClass();
        KAnnotatedElement kAnnotatedElementMo87654a = f63585a.mo87654a(cls);
        kAnnotatedElementMo87654a.getClass();
        return (KClassImpl) kAnnotatedElementMo87654a;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final <T> KDeclarationContainer m87669n(@NotNull Class<T> cls) {
        cls.getClass();
        return f63586b.mo87654a(cls);
    }
}
