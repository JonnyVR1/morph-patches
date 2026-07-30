package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;

/* JADX INFO: loaded from: classes2.dex */
public class qef0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final ValueParameterDescriptor f154030a;

    public qef0(ValueParameterDescriptor valueParameterDescriptor) {
        this.f154030a = valueParameterDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return SignatureEnhancement.m90081n(this.f154030a, (CallableMemberDescriptor) obj);
    }
}
