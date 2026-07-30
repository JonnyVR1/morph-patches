package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends FunctionReferenceImpl implements Function1<ValueParameterDescriptor, Boolean> {
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 INSTANCE = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$2();

    public DescriptorUtilsKt$declaresOrInheritsDefaultValue$2() {
        super(1, ValueParameterDescriptor.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ValueParameterDescriptor valueParameterDescriptor) {
        valueParameterDescriptor.getClass();
        return Boolean.valueOf(valueParameterDescriptor.mo88615M());
    }
}
