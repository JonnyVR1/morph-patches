package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FieldDescriptorImpl extends AnnotatedImpl implements FieldDescriptor {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final PropertyDescriptor f64825b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldDescriptorImpl(@NotNull Annotations annotations, @NotNull PropertyDescriptor propertyDescriptor) {
        super(annotations);
        annotations.getClass();
        propertyDescriptor.getClass();
        this.f64825b = propertyDescriptor;
    }
}
