package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class ArrayValue extends ConstantValue<List<? extends ConstantValue<?>>> {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function1<ModuleDescriptor, KotlinType> f66520b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ArrayValue(@NotNull List<? extends ConstantValue<?>> list, @NotNull Function1<? super ModuleDescriptor, ? extends KotlinType> function1) {
        super(list);
        list.getClass();
        function1.getClass();
        this.f66520b = function1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    /* JADX INFO: renamed from: a */
    public KotlinType mo92799a(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        KotlinType kotlinTypeInvoke = this.f66520b.invoke(moduleDescriptor);
        if (!KotlinBuiltIns.m89072d0(kotlinTypeInvoke) && !KotlinBuiltIns.m89087r0(kotlinTypeInvoke)) {
            KotlinBuiltIns.m89062E0(kotlinTypeInvoke);
        }
        return kotlinTypeInvoke;
    }
}
