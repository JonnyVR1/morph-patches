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
public final class C15333x4262547b implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

    /* JADX INFO: renamed from: a */
    public final ArrayList<ConstantValue<?>> f65693a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl f65694b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Name f65695c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor f65696d;

    public C15333x4262547b(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, Name name, BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor abstractAnnotationArgumentVisitor) {
        this.f65694b = binaryClassAnnotationAndConstantLoaderImpl;
        this.f65695c = name;
        this.f65696d = abstractAnnotationArgumentVisitor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    /* JADX INFO: renamed from: a */
    public void mo91078a(Object obj) {
        this.f65693a.add(this.f65694b.m91064R(this.f65695c, obj));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    /* JADX INFO: renamed from: b */
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo91079b(ClassId classId) {
        classId.getClass();
        final ArrayList arrayList = new ArrayList();
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = this.f65694b;
        SourceElement sourceElement = SourceElement.f64737a;
        sourceElement.getClass();
        final KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorMo91056z = binaryClassAnnotationAndConstantLoaderImpl.mo91056z(classId, sourceElement, arrayList);
        annotationArgumentVisitorMo91056z.getClass();
        return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1$visitAnnotation$1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ KotlinJvmBinaryClass.AnnotationArgumentVisitor f65697a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C15333x4262547b f65699c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ ArrayList<AnnotationDescriptor> f65700d;

            {
                this.f65699c = this;
                this.f65700d = arrayList;
                this.f65697a = this.f65698b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            /* JADX INFO: renamed from: a */
            public void mo91070a(Name name, ClassId classId2, Name name2) {
                classId2.getClass();
                name2.getClass();
                this.f65697a.mo91070a(name, classId2, name2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            /* JADX INFO: renamed from: b */
            public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo91071b(Name name, ClassId classId2) {
                classId2.getClass();
                return this.f65697a.mo91071b(name, classId2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            /* JADX INFO: renamed from: c */
            public void mo91072c(Name name, ClassLiteralValue classLiteralValue) {
                classLiteralValue.getClass();
                this.f65697a.mo91072c(name, classLiteralValue);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            /* JADX INFO: renamed from: d */
            public void mo91073d(Name name, Object obj) {
                this.f65697a.mo91073d(name, obj);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            /* JADX INFO: renamed from: e */
            public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo91074e(Name name) {
                return this.f65697a.mo91074e(name);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitEnd() {
                this.f65698b.visitEnd();
                this.f65699c.f65693a.add(new AnnotationValue((AnnotationDescriptor) CollectionsKt.single((List) this.f65700d)));
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    /* JADX INFO: renamed from: c */
    public void mo91080c(ClassId classId, Name name) {
        classId.getClass();
        name.getClass();
        this.f65693a.add(new EnumValue(classId, name));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    /* JADX INFO: renamed from: d */
    public void mo91081d(ClassLiteralValue classLiteralValue) {
        classLiteralValue.getClass();
        this.f65693a.add(new KClassValue(classLiteralValue));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void visitEnd() {
        this.f65696d.mo91075f(this.f65695c, this.f65693a);
    }
}
