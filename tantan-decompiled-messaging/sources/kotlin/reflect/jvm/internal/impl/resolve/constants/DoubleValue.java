package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DoubleValue extends ConstantValue<Double> {
    public DoubleValue(double d) {
        super(Double.valueOf(d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SimpleType mo91908a(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        SimpleType simpleTypeM88205A = moduleDescriptor.mo88546f().m88205A();
        simpleTypeM88205A.getClass();
        return simpleTypeM88205A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        return mo91918b().doubleValue() + ".toDouble()";
    }
}
