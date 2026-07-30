package kotlin.reflect.jvm.internal.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class SpecialJvmAnnotations {

    @NotNull
    public static final SpecialJvmAnnotations INSTANCE = new SpecialJvmAnnotations();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Set<ClassId> f64439a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ClassId f64440b;

    static {
        List listListOf = CollectionsKt.listOf((Object[]) new FqName[]{JvmAnnotationNames.f65367a, JvmAnnotationNames.f65378l, JvmAnnotationNames.f65379m, JvmAnnotationNames.f65370d, JvmAnnotationNames.f65372f, JvmAnnotationNames.f65375i});
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ClassId.Companion companion = ClassId.Companion;
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(companion.m91936c((FqName) it.next()));
        }
        f64439a = linkedHashSet;
        ClassId.Companion companion2 = ClassId.Companion;
        FqName fqName = JvmAnnotationNames.f65376j;
        fqName.getClass();
        f64440b = companion2.m91936c(fqName);
    }

    private SpecialJvmAnnotations() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ClassId m89020a() {
        return f64440b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Set<ClassId> m89021b() {
        return f64439a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m89022c(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlinJvmBinaryClass.getClass();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        kotlinJvmBinaryClass.mo89838c(new KotlinJvmBinaryClass.AnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations$isAnnotatedWithContainerMetaAnnotation$1
            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            /* JADX INFO: renamed from: b */
            public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo89023b(ClassId classId, SourceElement sourceElement) {
                classId.getClass();
                sourceElement.getClass();
                if (!Intrinsics.m88377d(classId, JvmAbi.INSTANCE.m90327a())) {
                    return null;
                }
                booleanRef.element = true;
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public void visitEnd() {
            }
        }, null);
        return booleanRef.element;
    }
}
