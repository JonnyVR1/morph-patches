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
public final class C15357b implements Check {

    @NotNull
    public static final C15357b INSTANCE = new C15357b();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f66436a = "should not have varargs or parameters with default values";

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    /* JADX INFO: renamed from: a */
    public /* bridge */ String mo93133a(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.m93135a(this, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    /* JADX INFO: renamed from: b */
    public boolean mo93134b(@NotNull FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        List<ValueParameterDescriptor> listMo88448g = functionDescriptor.mo88448g();
        listMo88448g.getClass();
        List<ValueParameterDescriptor> list = listMo88448g;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (ValueParameterDescriptor valueParameterDescriptor : list) {
            valueParameterDescriptor.getClass();
            if (DescriptorUtilsKt.m91973f(valueParameterDescriptor) || valueParameterDescriptor.mo88618w0() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return f66436a;
    }
}
