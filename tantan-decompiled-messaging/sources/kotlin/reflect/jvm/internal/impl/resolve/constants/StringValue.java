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
    public SimpleType mo91908a(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        SimpleType simpleTypeM88225X = moduleDescriptor.mo88546f().m88225X();
        simpleTypeM88225X.getClass();
        return simpleTypeM88225X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        return "\"" + mo91918b() + '\"';
    }
}
