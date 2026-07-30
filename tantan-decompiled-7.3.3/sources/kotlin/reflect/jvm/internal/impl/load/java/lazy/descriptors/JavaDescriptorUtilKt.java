package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaDescriptorUtilKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m90530a(@NotNull PropertyDescriptor propertyDescriptor) {
        propertyDescriptor.getClass();
        return propertyDescriptor.getGetter() == null;
    }
}
