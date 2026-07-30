package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.b */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class C15464b implements Check {

    @NotNull
    public static final C15464b INSTANCE = new C15464b();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f67110a = "should not have varargs or parameters with default values";

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
        List<ValueParameterDescriptor> listMo89339g = functionDescriptor.mo89339g();
        listMo89339g.getClass();
        List<ValueParameterDescriptor> list = listMo89339g;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (ValueParameterDescriptor valueParameterDescriptor : list) {
            valueParameterDescriptor.getClass();
            if (DescriptorUtilsKt.m92864f(valueParameterDescriptor) || valueParameterDescriptor.mo89509w0() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return f67110a;
    }
}
