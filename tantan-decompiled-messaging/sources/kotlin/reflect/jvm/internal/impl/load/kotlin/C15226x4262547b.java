package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C15226x4262547b implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

    /* JADX INFO: renamed from: a */
    public final ArrayList<ConstantValue<?>> f65019a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl f65020b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Name f65021c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor f65022d;

    public C15226x4262547b(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, Name name, BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor abstractAnnotationArgumentVisitor) {
        this.f65020b = binaryClassAnnotationAndConstantLoaderImpl;
        this.f65021c = name;
        this.f65022d = abstractAnnotationArgumentVisitor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    /* JADX INFO: renamed from: a */
    public void mo90187a(Object obj) {
        this.f65019a.add(this.f65020b.m90173R(this.f65021c, obj));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    /* JADX INFO: renamed from: b */
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo90188b(ClassId classId) {
        classId.getClass();
        final ArrayList arrayList = new ArrayList();
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = this.f65020b;
        SourceElement sourceElement = SourceElement.f64063a;
        sourceElement.getClass();
        final KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorMo90165z = binaryClassAnnotationAndConstantLoaderImpl.mo90165z(classId, sourceElement, arrayList);
        annotationArgumentVisitorMo90165z.getClass();
        return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1$visitAnnotation$1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ KotlinJvmBinaryClass.AnnotationArgumentVisitor f65023a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C15226x4262547b f65025c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ ArrayList<AnnotationDescriptor> f65026d;

            {
                this.f65025c = this;
                this.f65026d = arrayList;
                this.f65023a = this.f65024b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            /* JADX INFO: renamed from: a */
            public void mo90179a(Name name, ClassId classId2, Name name2) {
                classId2.getClass();
                name2.getClass();
                this.f65023a.mo90179a(name, classId2, name2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            /* JADX INFO: renamed from: b */
            public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo90180b(Name name, ClassId classId2) {
                classId2.getClass();
                return this.f65023a.mo90180b(name, classId2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            /* JADX INFO: renamed from: c */
            public void mo90181c(Name name, ClassLiteralValue classLiteralValue) {
                classLiteralValue.getClass();
                this.f65023a.mo90181c(name, classLiteralValue);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            /* JADX INFO: renamed from: d */
            public void mo90182d(Name name, Object obj) {
                this.f65023a.mo90182d(name, obj);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            /* JADX INFO: renamed from: e */
            public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo90183e(Name name) {
                return this.f65023a.mo90183e(name);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitEnd() {
                this.f65024b.visitEnd();
                this.f65025c.f65019a.add(new AnnotationValue((AnnotationDescriptor) CollectionsKt.single((List) this.f65026d)));
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    /* JADX INFO: renamed from: c */
    public void mo90189c(ClassId classId, Name name) {
        classId.getClass();
        name.getClass();
        this.f65019a.add(new EnumValue(classId, name));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    /* JADX INFO: renamed from: d */
    public void mo90190d(ClassLiteralValue classLiteralValue) {
        classLiteralValue.getClass();
        this.f65019a.add(new KClassValue(classLiteralValue));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void visitEnd() {
        this.f65022d.mo90184f(this.f65021c, this.f65019a);
    }
}
