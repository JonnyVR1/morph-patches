package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeAliasExpansionReportStrategy {

    public static final class DO_NOTHING implements TypeAliasExpansionReportStrategy {

        @NotNull
        public static final DO_NOTHING INSTANCE = new DO_NOTHING();

        private DO_NOTHING() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        /* JADX INFO: renamed from: a */
        public void mo92694a(@NotNull TypeSubstitutor typeSubstitutor, @NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeParameterDescriptor typeParameterDescriptor) {
            typeSubstitutor.getClass();
            kotlinType.getClass();
            kotlinType2.getClass();
            typeParameterDescriptor.getClass();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        /* JADX INFO: renamed from: b */
        public void mo92695b(@NotNull TypeAliasDescriptor typeAliasDescriptor) {
            typeAliasDescriptor.getClass();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        /* JADX INFO: renamed from: c */
        public void mo92696c(@NotNull AnnotationDescriptor annotationDescriptor) {
            annotationDescriptor.getClass();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        /* JADX INFO: renamed from: d */
        public void mo92697d(@NotNull TypeAliasDescriptor typeAliasDescriptor, @Nullable TypeParameterDescriptor typeParameterDescriptor, @NotNull KotlinType kotlinType) {
            typeAliasDescriptor.getClass();
            kotlinType.getClass();
        }
    }

    /* JADX INFO: renamed from: a */
    void mo92694a(@NotNull TypeSubstitutor typeSubstitutor, @NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeParameterDescriptor typeParameterDescriptor);

    /* JADX INFO: renamed from: b */
    void mo92695b(@NotNull TypeAliasDescriptor typeAliasDescriptor);

    /* JADX INFO: renamed from: c */
    void mo92696c(@NotNull AnnotationDescriptor annotationDescriptor);

    /* JADX INFO: renamed from: d */
    void mo92697d(@NotNull TypeAliasDescriptor typeAliasDescriptor, @Nullable TypeParameterDescriptor typeParameterDescriptor, @NotNull KotlinType kotlinType);
}
