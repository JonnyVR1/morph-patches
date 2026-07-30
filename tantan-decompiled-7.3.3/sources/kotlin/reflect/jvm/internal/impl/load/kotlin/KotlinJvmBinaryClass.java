package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface KotlinJvmBinaryClass {

    public interface AnnotationArgumentVisitor {
        /* JADX INFO: renamed from: a */
        void mo91070a(@Nullable Name name, @NotNull ClassId classId, @NotNull Name name2);

        @Nullable
        /* JADX INFO: renamed from: b */
        AnnotationArgumentVisitor mo91071b(@Nullable Name name, @NotNull ClassId classId);

        /* JADX INFO: renamed from: c */
        void mo91072c(@Nullable Name name, @NotNull ClassLiteralValue classLiteralValue);

        /* JADX INFO: renamed from: d */
        void mo91073d(@Nullable Name name, @Nullable Object obj);

        @Nullable
        /* JADX INFO: renamed from: e */
        AnnotationArrayArgumentVisitor mo91074e(@Nullable Name name);

        void visitEnd();
    }

    public interface AnnotationArrayArgumentVisitor {
        /* JADX INFO: renamed from: a */
        void mo91078a(@Nullable Object obj);

        @Nullable
        /* JADX INFO: renamed from: b */
        AnnotationArgumentVisitor mo91079b(@NotNull ClassId classId);

        /* JADX INFO: renamed from: c */
        void mo91080c(@NotNull ClassId classId, @NotNull Name name);

        /* JADX INFO: renamed from: d */
        void mo91081d(@NotNull ClassLiteralValue classLiteralValue);

        void visitEnd();
    }

    public interface AnnotationVisitor {
        @Nullable
        /* JADX INFO: renamed from: b */
        AnnotationArgumentVisitor mo89023b(@NotNull ClassId classId, @NotNull SourceElement sourceElement);

        void visitEnd();
    }

    public interface MemberVisitor {
        @Nullable
        /* JADX INFO: renamed from: a */
        MethodAnnotationVisitor mo91026a(@NotNull Name name, @NotNull String str);

        @Nullable
        /* JADX INFO: renamed from: b */
        AnnotationVisitor mo91027b(@NotNull Name name, @NotNull String str, @Nullable Object obj);
    }

    public interface MethodAnnotationVisitor extends AnnotationVisitor {
        @Nullable
        /* JADX INFO: renamed from: a */
        AnnotationArgumentVisitor mo91028a(int i, @NotNull ClassId classId, @NotNull SourceElement sourceElement);
    }

    /* JADX INFO: renamed from: a */
    void mo89836a(@NotNull MemberVisitor memberVisitor, @Nullable byte[] bArr);

    @NotNull
    /* JADX INFO: renamed from: b */
    KotlinClassHeader mo89837b();

    /* JADX INFO: renamed from: c */
    void mo89838c(@NotNull AnnotationVisitor annotationVisitor, @Nullable byte[] bArr);

    @NotNull
    /* JADX INFO: renamed from: e */
    ClassId mo89840e();

    @NotNull
    String getLocation();
}
