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
    public final KotlinType f64744a;

    /* JADX INFO: renamed from: b */
    public final Map<Name, ConstantValue<?>> f64745b;

    /* JADX INFO: renamed from: c */
    public final SourceElement f64746c;

    public AnnotationDescriptorImpl(@NotNull KotlinType kotlinType, @NotNull Map<Name, ConstantValue<?>> map, @NotNull SourceElement sourceElement) {
        if (kotlinType == null) {
            m89524b(0);
        }
        if (map == null) {
            m89524b(1);
        }
        if (sourceElement == null) {
            m89524b(2);
        }
        this.f64744a = kotlinType;
        this.f64745b = map;
        this.f64746c = sourceElement;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m89524b(int i) {
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
    public Map<Name, ConstantValue<?>> mo89521a() {
        Map<Name, ConstantValue<?>> map = this.f64745b;
        if (map == null) {
            m89524b(4);
        }
        return map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @Nullable
    /* JADX INFO: renamed from: d */
    public FqName mo89522d() {
        return AnnotationDescriptor.DefaultImpls.m89523a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement = this.f64746c;
        if (sourceElement == null) {
            m89524b(5);
        }
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public KotlinType getType() {
        KotlinType kotlinType = this.f64744a;
        if (kotlinType == null) {
            m89524b(3);
        }
        return kotlinType;
    }

    public String toString() {
        return DescriptorRenderer.f66416g.mo92339P(this, null);
    }
}
