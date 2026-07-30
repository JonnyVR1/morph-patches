package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaForKotlinOverridePropertyDescriptor extends JavaPropertyDescriptor {

    /* JADX INFO: renamed from: F */
    @NotNull
    public final SimpleFunctionDescriptor f65470F;

    /* JADX INFO: renamed from: G */
    @Nullable
    public final SimpleFunctionDescriptor f65471G;

    /* JADX INFO: renamed from: H */
    @NotNull
    public final PropertyDescriptor f65472H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaForKotlinOverridePropertyDescriptor(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor, @Nullable SimpleFunctionDescriptor simpleFunctionDescriptor2, @NotNull PropertyDescriptor propertyDescriptor) {
        super(classDescriptor, Annotations.Companion.m89532b(), simpleFunctionDescriptor.mo89194i(), simpleFunctionDescriptor.getVisibility(), simpleFunctionDescriptor2 != null, propertyDescriptor.getName(), simpleFunctionDescriptor.getSource(), null, CallableMemberDescriptor.Kind.DECLARATION, false, null);
        classDescriptor.getClass();
        simpleFunctionDescriptor.getClass();
        propertyDescriptor.getClass();
        this.f65470F = simpleFunctionDescriptor;
        this.f65471G = simpleFunctionDescriptor2;
        this.f65472H = propertyDescriptor;
    }
}
