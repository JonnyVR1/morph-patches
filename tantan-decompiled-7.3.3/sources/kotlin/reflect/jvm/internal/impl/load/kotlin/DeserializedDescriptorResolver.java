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
import p153l.kxd;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class DeserializedDescriptorResolver {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Set<KotlinClassHeader.Kind> f65711b = SetsKt.setOf(KotlinClassHeader.Kind.CLASS);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Set<KotlinClassHeader.Kind> f65712c = SetsKt.setOf((Object[]) new KotlinClassHeader.Kind[]{KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART});

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final MetadataVersion f65713d = new MetadataVersion(1, 1, 2);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final MetadataVersion f65714e = new MetadataVersion(1, 1, 11);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final MetadataVersion f65715f = new MetadataVersion(1, 1, 13);

    /* JADX INFO: renamed from: a */
    public DeserializationComponents f65716a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final MetadataVersion m91209a() {
            return DeserializedDescriptorResolver.f65715f;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Collection m91195d() {
        return CollectionsKt.emptyList();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final MemberScope m91196c(@NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        Pair<JvmNameResolver, ProtoBuf.Package> pairM91915m;
        packageFragmentDescriptor.getClass();
        kotlinJvmBinaryClass.getClass();
        String[] strArrM91205m = m91205m(kotlinJvmBinaryClass, f65712c);
        if (strArrM91205m == null) {
            return null;
        }
        String[] strArrM91311g = kotlinJvmBinaryClass.mo89837b().m91311g();
        try {
            if (strArrM91311g == null) {
                return null;
            }
            try {
                pairM91915m = JvmProtoBufUtil.m91915m(strArrM91205m, strArrM91311g);
            } catch (InvalidProtocolBufferException e) {
                throw new IllegalStateException("Could not read data from " + kotlinJvmBinaryClass.getLocation(), e);
            }
        } catch (Throwable th) {
            if (m91201i() || kotlinJvmBinaryClass.mo89837b().m91308d().m91777h(m91200h())) {
                throw th;
            }
            pairM91915m = null;
        }
        if (pairM91915m == null) {
            return null;
        }
        JvmNameResolver jvmNameResolverComponent1 = pairM91915m.component1();
        ProtoBuf.Package packageComponent2 = pairM91915m.component2();
        JvmPackagePartSource jvmPackagePartSource = new JvmPackagePartSource(kotlinJvmBinaryClass, packageComponent2, jvmNameResolverComponent1, m91199g(kotlinJvmBinaryClass), m91203k(kotlinJvmBinaryClass), m91197e(kotlinJvmBinaryClass));
        return new DeserializedPackageMemberScope(packageFragmentDescriptor, packageComponent2, jvmNameResolverComponent1, kotlinJvmBinaryClass.mo89837b().m91308d(), jvmPackagePartSource, m91198f(), "scope for " + jvmPackagePartSource + " in " + packageFragmentDescriptor, kxd.INSTANCE);
    }

    /* JADX INFO: renamed from: e */
    public final DeserializedContainerAbiStability m91197e(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (m91198f().m93046g().mo93062a()) {
            return DeserializedContainerAbiStability.STABLE;
        }
        return kotlinJvmBinaryClass.mo89837b().m91314j() ? DeserializedContainerAbiStability.UNSTABLE : DeserializedContainerAbiStability.STABLE;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final DeserializationComponents m91198f() {
        DeserializationComponents deserializationComponents = this.f65716a;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        Intrinsics.m88391r("components");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final IncompatibleVersionErrorData<MetadataVersion> m91199g(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (m91201i() || kotlinJvmBinaryClass.mo89837b().m91308d().m91777h(m91200h())) {
            return null;
        }
        return new IncompatibleVersionErrorData<>(kotlinJvmBinaryClass.mo89837b().m91308d(), MetadataVersion.INSTANCE, m91200h(), m91200h().m91780k(kotlinJvmBinaryClass.mo89837b().m91308d().m91779j()), kotlinJvmBinaryClass.getLocation());
    }

    /* JADX INFO: renamed from: h */
    public final MetadataVersion m91200h() {
        return m91198f().m93046g().mo93067f();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m91201i() {
        return m91198f().m93046g().mo93068g();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m91202j(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        return !m91198f().m93046g().mo93065d() && kotlinJvmBinaryClass.mo89837b().m91313i() && Intrinsics.m88377d(kotlinJvmBinaryClass.mo89837b().m91308d(), f65714e);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m91203k(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        return (m91198f().m93046g().mo93063b() && (kotlinJvmBinaryClass.mo89837b().m91313i() || Intrinsics.m88377d(kotlinJvmBinaryClass.mo89837b().m91308d(), f65713d))) || m91202j(kotlinJvmBinaryClass);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final ClassData m91204l(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        String[] strArrM91311g;
        Pair<JvmNameResolver, ProtoBuf.Class> pairM91912i;
        kotlinJvmBinaryClass.getClass();
        String[] strArrM91205m = m91205m(kotlinJvmBinaryClass, f65711b);
        if (strArrM91205m == null || (strArrM91311g = kotlinJvmBinaryClass.mo89837b().m91311g()) == null) {
            return null;
        }
        try {
            try {
                pairM91912i = JvmProtoBufUtil.m91912i(strArrM91205m, strArrM91311g);
            } catch (InvalidProtocolBufferException e) {
                throw new IllegalStateException("Could not read data from " + kotlinJvmBinaryClass.getLocation(), e);
            }
        } catch (Throwable th) {
            if (m91201i() || kotlinJvmBinaryClass.mo89837b().m91308d().m91777h(m91200h())) {
                throw th;
            }
            pairM91912i = null;
        }
        if (pairM91912i == null) {
            return null;
        }
        return new ClassData(pairM91912i.component1(), pairM91912i.component2(), kotlinJvmBinaryClass.mo89837b().m91308d(), new KotlinJvmBinarySourceElement(kotlinJvmBinaryClass, m91199g(kotlinJvmBinaryClass), new PreReleaseInfo(m91203k(kotlinJvmBinaryClass), null, 2, null), m91197e(kotlinJvmBinaryClass)));
    }

    /* JADX INFO: renamed from: m */
    public final String[] m91205m(KotlinJvmBinaryClass kotlinJvmBinaryClass, Set<? extends KotlinClassHeader.Kind> set) {
        KotlinClassHeader kotlinClassHeaderMo89837b = kotlinJvmBinaryClass.mo89837b();
        String[] strArrM91305a = kotlinClassHeaderMo89837b.m91305a();
        if (strArrM91305a == null) {
            strArrM91305a = kotlinClassHeaderMo89837b.m91306b();
        }
        if (strArrM91305a == null || !set.contains(kotlinClassHeaderMo89837b.m91307c())) {
            return null;
        }
        return strArrM91305a;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final ClassDescriptor m91206n(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlinJvmBinaryClass.getClass();
        ClassData classDataM91204l = m91204l(kotlinJvmBinaryClass);
        if (classDataM91204l == null) {
            return null;
        }
        return m91198f().m93045f().m93034e(kotlinJvmBinaryClass.mo89840e(), classDataM91204l);
    }

    /* JADX INFO: renamed from: o */
    public final void m91207o(@NotNull DeserializationComponentsForJava deserializationComponentsForJava) {
        deserializationComponentsForJava.getClass();
        m91208p(deserializationComponentsForJava.m91186a());
    }

    /* JADX INFO: renamed from: p */
    public final void m91208p(@NotNull DeserializationComponents deserializationComponents) {
        deserializationComponents.getClass();
        this.f65716a = deserializationComponents;
    }
}
