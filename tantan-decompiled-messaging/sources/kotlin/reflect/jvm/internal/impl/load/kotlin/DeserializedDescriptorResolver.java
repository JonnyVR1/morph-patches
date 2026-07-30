package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.wvd;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class DeserializedDescriptorResolver {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Set<KotlinClassHeader.Kind> f65037b = SetsKt.setOf(KotlinClassHeader.Kind.CLASS);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Set<KotlinClassHeader.Kind> f65038c = SetsKt.setOf((Object[]) new KotlinClassHeader.Kind[]{KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART});

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final MetadataVersion f65039d = new MetadataVersion(1, 1, 2);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final MetadataVersion f65040e = new MetadataVersion(1, 1, 11);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final MetadataVersion f65041f = new MetadataVersion(1, 1, 13);

    /* JADX INFO: renamed from: a */
    public DeserializationComponents f65042a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final MetadataVersion m90318a() {
            return DeserializedDescriptorResolver.f65041f;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Collection m90304d() {
        return CollectionsKt.emptyList();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final MemberScope m90305c(@NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        Pair<JvmNameResolver, ProtoBuf.Package> pairM91024m;
        packageFragmentDescriptor.getClass();
        kotlinJvmBinaryClass.getClass();
        String[] strArrM90314m = m90314m(kotlinJvmBinaryClass, f65038c);
        if (strArrM90314m == null) {
            return null;
        }
        String[] strArrM90420g = kotlinJvmBinaryClass.mo88946b().m90420g();
        try {
            if (strArrM90420g == null) {
                return null;
            }
            try {
                pairM91024m = JvmProtoBufUtil.m91024m(strArrM90314m, strArrM90420g);
            } catch (InvalidProtocolBufferException e) {
                throw new IllegalStateException("Could not read data from " + kotlinJvmBinaryClass.getLocation(), e);
            }
        } catch (Throwable th) {
            if (m90310i() || kotlinJvmBinaryClass.mo88946b().m90417d().m90886h(m90309h())) {
                throw th;
            }
            pairM91024m = null;
        }
        if (pairM91024m == null) {
            return null;
        }
        JvmNameResolver jvmNameResolverComponent1 = pairM91024m.component1();
        ProtoBuf.Package packageComponent2 = pairM91024m.component2();
        JvmPackagePartSource jvmPackagePartSource = new JvmPackagePartSource(kotlinJvmBinaryClass, packageComponent2, jvmNameResolverComponent1, m90308g(kotlinJvmBinaryClass), m90312k(kotlinJvmBinaryClass), m90306e(kotlinJvmBinaryClass));
        return new DeserializedPackageMemberScope(packageFragmentDescriptor, packageComponent2, jvmNameResolverComponent1, kotlinJvmBinaryClass.mo88946b().m90417d(), jvmPackagePartSource, m90307f(), "scope for " + jvmPackagePartSource + " in " + packageFragmentDescriptor, wvd.INSTANCE);
    }

    /* JADX INFO: renamed from: e */
    public final DeserializedContainerAbiStability m90306e(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (m90307f().m92155g().mo92171a()) {
            return DeserializedContainerAbiStability.STABLE;
        }
        return kotlinJvmBinaryClass.mo88946b().m90423j() ? DeserializedContainerAbiStability.UNSTABLE : DeserializedContainerAbiStability.STABLE;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final DeserializationComponents m90307f() {
        DeserializationComponents deserializationComponents = this.f65042a;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        Intrinsics.m87502r("components");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final IncompatibleVersionErrorData<MetadataVersion> m90308g(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (m90310i() || kotlinJvmBinaryClass.mo88946b().m90417d().m90886h(m90309h())) {
            return null;
        }
        return new IncompatibleVersionErrorData<>(kotlinJvmBinaryClass.mo88946b().m90417d(), MetadataVersion.INSTANCE, m90309h(), m90309h().m90889k(kotlinJvmBinaryClass.mo88946b().m90417d().m90888j()), kotlinJvmBinaryClass.getLocation());
    }

    /* JADX INFO: renamed from: h */
    public final MetadataVersion m90309h() {
        return m90307f().m92155g().mo92176f();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m90310i() {
        return m90307f().m92155g().mo92177g();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m90311j(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        return !m90307f().m92155g().mo92174d() && kotlinJvmBinaryClass.mo88946b().m90422i() && Intrinsics.m87488d(kotlinJvmBinaryClass.mo88946b().m90417d(), f65040e);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m90312k(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        return (m90307f().m92155g().mo92172b() && (kotlinJvmBinaryClass.mo88946b().m90422i() || Intrinsics.m87488d(kotlinJvmBinaryClass.mo88946b().m90417d(), f65039d))) || m90311j(kotlinJvmBinaryClass);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final ClassData m90313l(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        String[] strArrM90420g;
        Pair<JvmNameResolver, ProtoBuf.Class> pairM91021i;
        kotlinJvmBinaryClass.getClass();
        String[] strArrM90314m = m90314m(kotlinJvmBinaryClass, f65037b);
        if (strArrM90314m == null || (strArrM90420g = kotlinJvmBinaryClass.mo88946b().m90420g()) == null) {
            return null;
        }
        try {
            try {
                pairM91021i = JvmProtoBufUtil.m91021i(strArrM90314m, strArrM90420g);
            } catch (InvalidProtocolBufferException e) {
                throw new IllegalStateException("Could not read data from " + kotlinJvmBinaryClass.getLocation(), e);
            }
        } catch (Throwable th) {
            if (m90310i() || kotlinJvmBinaryClass.mo88946b().m90417d().m90886h(m90309h())) {
                throw th;
            }
            pairM91021i = null;
        }
        if (pairM91021i == null) {
            return null;
        }
        return new ClassData(pairM91021i.component1(), pairM91021i.component2(), kotlinJvmBinaryClass.mo88946b().m90417d(), new KotlinJvmBinarySourceElement(kotlinJvmBinaryClass, m90308g(kotlinJvmBinaryClass), new PreReleaseInfo(m90312k(kotlinJvmBinaryClass), null, 2, null), m90306e(kotlinJvmBinaryClass)));
    }

    /* JADX INFO: renamed from: m */
    public final String[] m90314m(KotlinJvmBinaryClass kotlinJvmBinaryClass, Set<? extends KotlinClassHeader.Kind> set) {
        KotlinClassHeader kotlinClassHeaderMo88946b = kotlinJvmBinaryClass.mo88946b();
        String[] strArrM90414a = kotlinClassHeaderMo88946b.m90414a();
        if (strArrM90414a == null) {
            strArrM90414a = kotlinClassHeaderMo88946b.m90415b();
        }
        if (strArrM90414a == null || !set.contains(kotlinClassHeaderMo88946b.m90416c())) {
            return null;
        }
        return strArrM90414a;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final ClassDescriptor m90315n(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlinJvmBinaryClass.getClass();
        ClassData classDataM90313l = m90313l(kotlinJvmBinaryClass);
        if (classDataM90313l == null) {
            return null;
        }
        return m90307f().m92154f().m92143e(kotlinJvmBinaryClass.mo88949e(), classDataM90313l);
    }

    /* JADX INFO: renamed from: o */
    public final void m90316o(@NotNull DeserializationComponentsForJava deserializationComponentsForJava) {
        deserializationComponentsForJava.getClass();
        m90317p(deserializationComponentsForJava.m90295a());
    }

    /* JADX INFO: renamed from: p */
    public final void m90317p(@NotNull DeserializationComponents deserializationComponents) {
        deserializationComponents.getClass();
        this.f65042a = deserializationComponents;
    }
}
