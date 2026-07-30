package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.quc0;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectKotlinClass implements KotlinJvmBinaryClass {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Factory f64995c = new Factory(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Class<?> f64996a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final KotlinClassHeader f64997b;

    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final ReflectKotlinClass m89841a(@NotNull Class<?> cls) {
            cls.getClass();
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = new ReadKotlinClassHeaderAnnotationVisitor();
            quc0.INSTANCE.m178138b(cls, readKotlinClassHeaderAnnotationVisitor);
            KotlinClassHeader kotlinClassHeaderM91326m = readKotlinClassHeaderAnnotationVisitor.m91326m();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (kotlinClassHeaderM91326m == null) {
                return null;
            }
            return new ReflectKotlinClass(cls, kotlinClassHeaderM91326m, defaultConstructorMarker);
        }

        private Factory() {
        }
    }

    public ReflectKotlinClass(Class<?> cls, KotlinClassHeader kotlinClassHeader) {
        this.f64996a = cls;
        this.f64997b = kotlinClassHeader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    /* JADX INFO: renamed from: a */
    public void mo89836a(@NotNull KotlinJvmBinaryClass.MemberVisitor memberVisitor, @Nullable byte[] bArr) {
        memberVisitor.getClass();
        quc0.INSTANCE.m178145i(this.f64996a, memberVisitor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    @NotNull
    /* JADX INFO: renamed from: b */
    public KotlinClassHeader mo89837b() {
        return this.f64997b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    /* JADX INFO: renamed from: c */
    public void mo89838c(@NotNull KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, @Nullable byte[] bArr) {
        annotationVisitor.getClass();
        quc0.INSTANCE.m178138b(this.f64996a, annotationVisitor);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Class<?> m89839d() {
        return this.f64996a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    @NotNull
    /* JADX INFO: renamed from: e */
    public ClassId mo89840e() {
        return ReflectClassUtilKt.m89882e(this.f64996a);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectKotlinClass) && Intrinsics.m88377d(this.f64996a, ((ReflectKotlinClass) obj).f64996a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    @NotNull
    public String getLocation() {
        return C15493d.m94369E(this.f64996a.getName(), '.', '/', false, 4, null) + ".class";
    }

    public int hashCode() {
        return this.f64996a.hashCode();
    }

    @NotNull
    public String toString() {
        return ReflectKotlinClass.class.getName() + ": " + this.f64996a;
    }

    public /* synthetic */ ReflectKotlinClass(Class cls, KotlinClassHeader kotlinClassHeader, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, kotlinClassHeader);
    }
}
