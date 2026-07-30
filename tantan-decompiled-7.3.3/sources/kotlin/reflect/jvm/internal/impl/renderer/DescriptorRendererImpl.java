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
import kotlin.text.C15493d;
import kotlin.text.C15497h;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.emc0;
import p153l.jwd;
import p153l.kwd;
import p153l.lwd;
import p153l.mwd;
import p153l.nbr;
import p153l.nwd;
import p153l.owd;
import p153l.pwd;
import p153l.qwd;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {

    /* JADX INFO: renamed from: l */
    @NotNull
    public final DescriptorRendererOptionsImpl f66422l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Lazy f66423m;

    public final class RenderDeclarationDescriptorVisitor implements DeclarationDescriptorVisitor<Unit, StringBuilder> {

        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f66425a;

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
                f66425a = iArr;
            }
        }

        public RenderDeclarationDescriptorVisitor() {
        }

        /* JADX INFO: renamed from: A */
        public void m92518A(@NotNull ValueParameterDescriptor valueParameterDescriptor, @NotNull StringBuilder sb) {
            valueParameterDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m92405I2(valueParameterDescriptor, true, sb, true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ Unit mo89356a(ClassDescriptor classDescriptor, StringBuilder sb) {
            m92519n(classDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ Unit mo89357b(PackageViewDescriptor packageViewDescriptor, StringBuilder sb) {
            m92524s(packageViewDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: c */
        public /* bridge */ /* synthetic */ Unit mo88561c(PropertyDescriptor propertyDescriptor, StringBuilder sb) {
            m92526u(propertyDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: d */
        public /* bridge */ /* synthetic */ Unit mo89358d(PropertySetterDescriptor propertySetterDescriptor, StringBuilder sb) {
            m92528w(propertySetterDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ Unit mo89359e(ValueParameterDescriptor valueParameterDescriptor, StringBuilder sb) {
            m92518A(valueParameterDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: f */
        public /* bridge */ /* synthetic */ Unit mo88734f(ConstructorDescriptor constructorDescriptor, StringBuilder sb) {
            m92520o(constructorDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: g */
        public /* bridge */ /* synthetic */ Unit mo89360g(ReceiverParameterDescriptor receiverParameterDescriptor, StringBuilder sb) {
            m92529x(receiverParameterDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: h */
        public /* bridge */ /* synthetic */ Unit mo89361h(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb) {
            m92531z(typeParameterDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: i */
        public /* bridge */ /* synthetic */ Unit mo89362i(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb) {
            m92530y(typeAliasDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: j */
        public /* bridge */ /* synthetic */ Unit mo89363j(PropertyGetterDescriptor propertyGetterDescriptor, StringBuilder sb) {
            m92527v(propertyGetterDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: k */
        public /* bridge */ /* synthetic */ Unit mo89364k(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb) {
            m92523r(packageFragmentDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: l */
        public /* bridge */ /* synthetic */ Unit mo88562l(FunctionDescriptor functionDescriptor, StringBuilder sb) {
            m92521p(functionDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Unit mo89365m(ModuleDescriptor moduleDescriptor, StringBuilder sb) {
            m92522q(moduleDescriptor, sb);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: n */
        public void m92519n(@NotNull ClassDescriptor classDescriptor, @NotNull StringBuilder sb) {
            classDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m92402H1(classDescriptor, sb);
        }

        /* JADX INFO: renamed from: o */
        public void m92520o(@NotNull ConstructorDescriptor constructorDescriptor, @NotNull StringBuilder sb) {
            constructorDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m92416M1(constructorDescriptor, sb);
        }

        /* JADX INFO: renamed from: p */
        public void m92521p(@NotNull FunctionDescriptor functionDescriptor, @NotNull StringBuilder sb) {
            functionDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m92436W1(functionDescriptor, sb);
        }

        /* JADX INFO: renamed from: q */
        public void m92522q(@NotNull ModuleDescriptor moduleDescriptor, @NotNull StringBuilder sb) {
            moduleDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m92463g2(moduleDescriptor, sb, true);
        }

        /* JADX INFO: renamed from: r */
        public void m92523r(@NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull StringBuilder sb) {
            packageFragmentDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m92475k2(packageFragmentDescriptor, sb);
        }

        /* JADX INFO: renamed from: s */
        public void m92524s(@NotNull PackageViewDescriptor packageViewDescriptor, @NotNull StringBuilder sb) {
            packageViewDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m92481m2(packageViewDescriptor, sb);
        }

        /* JADX INFO: renamed from: t */
        public final void m92525t(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb, String str) {
            int i = WhenMappings.f66425a[DescriptorRendererImpl.this.m92431U0().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    m92521p(propertyAccessorDescriptor, sb);
                    return;
                } else {
                    if (i == 3) {
                        return;
                    }
                    nbr.m162172a();
                    return;
                }
            }
            DescriptorRendererImpl.this.m92386B1(propertyAccessorDescriptor, sb);
            sb.append(str + " for ");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            PropertyDescriptor propertyDescriptorMo89473d0 = propertyAccessorDescriptor.mo89473d0();
            propertyDescriptorMo89473d0.getClass();
            descriptorRendererImpl.m92487o2(propertyDescriptorMo89473d0, sb);
        }

        /* JADX INFO: renamed from: u */
        public void m92526u(@NotNull PropertyDescriptor propertyDescriptor, @NotNull StringBuilder sb) {
            propertyDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m92487o2(propertyDescriptor, sb);
        }

        /* JADX INFO: renamed from: v */
        public void m92527v(@NotNull PropertyGetterDescriptor propertyGetterDescriptor, @NotNull StringBuilder sb) {
            propertyGetterDescriptor.getClass();
            sb.getClass();
            m92525t(propertyGetterDescriptor, sb, "getter");
        }

        /* JADX INFO: renamed from: w */
        public void m92528w(@NotNull PropertySetterDescriptor propertySetterDescriptor, @NotNull StringBuilder sb) {
            propertySetterDescriptor.getClass();
            sb.getClass();
            m92525t(propertySetterDescriptor, sb, "setter");
        }

        /* JADX INFO: renamed from: x */
        public void m92529x(@NotNull ReceiverParameterDescriptor receiverParameterDescriptor, @NotNull StringBuilder sb) {
            receiverParameterDescriptor.getClass();
            sb.getClass();
            sb.append(receiverParameterDescriptor.getName());
        }

        /* JADX INFO: renamed from: y */
        public void m92530y(@NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull StringBuilder sb) {
            typeAliasDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m92511x2(typeAliasDescriptor, sb);
        }

        /* JADX INFO: renamed from: z */
        public void m92531z(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull StringBuilder sb) {
            typeParameterDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.this.m92392D2(typeParameterDescriptor, sb, true);
        }
    }

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66426a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f66427b;

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
            f66426a = iArr;
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
            f66427b = iArr2;
        }
    }

    public DescriptorRendererImpl(@NotNull DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        descriptorRendererOptionsImpl.getClass();
        this.f66422l = descriptorRendererOptionsImpl;
        descriptorRendererOptionsImpl.m92581r0();
        this.f66423m = LazyKt__LazyJVMKt.m88118b(new jwd(this));
    }

    /* JADX INFO: renamed from: A2 */
    public static final Object m92352A2(KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType instanceof StubTypeForBuilderInference ? ((StubTypeForBuilderInference) kotlinType).m93393P0() : kotlinType;
    }

    /* JADX INFO: renamed from: C2 */
    public static /* synthetic */ void m92353C2(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb, KotlinType kotlinType, TypeConstructor typeConstructor, int i, Object obj) {
        if ((i & 2) != 0) {
            typeConstructor = kotlinType.mo92781G0();
        }
        descriptorRendererImpl.m92387B2(sb, kotlinType, typeConstructor);
    }

    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m92354F1(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget, int i, Object obj) {
        if ((i & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        descriptorRendererImpl.m92394E1(sb, annotated, annotationUseSiteTarget);
    }

    /* JADX INFO: renamed from: H2 */
    public static /* synthetic */ void m92355H2(DescriptorRendererImpl descriptorRendererImpl, VariableDescriptor variableDescriptor, StringBuilder sb, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        descriptorRendererImpl.m92400G2(variableDescriptor, sb, z);
    }

    /* JADX INFO: renamed from: N1 */
    public static final CharSequence m92356N1(ValueParameterDescriptor valueParameterDescriptor) {
        return "";
    }

    /* JADX INFO: renamed from: S1 */
    public static final String m92357S1(DescriptorRendererImpl descriptorRendererImpl, KotlinBuiltIns kotlinBuiltIns) {
        ClassifierNamePolicy classifierNamePolicyM92390D0 = descriptorRendererImpl.m92390D0();
        ClassDescriptor classDescriptorM89138x = kotlinBuiltIns.m89138x();
        classDescriptorM89138x.getClass();
        return StringsKt.m94316V0(classifierNamePolicyM92390D0.mo92312a(classDescriptorM89138x, descriptorRendererImpl), "Collection", null, 2, null);
    }

    /* JADX INFO: renamed from: T1 */
    public static final String m92358T1(DescriptorRendererImpl descriptorRendererImpl, KotlinBuiltIns kotlinBuiltIns) {
        ClassifierNamePolicy classifierNamePolicyM92390D0 = descriptorRendererImpl.m92390D0();
        ClassDescriptor classDescriptorM89124j = kotlinBuiltIns.m89124j();
        classDescriptorM89124j.getClass();
        return StringsKt.m94316V0(classifierNamePolicyM92390D0.mo92312a(classDescriptorM89124j, descriptorRendererImpl), "Array", null, 2, null);
    }

    /* JADX INFO: renamed from: t0 */
    public static final CharSequence m92379t0(DescriptorRendererImpl descriptorRendererImpl, TypeProjection typeProjection) {
        typeProjection.getClass();
        if (typeProjection.mo93557b()) {
            return "*";
        }
        KotlinType type = typeProjection.getType();
        type.getClass();
        String strMo92343U = descriptorRendererImpl.mo92343U(type);
        if (typeProjection.mo93558c() == Variance.INVARIANT) {
            return strMo92343U;
        }
        return typeProjection.mo93558c() + ' ' + strMo92343U;
    }

    /* JADX INFO: renamed from: v2 */
    public static final CharSequence m92380v2(DescriptorRendererImpl descriptorRendererImpl, KotlinType kotlinType) {
        kotlinType.getClass();
        return descriptorRendererImpl.mo92343U(kotlinType);
    }

    /* JADX INFO: renamed from: w0 */
    public static final DescriptorRendererImpl m92381w0(DescriptorRendererImpl descriptorRendererImpl) {
        DescriptorRenderer descriptorRendererM92345W = descriptorRendererImpl.m92345W(qwd.INSTANCE);
        descriptorRendererM92345W.getClass();
        return (DescriptorRendererImpl) descriptorRendererM92345W;
    }

    /* JADX INFO: renamed from: x0 */
    public static final Unit m92382x0(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo92458f(SetsKt.plus((Set) descriptorRendererOptions.mo92449c(), (Iterable) CollectionsKt.listOf((Object[]) new FqName[]{StandardNames.FqNames.f64511B, StandardNames.FqNames.f64513C})));
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: A0 */
    public Function1<AnnotationDescriptor, Boolean> m92383A0() {
        return this.f66422l.m92587y();
    }

    /* JADX INFO: renamed from: A1 */
    public final void m92384A1(StringBuilder sb, AbbreviatedType abbreviatedType) {
        RenderingFormat renderingFormatM92471j1 = m92471j1();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (renderingFormatM92471j1 == renderingFormat) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* ");
        sb.append("from: ");
        m92469i2(sb, abbreviatedType.m93378S0());
        sb.append(" */");
        if (m92471j1() == renderingFormat) {
            sb.append("</i></font>");
        }
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m92385B0() {
        return this.f66422l.m92588z();
    }

    /* JADX INFO: renamed from: B1 */
    public final void m92386B1(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb) {
        m92448b2(propertyAccessorDescriptor, sb);
    }

    /* JADX INFO: renamed from: B2 */
    public final void m92387B2(StringBuilder sb, KotlinType kotlinType, TypeConstructor typeConstructor) {
        PossiblyInnerType possiblyInnerTypeM89497d = TypeParameterUtilsKt.m89497d(kotlinType);
        if (possiblyInnerTypeM89497d != null) {
            m92484n2(sb, possiblyInnerTypeM89497d);
        } else {
            sb.append(m92517z2(typeConstructor));
            sb.append(m92514y2(kotlinType.mo92779E0()));
        }
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m92388C0() {
        return this.f66422l.m92538A();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX INFO: renamed from: C1 */
    public final void m92389C1(FunctionDescriptor functionDescriptor, StringBuilder sb) {
        boolean z;
        boolean z2 = false;
        if (functionDescriptor.isOperator()) {
            Collection<? extends FunctionDescriptor> collectionMo89338e = functionDescriptor.mo89338e();
            collectionMo89338e.getClass();
            Collection<? extends FunctionDescriptor> collection = collectionMo89338e;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((FunctionDescriptor) it.next()).isOperator()) {
                            if (!m92515z0()) {
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
            Collection<? extends FunctionDescriptor> collectionMo89338e2 = functionDescriptor.mo89338e();
            collectionMo89338e2.getClass();
            Collection<? extends FunctionDescriptor> collection2 = collectionMo89338e2;
            if (collection2.isEmpty()) {
                z2 = true;
            } else {
                Iterator<T> it2 = collection2.iterator();
                while (it2.hasNext()) {
                    if (((FunctionDescriptor) it2.next()).isInfix()) {
                        if (m92515z0()) {
                            break;
                        }
                    }
                }
                z2 = true;
            }
        }
        m92460f2(sb, functionDescriptor.mo89215u(), "tailrec");
        m92509w2(functionDescriptor, sb);
        m92460f2(sb, functionDescriptor.isInline(), "inline");
        m92460f2(sb, z2, "infix");
        m92460f2(sb, z, "operator");
    }

    @NotNull
    /* JADX INFO: renamed from: D0 */
    public ClassifierNamePolicy m92390D0() {
        return this.f66422l.m92539B();
    }

    /* JADX INFO: renamed from: D1 */
    public final List<String> m92391D1(AnnotationDescriptor annotationDescriptor) {
        ClassConstructorDescriptor classConstructorDescriptorMo89204v;
        List<ValueParameterDescriptor> listMo89339g;
        Map<Name, ConstantValue<?>> mapMo89521a = annotationDescriptor.mo89521a();
        List listEmptyList = null;
        ClassDescriptor classDescriptorM92870l = m92444a1() ? DescriptorUtilsKt.m92870l(annotationDescriptor) : null;
        if (classDescriptorM92870l != null && (classConstructorDescriptorMo89204v = classDescriptorM92870l.mo89204v()) != null && (listMo89339g = classConstructorDescriptorMo89204v.mo89339g()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listMo89339g) {
                if (((ValueParameterDescriptor) obj).mo89506M()) {
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
            if (!mapMo89521a.containsKey((Name) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Name) it2.next()).m91973b() + " = ...");
        }
        Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = mapMo89521a.entrySet();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
        Iterator<T> it3 = setEntrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            Name name = (Name) entry.getKey();
            ConstantValue<?> constantValue = (ConstantValue) entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(name.m91973b());
            sb.append(" = ");
            sb.append(!listEmptyList.contains(name) ? m92413L1(constantValue) : "...");
            arrayList5.add(sb.toString());
        }
        return CollectionsKt.sorted(CollectionsKt.plus((Collection) arrayList4, (Iterable) arrayList5));
    }

    /* JADX INFO: renamed from: D2 */
    public final void m92392D2(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(m92513y1());
        }
        if (m92486o1()) {
            sb.append("/*");
            sb.append(typeParameterDescriptor.getIndex());
            sb.append("*/ ");
        }
        m92460f2(sb, typeParameterDescriptor.mo89493s(), "reified");
        String label = typeParameterDescriptor.mo89492h().getLabel();
        boolean z2 = true;
        m92460f2(sb, label.length() > 0, label);
        m92354F1(this, sb, typeParameterDescriptor, null, 2, null);
        m92463g2(typeParameterDescriptor, sb, z);
        int size = typeParameterDescriptor.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            KotlinType next = typeParameterDescriptor.getUpperBounds().iterator().next();
            if (!KotlinBuiltIns.m89080k0(next)) {
                sb.append(" : ");
                next.getClass();
                sb.append(mo92343U(next));
            }
        } else if (z) {
            for (KotlinType kotlinType : typeParameterDescriptor.getUpperBounds()) {
                if (!KotlinBuiltIns.m89080k0(kotlinType)) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    kotlinType.getClass();
                    sb.append(mo92343U(kotlinType));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(m92504u1());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: E0 */
    public Function1<ValueParameterDescriptor, String> m92393E0() {
        return this.f66422l.m92540C();
    }

    /* JADX INFO: renamed from: E1 */
    public final void m92394E1(StringBuilder sb, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (m92418N0().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            Set<FqName> setMo92449c = annotated instanceof KotlinType ? mo92449c() : m92398G0();
            Function1<AnnotationDescriptor, Boolean> function1M92383A0 = m92383A0();
            for (AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
                if (!CollectionsKt.contains(setMo92449c, annotationDescriptor.mo89522d()) && !m92510x1(annotationDescriptor) && (function1M92383A0 == null || function1M92383A0.invoke(annotationDescriptor).booleanValue())) {
                    sb.append(mo92339P(annotationDescriptor, annotationUseSiteTarget));
                    if (m92396F0()) {
                        sb.append('\n');
                    } else {
                        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: E2 */
    public final void m92395E2(StringBuilder sb, List<? extends TypeParameterDescriptor> list) {
        Iterator<? extends TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            m92392D2(it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m92396F0() {
        return this.f66422l.m92541D();
    }

    /* JADX INFO: renamed from: F2 */
    public final void m92397F2(List<? extends TypeParameterDescriptor> list, StringBuilder sb, boolean z) {
        if (m92501t1() || list.isEmpty()) {
            return;
        }
        sb.append(m92513y1());
        m92395E2(sb, list);
        sb.append(m92504u1());
        if (z) {
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: G0 */
    public Set<FqName> m92398G0() {
        return this.f66422l.m92542E();
    }

    /* JADX INFO: renamed from: G1 */
    public final void m92399G1(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, StringBuilder sb) {
        List<TypeParameterDescriptor> listMo89200p = classifierDescriptorWithTypeParameters.mo89200p();
        listMo89200p.getClass();
        List<TypeParameterDescriptor> parameters = classifierDescriptorWithTypeParameters.mo89196l().getParameters();
        parameters.getClass();
        if (m92486o1() && classifierDescriptorWithTypeParameters.mo89203t() && parameters.size() > listMo89200p.size()) {
            sb.append(" /*captured type parameters: ");
            m92395E2(sb, parameters.subList(listMo89200p.size(), parameters.size()));
            sb.append("*/");
        }
    }

    /* JADX INFO: renamed from: G2 */
    public final void m92400G2(VariableDescriptor variableDescriptor, StringBuilder sb, boolean z) {
        if (z || !(variableDescriptor instanceof ValueParameterDescriptor)) {
            sb.append(m92442Z1(variableDescriptor.mo89511y() ? "var" : "val"));
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final DescriptorRendererImpl m92401H0() {
        return (DescriptorRendererImpl) this.f66423m.getValue();
    }

    /* JADX INFO: renamed from: H1 */
    public final void m92402H1(ClassDescriptor classDescriptor, StringBuilder sb) {
        ClassConstructorDescriptor classConstructorDescriptorMo89204v;
        boolean z = classDescriptor.getKind() == ClassKind.ENUM_ENTRY;
        if (!m92468i1()) {
            List<ReceiverParameterDescriptor> listMo89348f0 = classDescriptor.mo89348f0();
            listMo89348f0.getClass();
            m92421O1(listMo89348f0, sb);
            m92354F1(this, sb, classDescriptor, null, 2, null);
            if (!z) {
                DescriptorVisibility visibility = classDescriptor.getVisibility();
                visibility.getClass();
                m92414L2(visibility, sb);
            }
            if ((classDescriptor.getKind() != ClassKind.INTERFACE || classDescriptor.mo89194i() != Modality.ABSTRACT) && (!classDescriptor.getKind().isSingleton() || classDescriptor.mo89194i() != Modality.FINAL)) {
                Modality modalityMo89194i = classDescriptor.mo89194i();
                modalityMo89194i.getClass();
                m92454d2(modalityMo89194i, sb, m92508w1(classDescriptor));
            }
            m92448b2(classDescriptor, sb);
            m92460f2(sb, m92418N0().contains(DescriptorRendererModifier.INNER) && classDescriptor.mo89203t(), "inner");
            m92460f2(sb, m92418N0().contains(DescriptorRendererModifier.DATA) && classDescriptor.mo89181C0(), "data");
            m92460f2(sb, m92418N0().contains(DescriptorRendererModifier.INLINE) && classDescriptor.isInline(), "inline");
            m92460f2(sb, m92418N0().contains(DescriptorRendererModifier.VALUE) && classDescriptor.mo89202q(), "value");
            m92460f2(sb, m92418N0().contains(DescriptorRendererModifier.FUN) && classDescriptor.mo89195j0(), "fun");
            m92404I1(classDescriptor, sb);
        }
        if (DescriptorUtils.m92674x(classDescriptor)) {
            m92410K1(classDescriptor, sb);
        } else {
            if (!m92468i1()) {
                m92502t2(sb);
            }
            m92463g2(classDescriptor, sb, true);
        }
        if (z) {
            return;
        }
        List<TypeParameterDescriptor> listMo89200p = classDescriptor.mo89200p();
        listMo89200p.getClass();
        m92397F2(listMo89200p, sb, false);
        m92399G1(classDescriptor, sb);
        if (!classDescriptor.getKind().isSingleton() && m92388C0() && (classConstructorDescriptorMo89204v = classDescriptor.mo89204v()) != null) {
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            m92354F1(this, sb, classConstructorDescriptorMo89204v, null, 2, null);
            DescriptorVisibility visibility2 = classConstructorDescriptorMo89204v.getVisibility();
            visibility2.getClass();
            m92414L2(visibility2, sb);
            sb.append(m92442Z1("constructor"));
            List<ValueParameterDescriptor> listMo89339g = classConstructorDescriptorMo89204v.mo89339g();
            listMo89339g.getClass();
            m92408J2(listMo89339g, classConstructorDescriptorMo89204v.mo89340k0(), sb);
        }
        m92505u2(classDescriptor, sb);
        m92417M2(listMo89200p, sb);
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m92403I0() {
        return this.f66422l.m92543F();
    }

    /* JADX INFO: renamed from: I1 */
    public final void m92404I1(ClassDescriptor classDescriptor, StringBuilder sb) {
        sb.append(m92442Z1(DescriptorRenderer.Companion.m92346a(classDescriptor)));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX INFO: renamed from: I2 */
    public final void m92405I2(ValueParameterDescriptor valueParameterDescriptor, boolean z, StringBuilder sb, boolean z2) {
        boolean z3;
        if (z2) {
            sb.append(m92442Z1("value-parameter"));
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        if (m92486o1()) {
            sb.append("/*");
            sb.append(valueParameterDescriptor.getIndex());
            sb.append("*/ ");
        }
        m92354F1(this, sb, valueParameterDescriptor, null, 2, null);
        m92460f2(sb, valueParameterDescriptor.mo89508t0(), "crossinline");
        m92460f2(sb, valueParameterDescriptor.mo89507r0(), "noinline");
        boolean z4 = false;
        if (m92453d1()) {
            CallableDescriptor callableDescriptorMo89190b = valueParameterDescriptor.mo89190b();
            ClassConstructorDescriptor classConstructorDescriptor = callableDescriptorMo89190b instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) callableDescriptorMo89190b : null;
            if (classConstructorDescriptor == null || !classConstructorDescriptor.mo89354i0()) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            m92460f2(sb, m92512y0(), "actual");
        }
        m92411K2(valueParameterDescriptor, z, sb, z2, z3);
        if (m92393E0() != null) {
            if (mo92452d() ? valueParameterDescriptor.mo89506M() : DescriptorUtilsKt.m92864f(valueParameterDescriptor)) {
                z4 = true;
            }
        }
        if (z4) {
            StringBuilder sb2 = new StringBuilder(" = ");
            Function1<ValueParameterDescriptor, String> function1M92393E0 = m92393E0();
            function1M92393E0.getClass();
            sb2.append(function1M92393E0.invoke(valueParameterDescriptor));
            sb.append(sb2.toString());
        }
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m92406J0() {
        return this.f66422l.m92544G();
    }

    @NotNull
    /* JADX INFO: renamed from: J1 */
    public String m92407J1(@NotNull ClassifierDescriptor classifierDescriptor) {
        classifierDescriptor.getClass();
        return ErrorUtils.m93894m(classifierDescriptor) ? classifierDescriptor.mo89196l().toString() : m92390D0().mo92312a(classifierDescriptor, this);
    }

    /* JADX INFO: renamed from: J2 */
    public final void m92408J2(Collection<? extends ValueParameterDescriptor> collection, boolean z, StringBuilder sb) {
        boolean zM92422O2 = m92422O2(z);
        int size = collection.size();
        m92483n1().mo92348a(size, sb);
        int i = 0;
        for (ValueParameterDescriptor valueParameterDescriptor : collection) {
            m92483n1().mo92350c(valueParameterDescriptor, i, size, sb);
            m92405I2(valueParameterDescriptor, zM92422O2, sb, false);
            m92483n1().mo92351d(valueParameterDescriptor, i, size, sb);
            i++;
        }
        m92483n1().mo92349b(size, sb);
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m92409K0() {
        return this.f66422l.m92545H();
    }

    /* JADX INFO: renamed from: K1 */
    public final void m92410K1(DeclarationDescriptor declarationDescriptor, StringBuilder sb) {
        if (m92437X0()) {
            if (m92468i1()) {
                sb.append("companion object");
            }
            m92502t2(sb);
            DeclarationDescriptor declarationDescriptorMo89190b = declarationDescriptor.mo89190b();
            if (declarationDescriptorMo89190b != null) {
                sb.append("of ");
                Name name = declarationDescriptorMo89190b.getName();
                name.getClass();
                sb.append(mo92342T(name, false));
            }
        }
        if (m92486o1() || !Intrinsics.m88377d(declarationDescriptor.getName(), SpecialNames.f66162c)) {
            if (!m92468i1()) {
                m92502t2(sb);
            }
            Name name2 = declarationDescriptor.getName();
            name2.getClass();
            sb.append(mo92342T(name2, true));
        }
    }

    /* JADX INFO: renamed from: K2 */
    public final void m92411K2(VariableDescriptor variableDescriptor, boolean z, StringBuilder sb, boolean z2, boolean z3) {
        KotlinType type = variableDescriptor.getType();
        type.getClass();
        ValueParameterDescriptor valueParameterDescriptor = variableDescriptor instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) variableDescriptor : null;
        KotlinType kotlinTypeMo89509w0 = valueParameterDescriptor != null ? valueParameterDescriptor.mo89509w0() : null;
        KotlinType kotlinType = kotlinTypeMo89509w0 == null ? type : kotlinTypeMo89509w0;
        m92460f2(sb, kotlinTypeMo89509w0 != null, "vararg");
        if (z3 || (z2 && !m92468i1())) {
            m92400G2(variableDescriptor, sb, z3);
        }
        if (z) {
            m92463g2(variableDescriptor, sb, z2);
            sb.append(": ");
        }
        sb.append(mo92343U(kotlinType));
        m92440Y1(variableDescriptor, sb);
        if (!m92486o1() || kotlinTypeMo89509w0 == null) {
            return;
        }
        sb.append(" /*");
        sb.append(mo92343U(type));
        sb.append("*/");
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m92412L0() {
        return this.f66422l.m92546I();
    }

    /* JADX INFO: renamed from: L1 */
    public final String m92413L1(ConstantValue<?> constantValue) {
        Function1<ConstantValue<?>, String> function1M92555R = this.f66422l.m92555R();
        if (function1M92555R != null) {
            return function1M92555R.invoke(constantValue);
        }
        if (constantValue instanceof ArrayValue) {
            List<? extends ConstantValue<?>> listMo92809b = ((ArrayValue) constantValue).mo92809b();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listMo92809b.iterator();
            while (it.hasNext()) {
                String strM92413L1 = m92413L1((ConstantValue) it.next());
                if (strM92413L1 != null) {
                    arrayList.add(strM92413L1);
                }
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (constantValue instanceof AnnotationValue) {
            return StringsKt.m94347w0(DescriptorRenderer.m92329Q(this, ((AnnotationValue) constantValue).mo92809b(), null, 2, null), "@");
        }
        if (!(constantValue instanceof KClassValue)) {
            return constantValue.toString();
        }
        KClassValue.Value valueMo92809b = ((KClassValue) constantValue).mo92809b();
        if (valueMo92809b instanceof KClassValue.Value.LocalClass) {
            return ((KClassValue.Value.LocalClass) valueMo92809b).m92841a() + "::class";
        }
        if (!(valueMo92809b instanceof KClassValue.Value.NormalClass)) {
            nbr.m162172a();
            return null;
        }
        KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) valueMo92809b;
        String strM91937a = normalClass.m92843b().m91925a().m91937a();
        for (int i = 0; i < normalClass.m92842a(); i++) {
            strM91937a = "kotlin.Array<" + strM91937a + '>';
        }
        return strM91937a + "::class";
    }

    /* JADX INFO: renamed from: L2 */
    public final boolean m92414L2(DescriptorVisibility descriptorVisibility, StringBuilder sb) {
        if (!m92418N0().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (m92420O0()) {
            descriptorVisibility = descriptorVisibility.mo89368f();
        }
        if (!m92450c1() && Intrinsics.m88377d(descriptorVisibility, DescriptorVisibilities.f64707l)) {
            return false;
        }
        sb.append(m92442Z1(descriptorVisibility.mo89367c()));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        return true;
    }

    /* JADX INFO: renamed from: M0 */
    public boolean m92415M0() {
        return this.f66422l.m92547J();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    /* JADX INFO: renamed from: M1 */
    public final void m92416M1(ConstructorDescriptor constructorDescriptor, StringBuilder sb) {
        boolean z;
        ClassConstructorDescriptor classConstructorDescriptorMo89204v;
        m92354F1(this, sb, constructorDescriptor, null, 2, null);
        if (this.f66422l.m92563Z() || constructorDescriptor.mo89353F().mo89194i() != Modality.SEALED) {
            DescriptorVisibility visibility = constructorDescriptor.getVisibility();
            visibility.getClass();
            if (m92414L2(visibility, sb)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        m92445a2(constructorDescriptor, sb);
        boolean z2 = m92441Z0() || !constructorDescriptor.mo89354i0() || z;
        if (z2) {
            sb.append(m92442Z1("constructor"));
        }
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParametersMo89190b = constructorDescriptor.mo89190b();
        classifierDescriptorWithTypeParametersMo89190b.getClass();
        if (m92462g1()) {
            if (z2) {
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
            m92463g2(classifierDescriptorWithTypeParametersMo89190b, sb, true);
            List<TypeParameterDescriptor> typeParameters = constructorDescriptor.getTypeParameters();
            typeParameters.getClass();
            m92397F2(typeParameters, sb, false);
        }
        List<ValueParameterDescriptor> listMo89339g = constructorDescriptor.mo89339g();
        listMo89339g.getClass();
        m92408J2(listMo89339g, constructorDescriptor.mo89340k0(), sb);
        if (m92439Y0() && !constructorDescriptor.mo89354i0() && (classifierDescriptorWithTypeParametersMo89190b instanceof ClassDescriptor) && (classConstructorDescriptorMo89204v = ((ClassDescriptor) classifierDescriptorWithTypeParametersMo89190b).mo89204v()) != null) {
            List<ValueParameterDescriptor> listMo89339g2 = classConstructorDescriptorMo89204v.mo89339g();
            listMo89339g2.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listMo89339g2) {
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) obj;
                if (!valueParameterDescriptor.mo89506M() && valueParameterDescriptor.mo89509w0() == null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" : ");
                sb.append(m92442Z1("this"));
                sb.append(CollectionsKt.joinToString$default(arrayList, ", ", "(", ")", 0, null, owd.INSTANCE, 24, null));
            }
        }
        if (m92462g1()) {
            List<TypeParameterDescriptor> typeParameters2 = constructorDescriptor.getTypeParameters();
            typeParameters2.getClass();
            m92417M2(typeParameters2, sb);
        }
    }

    /* JADX INFO: renamed from: M2 */
    public final void m92417M2(List<? extends TypeParameterDescriptor> list, StringBuilder sb) {
        if (m92501t1()) {
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
                sb2.append(mo92342T(name, false));
                sb2.append(" : ");
                kotlinType.getClass();
                sb2.append(mo92343U(kotlinType));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(m92442Z1("where"));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        CollectionsKt.joinTo$default(arrayList, sb, ", ", null, null, 0, null, null, 124, null);
    }

    @NotNull
    /* JADX INFO: renamed from: N0 */
    public Set<DescriptorRendererModifier> m92418N0() {
        return this.f66422l.m92548K();
    }

    /* JADX INFO: renamed from: N2 */
    public final boolean m92419N2(KotlinType kotlinType) {
        if (!FunctionTypesKt.m89050p(kotlinType)) {
            return false;
        }
        List<TypeProjection> listMo92779E0 = kotlinType.mo92779E0();
        if ((listMo92779E0 instanceof Collection) && listMo92779E0.isEmpty()) {
            return true;
        }
        Iterator<T> it = listMo92779E0.iterator();
        while (it.hasNext()) {
            if (((TypeProjection) it.next()).mo93557b()) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* JADX INFO: renamed from: O */
    public String mo92338O(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        StringBuilder sb = new StringBuilder();
        declarationDescriptor.mo89355S(new RenderDeclarationDescriptorVisitor(), sb);
        if (m92489p1()) {
            m92495r0(sb, declarationDescriptor);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: O0 */
    public boolean m92420O0() {
        return this.f66422l.m92549L();
    }

    /* JADX INFO: renamed from: O1 */
    public final void m92421O1(List<? extends ReceiverParameterDescriptor> list, StringBuilder sb) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        int i = 0;
        for (ReceiverParameterDescriptor receiverParameterDescriptor : list) {
            int i2 = i + 1;
            m92394E1(sb, receiverParameterDescriptor, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = receiverParameterDescriptor.getType();
            type.getClass();
            sb.append(m92432U1(type));
            if (i == CollectionsKt.getLastIndex(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: O2 */
    public final boolean m92422O2(boolean z) {
        int i = WhenMappings.f66427b[m92427R0().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return !z;
        }
        if (i == 3) {
            return false;
        }
        nbr.m162172a();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* JADX INFO: renamed from: P */
    public String mo92339P(@NotNull AnnotationDescriptor annotationDescriptor, @Nullable AnnotationUseSiteTarget annotationUseSiteTarget) {
        annotationDescriptor.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (annotationUseSiteTarget != null) {
            sb.append(annotationUseSiteTarget.getRenderName() + ':');
        }
        KotlinType type = annotationDescriptor.getType();
        sb.append(mo92343U(type));
        if (m92406J0()) {
            List<String> listM92391D1 = m92391D1(annotationDescriptor);
            if (m92409K0() || !listM92391D1.isEmpty()) {
                CollectionsKt.joinTo$default(listM92391D1, sb, ", ", "(", ")", 0, null, null, 112, null);
            }
        }
        if (m92486o1() && (KotlinTypeKt.m93535a(type) || (type.mo92781G0().mo89207e() instanceof NotFoundClasses.MockClassDescriptor))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public final DescriptorRendererOptionsImpl m92423P0() {
        return this.f66422l;
    }

    /* JADX INFO: renamed from: P1 */
    public final void m92424P1(StringBuilder sb, KotlinType kotlinType) {
        m92354F1(this, sb, kotlinType, null, 2, null);
        DefinitelyNotNullType definitelyNotNullType = kotlinType instanceof DefinitelyNotNullType ? (DefinitelyNotNullType) kotlinType : null;
        SimpleType simpleTypeM93463S0 = definitelyNotNullType != null ? definitelyNotNullType.m93463S0() : null;
        if (KotlinTypeKt.m93535a(kotlinType)) {
            if (TypeUtilsKt.m93997z(kotlinType) && m92430T0()) {
                sb.append(m92426Q1(ErrorUtils.INSTANCE.m93906p(kotlinType)));
            } else {
                if (!(kotlinType instanceof ErrorType) || m92415M0()) {
                    sb.append(kotlinType.mo92781G0().toString());
                } else {
                    sb.append(((ErrorType) kotlinType).m93885P0());
                }
                sb.append(m92514y2(kotlinType.mo92779E0()));
            }
        } else if (kotlinType instanceof StubTypeForBuilderInference) {
            sb.append(((StubTypeForBuilderInference) kotlinType).m93393P0().toString());
        } else if (simpleTypeM93463S0 instanceof StubTypeForBuilderInference) {
            sb.append(((StubTypeForBuilderInference) simpleTypeM93463S0).m93393P0().toString());
        } else {
            m92353C2(this, sb, kotlinType, null, 2, null);
            Unit unit = Unit.INSTANCE;
        }
        if (kotlinType.mo90857H0()) {
            sb.append("?");
        }
        if (SpecialTypesKt.m93547c(kotlinType)) {
            sb.append(" & Any");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public OverrideRenderingPolicy m92425Q0() {
        return this.f66422l.m92550M();
    }

    /* JADX INFO: renamed from: Q1 */
    public final String m92426Q1(String str) {
        int i = WhenMappings.f66426a[m92471j1().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            nbr.m162172a();
            return null;
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* JADX INFO: renamed from: R */
    public String mo92340R(@NotNull String str, @NotNull String str2, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        str.getClass();
        str2.getClass();
        kotlinBuiltIns.getClass();
        if (RenderingUtilsKt.m92599j(str, str2)) {
            if (C15493d.m94374J(str2, "(", false, 2, null)) {
                return "(" + str + ")!";
            }
            return str + '!';
        }
        String strM92593d = RenderingUtilsKt.m92593d(str, str2, new kwd(this, kotlinBuiltIns), new lwd(this, kotlinBuiltIns), new DescriptorRendererImpl$renderFlexibleType$3(this));
        if (strM92593d != null) {
            return strM92593d;
        }
        return "(" + str + ".." + str2 + ')';
    }

    @NotNull
    /* JADX INFO: renamed from: R0 */
    public ParameterNameRenderingPolicy m92427R0() {
        return this.f66422l.m92551N();
    }

    /* JADX INFO: renamed from: R1 */
    public final void m92428R1(StringBuilder sb, AbbreviatedType abbreviatedType) {
        RenderingFormat renderingFormatM92471j1 = m92471j1();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (renderingFormatM92471j1 == renderingFormat) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* ");
        sb.append("= ");
        m92469i2(sb, abbreviatedType.m93381V());
        sb.append(" */");
        if (m92471j1() == renderingFormat) {
            sb.append("</i></font>");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* JADX INFO: renamed from: S */
    public String mo92341S(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return m92434V1(fqNameUnsafe.m91955h());
    }

    /* JADX INFO: renamed from: S0 */
    public boolean m92429S0() {
        return this.f66422l.m92552O();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* JADX INFO: renamed from: T */
    public String mo92342T(@NotNull Name name, boolean z) {
        name.getClass();
        String strM92506v0 = m92506v0(RenderingUtilsKt.m92592c(name));
        if (!m92385B0() || m92471j1() != RenderingFormat.HTML || !z) {
            return strM92506v0;
        }
        return "<b>" + strM92506v0 + "</b>";
    }

    /* JADX INFO: renamed from: T0 */
    public boolean m92430T0() {
        return this.f66422l.m92553P();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* JADX INFO: renamed from: U */
    public String mo92343U(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        StringBuilder sb = new StringBuilder();
        m92466h2(sb, m92474k1().invoke(kotlinType));
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: U0 */
    public PropertyAccessorRenderingPolicy m92431U0() {
        return this.f66422l.m92554Q();
    }

    /* JADX INFO: renamed from: U1 */
    public final String m92432U1(KotlinType kotlinType) {
        String strMo92343U = mo92343U(kotlinType);
        if ((!m92419N2(kotlinType) || TypeUtils.m93692l(kotlinType)) && !(kotlinType instanceof DefinitelyNotNullType)) {
            return strMo92343U;
        }
        return "(" + strMo92343U + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    /* JADX INFO: renamed from: V */
    public String mo92344V(@NotNull TypeProjection typeProjection) {
        typeProjection.getClass();
        StringBuilder sb = new StringBuilder();
        m92498s0(sb, CollectionsKt.listOf(typeProjection));
        return sb.toString();
    }

    /* JADX INFO: renamed from: V0 */
    public boolean m92433V0() {
        return this.f66422l.m92556S();
    }

    /* JADX INFO: renamed from: V1 */
    public final String m92434V1(List<Name> list) {
        return m92506v0(RenderingUtilsKt.m92596g(list));
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m92435W0() {
        return this.f66422l.m92557T();
    }

    /* JADX INFO: renamed from: W1 */
    public final void m92436W1(FunctionDescriptor functionDescriptor, StringBuilder sb) {
        DescriptorRendererImpl descriptorRendererImpl;
        FunctionDescriptor functionDescriptor2;
        StringBuilder sb2;
        if (m92468i1()) {
            descriptorRendererImpl = this;
            functionDescriptor2 = functionDescriptor;
            sb2 = sb;
        } else {
            if (m92465h1()) {
                descriptorRendererImpl = this;
                functionDescriptor2 = functionDescriptor;
                sb2 = sb;
            } else {
                List<ReceiverParameterDescriptor> listMo89341x0 = functionDescriptor.mo89341x0();
                listMo89341x0.getClass();
                m92421O1(listMo89341x0, sb);
                descriptorRendererImpl = this;
                functionDescriptor2 = functionDescriptor;
                sb2 = sb;
                m92354F1(descriptorRendererImpl, sb2, functionDescriptor2, null, 2, null);
                DescriptorVisibility visibility = functionDescriptor2.getVisibility();
                visibility.getClass();
                descriptorRendererImpl.m92414L2(visibility, sb2);
                descriptorRendererImpl.m92457e2(functionDescriptor2, sb2);
                if (descriptorRendererImpl.m92403I0()) {
                    descriptorRendererImpl.m92448b2(functionDescriptor2, sb2);
                }
                descriptorRendererImpl.m92472j2(functionDescriptor2, sb2);
                if (descriptorRendererImpl.m92403I0()) {
                    descriptorRendererImpl.m92389C1(functionDescriptor2, sb2);
                } else {
                    descriptorRendererImpl.m92509w2(functionDescriptor2, sb2);
                }
                descriptorRendererImpl.m92445a2(functionDescriptor2, sb2);
                if (descriptorRendererImpl.m92486o1()) {
                    if (functionDescriptor2.mo89403A0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (functionDescriptor2.mo89404O()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(descriptorRendererImpl.m92442Z1("fun"));
            sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            List<TypeParameterDescriptor> typeParameters = functionDescriptor2.getTypeParameters();
            typeParameters.getClass();
            descriptorRendererImpl.m92397F2(typeParameters, sb2, true);
            descriptorRendererImpl.m92493q2(functionDescriptor2, sb2);
        }
        descriptorRendererImpl.m92463g2(functionDescriptor2, sb2, true);
        List<ValueParameterDescriptor> listMo89339g = functionDescriptor2.mo89339g();
        listMo89339g.getClass();
        descriptorRendererImpl.m92408J2(listMo89339g, functionDescriptor2.mo89340k0(), sb2);
        descriptorRendererImpl.m92497r2(functionDescriptor2, sb2);
        KotlinType returnType = functionDescriptor2.getReturnType();
        if (!descriptorRendererImpl.m92496r1() && (descriptorRendererImpl.m92480m1() || returnType == null || !KotlinBuiltIns.m89061D0(returnType))) {
            sb2.append(": ");
            sb2.append(returnType == null ? "[NULL]" : descriptorRendererImpl.mo92343U(returnType));
        }
        List<TypeParameterDescriptor> typeParameters2 = functionDescriptor2.getTypeParameters();
        typeParameters2.getClass();
        descriptorRendererImpl.m92417M2(typeParameters2, sb2);
    }

    /* JADX INFO: renamed from: X0 */
    public boolean m92437X0() {
        return this.f66422l.m92558U();
    }

    /* JADX INFO: renamed from: X1 */
    public final void m92438X1(StringBuilder sb, KotlinType kotlinType) {
        Name nameM89038d;
        int length = sb.length();
        m92354F1(m92401H0(), sb, kotlinType, null, 2, null);
        boolean z = sb.length() != length;
        KotlinType kotlinTypeM89045k = FunctionTypesKt.m89045k(kotlinType);
        List<KotlinType> listM89039e = FunctionTypesKt.m89039e(kotlinType);
        boolean zM89053s = FunctionTypesKt.m89053s(kotlinType);
        boolean zMo90857H0 = kotlinType.mo90857H0();
        boolean z2 = zMo90857H0 || (z && kotlinTypeM89045k != null);
        if (z2) {
            if (zM89053s) {
                sb.insert(length, '(');
            } else {
                if (z) {
                    CharsKt.m94223b(C15497h.m94386c1(sb));
                    if (sb.charAt(StringsKt.m94317W(sb) - 1) != ')') {
                        sb.insert(StringsKt.m94317W(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        m92460f2(sb, zM89053s, "suspend");
        if (!listM89039e.isEmpty()) {
            sb.append("context(");
            Iterator<KotlinType> it = listM89039e.subList(0, CollectionsKt.getLastIndex(listM89039e)).iterator();
            while (it.hasNext()) {
                m92466h2(sb, it.next());
                sb.append(", ");
            }
            m92466h2(sb, (KotlinType) CollectionsKt.last((List) listM89039e));
            sb.append(") ");
        }
        if (kotlinTypeM89045k != null) {
            boolean z3 = (m92419N2(kotlinTypeM89045k) && !kotlinTypeM89045k.mo90857H0()) || m92507v1(kotlinTypeM89045k) || (kotlinTypeM89045k instanceof DefinitelyNotNullType);
            if (z3) {
                sb.append("(");
            }
            m92466h2(sb, kotlinTypeM89045k);
            if (z3) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!FunctionTypesKt.m89048n(kotlinType) || kotlinType.mo92779E0().size() > 1) {
            int i = 0;
            for (TypeProjection typeProjection : FunctionTypesKt.m89047m(kotlinType)) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append(", ");
                }
                if (m92429S0()) {
                    KotlinType type = typeProjection.getType();
                    type.getClass();
                    nameM89038d = FunctionTypesKt.m89038d(type);
                } else {
                    nameM89038d = null;
                }
                if (nameM89038d != null) {
                    sb.append(mo92342T(nameM89038d, false));
                    sb.append(": ");
                }
                sb.append(mo92344V(typeProjection));
                i = i2;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        sb.append(m92503u0());
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        m92466h2(sb, FunctionTypesKt.m89046l(kotlinType));
        if (z2) {
            sb.append(")");
        }
        if (zMo90857H0) {
            sb.append("?");
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public boolean m92439Y0() {
        return this.f66422l.m92559V();
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m92440Y1(VariableDescriptor variableDescriptor, StringBuilder sb) {
        ConstantValue<?> constantValueMo89510q0;
        String strM92413L1;
        if (!m92412L0() || (constantValueMo89510q0 = variableDescriptor.mo89510q0()) == null || (strM92413L1 = m92413L1(constantValueMo89510q0)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(m92506v0(strM92413L1));
    }

    /* JADX INFO: renamed from: Z0 */
    public boolean m92441Z0() {
        return this.f66422l.m92560W();
    }

    /* JADX INFO: renamed from: Z1 */
    public final String m92442Z1(String str) {
        int i = WhenMappings.f66426a[m92471j1().ordinal()];
        if (i != 1) {
            if (i != 2) {
                nbr.m162172a();
                return null;
            }
            if (!m92385B0()) {
                return "<b>" + str + "</b>";
            }
        }
        return str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: a */
    public void mo92443a(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        parameterNameRenderingPolicy.getClass();
        this.f66422l.mo92443a(parameterNameRenderingPolicy);
    }

    /* JADX INFO: renamed from: a1 */
    public boolean m92444a1() {
        return this.f66422l.m92561X();
    }

    /* JADX INFO: renamed from: a2 */
    public final void m92445a2(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (m92418N0().contains(DescriptorRendererModifier.MEMBER_KIND) && m92486o1() && callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb.append("/*");
            sb.append(CapitalizeDecapitalizeKt.m94066f(callableMemberDescriptor.getKind().name()));
            sb.append("*/ ");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: b */
    public boolean mo92446b() {
        return this.f66422l.mo92446b();
    }

    /* JADX INFO: renamed from: b1 */
    public boolean m92447b1() {
        return this.f66422l.m92562Y();
    }

    /* JADX INFO: renamed from: b2 */
    public final void m92448b2(MemberDescriptor memberDescriptor, StringBuilder sb) {
        m92460f2(sb, memberDescriptor.isExternal(), "external");
        boolean z = false;
        m92460f2(sb, m92418N0().contains(DescriptorRendererModifier.EXPECT) && memberDescriptor.mo89198n0(), "expect");
        if (m92418N0().contains(DescriptorRendererModifier.ACTUAL) && memberDescriptor.mo89192e0()) {
            z = true;
        }
        m92460f2(sb, z, "actual");
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    /* JADX INFO: renamed from: c */
    public Set<FqName> mo92449c() {
        return this.f66422l.mo92449c();
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m92450c1() {
        return this.f66422l.m92563Z();
    }

    @NotNull
    /* JADX INFO: renamed from: c2 */
    public String m92451c2(@NotNull String str) {
        str.getClass();
        int i = WhenMappings.f66426a[m92471j1().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            nbr.m162172a();
            return null;
        }
        return "<i>" + str + "</i>";
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: d */
    public boolean mo92452d() {
        return this.f66422l.mo92452d();
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m92453d1() {
        return this.f66422l.m92564a0();
    }

    /* JADX INFO: renamed from: d2 */
    public final void m92454d2(Modality modality, StringBuilder sb, Modality modality2) {
        if (m92447b1() || modality != modality2) {
            m92460f2(sb, m92418N0().contains(DescriptorRendererModifier.MODALITY), CapitalizeDecapitalizeKt.m94066f(modality.name()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    /* JADX INFO: renamed from: e */
    public AnnotationArgumentsRenderingPolicy mo92455e() {
        return this.f66422l.mo92455e();
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m92456e1() {
        return this.f66422l.m92565b0();
    }

    /* JADX INFO: renamed from: e2 */
    public final void m92457e2(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (DescriptorUtils.m92647J(callableMemberDescriptor) && callableMemberDescriptor.mo89194i() == Modality.FINAL) {
            return;
        }
        if (m92425Q0() == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.mo89194i() == Modality.OPEN && m92516z1(callableMemberDescriptor)) {
            return;
        }
        Modality modalityMo89194i = callableMemberDescriptor.mo89194i();
        modalityMo89194i.getClass();
        m92454d2(modalityMo89194i, sb, m92508w1(callableMemberDescriptor));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: f */
    public void mo92458f(@NotNull Set<FqName> set) {
        set.getClass();
        this.f66422l.mo92458f(set);
    }

    /* JADX INFO: renamed from: f1 */
    public boolean m92459f1() {
        return this.f66422l.m92566c0();
    }

    /* JADX INFO: renamed from: f2 */
    public final void m92460f2(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(m92442Z1(str));
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: g */
    public void mo92461g(@NotNull Set<? extends DescriptorRendererModifier> set) {
        set.getClass();
        this.f66422l.mo92461g(set);
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m92462g1() {
        return this.f66422l.m92567d0();
    }

    /* JADX INFO: renamed from: g2 */
    public final void m92463g2(DeclarationDescriptor declarationDescriptor, StringBuilder sb, boolean z) {
        Name name = declarationDescriptor.getName();
        name.getClass();
        sb.append(mo92342T(name, z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: h */
    public void mo92464h(boolean z) {
        this.f66422l.mo92464h(z);
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m92465h1() {
        return this.f66422l.m92568e0();
    }

    /* JADX INFO: renamed from: h2 */
    public final void m92466h2(StringBuilder sb, KotlinType kotlinType) {
        UnwrappedType unwrappedTypeMo93516J0 = kotlinType.mo93516J0();
        AbbreviatedType abbreviatedType = unwrappedTypeMo93516J0 instanceof AbbreviatedType ? (AbbreviatedType) unwrappedTypeMo93516J0 : null;
        if (abbreviatedType == null) {
            m92469i2(sb, kotlinType);
            return;
        }
        if (m92456e1()) {
            m92469i2(sb, abbreviatedType.m93381V());
            if (m92435W0()) {
                m92384A1(sb, abbreviatedType);
                return;
            }
            return;
        }
        m92469i2(sb, abbreviatedType.m93378S0());
        if (m92459f1()) {
            m92428R1(sb, abbreviatedType);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: i */
    public void mo92467i(boolean z) {
        this.f66422l.mo92467i(z);
    }

    /* JADX INFO: renamed from: i1 */
    public boolean m92468i1() {
        return this.f66422l.m92569f0();
    }

    /* JADX INFO: renamed from: i2 */
    public final void m92469i2(StringBuilder sb, KotlinType kotlinType) {
        if ((kotlinType instanceof WrappedType) && mo92452d() && !((WrappedType) kotlinType).mo93540L0()) {
            sb.append("<Not computed yet>");
            return;
        }
        UnwrappedType unwrappedTypeMo93516J0 = kotlinType.mo93516J0();
        if (unwrappedTypeMo93516J0 instanceof FlexibleType) {
            sb.append(((FlexibleType) unwrappedTypeMo93516J0).mo90787Q0(this, this));
        } else if (unwrappedTypeMo93516J0 instanceof SimpleType) {
            m92500s2(sb, (SimpleType) unwrappedTypeMo93516J0);
        } else {
            nbr.m162172a();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: j */
    public void mo92470j(boolean z) {
        this.f66422l.mo92470j(z);
    }

    @NotNull
    /* JADX INFO: renamed from: j1 */
    public RenderingFormat m92471j1() {
        return this.f66422l.m92570g0();
    }

    /* JADX INFO: renamed from: j2 */
    public final void m92472j2(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (m92418N0().contains(DescriptorRendererModifier.OVERRIDE) && m92516z1(callableMemberDescriptor) && m92425Q0() != OverrideRenderingPolicy.RENDER_OPEN) {
            m92460f2(sb, true, "override");
            if (m92486o1()) {
                sb.append("/*");
                sb.append(callableMemberDescriptor.mo89338e().size());
                sb.append("*/ ");
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: k */
    public void mo92473k(boolean z) {
        this.f66422l.mo92473k(z);
    }

    @NotNull
    /* JADX INFO: renamed from: k1 */
    public Function1<KotlinType, KotlinType> m92474k1() {
        return this.f66422l.m92571h0();
    }

    /* JADX INFO: renamed from: k2 */
    public final void m92475k2(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb) {
        m92478l2(packageFragmentDescriptor.mo89453d(), "package-fragment", sb);
        if (mo92452d()) {
            sb.append(" in ");
            m92463g2(packageFragmentDescriptor.mo89190b(), sb, false);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: l */
    public void mo92476l(boolean z) {
        this.f66422l.mo92476l(z);
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m92477l1() {
        return this.f66422l.m92572i0();
    }

    /* JADX INFO: renamed from: l2 */
    public final void m92478l2(FqName fqName, String str, StringBuilder sb) {
        sb.append(m92442Z1(str));
        String strMo92341S = mo92341S(fqName.m91945i());
        if (strMo92341S.length() > 0) {
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(strMo92341S);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: m */
    public void mo92479m(boolean z) {
        this.f66422l.mo92479m(z);
    }

    /* JADX INFO: renamed from: m1 */
    public boolean m92480m1() {
        return this.f66422l.m92573j0();
    }

    /* JADX INFO: renamed from: m2 */
    public final void m92481m2(PackageViewDescriptor packageViewDescriptor, StringBuilder sb) {
        m92478l2(packageViewDescriptor.mo89466d(), "package", sb);
        if (mo92452d()) {
            sb.append(" in context of ");
            m92463g2(packageViewDescriptor.mo89468z0(), sb, false);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: n */
    public void mo92482n(boolean z) {
        this.f66422l.mo92482n(z);
    }

    @NotNull
    /* JADX INFO: renamed from: n1 */
    public DescriptorRenderer.ValueParametersHandler m92483n1() {
        return this.f66422l.m92574k0();
    }

    /* JADX INFO: renamed from: n2 */
    public final void m92484n2(StringBuilder sb, PossiblyInnerType possiblyInnerType) {
        PossiblyInnerType possiblyInnerTypeM89471c = possiblyInnerType.m89471c();
        if (possiblyInnerTypeM89471c != null) {
            m92484n2(sb, possiblyInnerTypeM89471c);
            sb.append('.');
            Name name = possiblyInnerType.m89470b().getName();
            name.getClass();
            sb.append(mo92342T(name, false));
        } else {
            TypeConstructor typeConstructorMo89196l = possiblyInnerType.m89470b().mo89196l();
            typeConstructorMo89196l.getClass();
            sb.append(m92517z2(typeConstructorMo89196l));
        }
        sb.append(m92514y2(possiblyInnerType.m89469a()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: o */
    public void mo92485o(@NotNull RenderingFormat renderingFormat) {
        renderingFormat.getClass();
        this.f66422l.mo92485o(renderingFormat);
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m92486o1() {
        return this.f66422l.m92575l0();
    }

    /* JADX INFO: renamed from: o2 */
    public final void m92487o2(PropertyDescriptor propertyDescriptor, StringBuilder sb) {
        DescriptorRendererImpl descriptorRendererImpl;
        PropertyDescriptor propertyDescriptor2;
        StringBuilder sb2;
        if (m92468i1()) {
            descriptorRendererImpl = this;
            propertyDescriptor2 = propertyDescriptor;
            sb2 = sb;
        } else {
            if (!m92465h1()) {
                List<ReceiverParameterDescriptor> listMo89341x0 = propertyDescriptor.mo89341x0();
                listMo89341x0.getClass();
                m92421O1(listMo89341x0, sb);
                m92490p2(propertyDescriptor, sb);
                DescriptorVisibility visibility = propertyDescriptor.getVisibility();
                visibility.getClass();
                m92414L2(visibility, sb);
                boolean z = false;
                m92460f2(sb, m92418N0().contains(DescriptorRendererModifier.CONST) && propertyDescriptor.isConst(), "const");
                m92448b2(propertyDescriptor, sb);
                m92457e2(propertyDescriptor, sb);
                m92472j2(propertyDescriptor, sb);
                if (m92418N0().contains(DescriptorRendererModifier.LATEINIT) && propertyDescriptor.mo89512y0()) {
                    z = true;
                }
                m92460f2(sb, z, "lateinit");
                m92445a2(propertyDescriptor, sb);
            }
            descriptorRendererImpl = this;
            propertyDescriptor2 = propertyDescriptor;
            sb2 = sb;
            m92355H2(descriptorRendererImpl, propertyDescriptor2, sb2, false, 4, null);
            List<TypeParameterDescriptor> typeParameters = propertyDescriptor2.getTypeParameters();
            typeParameters.getClass();
            descriptorRendererImpl.m92397F2(typeParameters, sb2, true);
            descriptorRendererImpl.m92493q2(propertyDescriptor2, sb2);
        }
        descriptorRendererImpl.m92463g2(propertyDescriptor2, sb2, true);
        sb2.append(": ");
        KotlinType type = propertyDescriptor2.getType();
        type.getClass();
        sb2.append(descriptorRendererImpl.mo92343U(type));
        descriptorRendererImpl.m92497r2(propertyDescriptor2, sb2);
        descriptorRendererImpl.m92440Y1(propertyDescriptor2, sb2);
        List<TypeParameterDescriptor> typeParameters2 = propertyDescriptor2.getTypeParameters();
        typeParameters2.getClass();
        descriptorRendererImpl.m92417M2(typeParameters2, sb2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: p */
    public void mo92488p(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        annotationArgumentsRenderingPolicy.getClass();
        this.f66422l.mo92488p(annotationArgumentsRenderingPolicy);
    }

    /* JADX INFO: renamed from: p1 */
    public boolean m92489p1() {
        return this.f66422l.m92576m0();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m92490p2(PropertyDescriptor propertyDescriptor, StringBuilder sb) {
        if (m92418N0().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            m92354F1(this, sb, propertyDescriptor, null, 2, null);
            FieldDescriptor fieldDescriptorMo89474K = propertyDescriptor.mo89474K();
            if (fieldDescriptorMo89474K != null) {
                m92394E1(sb, fieldDescriptorMo89474K, AnnotationUseSiteTarget.FIELD);
            }
            FieldDescriptor fieldDescriptorMo89476z = propertyDescriptor.mo89476z();
            if (fieldDescriptorMo89476z != null) {
                m92394E1(sb, fieldDescriptorMo89476z, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
            }
            if (m92431U0() == PropertyAccessorRenderingPolicy.NONE) {
                PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
                if (getter != null) {
                    m92394E1(sb, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                }
                PropertySetterDescriptor setter = propertyDescriptor.getSetter();
                if (setter != null) {
                    m92394E1(sb, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                    List<ValueParameterDescriptor> listMo89339g = setter.mo89339g();
                    listMo89339g.getClass();
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.single((List) listMo89339g);
                    valueParameterDescriptor.getClass();
                    m92394E1(sb, valueParameterDescriptor, AnnotationUseSiteTarget.SETTER_PARAMETER);
                }
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: q */
    public void mo92491q(@NotNull ClassifierNamePolicy classifierNamePolicy) {
        classifierNamePolicy.getClass();
        this.f66422l.mo92491q(classifierNamePolicy);
    }

    /* JADX INFO: renamed from: q1 */
    public boolean m92492q1() {
        return this.f66422l.m92577n0();
    }

    /* JADX INFO: renamed from: q2 */
    public final void m92493q2(CallableDescriptor callableDescriptor, StringBuilder sb) {
        ReceiverParameterDescriptor receiverParameterDescriptorMo89337b0 = callableDescriptor.mo89337b0();
        if (receiverParameterDescriptorMo89337b0 != null) {
            m92394E1(sb, receiverParameterDescriptorMo89337b0, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = receiverParameterDescriptorMo89337b0.getType();
            type.getClass();
            sb.append(m92432U1(type));
            sb.append(".");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: r */
    public void mo92494r(boolean z) {
        this.f66422l.mo92494r(z);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m92495r0(StringBuilder sb, DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor declarationDescriptorMo89190b;
        String name;
        if ((declarationDescriptor instanceof PackageFragmentDescriptor) || (declarationDescriptor instanceof PackageViewDescriptor) || (declarationDescriptorMo89190b = declarationDescriptor.mo89190b()) == null || (declarationDescriptorMo89190b instanceof ModuleDescriptor)) {
            return;
        }
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(m92451c2("defined in"));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        FqNameUnsafe fqNameUnsafeM92663m = DescriptorUtils.m92663m(declarationDescriptorMo89190b);
        fqNameUnsafeM92663m.getClass();
        sb.append(fqNameUnsafeM92663m.m91952e() ? "root package" : mo92341S(fqNameUnsafeM92663m));
        if (m92492q1() && (declarationDescriptorMo89190b instanceof PackageFragmentDescriptor) && (declarationDescriptor instanceof DeclarationDescriptorWithSource) && (name = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource().mo89484b().getName()) != null) {
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(m92451c2("in file"));
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(name);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public boolean m92496r1() {
        return this.f66422l.m92578o0();
    }

    /* JADX INFO: renamed from: r2 */
    public final void m92497r2(CallableDescriptor callableDescriptor, StringBuilder sb) {
        ReceiverParameterDescriptor receiverParameterDescriptorMo89337b0;
        if (m92433V0() && (receiverParameterDescriptorMo89337b0 = callableDescriptor.mo89337b0()) != null) {
            sb.append(" on ");
            KotlinType type = receiverParameterDescriptorMo89337b0.getType();
            type.getClass();
            sb.append(mo92343U(type));
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m92498s0(StringBuilder sb, List<? extends TypeProjection> list) {
        CollectionsKt.joinTo$default(list, sb, ", ", null, null, 0, null, new nwd(this), 60, null);
    }

    /* JADX INFO: renamed from: s1 */
    public boolean m92499s1() {
        return this.f66422l.m92579p0();
    }

    /* JADX INFO: renamed from: s2 */
    public final void m92500s2(StringBuilder sb, SimpleType simpleType) {
        if (Intrinsics.m88377d(simpleType, TypeUtils.f66961b) || TypeUtils.m93691k(simpleType)) {
            sb.append("???");
            return;
        }
        if (ErrorUtils.m93895o(simpleType)) {
            if (!m92477l1()) {
                sb.append("???");
                return;
            }
            TypeConstructor typeConstructorMo92781G0 = simpleType.mo92781G0();
            typeConstructorMo92781G0.getClass();
            sb.append(m92426Q1(((ErrorTypeConstructor) typeConstructorMo92781G0).m93890i(0)));
            return;
        }
        if (KotlinTypeKt.m93535a(simpleType)) {
            m92424P1(sb, simpleType);
        } else if (m92419N2(simpleType)) {
            m92438X1(sb, simpleType);
        } else {
            m92424P1(sb, simpleType);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public boolean m92501t1() {
        return this.f66422l.m92580q0();
    }

    /* JADX INFO: renamed from: t2 */
    public final void m92502t2(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final String m92503u0() {
        int i = WhenMappings.f66426a[m92471j1().ordinal()];
        if (i == 1) {
            return m92506v0("->");
        }
        if (i == 2) {
            return "&rarr;";
        }
        nbr.m162172a();
        return null;
    }

    /* JADX INFO: renamed from: u1 */
    public final String m92504u1() {
        return m92506v0(">");
    }

    /* JADX INFO: renamed from: u2 */
    public final void m92505u2(ClassDescriptor classDescriptor, StringBuilder sb) {
        if (m92499s1() || KotlinBuiltIns.m89084o0(classDescriptor.mo89349o())) {
            return;
        }
        Collection<KotlinType> collectionMo89569c = classDescriptor.mo89196l().mo89569c();
        collectionMo89569c.getClass();
        if (collectionMo89569c.isEmpty()) {
            return;
        }
        if (collectionMo89569c.size() == 1 && KotlinBuiltIns.m89070c0(collectionMo89569c.iterator().next())) {
            return;
        }
        m92502t2(sb);
        sb.append(": ");
        CollectionsKt.joinTo$default(collectionMo89569c, sb, ", ", null, null, 0, null, new pwd(this), 60, null);
    }

    /* JADX INFO: renamed from: v0 */
    public final String m92506v0(String str) {
        return m92471j1().escape(str);
    }

    /* JADX INFO: renamed from: v1 */
    public final boolean m92507v1(KotlinType kotlinType) {
        return FunctionTypesKt.m89053s(kotlinType) || !kotlinType.getAnnotations().isEmpty();
    }

    /* JADX INFO: renamed from: w1 */
    public final Modality m92508w1(MemberDescriptor memberDescriptor) {
        if (memberDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) memberDescriptor).getKind() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        DeclarationDescriptor declarationDescriptorMo89190b = memberDescriptor.mo89190b();
        ClassDescriptor classDescriptor = declarationDescriptorMo89190b instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorMo89190b : null;
        if (classDescriptor == null) {
            return Modality.FINAL;
        }
        if (!(memberDescriptor instanceof CallableMemberDescriptor)) {
            return Modality.FINAL;
        }
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) memberDescriptor;
        Collection<? extends CallableMemberDescriptor> collectionMo89338e = callableMemberDescriptor.mo89338e();
        collectionMo89338e.getClass();
        if (!collectionMo89338e.isEmpty() && classDescriptor.mo89194i() != Modality.FINAL) {
            return Modality.OPEN;
        }
        if (classDescriptor.getKind() != ClassKind.INTERFACE || Intrinsics.m88377d(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.f64696a)) {
            return Modality.FINAL;
        }
        Modality modalityMo89194i = callableMemberDescriptor.mo89194i();
        Modality modality = Modality.ABSTRACT;
        return modalityMo89194i == modality ? modality : Modality.OPEN;
    }

    /* JADX INFO: renamed from: w2 */
    public final void m92509w2(FunctionDescriptor functionDescriptor, StringBuilder sb) {
        m92460f2(sb, functionDescriptor.isSuspend(), "suspend");
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m92510x1(AnnotationDescriptor annotationDescriptor) {
        return Intrinsics.m88377d(annotationDescriptor.mo89522d(), StandardNames.FqNames.f64515D);
    }

    /* JADX INFO: renamed from: x2 */
    public final void m92511x2(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb) {
        m92354F1(this, sb, typeAliasDescriptor, null, 2, null);
        DescriptorVisibility visibility = typeAliasDescriptor.getVisibility();
        visibility.getClass();
        m92414L2(visibility, sb);
        m92448b2(typeAliasDescriptor, sb);
        sb.append(m92442Z1("typealias"));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        m92463g2(typeAliasDescriptor, sb, true);
        List<TypeParameterDescriptor> listMo89200p = typeAliasDescriptor.mo89200p();
        listMo89200p.getClass();
        m92397F2(listMo89200p, sb, false);
        m92399G1(typeAliasDescriptor, sb);
        sb.append(" = ");
        sb.append(mo92343U(typeAliasDescriptor.mo89489v0()));
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m92512y0() {
        return this.f66422l.m92585w();
    }

    /* JADX INFO: renamed from: y1 */
    public final String m92513y1() {
        return m92506v0("<");
    }

    @NotNull
    /* JADX INFO: renamed from: y2 */
    public String m92514y2(@NotNull List<? extends TypeProjection> list) {
        list.getClass();
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m92513y1());
        m92498s0(sb, list);
        sb.append(m92504u1());
        return sb.toString();
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m92515z0() {
        return this.f66422l.m92586x();
    }

    /* JADX INFO: renamed from: z1 */
    public final boolean m92516z1(CallableMemberDescriptor callableMemberDescriptor) {
        return !callableMemberDescriptor.mo89338e().isEmpty();
    }

    @NotNull
    /* JADX INFO: renamed from: z2 */
    public String m92517z2(@NotNull TypeConstructor typeConstructor) {
        typeConstructor.getClass();
        ClassifierDescriptor classifierDescriptorMo89207e = typeConstructor.mo89207e();
        if ((classifierDescriptorMo89207e instanceof TypeParameterDescriptor) || (classifierDescriptorMo89207e instanceof ClassDescriptor) || (classifierDescriptorMo89207e instanceof TypeAliasDescriptor)) {
            return m92407J1(classifierDescriptorMo89207e);
        }
        if (classifierDescriptorMo89207e == null) {
            return typeConstructor instanceof IntersectionTypeConstructor ? ((IntersectionTypeConstructor) typeConstructor).m93512o(mwd.INSTANCE) : typeConstructor.toString();
        }
        emc0.m121356a("Unexpected classifier: ", classifierDescriptorMo89207e.getClass());
        return null;
    }
}
