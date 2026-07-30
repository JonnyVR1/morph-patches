package kotlin.reflect.jvm.internal.impl.renderer;

import java.lang.reflect.Field;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.rwd;
import p153l.swd;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class DescriptorRendererOptionsImpl implements DescriptorRendererOptions {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f66428Z = {Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withDefinedIn", "getWithDefinedIn()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "modifiers", "getModifiers()Ljava/util/Set;", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "startFromName", "getStartFromName()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "debugMode", "getDebugMode()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "verbose", "getVerbose()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "unitReturnType", "getUnitReturnType()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withoutReturnType", "getWithoutReturnType()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "enhancedTypes", "getEnhancedTypes()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "receiverAfterName", "getReceiverAfterName()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "informativeErrorType", "getInformativeErrorType()Z", 0))};

    /* JADX INFO: renamed from: A */
    @NotNull
    public final ReadWriteProperty f66429A;

    /* JADX INFO: renamed from: B */
    @NotNull
    public final ReadWriteProperty f66430B;

    /* JADX INFO: renamed from: C */
    @NotNull
    public final ReadWriteProperty f66431C;

    /* JADX INFO: renamed from: D */
    @NotNull
    public final ReadWriteProperty f66432D;

    /* JADX INFO: renamed from: E */
    @NotNull
    public final ReadWriteProperty f66433E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public final ReadWriteProperty f66434F;

    /* JADX INFO: renamed from: G */
    @NotNull
    public final ReadWriteProperty f66435G;

    /* JADX INFO: renamed from: H */
    @NotNull
    public final ReadWriteProperty f66436H;

    /* JADX INFO: renamed from: I */
    @NotNull
    public final ReadWriteProperty f66437I;

    /* JADX INFO: renamed from: J */
    @NotNull
    public final ReadWriteProperty f66438J;

    /* JADX INFO: renamed from: K */
    @NotNull
    public final ReadWriteProperty f66439K;

    /* JADX INFO: renamed from: L */
    @NotNull
    public final ReadWriteProperty f66440L;

    /* JADX INFO: renamed from: M */
    @NotNull
    public final ReadWriteProperty f66441M;

    /* JADX INFO: renamed from: N */
    @NotNull
    public final ReadWriteProperty f66442N;

    /* JADX INFO: renamed from: O */
    @NotNull
    public final ReadWriteProperty f66443O;

    /* JADX INFO: renamed from: P */
    @NotNull
    public final ReadWriteProperty f66444P;

    /* JADX INFO: renamed from: Q */
    @NotNull
    public final ReadWriteProperty f66445Q;

    /* JADX INFO: renamed from: R */
    @NotNull
    public final ReadWriteProperty f66446R;

    /* JADX INFO: renamed from: S */
    @NotNull
    public final ReadWriteProperty f66447S;

    /* JADX INFO: renamed from: T */
    @NotNull
    public final ReadWriteProperty f66448T;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final ReadWriteProperty f66449U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final ReadWriteProperty f66450V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final ReadWriteProperty f66451W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final ReadWriteProperty f66452X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final ReadWriteProperty f66453Y;

    /* JADX INFO: renamed from: a */
    public boolean f66454a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ReadWriteProperty f66455b = m92583t0(ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.INSTANCE);

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ReadWriteProperty f66456c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final ReadWriteProperty f66457d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final ReadWriteProperty f66458e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final ReadWriteProperty f66459f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final ReadWriteProperty f66460g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final ReadWriteProperty f66461h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final ReadWriteProperty f66462i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final ReadWriteProperty f66463j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final ReadWriteProperty f66464k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final ReadWriteProperty f66465l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final ReadWriteProperty f66466m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final ReadWriteProperty f66467n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final ReadWriteProperty f66468o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final ReadWriteProperty f66469p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final ReadWriteProperty f66470q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final ReadWriteProperty f66471r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final ReadWriteProperty f66472s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final ReadWriteProperty f66473t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public final ReadWriteProperty f66474u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public final ReadWriteProperty f66475v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public final ReadWriteProperty f66476w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public final ReadWriteProperty f66477x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public final ReadWriteProperty f66478y;

    /* JADX INFO: renamed from: z */
    @NotNull
    public final ReadWriteProperty f66479z;

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.f66456c = m92583t0(bool);
        this.f66457d = m92583t0(bool);
        this.f66458e = m92583t0(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        Boolean bool2 = Boolean.FALSE;
        this.f66459f = m92583t0(bool2);
        this.f66460g = m92583t0(bool2);
        this.f66461h = m92583t0(bool2);
        this.f66462i = m92583t0(bool2);
        this.f66463j = m92583t0(bool2);
        this.f66464k = m92583t0(bool);
        this.f66465l = m92583t0(bool2);
        this.f66466m = m92583t0(bool2);
        this.f66467n = m92583t0(bool2);
        this.f66468o = m92583t0(bool);
        this.f66469p = m92583t0(bool);
        this.f66470q = m92583t0(bool2);
        this.f66471r = m92583t0(bool2);
        this.f66472s = m92583t0(bool2);
        this.f66473t = m92583t0(bool2);
        this.f66474u = m92583t0(bool2);
        this.f66475v = m92583t0(null);
        this.f66476w = m92583t0(bool2);
        this.f66477x = m92583t0(bool2);
        this.f66478y = m92583t0(rwd.INSTANCE);
        this.f66479z = m92583t0(swd.INSTANCE);
        this.f66429A = m92583t0(bool);
        this.f66430B = m92583t0(OverrideRenderingPolicy.RENDER_OPEN);
        this.f66431C = m92583t0(DescriptorRenderer.ValueParametersHandler.DEFAULT.INSTANCE);
        this.f66432D = m92583t0(RenderingFormat.PLAIN);
        this.f66433E = m92583t0(ParameterNameRenderingPolicy.ALL);
        this.f66434F = m92583t0(bool2);
        this.f66435G = m92583t0(bool2);
        this.f66436H = m92583t0(PropertyAccessorRenderingPolicy.DEBUG);
        this.f66437I = m92583t0(bool2);
        this.f66438J = m92583t0(bool2);
        this.f66439K = m92583t0(SetsKt.emptySet());
        this.f66440L = m92583t0(ExcludedTypeAnnotations.INSTANCE.m92589a());
        this.f66441M = m92583t0(null);
        this.f66442N = m92583t0(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS);
        this.f66443O = m92583t0(bool2);
        this.f66444P = m92583t0(bool);
        this.f66445Q = m92583t0(bool);
        this.f66446R = m92583t0(bool2);
        this.f66447S = m92583t0(bool2);
        this.f66448T = m92583t0(bool);
        this.f66449U = m92583t0(bool);
        this.f66450V = m92583t0(bool2);
        this.f66451W = m92583t0(bool2);
        this.f66452X = m92583t0(bool2);
        this.f66453Y = m92583t0(bool);
    }

    /* JADX INFO: renamed from: u0 */
    public static final KotlinType m92536u0(KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType;
    }

    /* JADX INFO: renamed from: v */
    public static final String m92537v(ValueParameterDescriptor valueParameterDescriptor) {
        valueParameterDescriptor.getClass();
        return "...";
    }

    /* JADX INFO: renamed from: A */
    public boolean m92538A() {
        return ((Boolean) this.f66462i.mo1437a(this, f66428Z[7])).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public ClassifierNamePolicy m92539B() {
        return (ClassifierNamePolicy) this.f66455b.mo1437a(this, f66428Z[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: C */
    public Function1<ValueParameterDescriptor, String> m92540C() {
        return (Function1) this.f66479z.mo1437a(this, f66428Z[24]);
    }

    /* JADX INFO: renamed from: D */
    public boolean m92541D() {
        return ((Boolean) this.f66438J.mo1437a(this, f66428Z[34])).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public Set<FqName> m92542E() {
        return (Set) this.f66439K.mo1437a(this, f66428Z[35]);
    }

    /* JADX INFO: renamed from: F */
    public boolean m92543F() {
        return ((Boolean) this.f66448T.mo1437a(this, f66428Z[44])).booleanValue();
    }

    /* JADX INFO: renamed from: G */
    public /* bridge */ boolean m92544G() {
        return DescriptorRendererOptions.DefaultImpls.m92532a(this);
    }

    /* JADX INFO: renamed from: H */
    public /* bridge */ boolean m92545H() {
        return DescriptorRendererOptions.DefaultImpls.m92533b(this);
    }

    /* JADX INFO: renamed from: I */
    public boolean m92546I() {
        return ((Boolean) this.f66474u.mo1437a(this, f66428Z[19])).booleanValue();
    }

    /* JADX INFO: renamed from: J */
    public boolean m92547J() {
        return ((Boolean) this.f66453Y.mo1437a(this, f66428Z[49])).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public Set<DescriptorRendererModifier> m92548K() {
        return (Set) this.f66458e.mo1437a(this, f66428Z[3]);
    }

    /* JADX INFO: renamed from: L */
    public boolean m92549L() {
        return ((Boolean) this.f66467n.mo1437a(this, f66428Z[12])).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public OverrideRenderingPolicy m92550M() {
        return (OverrideRenderingPolicy) this.f66430B.mo1437a(this, f66428Z[26]);
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public ParameterNameRenderingPolicy m92551N() {
        return (ParameterNameRenderingPolicy) this.f66433E.mo1437a(this, f66428Z[29]);
    }

    /* JADX INFO: renamed from: O */
    public boolean m92552O() {
        return ((Boolean) this.f66449U.mo1437a(this, f66428Z[45])).booleanValue();
    }

    /* JADX INFO: renamed from: P */
    public boolean m92553P() {
        return ((Boolean) this.f66451W.mo1437a(this, f66428Z[47])).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public PropertyAccessorRenderingPolicy m92554Q() {
        return (PropertyAccessorRenderingPolicy) this.f66436H.mo1437a(this, f66428Z[32]);
    }

    @Nullable
    /* JADX INFO: renamed from: R */
    public Function1<ConstantValue<?>, String> m92555R() {
        return (Function1) this.f66475v.mo1437a(this, f66428Z[20]);
    }

    /* JADX INFO: renamed from: S */
    public boolean m92556S() {
        return ((Boolean) this.f66434F.mo1437a(this, f66428Z[30])).booleanValue();
    }

    /* JADX INFO: renamed from: T */
    public boolean m92557T() {
        return ((Boolean) this.f66447S.mo1437a(this, f66428Z[43])).booleanValue();
    }

    /* JADX INFO: renamed from: U */
    public boolean m92558U() {
        return ((Boolean) this.f66435G.mo1437a(this, f66428Z[31])).booleanValue();
    }

    /* JADX INFO: renamed from: V */
    public boolean m92559V() {
        return ((Boolean) this.f66470q.mo1437a(this, f66428Z[15])).booleanValue();
    }

    /* JADX INFO: renamed from: W */
    public boolean m92560W() {
        return ((Boolean) this.f66444P.mo1437a(this, f66428Z[40])).booleanValue();
    }

    /* JADX INFO: renamed from: X */
    public boolean m92561X() {
        return ((Boolean) this.f66437I.mo1437a(this, f66428Z[33])).booleanValue();
    }

    /* JADX INFO: renamed from: Y */
    public boolean m92562Y() {
        return ((Boolean) this.f66469p.mo1437a(this, f66428Z[14])).booleanValue();
    }

    /* JADX INFO: renamed from: Z */
    public boolean m92563Z() {
        return ((Boolean) this.f66468o.mo1437a(this, f66428Z[13])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: a */
    public void mo92443a(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        parameterNameRenderingPolicy.getClass();
        this.f66433E.mo88454b(this, f66428Z[29], parameterNameRenderingPolicy);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m92564a0() {
        return ((Boolean) this.f66471r.mo1437a(this, f66428Z[16])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: b */
    public boolean mo92446b() {
        return ((Boolean) this.f66466m.mo1437a(this, f66428Z[11])).booleanValue();
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m92565b0() {
        return ((Boolean) this.f66446R.mo1437a(this, f66428Z[42])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    /* JADX INFO: renamed from: c */
    public Set<FqName> mo92449c() {
        return (Set) this.f66440L.mo1437a(this, f66428Z[36]);
    }

    /* JADX INFO: renamed from: c0 */
    public boolean m92566c0() {
        return ((Boolean) this.f66445Q.mo1437a(this, f66428Z[41])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: d */
    public boolean mo92452d() {
        return ((Boolean) this.f66461h.mo1437a(this, f66428Z[6])).booleanValue();
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m92567d0() {
        return ((Boolean) this.f66429A.mo1437a(this, f66428Z[25])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    /* JADX INFO: renamed from: e */
    public AnnotationArgumentsRenderingPolicy mo92455e() {
        return (AnnotationArgumentsRenderingPolicy) this.f66442N.mo1437a(this, f66428Z[38]);
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m92568e0() {
        return ((Boolean) this.f66460g.mo1437a(this, f66428Z[5])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: f */
    public void mo92458f(@NotNull Set<FqName> set) {
        set.getClass();
        this.f66440L.mo88454b(this, f66428Z[36], set);
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m92569f0() {
        return ((Boolean) this.f66459f.mo1437a(this, f66428Z[4])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: g */
    public void mo92461g(@NotNull Set<? extends DescriptorRendererModifier> set) {
        set.getClass();
        this.f66458e.mo88454b(this, f66428Z[3], set);
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public RenderingFormat m92570g0() {
        return (RenderingFormat) this.f66432D.mo1437a(this, f66428Z[28]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: h */
    public void mo92464h(boolean z) {
        this.f66463j.mo88454b(this, f66428Z[8], Boolean.valueOf(z));
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public Function1<KotlinType, KotlinType> m92571h0() {
        return (Function1) this.f66478y.mo1437a(this, f66428Z[23]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: i */
    public void mo92467i(boolean z) {
        this.f66461h.mo88454b(this, f66428Z[6], Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m92572i0() {
        return ((Boolean) this.f66473t.mo1437a(this, f66428Z[18])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: j */
    public void mo92470j(boolean z) {
        this.f66476w.mo88454b(this, f66428Z[21], Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m92573j0() {
        return ((Boolean) this.f66464k.mo1437a(this, f66428Z[9])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: k */
    public void mo92473k(boolean z) {
        this.f66459f.mo88454b(this, f66428Z[4], Boolean.valueOf(z));
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public DescriptorRenderer.ValueParametersHandler m92574k0() {
        return (DescriptorRenderer.ValueParametersHandler) this.f66431C.mo1437a(this, f66428Z[27]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: l */
    public void mo92476l(boolean z) {
        this.f66456c.mo88454b(this, f66428Z[1], Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m92575l0() {
        return ((Boolean) this.f66463j.mo1437a(this, f66428Z[8])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: m */
    public void mo92479m(boolean z) {
        this.f66477x.mo88454b(this, f66428Z[22], Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m92576m0() {
        return ((Boolean) this.f66456c.mo1437a(this, f66428Z[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: n */
    public void mo92482n(boolean z) {
        this.f66434F.mo88454b(this, f66428Z[30], Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m92577n0() {
        return ((Boolean) this.f66457d.mo1437a(this, f66428Z[2])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: o */
    public void mo92485o(@NotNull RenderingFormat renderingFormat) {
        renderingFormat.getClass();
        this.f66432D.mo88454b(this, f66428Z[28], renderingFormat);
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m92578o0() {
        return ((Boolean) this.f66465l.mo1437a(this, f66428Z[10])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: p */
    public void mo92488p(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        annotationArgumentsRenderingPolicy.getClass();
        this.f66442N.mo88454b(this, f66428Z[38], annotationArgumentsRenderingPolicy);
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m92579p0() {
        return ((Boolean) this.f66477x.mo1437a(this, f66428Z[22])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: q */
    public void mo92491q(@NotNull ClassifierNamePolicy classifierNamePolicy) {
        classifierNamePolicy.getClass();
        this.f66455b.mo88454b(this, f66428Z[0], classifierNamePolicy);
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m92580q0() {
        return ((Boolean) this.f66476w.mo1437a(this, f66428Z[21])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: r */
    public void mo92494r(boolean z) {
        this.f66435G.mo88454b(this, f66428Z[31], Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m92581r0() {
        return this.f66454a;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m92582s0() {
        this.f66454a = true;
    }

    /* JADX INFO: renamed from: t0 */
    public final <T> ReadWriteProperty<DescriptorRendererOptionsImpl, T> m92583t0(final T t) {
        Delegates delegates = Delegates.INSTANCE;
        return new ObservableProperty<T>(t) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1
            @Override // kotlin.properties.ObservableProperty
            /* JADX INFO: renamed from: d */
            public boolean mo88453d(KProperty<?> kProperty, T t2, T t3) {
                kProperty.getClass();
                if (!this.m92581r0()) {
                    return true;
                }
                wtq0.m207906a("Cannot modify readonly DescriptorRendererOptions");
                return false;
            }
        };
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final DescriptorRendererOptionsImpl m92584u() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
        Field[] declaredFields = DescriptorRendererOptionsImpl.class.getDeclaredFields();
        declaredFields.getClass();
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                ObservableProperty observableProperty = obj instanceof ObservableProperty ? (ObservableProperty) obj : null;
                if (observableProperty != null) {
                    String name = field.getName();
                    name.getClass();
                    C15493d.m94374J(name, "is", false, 2, null);
                    KClass kClassM88396b = Reflection.m88396b(DescriptorRendererOptionsImpl.class);
                    String name2 = field.getName();
                    StringBuilder sb = new StringBuilder("get");
                    String name3 = field.getName();
                    name3.getClass();
                    if (name3.length() > 0) {
                        name3 = Character.toUpperCase(name3.charAt(0)) + name3.substring(1);
                    }
                    sb.append(name3);
                    field.set(descriptorRendererOptionsImpl, descriptorRendererOptionsImpl.m92583t0(observableProperty.mo1437a(this, new PropertyReference1Impl(kClassM88396b, name2, sb.toString()))));
                }
            }
        }
        return descriptorRendererOptionsImpl;
    }

    /* JADX INFO: renamed from: w */
    public boolean m92585w() {
        return ((Boolean) this.f66472s.mo1437a(this, f66428Z[17])).booleanValue();
    }

    /* JADX INFO: renamed from: x */
    public boolean m92586x() {
        return ((Boolean) this.f66443O.mo1437a(this, f66428Z[39])).booleanValue();
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    public Function1<AnnotationDescriptor, Boolean> m92587y() {
        return (Function1) this.f66441M.mo1437a(this, f66428Z[37]);
    }

    /* JADX INFO: renamed from: z */
    public boolean m92588z() {
        return ((Boolean) this.f66452X.mo1437a(this, f66428Z[48])).booleanValue();
    }
}
