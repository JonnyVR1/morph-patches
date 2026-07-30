package kotlin.reflect.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ayq;
import p153l.byq;
import p153l.cyq;
import p153l.dyq;
import p153l.eyq;
import p153l.yxq;
import p153l.zxq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001.B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010#\u001a\f\u0012\b\u0012\u00060!R\u00020\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u0018\u0010%\u001a\u0006\u0012\u0002\b\u00030\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lkotlin/reflect/jvm/internal/impl/name/Name;", AuthenticationTokenClaims.JSON_KEY_NAME, "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "I", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "E", "", FirebaseAnalytics.Param.INDEX, "F", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Class;", Constants.INAPP_DATA_TAG, "()Ljava/lang/Class;", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KPackageImpl$a;", "Lkotlin/Lazy;", "data", "H", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "D", "()Ljava/util/Collection;", "constructorDescriptors", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "a", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class KPackageImpl extends KDeclarationContainerImpl {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Class<?> jClass;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy<C15278a> data;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KPackageImpl$a */
    @Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\n\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR!\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R/\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR%\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\"¨\u0006$"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$a;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/ReflectKotlinClass;", Constants.INAPP_DATA_TAG, "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getKotlinClass", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", "kotlinClass", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "e", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "Ljava/lang/Class;", "f", "Lkotlin/Lazy;", "k", "()Ljava/lang/Class;", "multifileFacade", "Lkotlin/Triple;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/MetadataVersion;", "g", "j", "()Lkotlin/Triple;", "metadata", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "h", "getMembers", "()Ljava/util/Collection;", "members", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public final class C15278a extends KDeclarationContainerImpl.Data {

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ KProperty<Object>[] f64340j = {Reflection.m88403i(new PropertyReference1Impl(C15278a.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0)), Reflection.m88403i(new PropertyReference1Impl(C15278a.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)), Reflection.m88403i(new PropertyReference1Impl(C15278a.class, "members", "getMembers()Ljava/util/Collection;", 0))};

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal kotlinClass;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal scope;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final Lazy multifileFacade;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final Lazy metadata;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal members;

        public C15278a() {
            super();
            this.kotlinClass = ReflectProperties.m88885c(new ayq(KPackageImpl.this));
            this.scope = ReflectProperties.m88885c(new byq(this));
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            this.multifileFacade = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new cyq(this, KPackageImpl.this));
            this.metadata = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new dyq(this));
            this.members = ReflectProperties.m88885c(new eyq(KPackageImpl.this, this));
        }

        /* JADX INFO: renamed from: m */
        public static final ReflectKotlinClass m88790m(KPackageImpl kPackageImpl) {
            return ReflectKotlinClass.f64995c.m89841a(kPackageImpl.mo88354d());
        }

        /* JADX INFO: renamed from: n */
        public static final Collection m88791n(KPackageImpl kPackageImpl, C15278a c15278a) {
            return kPackageImpl.m88714G(c15278a.m88798l(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
        }

        /* JADX INFO: renamed from: o */
        public static final Triple m88792o(C15278a c15278a) {
            KotlinClassHeader kotlinClassHeaderMo89837b;
            ReflectKotlinClass reflectKotlinClassM88795i = c15278a.m88795i();
            if (reflectKotlinClassM88795i != null && (kotlinClassHeaderMo89837b = reflectKotlinClassM88795i.mo89837b()) != null) {
                String[] strArrM91305a = kotlinClassHeaderMo89837b.m91305a();
                String[] strArrM91311g = kotlinClassHeaderMo89837b.m91311g();
                if (strArrM91305a != null && strArrM91311g != null) {
                    Pair<JvmNameResolver, ProtoBuf.Package> pairM91915m = JvmProtoBufUtil.m91915m(strArrM91305a, strArrM91311g);
                    return new Triple(pairM91915m.component1(), pairM91915m.component2(), kotlinClassHeaderMo89837b.m91308d());
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: p */
        public static final Class m88793p(C15278a c15278a, KPackageImpl kPackageImpl) {
            KotlinClassHeader kotlinClassHeaderMo89837b;
            ReflectKotlinClass reflectKotlinClassM88795i = c15278a.m88795i();
            String strM91309e = (reflectKotlinClassM88795i == null || (kotlinClassHeaderMo89837b = reflectKotlinClassM88795i.mo89837b()) == null) ? null : kotlinClassHeaderMo89837b.m91309e();
            if (strM91309e == null || strM91309e.length() <= 0) {
                return null;
            }
            return kPackageImpl.mo88354d().getClassLoader().loadClass(C15493d.m94369E(strM91309e, '/', '.', false, 4, null));
        }

        /* JADX INFO: renamed from: q */
        public static final MemberScope m88794q(C15278a c15278a) {
            ReflectKotlinClass reflectKotlinClassM88795i = c15278a.m88795i();
            return reflectKotlinClassM88795i != null ? c15278a.m88731b().m89853c().m89830a(reflectKotlinClassM88795i) : MemberScope.Empty.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public final ReflectKotlinClass m88795i() {
            return (ReflectKotlinClass) this.kotlinClass.m88888b(this, f64340j[0]);
        }

        @Nullable
        /* JADX INFO: renamed from: j */
        public final Triple<JvmNameResolver, ProtoBuf.Package, MetadataVersion> m88796j() {
            return (Triple) this.metadata.getValue();
        }

        @Nullable
        /* JADX INFO: renamed from: k */
        public final Class<?> m88797k() {
            return (Class) this.multifileFacade.getValue();
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final MemberScope m88798l() {
            T tM88888b = this.scope.m88888b(this, f64340j[1]);
            tM88888b.getClass();
            return (MemberScope) tM88888b;
        }
    }

    public KPackageImpl(@NotNull Class<?> cls) {
        cls.getClass();
        this.jClass = cls;
        this.data = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.PUBLICATION, new yxq(this));
    }

    /* JADX INFO: renamed from: Q */
    public static final C15278a m88782Q(KPackageImpl kPackageImpl) {
        return kPackageImpl.new C15278a();
    }

    /* JADX INFO: renamed from: R */
    public static final PropertyDescriptor m88783R(MemberDeserializer memberDeserializer, ProtoBuf.Property property) {
        memberDeserializer.getClass();
        property.getClass();
        return memberDeserializer.m93122x(property, true);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* JADX INFO: renamed from: D */
    public Collection<ConstructorDescriptor> mo88565D() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* JADX INFO: renamed from: E */
    public Collection<FunctionDescriptor> mo88566E(@NotNull Name name) {
        name.getClass();
        return m88784S().mo89611b(name, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Nullable
    /* JADX INFO: renamed from: F */
    public PropertyDescriptor mo88567F(int index) {
        Triple<JvmNameResolver, ProtoBuf.Package, MetadataVersion> tripleM88796j = this.data.getValue().m88796j();
        if (tripleM88796j != null) {
            JvmNameResolver jvmNameResolverComponent1 = tripleM88796j.component1();
            ProtoBuf.Package packageComponent2 = tripleM88796j.component2();
            MetadataVersion metadataVersionComponent3 = tripleM88796j.component3();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> generatedExtension = JvmProtoBuf.f66094n;
            generatedExtension.getClass();
            ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.m91787b(packageComponent2, generatedExtension, index);
            if (property != null) {
                Class<?> clsMo88354d = mo88354d();
                ProtoBuf.TypeTable typeTable = packageComponent2.getTypeTable();
                typeTable.getClass();
                return (PropertyDescriptor) UtilKt.m88936h(clsMo88354d, property, jvmNameResolverComponent1, new TypeTable(typeTable), metadataVersionComponent3, zxq.INSTANCE);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* JADX INFO: renamed from: H */
    public Class<?> mo88715H() {
        Class<?> clsM88797k = this.data.getValue().m88797k();
        return clsM88797k == null ? mo88354d() : clsM88797k;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* JADX INFO: renamed from: I */
    public Collection<PropertyDescriptor> mo88568I(@NotNull Name name) {
        name.getClass();
        return m88784S().mo89612c(name, NoLookupLocation.FROM_REFLECTION);
    }

    /* JADX INFO: renamed from: S */
    public final MemberScope m88784S() {
        return this.data.getValue().m88798l();
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: d */
    public Class<?> mo88354d() {
        return this.jClass;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof KPackageImpl) && Intrinsics.m88377d(mo88354d(), ((KPackageImpl) other).mo88354d());
    }

    public int hashCode() {
        return mo88354d().hashCode();
    }

    @NotNull
    public String toString() {
        return "file class " + ReflectClassUtilKt.m89882e(mo88354d()).m91925a();
    }
}
