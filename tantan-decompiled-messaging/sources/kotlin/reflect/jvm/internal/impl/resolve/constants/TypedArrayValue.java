package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import p149l.afj0;

/* JADX INFO: loaded from: classes2.dex */
public final class TypedArrayValue extends ArrayValue {

    /* JADX INFO: renamed from: c */
    @NotNull
    public final KotlinType f65864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedArrayValue(@NotNull List<? extends ConstantValue<?>> list, @NotNull KotlinType kotlinType) {
        super(list, new afj0(kotlinType));
        list.getClass();
        kotlinType.getClass();
        this.f65864c = kotlinType;
    }

    /* JADX INFO: renamed from: c */
    public static final KotlinType m91959c(KotlinType kotlinType, ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        return kotlinType;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final KotlinType m91961e() {
        return this.f65864c;
    }
}
