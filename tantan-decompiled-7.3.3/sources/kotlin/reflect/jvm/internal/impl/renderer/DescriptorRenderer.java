package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.seamless.xhtml.XHTML;
import p153l.awd;
import p153l.bwd;
import p153l.cwd;
import p153l.dwd;
import p153l.ewd;
import p153l.fwd;
import p153l.gwd;
import p153l.hwd;
import p153l.iwd;
import p153l.nbr;
import p153l.pr3;
import p153l.xvq;
import p153l.yvd;
import p153l.zvd;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DescriptorRenderer {

    @NotNull
    public static final Companion Companion;

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f66410a;

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f66411b;

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f66412c;

    /* JADX INFO: renamed from: d */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f66413d;

    /* JADX INFO: renamed from: e */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f66414e;

    /* JADX INFO: renamed from: f */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f66415f;

    /* JADX INFO: renamed from: g */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f66416g;

    /* JADX INFO: renamed from: h */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f66417h;

    /* JADX INFO: renamed from: i */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f66418i;

    /* JADX INFO: renamed from: j */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f66419j;

    /* JADX INFO: renamed from: k */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f66420k;

    public static final class Companion {

        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f66421a;

            static {
                int[] iArr = new int[ClassKind.values().length];
                try {
                    iArr[ClassKind.CLASS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ClassKind.INTERFACE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ClassKind.ENUM_CLASS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ClassKind.OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ClassKind.ENUM_ENTRY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f66421a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m92346a(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
            classifierDescriptorWithTypeParameters.getClass();
            if (classifierDescriptorWithTypeParameters instanceof TypeAliasDescriptor) {
                return "typealias";
            }
            if (!(classifierDescriptorWithTypeParameters instanceof ClassDescriptor)) {
                xvq.m213257a("Unexpected classifier: ", classifierDescriptorWithTypeParameters);
                return null;
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorWithTypeParameters;
            if (classDescriptor.mo89193h0()) {
                return "companion object";
            }
            switch (WhenMappings.f66421a[classDescriptor.getKind().ordinal()]) {
                case 1:
                    return XHTML.ATTR.CLASS;
                case 2:
                    return "interface";
                case 3:
                    return "enum class";
                case 4:
                    return "object";
                case 5:
                    return "annotation class";
                case 6:
                    return "enum entry";
                default:
                    nbr.m162172a();
                    return null;
            }
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final DescriptorRenderer m92347b(@NotNull Function1<? super DescriptorRendererOptions, Unit> function1) {
            function1.getClass();
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            function1.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.m92582s0();
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }

        private Companion() {
        }
    }

    public interface ValueParametersHandler {

        public static final class DEFAULT implements ValueParametersHandler {

            @NotNull
            public static final DEFAULT INSTANCE = new DEFAULT();

            private DEFAULT() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            /* JADX INFO: renamed from: a */
            public void mo92348a(int i, @NotNull StringBuilder sb) {
                sb.getClass();
                sb.append("(");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            /* JADX INFO: renamed from: b */
            public void mo92349b(int i, @NotNull StringBuilder sb) {
                sb.getClass();
                sb.append(")");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            /* JADX INFO: renamed from: c */
            public void mo92350c(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i, int i2, @NotNull StringBuilder sb) {
                valueParameterDescriptor.getClass();
                sb.getClass();
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            /* JADX INFO: renamed from: d */
            public void mo92351d(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i, int i2, @NotNull StringBuilder sb) {
                valueParameterDescriptor.getClass();
                sb.getClass();
                if (i != i2 - 1) {
                    sb.append(", ");
                }
            }
        }

        /* JADX INFO: renamed from: a */
        void mo92348a(int i, @NotNull StringBuilder sb);

        /* JADX INFO: renamed from: b */
        void mo92349b(int i, @NotNull StringBuilder sb);

        /* JADX INFO: renamed from: c */
        void mo92350c(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i, int i2, @NotNull StringBuilder sb);

        /* JADX INFO: renamed from: d */
        void mo92351d(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i, int i2, @NotNull StringBuilder sb);
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        f66410a = companion.m92347b(yvd.INSTANCE);
        f66411b = companion.m92347b(awd.INSTANCE);
        f66412c = companion.m92347b(bwd.INSTANCE);
        f66413d = companion.m92347b(cwd.INSTANCE);
        f66414e = companion.m92347b(dwd.INSTANCE);
        f66415f = companion.m92347b(ewd.INSTANCE);
        f66416g = companion.m92347b(fwd.INSTANCE);
        f66417h = companion.m92347b(gwd.INSTANCE);
        f66418i = companion.m92347b(hwd.INSTANCE);
        f66419j = companion.m92347b(iwd.INSTANCE);
        f66420k = companion.m92347b(zvd.INSTANCE);
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m92315A(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo92476l(false);
        descriptorRendererOptions.mo92461g(SetsKt.emptySet());
        descriptorRendererOptions.mo92491q(ClassifierNamePolicy.SHORT.INSTANCE);
        descriptorRendererOptions.mo92470j(true);
        descriptorRendererOptions.mo92443a(ParameterNameRenderingPolicy.NONE);
        descriptorRendererOptions.mo92482n(true);
        descriptorRendererOptions.mo92494r(true);
        descriptorRendererOptions.mo92479m(true);
        descriptorRendererOptions.mo92473k(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m92316B(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo92491q(ClassifierNamePolicy.SHORT.INSTANCE);
        descriptorRendererOptions.mo92443a(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m92317C(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo92461g(SetsKt.emptySet());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ String m92329Q(DescriptorRenderer descriptorRenderer, AnnotationDescriptor annotationDescriptor, AnnotationUseSiteTarget annotationUseSiteTarget, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: renderAnnotation");
            return null;
        }
        if ((i & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        return descriptorRenderer.mo92339P(annotationDescriptor, annotationUseSiteTarget);
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m92330s(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo92476l(false);
        descriptorRendererOptions.mo92461g(SetsKt.emptySet());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m92331t(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo92476l(false);
        descriptorRendererOptions.mo92461g(SetsKt.emptySet());
        descriptorRendererOptions.mo92479m(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m92332u(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo92476l(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m92333v(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo92461g(SetsKt.emptySet());
        descriptorRendererOptions.mo92491q(ClassifierNamePolicy.SHORT.INSTANCE);
        descriptorRendererOptions.mo92443a(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m92334w(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo92467i(true);
        descriptorRendererOptions.mo92491q(ClassifierNamePolicy.FULLY_QUALIFIED.INSTANCE);
        descriptorRendererOptions.mo92461g(DescriptorRendererModifier.ALL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m92335x(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo92461g(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m92336y(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo92461g(DescriptorRendererModifier.ALL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m92337z(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo92485o(RenderingFormat.HTML);
        descriptorRendererOptions.mo92461g(DescriptorRendererModifier.ALL);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public abstract String mo92338O(@NotNull DeclarationDescriptor declarationDescriptor);

    @NotNull
    /* JADX INFO: renamed from: P */
    public abstract String mo92339P(@NotNull AnnotationDescriptor annotationDescriptor, @Nullable AnnotationUseSiteTarget annotationUseSiteTarget);

    @NotNull
    /* JADX INFO: renamed from: R */
    public abstract String mo92340R(@NotNull String str, @NotNull String str2, @NotNull KotlinBuiltIns kotlinBuiltIns);

    @NotNull
    /* JADX INFO: renamed from: S */
    public abstract String mo92341S(@NotNull FqNameUnsafe fqNameUnsafe);

    @NotNull
    /* JADX INFO: renamed from: T */
    public abstract String mo92342T(@NotNull Name name, boolean z);

    @NotNull
    /* JADX INFO: renamed from: U */
    public abstract String mo92343U(@NotNull KotlinType kotlinType);

    @NotNull
    /* JADX INFO: renamed from: V */
    public abstract String mo92344V(@NotNull TypeProjection typeProjection);

    @NotNull
    /* JADX INFO: renamed from: W */
    public final DescriptorRenderer m92345W(@NotNull Function1<? super DescriptorRendererOptions, Unit> function1) {
        function1.getClass();
        DescriptorRendererOptionsImpl descriptorRendererOptionsImplM92584u = ((DescriptorRendererImpl) this).m92423P0().m92584u();
        function1.invoke(descriptorRendererOptionsImplM92584u);
        descriptorRendererOptionsImplM92584u.m92582s0();
        return new DescriptorRendererImpl(descriptorRendererOptionsImplM92584u);
    }
}
