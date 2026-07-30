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
        void mo90179a(@Nullable Name name, @NotNull ClassId classId, @NotNull Name name2);

        @Nullable
        /* JADX INFO: renamed from: b */
        AnnotationArgumentVisitor mo90180b(@Nullable Name name, @NotNull ClassId classId);

        /* JADX INFO: renamed from: c */
        void mo90181c(@Nullable Name name, @NotNull ClassLiteralValue classLiteralValue);

        /* JADX INFO: renamed from: d */
        void mo90182d(@Nullable Name name, @Nullable Object obj);

        @Nullable
        /* JADX INFO: renamed from: e */
        AnnotationArrayArgumentVisitor mo90183e(@Nullable Name name);

        void visitEnd();
    }

    public interface AnnotationArrayArgumentVisitor {
        /* JADX INFO: renamed from: a */
        void mo90187a(@Nullable Object obj);

        @Nullable
        /* JADX INFO: renamed from: b */
        AnnotationArgumentVisitor mo90188b(@NotNull ClassId classId);

        /* JADX INFO: renamed from: c */
        void mo90189c(@NotNull ClassId classId, @NotNull Name name);

        /* JADX INFO: renamed from: d */
        void mo90190d(@NotNull ClassLiteralValue classLiteralValue);

        void visitEnd();
    }

    public interface AnnotationVisitor {
        @Nullable
        /* JADX INFO: renamed from: b */
        AnnotationArgumentVisitor mo88132b(@NotNull ClassId classId, @NotNull SourceElement sourceElement);

        void visitEnd();
    }

    public interface MemberVisitor {
        @Nullable
        /* JADX INFO: renamed from: a */
        MethodAnnotationVisitor mo90135a(@NotNull Name name, @NotNull String str);

        @Nullable
        /* JADX INFO: renamed from: b */
        AnnotationVisitor mo90136b(@NotNull Name name, @NotNull String str, @Nullable Object obj);
    }

    public interface MethodAnnotationVisitor extends AnnotationVisitor {
        @Nullable
        /* JADX INFO: renamed from: a */
        AnnotationArgumentVisitor mo90137a(int i, @NotNull ClassId classId, @NotNull SourceElement sourceElement);
    }

    /* JADX INFO: renamed from: a */
    void mo88945a(@NotNull MemberVisitor memberVisitor, @Nullable byte[] bArr);

    @NotNull
    /* JADX INFO: renamed from: b */
    KotlinClassHeader mo88946b();

    /* JADX INFO: renamed from: c */
    void mo88947c(@NotNull AnnotationVisitor annotationVisitor, @Nullable byte[] bArr);

    @NotNull
    /* JADX INFO: renamed from: e */
    ClassId mo88949e();

    @NotNull
    String getLocation();
}
