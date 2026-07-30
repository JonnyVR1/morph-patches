package kotlin.reflect.jvm.internal;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tencent.open.SocialConstants;
import com.tencent.open.SocialOperation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.text.C15386d;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.kvq;
import p149l.lvq;
import p149l.mvq;
import p149l.nvq;
import p149l.ovq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000 K2\u00020\u0001:\u0004LMNKB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010%2\u0006\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010%2\u0006\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b(\u0010'JG\u0010.\u001a\u0004\u0018\u00010\u001e*\u0006\u0012\u0002\b\u00030)2\u0006\u0010\u0005\u001a\u00020\u00172\u0010\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0*2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030)2\u0006\u0010-\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/J?\u00100\u001a\u0004\u0018\u00010\u001e*\u0006\u0012\u0002\b\u00030)2\u0006\u0010\u0005\u001a\u00020\u00172\u0010\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0*2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030)H\u0002¢\u0006\u0004\b0\u00101J/\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u00010%*\u0006\u0012\u0002\b\u00030)2\u0010\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)02H\u0002¢\u0006\u0004\b3\u00104J;\u0010:\u001a\u0002092\u0010\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)052\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)022\u0006\u00108\u001a\u00020!H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020=2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010<\u001a\u00020!H\u0002¢\u0006\u0004\b>\u0010?J+\u0010B\u001a\u0006\u0012\u0002\b\u00030)2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\fH\u0002¢\u0006\u0004\bB\u0010CR\u0018\u0010F\u001a\u0006\u0012\u0002\b\u00030)8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020G0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006O"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "<init>", "()V", "Lkotlin/reflect/jvm/internal/impl/name/Name;", AuthenticationTokenClaims.JSON_KEY_NAME, "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "I", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "E", "", FirebaseAnalytics.Param.INDEX, "F", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "scope", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "belonginess", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "G", "(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;)Ljava/util/Collection;", "", SocialOperation.GAME_SIGNATURE, BaseSei.f13932Z, "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "w", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", SocialConstants.PARAM_APP_DESC, "Ljava/lang/reflect/Method;", BaseSei.f13931Y, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;", "", "isMember", ResourceDirection.f38808v, "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Constructor;", Constants.KEY_T, "(Ljava/lang/String;)Ljava/lang/reflect/Constructor;", "u", "Ljava/lang/Class;", "", "parameterTypes", "returnType", "isStaticDefault", "J", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "N", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "", "M", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;", "", LovePlanetStage.result, "valueParameters", "isConstructor", "", "p", "(Ljava/util/List;Ljava/util/List;Z)V", "parseReturnType", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$a;", "K", "(Ljava/lang/String;Z)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$a;", "begin", "end", "L", "(Ljava/lang/String;II)Ljava/lang/Class;", "H", "()Ljava/lang/Class;", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "D", "()Ljava/util/Collection;", "constructorDescriptors", "Companion", "Data", "MemberBelonginess", "a", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class KDeclarationContainerImpl implements ClassBasedDeclarationContainer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public static final Class<?> f63642a = DefaultConstructorMarker.class;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Regex f63643b = new Regex("<v#(\\d+)>");

    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "<init>", "()V", "Lkotlin/text/Regex;", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "a", "()Lkotlin/text/Regex;", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Regex m87837a() {
            return KDeclarationContainerImpl.f63643b;
        }

        private Companion() {
        }
    }

    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "a", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public abstract class Data {

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ KProperty<Object>[] f63644c = {Reflection.m87514i(new PropertyReference1Impl(Data.class, "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", 0))};

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal moduleData;

        public Data() {
            this.moduleData = ReflectProperties.m87994c(new ovq(KDeclarationContainerImpl.this));
        }

        /* JADX INFO: renamed from: c */
        public static final RuntimeModuleData m87839c(KDeclarationContainerImpl kDeclarationContainerImpl) {
            return ModuleByClassLoaderKt.m87991a(kDeclarationContainerImpl.mo87465d());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        /* JADX INFO: renamed from: b */
        public final RuntimeModuleData m87840b() {
            T tM87997b = this.moduleData.m87997b(this, f63644c[0]);
            tM87997b.getClass();
            return (RuntimeModuleData) tM87997b;
        }
    }

    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tj\u0002\b\u0004j\u0002\b\u0005¨\u0006\n"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "<init>", "(Ljava/lang/String;I)V", "DECLARED", "INHERITED", "accept", "", "member", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum MemberBelonginess {
        DECLARED,
        INHERITED;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        public final boolean accept(@NotNull CallableMemberDescriptor member) {
            member.getClass();
            return member.getKind().isReal() == (this == DECLARED);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$a */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R!\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$a;", "", "", "Ljava/lang/Class;", "parameters", "returnType", "<init>", "(Ljava/util/List;Ljava/lang/Class;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/Class;", "()Ljava/lang/Class;", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C15170a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<Class<?>> parameters;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Class<?> returnType;

        /* JADX WARN: Multi-variable type inference failed */
        public C15170a(@NotNull List<? extends Class<?>> list, @Nullable Class<?> cls) {
            list.getClass();
            this.parameters = list;
            this.returnType = cls;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<Class<?>> m87841a() {
            return this.parameters;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final Class<?> m87842b() {
            return this.returnType;
        }
    }

    /* JADX INFO: renamed from: A */
    public static final int m87814A(DescriptorVisibility descriptorVisibility, DescriptorVisibility descriptorVisibility2) {
        Integer numM88485d = DescriptorVisibilities.m88485d(descriptorVisibility, descriptorVisibility2);
        if (numM88485d != null) {
            return numM88485d.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: B */
    public static final int m87815B(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: C */
    public static final CharSequence m87816C(PropertyDescriptor propertyDescriptor) {
        propertyDescriptor.getClass();
        return DescriptorRenderer.f65745j.mo91447O(propertyDescriptor) + " | " + RuntimeTypeMapper.INSTANCE.m88032f(propertyDescriptor).getString();
    }

    /* JADX INFO: renamed from: x */
    public static final CharSequence m87822x(FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        return DescriptorRenderer.f65745j.mo91447O(functionDescriptor) + " | " + RuntimeTypeMapper.INSTANCE.m88033g(functionDescriptor).get_signature();
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public abstract Collection<ConstructorDescriptor> mo87674D();

    @NotNull
    /* JADX INFO: renamed from: E */
    public abstract Collection<FunctionDescriptor> mo87675E(@NotNull Name name);

    @Nullable
    /* JADX INFO: renamed from: F */
    public abstract PropertyDescriptor mo87676F(int index);

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    @NotNull
    /* JADX INFO: renamed from: G */
    public final Collection<KCallableImpl<?>> m87823G(@NotNull MemberScope scope, @NotNull MemberBelonginess belonginess) {
        KCallableImpl kCallableImpl;
        scope.getClass();
        belonginess.getClass();
        CreateKCallableVisitor createKCallableVisitor = new CreateKCallableVisitor(this) { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$getMembers$visitor$1
            {
                super(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public KCallableImpl<?> mo87843f(ConstructorDescriptor constructorDescriptor, Unit unit) {
                constructorDescriptor.getClass();
                unit.getClass();
                throw new IllegalStateException("No constructors should appear here: " + constructorDescriptor);
            }
        };
        Collection<DeclarationDescriptor> collectionM92067a = ResolutionScope.DefaultImpls.m92067a(scope, null, null, 3, null);
        ArrayList arrayList = new ArrayList();
        for (DeclarationDescriptor declarationDescriptor : collectionM92067a) {
            if (declarationDescriptor instanceof CallableMemberDescriptor) {
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) declarationDescriptor;
                if (Intrinsics.m87488d(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.f64029h) || !belonginess.accept(callableMemberDescriptor)) {
                    kCallableImpl = null;
                } else {
                    kCallableImpl = (KCallableImpl) declarationDescriptor.mo88464S(createKCallableVisitor, Unit.INSTANCE);
                }
            } else {
                kCallableImpl = null;
            }
            if (kCallableImpl != null) {
                arrayList.add(kCallableImpl);
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public Class<?> mo87824H() {
        Class<?> clsM88997k = ReflectClassUtilKt.m88997k(mo87465d());
        return clsM88997k == null ? mo87465d() : clsM88997k;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public abstract Collection<PropertyDescriptor> mo87677I(@NotNull Name name);

    /* JADX INFO: renamed from: J */
    public final Method m87825J(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z) {
        KDeclarationContainerImpl kDeclarationContainerImpl;
        String str2;
        Class<?>[] clsArr2;
        Class<?> cls3;
        boolean z2;
        Class<?> clsM88944a;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodM87829N = m87829N(cls, str, clsArr, cls2);
        if (methodM87829N != null) {
            return methodM87829N;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            Method methodM87825J = m87825J(superclass, str, clsArr, cls2, z);
            kDeclarationContainerImpl = this;
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z2 = z;
            if (methodM87825J != null) {
                return methodM87825J;
            }
        } else {
            kDeclarationContainerImpl = this;
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z2 = z;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        interfaces.getClass();
        for (Class<?> cls4 : interfaces) {
            cls4.getClass();
            Method methodM87825J2 = kDeclarationContainerImpl.m87825J(cls4, str2, clsArr2, cls3, z2);
            if (methodM87825J2 != null) {
                return methodM87825J2;
            }
            if (z2 && (clsM88944a = ReflectJavaClassFinderKt.m88944a(ReflectClassUtilKt.m88996j(cls4), cls4.getName().concat("$DefaultImpls"))) != null) {
                clsArr2[0] = cls4;
                Method methodM87829N2 = kDeclarationContainerImpl.m87829N(clsM88944a, str2, clsArr2, cls3);
                if (methodM87829N2 != null) {
                    return methodM87829N2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final C15170a m87826K(String desc, boolean parseReturnType) {
        String str;
        int iB0;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (true) {
            if (desc.charAt(i) == ')') {
                String str2 = desc;
                return new C15170a(arrayList, parseReturnType ? m87827L(str2, i + 1, str2.length()) : null);
            }
            int i2 = i;
            while (desc.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = desc.charAt(i2);
            if (StringsKt.m93410O("VZCBSIFJD", cCharAt, false, 2, null)) {
                int i3 = i2 + 1;
                str = desc;
                iB0 = i3;
            } else {
                if (cCharAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(desc));
                }
                str = desc;
                iB0 = StringsKt.m93435b0(str, ';', i, false, 4, null) + 1;
            }
            arrayList.add(m87827L(str, i, iB0));
            i = iB0;
            desc = str;
        }
    }

    /* JADX INFO: renamed from: L */
    public final Class<?> m87827L(String desc, int begin, int end) throws ClassNotFoundException {
        char cCharAt = desc.charAt(begin);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            Class<?> clsLoadClass = ReflectClassUtilKt.m88996j(mo87465d()).loadClass(C15386d.m93478E(desc.substring(begin + 1, end - 1), '/', '.', false, 4, null));
            clsLoadClass.getClass();
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class<?> cls = Void.TYPE;
            cls.getClass();
            return cls;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return UtilKt.m88043f(m87827L(desc, begin + 1, end));
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(desc));
        }
    }

    /* JADX INFO: renamed from: M */
    public final Constructor<?> m87828M(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: N */
    public final Method m87829N(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (Intrinsics.m87488d(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (Intrinsics.m87488d(method.getName(), str) && Intrinsics.m87488d(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m87830p(List<Class<?>> result, List<? extends Class<?>> valueParameters, boolean isConstructor) {
        if (Intrinsics.m87488d(CollectionsKt.lastOrNull((List) valueParameters), f63642a)) {
            valueParameters = valueParameters.subList(0, valueParameters.size() - 1);
        }
        result.addAll(valueParameters);
        int size = (valueParameters.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            Class<?> cls = Integer.TYPE;
            cls.getClass();
            result.add(cls);
        }
        Class<?> cls2 = isConstructor ? f63642a : Object.class;
        cls2.getClass();
        result.add(cls2);
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final Constructor<?> m87831t(@NotNull String desc) {
        desc.getClass();
        return m87828M(mo87465d(), m87826K(desc, false).m87841a());
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public final Constructor<?> m87832u(@NotNull String desc) {
        desc.getClass();
        Class<?> clsMo87465d = mo87465d();
        ArrayList arrayList = new ArrayList();
        m87830p(arrayList, m87826K(desc, false).m87841a(), true);
        Unit unit = Unit.INSTANCE;
        return m87828M(clsMo87465d, arrayList);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public final Method m87833v(@NotNull String name, @NotNull String desc, boolean isMember) {
        name.getClass();
        desc.getClass();
        if (Intrinsics.m87488d(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (isMember) {
            arrayList.add(mo87465d());
        }
        C15170a c15170aM87826K = m87826K(desc, true);
        m87830p(arrayList, c15170aM87826K.m87841a(), false);
        Class<?> clsMo87824H = mo87824H();
        String str = name + "$default";
        Class<?>[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<?> clsM87842b = c15170aM87826K.m87842b();
        clsM87842b.getClass();
        return m87825J(clsMo87824H, str, clsArr, clsM87842b, isMember);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a4  */
    @NotNull
    /* JADX INFO: renamed from: w */
    public final FunctionDescriptor m87834w(@NotNull String name, @NotNull String signature) {
        List listMo87675E;
        ArrayList arrayList;
        String strMo87679a;
        name.getClass();
        signature.getClass();
        if (Intrinsics.m87488d(name, "<init>")) {
            listMo87675E = CollectionsKt.toList(mo87674D());
            arrayList = new ArrayList();
            for (Object obj : listMo87675E) {
                ConstructorDescriptor constructorDescriptor = (ConstructorDescriptor) obj;
                if (constructorDescriptor.mo88463i0()) {
                    ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParametersMo88299b = constructorDescriptor.mo88299b();
                    classifierDescriptorWithTypeParametersMo88299b.getClass();
                    if (InlineClassesUtilsKt.m91789d(classifierDescriptorWithTypeParametersMo88299b)) {
                        String strMo87679a2 = RuntimeTypeMapper.INSTANCE.m88033g(constructorDescriptor).get_signature();
                        if (!C15386d.m93483J(strMo87679a2, "constructor-impl", false, 2, null) || !C15386d.m93489w(strMo87679a2, ")V", false, 2, null)) {
                            throw new IllegalArgumentException(("Invalid signature of " + constructorDescriptor + ": " + strMo87679a2).toString());
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(StringsKt.m93458y0(strMo87679a2, j6f.GPS_MEASUREMENT_INTERRUPTED));
                        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParametersMo88299b2 = constructorDescriptor.mo88299b();
                        classifierDescriptorWithTypeParametersMo88299b2.getClass();
                        sb.append(ValueClassAwareCallerKt.m88128u(classifierDescriptorWithTypeParametersMo88299b2));
                        strMo87679a = sb.toString();
                    } else {
                        strMo87679a = RuntimeTypeMapper.INSTANCE.m88033g(constructorDescriptor).get_signature();
                    }
                } else {
                    strMo87679a = RuntimeTypeMapper.INSTANCE.m88033g(constructorDescriptor).get_signature();
                }
                if (Intrinsics.m87488d(strMo87679a, signature)) {
                    arrayList.add(obj);
                }
            }
        } else {
            Name nameM91079i = Name.m91079i(name);
            nameM91079i.getClass();
            listMo87675E = mo87675E(nameM91079i);
            arrayList = new ArrayList();
            for (Object obj2 : listMo87675E) {
                if (Intrinsics.m87488d(RuntimeTypeMapper.INSTANCE.m88033g((FunctionDescriptor) obj2).get_signature(), signature)) {
                    arrayList.add(obj2);
                }
            }
        }
        if (arrayList.size() == 1) {
            return (FunctionDescriptor) CollectionsKt.single((List) arrayList);
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(listMo87675E, SignParameters.NEW_LINE, null, null, 0, null, nvq.INSTANCE, 30, null);
        StringBuilder sb2 = new StringBuilder("Function '");
        sb2.append(name);
        sb2.append("' (JVM signature: ");
        sb2.append(signature);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(':');
        sb2.append(strJoinToString$default.length() == 0 ? " no members found" : SignParameters.NEW_LINE + strJoinToString$default);
        throw new KotlinReflectionInternalError(sb2.toString());
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    public final Method m87835y(@NotNull String name, @NotNull String desc) {
        Method methodM87825J;
        name.getClass();
        desc.getClass();
        if (Intrinsics.m87488d(name, "<init>")) {
            return null;
        }
        C15170a c15170aM87826K = m87826K(desc, true);
        Class<?>[] clsArr = (Class[]) c15170aM87826K.m87841a().toArray(new Class[0]);
        Class<?> clsM87842b = c15170aM87826K.m87842b();
        clsM87842b.getClass();
        Method methodM87825J2 = m87825J(mo87824H(), name, clsArr, clsM87842b, false);
        if (methodM87825J2 != null) {
            return methodM87825J2;
        }
        if (!mo87824H().isInterface() || (methodM87825J = m87825J(Object.class, name, clsArr, clsM87842b, false)) == null) {
            return null;
        }
        return methodM87825J;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final PropertyDescriptor m87836z(@NotNull String name, @NotNull String signature) {
        name.getClass();
        signature.getClass();
        MatchResult matchResultMatchEntire = f63643b.matchEntire(signature);
        if (matchResultMatchEntire != null) {
            String str = matchResultMatchEntire.mo93362a().getMatch().mo93364c().get(1);
            PropertyDescriptor propertyDescriptorMo87676F = mo87676F(Integer.parseInt(str));
            if (propertyDescriptorMo87676F != null) {
                return propertyDescriptorMo87676F;
            }
            throw new KotlinReflectionInternalError("Local property #" + str + " not found in " + mo87465d());
        }
        Name nameM91079i = Name.m91079i(name);
        nameM91079i.getClass();
        Collection<PropertyDescriptor> collectionMo87677I = mo87677I(nameM91079i);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionMo87677I) {
            if (Intrinsics.m87488d(RuntimeTypeMapper.INSTANCE.m88032f((PropertyDescriptor) obj).getString(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new KotlinReflectionInternalError("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (PropertyDescriptor) CollectionsKt.single((List) arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            DescriptorVisibility visibility = ((PropertyDescriptor) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Collection collectionValues = MapsKt.toSortedMap(linkedHashMap, new lvq(kvq.INSTANCE)).values();
        collectionValues.getClass();
        List list = (List) CollectionsKt.last(collectionValues);
        if (list.size() == 1) {
            return (PropertyDescriptor) CollectionsKt.first(list);
        }
        Name nameM91079i2 = Name.m91079i(name);
        nameM91079i2.getClass();
        String strJoinToString$default = CollectionsKt.joinToString$default(mo87677I(nameM91079i2), SignParameters.NEW_LINE, null, null, 0, null, mvq.INSTANCE, 30, null);
        StringBuilder sb = new StringBuilder("Property '");
        sb.append(name);
        sb.append("' (JVM signature: ");
        sb.append(signature);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        sb.append(strJoinToString$default.length() == 0 ? " no members found" : SignParameters.NEW_LINE + strJoinToString$default);
        throw new KotlinReflectionInternalError(sb.toString());
    }
}
