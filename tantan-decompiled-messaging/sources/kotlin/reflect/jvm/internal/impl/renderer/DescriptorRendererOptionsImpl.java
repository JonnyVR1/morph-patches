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
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.dvd;
import p149l.evd;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class DescriptorRendererOptionsImpl implements DescriptorRendererOptions {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f65754Z = {Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withDefinedIn", "getWithDefinedIn()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "modifiers", "getModifiers()Ljava/util/Set;", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "startFromName", "getStartFromName()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "debugMode", "getDebugMode()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "verbose", "getVerbose()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "unitReturnType", "getUnitReturnType()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withoutReturnType", "getWithoutReturnType()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "enhancedTypes", "getEnhancedTypes()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "receiverAfterName", "getReceiverAfterName()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "informativeErrorType", "getInformativeErrorType()Z", 0))};

    /* JADX INFO: renamed from: A */
    @NotNull
    public final ReadWriteProperty f65755A;

    /* JADX INFO: renamed from: B */
    @NotNull
    public final ReadWriteProperty f65756B;

    /* JADX INFO: renamed from: C */
    @NotNull
    public final ReadWriteProperty f65757C;

    /* JADX INFO: renamed from: D */
    @NotNull
    public final ReadWriteProperty f65758D;

    /* JADX INFO: renamed from: E */
    @NotNull
    public final ReadWriteProperty f65759E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public final ReadWriteProperty f65760F;

    /* JADX INFO: renamed from: G */
    @NotNull
    public final ReadWriteProperty f65761G;

    /* JADX INFO: renamed from: H */
    @NotNull
    public final ReadWriteProperty f65762H;

    /* JADX INFO: renamed from: I */
    @NotNull
    public final ReadWriteProperty f65763I;

    /* JADX INFO: renamed from: J */
    @NotNull
    public final ReadWriteProperty f65764J;

    /* JADX INFO: renamed from: K */
    @NotNull
    public final ReadWriteProperty f65765K;

    /* JADX INFO: renamed from: L */
    @NotNull
    public final ReadWriteProperty f65766L;

    /* JADX INFO: renamed from: M */
    @NotNull
    public final ReadWriteProperty f65767M;

    /* JADX INFO: renamed from: N */
    @NotNull
    public final ReadWriteProperty f65768N;

    /* JADX INFO: renamed from: O */
    @NotNull
    public final ReadWriteProperty f65769O;

    /* JADX INFO: renamed from: P */
    @NotNull
    public final ReadWriteProperty f65770P;

    /* JADX INFO: renamed from: Q */
    @NotNull
    public final ReadWriteProperty f65771Q;

    /* JADX INFO: renamed from: R */
    @NotNull
    public final ReadWriteProperty f65772R;

    /* JADX INFO: renamed from: S */
    @NotNull
    public final ReadWriteProperty f65773S;

    /* JADX INFO: renamed from: T */
    @NotNull
    public final ReadWriteProperty f65774T;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final ReadWriteProperty f65775U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final ReadWriteProperty f65776V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final ReadWriteProperty f65777W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final ReadWriteProperty f65778X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final ReadWriteProperty f65779Y;

    /* JADX INFO: renamed from: a */
    public boolean f65780a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ReadWriteProperty f65781b = m91692t0(ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.INSTANCE);

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ReadWriteProperty f65782c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final ReadWriteProperty f65783d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final ReadWriteProperty f65784e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final ReadWriteProperty f65785f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final ReadWriteProperty f65786g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final ReadWriteProperty f65787h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final ReadWriteProperty f65788i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final ReadWriteProperty f65789j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final ReadWriteProperty f65790k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final ReadWriteProperty f65791l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final ReadWriteProperty f65792m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final ReadWriteProperty f65793n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final ReadWriteProperty f65794o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final ReadWriteProperty f65795p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final ReadWriteProperty f65796q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final ReadWriteProperty f65797r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final ReadWriteProperty f65798s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final ReadWriteProperty f65799t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public final ReadWriteProperty f65800u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public final ReadWriteProperty f65801v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public final ReadWriteProperty f65802w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public final ReadWriteProperty f65803x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public final ReadWriteProperty f65804y;

    /* JADX INFO: renamed from: z */
    @NotNull
    public final ReadWriteProperty f65805z;

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.f65782c = m91692t0(bool);
        this.f65783d = m91692t0(bool);
        this.f65784e = m91692t0(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        Boolean bool2 = Boolean.FALSE;
        this.f65785f = m91692t0(bool2);
        this.f65786g = m91692t0(bool2);
        this.f65787h = m91692t0(bool2);
        this.f65788i = m91692t0(bool2);
        this.f65789j = m91692t0(bool2);
        this.f65790k = m91692t0(bool);
        this.f65791l = m91692t0(bool2);
        this.f65792m = m91692t0(bool2);
        this.f65793n = m91692t0(bool2);
        this.f65794o = m91692t0(bool);
        this.f65795p = m91692t0(bool);
        this.f65796q = m91692t0(bool2);
        this.f65797r = m91692t0(bool2);
        this.f65798s = m91692t0(bool2);
        this.f65799t = m91692t0(bool2);
        this.f65800u = m91692t0(bool2);
        this.f65801v = m91692t0(null);
        this.f65802w = m91692t0(bool2);
        this.f65803x = m91692t0(bool2);
        this.f65804y = m91692t0(dvd.INSTANCE);
        this.f65805z = m91692t0(evd.INSTANCE);
        this.f65755A = m91692t0(bool);
        this.f65756B = m91692t0(OverrideRenderingPolicy.RENDER_OPEN);
        this.f65757C = m91692t0(DescriptorRenderer.ValueParametersHandler.DEFAULT.INSTANCE);
        this.f65758D = m91692t0(RenderingFormat.PLAIN);
        this.f65759E = m91692t0(ParameterNameRenderingPolicy.ALL);
        this.f65760F = m91692t0(bool2);
        this.f65761G = m91692t0(bool2);
        this.f65762H = m91692t0(PropertyAccessorRenderingPolicy.DEBUG);
        this.f65763I = m91692t0(bool2);
        this.f65764J = m91692t0(bool2);
        this.f65765K = m91692t0(SetsKt.emptySet());
        this.f65766L = m91692t0(ExcludedTypeAnnotations.INSTANCE.m91698a());
        this.f65767M = m91692t0(null);
        this.f65768N = m91692t0(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS);
        this.f65769O = m91692t0(bool2);
        this.f65770P = m91692t0(bool);
        this.f65771Q = m91692t0(bool);
        this.f65772R = m91692t0(bool2);
        this.f65773S = m91692t0(bool2);
        this.f65774T = m91692t0(bool);
        this.f65775U = m91692t0(bool);
        this.f65776V = m91692t0(bool2);
        this.f65777W = m91692t0(bool2);
        this.f65778X = m91692t0(bool2);
        this.f65779Y = m91692t0(bool);
    }

    /* JADX INFO: renamed from: u0 */
    public static final KotlinType m91645u0(KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType;
    }

    /* JADX INFO: renamed from: v */
    public static final String m91646v(ValueParameterDescriptor valueParameterDescriptor) {
        valueParameterDescriptor.getClass();
        return "...";
    }

    /* JADX INFO: renamed from: A */
    public boolean m91647A() {
        return ((Boolean) this.f65788i.mo1436a(this, f65754Z[7])).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public ClassifierNamePolicy m91648B() {
        return (ClassifierNamePolicy) this.f65781b.mo1436a(this, f65754Z[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: C */
    public Function1<ValueParameterDescriptor, String> m91649C() {
        return (Function1) this.f65805z.mo1436a(this, f65754Z[24]);
    }

    /* JADX INFO: renamed from: D */
    public boolean m91650D() {
        return ((Boolean) this.f65764J.mo1436a(this, f65754Z[34])).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public Set<FqName> m91651E() {
        return (Set) this.f65765K.mo1436a(this, f65754Z[35]);
    }

    /* JADX INFO: renamed from: F */
    public boolean m91652F() {
        return ((Boolean) this.f65774T.mo1436a(this, f65754Z[44])).booleanValue();
    }

    /* JADX INFO: renamed from: G */
    public /* bridge */ boolean m91653G() {
        return DescriptorRendererOptions.DefaultImpls.m91641a(this);
    }

    /* JADX INFO: renamed from: H */
    public /* bridge */ boolean m91654H() {
        return DescriptorRendererOptions.DefaultImpls.m91642b(this);
    }

    /* JADX INFO: renamed from: I */
    public boolean m91655I() {
        return ((Boolean) this.f65800u.mo1436a(this, f65754Z[19])).booleanValue();
    }

    /* JADX INFO: renamed from: J */
    public boolean m91656J() {
        return ((Boolean) this.f65779Y.mo1436a(this, f65754Z[49])).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public Set<DescriptorRendererModifier> m91657K() {
        return (Set) this.f65784e.mo1436a(this, f65754Z[3]);
    }

    /* JADX INFO: renamed from: L */
    public boolean m91658L() {
        return ((Boolean) this.f65793n.mo1436a(this, f65754Z[12])).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public OverrideRenderingPolicy m91659M() {
        return (OverrideRenderingPolicy) this.f65756B.mo1436a(this, f65754Z[26]);
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public ParameterNameRenderingPolicy m91660N() {
        return (ParameterNameRenderingPolicy) this.f65759E.mo1436a(this, f65754Z[29]);
    }

    /* JADX INFO: renamed from: O */
    public boolean m91661O() {
        return ((Boolean) this.f65775U.mo1436a(this, f65754Z[45])).booleanValue();
    }

    /* JADX INFO: renamed from: P */
    public boolean m91662P() {
        return ((Boolean) this.f65777W.mo1436a(this, f65754Z[47])).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public PropertyAccessorRenderingPolicy m91663Q() {
        return (PropertyAccessorRenderingPolicy) this.f65762H.mo1436a(this, f65754Z[32]);
    }

    @Nullable
    /* JADX INFO: renamed from: R */
    public Function1<ConstantValue<?>, String> m91664R() {
        return (Function1) this.f65801v.mo1436a(this, f65754Z[20]);
    }

    /* JADX INFO: renamed from: S */
    public boolean m91665S() {
        return ((Boolean) this.f65760F.mo1436a(this, f65754Z[30])).booleanValue();
    }

    /* JADX INFO: renamed from: T */
    public boolean m91666T() {
        return ((Boolean) this.f65773S.mo1436a(this, f65754Z[43])).booleanValue();
    }

    /* JADX INFO: renamed from: U */
    public boolean m91667U() {
        return ((Boolean) this.f65761G.mo1436a(this, f65754Z[31])).booleanValue();
    }

    /* JADX INFO: renamed from: V */
    public boolean m91668V() {
        return ((Boolean) this.f65796q.mo1436a(this, f65754Z[15])).booleanValue();
    }

    /* JADX INFO: renamed from: W */
    public boolean m91669W() {
        return ((Boolean) this.f65770P.mo1436a(this, f65754Z[40])).booleanValue();
    }

    /* JADX INFO: renamed from: X */
    public boolean m91670X() {
        return ((Boolean) this.f65763I.mo1436a(this, f65754Z[33])).booleanValue();
    }

    /* JADX INFO: renamed from: Y */
    public boolean m91671Y() {
        return ((Boolean) this.f65795p.mo1436a(this, f65754Z[14])).booleanValue();
    }

    /* JADX INFO: renamed from: Z */
    public boolean m91672Z() {
        return ((Boolean) this.f65794o.mo1436a(this, f65754Z[13])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: a */
    public void mo91552a(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        parameterNameRenderingPolicy.getClass();
        this.f65759E.mo87564b(this, f65754Z[29], parameterNameRenderingPolicy);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m91673a0() {
        return ((Boolean) this.f65797r.mo1436a(this, f65754Z[16])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: b */
    public boolean mo91555b() {
        return ((Boolean) this.f65792m.mo1436a(this, f65754Z[11])).booleanValue();
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m91674b0() {
        return ((Boolean) this.f65772R.mo1436a(this, f65754Z[42])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    /* JADX INFO: renamed from: c */
    public Set<FqName> mo91558c() {
        return (Set) this.f65766L.mo1436a(this, f65754Z[36]);
    }

    /* JADX INFO: renamed from: c0 */
    public boolean m91675c0() {
        return ((Boolean) this.f65771Q.mo1436a(this, f65754Z[41])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: d */
    public boolean mo91561d() {
        return ((Boolean) this.f65787h.mo1436a(this, f65754Z[6])).booleanValue();
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m91676d0() {
        return ((Boolean) this.f65755A.mo1436a(this, f65754Z[25])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    /* JADX INFO: renamed from: e */
    public AnnotationArgumentsRenderingPolicy mo91564e() {
        return (AnnotationArgumentsRenderingPolicy) this.f65768N.mo1436a(this, f65754Z[38]);
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m91677e0() {
        return ((Boolean) this.f65786g.mo1436a(this, f65754Z[5])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: f */
    public void mo91567f(@NotNull Set<FqName> set) {
        set.getClass();
        this.f65766L.mo87564b(this, f65754Z[36], set);
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m91678f0() {
        return ((Boolean) this.f65785f.mo1436a(this, f65754Z[4])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: g */
    public void mo91570g(@NotNull Set<? extends DescriptorRendererModifier> set) {
        set.getClass();
        this.f65784e.mo87564b(this, f65754Z[3], set);
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public RenderingFormat m91679g0() {
        return (RenderingFormat) this.f65758D.mo1436a(this, f65754Z[28]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: h */
    public void mo91573h(boolean z) {
        this.f65789j.mo87564b(this, f65754Z[8], Boolean.valueOf(z));
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public Function1<KotlinType, KotlinType> m91680h0() {
        return (Function1) this.f65804y.mo1436a(this, f65754Z[23]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: i */
    public void mo91576i(boolean z) {
        this.f65787h.mo87564b(this, f65754Z[6], Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m91681i0() {
        return ((Boolean) this.f65799t.mo1436a(this, f65754Z[18])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: j */
    public void mo91579j(boolean z) {
        this.f65802w.mo87564b(this, f65754Z[21], Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m91682j0() {
        return ((Boolean) this.f65790k.mo1436a(this, f65754Z[9])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: k */
    public void mo91582k(boolean z) {
        this.f65785f.mo87564b(this, f65754Z[4], Boolean.valueOf(z));
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public DescriptorRenderer.ValueParametersHandler m91683k0() {
        return (DescriptorRenderer.ValueParametersHandler) this.f65757C.mo1436a(this, f65754Z[27]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: l */
    public void mo91585l(boolean z) {
        this.f65782c.mo87564b(this, f65754Z[1], Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m91684l0() {
        return ((Boolean) this.f65789j.mo1436a(this, f65754Z[8])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: m */
    public void mo91588m(boolean z) {
        this.f65803x.mo87564b(this, f65754Z[22], Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m91685m0() {
        return ((Boolean) this.f65782c.mo1436a(this, f65754Z[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: n */
    public void mo91591n(boolean z) {
        this.f65760F.mo87564b(this, f65754Z[30], Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m91686n0() {
        return ((Boolean) this.f65783d.mo1436a(this, f65754Z[2])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: o */
    public void mo91594o(@NotNull RenderingFormat renderingFormat) {
        renderingFormat.getClass();
        this.f65758D.mo87564b(this, f65754Z[28], renderingFormat);
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m91687o0() {
        return ((Boolean) this.f65791l.mo1436a(this, f65754Z[10])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: p */
    public void mo91597p(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        annotationArgumentsRenderingPolicy.getClass();
        this.f65768N.mo87564b(this, f65754Z[38], annotationArgumentsRenderingPolicy);
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m91688p0() {
        return ((Boolean) this.f65803x.mo1436a(this, f65754Z[22])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: q */
    public void mo91600q(@NotNull ClassifierNamePolicy classifierNamePolicy) {
        classifierNamePolicy.getClass();
        this.f65781b.mo87564b(this, f65754Z[0], classifierNamePolicy);
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m91689q0() {
        return ((Boolean) this.f65802w.mo1436a(this, f65754Z[21])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: r */
    public void mo91603r(boolean z) {
        this.f65761G.mo87564b(this, f65754Z[31], Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m91690r0() {
        return this.f65780a;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m91691s0() {
        this.f65780a = true;
    }

    /* JADX INFO: renamed from: t0 */
    public final <T> ReadWriteProperty<DescriptorRendererOptionsImpl, T> m91692t0(final T t) {
        Delegates delegates = Delegates.INSTANCE;
        return new ObservableProperty<T>(t) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1
            @Override // kotlin.properties.ObservableProperty
            /* JADX INFO: renamed from: d */
            public boolean mo87563d(KProperty<?> kProperty, T t2, T t3) {
                kProperty.getClass();
                if (!this.m91690r0()) {
                    return true;
                }
                qkq0.m175383a("Cannot modify readonly DescriptorRendererOptions");
                return false;
            }
        };
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final DescriptorRendererOptionsImpl m91693u() {
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
                    C15386d.m93483J(name, "is", false, 2, null);
                    KClass kClassM87507b = Reflection.m87507b(DescriptorRendererOptionsImpl.class);
                    String name2 = field.getName();
                    StringBuilder sb = new StringBuilder("get");
                    String name3 = field.getName();
                    name3.getClass();
                    if (name3.length() > 0) {
                        name3 = Character.toUpperCase(name3.charAt(0)) + name3.substring(1);
                    }
                    sb.append(name3);
                    field.set(descriptorRendererOptionsImpl, descriptorRendererOptionsImpl.m91692t0(observableProperty.mo1436a(this, new PropertyReference1Impl(kClassM87507b, name2, sb.toString()))));
                }
            }
        }
        return descriptorRendererOptionsImpl;
    }

    /* JADX INFO: renamed from: w */
    public boolean m91694w() {
        return ((Boolean) this.f65798s.mo1436a(this, f65754Z[17])).booleanValue();
    }

    /* JADX INFO: renamed from: x */
    public boolean m91695x() {
        return ((Boolean) this.f65769O.mo1436a(this, f65754Z[39])).booleanValue();
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    public Function1<AnnotationDescriptor, Boolean> m91696y() {
        return (Function1) this.f65767M.mo1436a(this, f65754Z[37]);
    }

    /* JADX INFO: renamed from: z */
    public boolean m91697z() {
        return ((Boolean) this.f65778X.mo1436a(this, f65754Z[48])).booleanValue();
    }
}
