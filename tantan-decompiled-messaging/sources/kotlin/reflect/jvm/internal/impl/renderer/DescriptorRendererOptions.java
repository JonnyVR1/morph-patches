package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface DescriptorRendererOptions {

    public static final class DefaultImpls {
        /* JADX INFO: renamed from: a */
        public static boolean m91641a(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
            return descriptorRendererOptions.mo91564e().getIncludeAnnotationArguments();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m91642b(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
            return descriptorRendererOptions.mo91564e().getIncludeEmptyAnnotationArguments();
        }
    }

    /* JADX INFO: renamed from: a */
    void mo91552a(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy);

    /* JADX INFO: renamed from: b */
    boolean mo91555b();

    @NotNull
    /* JADX INFO: renamed from: c */
    Set<FqName> mo91558c();

    /* JADX INFO: renamed from: d */
    boolean mo91561d();

    @NotNull
    /* JADX INFO: renamed from: e */
    AnnotationArgumentsRenderingPolicy mo91564e();

    /* JADX INFO: renamed from: f */
    void mo91567f(@NotNull Set<FqName> set);

    /* JADX INFO: renamed from: g */
    void mo91570g(@NotNull Set<? extends DescriptorRendererModifier> set);

    /* JADX INFO: renamed from: h */
    void mo91573h(boolean z);

    /* JADX INFO: renamed from: i */
    void mo91576i(boolean z);

    /* JADX INFO: renamed from: j */
    void mo91579j(boolean z);

    /* JADX INFO: renamed from: k */
    void mo91582k(boolean z);

    /* JADX INFO: renamed from: l */
    void mo91585l(boolean z);

    /* JADX INFO: renamed from: m */
    void mo91588m(boolean z);

    /* JADX INFO: renamed from: n */
    void mo91591n(boolean z);

    /* JADX INFO: renamed from: o */
    void mo91594o(@NotNull RenderingFormat renderingFormat);

    /* JADX INFO: renamed from: p */
    void mo91597p(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy);

    /* JADX INFO: renamed from: q */
    void mo91600q(@NotNull ClassifierNamePolicy classifierNamePolicy);

    /* JADX INFO: renamed from: r */
    void mo91603r(boolean z);
}
