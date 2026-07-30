package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class StringValue extends ConstantValue<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringValue(@NotNull String str) {
        super(str);
        str.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SimpleType mo92799a(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        SimpleType simpleTypeM89116X = moduleDescriptor.mo89437f().m89116X();
        simpleTypeM89116X.getClass();
        return simpleTypeM89116X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        return "\"" + mo92809b() + '\"';
    }
}
