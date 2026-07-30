package kotlin.reflect.jvm.internal.impl.renderer;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbbreviatedType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.WrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.C15386d;
import kotlin.text.C15390h;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.avd;
import p149l.bvd;
import p149l.cvd;
import p149l.l9r;
import p149l.vud;
import p149l.wud;
import p149l.xdc0;
import p149l.xud;
import p149l.yud;
import p149l.zud;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {

    /* JADX INFO: renamed from: l */
    @NotNull
    public final DescriptorRendererOptionsImpl f65748l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Lazy f65749m;

    public final class RenderDeclarationDescriptorVisitor implements DeclarationDescriptorVisitor<Unit, StringBuilder> {

        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f65751a;

            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                try {
                    iArr[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f65751a = iArr;
            }
        }

        public RenderDeclarationDescriptorVisitor() {
        }

        /* JADX INFO: renamed from: A */
        public void m91627A(@NotNull ValueParameterDescriptor valueParameterDescriptor, @NotNull StringBuilder sb) {
            valueParameterDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m91514I2(valueParameterDescriptor, true, sb, true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ Unit mo88465a(ClassDescriptor classDescriptor, StringBuilder sb) {
            m91628n(classDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ Unit mo88466b(PackageViewDescriptor packageViewDescriptor, StringBuilder sb) {
            m91633s(packageViewDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: c */
        public /* bridge */ /* synthetic */ Unit mo87670c(PropertyDescriptor propertyDescriptor, StringBuilder sb) {
            m91635u(propertyDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: d */
        public /* bridge */ /* synthetic */ Unit mo88467d(PropertySetterDescriptor propertySetterDescriptor, StringBuilder sb) {
            m91637w(propertySetterDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ Unit mo88468e(ValueParameterDescriptor valueParameterDescriptor, StringBuilder sb) {
            m91627A(valueParameterDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: f */
        public /* bridge */ /* synthetic */ Unit mo87843f(ConstructorDescriptor constructorDescriptor, StringBuilder sb) {
            m91629o(constructorDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: g */
        public /* bridge */ /* synthetic */ Unit mo88469g(ReceiverParameterDescriptor receiverParameterDescriptor, StringBuilder sb) {
            m91638x(receiverParameterDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: h */
        public /* bridge */ /* synthetic */ Unit mo88470h(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb) {
            m91640z(typeParameterDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: i */
        public /* bridge */ /* synthetic */ Unit mo88471i(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb) {
            m91639y(typeAliasDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: j */
        public /* bridge */ /* synthetic */ Unit mo88472j(PropertyGetterDescriptor propertyGetterDescriptor, StringBuilder sb) {
            m91636v(propertyGetterDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: k */
        public /* bridge */ /* synthetic */ Unit mo88473k(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb) {
            m91632r(packageFragmentDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: l */
        public /* bridge */ /* synthetic */ Unit mo87671l(FunctionDescriptor functionDescriptor, StringBuilder sb) {
            m91630p(functionDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Unit mo88474m(ModuleDescriptor moduleDescriptor, StringBuilder sb) {
            m91631q(moduleDescriptor, sb);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: n */
        public void m91628n(@NotNull ClassDescriptor classDescriptor, @NotNull StringBuilder sb) {
            classDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m91511H1(classDescriptor, sb);
        }

        /* JADX INFO: renamed from: o */
        public void m91629o(@NotNull ConstructorDescriptor constructorDescriptor, @NotNull StringBuilder sb) {
            constructorDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m91525M1(constructorDescriptor, sb);
        }

        /* JADX INFO: renamed from: p */
        public void m91630p(@NotNull FunctionDescriptor functionDescriptor, @NotNull StringBuilder sb) {
            functionDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m91545W1(functionDescriptor, sb);
        }

        /* JADX INFO: renamed from: q */
        public void m91631q(@NotNull ModuleDescriptor moduleDescriptor, @NotNull StringBuilder sb) {
            moduleDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m91572g2(moduleDescriptor, sb, true);
        }

        /* JADX INFO: renamed from: r */
        public void m91632r(@NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull StringBuilder sb) {
            packageFragmentDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m91584k2(packageFragmentDescriptor, sb);
        }

        /* JADX INFO: renamed from: s */
        public void m91633s(@NotNull PackageViewDescriptor packageViewDescriptor, @NotNull StringBuilder sb) {
            packageViewDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m91590m2(packageViewDescriptor, sb);
        }

        /* JADX INFO: renamed from: t */
        public final void m91634t(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb, String str) {
            int i = WhenMappings.f65751a[DescriptorRendererImpl.this.m91540U0().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    m91630p(propertyAccessorDescriptor, sb);
                    return;
                } else {
                    if (i == 3) {
                        return;
                    }
                    l9r.m149037a();
                    return;
                }
            }
            DescriptorRendererImpl.this.m91495B1(propertyAccessorDescriptor, sb);
            sb.append(str + " for ");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            PropertyDescriptor propertyDescriptorMo88582d0 = propertyAccessorDescriptor.mo88582d0();
            propertyDescriptorMo88582d0.getClass();
            descriptorRendererImpl.m91596o2(propertyDescriptorMo88582d0, sb);
        }

        /* JADX INFO: renamed from: u */
        public void m91635u(@NotNull PropertyDescriptor propertyDescriptor, @NotNull StringBuilder sb) {
            propertyDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m91596o2(propertyDescriptor, sb);
        }

        /* JADX INFO: renamed from: v */
        public void m91636v(@NotNull PropertyGetterDescriptor propertyGetterDescriptor, @NotNull StringBuilder sb) {
            propertyGetterDescriptor.getClass();
            sb.getClass();
            m91634t(propertyGetterDescriptor, sb, "getter");
        }

        /* JADX INFO: renamed from: w */
        public void m91637w(@NotNull PropertySetterDescriptor propertySetterDescriptor, @NotNull StringBuilder sb) {
            propertySetterDescriptor.getClass();
            sb.getClass();
            m91634t(propertySetterDescriptor, sb, "setter");
        }

        /* JADX INFO: renamed from: x */
        public void m91638x(@NotNull ReceiverParameterDescriptor receiverParameterDescriptor, @NotNull StringBuilder sb) {
            receiverParameterDescriptor.getClass();
            sb.getClass();
            sb.append(receiverParameterDescriptor.getName());
        }

        /* JADX INFO: renamed from: y */
        public void m91639y(@NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull StringBuilder sb) {
            typeAliasDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m91620x2(typeAliasDescriptor, sb);
        }

        /* JADX INFO: renamed from: z */
        public void m91640z(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull StringBuilder sb) {
            typeParameterDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m91501D2(typeParameterDescriptor, sb, true);
        }
    }

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65752a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f65753b;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            try {
                iArr[RenderingFormat.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderingFormat.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f65752a = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            try {
                iArr2[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f65753b = iArr2;
        }
    }

    public DescriptorRendererImpl(@NotNull DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        descriptorRendererOptionsImpl.getClass();
        this.f65748l = descriptorRendererOptionsImpl;
        descriptorRendererOptionsImpl.m91690r0();
        this.f65749m = LazyKt__LazyJVMKt.m87229b(new vud(this));
    }

    /* JADX INFO: renamed from: A2 */
    public static final Object m91461A2(KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType instanceof StubTypeForBuilderInference ? ((StubTypeForBuilderInference) kotlinType).m92502P0() : kotlinType;
    }

    /* JADX INFO: renamed from: C2 */
    public static /* synthetic */ void m91462C2(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb, KotlinType kotlinType, TypeConstructor typeConstructor, int i, Object obj) {
        if ((i & 2) != 0) {
            typeConstructor = kotlinType.mo91890G0();
        }
        descriptorRendererImpl.m91496B2(sb, kotlinType, typeConstructor);
    }

    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m91463F1(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget, int i, Object obj) {
        if ((i & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        descriptorRendererImpl.m91503E1(sb, annotated, annotationUseSiteTarget);
    }

    /* JADX INFO: renamed from: H2 */
    public static /* synthetic */ void m91464H2(DescriptorRendererImpl descriptorRendererImpl, VariableDescriptor variableDescriptor, StringBuilder sb, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        descriptorRendererImpl.m91509G2(variableDescriptor, sb, z);
    }

    /* JADX INFO: renamed from: N1 */
    public static final CharSequence m91465N1(ValueParameterDescriptor valueParameterDescriptor) {
        return "";
    }

    /* JADX INFO: renamed from: S1 */
    public static final String m91466S1(DescriptorRendererImpl descriptorRendererImpl, KotlinBuiltIns kotlinBuiltIns) {
        ClassifierNamePolicy classifierNamePolicyM91499D0 = descriptorRendererImpl.m91499D0();
        ClassDescriptor classDescriptorM88247x = kotlinBuiltIns.m88247x();
        classDescriptorM88247x.getClass();
        return StringsKt.m93425V0(classifierNamePolicyM91499D0.mo91421a(classDescriptorM88247x, descriptorRendererImpl), "Collection", null, 2, null);
    }

    /* JADX INFO: renamed from: T1 */
    public static final String m91467T1(DescriptorRendererImpl descriptorRendererImpl, KotlinBuiltIns kotlinBuiltIns) {
        ClassifierNamePolicy classifierNamePolicyM91499D0 = descriptorRendererImpl.m91499D0();
        ClassDescriptor classDescriptorM88233j = kotlinBuiltIns.m88233j();
        classDescriptorM88233j.getClass();
        return StringsKt.m93425V0(classifierNamePolicyM91499D0.mo91421a(classDescriptorM88233j, descriptorRendererImpl), "Array", null, 2, null);
    }

    /* JADX INFO: renamed from: t0 */
    public static final CharSequence m91488t0(DescriptorRendererImpl descriptorRendererImpl, TypeProjection typeProjection) {
        typeProjection.getClass();
        if (typeProjection.mo92666b()) {
            return "*";
        }
        KotlinType type = typeProjection.getType();
        type.getClass();
        String strMo91452U = descriptorRendererImpl.mo91452U(type);
        if (typeProjection.mo92667c() == Variance.INVARIANT) {
            return strMo91452U;
        }
        return typeProjection.mo92667c() + ' ' + strMo91452U;
    }

    /* JADX INFO: renamed from: v2 */
    public static final CharSequence m91489v2(DescriptorRendererImpl descriptorRendererImpl, KotlinType kotlinType) {
        kotlinType.getClass();
        return descriptorRendererImpl.mo91452U(kotlinType);
    }

    /* JADX INFO: renamed from: w0 */
    public static final DescriptorRendererImpl m91490w0(DescriptorRendererImpl descriptorRendererImpl) {
        DescriptorRenderer descriptorRendererM91454W = descriptorRendererImpl.m91454W(cvd.INSTANCE);
        descriptorRendererM91454W.getClass();
        return (DescriptorRendererImpl) descriptorRendererM91454W;
    }

    /* JADX INFO: renamed from: x0 */
    public static final Unit m91491x0(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo91567f(SetsKt.plus((Set) descriptorRendererOptions.mo91558c(), (Iterable) CollectionsKt.listOf((Object[]) new FqName[]{StandardNames.FqNames.f63837B, StandardNames.FqNames.f63839C})));
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: A0 */
    public Function1<AnnotationDescriptor, Boolean> m91492A0() {
        return this.f65748l.m91696y();
    }

    /* JADX INFO: renamed from: A1 */
    public final void m91493A1(StringBuilder sb, AbbreviatedType abbreviatedType) {
        RenderingFormat renderingFormatM91580j1 = m91580j1();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (renderingFormatM91580j1 == renderingFormat) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* ");
        sb.append("from: ");
        m91578i2(sb, abbreviatedType.m92487S0());
        sb.append(" */");
        if (m91580j1() == renderingFormat) {
            sb.append("</i></font>");
        }
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m91494B0() {
        return this.f65748l.m91697z();
    }

    /* JADX INFO: renamed from: B1 */
    public final void m91495B1(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb) {
        m91557b2(propertyAccessorDescriptor, sb);
    }

    /* JADX INFO: renamed from: B2 */
    public final void m91496B2(StringBuilder sb, KotlinType kotlinType, TypeConstructor typeConstructor) {
        PossiblyInnerType possiblyInnerTypeM88606d = TypeParameterUtilsKt.m88606d(kotlinType);
        if (possiblyInnerTypeM88606d != null) {
            m91593n2(sb, possiblyInnerTypeM88606d);
        } else {
            sb.append(m91626z2(typeConstructor));
            sb.append(m91623y2(kotlinType.mo91888E0()));
        }
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m91497C0() {
        return this.f65748l.m91647A();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX INFO: renamed from: C1 */
    public final void m91498C1(FunctionDescriptor functionDescriptor, StringBuilder sb) {
        boolean z;
        boolean z2 = false;
        if (functionDescriptor.isOperator()) {
            Collection<? extends FunctionDescriptor> collectionMo88447e = functionDescriptor.mo88447e();
            collectionMo88447e.getClass();
            Collection<? extends FunctionDescriptor> collection = collectionMo88447e;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((FunctionDescriptor) it.next()).isOperator()) {
                            if (!m91624z0()) {
                                z = false;
                            }
                        }
                    }
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (functionDescriptor.isInfix()) {
            Collection<? extends FunctionDescriptor> collectionMo88447e2 = functionDescriptor.mo88447e();
            collectionMo88447e2.getClass();
            Collection<? extends FunctionDescriptor> collection2 = collectionMo88447e2;
            if (collection2.isEmpty()) {
                z2 = true;
            } else {
                Iterator<T> it2 = collection2.iterator();
                while (it2.hasNext()) {
                    if (((FunctionDescriptor) it2.next()).isInfix()) {
                        if (m91624z0()) {
                            break;
                        }
                    }
                }
                z2 = true;
            }
        }
        m91569f2(sb, functionDescriptor.mo88324u(), "tailrec");
        m91618w2(functionDescriptor, sb);
        m91569f2(sb, functionDescriptor.isInline(), "inline");
        m91569f2(sb, z2, "infix");
        m91569f2(sb, z, "operator");
    }

    @NotNull
    /* JADX INFO: renamed from: D0 */
    public ClassifierNamePolicy m91499D0() {
        return this.f65748l.m91648B();
    }

    /* JADX INFO: renamed from: D1 */
    public final List<String> m91500D1(AnnotationDescriptor annotationDescriptor) {
        ClassConstructorDescriptor classConstructorDescriptorMo88313v;
        List<ValueParameterDescriptor> listMo88448g;
        Map<Name, ConstantValue<?>> mapMo88630a = annotationDescriptor.mo88630a();
        List listEmptyList = null;
        ClassDescriptor classDescriptorM91979l = m91553a1() ? DescriptorUtilsKt.m91979l(annotationDescriptor) : null;
        if (classDescriptorM91979l != null && (classConstructorDescriptorMo88313v = classDescriptorM91979l.mo88313v()) != null && (listMo88448g = classConstructorDescriptorMo88313v.mo88448g()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listMo88448g) {
                if (((ValueParameterDescriptor) obj).mo88615M()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ValueParameterDescriptor) it.next()).getName());
            }
            listEmptyList = arrayList2;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listEmptyList) {
            if (!mapMo88630a.containsKey((Name) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Name) it2.next()).m91082b() + " = ...");
        }
        Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = mapMo88630a.entrySet();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
        Iterator<T> it3 = setEntrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            Name name = (Name) entry.getKey();
            ConstantValue<?> constantValue = (ConstantValue) entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(name.m91082b());
            sb.append(" = ");
            sb.append(!listEmptyList.contains(name) ? m91522L1(constantValue) : "...");
            arrayList5.add(sb.toString());
        }
        return CollectionsKt.sorted(CollectionsKt.plus((Collection) arrayList4, (Iterable) arrayList5));
    }

    /* JADX INFO: renamed from: D2 */
    public final void m91501D2(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(m91622y1());
        }
        if (m91595o1()) {
            sb.append("/*");
            sb.append(typeParameterDescriptor.getIndex());
            sb.append("*/ ");
        }
        m91569f2(sb, typeParameterDescriptor.mo88602s(), "reified");
        String label = typeParameterDescriptor.mo88601h().getLabel();
        boolean z2 = true;
        m91569f2(sb, label.length() > 0, label);
        m91463F1(this, sb, typeParameterDescriptor, null, 2, null);
        m91572g2(typeParameterDescriptor, sb, z);
        int size = typeParameterDescriptor.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            KotlinType next = typeParameterDescriptor.getUpperBounds().iterator().next();
            if (!KotlinBuiltIns.m88189k0(next)) {
                sb.append(" : ");
                next.getClass();
                sb.append(mo91452U(next));
            }
        } else if (z) {
            for (KotlinType kotlinType : typeParameterDescriptor.getUpperBounds()) {
                if (!KotlinBuiltIns.m88189k0(kotlinType)) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    kotlinType.getClass();
                    sb.append(mo91452U(kotlinType));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(m91613u1());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: E0 */
    public Function1<ValueParameterDescriptor, String> m91502E0() {
        return this.f65748l.m91649C();
    }

    /* JADX INFO: renamed from: E1 */
    public final void m91503E1(StringBuilder sb, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (m91527N0().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            Set<FqName> setMo91558c = annotated instanceof KotlinType ? mo91558c() : m91507G0();
            Function1<AnnotationDescriptor, Boolean> function1M91492A0 = m91492A0();
            for (AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
                if (!CollectionsKt.contains(setMo91558c, annotationDescriptor.mo88631d()) && !m91619x1(annotationDescriptor) && (function1M91492A0 == null || function1M91492A0.invoke(annotationDescriptor).booleanValue())) {
                    sb.append(mo91448P(annotationDescriptor, annotationUseSiteTarget));
                    if (m91505F0()) {
                        sb.append('\n');
                    } else {
                        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: E2 */
    public final void m91504E2(StringBuilder sb, List<? extends TypeParameterDescriptor> list) {
        Iterator<? extends TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            m91501D2(it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m91505F0() {
        return this.f65748l.m91650D();
    }

    /* JADX INFO: renamed from: F2 */
    public final void m91506F2(List<? extends TypeParameterDescriptor> list, StringBuilder sb, boolean z) {
        if (m91610t1() || list.isEmpty()) {
            return;
        }
        sb.append(m91622y1());
        m91504E2(sb, list);
        sb.append(m91613u1());
        if (z) {
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: G0 */
    public Set<FqName> m91507G0() {
        return this.f65748l.m91651E();
    }

    /* JADX INFO: renamed from: G1 */
    public final void m91508G1(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, StringBuilder sb) {
        List<TypeParameterDescriptor> listMo88309p = classifierDescriptorWithTypeParameters.mo88309p();
        listMo88309p.getClass();
        List<TypeParameterDescriptor> parameters = classifierDescriptorWithTypeParameters.mo88305l().getParameters();
        parameters.getClass();
        if (m91595o1() && classifierDescriptorWithTypeParameters.mo88312t() && parameters.size() > listMo88309p.size()) {
            sb.append(" /*captured type parameters: ");
            m91504E2(sb, parameters.subList(listMo88309p.size(), parameters.size()));
            sb.append("*/");
        }
    }

    /* JADX INFO: renamed from: G2 */
    public final void m91509G2(VariableDescriptor variableDescriptor, StringBuilder sb, boolean z) {
        if (z || !(variableDescriptor instanceof ValueParameterDescriptor)) {
            sb.append(m91551Z1(variableDescriptor.mo88620y() ? "var" : "val"));
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final DescriptorRendererImpl m91510H0() {
        return (DescriptorRendererImpl) this.f65749m.getValue();
    }

    /* JADX INFO: renamed from: H1 */
    public final void m91511H1(ClassDescriptor classDescriptor, StringBuilder sb) {
        ClassConstructorDescriptor classConstructorDescriptorMo88313v;
        boolean z = classDescriptor.getKind() == ClassKind.ENUM_ENTRY;
        if (!m91577i1()) {
            List<ReceiverParameterDescriptor> listMo88457f0 = classDescriptor.mo88457f0();
            listMo88457f0.getClass();
            m91530O1(listMo88457f0, sb);
            m91463F1(this, sb, classDescriptor, null, 2, null);
            if (!z) {
                DescriptorVisibility visibility = classDescriptor.getVisibility();
                visibility.getClass();
                m91523L2(visibility, sb);
            }
            if ((classDescriptor.getKind() != ClassKind.INTERFACE || classDescriptor.mo88303i() != Modality.ABSTRACT) && (!classDescriptor.getKind().isSingleton() || classDescriptor.mo88303i() != Modality.FINAL)) {
                Modality modalityMo88303i = classDescriptor.mo88303i();
                modalityMo88303i.getClass();
                m91563d2(modalityMo88303i, sb, m91617w1(classDescriptor));
            }
            m91557b2(classDescriptor, sb);
            m91569f2(sb, m91527N0().contains(DescriptorRendererModifier.INNER) && classDescriptor.mo88312t(), "inner");
            m91569f2(sb, m91527N0().contains(DescriptorRendererModifier.DATA) && classDescriptor.mo88290C0(), "data");
            m91569f2(sb, m91527N0().contains(DescriptorRendererModifier.INLINE) && classDescriptor.isInline(), "inline");
            m91569f2(sb, m91527N0().contains(DescriptorRendererModifier.VALUE) && classDescriptor.mo88311q(), "value");
            m91569f2(sb, m91527N0().contains(DescriptorRendererModifier.FUN) && classDescriptor.mo88304j0(), "fun");
            m91513I1(classDescriptor, sb);
        }
        if (DescriptorUtils.m91783x(classDescriptor)) {
            m91519K1(classDescriptor, sb);
        } else {
            if (!m91577i1()) {
                m91611t2(sb);
            }
            m91572g2(classDescriptor, sb, true);
        }
        if (z) {
            return;
        }
        List<TypeParameterDescriptor> listMo88309p = classDescriptor.mo88309p();
        listMo88309p.getClass();
        m91506F2(listMo88309p, sb, false);
        m91508G1(classDescriptor, sb);
        if (!classDescriptor.getKind().isSingleton() && m91497C0() && (classConstructorDescriptorMo88313v = classDescriptor.mo88313v()) != null) {
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            m91463F1(this, sb, classConstructorDescriptorMo88313v, null, 2, null);
            DescriptorVisibility visibility2 = classConstructorDescriptorMo88313v.getVisibility();
            visibility2.getClass();
            m91523L2(visibility2, sb);
            sb.append(m91551Z1("constructor"));
            List<ValueParameterDescriptor> listMo88448g = classConstructorDescriptorMo88313v.mo88448g();
            listMo88448g.getClass();
            m91517J2(listMo88448g, classConstructorDescriptorMo88313v.mo88449k0(), sb);
        }
        m91614u2(classDescriptor, sb);
        m91526M2(listMo88309p, sb);
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m91512I0() {
        return this.f65748l.m91652F();
    }

    /* JADX INFO: renamed from: I1 */
    public final void m91513I1(ClassDescriptor classDescriptor, StringBuilder sb) {
        sb.append(m91551Z1(DescriptorRenderer.Companion.m91455a(classDescriptor)));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX INFO: renamed from: I2 */
    public final void m91514I2(ValueParameterDescriptor valueParameterDescriptor, boolean z, StringBuilder sb, boolean z2) {
        boolean z3;
        if (z2) {
            sb.append(m91551Z1("value-parameter"));
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        if (m91595o1()) {
            sb.append("/*");
            sb.append(valueParameterDescriptor.getIndex());
            sb.append("*/ ");
        }
        m91463F1(this, sb, valueParameterDescriptor, null, 2, null);
        m91569f2(sb, valueParameterDescriptor.mo88617t0(), "crossinline");
        m91569f2(sb, valueParameterDescriptor.mo88616r0(), "noinline");
        boolean z4 = false;
        if (m91562d1()) {
            CallableDescriptor callableDescriptorMo88299b = valueParameterDescriptor.mo88299b();
            ClassConstructorDescriptor classConstructorDescriptor = callableDescriptorMo88299b instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) callableDescriptorMo88299b : null;
            if (classConstructorDescriptor == null || !classConstructorDescriptor.mo88463i0()) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            m91569f2(sb, m91621y0(), "actual");
        }
        m91520K2(valueParameterDescriptor, z, sb, z2, z3);
        if (m91502E0() != null) {
            if (mo91561d() ? valueParameterDescriptor.mo88615M() : DescriptorUtilsKt.m91973f(valueParameterDescriptor)) {
                z4 = true;
            }
        }
        if (z4) {
            StringBuilder sb2 = new StringBuilder(" = ");
            Function1<ValueParameterDescriptor, String> function1M91502E0 = m91502E0();
            function1M91502E0.getClass();
            sb2.append(function1M91502E0.invoke(valueParameterDescriptor));
            sb.append(sb2.toString());
        }
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m91515J0() {
        return this.f65748l.m91653G();
    }

    @NotNull
    /* JADX INFO: renamed from: J1 */
    public String m91516J1(@NotNull ClassifierDescriptor classifierDescriptor) {
        classifierDescriptor.getClass();
        return ErrorUtils.m93003m(classifierDescriptor) ? classifierDescriptor.mo88305l().toString() : m91499D0().mo91421a(classifierDescriptor, this);
    }

    /* JADX INFO: renamed from: J2 */
    public final void m91517J2(Collection<? extends ValueParameterDescriptor> collection, boolean z, StringBuilder sb) {
        boolean zM91531O2 = m91531O2(z);
        int size = collection.size();
        m91592n1().mo91457a(size, sb);
        int i = 0;
        for (ValueParameterDescriptor valueParameterDescriptor : collection) {
            m91592n1().mo91459c(valueParameterDescriptor, i, size, sb);
            m91514I2(valueParameterDescriptor, zM91531O2, sb, false);
            m91592n1().mo91460d(valueParameterDescriptor, i, size, sb);
            i++;
        }
        m91592n1().mo91458b(size, sb);
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m91518K0() {
        return this.f65748l.m91654H();
    }

    /* JADX INFO: renamed from: K1 */
    public final void m91519K1(DeclarationDescriptor declarationDescriptor, StringBuilder sb) {
        if (m91546X0()) {
            if (m91577i1()) {
                sb.append("companion object");
            }
            m91611t2(sb);
            DeclarationDescriptor declarationDescriptorMo88299b = declarationDescriptor.mo88299b();
            if (declarationDescriptorMo88299b != null) {
                sb.append("of ");
                Name name = declarationDescriptorMo88299b.getName();
                name.getClass();
                sb.append(mo91451T(name, false));
            }
        }
        if (m91595o1() || !Intrinsics.m87488d(declarationDescriptor.getName(), SpecialNames.f65488c)) {
            if (!m91577i1()) {
                m91611t2(sb);
            }
            Name name2 = declarationDescriptor.getName();
            name2.getClass();
            sb.append(mo91451T(name2, true));
        }
    }

    /* JADX INFO: renamed from: K2 */
    public final void m91520K2(VariableDescriptor variableDescriptor, boolean z, StringBuilder sb, boolean z2, boolean z3) {
        KotlinType type = variableDescriptor.getType();
        type.getClass();
        ValueParameterDescriptor valueParameterDescriptor = variableDescriptor instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) variableDescriptor : null;
        KotlinType kotlinTypeMo88618w0 = valueParameterDescriptor != null ? valueParameterDescriptor.mo88618w0() : null;
        KotlinType kotlinType = kotlinTypeMo88618w0 == null ? type : kotlinTypeMo88618w0;
        m91569f2(sb, kotlinTypeMo88618w0 != null, "vararg");
        if (z3 || (z2 && !m91577i1())) {
            m91509G2(variableDescriptor, sb, z3);
        }
        if (z) {
            m91572g2(variableDescriptor, sb, z2);
            sb.append(": ");
        }
        sb.append(mo91452U(kotlinType));
        m91549Y1(variableDescriptor, sb);
        if (!m91595o1() || kotlinTypeMo88618w0 == null) {
            return;
        }
        sb.append(" /*");
        sb.append(mo91452U(type));
        sb.append("*/");
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m91521L0() {
        return this.f65748l.m91655I();
    }

    /* JADX INFO: renamed from: L1 */
    public final String m91522L1(ConstantValue<?> constantValue) {
        Function1<ConstantValue<?>, String> function1M91664R = this.f65748l.m91664R();
        if (function1M91664R != null) {
            return function1M91664R.invoke(constantValue);
        }
        if (constantValue instanceof ArrayValue) {
            List<? extends ConstantValue<?>> listMo91918b = ((ArrayValue) constantValue).mo91918b();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listMo91918b.iterator();
            while (it.hasNext()) {
                String strM91522L1 = m91522L1((ConstantValue) it.next());
                if (strM91522L1 != null) {
                    arrayList.add(strM91522L1);
                }
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (constantValue instanceof AnnotationValue) {
            return StringsKt.m93456w0(DescriptorRenderer.m91438Q(this, ((AnnotationValue) constantValue).mo91918b(), null, 2, null), "@");
        }
        if (!(constantValue instanceof KClassValue)) {
            return constantValue.toString();
        }
        KClassValue.Value valueMo91918b = ((KClassValue) constantValue).mo91918b();
        if (valueMo91918b instanceof KClassValue.Value.LocalClass) {
            return ((KClassValue.Value.LocalClass) valueMo91918b).m91950a() + "::class";
        }
        if (!(valueMo91918b instanceof KClassValue.Value.NormalClass)) {
            l9r.m149037a();
            return null;
        }
        KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) valueMo91918b;
        String strM91046a = normalClass.m91952b().m91034a().m91046a();
        for (int i = 0; i < normalClass.m91951a(); i++) {
            strM91046a = "kotlin.Array<" + strM91046a + '>';
        }
        return strM91046a + "::class";
    }

    /* JADX INFO: renamed from: L2 */
    public final boolean m91523L2(DescriptorVisibility descriptorVisibility, StringBuilder sb) {
        if (!m91527N0().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (m91529O0()) {
            descriptorVisibility = descriptorVisibility.mo88477f();
        }
        if (!m91559c1() && Intrinsics.m87488d(descriptorVisibility, DescriptorVisibilities.f64033l)) {
            return false;
        }
        sb.append(m91551Z1(descriptorVisibility.mo88476c()));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        return true;
    }

    /* JADX INFO: renamed from: M0 */
    public boolean m91524M0() {
        return this.f65748l.m91656J();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    /* JADX INFO: renamed from: M1 */
    public final void m91525M1(ConstructorDescriptor constructorDescriptor, StringBuilder sb) {
        boolean z;
        ClassConstructorDescriptor classConstructorDescriptorMo88313v;
        m91463F1(this, sb, constructorDescriptor, null, 2, null);
        if (this.f65748l.m91672Z() || constructorDescriptor.mo88462F().mo88303i() != Modality.SEALED) {
            DescriptorVisibility visibility = constructorDescriptor.getVisibility();
            visibility.getClass();
            if (m91523L2(visibility, sb)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        m91554a2(constructorDescriptor, sb);
        boolean z2 = m91550Z0() || !constructorDescriptor.mo88463i0() || z;
        if (z2) {
            sb.append(m91551Z1("constructor"));
        }
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParametersMo88299b = constructorDescriptor.mo88299b();
        classifierDescriptorWithTypeParametersMo88299b.getClass();
        if (m91571g1()) {
            if (z2) {
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
            m91572g2(classifierDescriptorWithTypeParametersMo88299b, sb, true);
            List<TypeParameterDescriptor> typeParameters = constructorDescriptor.getTypeParameters();
            typeParameters.getClass();
            m91506F2(typeParameters, sb, false);
        }
        List<ValueParameterDescriptor> listMo88448g = constructorDescriptor.mo88448g();
        listMo88448g.getClass();
        m91517J2(listMo88448g, constructorDescriptor.mo88449k0(), sb);
        if (m91548Y0() && !constructorDescriptor.mo88463i0() && (classifierDescriptorWithTypeParametersMo88299b instanceof ClassDescriptor) && (classConstructorDescriptorMo88313v = ((ClassDescriptor) classifierDescriptorWithTypeParametersMo88299b).mo88313v()) != null) {
            List<ValueParameterDescriptor> listMo88448g2 = classConstructorDescriptorMo88313v.mo88448g();
            listMo88448g2.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listMo88448g2) {
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) obj;
                if (!valueParameterDescriptor.mo88615M() && valueParameterDescriptor.mo88618w0() == null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" : ");
                sb.append(m91551Z1("this"));
                sb.append(CollectionsKt.joinToString$default(arrayList, ", ", "(", ")", 0, null, avd.INSTANCE, 24, null));
            }
        }
        if (m91571g1()) {
            List<TypeParameterDescriptor> typeParameters2 = constructorDescriptor.getTypeParameters();
            typeParameters2.getClass();
            m91526M2(typeParameters2, sb);
        }
    }

    /* JADX INFO: renamed from: M2 */
    public final void m91526M2(List<? extends TypeParameterDescriptor> list, StringBuilder sb) {
        if (m91610t1()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            upperBounds.getClass();
            for (KotlinType kotlinType : CollectionsKt.drop(upperBounds, 1)) {
                StringBuilder sb2 = new StringBuilder();
                Name name = typeParameterDescriptor.getName();
                name.getClass();
                sb2.append(mo91451T(name, false));
                sb2.append(" : ");
                kotlinType.getClass();
                sb2.append(mo91452U(kotlinType));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(m91551Z1("where"));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        CollectionsKt.joinTo$default(arrayList, sb, ", ", null, null, 0, null, null, 124, null);
    }

    @NotNull
    /* JADX INFO: renamed from: N0 */
    public Set<DescriptorRendererModifier> m91527N0() {
        return this.f65748l.m91657K();
    }

    /* JADX INFO: renamed from: N2 */
    public final boolean m91528N2(KotlinType kotlinType) {
        if (!FunctionTypesKt.m88159p(kotlinType)) {
            return false;
        }
        List<TypeProjection> listMo91888E0 = kotlinType.mo91888E0();
        if ((listMo91888E0 instanceof Collection) && listMo91888E0.isEmpty()) {
            return true;
        }
        Iterator<T> it = listMo91888E0.iterator();
        while (it.hasNext()) {
            if (((TypeProjection) it.next()).mo92666b()) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* JADX INFO: renamed from: O */
    public String mo91447O(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        StringBuilder sb = new StringBuilder();
        declarationDescriptor.mo88464S(new RenderDeclarationDescriptorVisitor(), sb);
        if (m91598p1()) {
            m91604r0(sb, declarationDescriptor);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: O0 */
    public boolean m91529O0() {
        return this.f65748l.m91658L();
    }

    /* JADX INFO: renamed from: O1 */
    public final void m91530O1(List<? extends ReceiverParameterDescriptor> list, StringBuilder sb) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        int i = 0;
        for (ReceiverParameterDescriptor receiverParameterDescriptor : list) {
            int i2 = i + 1;
            m91503E1(sb, receiverParameterDescriptor, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = receiverParameterDescriptor.getType();
            type.getClass();
            sb.append(m91541U1(type));
            if (i == CollectionsKt.getLastIndex(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: O2 */
    public final boolean m91531O2(boolean z) {
        int i = WhenMappings.f65753b[m91536R0().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return !z;
        }
        if (i == 3) {
            return false;
        }
        l9r.m149037a();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* JADX INFO: renamed from: P */
    public String mo91448P(@NotNull AnnotationDescriptor annotationDescriptor, @Nullable AnnotationUseSiteTarget annotationUseSiteTarget) {
        annotationDescriptor.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (annotationUseSiteTarget != null) {
            sb.append(annotationUseSiteTarget.getRenderName() + ':');
        }
        KotlinType type = annotationDescriptor.getType();
        sb.append(mo91452U(type));
        if (m91515J0()) {
            List<String> listM91500D1 = m91500D1(annotationDescriptor);
            if (m91518K0() || !listM91500D1.isEmpty()) {
                CollectionsKt.joinTo$default(listM91500D1, sb, ", ", "(", ")", 0, null, null, 112, null);
            }
        }
        if (m91595o1() && (KotlinTypeKt.m92644a(type) || (type.mo91890G0().mo88316e() instanceof NotFoundClasses.MockClassDescriptor))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public final DescriptorRendererOptionsImpl m91532P0() {
        return this.f65748l;
    }

    /* JADX INFO: renamed from: P1 */
    public final void m91533P1(StringBuilder sb, KotlinType kotlinType) {
        m91463F1(this, sb, kotlinType, null, 2, null);
        DefinitelyNotNullType definitelyNotNullType = kotlinType instanceof DefinitelyNotNullType ? (DefinitelyNotNullType) kotlinType : null;
        SimpleType simpleTypeM92572S0 = definitelyNotNullType != null ? definitelyNotNullType.m92572S0() : null;
        if (KotlinTypeKt.m92644a(kotlinType)) {
            if (TypeUtilsKt.m93106z(kotlinType) && m91539T0()) {
                sb.append(m91535Q1(ErrorUtils.INSTANCE.m93015p(kotlinType)));
            } else {
                if (!(kotlinType instanceof ErrorType) || m91524M0()) {
                    sb.append(kotlinType.mo91890G0().toString());
                } else {
                    sb.append(((ErrorType) kotlinType).m92994P0());
                }
                sb.append(m91623y2(kotlinType.mo91888E0()));
            }
        } else if (kotlinType instanceof StubTypeForBuilderInference) {
            sb.append(((StubTypeForBuilderInference) kotlinType).m92502P0().toString());
        } else if (simpleTypeM92572S0 instanceof StubTypeForBuilderInference) {
            sb.append(((StubTypeForBuilderInference) simpleTypeM92572S0).m92502P0().toString());
        } else {
            m91462C2(this, sb, kotlinType, null, 2, null);
            Unit unit = Unit.INSTANCE;
        }
        if (kotlinType.mo89966H0()) {
            sb.append("?");
        }
        if (SpecialTypesKt.m92656c(kotlinType)) {
            sb.append(" & Any");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public OverrideRenderingPolicy m91534Q0() {
        return this.f65748l.m91659M();
    }

    /* JADX INFO: renamed from: Q1 */
    public final String m91535Q1(String str) {
        int i = WhenMappings.f65752a[m91580j1().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            l9r.m149037a();
            return null;
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* JADX INFO: renamed from: R */
    public String mo91449R(@NotNull String str, @NotNull String str2, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        str.getClass();
        str2.getClass();
        kotlinBuiltIns.getClass();
        if (RenderingUtilsKt.m91708j(str, str2)) {
            if (C15386d.m93483J(str2, "(", false, 2, null)) {
                return "(" + str + ")!";
            }
            return str + '!';
        }
        String strM91702d = RenderingUtilsKt.m91702d(str, str2, new wud(this, kotlinBuiltIns), new xud(this, kotlinBuiltIns), new DescriptorRendererImpl$renderFlexibleType$3(this));
        if (strM91702d != null) {
            return strM91702d;
        }
        return "(" + str + ".." + str2 + ')';
    }

    @NotNull
    /* JADX INFO: renamed from: R0 */
    public ParameterNameRenderingPolicy m91536R0() {
        return this.f65748l.m91660N();
    }

    /* JADX INFO: renamed from: R1 */
    public final void m91537R1(StringBuilder sb, AbbreviatedType abbreviatedType) {
        RenderingFormat renderingFormatM91580j1 = m91580j1();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (renderingFormatM91580j1 == renderingFormat) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* ");
        sb.append("= ");
        m91578i2(sb, abbreviatedType.m92490V());
        sb.append(" */");
        if (m91580j1() == renderingFormat) {
            sb.append("</i></font>");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* JADX INFO: renamed from: S */
    public String mo91450S(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return m91543V1(fqNameUnsafe.m91064h());
    }

    /* JADX INFO: renamed from: S0 */
    public boolean m91538S0() {
        return this.f65748l.m91661O();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* JADX INFO: renamed from: T */
    public String mo91451T(@NotNull Name name, boolean z) {
        name.getClass();
        String strM91615v0 = m91615v0(RenderingUtilsKt.m91701c(name));
        if (!m91494B0() || m91580j1() != RenderingFormat.HTML || !z) {
            return strM91615v0;
        }
        return "<b>" + strM91615v0 + "</b>";
    }

    /* JADX INFO: renamed from: T0 */
    public boolean m91539T0() {
        return this.f65748l.m91662P();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* JADX INFO: renamed from: U */
    public String mo91452U(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        StringBuilder sb = new StringBuilder();
        m91575h2(sb, m91583k1().invoke(kotlinType));
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: U0 */
    public PropertyAccessorRenderingPolicy m91540U0() {
        return this.f65748l.m91663Q();
    }

    /* JADX INFO: renamed from: U1 */
    public final String m91541U1(KotlinType kotlinType) {
        String strMo91452U = mo91452U(kotlinType);
        if ((!m91528N2(kotlinType) || TypeUtils.m92801l(kotlinType)) && !(kotlinType instanceof DefinitelyNotNullType)) {
            return strMo91452U;
        }
        return "(" + strMo91452U + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* JADX INFO: renamed from: V */
    public String mo91453V(@NotNull TypeProjection typeProjection) {
        typeProjection.getClass();
        StringBuilder sb = new StringBuilder();
        m91607s0(sb, CollectionsKt.listOf(typeProjection));
        return sb.toString();
    }

    /* JADX INFO: renamed from: V0 */
    public boolean m91542V0() {
        return this.f65748l.m91665S();
    }

    /* JADX INFO: renamed from: V1 */
    public final String m91543V1(List<Name> list) {
        return m91615v0(RenderingUtilsKt.m91705g(list));
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m91544W0() {
        return this.f65748l.m91666T();
    }

    /* JADX INFO: renamed from: W1 */
    public final void m91545W1(FunctionDescriptor functionDescriptor, StringBuilder sb) {
        DescriptorRendererImpl descriptorRendererImpl;
        FunctionDescriptor functionDescriptor2;
        StringBuilder sb2;
        if (m91577i1()) {
            descriptorRendererImpl = this;
            functionDescriptor2 = functionDescriptor;
            sb2 = sb;
        } else {
            if (m91574h1()) {
                descriptorRendererImpl = this;
                functionDescriptor2 = functionDescriptor;
                sb2 = sb;
            } else {
                List<ReceiverParameterDescriptor> listMo88450x0 = functionDescriptor.mo88450x0();
                listMo88450x0.getClass();
                m91530O1(listMo88450x0, sb);
                descriptorRendererImpl = this;
                functionDescriptor2 = functionDescriptor;
                sb2 = sb;
                m91463F1(descriptorRendererImpl, sb2, functionDescriptor2, null, 2, null);
                DescriptorVisibility visibility = functionDescriptor2.getVisibility();
                visibility.getClass();
                descriptorRendererImpl.m91523L2(visibility, sb2);
                descriptorRendererImpl.m91566e2(functionDescriptor2, sb2);
                if (descriptorRendererImpl.m91512I0()) {
                    descriptorRendererImpl.m91557b2(functionDescriptor2, sb2);
                }
                descriptorRendererImpl.m91581j2(functionDescriptor2, sb2);
                if (descriptorRendererImpl.m91512I0()) {
                    descriptorRendererImpl.m91498C1(functionDescriptor2, sb2);
                } else {
                    descriptorRendererImpl.m91618w2(functionDescriptor2, sb2);
                }
                descriptorRendererImpl.m91554a2(functionDescriptor2, sb2);
                if (descriptorRendererImpl.m91595o1()) {
                    if (functionDescriptor2.mo88512A0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (functionDescriptor2.mo88513O()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(descriptorRendererImpl.m91551Z1("fun"));
            sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            List<TypeParameterDescriptor> typeParameters = functionDescriptor2.getTypeParameters();
            typeParameters.getClass();
            descriptorRendererImpl.m91506F2(typeParameters, sb2, true);
            descriptorRendererImpl.m91602q2(functionDescriptor2, sb2);
        }
        descriptorRendererImpl.m91572g2(functionDescriptor2, sb2, true);
        List<ValueParameterDescriptor> listMo88448g = functionDescriptor2.mo88448g();
        listMo88448g.getClass();
        descriptorRendererImpl.m91517J2(listMo88448g, functionDescriptor2.mo88449k0(), sb2);
        descriptorRendererImpl.m91606r2(functionDescriptor2, sb2);
        KotlinType returnType = functionDescriptor2.getReturnType();
        if (!descriptorRendererImpl.m91605r1() && (descriptorRendererImpl.m91589m1() || returnType == null || !KotlinBuiltIns.m88170D0(returnType))) {
            sb2.append(": ");
            sb2.append(returnType == null ? "[NULL]" : descriptorRendererImpl.mo91452U(returnType));
        }
        List<TypeParameterDescriptor> typeParameters2 = functionDescriptor2.getTypeParameters();
        typeParameters2.getClass();
        descriptorRendererImpl.m91526M2(typeParameters2, sb2);
    }

    /* JADX INFO: renamed from: X0 */
    public boolean m91546X0() {
        return this.f65748l.m91667U();
    }

    /* JADX INFO: renamed from: X1 */
    public final void m91547X1(StringBuilder sb, KotlinType kotlinType) {
        Name nameM88147d;
        int length = sb.length();
        m91463F1(m91510H0(), sb, kotlinType, null, 2, null);
        boolean z = sb.length() != length;
        KotlinType kotlinTypeM88154k = FunctionTypesKt.m88154k(kotlinType);
        List<KotlinType> listM88148e = FunctionTypesKt.m88148e(kotlinType);
        boolean zM88162s = FunctionTypesKt.m88162s(kotlinType);
        boolean zMo89966H0 = kotlinType.mo89966H0();
        boolean z2 = zMo89966H0 || (z && kotlinTypeM88154k != null);
        if (z2) {
            if (zM88162s) {
                sb.insert(length, '(');
            } else {
                if (z) {
                    CharsKt.m93332b(C15390h.m93495c1(sb));
                    if (sb.charAt(StringsKt.m93426W(sb) - 1) != ')') {
                        sb.insert(StringsKt.m93426W(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        m91569f2(sb, zM88162s, "suspend");
        if (!listM88148e.isEmpty()) {
            sb.append("context(");
            Iterator<KotlinType> it = listM88148e.subList(0, CollectionsKt.getLastIndex(listM88148e)).iterator();
            while (it.hasNext()) {
                m91575h2(sb, it.next());
                sb.append(", ");
            }
            m91575h2(sb, (KotlinType) CollectionsKt.last((List) listM88148e));
            sb.append(") ");
        }
        if (kotlinTypeM88154k != null) {
            boolean z3 = (m91528N2(kotlinTypeM88154k) && !kotlinTypeM88154k.mo89966H0()) || m91616v1(kotlinTypeM88154k) || (kotlinTypeM88154k instanceof DefinitelyNotNullType);
            if (z3) {
                sb.append("(");
            }
            m91575h2(sb, kotlinTypeM88154k);
            if (z3) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!FunctionTypesKt.m88157n(kotlinType) || kotlinType.mo91888E0().size() > 1) {
            int i = 0;
            for (TypeProjection typeProjection : FunctionTypesKt.m88156m(kotlinType)) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append(", ");
                }
                if (m91538S0()) {
                    KotlinType type = typeProjection.getType();
                    type.getClass();
                    nameM88147d = FunctionTypesKt.m88147d(type);
                } else {
                    nameM88147d = null;
                }
                if (nameM88147d != null) {
                    sb.append(mo91451T(nameM88147d, false));
                    sb.append(": ");
                }
                sb.append(mo91453V(typeProjection));
                i = i2;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        sb.append(m91612u0());
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        m91575h2(sb, FunctionTypesKt.m88155l(kotlinType));
        if (z2) {
            sb.append(")");
        }
        if (zMo89966H0) {
            sb.append("?");
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public boolean m91548Y0() {
        return this.f65748l.m91668V();
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m91549Y1(VariableDescriptor variableDescriptor, StringBuilder sb) {
        ConstantValue<?> constantValueMo88619q0;
        String strM91522L1;
        if (!m91521L0() || (constantValueMo88619q0 = variableDescriptor.mo88619q0()) == null || (strM91522L1 = m91522L1(constantValueMo88619q0)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(m91615v0(strM91522L1));
    }

    /* JADX INFO: renamed from: Z0 */
    public boolean m91550Z0() {
        return this.f65748l.m91669W();
    }

    /* JADX INFO: renamed from: Z1 */
    public final String m91551Z1(String str) {
        int i = WhenMappings.f65752a[m91580j1().ordinal()];
        if (i != 1) {
            if (i != 2) {
                l9r.m149037a();
                return null;
            }
            if (!m91494B0()) {
                return "<b>" + str + "</b>";
            }
        }
        return str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: a */
    public void mo91552a(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        parameterNameRenderingPolicy.getClass();
        this.f65748l.mo91552a(parameterNameRenderingPolicy);
    }

    /* JADX INFO: renamed from: a1 */
    public boolean m91553a1() {
        return this.f65748l.m91670X();
    }

    /* JADX INFO: renamed from: a2 */
    public final void m91554a2(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (m91527N0().contains(DescriptorRendererModifier.MEMBER_KIND) && m91595o1() && callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb.append("/*");
            sb.append(CapitalizeDecapitalizeKt.m93175f(callableMemberDescriptor.getKind().name()));
            sb.append("*/ ");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: b */
    public boolean mo91555b() {
        return this.f65748l.mo91555b();
    }

    /* JADX INFO: renamed from: b1 */
    public boolean m91556b1() {
        return this.f65748l.m91671Y();
    }

    /* JADX INFO: renamed from: b2 */
    public final void m91557b2(MemberDescriptor memberDescriptor, StringBuilder sb) {
        m91569f2(sb, memberDescriptor.isExternal(), "external");
        boolean z = false;
        m91569f2(sb, m91527N0().contains(DescriptorRendererModifier.EXPECT) && memberDescriptor.mo88307n0(), "expect");
        if (m91527N0().contains(DescriptorRendererModifier.ACTUAL) && memberDescriptor.mo88301e0()) {
            z = true;
        }
        m91569f2(sb, z, "actual");
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    /* JADX INFO: renamed from: c */
    public Set<FqName> mo91558c() {
        return this.f65748l.mo91558c();
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m91559c1() {
        return this.f65748l.m91672Z();
    }

    @NotNull
    /* JADX INFO: renamed from: c2 */
    public String m91560c2(@NotNull String str) {
        str.getClass();
        int i = WhenMappings.f65752a[m91580j1().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            l9r.m149037a();
            return null;
        }
        return "<i>" + str + "</i>";
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: d */
    public boolean mo91561d() {
        return this.f65748l.mo91561d();
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m91562d1() {
        return this.f65748l.m91673a0();
    }

    /* JADX INFO: renamed from: d2 */
    public final void m91563d2(Modality modality, StringBuilder sb, Modality modality2) {
        if (m91556b1() || modality != modality2) {
            m91569f2(sb, m91527N0().contains(DescriptorRendererModifier.MODALITY), CapitalizeDecapitalizeKt.m93175f(modality.name()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    /* JADX INFO: renamed from: e */
    public AnnotationArgumentsRenderingPolicy mo91564e() {
        return this.f65748l.mo91564e();
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m91565e1() {
        return this.f65748l.m91674b0();
    }

    /* JADX INFO: renamed from: e2 */
    public final void m91566e2(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (DescriptorUtils.m91756J(callableMemberDescriptor) && callableMemberDescriptor.mo88303i() == Modality.FINAL) {
            return;
        }
        if (m91534Q0() == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.mo88303i() == Modality.OPEN && m91625z1(callableMemberDescriptor)) {
            return;
        }
        Modality modalityMo88303i = callableMemberDescriptor.mo88303i();
        modalityMo88303i.getClass();
        m91563d2(modalityMo88303i, sb, m91617w1(callableMemberDescriptor));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: f */
    public void mo91567f(@NotNull Set<FqName> set) {
        set.getClass();
        this.f65748l.mo91567f(set);
    }

    /* JADX INFO: renamed from: f1 */
    public boolean m91568f1() {
        return this.f65748l.m91675c0();
    }

    /* JADX INFO: renamed from: f2 */
    public final void m91569f2(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(m91551Z1(str));
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: g */
    public void mo91570g(@NotNull Set<? extends DescriptorRendererModifier> set) {
        set.getClass();
        this.f65748l.mo91570g(set);
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m91571g1() {
        return this.f65748l.m91676d0();
    }

    /* JADX INFO: renamed from: g2 */
    public final void m91572g2(DeclarationDescriptor declarationDescriptor, StringBuilder sb, boolean z) {
        Name name = declarationDescriptor.getName();
        name.getClass();
        sb.append(mo91451T(name, z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: h */
    public void mo91573h(boolean z) {
        this.f65748l.mo91573h(z);
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m91574h1() {
        return this.f65748l.m91677e0();
    }

    /* JADX INFO: renamed from: h2 */
    public final void m91575h2(StringBuilder sb, KotlinType kotlinType) {
        UnwrappedType unwrappedTypeMo92625J0 = kotlinType.mo92625J0();
        AbbreviatedType abbreviatedType = unwrappedTypeMo92625J0 instanceof AbbreviatedType ? (AbbreviatedType) unwrappedTypeMo92625J0 : null;
        if (abbreviatedType == null) {
            m91578i2(sb, kotlinType);
            return;
        }
        if (m91565e1()) {
            m91578i2(sb, abbreviatedType.m92490V());
            if (m91544W0()) {
                m91493A1(sb, abbreviatedType);
                return;
            }
            return;
        }
        m91578i2(sb, abbreviatedType.m92487S0());
        if (m91568f1()) {
            m91537R1(sb, abbreviatedType);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: i */
    public void mo91576i(boolean z) {
        this.f65748l.mo91576i(z);
    }

    /* JADX INFO: renamed from: i1 */
    public boolean m91577i1() {
        return this.f65748l.m91678f0();
    }

    /* JADX INFO: renamed from: i2 */
    public final void m91578i2(StringBuilder sb, KotlinType kotlinType) {
        if ((kotlinType instanceof WrappedType) && mo91561d() && !((WrappedType) kotlinType).mo92649L0()) {
            sb.append("<Not computed yet>");
            return;
        }
        UnwrappedType unwrappedTypeMo92625J0 = kotlinType.mo92625J0();
        if (unwrappedTypeMo92625J0 instanceof FlexibleType) {
            sb.append(((FlexibleType) unwrappedTypeMo92625J0).mo89896Q0(this, this));
        } else if (unwrappedTypeMo92625J0 instanceof SimpleType) {
            m91609s2(sb, (SimpleType) unwrappedTypeMo92625J0);
        } else {
            l9r.m149037a();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: j */
    public void mo91579j(boolean z) {
        this.f65748l.mo91579j(z);
    }

    @NotNull
    /* JADX INFO: renamed from: j1 */
    public RenderingFormat m91580j1() {
        return this.f65748l.m91679g0();
    }

    /* JADX INFO: renamed from: j2 */
    public final void m91581j2(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (m91527N0().contains(DescriptorRendererModifier.OVERRIDE) && m91625z1(callableMemberDescriptor) && m91534Q0() != OverrideRenderingPolicy.RENDER_OPEN) {
            m91569f2(sb, true, "override");
            if (m91595o1()) {
                sb.append("/*");
                sb.append(callableMemberDescriptor.mo88447e().size());
                sb.append("*/ ");
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: k */
    public void mo91582k(boolean z) {
        this.f65748l.mo91582k(z);
    }

    @NotNull
    /* JADX INFO: renamed from: k1 */
    public Function1<KotlinType, KotlinType> m91583k1() {
        return this.f65748l.m91680h0();
    }

    /* JADX INFO: renamed from: k2 */
    public final void m91584k2(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb) {
        m91587l2(packageFragmentDescriptor.mo88562d(), "package-fragment", sb);
        if (mo91561d()) {
            sb.append(" in ");
            m91572g2(packageFragmentDescriptor.mo88299b(), sb, false);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: l */
    public void mo91585l(boolean z) {
        this.f65748l.mo91585l(z);
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m91586l1() {
        return this.f65748l.m91681i0();
    }

    /* JADX INFO: renamed from: l2 */
    public final void m91587l2(FqName fqName, String str, StringBuilder sb) {
        sb.append(m91551Z1(str));
        String strMo91450S = mo91450S(fqName.m91054i());
        if (strMo91450S.length() > 0) {
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(strMo91450S);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: m */
    public void mo91588m(boolean z) {
        this.f65748l.mo91588m(z);
    }

    /* JADX INFO: renamed from: m1 */
    public boolean m91589m1() {
        return this.f65748l.m91682j0();
    }

    /* JADX INFO: renamed from: m2 */
    public final void m91590m2(PackageViewDescriptor packageViewDescriptor, StringBuilder sb) {
        m91587l2(packageViewDescriptor.mo88575d(), "package", sb);
        if (mo91561d()) {
            sb.append(" in context of ");
            m91572g2(packageViewDescriptor.mo88577z0(), sb, false);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: n */
    public void mo91591n(boolean z) {
        this.f65748l.mo91591n(z);
    }

    @NotNull
    /* JADX INFO: renamed from: n1 */
    public DescriptorRenderer.ValueParametersHandler m91592n1() {
        return this.f65748l.m91683k0();
    }

    /* JADX INFO: renamed from: n2 */
    public final void m91593n2(StringBuilder sb, PossiblyInnerType possiblyInnerType) {
        PossiblyInnerType possiblyInnerTypeM88580c = possiblyInnerType.m88580c();
        if (possiblyInnerTypeM88580c != null) {
            m91593n2(sb, possiblyInnerTypeM88580c);
            sb.append('.');
            Name name = possiblyInnerType.m88579b().getName();
            name.getClass();
            sb.append(mo91451T(name, false));
        } else {
            TypeConstructor typeConstructorMo88305l = possiblyInnerType.m88579b().mo88305l();
            typeConstructorMo88305l.getClass();
            sb.append(m91626z2(typeConstructorMo88305l));
        }
        sb.append(m91623y2(possiblyInnerType.m88578a()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: o */
    public void mo91594o(@NotNull RenderingFormat renderingFormat) {
        renderingFormat.getClass();
        this.f65748l.mo91594o(renderingFormat);
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m91595o1() {
        return this.f65748l.m91684l0();
    }

    /* JADX INFO: renamed from: o2 */
    public final void m91596o2(PropertyDescriptor propertyDescriptor, StringBuilder sb) {
        DescriptorRendererImpl descriptorRendererImpl;
        PropertyDescriptor propertyDescriptor2;
        StringBuilder sb2;
        if (m91577i1()) {
            descriptorRendererImpl = this;
            propertyDescriptor2 = propertyDescriptor;
            sb2 = sb;
        } else {
            if (!m91574h1()) {
                List<ReceiverParameterDescriptor> listMo88450x0 = propertyDescriptor.mo88450x0();
                listMo88450x0.getClass();
                m91530O1(listMo88450x0, sb);
                m91599p2(propertyDescriptor, sb);
                DescriptorVisibility visibility = propertyDescriptor.getVisibility();
                visibility.getClass();
                m91523L2(visibility, sb);
                boolean z = false;
                m91569f2(sb, m91527N0().contains(DescriptorRendererModifier.CONST) && propertyDescriptor.isConst(), "const");
                m91557b2(propertyDescriptor, sb);
                m91566e2(propertyDescriptor, sb);
                m91581j2(propertyDescriptor, sb);
                if (m91527N0().contains(DescriptorRendererModifier.LATEINIT) && propertyDescriptor.mo88621y0()) {
                    z = true;
                }
                m91569f2(sb, z, "lateinit");
                m91554a2(propertyDescriptor, sb);
            }
            descriptorRendererImpl = this;
            propertyDescriptor2 = propertyDescriptor;
            sb2 = sb;
            m91464H2(descriptorRendererImpl, propertyDescriptor2, sb2, false, 4, null);
            List<TypeParameterDescriptor> typeParameters = propertyDescriptor2.getTypeParameters();
            typeParameters.getClass();
            descriptorRendererImpl.m91506F2(typeParameters, sb2, true);
            descriptorRendererImpl.m91602q2(propertyDescriptor2, sb2);
        }
        descriptorRendererImpl.m91572g2(propertyDescriptor2, sb2, true);
        sb2.append(": ");
        KotlinType type = propertyDescriptor2.getType();
        type.getClass();
        sb2.append(descriptorRendererImpl.mo91452U(type));
        descriptorRendererImpl.m91606r2(propertyDescriptor2, sb2);
        descriptorRendererImpl.m91549Y1(propertyDescriptor2, sb2);
        List<TypeParameterDescriptor> typeParameters2 = propertyDescriptor2.getTypeParameters();
        typeParameters2.getClass();
        descriptorRendererImpl.m91526M2(typeParameters2, sb2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: p */
    public void mo91597p(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        annotationArgumentsRenderingPolicy.getClass();
        this.f65748l.mo91597p(annotationArgumentsRenderingPolicy);
    }

    /* JADX INFO: renamed from: p1 */
    public boolean m91598p1() {
        return this.f65748l.m91685m0();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m91599p2(PropertyDescriptor propertyDescriptor, StringBuilder sb) {
        if (m91527N0().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            m91463F1(this, sb, propertyDescriptor, null, 2, null);
            FieldDescriptor fieldDescriptorMo88583K = propertyDescriptor.mo88583K();
            if (fieldDescriptorMo88583K != null) {
                m91503E1(sb, fieldDescriptorMo88583K, AnnotationUseSiteTarget.FIELD);
            }
            FieldDescriptor fieldDescriptorMo88585z = propertyDescriptor.mo88585z();
            if (fieldDescriptorMo88585z != null) {
                m91503E1(sb, fieldDescriptorMo88585z, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
            }
            if (m91540U0() == PropertyAccessorRenderingPolicy.NONE) {
                PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
                if (getter != null) {
                    m91503E1(sb, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                }
                PropertySetterDescriptor setter = propertyDescriptor.getSetter();
                if (setter != null) {
                    m91503E1(sb, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                    List<ValueParameterDescriptor> listMo88448g = setter.mo88448g();
                    listMo88448g.getClass();
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.single((List) listMo88448g);
                    valueParameterDescriptor.getClass();
                    m91503E1(sb, valueParameterDescriptor, AnnotationUseSiteTarget.SETTER_PARAMETER);
                }
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: q */
    public void mo91600q(@NotNull ClassifierNamePolicy classifierNamePolicy) {
        classifierNamePolicy.getClass();
        this.f65748l.mo91600q(classifierNamePolicy);
    }

    /* JADX INFO: renamed from: q1 */
    public boolean m91601q1() {
        return this.f65748l.m91686n0();
    }

    /* JADX INFO: renamed from: q2 */
    public final void m91602q2(CallableDescriptor callableDescriptor, StringBuilder sb) {
        ReceiverParameterDescriptor receiverParameterDescriptorMo88446b0 = callableDescriptor.mo88446b0();
        if (receiverParameterDescriptorMo88446b0 != null) {
            m91503E1(sb, receiverParameterDescriptorMo88446b0, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = receiverParameterDescriptorMo88446b0.getType();
            type.getClass();
            sb.append(m91541U1(type));
            sb.append(".");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: r */
    public void mo91603r(boolean z) {
        this.f65748l.mo91603r(z);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m91604r0(StringBuilder sb, DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor declarationDescriptorMo88299b;
        String name;
        if ((declarationDescriptor instanceof PackageFragmentDescriptor) || (declarationDescriptor instanceof PackageViewDescriptor) || (declarationDescriptorMo88299b = declarationDescriptor.mo88299b()) == null || (declarationDescriptorMo88299b instanceof ModuleDescriptor)) {
            return;
        }
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(m91560c2("defined in"));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        FqNameUnsafe fqNameUnsafeM91772m = DescriptorUtils.m91772m(declarationDescriptorMo88299b);
        fqNameUnsafeM91772m.getClass();
        sb.append(fqNameUnsafeM91772m.m91061e() ? "root package" : mo91450S(fqNameUnsafeM91772m));
        if (m91601q1() && (declarationDescriptorMo88299b instanceof PackageFragmentDescriptor) && (declarationDescriptor instanceof DeclarationDescriptorWithSource) && (name = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource().mo88593b().getName()) != null) {
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(m91560c2("in file"));
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(name);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public boolean m91605r1() {
        return this.f65748l.m91687o0();
    }

    /* JADX INFO: renamed from: r2 */
    public final void m91606r2(CallableDescriptor callableDescriptor, StringBuilder sb) {
        ReceiverParameterDescriptor receiverParameterDescriptorMo88446b0;
        if (m91542V0() && (receiverParameterDescriptorMo88446b0 = callableDescriptor.mo88446b0()) != null) {
            sb.append(" on ");
            KotlinType type = receiverParameterDescriptorMo88446b0.getType();
            type.getClass();
            sb.append(mo91452U(type));
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m91607s0(StringBuilder sb, List<? extends TypeProjection> list) {
        CollectionsKt.joinTo$default(list, sb, ", ", null, null, 0, null, new zud(this), 60, null);
    }

    /* JADX INFO: renamed from: s1 */
    public boolean m91608s1() {
        return this.f65748l.m91688p0();
    }

    /* JADX INFO: renamed from: s2 */
    public final void m91609s2(StringBuilder sb, SimpleType simpleType) {
        if (Intrinsics.m87488d(simpleType, TypeUtils.f66287b) || TypeUtils.m92800k(simpleType)) {
            sb.append("???");
            return;
        }
        if (ErrorUtils.m93004o(simpleType)) {
            if (!m91586l1()) {
                sb.append("???");
                return;
            }
            TypeConstructor typeConstructorMo91890G0 = simpleType.mo91890G0();
            typeConstructorMo91890G0.getClass();
            sb.append(m91535Q1(((ErrorTypeConstructor) typeConstructorMo91890G0).m92999i(0)));
            return;
        }
        if (KotlinTypeKt.m92644a(simpleType)) {
            m91533P1(sb, simpleType);
        } else if (m91528N2(simpleType)) {
            m91547X1(sb, simpleType);
        } else {
            m91533P1(sb, simpleType);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public boolean m91610t1() {
        return this.f65748l.m91689q0();
    }

    /* JADX INFO: renamed from: t2 */
    public final void m91611t2(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final String m91612u0() {
        int i = WhenMappings.f65752a[m91580j1().ordinal()];
        if (i == 1) {
            return m91615v0("->");
        }
        if (i == 2) {
            return "&rarr;";
        }
        l9r.m149037a();
        return null;
    }

    /* JADX INFO: renamed from: u1 */
    public final String m91613u1() {
        return m91615v0(">");
    }

    /* JADX INFO: renamed from: u2 */
    public final void m91614u2(ClassDescriptor classDescriptor, StringBuilder sb) {
        if (m91608s1() || KotlinBuiltIns.m88193o0(classDescriptor.mo88458o())) {
            return;
        }
        Collection<KotlinType> collectionMo88678c = classDescriptor.mo88305l().mo88678c();
        collectionMo88678c.getClass();
        if (collectionMo88678c.isEmpty()) {
            return;
        }
        if (collectionMo88678c.size() == 1 && KotlinBuiltIns.m88179c0(collectionMo88678c.iterator().next())) {
            return;
        }
        m91611t2(sb);
        sb.append(": ");
        CollectionsKt.joinTo$default(collectionMo88678c, sb, ", ", null, null, 0, null, new bvd(this), 60, null);
    }

    /* JADX INFO: renamed from: v0 */
    public final String m91615v0(String str) {
        return m91580j1().escape(str);
    }

    /* JADX INFO: renamed from: v1 */
    public final boolean m91616v1(KotlinType kotlinType) {
        return FunctionTypesKt.m88162s(kotlinType) || !kotlinType.getAnnotations().isEmpty();
    }

    /* JADX INFO: renamed from: w1 */
    public final Modality m91617w1(MemberDescriptor memberDescriptor) {
        if (memberDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) memberDescriptor).getKind() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        DeclarationDescriptor declarationDescriptorMo88299b = memberDescriptor.mo88299b();
        ClassDescriptor classDescriptor = declarationDescriptorMo88299b instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorMo88299b : null;
        if (classDescriptor == null) {
            return Modality.FINAL;
        }
        if (!(memberDescriptor instanceof CallableMemberDescriptor)) {
            return Modality.FINAL;
        }
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) memberDescriptor;
        Collection<? extends CallableMemberDescriptor> collectionMo88447e = callableMemberDescriptor.mo88447e();
        collectionMo88447e.getClass();
        if (!collectionMo88447e.isEmpty() && classDescriptor.mo88303i() != Modality.FINAL) {
            return Modality.OPEN;
        }
        if (classDescriptor.getKind() != ClassKind.INTERFACE || Intrinsics.m87488d(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.f64022a)) {
            return Modality.FINAL;
        }
        Modality modalityMo88303i = callableMemberDescriptor.mo88303i();
        Modality modality = Modality.ABSTRACT;
        return modalityMo88303i == modality ? modality : Modality.OPEN;
    }

    /* JADX INFO: renamed from: w2 */
    public final void m91618w2(FunctionDescriptor functionDescriptor, StringBuilder sb) {
        m91569f2(sb, functionDescriptor.isSuspend(), "suspend");
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m91619x1(AnnotationDescriptor annotationDescriptor) {
        return Intrinsics.m87488d(annotationDescriptor.mo88631d(), StandardNames.FqNames.f63841D);
    }

    /* JADX INFO: renamed from: x2 */
    public final void m91620x2(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb) {
        m91463F1(this, sb, typeAliasDescriptor, null, 2, null);
        DescriptorVisibility visibility = typeAliasDescriptor.getVisibility();
        visibility.getClass();
        m91523L2(visibility, sb);
        m91557b2(typeAliasDescriptor, sb);
        sb.append(m91551Z1("typealias"));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        m91572g2(typeAliasDescriptor, sb, true);
        List<TypeParameterDescriptor> listMo88309p = typeAliasDescriptor.mo88309p();
        listMo88309p.getClass();
        m91506F2(listMo88309p, sb, false);
        m91508G1(typeAliasDescriptor, sb);
        sb.append(" = ");
        sb.append(mo91452U(typeAliasDescriptor.mo88598v0()));
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m91621y0() {
        return this.f65748l.m91694w();
    }

    /* JADX INFO: renamed from: y1 */
    public final String m91622y1() {
        return m91615v0("<");
    }

    @NotNull
    /* JADX INFO: renamed from: y2 */
    public String m91623y2(@NotNull List<? extends TypeProjection> list) {
        list.getClass();
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m91622y1());
        m91607s0(sb, list);
        sb.append(m91613u1());
        return sb.toString();
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m91624z0() {
        return this.f65748l.m91695x();
    }

    /* JADX INFO: renamed from: z1 */
    public final boolean m91625z1(CallableMemberDescriptor callableMemberDescriptor) {
        return !callableMemberDescriptor.mo88447e().isEmpty();
    }

    @NotNull
    /* JADX INFO: renamed from: z2 */
    public String m91626z2(@NotNull TypeConstructor typeConstructor) {
        typeConstructor.getClass();
        ClassifierDescriptor classifierDescriptorMo88316e = typeConstructor.mo88316e();
        if ((classifierDescriptorMo88316e instanceof TypeParameterDescriptor) || (classifierDescriptorMo88316e instanceof ClassDescriptor) || (classifierDescriptorMo88316e instanceof TypeAliasDescriptor)) {
            return m91516J1(classifierDescriptorMo88316e);
        }
        if (classifierDescriptorMo88316e == null) {
            return typeConstructor instanceof IntersectionTypeConstructor ? ((IntersectionTypeConstructor) typeConstructor).m92621o(yud.INSTANCE) : typeConstructor.toString();
        }
        xdc0.m208279a("Unexpected classifier: ", classifierDescriptorMo88316e.getClass());
        return null;
    }
}
