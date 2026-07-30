package kotlin.reflect.jvm.internal;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
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
import kotlin.text.C15493d;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.lxq;
import p153l.mxq;
import p153l.nxq;
import p153l.oxq;
import p153l.p7f;
import p153l.pxq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000 K2\u00020\u0001:\u0004LMNKB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010%2\u0006\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010%2\u0006\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b(\u0010'JG\u0010.\u001a\u0004\u0018\u00010\u001e*\u0006\u0012\u0002\b\u00030)2\u0006\u0010\u0005\u001a\u00020\u00172\u0010\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0*2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030)2\u0006\u0010-\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/J?\u00100\u001a\u0004\u0018\u00010\u001e*\u0006\u0012\u0002\b\u00030)2\u0006\u0010\u0005\u001a\u00020\u00172\u0010\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0*2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030)H\u0002¢\u0006\u0004\b0\u00101J/\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u00010%*\u0006\u0012\u0002\b\u00030)2\u0010\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)02H\u0002¢\u0006\u0004\b3\u00104J;\u0010:\u001a\u0002092\u0010\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)052\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)022\u0006\u00108\u001a\u00020!H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020=2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010<\u001a\u00020!H\u0002¢\u0006\u0004\b>\u0010?J+\u0010B\u001a\u0006\u0012\u0002\b\u00030)2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\fH\u0002¢\u0006\u0004\bB\u0010CR\u0018\u0010F\u001a\u0006\u0012\u0002\b\u00030)8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020G0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006O"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "<init>", "()V", "Lkotlin/reflect/jvm/internal/impl/name/Name;", AuthenticationTokenClaims.JSON_KEY_NAME, "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "I", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "E", "", FirebaseAnalytics.Param.INDEX, "F", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "scope", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "belonginess", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "G", "(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;)Ljava/util/Collection;", "", SocialOperation.GAME_SIGNATURE, BaseSei.f14626Z, "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "w", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", SocialConstants.PARAM_APP_DESC, "Ljava/lang/reflect/Method;", BaseSei.f14625Y, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;", "", "isMember", ResourceDirection.f39656v, "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Constructor;", Constants.KEY_T, "(Ljava/lang/String;)Ljava/lang/reflect/Constructor;", "u", "Ljava/lang/Class;", "", "parameterTypes", "returnType", "isStaticDefault", "J", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "N", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "", "M", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;", "", LovePlanetStage.result, "valueParameters", "isConstructor", "", "p", "(Ljava/util/List;Ljava/util/List;Z)V", "parseReturnType", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$a;", "K", "(Ljava/lang/String;Z)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$a;", "begin", "end", "L", "(Ljava/lang/String;II)Ljava/lang/Class;", "H", "()Ljava/lang/Class;", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "D", "()Ljava/util/Collection;", "constructorDescriptors", "Companion", "Data", "MemberBelonginess", "a", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class KDeclarationContainerImpl implements ClassBasedDeclarationContainer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public static final Class<?> f64316a = DefaultConstructorMarker.class;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Regex f64317b = new Regex("<v#(\\d+)>");

    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "<init>", "()V", "Lkotlin/text/Regex;", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "a", "()Lkotlin/text/Regex;", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Regex m88728a() {
            return KDeclarationContainerImpl.f64317b;
        }

        private Companion() {
        }
    }

    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "a", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public abstract class Data {

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ KProperty<Object>[] f64318c = {Reflection.m88403i(new PropertyReference1Impl(Data.class, "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", 0))};

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal moduleData;

        public Data() {
            this.moduleData = ReflectProperties.m88885c(new pxq(KDeclarationContainerImpl.this));
        }

        /* JADX INFO: renamed from: c */
        public static final RuntimeModuleData m88730c(KDeclarationContainerImpl kDeclarationContainerImpl) {
            return ModuleByClassLoaderKt.m88882a(kDeclarationContainerImpl.mo88354d());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        /* JADX INFO: renamed from: b */
        public final RuntimeModuleData m88731b() {
            T tM88888b = this.moduleData.m88888b(this, f64318c[0]);
            tM88888b.getClass();
            return (RuntimeModuleData) tM88888b;
        }
    }

    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tj\u0002\b\u0004j\u0002\b\u0005¨\u0006\n"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "<init>", "(Ljava/lang/String;I)V", "DECLARED", "INHERITED", "accept", "", "member", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum MemberBelonginess {
        DECLARED,
        INHERITED;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        public final boolean accept(@NotNull CallableMemberDescriptor member) {
            member.getClass();
            return member.getKind().isReal() == (this == DECLARED);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$a */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R!\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$a;", "", "", "Ljava/lang/Class;", "parameters", "returnType", "<init>", "(Ljava/util/List;Ljava/lang/Class;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/Class;", "()Ljava/lang/Class;", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C15277a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<Class<?>> parameters;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Class<?> returnType;

        /* JADX WARN: Multi-variable type inference failed */
        public C15277a(@NotNull List<? extends Class<?>> list, @Nullable Class<?> cls) {
            list.getClass();
            this.parameters = list;
            this.returnType = cls;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<Class<?>> m88732a() {
            return this.parameters;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final Class<?> m88733b() {
            return this.returnType;
        }
    }

    /* JADX INFO: renamed from: A */
    public static final int m88705A(DescriptorVisibility descriptorVisibility, DescriptorVisibility descriptorVisibility2) {
        Integer numM89376d = DescriptorVisibilities.m89376d(descriptorVisibility, descriptorVisibility2);
        if (numM89376d != null) {
            return numM89376d.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: B */
    public static final int m88706B(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: C */
    public static final CharSequence m88707C(PropertyDescriptor propertyDescriptor) {
        propertyDescriptor.getClass();
        return DescriptorRenderer.f66419j.mo92338O(propertyDescriptor) + " | " + RuntimeTypeMapper.INSTANCE.m88923f(propertyDescriptor).getString();
    }

    /* JADX INFO: renamed from: x */
    public static final CharSequence m88713x(FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        return DescriptorRenderer.f66419j.mo92338O(functionDescriptor) + " | " + RuntimeTypeMapper.INSTANCE.m88924g(functionDescriptor).get_signature();
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public abstract Collection<ConstructorDescriptor> mo88565D();

    @NotNull
    /* JADX INFO: renamed from: E */
    public abstract Collection<FunctionDescriptor> mo88566E(@NotNull Name name);

    @Nullable
    /* JADX INFO: renamed from: F */
    public abstract PropertyDescriptor mo88567F(int index);

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    @NotNull
    /* JADX INFO: renamed from: G */
    public final Collection<KCallableImpl<?>> m88714G(@NotNull MemberScope scope, @NotNull MemberBelonginess belonginess) {
        KCallableImpl kCallableImpl;
        scope.getClass();
        belonginess.getClass();
        CreateKCallableVisitor createKCallableVisitor = new CreateKCallableVisitor(this) { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$getMembers$visitor$1
            {
                super(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public KCallableImpl<?> mo88734f(ConstructorDescriptor constructorDescriptor, Unit unit) {
                constructorDescriptor.getClass();
                unit.getClass();
                throw new IllegalStateException("No constructors should appear here: " + constructorDescriptor);
            }
        };
        Collection<DeclarationDescriptor> collectionM92958a = ResolutionScope.DefaultImpls.m92958a(scope, null, null, 3, null);
        ArrayList arrayList = new ArrayList();
        for (DeclarationDescriptor declarationDescriptor : collectionM92958a) {
            if (declarationDescriptor instanceof CallableMemberDescriptor) {
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) declarationDescriptor;
                if (Intrinsics.m88377d(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.f64703h) || !belonginess.accept(callableMemberDescriptor)) {
                    kCallableImpl = null;
                } else {
                    kCallableImpl = (KCallableImpl) declarationDescriptor.mo89355S(createKCallableVisitor, Unit.INSTANCE);
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
    public Class<?> mo88715H() {
        Class<?> clsM89888k = ReflectClassUtilKt.m89888k(mo88354d());
        return clsM89888k == null ? mo88354d() : clsM89888k;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public abstract Collection<PropertyDescriptor> mo88568I(@NotNull Name name);

    /* JADX INFO: renamed from: J */
    public final Method m88716J(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z) {
        KDeclarationContainerImpl kDeclarationContainerImpl;
        String str2;
        Class<?>[] clsArr2;
        Class<?> cls3;
        boolean z2;
        Class<?> clsM89835a;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodM88720N = m88720N(cls, str, clsArr, cls2);
        if (methodM88720N != null) {
            return methodM88720N;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            Method methodM88716J = m88716J(superclass, str, clsArr, cls2, z);
            kDeclarationContainerImpl = this;
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z2 = z;
            if (methodM88716J != null) {
                return methodM88716J;
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
            Method methodM88716J2 = kDeclarationContainerImpl.m88716J(cls4, str2, clsArr2, cls3, z2);
            if (methodM88716J2 != null) {
                return methodM88716J2;
            }
            if (z2 && (clsM89835a = ReflectJavaClassFinderKt.m89835a(ReflectClassUtilKt.m89887j(cls4), cls4.getName().concat("$DefaultImpls"))) != null) {
                clsArr2[0] = cls4;
                Method methodM88720N2 = kDeclarationContainerImpl.m88720N(clsM89835a, str2, clsArr2, cls3);
                if (methodM88720N2 != null) {
                    return methodM88720N2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final C15277a m88717K(String desc, boolean parseReturnType) {
        String str;
        int iB0;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (true) {
            if (desc.charAt(i) == ')') {
                String str2 = desc;
                return new C15277a(arrayList, parseReturnType ? m88718L(str2, i + 1, str2.length()) : null);
            }
            int i2 = i;
            while (desc.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = desc.charAt(i2);
            if (StringsKt.m94301O("VZCBSIFJD", cCharAt, false, 2, null)) {
                int i3 = i2 + 1;
                str = desc;
                iB0 = i3;
            } else {
                if (cCharAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(desc));
                }
                str = desc;
                iB0 = StringsKt.m94326b0(str, ';', i, false, 4, null) + 1;
            }
            arrayList.add(m88718L(str, i, iB0));
            i = iB0;
            desc = str;
        }
    }

    /* JADX INFO: renamed from: L */
    public final Class<?> m88718L(String desc, int begin, int end) throws ClassNotFoundException {
        char cCharAt = desc.charAt(begin);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            Class<?> clsLoadClass = ReflectClassUtilKt.m89887j(mo88354d()).loadClass(C15493d.m94369E(desc.substring(begin + 1, end - 1), '/', '.', false, 4, null));
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
            return UtilKt.m88934f(m88718L(desc, begin + 1, end));
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
    public final Constructor<?> m88719M(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: N */
    public final Method m88720N(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (Intrinsics.m88377d(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (Intrinsics.m88377d(method.getName(), str) && Intrinsics.m88377d(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m88721p(List<Class<?>> result, List<? extends Class<?>> valueParameters, boolean isConstructor) {
        if (Intrinsics.m88377d(CollectionsKt.lastOrNull((List) valueParameters), f64316a)) {
            valueParameters = valueParameters.subList(0, valueParameters.size() - 1);
        }
        result.addAll(valueParameters);
        int size = (valueParameters.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            Class<?> cls = Integer.TYPE;
            cls.getClass();
            result.add(cls);
        }
        Class<?> cls2 = isConstructor ? f64316a : Object.class;
        cls2.getClass();
        result.add(cls2);
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final Constructor<?> m88722t(@NotNull String desc) {
        desc.getClass();
        return m88719M(mo88354d(), m88717K(desc, false).m88732a());
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public final Constructor<?> m88723u(@NotNull String desc) {
        desc.getClass();
        Class<?> clsMo88354d = mo88354d();
        ArrayList arrayList = new ArrayList();
        m88721p(arrayList, m88717K(desc, false).m88732a(), true);
        Unit unit = Unit.INSTANCE;
        return m88719M(clsMo88354d, arrayList);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public final Method m88724v(@NotNull String name, @NotNull String desc, boolean isMember) {
        name.getClass();
        desc.getClass();
        if (Intrinsics.m88377d(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (isMember) {
            arrayList.add(mo88354d());
        }
        C15277a c15277aM88717K = m88717K(desc, true);
        m88721p(arrayList, c15277aM88717K.m88732a(), false);
        Class<?> clsMo88715H = mo88715H();
        String str = name + "$default";
        Class<?>[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<?> clsM88733b = c15277aM88717K.m88733b();
        clsM88733b.getClass();
        return m88716J(clsMo88715H, str, clsArr, clsM88733b, isMember);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a4  */
    @NotNull
    /* JADX INFO: renamed from: w */
    public final FunctionDescriptor m88725w(@NotNull String name, @NotNull String signature) {
        List listMo88566E;
        ArrayList arrayList;
        String strMo88570a;
        name.getClass();
        signature.getClass();
        if (Intrinsics.m88377d(name, "<init>")) {
            listMo88566E = CollectionsKt.toList(mo88565D());
            arrayList = new ArrayList();
            for (Object obj : listMo88566E) {
                ConstructorDescriptor constructorDescriptor = (ConstructorDescriptor) obj;
                if (constructorDescriptor.mo89354i0()) {
                    ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParametersMo89190b = constructorDescriptor.mo89190b();
                    classifierDescriptorWithTypeParametersMo89190b.getClass();
                    if (InlineClassesUtilsKt.m92680d(classifierDescriptorWithTypeParametersMo89190b)) {
                        String strMo88570a2 = RuntimeTypeMapper.INSTANCE.m88924g(constructorDescriptor).get_signature();
                        if (!C15493d.m94374J(strMo88570a2, "constructor-impl", false, 2, null) || !C15493d.m94380w(strMo88570a2, ")V", false, 2, null)) {
                            throw new IllegalArgumentException(("Invalid signature of " + constructorDescriptor + ": " + strMo88570a2).toString());
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(StringsKt.m94349y0(strMo88570a2, p7f.GPS_MEASUREMENT_INTERRUPTED));
                        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParametersMo89190b2 = constructorDescriptor.mo89190b();
                        classifierDescriptorWithTypeParametersMo89190b2.getClass();
                        sb.append(ValueClassAwareCallerKt.m89019u(classifierDescriptorWithTypeParametersMo89190b2));
                        strMo88570a = sb.toString();
                    } else {
                        strMo88570a = RuntimeTypeMapper.INSTANCE.m88924g(constructorDescriptor).get_signature();
                    }
                } else {
                    strMo88570a = RuntimeTypeMapper.INSTANCE.m88924g(constructorDescriptor).get_signature();
                }
                if (Intrinsics.m88377d(strMo88570a, signature)) {
                    arrayList.add(obj);
                }
            }
        } else {
            Name nameM91970i = Name.m91970i(name);
            nameM91970i.getClass();
            listMo88566E = mo88566E(nameM91970i);
            arrayList = new ArrayList();
            for (Object obj2 : listMo88566E) {
                if (Intrinsics.m88377d(RuntimeTypeMapper.INSTANCE.m88924g((FunctionDescriptor) obj2).get_signature(), signature)) {
                    arrayList.add(obj2);
                }
            }
        }
        if (arrayList.size() == 1) {
            return (FunctionDescriptor) CollectionsKt.single((List) arrayList);
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(listMo88566E, SignParameters.NEW_LINE, null, null, 0, null, oxq.INSTANCE, 30, null);
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
    public final Method m88726y(@NotNull String name, @NotNull String desc) {
        Method methodM88716J;
        name.getClass();
        desc.getClass();
        if (Intrinsics.m88377d(name, "<init>")) {
            return null;
        }
        C15277a c15277aM88717K = m88717K(desc, true);
        Class<?>[] clsArr = (Class[]) c15277aM88717K.m88732a().toArray(new Class[0]);
        Class<?> clsM88733b = c15277aM88717K.m88733b();
        clsM88733b.getClass();
        Method methodM88716J2 = m88716J(mo88715H(), name, clsArr, clsM88733b, false);
        if (methodM88716J2 != null) {
            return methodM88716J2;
        }
        if (!mo88715H().isInterface() || (methodM88716J = m88716J(Object.class, name, clsArr, clsM88733b, false)) == null) {
            return null;
        }
        return methodM88716J;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final PropertyDescriptor m88727z(@NotNull String name, @NotNull String signature) {
        name.getClass();
        signature.getClass();
        MatchResult matchResultMatchEntire = f64317b.matchEntire(signature);
        if (matchResultMatchEntire != null) {
            String str = matchResultMatchEntire.mo94253a().getMatch().mo94255c().get(1);
            PropertyDescriptor propertyDescriptorMo88567F = mo88567F(Integer.parseInt(str));
            if (propertyDescriptorMo88567F != null) {
                return propertyDescriptorMo88567F;
            }
            throw new KotlinReflectionInternalError("Local property #" + str + " not found in " + mo88354d());
        }
        Name nameM91970i = Name.m91970i(name);
        nameM91970i.getClass();
        Collection<PropertyDescriptor> collectionMo88568I = mo88568I(nameM91970i);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionMo88568I) {
            if (Intrinsics.m88377d(RuntimeTypeMapper.INSTANCE.m88923f((PropertyDescriptor) obj).getString(), signature)) {
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
        Collection collectionValues = MapsKt.toSortedMap(linkedHashMap, new mxq(lxq.INSTANCE)).values();
        collectionValues.getClass();
        List list = (List) CollectionsKt.last(collectionValues);
        if (list.size() == 1) {
            return (PropertyDescriptor) CollectionsKt.first(list);
        }
        Name nameM91970i2 = Name.m91970i(name);
        nameM91970i2.getClass();
        String strJoinToString$default = CollectionsKt.joinToString$default(mo88568I(nameM91970i2), SignParameters.NEW_LINE, null, null, 0, null, nxq.INSTANCE, 30, null);
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
