package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BooleanValue extends ConstantValue<Boolean> {
    public BooleanValue(boolean z) {
        super(Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SimpleType mo91908a(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        SimpleType simpleTypeM88238o = moduleDescriptor.mo88546f().m88238o();
        simpleTypeM88238o.getClass();
        return simpleTypeM88238o;
    }
}
