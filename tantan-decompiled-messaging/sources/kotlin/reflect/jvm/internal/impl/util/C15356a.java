package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C15356a implements Check {

    @NotNull
    public static final C15356a INSTANCE = new C15356a();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f66435a = "second parameter must be of type KProperty<*> or its supertype";

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    /* JADX INFO: renamed from: a */
    public /* bridge */ String mo93133a(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.m93135a(this, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    /* JADX INFO: renamed from: b */
    public boolean mo93134b(@NotNull FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        ValueParameterDescriptor valueParameterDescriptor = functionDescriptor.mo88448g().get(1);
        ReflectionTypes.Companion companion = ReflectionTypes.Companion;
        valueParameterDescriptor.getClass();
        KotlinType kotlinTypeM88261a = companion.m88261a(DescriptorUtilsKt.m91986s(valueParameterDescriptor));
        if (kotlinTypeM88261a == null) {
            return false;
        }
        KotlinType type = valueParameterDescriptor.getType();
        type.getClass();
        return TypeUtilsKt.m93103w(kotlinTypeM88261a, TypeUtilsKt.m93075A(type));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return f66435a;
    }
}
