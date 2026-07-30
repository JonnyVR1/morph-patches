package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ByteValue extends IntegerValueConstant<Byte> {
    public ByteValue(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SimpleType mo92799a(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        SimpleType simpleTypeM89135u = moduleDescriptor.mo89437f().m89135u();
        simpleTypeM89135u.getClass();
        return simpleTypeM89135u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        return mo92809b().intValue() + ".toByte()";
    }
}
