package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class AnnotationDescriptorImpl implements AnnotationDescriptor {

    /* JADX INFO: renamed from: a */
    public final KotlinType f64070a;

    /* JADX INFO: renamed from: b */
    public final Map<Name, ConstantValue<?>> f64071b;

    /* JADX INFO: renamed from: c */
    public final SourceElement f64072c;

    public AnnotationDescriptorImpl(@NotNull KotlinType kotlinType, @NotNull Map<Name, ConstantValue<?>> map, @NotNull SourceElement sourceElement) {
        if (kotlinType == null) {
            m88633b(0);
        }
        if (map == null) {
            m88633b(1);
        }
        if (sourceElement == null) {
            m88633b(2);
        }
        this.f64070a = kotlinType;
        this.f64071b = map;
        this.f64072c = sourceElement;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m88633b(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public Map<Name, ConstantValue<?>> mo88630a() {
        Map<Name, ConstantValue<?>> map = this.f64071b;
        if (map == null) {
            m88633b(4);
        }
        return map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @Nullable
    /* JADX INFO: renamed from: d */
    public FqName mo88631d() {
        return AnnotationDescriptor.DefaultImpls.m88632a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement = this.f64072c;
        if (sourceElement == null) {
            m88633b(5);
        }
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public KotlinType getType() {
        KotlinType kotlinType = this.f64070a;
        if (kotlinType == null) {
            m88633b(3);
        }
        return kotlinType;
    }

    public String toString() {
        return DescriptorRenderer.f65742g.mo91448P(this, null);
    }
}
