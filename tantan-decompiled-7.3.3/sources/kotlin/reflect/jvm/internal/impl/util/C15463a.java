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
public final class C15463a implements Check {

    @NotNull
    public static final C15463a INSTANCE = new C15463a();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f67109a = "second parameter must be of type KProperty<*> or its supertype";

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    /* JADX INFO: renamed from: a */
    public /* bridge */ String mo94024a(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.m94026a(this, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    /* JADX INFO: renamed from: b */
    public boolean mo94025b(@NotNull FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        ValueParameterDescriptor valueParameterDescriptor = functionDescriptor.mo89339g().get(1);
        ReflectionTypes.Companion companion = ReflectionTypes.Companion;
        valueParameterDescriptor.getClass();
        KotlinType kotlinTypeM89152a = companion.m89152a(DescriptorUtilsKt.m92877s(valueParameterDescriptor));
        if (kotlinTypeM89152a == null) {
            return false;
        }
        KotlinType type = valueParameterDescriptor.getType();
        type.getClass();
        return TypeUtilsKt.m93994w(kotlinTypeM89152a, TypeUtilsKt.m93966A(type));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return f67109a;
    }
}
