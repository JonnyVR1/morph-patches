package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface DescriptorRendererOptions {

    public static final class DefaultImpls {
        /* JADX INFO: renamed from: a */
        public static boolean m92532a(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
            return descriptorRendererOptions.mo92455e().getIncludeAnnotationArguments();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m92533b(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
            return descriptorRendererOptions.mo92455e().getIncludeEmptyAnnotationArguments();
        }
    }

    /* JADX INFO: renamed from: a */
    void mo92443a(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy);

    /* JADX INFO: renamed from: b */
    boolean mo92446b();

    @NotNull
    /* JADX INFO: renamed from: c */
    Set<FqName> mo92449c();

    /* JADX INFO: renamed from: d */
    boolean mo92452d();

    @NotNull
    /* JADX INFO: renamed from: e */
    AnnotationArgumentsRenderingPolicy mo92455e();

    /* JADX INFO: renamed from: f */
    void mo92458f(@NotNull Set<FqName> set);

    /* JADX INFO: renamed from: g */
    void mo92461g(@NotNull Set<? extends DescriptorRendererModifier> set);

    /* JADX INFO: renamed from: h */
    void mo92464h(boolean z);

    /* JADX INFO: renamed from: i */
    void mo92467i(boolean z);

    /* JADX INFO: renamed from: j */
    void mo92470j(boolean z);

    /* JADX INFO: renamed from: k */
    void mo92473k(boolean z);

    /* JADX INFO: renamed from: l */
    void mo92476l(boolean z);

    /* JADX INFO: renamed from: m */
    void mo92479m(boolean z);

    /* JADX INFO: renamed from: n */
    void mo92482n(boolean z);

    /* JADX INFO: renamed from: o */
    void mo92485o(@NotNull RenderingFormat renderingFormat);

    /* JADX INFO: renamed from: p */
    void mo92488p(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy);

    /* JADX INFO: renamed from: q */
    void mo92491q(@NotNull ClassifierNamePolicy classifierNamePolicy);

    /* JADX INFO: renamed from: r */
    void mo92494r(boolean z);
}
