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
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.awq;
import p149l.bwq;
import p149l.cwq;
import p149l.dwq;
import p149l.xvq;
import p149l.yvq;
import p149l.zvq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001.B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010#\u001a\f\u0012\b\u0012\u00060!R\u00020\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u0018\u0010%\u001a\u0006\u0012\u0002\b\u00030\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lkotlin/reflect/jvm/internal/impl/name/Name;", AuthenticationTokenClaims.JSON_KEY_NAME, "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "I", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "E", "", FirebaseAnalytics.Param.INDEX, "F", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Class;", Constants.INAPP_DATA_TAG, "()Ljava/lang/Class;", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KPackageImpl$a;", "Lkotlin/Lazy;", "data", "H", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "D", "()Ljava/util/Collection;", "constructorDescriptors", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "a", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class KPackageImpl extends KDeclarationContainerImpl {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Class<?> jClass;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy<C15171a> data;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KPackageImpl$a */
    @Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\n\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR!\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R/\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR%\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\"¨\u0006$"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$a;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/ReflectKotlinClass;", Constants.INAPP_DATA_TAG, "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getKotlinClass", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", "kotlinClass", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "e", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "Ljava/lang/Class;", "f", "Lkotlin/Lazy;", "k", "()Ljava/lang/Class;", "multifileFacade", "Lkotlin/Triple;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/MetadataVersion;", "g", "j", "()Lkotlin/Triple;", "metadata", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "h", "getMembers", "()Ljava/util/Collection;", "members", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public final class C15171a extends KDeclarationContainerImpl.Data {

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ KProperty<Object>[] f63666j = {Reflection.m87514i(new PropertyReference1Impl(C15171a.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0)), Reflection.m87514i(new PropertyReference1Impl(C15171a.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)), Reflection.m87514i(new PropertyReference1Impl(C15171a.class, "members", "getMembers()Ljava/util/Collection;", 0))};

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

        public C15171a() {
            super();
            this.kotlinClass = ReflectProperties.m87994c(new zvq(KPackageImpl.this));
            this.scope = ReflectProperties.m87994c(new awq(this));
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            this.multifileFacade = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new bwq(this, KPackageImpl.this));
            this.metadata = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new cwq(this));
            this.members = ReflectProperties.m87994c(new dwq(KPackageImpl.this, this));
        }

        /* JADX INFO: renamed from: m */
        public static final ReflectKotlinClass m87899m(KPackageImpl kPackageImpl) {
            return ReflectKotlinClass.f64321c.m88950a(kPackageImpl.mo87465d());
        }

        /* JADX INFO: renamed from: n */
        public static final Collection m87900n(KPackageImpl kPackageImpl, C15171a c15171a) {
            return kPackageImpl.m87823G(c15171a.m87907l(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
        }

        /* JADX INFO: renamed from: o */
        public static final Triple m87901o(C15171a c15171a) {
            KotlinClassHeader kotlinClassHeaderMo88946b;
            ReflectKotlinClass reflectKotlinClassM87904i = c15171a.m87904i();
            if (reflectKotlinClassM87904i != null && (kotlinClassHeaderMo88946b = reflectKotlinClassM87904i.mo88946b()) != null) {
                String[] strArrM90414a = kotlinClassHeaderMo88946b.m90414a();
                String[] strArrM90420g = kotlinClassHeaderMo88946b.m90420g();
                if (strArrM90414a != null && strArrM90420g != null) {
                    Pair<JvmNameResolver, ProtoBuf.Package> pairM91024m = JvmProtoBufUtil.m91024m(strArrM90414a, strArrM90420g);
                    return new Triple(pairM91024m.component1(), pairM91024m.component2(), kotlinClassHeaderMo88946b.m90417d());
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: p */
        public static final Class m87902p(C15171a c15171a, KPackageImpl kPackageImpl) {
            KotlinClassHeader kotlinClassHeaderMo88946b;
            ReflectKotlinClass reflectKotlinClassM87904i = c15171a.m87904i();
            String strM90418e = (reflectKotlinClassM87904i == null || (kotlinClassHeaderMo88946b = reflectKotlinClassM87904i.mo88946b()) == null) ? null : kotlinClassHeaderMo88946b.m90418e();
            if (strM90418e == null || strM90418e.length() <= 0) {
                return null;
            }
            return kPackageImpl.mo87465d().getClassLoader().loadClass(C15386d.m93478E(strM90418e, '/', '.', false, 4, null));
        }

        /* JADX INFO: renamed from: q */
        public static final MemberScope m87903q(C15171a c15171a) {
            ReflectKotlinClass reflectKotlinClassM87904i = c15171a.m87904i();
            return reflectKotlinClassM87904i != null ? c15171a.m87840b().m88962c().m88939a(reflectKotlinClassM87904i) : MemberScope.Empty.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public final ReflectKotlinClass m87904i() {
            return (ReflectKotlinClass) this.kotlinClass.m87997b(this, f63666j[0]);
        }

        @Nullable
        /* JADX INFO: renamed from: j */
        public final Triple<JvmNameResolver, ProtoBuf.Package, MetadataVersion> m87905j() {
            return (Triple) this.metadata.getValue();
        }

        @Nullable
        /* JADX INFO: renamed from: k */
        public final Class<?> m87906k() {
            return (Class) this.multifileFacade.getValue();
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final MemberScope m87907l() {
            T tM87997b = this.scope.m87997b(this, f63666j[1]);
            tM87997b.getClass();
            return (MemberScope) tM87997b;
        }
    }

    public KPackageImpl(@NotNull Class<?> cls) {
        cls.getClass();
        this.jClass = cls;
        this.data = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.PUBLICATION, new xvq(this));
    }

    /* JADX INFO: renamed from: Q */
    public static final C15171a m87891Q(KPackageImpl kPackageImpl) {
        return kPackageImpl.new C15171a();
    }

    /* JADX INFO: renamed from: R */
    public static final PropertyDescriptor m87892R(MemberDeserializer memberDeserializer, ProtoBuf.Property property) {
        memberDeserializer.getClass();
        property.getClass();
        return memberDeserializer.m92231x(property, true);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* JADX INFO: renamed from: D */
    public Collection<ConstructorDescriptor> mo87674D() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* JADX INFO: renamed from: E */
    public Collection<FunctionDescriptor> mo87675E(@NotNull Name name) {
        name.getClass();
        return m87893S().mo88720b(name, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Nullable
    /* JADX INFO: renamed from: F */
    public PropertyDescriptor mo87676F(int index) {
        Triple<JvmNameResolver, ProtoBuf.Package, MetadataVersion> tripleM87905j = this.data.getValue().m87905j();
        if (tripleM87905j != null) {
            JvmNameResolver jvmNameResolverComponent1 = tripleM87905j.component1();
            ProtoBuf.Package packageComponent2 = tripleM87905j.component2();
            MetadataVersion metadataVersionComponent3 = tripleM87905j.component3();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> generatedExtension = JvmProtoBuf.f65420n;
            generatedExtension.getClass();
            ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.m90896b(packageComponent2, generatedExtension, index);
            if (property != null) {
                Class<?> clsMo87465d = mo87465d();
                ProtoBuf.TypeTable typeTable = packageComponent2.getTypeTable();
                typeTable.getClass();
                return (PropertyDescriptor) UtilKt.m88045h(clsMo87465d, property, jvmNameResolverComponent1, new TypeTable(typeTable), metadataVersionComponent3, yvq.INSTANCE);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* JADX INFO: renamed from: H */
    public Class<?> mo87824H() {
        Class<?> clsM87906k = this.data.getValue().m87906k();
        return clsM87906k == null ? mo87465d() : clsM87906k;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* JADX INFO: renamed from: I */
    public Collection<PropertyDescriptor> mo87677I(@NotNull Name name) {
        name.getClass();
        return m87893S().mo88721c(name, NoLookupLocation.FROM_REFLECTION);
    }

    /* JADX INFO: renamed from: S */
    public final MemberScope m87893S() {
        return this.data.getValue().m87907l();
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: d */
    public Class<?> mo87465d() {
        return this.jClass;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof KPackageImpl) && Intrinsics.m87488d(mo87465d(), ((KPackageImpl) other).mo87465d());
    }

    public int hashCode() {
        return mo87465d().hashCode();
    }

    @NotNull
    public String toString() {
        return "file class " + ReflectClassUtilKt.m88991e(mo87465d()).m91034a();
    }
}
