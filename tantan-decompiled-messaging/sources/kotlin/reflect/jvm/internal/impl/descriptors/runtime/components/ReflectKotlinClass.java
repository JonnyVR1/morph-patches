package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.lmc0;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectKotlinClass implements KotlinJvmBinaryClass {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Factory f64321c = new Factory(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Class<?> f64322a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final KotlinClassHeader f64323b;

    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final ReflectKotlinClass m88950a(@NotNull Class<?> cls) {
            cls.getClass();
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = new ReadKotlinClassHeaderAnnotationVisitor();
            lmc0.INSTANCE.m150562b(cls, readKotlinClassHeaderAnnotationVisitor);
            KotlinClassHeader kotlinClassHeaderM90435m = readKotlinClassHeaderAnnotationVisitor.m90435m();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (kotlinClassHeaderM90435m == null) {
                return null;
            }
            return new ReflectKotlinClass(cls, kotlinClassHeaderM90435m, defaultConstructorMarker);
        }

        private Factory() {
        }
    }

    public ReflectKotlinClass(Class<?> cls, KotlinClassHeader kotlinClassHeader) {
        this.f64322a = cls;
        this.f64323b = kotlinClassHeader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    /* JADX INFO: renamed from: a */
    public void mo88945a(@NotNull KotlinJvmBinaryClass.MemberVisitor memberVisitor, @Nullable byte[] bArr) {
        memberVisitor.getClass();
        lmc0.INSTANCE.m150569i(this.f64322a, memberVisitor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    @NotNull
    /* JADX INFO: renamed from: b */
    public KotlinClassHeader mo88946b() {
        return this.f64323b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    /* JADX INFO: renamed from: c */
    public void mo88947c(@NotNull KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, @Nullable byte[] bArr) {
        annotationVisitor.getClass();
        lmc0.INSTANCE.m150562b(this.f64322a, annotationVisitor);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Class<?> m88948d() {
        return this.f64322a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    @NotNull
    /* JADX INFO: renamed from: e */
    public ClassId mo88949e() {
        return ReflectClassUtilKt.m88991e(this.f64322a);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectKotlinClass) && Intrinsics.m87488d(this.f64322a, ((ReflectKotlinClass) obj).f64322a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    @NotNull
    public String getLocation() {
        return C15386d.m93478E(this.f64322a.getName(), '.', '/', false, 4, null) + ".class";
    }

    public int hashCode() {
        return this.f64322a.hashCode();
    }

    @NotNull
    public String toString() {
        return ReflectKotlinClass.class.getName() + ": " + this.f64322a;
    }

    public /* synthetic */ ReflectKotlinClass(Class cls, KotlinClassHeader kotlinClassHeader, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, kotlinClassHeader);
    }
}
