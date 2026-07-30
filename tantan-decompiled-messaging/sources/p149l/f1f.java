package p149l;

import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class f1f implements AnnotationDescriptor {

    @NotNull
    public static final f1f INSTANCE = new f1f();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public Map<Name, ConstantValue<?>> mo88630a() {
        m119113b();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: b */
    public final Void m119113b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @Nullable
    /* JADX INFO: renamed from: d */
    public /* bridge */ FqName mo88631d() {
        return AnnotationDescriptor.DefaultImpls.m88632a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SourceElement getSource() {
        m119113b();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public KotlinType getType() {
        m119113b();
        throw new KotlinNothingValueException();
    }

    @NotNull
    public String toString() {
        return "[EnhancedType]";
    }
}
