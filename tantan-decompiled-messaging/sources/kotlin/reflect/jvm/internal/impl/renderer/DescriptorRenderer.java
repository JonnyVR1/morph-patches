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
import p149l.kud;
import p149l.l9r;
import p149l.lud;
import p149l.mud;
import p149l.nud;
import p149l.oud;
import p149l.pud;
import p149l.qq3;
import p149l.qud;
import p149l.rud;
import p149l.sud;
import p149l.tud;
import p149l.uud;
import p149l.wtq;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DescriptorRenderer {

    @NotNull
    public static final Companion Companion;

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f65736a;

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f65737b;

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f65738c;

    /* JADX INFO: renamed from: d */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f65739d;

    /* JADX INFO: renamed from: e */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f65740e;

    /* JADX INFO: renamed from: f */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f65741f;

    /* JADX INFO: renamed from: g */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f65742g;

    /* JADX INFO: renamed from: h */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f65743h;

    /* JADX INFO: renamed from: i */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f65744i;

    /* JADX INFO: renamed from: j */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f65745j;

    /* JADX INFO: renamed from: k */
    @JvmField
    @NotNull
    public static final DescriptorRenderer f65746k;

    public static final class Companion {

        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f65747a;

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
                f65747a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m91455a(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
            classifierDescriptorWithTypeParameters.getClass();
            if (classifierDescriptorWithTypeParameters instanceof TypeAliasDescriptor) {
                return "typealias";
            }
            if (!(classifierDescriptorWithTypeParameters instanceof ClassDescriptor)) {
                wtq.m205579a("Unexpected classifier: ", classifierDescriptorWithTypeParameters);
                return null;
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorWithTypeParameters;
            if (classDescriptor.mo88302h0()) {
                return "companion object";
            }
            switch (WhenMappings.f65747a[classDescriptor.getKind().ordinal()]) {
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
                    l9r.m149037a();
                    return null;
            }
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final DescriptorRenderer m91456b(@NotNull Function1<? super DescriptorRendererOptions, Unit> function1) {
            function1.getClass();
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            function1.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.m91691s0();
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
            public void mo91457a(int i, @NotNull StringBuilder sb) {
                sb.getClass();
                sb.append("(");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            /* JADX INFO: renamed from: b */
            public void mo91458b(int i, @NotNull StringBuilder sb) {
                sb.getClass();
                sb.append(")");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            /* JADX INFO: renamed from: c */
            public void mo91459c(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i, int i2, @NotNull StringBuilder sb) {
                valueParameterDescriptor.getClass();
                sb.getClass();
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            /* JADX INFO: renamed from: d */
            public void mo91460d(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i, int i2, @NotNull StringBuilder sb) {
                valueParameterDescriptor.getClass();
                sb.getClass();
                if (i != i2 - 1) {
                    sb.append(", ");
                }
            }
        }

        /* JADX INFO: renamed from: a */
        void mo91457a(int i, @NotNull StringBuilder sb);

        /* JADX INFO: renamed from: b */
        void mo91458b(int i, @NotNull StringBuilder sb);

        /* JADX INFO: renamed from: c */
        void mo91459c(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i, int i2, @NotNull StringBuilder sb);

        /* JADX INFO: renamed from: d */
        void mo91460d(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i, int i2, @NotNull StringBuilder sb);
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        f65736a = companion.m91456b(kud.INSTANCE);
        f65737b = companion.m91456b(mud.INSTANCE);
        f65738c = companion.m91456b(nud.INSTANCE);
        f65739d = companion.m91456b(oud.INSTANCE);
        f65740e = companion.m91456b(pud.INSTANCE);
        f65741f = companion.m91456b(qud.INSTANCE);
        f65742g = companion.m91456b(rud.INSTANCE);
        f65743h = companion.m91456b(sud.INSTANCE);
        f65744i = companion.m91456b(tud.INSTANCE);
        f65745j = companion.m91456b(uud.INSTANCE);
        f65746k = companion.m91456b(lud.INSTANCE);
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m91424A(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo91585l(false);
        descriptorRendererOptions.mo91570g(SetsKt.emptySet());
        descriptorRendererOptions.mo91600q(ClassifierNamePolicy.SHORT.INSTANCE);
        descriptorRendererOptions.mo91579j(true);
        descriptorRendererOptions.mo91552a(ParameterNameRenderingPolicy.NONE);
        descriptorRendererOptions.mo91591n(true);
        descriptorRendererOptions.mo91603r(true);
        descriptorRendererOptions.mo91588m(true);
        descriptorRendererOptions.mo91582k(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m91425B(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo91600q(ClassifierNamePolicy.SHORT.INSTANCE);
        descriptorRendererOptions.mo91552a(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m91426C(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo91570g(SetsKt.emptySet());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ String m91438Q(DescriptorRenderer descriptorRenderer, AnnotationDescriptor annotationDescriptor, AnnotationUseSiteTarget annotationUseSiteTarget, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: renderAnnotation");
            return null;
        }
        if ((i & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        return descriptorRenderer.mo91448P(annotationDescriptor, annotationUseSiteTarget);
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m91439s(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo91585l(false);
        descriptorRendererOptions.mo91570g(SetsKt.emptySet());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m91440t(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo91585l(false);
        descriptorRendererOptions.mo91570g(SetsKt.emptySet());
        descriptorRendererOptions.mo91588m(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m91441u(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo91585l(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m91442v(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo91570g(SetsKt.emptySet());
        descriptorRendererOptions.mo91600q(ClassifierNamePolicy.SHORT.INSTANCE);
        descriptorRendererOptions.mo91552a(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m91443w(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo91576i(true);
        descriptorRendererOptions.mo91600q(ClassifierNamePolicy.FULLY_QUALIFIED.INSTANCE);
        descriptorRendererOptions.mo91570g(DescriptorRendererModifier.ALL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m91444x(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo91570g(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m91445y(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo91570g(DescriptorRendererModifier.ALL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m91446z(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.mo91594o(RenderingFormat.HTML);
        descriptorRendererOptions.mo91570g(DescriptorRendererModifier.ALL);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public abstract String mo91447O(@NotNull DeclarationDescriptor declarationDescriptor);

    @NotNull
    /* JADX INFO: renamed from: P */
    public abstract String mo91448P(@NotNull AnnotationDescriptor annotationDescriptor, @Nullable AnnotationUseSiteTarget annotationUseSiteTarget);

    @NotNull
    /* JADX INFO: renamed from: R */
    public abstract String mo91449R(@NotNull String str, @NotNull String str2, @NotNull KotlinBuiltIns kotlinBuiltIns);

    @NotNull
    /* JADX INFO: renamed from: S */
    public abstract String mo91450S(@NotNull FqNameUnsafe fqNameUnsafe);

    @NotNull
    /* JADX INFO: renamed from: T */
    public abstract String mo91451T(@NotNull Name name, boolean z);

    @NotNull
    /* JADX INFO: renamed from: U */
    public abstract String mo91452U(@NotNull KotlinType kotlinType);

    @NotNull
    /* JADX INFO: renamed from: V */
    public abstract String mo91453V(@NotNull TypeProjection typeProjection);

    @NotNull
    /* JADX INFO: renamed from: W */
    public final DescriptorRenderer m91454W(@NotNull Function1<? super DescriptorRendererOptions, Unit> function1) {
        function1.getClass();
        DescriptorRendererOptionsImpl descriptorRendererOptionsImplM91693u = ((DescriptorRendererImpl) this).m91532P0().m91693u();
        function1.invoke(descriptorRendererOptionsImplM91693u);
        descriptorRendererOptionsImplM91693u.m91691s0();
        return new DescriptorRendererImpl(descriptorRendererOptionsImplM91693u);
    }
}
