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
    public static final Set<ClassId> f63765a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ClassId f63766b;

    static {
        List listListOf = CollectionsKt.listOf((Object[]) new FqName[]{JvmAnnotationNames.f64693a, JvmAnnotationNames.f64704l, JvmAnnotationNames.f64705m, JvmAnnotationNames.f64696d, JvmAnnotationNames.f64698f, JvmAnnotationNames.f64701i});
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ClassId.Companion companion = ClassId.Companion;
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(companion.m91045c((FqName) it.next()));
        }
        f63765a = linkedHashSet;
        ClassId.Companion companion2 = ClassId.Companion;
        FqName fqName = JvmAnnotationNames.f64702j;
        fqName.getClass();
        f63766b = companion2.m91045c(fqName);
    }

    private SpecialJvmAnnotations() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ClassId m88129a() {
        return f63766b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Set<ClassId> m88130b() {
        return f63765a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m88131c(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlinJvmBinaryClass.getClass();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        kotlinJvmBinaryClass.mo88947c(new KotlinJvmBinaryClass.AnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations$isAnnotatedWithContainerMetaAnnotation$1
            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            /* JADX INFO: renamed from: b */
            public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo88132b(ClassId classId, SourceElement sourceElement) {
                classId.getClass();
                sourceElement.getClass();
                if (!Intrinsics.m87488d(classId, JvmAbi.INSTANCE.m89436a())) {
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
