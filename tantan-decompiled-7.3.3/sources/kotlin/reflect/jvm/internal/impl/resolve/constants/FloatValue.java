package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FloatValue extends ConstantValue<Float> {
    public FloatValue(float f) {
        super(Float.valueOf(f));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SimpleType mo92799a(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        SimpleType simpleTypeM89097C = moduleDescriptor.mo89437f().m89097C();
        simpleTypeM89097C.getClass();
        return simpleTypeM89097C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        return mo92809b().floatValue() + ".toFloat()";
    }
}
